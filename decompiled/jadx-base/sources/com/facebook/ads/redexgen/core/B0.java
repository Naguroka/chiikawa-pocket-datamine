package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B0 extends java.lang.Thread {
    public final /* synthetic */ android.media.AudioTrack A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Z3 A01;

    public B0(com.facebook.ads.redexgen.core.Z3 z3, android.media.AudioTrack audioTrack) {
        this.A01 = z3;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                this.A01.A0f.open();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
