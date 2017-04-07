# Proxy a Vaadin application with Spring Cloud Zuul
This is the first sample of my experience with [Spring Cloud](http://projects.spring.io/spring-cloud/) and [Vaadin](https://vaadin.com).

Hopefully I find some time during the Easter holidays to add some more documentation here.


## Running the sample

The simplest way to run the sample is to start the applications with the Spring Boot Dashboard of your IDE.

First you have to start the `config-service` application because the configuration is centralized. The `application.properties` files could be found here:

* `config-service/config-data`

After that, order doesn't matter for the start of the other applications:

* `eureka-service`
* `proxy-service`
* `simple-vaadin-application`

## Using the sample

**1) Check if applications are registered in Eureka**

Open Eureka dashboard `http://localhost:8761/` and check if the applications are listed

**2) Check if none-proxied Vaadin application is reachable**

Open `http://localhost:7070/simple-vaadin-application/` and check if you could see the 'Hello World'

**3) Check if proxy service has discovered the `simple-vaadin-application`**

Open health endpoint of proxy service `http://localhost:8080/health` and check if the `simple-vaadin-application` is in the application list of Eureka indicator. 

**4) Open proxied Vaadin application**

Open `http://localhost:8080/simple-vaadin-application`  and check if you could see the 'Hello World'.
Finally have a look on the address bar of the browser if you are still using the proxied Vaadin application.
