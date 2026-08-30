package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeyj implements com.google.android.gms.internal.ads.zzfeq {
    private final com.google.android.gms.internal.ads.zzezf zza;

    public zzeyj(com.google.android.gms.internal.ads.zzezf zzezfVar) {
        this.zza = zzezfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeq
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfer zzferVar) {
        com.google.android.gms.internal.ads.zzeyk zzeykVar = (com.google.android.gms.internal.ads.zzeyk) zzferVar;
        return ((com.google.android.gms.internal.ads.zzeyg) this.zza).zzb(zzeykVar.zzb, zzeykVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfeq
    public final void zzb(com.google.android.gms.internal.ads.zzfef zzfefVar) {
        zzfefVar.zza = ((com.google.android.gms.internal.ads.zzeyg) this.zza).zza();
    }
}
