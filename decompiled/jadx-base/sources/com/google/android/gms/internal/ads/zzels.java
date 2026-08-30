package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzels implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;

    zzels(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        this.zza = clock;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzelt(this.zzb, this.zza.currentTimeMillis()));
    }
}
