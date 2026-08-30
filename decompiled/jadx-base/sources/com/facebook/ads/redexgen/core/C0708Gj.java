package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0708Gj {

    @java.lang.Deprecated
    public final int A00;
    public final int A01;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A02;
    public final int[] A03;
    public final int[] A04;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray[] A05;
    public final int[][][] A06;

    public C0708Gj(int[] iArr, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray) {
        this.A04 = iArr;
        this.A05 = trackGroupArrayArr;
        this.A06 = iArr3;
        this.A03 = iArr2;
        this.A02 = trackGroupArray;
        this.A01 = iArr.length;
        this.A00 = this.A01;
    }

    public final int A00() {
        return this.A01;
    }

    public final int A01(int i) {
        return this.A04[i];
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A02(int i) {
        return this.A05[i];
    }
}
