package com.unveil360.blockchain;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Transaction {

    private Person from;
    private Person to;
    private int amount;

    public Transaction() {
        this.from = new Person();
        this.to = new Person();
        this.amount = 0;
    }

    public Transaction(Person from, Person to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Person getFrom() {
        return from;
    }

    public void setFrom(Person from) {
        this.from = from;
    }

    public Person getTo() {
        return to;
    }

    public void setTo(Person to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
