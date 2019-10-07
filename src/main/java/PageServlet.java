import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * PageServlet
 * A Simple servlet that returns HTML content
*/
public class PageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user_name = request.getParameter("user_name");

        String user_message = request.getParameter("user_message");

        out.print("<p> message from <b>" + user_name + "</b></p>");
        out.print("<textarea>" + user_message + "</textarea>");
    }
} 