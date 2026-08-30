package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0803Kf {
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.InterfaceC0802Ke> A00 = new java.util.concurrent.atomic.AtomicReference<>(null);

    public static com.facebook.ads.redexgen.core.InterfaceC0802Ke A00() {
        com.facebook.ads.redexgen.core.InterfaceC0802Ke errorLogger = A00.get();
        if (errorLogger == null) {
            return new com.facebook.ads.redexgen.core.C1099Vs();
        }
        return errorLogger;
    }

    public static void A01(com.facebook.ads.redexgen.core.InterfaceC0802Ke interfaceC0802Ke) {
        A00.set(interfaceC0802Ke);
    }
}
