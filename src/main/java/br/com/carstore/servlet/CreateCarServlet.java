package br.com.carstore.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modelo = request.getParameter("Modelo");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String  json = "{\"Modelo\"}" + modelo;

        response.getWriter().write(json);

    }
}