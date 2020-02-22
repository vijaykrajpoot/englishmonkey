package org.vkrajput.english.monkey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vkrajput.english.monkey.loader.WordsLoaderService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnglishMonkeyService {

    @Autowired
    private WordsLoaderService wordsLoaderService;


    List<String> word = Arrays.asList("HAT", "BAT", "CAT", "MAT", "RAT", "FAT", "RED", "BLUE");

    public List<String> getAnyWordsByLength(int wordLength) {
        return word
                .stream()
                .filter(w -> (w.length() == wordLength))
                .sorted().collect(Collectors.toList());
    }


    public List<String> getWordsByCategoryAndLength(String category, int wordLength) {
        return word
                .stream()
                .filter(w -> (w.length() == wordLength))
                .sorted().collect(Collectors.toList());
    }


}
