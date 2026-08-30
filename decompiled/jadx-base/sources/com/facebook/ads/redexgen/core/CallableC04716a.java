package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class CallableC04716a implements java.util.concurrent.Callable<java.lang.Boolean> {
    public final java.util.concurrent.BlockingQueue<java.lang.Boolean> A00 = new java.util.concurrent.LinkedBlockingQueue();
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04766f A01;

    public CallableC04716a(com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C04726b c04726b) {
        this.A01 = c04766f;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C1202Zv(this, c04766f, c04726b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean call() throws java.lang.Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(com.facebook.ads.redexgen.core.C04726b c04726b) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.RW rwA05 = com.facebook.ads.redexgen.core.RW.A05(this.A01.A04.A01());
        android.net.Uri uriA00 = com.facebook.ads.redexgen.core.L5.A00(c04726b.A08);
        long jA0Q = c04726b.A00;
        if (jA0Q == -1) {
            jA0Q = com.facebook.ads.redexgen.core.C0762Im.A0Q(this.A01.A04);
        }
        rwA05.A0G(uriA00, new com.facebook.ads.redexgen.core.C1201Zu(this, c04726b, jA0Q, jCurrentTimeMillis), jA0Q);
    }
}
