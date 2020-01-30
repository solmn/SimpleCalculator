package cs472.mum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/simple-calc")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String num1Add =request.getParameter("num1Add");
        String num2Add = request.getParameter("num2Add");
        String num1Mul = request.getParameter("num1Mul");
        String num2Mul = request.getParameter("num2Mul");

        out.print("<html>" +
                      "<head>" +
                           "<title>Test</title>" +
                           "<link href='css/style.css' rel='stylesheet'>"+
                      "</head>" +
                      "<body>" +
                            "<div style='width: 50%; margin:auto; padding:50px'>" +
                            "<h3>");
        if (!(num1Add.equals("")) && !(num2Add.equals(""))) {
            out.print(num1Add  + " + " + num2Add + " = " + (Integer.parseInt(num1Add) + Integer.parseInt(num2Add)));
        }
        out.print("</h3><h3>");
        if (!(num1Mul.equals("") && num2Mul.equals(""))) {
            out.print(num1Mul  + " * " + num2Mul + " = " + (Integer.parseInt(num1Mul) * Integer.parseInt(num2Mul)));
        }
        out.print("</h3></div>");
        out.print("</body>" +
                      "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
