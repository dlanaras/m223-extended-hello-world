package ch.zli.m223;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("calculator/add/{firstNumber}/{secondNumber}")
public class CalculatorResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("firstNumber") int firstNumber, @PathParam("secondNumber") int secondNumber) {
        return Integer.toString(firstNumber + secondNumber);
    } 
}
