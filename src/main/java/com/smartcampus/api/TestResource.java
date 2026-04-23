/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {

    @GET
    public String test() {
        return "API is working!";
    }
}