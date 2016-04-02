import static spark.Spark.staticFileLocation;

/**
 * @author gaopingjie
 *
 */
public class Main {

	public static void main(String[] args) {

		staticFileLocation("/public");
		
		Routes test = new Routes();
		login tryLogin = new login();
		search trySearch = new search();
	}



}
