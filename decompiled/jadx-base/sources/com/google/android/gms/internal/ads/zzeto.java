package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeto implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;

    zzeto(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetn zzc() throws java.lang.Exception {
        return new com.google.android.gms.internal.ads.zzetn(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfX)));
    }
}
