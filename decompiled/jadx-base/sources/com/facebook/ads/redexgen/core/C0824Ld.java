package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0824Ld implements java.io.Closeable {
    public com.facebook.ads.redexgen.core.C0823Lc A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.C0822Lb A02;
    public final java.lang.Runnable A03;

    public C0824Ld(long j, java.lang.Runnable runnable) {
        this.A02 = new com.facebook.ads.redexgen.core.C0822Lb(j);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new com.facebook.ads.redexgen.core.C0823Lc(this);
        }
    }

    public final com.facebook.ads.redexgen.core.C0822Lb A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.C0823Lc(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        com.facebook.ads.redexgen.core.C0823Lc executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
