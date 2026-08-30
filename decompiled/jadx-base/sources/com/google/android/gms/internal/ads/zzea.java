package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzea implements com.google.android.gms.internal.ads.zzcx {
    protected zzea() {
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final long zza() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final long zzb() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final long zzc() {
        return java.lang.System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final com.google.android.gms.internal.ads.zzdh zzd(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new com.google.android.gms.internal.ads.zzed(new android.os.Handler(looper, callback));
    }
}
