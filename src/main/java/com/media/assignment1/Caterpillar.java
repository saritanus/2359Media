package com.media.assignment1;

import com.media.assignment.Animal;
import com.media.assignment1.interfaces.Crawl;

public class Caterpillar extends Animal implements Crawl {
    @Override
    public void crawl() {
        System.out.println("I am crawling");
    }
}

