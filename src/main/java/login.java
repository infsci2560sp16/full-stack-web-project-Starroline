import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.heroku.sdk.jdbc.DatabaseUrl;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class login {

	
	
	public login(){
		Gson gson = new GsonBuilder().create();
		get("/login", (req, res) -> {
            Map<String, Object> data = new HashMap<>();
            String username=req.queryParams("username");
			String password = req.queryParams("password");
			data.put("username", username);
			data.put("password", password);
            return gson.toJson(data);
        });
		
		post("/register", (req, res) -> {
            Map<String, Object> data = new HashMap<>();
            String firstname=req.queryParams("firstname");
			String lastname = req.queryParams("lastname");
			String username=req.queryParams("username");
			String password = req.queryParams("password");
			String confirmpassword=req.queryParams("confirmPassword");
			String email = req.queryParams("email");
			data.put("firstname", firstname);
			data.put("lastname", lastname);
			data.put("username", username);
			data.put("password", password);
			data.put("confirmpassword", confirmpassword);
			data.put("email", email);
            return data;
        }, gson::toJson);
		
		
	    get("/db", (req, res) -> {
	        Connection connection = null;
	        Map<String, Object> attributes = new HashMap<>();
	        try {
	          connection = DatabaseUrl.extract().getConnection();

	          Statement stmt = connection.createStatement();
	          stmt.executeUpdate("CREATE TABLE IF NOT EXISTS movie (movieId movieName)");
	          stmt.executeUpdate("INSERT INTO movie VALUES (panda)");
	          ResultSet rs = stmt.executeQuery("SELECT movieName FROM movie");

	          ArrayList<String> output = new ArrayList<String>();
	          while (rs.next()) {
	            output.add( "Read from DB: " + rs.getTimestamp("tick"));
	          }

	          attributes.put("results", output);
	          return new ModelAndView(attributes, "db.ftl");
	        } catch (Exception e) {
	          attributes.put("message", "There was an error: " + e);
	          return new ModelAndView(attributes, "error.ftl");
	        } finally {
	          if (connection != null) try{connection.close();} catch(SQLException e){}
	        }
	      }, new FreeMarkerEngine());
		
	}
	
}
