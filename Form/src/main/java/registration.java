import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(
        name = "registrationservlet",
        urlPatterns = "/registration"
)

public class registration extends HttpServlet{
    private ArrayList<account> accounts = new ArrayList<>();
    login login = new login();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()){
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            account account1 = new account(username, password);
            login.reg(account1);
            out.println("Success!!!");
            resp.sendRedirect("login.jsp");

        }
    }
}
