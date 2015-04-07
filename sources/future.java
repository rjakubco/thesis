Future<Customer>future = client.target("http://e.com/customers")
.queryParam("name", "Bill Burke").request().async()
.get(Customer.class); 

try {
  Customer cust = future.get(1, TimeUnit.MINUTES);
} catch (TimeoutException ex) {
  System.err.println("timeout");
}
