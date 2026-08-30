package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevf implements com.google.android.gms.internal.ads.zzetr {
    final com.google.android.gms.internal.ads.zzgcs zza;

    public zzevf(com.google.android.gms.internal.ads.zzbay zzbayVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzevg(new org.json.JSONObject());
            }
        });
    }
}
