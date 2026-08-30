package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevu implements com.google.android.gms.internal.ads.zzetr {
    final java.util.concurrent.ScheduledExecutorService zza;

    public zzevu(com.google.android.gms.internal.ads.zzbti zzbtiVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.content.Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgch.zzh(new android.os.Bundle()), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzek)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zza), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.zzevv((android.os.Bundle) obj);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zza);
    }
}
