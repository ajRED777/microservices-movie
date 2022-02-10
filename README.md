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
![image](https://user-images.githubusercontent.com/44117428/153349226-ba467d51-758a-494a-8db3-d9b6fd2d5f50.png)

	-running microservices individually in docker containers
	
![image](https://user-images.githubusercontent.com/44117428/153349072-65bd0ab6-42ce-427e-91d0-f124d89de932.png)
		
	commands
			> docker build .
			> docker run -p 8762:8761 <image_id>
			
	
## 5.Registering microservices in different containers to the eureka server
	-configuring yml file
	-running in docker
		commands
			> docker-compose build --no-cache
			> docker-compose up
![image](https://user-images.githubusercontent.com/44117428/153350482-711a112d-01e2-4118-90fd-29be906525d4.png)



#### References
* [Microservices-java brains](https://youtube.com/playlist?list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas)
* [Docker & Docker Compose for Java Spring Apps](https://youtu.be/8s7m9DHkzQY)
* [Solution to registering clients on eureka failing](https://stackoverflow.com/questions/44667063/docker-and-eureka-with-spring-boot-failing-to-register-clients)

				


