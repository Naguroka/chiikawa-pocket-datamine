package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhfe {
    private final java.util.List zza;
    private final java.util.List zzb;

    /* synthetic */ zzhfe(int i, int i2, com.google.android.gms.internal.ads.zzhfd zzhfdVar) {
        this.zza = com.google.android.gms.internal.ads.zzheo.zzc(i);
        this.zzb = com.google.android.gms.internal.ads.zzheo.zzc(i2);
    }

    public final com.google.android.gms.internal.ads.zzhfe zza(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        this.zzb.add(zzhfaVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfe zzb(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        this.zza.add(zzhfaVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhff zzc() {
        return new com.google.android.gms.internal.ads.zzhff(this.zza, this.zzb, null);
    }
}
