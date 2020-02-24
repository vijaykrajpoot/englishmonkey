package org.vkrajput.english.monkey.service.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Word implements WordCategory {
    private String word;

    private int length;




    @Override
    public String getFigureOfSpeech() {
        return null;
    }

    @Override
    public int getSenseIndex() {
        return 0;
    }

    @Override
    public int getTagCount() {
        return 0;
    }
}
