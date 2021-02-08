<%--
  Created by IntelliJ IDEA.
  User: vivacloins
  Date: 08.02.2021
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration page</title>
</head>
    <body>
        <h1 style="text-align: center; color: red">Registration</h1>
        <form action="registration" method="POST" style="text-align: center; margin-left: 42.5%">
            <table>
                <tr>
                    <td style="color: chocolate; text-align: center">User name</td>
                    <td><input type="text" name="username" placeholder="User name" style="height: 20px; background: bisque; border: 1px black"></td>
                </tr>
                <tr>
                    <td style="color: chocolate; text-align: center">Password</td>
                    <td><input type="password" name="password" placeholder="Password" style="height: 20px; background: bisque; border: 1px black"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Registration!" style="background: coral; width: 60px; height: 30px; border: 1px black; top: 5%; margin-left: 2%"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
