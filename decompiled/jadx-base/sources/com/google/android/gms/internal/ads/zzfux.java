package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfux extends com.google.android.gms.internal.ads.zzfva {
    zzfux(com.google.android.gms.internal.ads.zzfuy zzfuyVar, com.google.android.gms.internal.ads.zzfvc zzfvcVar, java.lang.CharSequence charSequence, int i) {
        super(zzfvcVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
