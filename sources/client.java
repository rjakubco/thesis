Client client = ClientFactory.newClient();

WebTarget target = client.target("http://test.com/books");

Form form = new Form().param("author", "Claus Ibsen")
.param("name","Camel in Action");

Response response = 
	   target.request().post(Entity.form(form));
Order order = response.readEntity(Order.class);

// direct get of Java object
Car car = client.target("http://resteasy.com/cars").
queryParam("brand", "Ferrari").request().get(Car.class);
