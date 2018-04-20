package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Commands;
import models.Viewer;

/**
 *
 * @author Muhammad Diallo Thomas - muhammaddiallo.thomas@gmail.com
 */
public class CalculatorController extends HttpServlet {

    private HttpSession session;

    private final Viewer display;

    private final Commands commands;

    public CalculatorController() {
        this.commands = new Commands();
        this.display = new Viewer();
        display.connectView();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request Servlet request
     * @param response Servlet response
     * @throws ServletException if a Servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        session = request.getSession();

        String calcAction = request.getParameter("calc");
        int index = 21; // Default index will execute undo.

        if (calcAction.equalsIgnoreCase("clear")) {

            index = 11;

        } else if ("0123456789".contains(calcAction)) {

            index = Integer.parseInt(calcAction);

        } else if (calcAction.startsWith("X")) {

            if (calcAction.endsWith("²")) {
                index = 24;
            } else {
                index = 25;
            }

        } else if (calcAction.startsWith("M")) {

            if (calcAction.endsWith("+")) {
                index = 14;
            } else if (calcAction.endsWith("-")) {
                index = 15;
            } else if (calcAction.endsWith("R")) {
                index = 16;
            } else {
                index = 20;
            }

        } else if ("+-*/=.()".contains(calcAction)) {

            switch (calcAction) {
                case "+":
                    index = 10;
                    break;
                case ".":
                    index = 12;
                    break;
                case "/":
                    index = 13;
                    break;
                case "-":
                    index = 17;
                    break;
                case "*":
                    index = 18;
                    break;
                case "=":
                    index = 19;
                    break;
                case "(":
                    index = 22;
                    break;
                case ")":
                    index = 23;
                    break;
                default:
                    index = 21;
                    break;
            }

        }

        commands.execute(index);
        session.setAttribute("display", display.getDisplay());
        if (isAjaxRequest(request)) {
            dispatch("displayFrag", request, response);
        }
        dispatch("index", request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="Private methods. Click on + sign to show.">
    /**
     * Forward request to a specified target.
     *
     * @param destJsp
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void dispatch(String destJsp, HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        if (destJsp != null) {
            request.getRequestDispatcher(destJsp).forward(request, response);
        }
    }

    /**
     * Check header for Ajax borne request.
     *
     * @param request
     * @return
     */
    protected boolean isAjaxRequest(HttpServletRequest request) {
        return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Central control for everything calculating.";
    }// </editor-fold>
}
