package org.bitcoinj.core;

public interface SporkSyncListener {

    void onUpdate(SporkMessage spork);
}