package org.vkrajput.english.monkey.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.vkrajput.english.monkey.persistence.repository.WordsRepository;
import org.vkrajput.english.monkey.service.domain.Word;

import java.util.LinkedList;
import java.util.List;

@Component
@Qualifier("wordsDataProvider")
public class EnglishMonkeyDataProviderImpl implements EnglishMonkeyDataProvider {

    @Autowired
    private WordsRepository wordsRepository;

    @Override
    public List<Word> findWords() {

        List<org.vkrajput.english.monkey.persistence.entity.Word> wordsEntity = wordsRepository.findByTagCountAndSenseIndex(2, 2);

        List<Word> words = new LinkedList<>();
        // Transform entity to domain object
        wordsEntity.stream().forEach(word -> {

            System.out.println(word.getId());
        });

        return words;
    }

    @Override
    public List<Word> findWords(int length) {
        List<Word> words = new LinkedList<>();
        List<org.vkrajput.english.monkey.persistence.entity.Word> wordsEntity = wordsRepository.findByTagCountAndSenseIndex(2, 2);

        return words;
    }
}




