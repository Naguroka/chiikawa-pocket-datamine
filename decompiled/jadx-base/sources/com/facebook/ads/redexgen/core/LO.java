package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LO {
    public static final java.util.concurrent.atomic.AtomicReference<android.util.DisplayMetrics> A00 = new java.util.concurrent.atomic.AtomicReference<>();

    public static android.util.DisplayMetrics A00() {
        if (A00.get() != null) {
            return A00.get();
        }
        return com.facebook.ads.redexgen.core.LP.A03;
    }
}
