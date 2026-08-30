package com.google.firebase.installations.time;

/* JADX INFO: loaded from: classes5.dex */
public class SystemClock implements com.google.firebase.installations.time.Clock {
    private static com.google.firebase.installations.time.SystemClock singleton;

    private SystemClock() {
    }

    public static com.google.firebase.installations.time.SystemClock getInstance() {
        if (singleton == null) {
            singleton = new com.google.firebase.installations.time.SystemClock();
        }
        return singleton;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
