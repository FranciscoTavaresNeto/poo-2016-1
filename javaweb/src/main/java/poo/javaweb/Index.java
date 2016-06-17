package poo.javaweb;

import spark.Request;
import spark.Response;
import spark.Route;

public class Index implements Route {

	@Override
	public Object handle(Request arg0, Response arg1) throws Exception {
		return "<a href='/hello'>Hello</a>";
	}

}
