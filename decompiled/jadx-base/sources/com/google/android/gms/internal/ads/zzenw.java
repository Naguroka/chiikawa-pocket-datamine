package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzenw implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzfcj zza;

    zzenw(com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 58;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzenx(this.zza.zzp));
    }
}
