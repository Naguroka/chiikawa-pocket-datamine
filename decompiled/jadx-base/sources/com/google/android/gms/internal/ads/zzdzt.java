package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdzt {
    private final com.google.android.gms.internal.ads.zzbve zza;

    zzdzt(com.google.android.gms.internal.ads.zzbve zzbveVar) {
        this.zza = zzbveVar;
    }

    public final void zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza = this.zza.zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhC)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbzz.zzb(listenableFutureZza, "persistFlags");
        } else {
            com.google.android.gms.internal.ads.zzbzz.zza(listenableFutureZza, "persistFlags");
        }
    }
}
