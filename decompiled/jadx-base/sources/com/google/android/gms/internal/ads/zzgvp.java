package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgvp {
    private final com.google.android.gms.internal.ads.zzgvo zza;

    private zzgvp(com.google.android.gms.internal.ads.zzgvo zzgvoVar) {
        this.zza = zzgvoVar;
    }

    public static com.google.android.gms.internal.ads.zzgvp zzb(byte[] bArr, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        return new com.google.android.gms.internal.ads.zzgvp(com.google.android.gms.internal.ads.zzgvo.zzb(bArr));
    }

    public static com.google.android.gms.internal.ads.zzgvp zzc(int i) {
        return new com.google.android.gms.internal.ads.zzgvp(com.google.android.gms.internal.ads.zzgvo.zzb(com.google.android.gms.internal.ads.zzgnk.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        return this.zza.zzc();
    }
}
