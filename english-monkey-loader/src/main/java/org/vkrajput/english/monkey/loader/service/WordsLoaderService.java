package org.vkrajput.english.monkey.loader.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class WordsLoaderService {
    List<String> word = Arrays.asList("HAT", "BAT", "CAT", "MAT", "RAT", "FAT", "RED", "BLUE");


    public List<String> getWords(){
        return word;
    }

}
