package com.thavelka.funfacts;

import java.util.Random;

/**
 * Created by tim on 1/13/15.
 */
public class FactBook {
    // Member Variables

    private static final String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "In Bangladesh, kids as young as 15 can be jailed for cheating on their finals.",
            "Honeybees have a type of hair on their eyes.",
            "Owls are one of the only birds who can see the color blue.",
            "Dolphins sleep with one eye open.",
            "In the White House, there are 13,092 knives, forks and spoons.",
            "Over 1000 birds a year die from smashing into windows.",
            "The placement of a donkey’s eyes in its’ heads enables it to see all four feet at all times.",
            "Camels have three eyelids to protect themselves from blowing sand.",
            "Donald Duck comics were banned from Finland because he doesn’t wear pants.",
            "Most lipstick contains fish scales.",
            "Winston Churchill was born in a ladies’ room during a dance.",
            "When possums are playing ‘possum’, they are not “playing.” They actually pass out from sheer terror.",
            "Months that begin on a Sunday will always have a ‘Friday the 13th’.",
            "38% of American men say they love their cars more than women.",
            "The the U.S. you dial ’911′. In Stockholm, Sweden you dial 90000.",
            "The U.S. military operates 234 golf courses.",
            "A duck’s quack doesn’t echo, and no one knows why.",
            "In every episode of Seinfeld there is a Superman somewhere.",
            "Rhode Island is the only state which the hammer throw is a legal high school sport.",
            "The average lifespan of an eyelash is five months.",
            "A spider has transparent blood.",
            "Every acre of American crops harvested contains 100 pounds of insects.",
            "The Minneapolis phone book has 21 pages of Andersons.",
            "Poland is the “stolen car capital of the world”.",
            "Most dust particles in your house are made from dead skin.",
            "Walt Disney was afraid of mice.",
            "Pearls melt in vinegar.",
            "It takes 3,000 cows to supply the NFL with enough leather for a year’s supply of footballs.",
            "A Saudi Arabian woman can get a divorce if her husband doesn’t give her coffee.",
            "Nutmeg is extremely poisonous if injected intravenously.",
            "Most toilets flush in E flat.",
            "The longest recorded flight of a chicken is thirteen seconds.",
            "Napoleon’s penis was sold to an American Urologist for $40,000.",
            "40,000 Americans are injured by toilets each year.",
            "Human birth control pills work on gorillas.",
            "The first bomb the Allies dropped on Berlin in WWII killed the only elephant in the Berlin Zoo."

    };

    // Methods
    public static String getFact() {


        String fact;
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
