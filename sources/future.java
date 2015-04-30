Future<Customer>future = 
		client.target("http://test.com/customers")
.queryParam("name", "Roman Jakubco").request().async()
.get(Customer.class); 

try {
  Customer cust = future.get(1, TimeUnit.MINUTES);
} catch (TimeoutException ex) {
  System.err.println("timeout");
}
