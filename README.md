This sample app shows how to call a Grails Service from a Micronaut Singleton. 

However, two instances of the Grails Service are created. One for the Spring Context and one for the Micronaut Context. To verify it run the app: 

```
./gradlew bootRun
```

and execute:

```
% curl localhost:8080/books/micronaut
{"isbn":"dfd7d103-255b-4876-b6cc-c4ab57c2842c","name":"Building Microservices"}%   %
sdelamo@ig11 contexts % curl localhost:8080/books/grails
{"isbn":"4aad434c-b401-42d9-a43d-bcfa067c904d","name":"Building Microservices"}%   
```    

Note the ISBN are different because `BooksService` is instantiated twice one for the Micronaut Context and one for the Spring context. 