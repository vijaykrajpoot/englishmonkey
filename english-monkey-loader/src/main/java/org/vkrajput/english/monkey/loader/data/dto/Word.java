package org.vkrajput.english.monkey.loader.data.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Word {
    private String word;
    private int length;
    private WordCategory category;
}
