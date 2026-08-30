package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfxh {
    zzfxh() {
    }

    public abstract com.google.android.gms.internal.ads.zzfxh zzb(java.lang.Object obj);

    static int zze(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
