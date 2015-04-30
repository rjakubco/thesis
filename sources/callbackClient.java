InvocationCallback<Response> callback = 
   new InvocationCallback {
        public void completed(Response res) {
          System.out.println("Request success!");
        } 

        public void failed(ClientException e) {
          System.out.println("Request failed!");
        }
}; 

client.target("http://example.com/customers").
queryParam("name", "Roman Jakubco").request().
async().get(callback);
