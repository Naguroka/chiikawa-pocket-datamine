package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfc {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();

    static {
        new java.util.concurrent.atomic.AtomicBoolean();
    }

    static com.google.android.gms.internal.ads.zzbfa zza() {
        return (com.google.android.gms.internal.ads.zzbfa) zza.get();
    }

    static com.google.android.gms.internal.ads.zzbfb zzb() {
        return (com.google.android.gms.internal.ads.zzbfb) zzb.get();
    }

    public static void zzc(com.google.android.gms.internal.ads.zzbfa zzbfaVar) {
        zza.set(zzbfaVar);
    }
}
