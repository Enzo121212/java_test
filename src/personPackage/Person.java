package personPackage;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import personBeans.Livreur;





/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1> Bonjour je suis la pour vous benir </h1>");*/
		
		//Envoyer des donnes
		String nom = "Faly mahita anao zah malala aa";
		request.setAttribute("nom", nom);
		
		
		//get paramettre sur l'url
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		
		//Tableau
		String[] tabName = {"Enzo","Rakoto","Fanja","Loloavi"}; 
		request.setAttribute("tabName", tabName);
		
		//Java BEans = object
		
		// Person p1 = new Person();
		//p1.setNom("Rondro");
		//p1.setPrenom("Akondro");
		//p1.setIsActif(true);
		
		Livreur p1 = new Livreur();
	    p1.setNom("Rondro");
		p1.setPrenom("Akondro");
		p1.setIsActif(true);
		request.setAttribute("p1", p1);
		
		
		this.getServletContext().getRequestDispatcher("/Person.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   /*Livreur test= new Livreur();
	   test.verifyIdentifiant(request);
	   request.setAttribute("form", test);
		System.out.print(test.getResultat());*/
		//this.getServletContext().getRequestDispatcher("/Person.jsp").forward(request, response);
		//doGet(request,response);
		
		String username = request.getParameter("username");
        
        request.setAttribute("username", username);
        
       // this.getServletContext().getRequestDispatcher("/Person.jsp").forward(request, response);
	
	}

}
