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
        <title>Calculator</title>
        <script src="js/jquery-3.3.1.min.js"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <script src="js/bootstrap.min.js"></script>
        <script src="js/myJs.js"></script>
    </head>
    <body class="col-lg-12" dropzone="move" ondrop="moveForm()">
        <form class="form-control-static" draggable="true" name="calcform" action="CalculatorController">
            <table class="table-bordered">
                <tbody class="text-center">
                    <tr>
                        <td id="frag" colspan="4">
                            <jsp:include page="displayFrag"/>
                        </td>
                    </tr>
                    <tr>
                        <td><input class="btn-lg" type="submit" value="1" name="calc" accesskey="1" /></td>
                        <td><input class="btn-lg" type="submit" value="2" name="calc" accesskey="2" /></td>
                        <td><input class="btn-lg" type="submit" value="3" name="calc" accesskey="3" /></td>
                        <td><input class="btn-lg" type="submit" value="+" name="calc" accesskey="+" /></td>
                    </tr>
                    <tr>
                        <td><input class="btn-lg" type="submit" value="4" name="calc" accesskey="4" /></td>
                        <td><input class="btn-lg" type="submit" value="5" name="calc" accesskey="5" /></td>
                        <td><input class="btn-lg" type="submit" value="6" name="calc" accesskey="6" /></td>
                        <td><input class="btn-lg" type="submit" value="-" name="calc" accesskey="-" /></td>
                    </tr>
                    <tr>
                        <td><input class="btn-lg" type="submit" value="7" name="calc" accesskey="7" /></td>
                        <td><input class="btn-lg" type="submit" value="8" name="calc" accesskey="8" /></td>
                        <td><input class="btn-lg" type="submit" value="9" name="calc" accesskey="9" /></td>
                        <td><input class="btn-lg" type="submit" value="*" name="calc" accesskey="*" /></td>
                    </tr>
                    <tr>
                        <td><input class="btn-lg" type="submit" value="0" name="calc" accesskey="0" /></td>
                        <td><input class="btn-lg" type="submit" value="." name="calc" accesskey="." /></td>
                        <td><input class="btn-lg" type="submit" value="=" name="calc" accesskey="=" /></td>
                        <td><input class="btn-lg" type="submit" value="/" name="calc" accesskey="/" /></td>
                    </tr>
                    <tr>
                        <td><input class="btn-lg" type="submit" value="Clear" name="calc" accesskey="x" /></td>
                        <td><input class="btn-lg" type="submit" value="Undo" name="calc" accesskey="u" /></td>
                        <td><input class="btn-lg" type="submit" value="(" name="calc" accesskey="o" /></td>
                        <td><input class="btn-lg" type="submit" value=")" name="calc" accesskey="c" /></td>
                    </tr>
                    <tr>
                        <td><input class="btn-lg" type="submit" value="M+" name="calc" accesskey="a" /></td>
                        <td><input class="btn-lg" type="submit" value="M-" name="calc" accesskey="s" /></td>
                        <td><input class="btn-lg" type="submit" value="MR" name="calc" accesskey="r" /></td>
                        <td><input class="btn-lg" type="submit" value="MC" name="calc" accesskey="m" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
