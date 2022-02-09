package com.aj.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.aj.moviecatalogservice.models.CatalogItem;
import com.aj.moviecatalogservice.models.Movie;
import com.aj.moviecatalogservice.models.Rating;
import com.aj.moviecatalogservice.models.UserRatings;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId ){
		
		
		//get all rated movie Id s
		UserRatings ratings = restTemplate.getForObject("http://localhost:8083/ratings/users/'"+userId, UserRatings.class);
		
		
		return ratings.getRatings().stream().map(rating-> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			
//			Movie movie = webClientBuilder.build()
//				.get() //get Method
//				.uri("http://localhost:8082/movies/"+rating.getMovieId())
//				.retrieve() //go fetch
//				.bodyToMono(Movie.class)//reactive programming term where well get the required object in the future
//				.block();//wait until mono returns
			return new CatalogItem(movie.getName(), "test", rating.getRating());
				
		})
			.collect(Collectors.toList());
		//for each movie Id, call movie info service and get details
	
		//put them all together
//		return Collections.singletonList(
//				new CatalogItem("Titanic", "Titanic movie", 3)
//		);
		
	}

}
