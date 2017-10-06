package com.unveil360.blockchain;

import java.util.Arrays;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Transaction {

    private Person from;
    private Person to;
    private Integer amount;

    public Transaction() {
        this.from = new Person();
        this.to = new Person();
        this.amount = 0;
    }

    public Transaction(Person from, Person to, Integer amount) {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        Object[] objects = {from.hashCode(), to.hashCode(), amount.hashCode()};
        return Arrays.hashCode(objects);
    }
}
