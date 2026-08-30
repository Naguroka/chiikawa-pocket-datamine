package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeop implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzdpr zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfcj zzd;

    public zzeop(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzdpr zzdprVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.lang.String str) {
        this.zza = zzgcsVar;
        this.zzb = zzdprVar;
        this.zzd = zzfcjVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeoo
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeoq zzc() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzdpr zzdprVar = this.zzb;
        return new com.google.android.gms.internal.ads.zzeoq(zzdprVar.zzb(this.zzd.zzf, this.zzc), zzdprVar.zza());
    }
}
