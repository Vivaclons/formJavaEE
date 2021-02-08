<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login page</title>
</head>
    <body>
        <h1 style="text-align: center; color: red">Login</h1>
        <form action="login" method="POST" style="text-align: center; margin-left: 42.5%">
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
                    <td><input type="submit" value="Login!" style="background: coral; width: 60px; height: 30px; border: 1px black; top: 5%; margin-left: 2%"></td>
                </tr>
            </table>
        </form>
    </body>
</html>