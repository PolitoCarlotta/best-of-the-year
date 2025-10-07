package com.example.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.best_of_the_year.model.Movie;
import com.example.best_of_the_year.model.Song;

    @Controller
    @RequestMapping("/")

public class BestOfYearController {

        @GetMapping("/best")
        public String saluta (@RequestParam(required=false) String nome, Model model){
            model.addAttribute("nome" , nome);
            return "index";
         }


        private List<Movie> getBestMovie(){
            List<Movie> movies = new ArrayList <> ();

            movies.add(new Movie("1", "Titanic"));
            movies.add(new Movie("2", "Lord of the ring"));
            movies.add(new Movie("3", "The Hobbit"));
            movies.add(new Movie("4", "Donnie Darko"));
            movies.add(new Movie("5", "007"));
            movies.add(new Movie("6", "Giorgio"));

            return movies;
            
         }

         
        private List<Song> getBestSong(){
            List<Song> songs = new ArrayList <>();

            songs.add(new Song("1","Fear of the dark"));
            songs.add(new Song("2","Happy"));
            songs.add(new Song("3","Starway to Heaven"));
            songs.add(new Song("4","Azzurro"));
            return songs;
         }

         @GetMapping("/movies")

         public String bestMovies (Model model) {
            List <Movie> movies = getBestMovie();
            model.addAttribute("movies", movies);
            return "movies";
         }


         @GetMapping("/songs")
         public String bestSongs (Model model) {
            List <Song> songs = getBestSong();
            model.addAttribute("songs", songs);
            return "songs";
         }

}
