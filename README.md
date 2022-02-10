<h1 align="center">Movie microservices</h1>
<p align="center">Dockerising microservices and Eureka server</p>
<kbd><img src="https://cloud.githubusercontent.com/assets/4705188/20508600/ac62b414-b030-11e6-9dfe-691a6a3250fd.png" alt="image">
</kbd>

1.Creating 4 microservices
	-discovery-server -eureka server
	-movie-catalog-service
	-movie-ratings-service
	-movie-info-service

2.Configuring IPC
	-communicating between microservices in local using RestTemplate

3.Configuring eureka server
	-eureka server config-properties file changes and @EnableEurekaClient
	-client changes - app properties-eureka.client.register-with-eureka=true,eureka.client.fetch-registry=true

4.Running microservices in docker containers and doing IPC
	-configuring Dockerfile s for microservices
	-configuring yml file
	-running in docker
		commands
			docker-compose build --no-cache
			docker-compose up
				


