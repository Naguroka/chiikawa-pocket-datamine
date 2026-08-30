package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KL implements java.lang.Runnable {
    public static java.lang.String[] A00 = {"Sq0yZcwOgTGXIMbLXRKfOSdr7WdDOtyr", "WnfyQ5g3TOMlbPuUI1S38a6tMB", "BxTfzMbMUk2Qmg34ayslQfc8Uzo4QxVA", "G4BpHh0l6RWcqwLcVWEAByBTvG", "Wi1pgJHqhNt1rkC03e0JnQGSkCoA4pQ8", "kTE0MmPx9fRa1cZyXVlJ3kyazaX8qf2", "b5YZOJ5Dove32nH3VcyYtuQbqE02hip", "2Ait9FMgROtB2NZo6j3UC5dnhoYmjwMQ"};
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> A01 = new java.util.concurrent.atomic.AtomicReference<>();

    public abstract void A01();

    public static java.lang.Throwable A00() {
        java.lang.Throwable th = A01.get();
        java.lang.String[] strArr = A00;
        if (strArr[6].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A00;
        strArr2[6] = "SrEDgE7BL0uBLmhOMBZPSVpD24D14xc";
        strArr2[5] = "UbLf4323SSK9wFof04kcdZ3h6JYQV0q";
        return th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A01();
        } catch (java.lang.Throwable th) {
            A01.set(th);
            throw th;
        }
    }
}
