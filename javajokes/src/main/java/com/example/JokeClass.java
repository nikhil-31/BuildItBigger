package com.example;

import java.util.Random;

public class JokeClass {

    private String[] jokes;
    private Random random;
    //Jokes that are provided
    public JokeClass() {
        jokes = new String[4];
        jokes[0] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokes[1] = "Yo mamma is so ugly when she tried to join an ugly contest they said, \"Sorry, no professionals.\" ";
        jokes[2] = "Yo momma's so fat and old when God said, \"Let there be light,\" he asked your mother to move out of the way.";
        jokes[3] = "Yo momma's so fat, that when she fell, no one was laughing but the ground was cracking up.\n";
        random = new Random();
    }

    //Method to get a random joke
    public String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
