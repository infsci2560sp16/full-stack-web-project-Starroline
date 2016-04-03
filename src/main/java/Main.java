import static spark.Spark.staticFileLocation;
import static spark.Spark.*;

/**
 * @author gaopingjie
 *
 */
public class Main {

	public static void main(String[] args) {

        port(Integer.valueOf(System.getenv("PORT")));

		staticFileLocation("/public");
		
		Routes test = new Routes();
		login tryLogin = new login();
		search trySearch = new search();
	}



}
