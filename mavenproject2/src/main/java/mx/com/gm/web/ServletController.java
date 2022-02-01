package mx.com.gm.web;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gm.domain.Person;
import mx.com.gm.service.PeopleService;

//@WebServlet: annotation
@WebServlet("/ServletController")
//to create a servelet it has to extend from HttpServlet
public class ServletController extends HttpServlet {
    @Override
    //doGet will apply MVC pattern
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        PeopleService peopleService = new  PeopleService();
    
        List<Person> people = peopleService.listPeople();
        
        //with people variable we will retrieve from JSPs    
        request.setAttribute("people", people);
        
        try {
            //redirect to JSPs that we want to select
            request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
