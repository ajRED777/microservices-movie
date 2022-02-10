<h1 align="center">Movie microservices</h1>
<p align="center">Dockerizing microservices and registering on the Eureka server </p>


## 1.Creating 4 spring boot applications
	-discovery-server -> the eureka server used for registering services
	-movie-catalog-service -> service that gives list of movies the user has rated
	-movie-ratings-service -> service that gives the rating the user has saved for a movie
	-movie-info-service -> service that provides the information of a movie

## 2.Configuring Inter Process Communication between microservices
	-communicating between microservices in local using RestTemplate

## 3.Configuring eureka server
	-eureka server config-properties file changes and @EnableEurekaClient in application class
	-changes in client server - app properties-eureka.client.register-with-eureka=true,eureka.client.fetch-registry=true

## 4.Running microservices in docker containers
	-configuring Dockerfiles for microservices
	-running microservices individually in docker containers
		commands
			docker build .
			docker run -p 8762:8761 <image_id>
	
## 5.Registering microservices in different containers to the eureka server
	-configuring yml file
	-running in docker
		commands
			docker-compose build --no-cache
			docker-compose up
				


