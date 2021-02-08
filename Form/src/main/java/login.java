import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        name = "loginservlet",
        urlPatterns = "/login"
)

public class login extends HttpServlet{

    private ArrayList<account> accounts = new ArrayList<>();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
        add();
        try(PrintWriter out = resp.getWriter()){
            for(int i = 0; i < accounts.size(); i++) {
                String username = req.getParameter("username");
                String password = req.getParameter("password");

                if (username != null && password != null) {
                    if (username.equals(accounts.get(i).getUsername())) {
                        if (password.equals(accounts.get(i).getPassword())) {
                            resp.sendRedirect("welcome.jsp");
                        } else {
                            out.println("Wrong password");
                        }
                    } else {
                        out.println("Wrong user name");
                    }
                } else {
                    out.println("ERROR in User name or Password");
                }
            }

        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        doGet(req, resp);
    }

    public void add(){
        account account1 = new account("iitu", "1234");
        account account2 = new account("kbtu", "1234");
        accounts.add(account1);
        accounts.add(account2);
    }

    public void reg(account account1){
        accounts.add(account1);
    }

}
