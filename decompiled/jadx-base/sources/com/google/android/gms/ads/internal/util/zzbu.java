package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbu {
    final java.util.Map zza = new java.util.concurrent.ConcurrentHashMap();

    public zzbu() {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final android.graphics.Bitmap zza(java.lang.Integer num) {
        return (android.graphics.Bitmap) this.zza.get(num);
    }
}
