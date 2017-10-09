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
        t1.setAmount(1100);

        Transaction t2 = new Transaction();
        t2.setFrom(p1);
        t2.setTo(p2);
        t2.setAmount(90);

        Transaction t3 = new Transaction();
        t3.setFrom(p1);
        t3.setTo(p2);
        t3.setAmount(80);

        Transaction t4 = new Transaction();
        t4.setFrom(p1);
        t4.setTo(p2);
        t4.setAmount(70);

        Ledger ledger = new Ledger();
        ArrayList<Transaction> genesisTransactions = new ArrayList<Transaction>();
        genesisTransactions.add(t1);
        Block genesisBlock = new Block(0, genesisTransactions);
        ledger.addGenesisBlock(genesisBlock);

        System.out.println(genesisBlock.hashCode());
        System.out.println(ledger.hashCode());
        System.out.println("--- 1");

        ArrayList<Transaction> b1Transactions = new ArrayList<Transaction>();
        b1Transactions.add(t2);
        b1Transactions.add(t3);
        Block b1 = new Block(0, b1Transactions);
        Ledger.addBlockToLedger(b1);

        System.out.println(ledger.hashCode());
        System.out.println("--- 2");

        ArrayList<Transaction> b2Transactions = new ArrayList<Transaction>();
        b2Transactions.add(t4);
        Block b2 = new Block(0, b2Transactions);
        Ledger.addBlockToLedger(b2);

        System.out.println(ledger.hashCode());
        System.out.println("--- 3");

        Ledger.ledger.get(0).getTransactions().get(0).getFrom().setName("something");

        System.out.println(ledger.hashCode());
        System.out.println("--- 4");

    }

}
