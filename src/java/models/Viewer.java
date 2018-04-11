package models;

import model.Facade;
import view.View;

/**
 *
 * @author Muhammad Diallo Thomas - muhammaddiallo.thomas@gmail.com
 */
public class Viewer implements View {

    /**
     * Represents Web TextArea dedicated to the calculator's display screen.
     */
    private String display = "";

    /**
     * True once the Facade has been connected.
     */
    public boolean viewConnected = false;

    /**
     * A method that uses a the interface's default method to connect view to
     * Calculator's Facade once.
     */
    public void connectView() {
        if (!viewConnected) {
            this.setCalculatorViewer();
            viewConnected = true;
        }
    }

    @Override
    public void setVisible() {
    }

    @Override
    public void setFocus() {
    }

    @Override
    public String getDisplay() {
        return this.display;
    }

    @Override
    public void setDisplay(String text) {
        this.display = text;
    }

    @Override
    public void updateDisplay(String text) {
        this.display += text;
    }

    @Override
    public void undoDisplay() {
        String text = getDisplay();
        int textLen = text.length();

        // Set empty if empty or get all characters -1(last entry).
        String newText = text.isEmpty() ? "" : text.substring(0, textLen - 1);

        setDisplay(newText);
    }

    @Override
    public void setCalculatorViewer() {
        Facade.setView(this);
    }

}
