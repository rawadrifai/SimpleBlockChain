package com.unveil360.blockchain;

import java.util.ArrayList;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Ledger {

    public static ArrayList<Block> ledger = new ArrayList<Block>();

    synchronized public void addBlockToLedger(Block block) {
        ledger.add(block);
    }
}
