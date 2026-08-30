package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public final class SerializedEventUnion {
    public static final byte NONE = 0;
    public static final byte SerializedMessage = 1;
    public static final byte SerializedTokenReceived = 2;
    public static final java.lang.String[] names = {"NONE", "SerializedMessage", "SerializedTokenReceived"};

    private SerializedEventUnion() {
    }

    public static java.lang.String name(int i) {
        return names[i];
    }
}
