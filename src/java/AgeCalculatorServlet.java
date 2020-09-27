
import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 829942
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        Pattern pattern = Pattern.compile("[0-9]*");
        
        if (age.length() == 0){
            request.setAttribute("message", "You must give your current age.");
        }
        else if(!pattern.matcher(age).matches()){
            request.setAttribute("message", "You must enter a number.");
        }
        else{
            int iage = Integer.parseInt(age) + 1;
            request.setAttribute("message", "Your next birthday will be " + iage);
        }
        
        getServletContext().getRequestDispatcher("/agecalculator.jsp")
                .forward(request,response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
