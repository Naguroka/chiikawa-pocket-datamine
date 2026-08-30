package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzgcb extends com.google.android.gms.internal.ads.zzgcc {
    private final com.google.common.util.concurrent.ListenableFuture zza;

    protected zzgcb(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzfxe
    protected final /* synthetic */ java.lang.Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc, com.google.android.gms.internal.ads.zzgca
    protected final /* synthetic */ java.util.concurrent.Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    protected final com.google.common.util.concurrent.ListenableFuture zzc() {
        return this.zza;
    }
}
