package com.company;

public class Main {

    public static void main(String[] args) {

        String s = "Jol Ley purchased #3 of the @washers at the price $0.25";
        Item u = new Item(s);
        u.getTotal();

    }
}
