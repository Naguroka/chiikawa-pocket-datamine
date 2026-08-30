package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0817Kw {
    public static final com.facebook.ads.redexgen.core.C0817Kw A04 = new com.facebook.ads.redexgen.core.C0817Kw(new com.facebook.ads.redexgen.core.C1098Vr(), new com.facebook.ads.redexgen.core.C1097Vq());
    public final com.facebook.ads.redexgen.core.InterfaceC0816Kv A02;
    public final com.facebook.ads.redexgen.core.InterfaceC0840Lt A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0817Kw(com.facebook.ads.redexgen.core.InterfaceC0840Lt interfaceC0840Lt, com.facebook.ads.redexgen.core.InterfaceC0816Kv interfaceC0816Kv) {
        this.A03 = interfaceC0840Lt;
        this.A02 = interfaceC0816Kv;
    }

    public static com.facebook.ads.redexgen.core.C0817Kw A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5M();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        android.app.Activity lastResumedActivity = this.A02.A7e();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (com.facebook.ads.redexgen.core.C0817Kw.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5M() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
