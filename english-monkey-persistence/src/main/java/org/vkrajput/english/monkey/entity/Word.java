package org.vkrajput.english.monkey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class Word {
    private String word;
}
