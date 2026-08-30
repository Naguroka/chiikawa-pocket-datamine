package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzxo {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzbr zzb;
    public final int zzc;
    public final com.google.android.gms.internal.ads.zzab zzd;

    public zzxo(int i, com.google.android.gms.internal.ads.zzbr zzbrVar, int i2) {
        this.zza = i;
        this.zzb = zzbrVar;
        this.zzc = i2;
        this.zzd = zzbrVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(com.google.android.gms.internal.ads.zzxo zzxoVar);
}
