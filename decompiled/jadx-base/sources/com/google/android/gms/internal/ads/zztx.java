package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zztx {
    private static final java.util.concurrent.atomic.AtomicLong zza = new java.util.concurrent.atomic.AtomicLong();

    public zztx(long j, com.google.android.gms.internal.ads.zzgd zzgdVar, long j2) {
        android.net.Uri uri = zzgdVar.zza;
        java.util.Collections.emptyMap();
    }

    public zztx(long j, com.google.android.gms.internal.ads.zzgd zzgdVar, android.net.Uri uri, java.util.Map map, long j2, long j3, long j4) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
