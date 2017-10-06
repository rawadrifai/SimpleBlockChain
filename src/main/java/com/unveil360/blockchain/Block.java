package com.unveil360.blockchain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Block {

    private int previousHash;
    private ArrayList<Transaction> transactions;
    //private int currentHash;
    private String[] trans;

    public Block(int previousHash, String[] trans) {

        this.previousHash = previousHash;
        this.trans = trans;
    }

    public Block(int previousHash, ArrayList<Transaction> transactions) {

        this.previousHash = previousHash;
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode() {

        Object[] objects = {transactions.hashCode(), previousHash};
        return Arrays.hashCode(objects);
    }
}
