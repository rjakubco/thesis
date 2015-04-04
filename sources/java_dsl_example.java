from("resteasy:/say/hello?servletName=restServlet")
    .to("file:log/response.log");
