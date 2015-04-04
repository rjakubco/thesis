public void configure() {
       from("resteasy:/say/hello?servletName=restServlet")
       .transform(simple("Overriding response message"
                        +" from Java DSL route."));
}
