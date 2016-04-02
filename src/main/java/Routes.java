import static spark.Spark.get;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class Routes {
	
	Gson gson= new Gson();
	
	public Routes(){
		setupRoutes();
	}
	
	private void setupRoutes() {
		
		get("/myIndex", (req, res) -> {
			Map<String, Object> attributes = new HashMap<>();

			SimpleDateFormat formatter1 = new SimpleDateFormat("EEEE");
			String dayOfWeek = formatter1.format(new Date());
			
			
			SimpleDateFormat formatter2 = new SimpleDateFormat("HH");
			String getTime = formatter2.format(new Date());
			int time = Integer.valueOf(getTime);

			String timePeriod=null;
			String username=null;
			
			if(time>=6 && time<12){
				timePeriod="morning";
			}
			else if(time>=12 && time<18){
				timePeriod="afternoon";
			}
			else{
				timePeriod="evening";
			}
			
			if(req.queryParams("username")!=null){
				username=req.queryParams("username");
			}
			else{
				username=" ";
			}
			
			
			attributes.put("title", "MovieClub");
			attributes.put("timePeriod", timePeriod);
			attributes.put("dayOfWeek", dayOfWeek);
			attributes.put("username", username);

			return new ModelAndView(attributes, "myIndex.ftl");
		} , new FreeMarkerEngine());
	}
}
