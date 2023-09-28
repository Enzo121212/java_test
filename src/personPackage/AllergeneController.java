package personPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.DataBAse;
import personBeans.Allergene;

/**
 * Servlet implementation class AllergeneController
 */
@WebServlet(name = "Allergene", urlPatterns = { "/Allergene" })
public class AllergeneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllergeneController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Allergene allergene = new Allergene();
		
		DataBAse db = new DataBAse();
		request.setAttribute("allergene", db.recuperAllergene());
		
		
		this.getServletContext().getRequestDispatcher("/ListeLivreur.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Allergene allergene = new Allergene();
			allergene.setLibelle(request.getParameter("nom"));
			
			DataBAse db = new DataBAse();
			db.ajouterAllergene(allergene);
			
			request.setAttribute("allergene", db.recuperAllergene());
			
			this.getServletContext().getRequestDispatcher("/ListeLivreur.jsp").forward(request, response);
		
		
	}
	



}
