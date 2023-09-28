package personPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import personBeans.Livreur;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String user = request.getParameter("username");
		//String pass = request.getParameter("password");
		
		
		Livreur liv = new Livreur();
		liv.verifyIdentifiant(request);
		request.setAttribute("liv", liv);
		
		HttpSession session =request.getSession();
		
		session.setAttribute("prenom", liv.getPrenom());
		session.setAttribute("nom", liv.getNom());
		
		
		response.addCookie(new Cookie("nom", liv.getNom()));
		
		
		//pour avoir les session
		//HttpSession sessionExiste = request.getSession();
		//String nom = (String) sessionExiste.getAttribute("nom");
		//pour supprimer session
		//sessionExiste.invalidate()
		
		
		this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	}

}
