package org.vkrajput.english.monkey.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "wn_synset")
public class Word {
    @Id
    @Column(name = "synset_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "word")
    private String word;

    @Column(name = "ss_type")
    private String partsOfSpeech;

    @Column(name = "sense_number")
    private int senseIndex;

    @Column(name = "tag_count")
    private int tagCount;

}
