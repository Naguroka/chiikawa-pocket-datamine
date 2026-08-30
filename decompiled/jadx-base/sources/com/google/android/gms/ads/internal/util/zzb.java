package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzb {
    private final java.lang.Runnable zza = new com.google.android.gms.ads.internal.util.zza(this);
    private volatile java.lang.Thread zzb;

    public abstract void zza();

    public com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzbzw.zza.zza(this.zza);
    }
}
