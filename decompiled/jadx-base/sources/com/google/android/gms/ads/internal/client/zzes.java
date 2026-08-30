package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzes extends com.google.android.gms.ads.internal.client.zzce {
    final /* synthetic */ com.google.android.gms.ads.preload.PreloadCallback zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzex zzb;

    zzes(com.google.android.gms.ads.internal.client.zzex zzexVar, com.google.android.gms.ads.preload.PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        this.zzb = zzexVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(com.google.android.gms.ads.internal.client.zzft zzftVar) {
        java.util.Optional optionalZzk = com.google.android.gms.ads.internal.client.zzex.zzk(this.zzb, zzftVar);
        final com.google.android.gms.ads.preload.PreloadCallback preloadCallback = this.zza;
        optionalZzk.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.ads.internal.client.zzeq
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                preloadCallback.onAdsAvailable((com.google.android.gms.ads.preload.PreloadConfiguration) obj);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(com.google.android.gms.ads.internal.client.zzft zzftVar) {
        java.util.Optional optionalZzk = com.google.android.gms.ads.internal.client.zzex.zzk(this.zzb, zzftVar);
        final com.google.android.gms.ads.preload.PreloadCallback preloadCallback = this.zza;
        optionalZzk.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                preloadCallback.onAdsExhausted((com.google.android.gms.ads.preload.PreloadConfiguration) obj);
            }
        });
    }
}
