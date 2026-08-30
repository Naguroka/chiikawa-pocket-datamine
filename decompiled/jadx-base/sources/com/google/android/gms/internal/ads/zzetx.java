package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetx implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;

    zzetx(android.content.Context context, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = context;
        this.zzb = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzb.zze()).booleanValue() ? this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        }) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzety(-1, -1));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzety zzc() throws java.lang.Exception {
        android.content.Context context = this.zza;
        return new com.google.android.gms.internal.ads.zzety(com.google.android.gms.internal.ads.zzbbv.zzb(context), com.google.android.gms.internal.ads.zzbbv.zza(context));
    }
}
