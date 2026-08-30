package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A1 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final com.facebook.ads.redexgen.core.AM A03;
    public final com.facebook.ads.redexgen.core.Et A04;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A05;
    public final com.facebook.ads.redexgen.core.C0714Gp A06;
    public final java.lang.Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public A1(com.facebook.ads.redexgen.core.AM am, long j, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        this(am, null, new com.facebook.ads.redexgen.core.Et(0), j, androidx.media3.common.C.TIME_UNSET, 1, false, trackGroupArray, c0714Gp);
    }

    public A1(com.facebook.ads.redexgen.core.AM am, java.lang.Object obj, com.facebook.ads.redexgen.core.Et et, long j, long j2, int i, boolean z, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        this.A03 = am;
        this.A07 = obj;
        this.A04 = et;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = c0714Gp;
    }

    public static void A00(com.facebook.ads.redexgen.core.A1 a1, com.facebook.ads.redexgen.core.A1 a2) {
        a2.A0A = a1.A0A;
        a2.A09 = a1.A09;
    }

    public final com.facebook.ads.redexgen.core.A1 A01(int i) {
        com.facebook.ads.redexgen.core.A1 a1 = new com.facebook.ads.redexgen.core.A1(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, a1);
        return a1;
    }

    public final com.facebook.ads.redexgen.core.A1 A02(int i) {
        com.facebook.ads.redexgen.core.A1 playbackInfo = new com.facebook.ads.redexgen.core.A1(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final com.facebook.ads.redexgen.core.A1 A03(com.facebook.ads.redexgen.core.AM am, java.lang.Object obj) {
        com.facebook.ads.redexgen.core.A1 playbackInfo = new com.facebook.ads.redexgen.core.A1(am, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final com.facebook.ads.redexgen.core.A1 A04(com.facebook.ads.redexgen.core.Et et, long j, long j2) {
        long j3 = j2;
        com.facebook.ads.redexgen.core.AM am = this.A03;
        java.lang.Object obj = this.A07;
        if (!et.A01()) {
            j3 = androidx.media3.common.C.TIME_UNSET;
        }
        return new com.facebook.ads.redexgen.core.A1(am, obj, et, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final com.facebook.ads.redexgen.core.A1 A05(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        com.facebook.ads.redexgen.core.A1 playbackInfo = new com.facebook.ads.redexgen.core.A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0714Gp);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final com.facebook.ads.redexgen.core.A1 A06(boolean z) {
        com.facebook.ads.redexgen.core.A1 playbackInfo = new com.facebook.ads.redexgen.core.A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
