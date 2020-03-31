package org.vkrajput.english.monkey.service.data;

import org.vkrajput.english.monkey.persistence.entity.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EnglishMonkeyDataTransformation {

    public Function<Word, org.vkrajput.english.monkey.service.domain.Word> convertEntityWordToDomainWord = (Word w) -> {
        return org.vkrajput.english.monkey.service.domain.Word.builder()
                .word(w.getWord())
                .length(w.getWord().length()
                ).build();
    };

    public Function<List<Word>, List<org.vkrajput.english.monkey.service.domain.Word>> transformListOfWordEntityToDomainList = (List<Word> entityWordList) -> {
        return entityWordList
                .stream()
                .map(word -> convertEntityWordToDomainWord.apply(word))
                .collect(Collectors.toList());
    };


    public Function<List<Word>, List<org.vkrajput.english.monkey.service.domain.Word>> transformListOfWordEntityToDomainListByLength = (List<Word> entityWordList) -> {

        List<String> aa = new ArrayList<>();


        return entityWordList
                .stream()
                .filter(word -> word.getWord().length() == 3)
                .map(word -> convertEntityWordToDomainWord.apply(word))
                .collect(Collectors.toList());
    };

}
