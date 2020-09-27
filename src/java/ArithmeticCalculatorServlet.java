
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
public class ArithmeticCalculatorServlet extends HttpServlet {


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
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        Pattern pattern = Pattern.compile("[0-9]*");
        
        if (first.length() == 0 || second.length() == 0 || !pattern.matcher(first).matches() || !pattern.matcher(second).matches()){
            request.setAttribute("message", "Invilid.");
        }
        else {
            String stype = request.getParameter("submit");
            int ifirst = Integer.parseInt(first);
            int isecond = Integer.parseInt(second);
            int total = 0;
            if (stype.equals("+")){
                total = ifirst + isecond;
            }
            else if(stype.equals("-")){
                total = ifirst - isecond;
            }
            
            else if(stype.equals("*")){
                total =ifirst*isecond;
            }
            
            else if(stype.equals("%")){
                total =ifirst % isecond;
            }
            

            request.setAttribute("message", total);
        }
        
        getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                .forward(request,response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
