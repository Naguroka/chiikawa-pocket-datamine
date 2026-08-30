package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0829Li {
    public final int A01;
    public final int A02;
    public final java.util.Deque<java.lang.String> A04 = new java.util.LinkedList();
    public final java.util.Deque<java.lang.String> A03 = new java.util.LinkedList();
    public java.lang.String A00 = null;

    public C0829Li(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public final java.lang.Iterable<java.lang.String> A00() {
        return this.A03;
    }

    public final java.lang.Iterable<java.lang.String> A01() {
        return this.A04;
    }

    public final java.lang.String A02() {
        return this.A00;
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A04.addLast(this.A00);
            if (this.A04.size() > this.A02) {
                this.A04.removeFirst();
            }
        }
        if (this.A03.size() > 0) {
            this.A00 = this.A03.removeFirst();
        } else {
            this.A00 = null;
        }
    }

    public final void A04(java.lang.String str) {
        this.A03.addLast(str);
        if (this.A03.size() <= this.A01) {
            return;
        }
        if (this.A00 != null) {
            this.A04.addLast(this.A00);
        }
        this.A00 = this.A03.removeFirst();
        if (this.A04.size() > this.A02) {
            this.A04.removeFirst();
        }
    }
}
