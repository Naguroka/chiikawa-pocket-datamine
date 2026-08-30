package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewh implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzbzm zza;
    private final boolean zzb;
    private final boolean zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzgcs zze;

    zzewh(com.google.android.gms.internal.ads.zzbzm zzbzmVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzbzb zzbzbVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzmVar;
        this.zzb = z;
        this.zzc = z2;
        this.zze = zzgcsVar;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgQ)).booleanValue() && this.zzc) {
            return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzewi(null));
        }
        if (!this.zzb) {
            return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzewi(null));
        }
        return com.google.android.gms.internal.ads.zzgch.zze(com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzewf
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.zzewi((java.lang.String) obj);
            }
        }, this.zze), ((java.lang.Long) com.google.android.gms.internal.ads.zzbez.zzb.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzewg
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zzc((java.lang.Exception) obj);
            }
        }, this.zze);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzewi zzc(java.lang.Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return new com.google.android.gms.internal.ads.zzewi(null);
    }
}
