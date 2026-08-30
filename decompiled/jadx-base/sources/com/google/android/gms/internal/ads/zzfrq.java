package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrq extends com.google.android.gms.internal.ads.zzfsc {
    private java.lang.String zza;
    private java.lang.String zzb;

    zzfrq() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final com.google.android.gms.internal.ads.zzfsc zza(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final com.google.android.gms.internal.ads.zzfsc zzb(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final com.google.android.gms.internal.ads.zzfsd zzc() {
        return new com.google.android.gms.internal.ads.zzfrs(this.zza, this.zzb, null);
    }
}
