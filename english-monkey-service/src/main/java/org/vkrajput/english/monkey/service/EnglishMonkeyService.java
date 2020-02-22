package org.vkrajput.english.monkey.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EnglishMonkeyService {

    List<String> word = Arrays.asList("HAT", "BAT", "CAT", "MAT");

    public List<String> getWords() {
        return word;
    }
}
