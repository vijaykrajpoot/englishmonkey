package org.vkrajput.english.monkey.service.data;

import org.springframework.stereotype.Component;
import org.vkrajput.english.monkey.service.domain.Word;

import java.util.List;


public interface EnglishMonkeyDataProvider {

    List<Word> findWords();

    List<Word> findWords(int length);

}
