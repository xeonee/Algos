package com.codeWars.prac;

public class Quotes {
	public static void main(String[] args) {
		String[] quotes = { "Quote Hidden in example test",
                "Holy haberdashery, Batman!",
                "Quote Hidden in example test"
               };
		System.out.println(getQuote(quotes, "Rob1n"));
	}

	public static String getQuote(String[] quotes, String hero){
		String returnString = "";
		String realHero = "";
		String realQuote = "";
		//FILL ME IN
		if(hero.startsWith("Bat")){
			realHero = "Batman";
		}
		else if(hero.startsWith("Rob")){
			realHero = "Robin";
		}
		else if(hero.startsWith("Jok")){
			realHero = "Joker";
		}
			
		for (int i = 3; i < hero.length(); i++) {
			if(Character.isDigit(hero.charAt(i))){
				realQuote = quotes[Character.getNumericValue(hero.charAt(i))];
			}
		}
		
		returnString = realHero+": "+realQuote;
		
		return returnString;
	}
}
