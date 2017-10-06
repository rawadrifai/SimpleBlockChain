package com.unveil360.blockchain;

import java.util.ArrayList;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Block {

    private int previousHash;
    private ArrayList<Transaction> transactions;
    private int currentHash;

    public Block(int previousHash, ArrayList<Transaction> transactions) {

        this.previousHash = previousHash;
        this.transactions = transactions;
        calculateCurrentHash();
    }

    private void calculateCurrentHash() {

        ArrayList list = new ArrayList();
        list.add(this.transactions);
        list.add(this.previousHash);

        this.currentHash = list.hashCode();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        calculateCurrentHash();
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

    public int getCurrentHash() {
        return currentHash;
    }

    public void setCurrentHash(int currentHash) {
        this.currentHash = currentHash;
    }
}
