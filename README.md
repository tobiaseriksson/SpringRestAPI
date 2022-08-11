# SpringRestAPI
Just demo how you would do a simple Spring based API
Endpoints
* GET /help
* GET /api/names
* GET /api/names/\<id\>


As you can see by the SecurityConfig.java class, all the endpoints except for /help needs basic authentication.

Thus, you need to provide

Username: admin

Password: abc123

to do a GET /api/names, or GET /api/names/3


