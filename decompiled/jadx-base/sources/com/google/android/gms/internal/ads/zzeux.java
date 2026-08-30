package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeux implements com.google.android.gms.internal.ads.zzetr {
    private final java.util.concurrent.Executor zza;
    private final java.lang.String zzb;

    public zzeux(com.google.android.gms.internal.ads.zzbzd zzbzdVar, java.util.concurrent.Executor executor, java.lang.String str, android.content.pm.PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzf(com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgch.zzh(this.zzb), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeuv
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.zzeuy((java.lang.String) obj);
            }
        }, this.zza), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc((java.lang.Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable th) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeuy(this.zzb));
    }
}
