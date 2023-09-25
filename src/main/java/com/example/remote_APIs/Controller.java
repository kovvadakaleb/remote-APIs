package com.example.remote_APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get-movie-info")
    public MovieResponse getInfo(@RequestParam("id") String movieID){
        String url = "https://api.themoviedb.org/3/movie/"+movieID+"?api_key=6a7b7ad6370fdceab0021319cf77091f";
       MovieResponse response =  restTemplate.getForObject(url,MovieResponse.class);
       return response;
    }



    @GetMapping("/getStudent/{id}")
    public Object getStudent(@PathVariable("id") int regNo){
        String url = "http://localhost:1000/student/get/"+regNo;
        Object response = restTemplate.getForObject(url,Object.class);
        return response;
    }


}
