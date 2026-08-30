package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class MessageListener {
    public void onBleSignalChanged(com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.BleSignal bleSignal) {
    }

    public void onDistanceChanged(com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.Distance distance) {
    }

    public void onFound(com.google.android.gms.nearby.messages.Message message) {
    }

    public void onLost(com.google.android.gms.nearby.messages.Message message) {
    }
}
