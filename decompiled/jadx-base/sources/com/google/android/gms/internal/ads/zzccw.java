package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzccw extends com.google.android.gms.ads.internal.util.zzb {
    final com.google.android.gms.internal.ads.zzcbs zza;
    final com.google.android.gms.internal.ads.zzcde zzb;
    private final java.lang.String zzc;
    private final java.lang.String[] zzd;

    zzccw(com.google.android.gms.internal.ads.zzcbs zzcbsVar, com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.lang.String[] strArr) {
        this.zza = zzcbsVar;
        this.zzb = zzcdeVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzv.zzz().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzccv(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzce)).booleanValue() && (this.zzb instanceof com.google.android.gms.internal.ads.zzcdn)) ? com.google.android.gms.internal.ads.zzbzw.zzf.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzccu
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzd();
            }
        }) : super.zzb();
    }

    final /* synthetic */ java.lang.Boolean zzd() throws java.lang.Exception {
        return java.lang.Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final java.lang.String zze() {
        return this.zzc;
    }
}
