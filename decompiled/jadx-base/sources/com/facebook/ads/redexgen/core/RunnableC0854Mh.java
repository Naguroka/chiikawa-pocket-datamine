package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0854Mh implements java.lang.Runnable {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0604Bs A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new java.lang.RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, 13, 21, 14, 13, 15, 7, 41, 30, 30, 3, 30};
    }

    static {
        A01();
    }

    public RunnableC0854Mh(com.facebook.ads.redexgen.core.C0604Bs c0604Bs) {
        this.A00 = c0604Bs;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A06.A0Z(10);
            ((com.facebook.ads.redexgen.core.AbstractC0853Mg) this.A00.A00).A01.A0E().A3L(A00(0, 18, 115));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
