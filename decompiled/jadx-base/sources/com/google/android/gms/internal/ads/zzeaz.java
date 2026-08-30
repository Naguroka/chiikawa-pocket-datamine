package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeaz extends com.google.android.gms.internal.ads.zzebw {
    private android.app.Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;

    zzeaz() {
    }

    @Override // com.google.android.gms.internal.ads.zzebw
    public final com.google.android.gms.internal.ads.zzebw zza(android.app.Activity activity) {
        if (activity == null) {
            throw new java.lang.NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebw
    public final com.google.android.gms.internal.ads.zzebw zzb(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebw
    public final com.google.android.gms.internal.ads.zzebw zzc(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebw
    public final com.google.android.gms.internal.ads.zzebw zzd(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebw
    public final com.google.android.gms.internal.ads.zzebx zze() {
        android.app.Activity activity = this.zza;
        if (activity != null) {
            return new com.google.android.gms.internal.ads.zzebb(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: activity");
    }
}
