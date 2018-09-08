package com.srikanth.spring.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuotesServiceImpl implements QuotesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuotesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
