package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerr implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzfbn zza;

    zzerr(com.google.android.gms.internal.ads.zzfbn zzfbnVar) {
        this.zza = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzers(this.zza));
    }
}
