InvocationCallback<Response> callback = new InvocationCallback {
  public void completed(Response res) {
    System.out.println("Request success!");
  } 

  public void failed(ClientException e) {
    System.out.println("Request failed!");
  }
}; 

client.target("http://example.com/customers").queryParam("name", "Bill Burke")
.request().async().get(callback);
