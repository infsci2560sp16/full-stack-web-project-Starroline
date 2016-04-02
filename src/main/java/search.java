import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;


public class search {
	
	public search(){
		searchMovie();
	}
	
	public void searchMovie(){

		get("/search",(req,res)->{

			Map<String,Object> movie=new HashMap<>();
			movie.put("movieName",req.queryParams("movie"));
			movie.put("director", "John Stevenson");
			movie.put("producer", "DreamWorks Animation");
			movie.put("releaseYear", 2008);
			movie.put("releaseMonth", 6);
			movie.put("releaseDate", 23);			
			movie.put("language","English");
			movie.put("budget","$130 million");
			movie.put("boxOffice","$631.7 million");
			movie.put("username","Victoria");
			String xml =    "<?xml version='1.0' encoding='UTF-8'?>" +"<movie>"+
                    
                        "<movieName>"+movie.get("movieName")+"</movieName>" +
                        "<director>John Stevenson</director>" +
                        "<producer>DreamWorks Animation</producer>" +
                        "<releaseYear>2008</releaseYear>" +
                        "<releaseMonth>6</releaseMonth>" +
                        "<releaseDate>23</releaseDate>" +
                        "<language>English</language>" +
                        "<budget>$130 million</budget>" +
                        "<boxOffice>$631.7 million</boxOffice>" +
                        "<username>Victoria</username>"+"</movie>";
			res.type("text/xml");
			System.out.println("done searching");
			return xml;
		});

	}
}