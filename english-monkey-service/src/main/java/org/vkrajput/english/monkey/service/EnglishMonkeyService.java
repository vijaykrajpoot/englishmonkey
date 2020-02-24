package org.vkrajput.english.monkey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vkrajput.english.monkey.service.data.EnglishMonkeyDataProvider;
import org.vkrajput.english.monkey.service.domain.Word;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnglishMonkeyService {

    @Autowired
    private EnglishMonkeyDataProvider englishMonkeyDataProvider;


    List<String> word = Arrays.asList("HAT", "BAT", "CAT", "MAT", "RAT", "FAT", "RED", "BLUE");

    public List<String> getAnyWordsByLength(int wordLength) {

        englishMonkeyDataProvider.findWords();
        return word
                .stream()
                .filter(w -> (w.length() == wordLength))
                .sorted().collect(Collectors.toList());
    }

    /**
     * Return list of words
     *
     * @param category
     * @param wordLength
     * @return words
     */
    public List<String> getWordsByCategoryAndLength(String category, int wordLength) {
        List<Word> words = englishMonkeyDataProvider.findWords();
        return words.stream().map(w -> w.getWord()).collect(Collectors.toList());
    }


}
