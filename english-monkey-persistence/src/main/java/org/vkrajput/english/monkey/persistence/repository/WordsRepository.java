package org.vkrajput.english.monkey.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vkrajput.english.monkey.persistence.entity.Word;

import java.util.List;

@Repository
public interface WordsRepository extends JpaRepository<Word, Integer> {

    List<Word> findByTagCountAndSenseIndex(int tagCount,int senseIndex);
}
