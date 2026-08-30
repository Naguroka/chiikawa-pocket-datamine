package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemy implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;
    private final com.google.android.gms.internal.ads.zzbzq zzc;

    public zzemy(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        this.zza = zzgcsVar;
        this.zzb = zzfcjVar;
        this.zzc = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzemz zzc() throws java.lang.Exception {
        return new com.google.android.gms.internal.ads.zzemz(this.zzb.zzj, this.zzc.zzm());
    }
}
