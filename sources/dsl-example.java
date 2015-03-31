public void configure() {
       from("undertow://http://localhost:8080/dsl/hello")
       .transform(simple("Camel Undertow response"
                        +" from Java DSL route."));
}
