package poo.javaweb;

import spark.Request;
import spark.Response;
import spark.Route;

public class BoaNoite implements Route {

	@Override
	public Object handle(Request req, Response arg1) throws Exception {
		return "Boa noite " + req.params("pessoa");
	}

}
