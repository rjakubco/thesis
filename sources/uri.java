// consumer pattern to follow
"resteasy:/{path}?[{uriOptions}]"

"resteasy:/say/foo?servletName=restServlet&proxy=true"

// producer pattern to follow
"resteasy:{protocol}://{host}:{port}/{path}?[{uriOptions}]"

"resteasy:http://localhost:8080/foo?resteasyMethod=POST"
