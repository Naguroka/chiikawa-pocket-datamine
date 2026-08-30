package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C7j extends android.content.ContextWrapper {
    public final com.facebook.ads.redexgen.core.InterfaceC05017l A00;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A01;

    public C7j(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05017l interfaceC05017l) {
        super(context.getApplicationContext());
        this.A01 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A00 = interfaceC05017l;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC04806j A00() {
        return this.A00.A6j();
    }

    public final com.facebook.ads.redexgen.core.C1198Zr A01() {
        return this.A00.A8F(this);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05007k A02() {
        return this.A00.A6Y(this);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05027m A03() {
        return this.A00.A7J(this);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05037o A04() {
        return this.A00.A8E(this);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05047p A05() {
        return this.A00.A8U();
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass80 A06() {
        return this.A00.A77(this);
    }

    public final com.facebook.ads.redexgen.core.C8D A07() {
        return this.A00.A79(this);
    }

    public final com.facebook.ads.redexgen.core.C05188h A08() {
        return this.A00.A8M();
    }

    public final com.facebook.ads.redexgen.core.J7 A09() {
        return this.A00.A6H(A01());
    }

    public final com.facebook.ads.redexgen.core.JJ A0A() {
        return this.A00.A8G(A01());
    }

    public final java.lang.String A0B() {
        return this.A01.get();
    }

    public final void A0C(java.lang.String str) {
        this.A01.set(str);
    }
}
