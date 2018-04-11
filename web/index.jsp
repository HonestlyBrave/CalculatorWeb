<%--
    Document   : index
    Created on : 9-Apr-2018, 6:19:17 PM
    Author     : Muhammad Diallo Thomas - muhammaddiallo.thomas@gmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/myJs.js"></script>
    </head>
    <body>
        <form name="calcform" action="CalculatorController">
            <table border="2" cellspacing="5" cellpadding="5">
                <tbody>
                    <tr>
                        <td id="frag" colspan="4">
                            <jsp:include page="displayFrag"/>
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="1" name="calc" /></td>
                        <td><input type="submit" value="2" name="calc" /></td>
                        <td><input type="submit" value="3" name="calc" /></td>
                        <td><input type="submit" value="+" name="calc" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="4" name="calc" /></td>
                        <td><input type="submit" value="5" name="calc" /></td>
                        <td><input type="submit" value="6" name="calc" /></td>
                        <td><input type="submit" value="-" name="calc" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="7" name="calc" /></td>
                        <td><input type="submit" value="8" name="calc" /></td>
                        <td><input type="submit" value="9" name="calc" /></td>
                        <td><input type="submit" value="*" name="calc" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="0" name="calc"  /></td>
                        <td><input type="submit" value="." name="calc" /></td>
                        <td><input type="submit" value="=" name="calc" /></td>
                        <td><input type="submit" value="/" name="calc" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Clear" name="calc" /></td>
                        <td><input type="submit" value="Undo" name="calc" /></td>
                        <td><input type="submit" value="(" name="calc" /></td>
                        <td><input type="submit" value=")" name="calc" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="M+" name="calc" /></td>
                        <td><input type="submit" value="M-" name="calc" /></td>
                        <td><input type="submit" value="MR" name="calc" /></td>
                        <td><input type="submit" value="MC" name="calc" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
