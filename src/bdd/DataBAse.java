package bdd;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;



import personBeans.Allergene;;

public class DataBAse {
	private Connection connexion;
	
	public List<Allergene> recuperAllergene() {
		List<Allergene> allergene = new ArrayList<Allergene>();
	    Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();
        
        try {
            statement = connexion.createStatement();

     
            resultat = statement.executeQuery("SELECT * FROM allergenes;");

            // Récupération des données
            while (resultat.next()) {
                String data = resultat.getString("Libelle");
                System.out.print(data);
                
                Allergene all = new Allergene();
                all.setLibelle(data);
                
                
                allergene.add(all);
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
		
		return allergene;
	}
	
	
    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");
            System.out.print("DB OK");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ajouterAllergene(Allergene allergene) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO allergenes(Libelle) VALUES(?);");
            preparedStatement.setString(1, allergene.getLibelle());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
	
	
	
	
	
	
}
