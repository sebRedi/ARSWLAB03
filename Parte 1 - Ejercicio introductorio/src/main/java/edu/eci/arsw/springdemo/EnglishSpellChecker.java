package edu.eci.arsw.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EnglishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {		
		return "Checked with english checker:"+text;
	}

        
}
