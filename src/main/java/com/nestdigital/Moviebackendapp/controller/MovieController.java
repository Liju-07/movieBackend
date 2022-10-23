package com.nestdigital.Moviebackendapp.controller;

import com.nestdigital.Moviebackendapp.Dao.MovieDao;
import com.nestdigital.Moviebackendapp.Model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
   private MovieDao dao;

@CrossOrigin(origins = "*")
    @PostMapping(path = "/movieadd",consumes ="application/json",produces = "application/json")
    public String movieadd(@RequestBody MovieModel movie)
    {
        System.out.println(movie.toString());
        dao.save(movie);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<MovieModel> viewmovie()
    {
       return (List<MovieModel>)dao.findAll();
    }

}
