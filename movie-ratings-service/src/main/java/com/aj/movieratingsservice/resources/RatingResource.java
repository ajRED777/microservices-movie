package com.aj.movieratingsservice.resources;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.movieratingsservice.models.Rating;
import com.aj.movieratingsservice.models.UserRatings;


@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId ){
		
		return 
				new Rating(movieId, 3)
		;
		
	}
	
	@GetMapping("users/{userId}")
	public UserRatings getUserRating(@PathVariable("userId") String userId ){
		
		List<Rating> ratings = Arrays.asList(
				new Rating("t", 3),
				new Rating("v", 3));
		
		UserRatings userRatings = new UserRatings();
		userRatings.setRatings(ratings);
		
		return userRatings;
		
	}
}
