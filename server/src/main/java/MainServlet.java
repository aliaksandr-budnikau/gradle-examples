import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/server/*")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Message message = new MessageService().getMessage();
        try {
            response.getWriter().println("Title :" + message.getTitle());
            response.getWriter().println("Content :" + message.getText());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}