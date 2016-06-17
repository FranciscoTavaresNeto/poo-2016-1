package poo.javaweb;

import spark.Request;
import spark.Response;
import spark.Route;

public class HelloWorld implements Route {

	@Override
	public Object handle(Request arg0, Response arg1) throws Exception {
		return "Hello World!";
	}

}
