package com.practica.edutecno;

//import jakarta.servlet.RequestDispatcher; //comentado porque por ahora no usare el JSP.
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class respuestaEsperada
 */
@WebServlet("/respuestaEsperada")
public class respuestaEsperada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public respuestaEsperada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   doPost(request, response); //<--si deseo hacerlo por post aqui en el get le pongo eso 
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		String nombre = request.getParameter("nombre");//<--esto obtiene el nombre de appFormulario
//        response.setContentType("text/html");
//        PrintWriter salida = response.getWriter();
//        salida.println("<html><body>");
//        salida.println("<h1>El nombre recibido es: " + nombre + "</h1>");//<--efectivamente obtine el nombre del otro servlet app...
//        salida.println("<form action='appFormularioSimple' method='get'>");//<--para obtener al otro servlet y asi que tenga sentido el boton de abajo
//        salida.println("<button type='submit'>Volver al formulario</button>");//<--para ver el volver al formulario.
//        salida.println("</form>");
//        salida.println("</body></html>");
		
		
//		//Aqui establicimos en nomb para compartirlo entre los servlets para trabjara con jsp 
//		request.setAttribute("nomb", nombre);//
//	//
//
//		RequestDispatcher probandoSinFuncionard=request.getRequestDispatcher("/mostrarNombre.jsp");
//		probandoSinFuncionard.forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);//<--esto hace que funcione el doGet si deaseas que funcione por alla
		String nombre = request.getParameter("nombre");//<--esto obtiene el nombre de appFormulario
        response.setContentType("text/html");
        PrintWriter salida = response.getWriter();
        salida.println("<html><body>");
        salida.println("<h1>El nombre enviado es: " + nombre + "</h1>");//<--efectivamente obtine el nombre del otro servlet app...
        salida.println("<form action='appFormularioSimple' method='get'>");//<--para obtener al otro servlet y asi que tenga sentido el boton de abajo
        salida.println("<button type='submit'>Volver al formulario</button>");//<--para ver el volver al formulario.
        salida.println("</form>");
        salida.println("</body></html>");

	}

}
