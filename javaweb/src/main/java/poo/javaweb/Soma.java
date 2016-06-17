package poo.javaweb;

import spark.Request;
import spark.Response;
import spark.Route;

public class Soma implements Route {

	@Override
	public Object handle(Request req, Response arg1) throws Exception {
		
		int num1 = Integer.parseInt(req.params("num1"));
		
		int num2 = Integer.parseInt(req.params("num2"));
		
		int resultado = num1 + num2;
		
		return "A soma é " + resultado;
	}

}








