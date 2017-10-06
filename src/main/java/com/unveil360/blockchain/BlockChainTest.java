package com.unveil360.blockchain;

import java.util.ArrayList;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class BlockChainTest {


    public static void main(String[] args) {

        Person p1 = new Person(1, "rawad");
        Person p2 = new Person(2, "rifai");

        Transaction t1 = new Transaction();
        t1.setFrom(p1);
        t1.setTo(p2);
        t1.setAmount(100);

        Transaction t2 = new Transaction();
        t2.setFrom(p1);
        t2.setTo(p2);
        t2.setAmount(90);

        Block genesisBlock = new Block(1234, null);

        Block b1 = new Block(genesisBlock.getCurrentHash(), new ArrayList<Transaction>());
        b1.addTransaction(t1);

        Block b2 = new Block(b1.getCurrentHash(), new ArrayList<Transaction>());
        b2.addTransaction(t2);

        System.out.println("Genesis Hash: " + genesisBlock.getCurrentHash());
        System.out.println("B1: " + b1.getCurrentHash());
        System.out.println("B2: " + b2.getCurrentHash());
    }
}
