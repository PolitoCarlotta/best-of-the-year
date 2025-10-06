package com.example.best_of_the_year.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    @RequestMapping("/")

public class BestOfYearController {

        @GetMapping("/best")
        public String saluta (@RequestParam(required=false) String nome, Model model){
            model.addAttribute("nome" , nome);
            return "index";
         }

        private List<Movie> getBestMovie(){

            List<Movie> movies = 
         }

        private List<Song> getBestSong(){
            
         }
}