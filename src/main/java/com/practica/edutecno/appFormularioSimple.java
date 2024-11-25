package com.practica.edutecno;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class appFormularioSimple
 */
@WebServlet("/appFormularioSimple")
public class appFormularioSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public appFormularioSimple() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

	//	String nombre=(String) request.getParameter("nomb");  
		PrintWriter escribiendole=response.getWriter();
		escribiendole.println("<html><body>");
	//	escribiendole.println("el serlet me envio: ");
//		escribiendole.println(nombre);
        escribiendole.println("<form action='respuestaEsperada' method='post'>"); //<--formulario creado.
        escribiendole.println("<label for='nombre'>Ingrese el Nombre:</label>"); //<-- el label para ingresar lo que piden 
        escribiendole.println("<input type='text' id='nombre' name='nombre' required>");//<--para poder interactual con el usuario
        escribiendole.println("<button type='submit'>Enviar</button>");//<--boton para enviar 
        escribiendole.println("</form>");
		escribiendole.println("</html></body>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	
	}

}
