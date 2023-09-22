package murach.email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import murach.business.User;


@WebServlet(urlPatterns={"/emailList"}) 
public class EmailListServlet extends HttpServlet
{    
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        String url = "/index.html";
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("date");
            // use regular Java classes
            User user = new User(firstName, lastName, email,date);
            //UserDB.insert(user);

            // store the User object in request and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }
        else if (action.equals("join")) {
            // set URL to index page
            url = "/index.html";            
        }
        
        // forward request and response objects
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}