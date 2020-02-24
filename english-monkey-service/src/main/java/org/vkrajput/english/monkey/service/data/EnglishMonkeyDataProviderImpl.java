package org.vkrajput.english.monkey.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.vkrajput.english.monkey.persistence.repository.WordsRepository;
import org.vkrajput.english.monkey.service.domain.Word;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Qualifier("wordsDataProvider")
public class EnglishMonkeyDataProviderImpl implements EnglishMonkeyDataProvider {

    @Autowired
    private WordsRepository wordsRepository;

    @Override
    public List<Word> findWords() {

        List<org.vkrajput.english.monkey.persistence.entity.Word> wordsEntity = wordsRepository.findByTagCountAndSenseIndex(2, 2);
        return wordsEntity.stream().map(new Function<org.vkrajput.english.monkey.persistence.entity.Word, Word>() {
            @Override
            public Word apply(org.vkrajput.english.monkey.persistence.entity.Word wordEntity) {
                return Word.builder().word(wordEntity.getWord()).length(wordEntity.getWord().length()).build();
            }
        }).collect(Collectors.toList());


    }
}
