package com.example.miranpc.lib;

import java.util.Random;

public class Jokes {

    private static final String [] jokes = {
            "albert einestin walked in to a bar the bartender said better not get any ideas! :D",
            "2 +2 is 4 -1 that's 3 quick maths",
            "I'm running out of jokes",
            "another joke",
            "I dont know what to say",


    };

    public  String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}
