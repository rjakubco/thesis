InvocationCallback<Response> callback = 
   new InvocationCallback {
       public void completed(Response res) {
          //do something
       }  

       public void failed(ClientException e) {
          // do something
       }
};
