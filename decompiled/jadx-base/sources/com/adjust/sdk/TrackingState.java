package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public enum TrackingState {
    OPTED_OUT(1);

    private int value;

    TrackingState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
