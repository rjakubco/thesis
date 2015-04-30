@Path("/orders")
public class Order{
	
  @Post
  @Consumes("application/json")
  public void submit(Order order, 
                     @Suspended AsyncResponse response){
    new Thread() {
      public void run() {
	 OrderConfirmation con = orderProcess.process(order);
	 Response resp = Response.ok(con,
	   	          MediaType.APPLICATION_XML_TYPE)
			 .build();
	 response.resume(resp);
      }
    }.start();
  }
}
