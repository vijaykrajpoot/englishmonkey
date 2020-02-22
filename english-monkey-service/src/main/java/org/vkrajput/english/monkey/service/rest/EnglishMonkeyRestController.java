package org.vkrajput.english.monkey.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vkrajput.english.monkey.service.EnglishMonkeyService;

import java.util.List;

@RestController
public class EnglishMonkeyRestController {

    @Autowired
    private EnglishMonkeyService englishMonkeyService;

    @GetMapping("/")
    public List<String> getWords() {
        return englishMonkeyService.getWords();
    }


}
