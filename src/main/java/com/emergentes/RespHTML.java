package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/HTML");
        try (PrintWriter out = response.getWriter()) {               
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta HTML</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HTML GENERADO DESDE SERVLET</h1>");
            out.println("<h1>POR JHONNY ALVARO TICONA MENDOZA</h1>");
            out.println("<a href='index.html'>Volver al Inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {                    
    }
}
