package com.nestdigital.Moviebackendapp.Dao;

import com.nestdigital.Moviebackendapp.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
