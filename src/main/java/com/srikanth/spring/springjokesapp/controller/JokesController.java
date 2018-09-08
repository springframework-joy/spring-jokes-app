package com.srikanth.spring.springjokesapp.controller;

import com.srikanth.spring.springjokesapp.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private QuotesService quotesService;

    @Autowired
    public JokesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", quotesService.getRandomQuote());

        return "chucknorris";
    }
}
