package org.vkrajput.english.monkey.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vkrajput.english.monkey.service.EnglishMonkeyService;

import java.util.List;

@RestController
@RequestMapping("/english")
public class EnglishMonkeyRestController {

    @Autowired
    private EnglishMonkeyService englishMonkeyService;


    @GetMapping("/word/{length}")
    public List<String> getWordsOfLength( @PathVariable int length) {
        return englishMonkeyService.getAnyWordsByLength(length);
    }

    @GetMapping("category/{category}/word/{length}")
    public List<String> getWordsByLengthAndCategory( @PathVariable int length, @PathVariable String category) {
        return englishMonkeyService.getWordsByCategoryAndLength( category, length);
    }


}
