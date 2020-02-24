package org.vkrajput.english.monkey.service.domain;

public interface WordCategory {
    /**
     *
     * -- partsOfSpeech
     * -- Syn tag :  n NOUN
     * -- Syn tag :  v VERB
     * -- Syn tag :  a ADJECTIVE
     * -- Syn tag :  r ADVERB
     * -- Syn tag :  s ADJECTIVE SATELLITE
     * https://wordnet.princeton.edu/documentation/wndb5wn
     * https://stackoverflow.com/questions/18817396/what-part-of-speech-does-s-stand-for-in-wordnet-synsets
     *
     * @return
     */
    String getFigureOfSpeech();

    /**
     * A sense (or word sense) is a discrete representation of one aspect of the meaning of a word
     * @return sense index
     */
    int getSenseIndex();

    /**
     * Returns a number that's intended to provide an approximation of how frequently the specified word
     * form is used to represent this meaning relative to how often it's used to represent other meanings.
     *
     * @return tagCount
     */
    int getTagCount();











}
