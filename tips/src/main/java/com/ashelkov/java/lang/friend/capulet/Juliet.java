package com.ashelkov.java.lang.friend.capulet;

import java.util.Objects;

import com.ashelkov.java.lang.friend.montague.Romeo;

public class Juliet {

    public static void beCuddled(Romeo.Love love) {
        Objects.requireNonNull(love);
        System.out.println("Romeo, O Romeo, wherefore art thou?");
    }

}
