package com.unveil360.blockchain;

import java.util.ArrayList;

/**
 * Created by rawad.elrifai on 10/5/17.
 */
public class Ledger {

    public static ArrayList<Block> ledger = new ArrayList<Block>();

    public void addGenesisBlock(Block genesisBlock) {
        ledger.add(genesisBlock);
    }
    synchronized public static void addBlockToLedger(Block block) {
        block.setPreviousHash(ledger.get(ledger.size()-1).hashCode());
        ledger.add(block);
    }

    @Override
    public int hashCode() {
        return ledger.hashCode();
    }
}
