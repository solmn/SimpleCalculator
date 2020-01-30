package cs472.mum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/improved-calc")
public class ImprovedCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String num1Add =request.getParameter("num1Add");
        String num2Add = request.getParameter("num2Add");
        String num1Mul = request.getParameter("num1Mul");
        String num2Mul = request.getParameter("num2Mul");
        String addVal = "";
        String mulVal = "";
        if (!(num1Add.equals("")) && !(num2Add.equals(""))) {
            addVal = "" + (Integer.parseInt(num1Add) + Integer.parseInt(num2Add));
        }
        if (!(num1Mul.equals("") && num2Mul.equals(""))) {
            mulVal = "" + (Integer.parseInt(num1Mul) * Integer.parseInt(num2Add));
        }
        out.print("<html>" +
                "<head>" +
                "<title>Test</title>" +
                "<link href='css/style.css' rel='stylesheet'>"+
                "</head>" +
                "<body>" +
                "<div style='width: 50%; margin:auto; padding:50px'>");
        out.print("<h2>Improved Calculator</h2>\n" +
                 "      <form action='/simple-calculator/improved-calc' method=\"post\" >\n" +
                 "          <input  type=\"text\" name=\"num1Add\" value='"+ num1Add +"'/> + <input  type=\"text\" name=\"num2Add\" value='"+ num2Add +"'/> = <input  type=\"text\" name=\"addResult\" value='"+addVal+"'/><br />\n" +
                 "          <input  type=\"text\" name=\"num1Mul\" value='"+ num2Mul +"'/> * <input  type=\"text\" name=\"num2Mul\"  value='"+ num2Mul +"'/> = <input  type=\"text\" name=\"mulResult\" value='"+mulVal+"'/><br />\n" +
                 "          <input  type=\"submit\" value=\"Submit\">\n" +
                 "      </form>");
        out.print("</div></body>" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
