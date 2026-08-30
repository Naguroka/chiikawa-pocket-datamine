package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeqv implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;

    zzeqv(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzequ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeqw zzc() throws java.lang.Exception {
        com.google.android.gms.ads.internal.zzv.zzq();
        return new com.google.android.gms.internal.ads.zzeqw(com.google.android.gms.ads.internal.util.zzs.zzt(this.zza));
    }
}
