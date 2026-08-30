package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrz extends com.google.android.gms.internal.ads.zzftc {
    private java.lang.String zza;
    private java.lang.String zzb;

    zzfrz() {
    }

    @Override // com.google.android.gms.internal.ads.zzftc
    public final com.google.android.gms.internal.ads.zzftc zza(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftc
    public final com.google.android.gms.internal.ads.zzftc zzb(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftc
    public final com.google.android.gms.internal.ads.zzftd zzc() {
        return new com.google.android.gms.internal.ads.zzfsb(this.zza, this.zzb, null);
    }
}
