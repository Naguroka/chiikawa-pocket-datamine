package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgmf {
    private static final com.google.android.gms.internal.ads.zzgmf zza = new com.google.android.gms.internal.ads.zzgmf();
    private static final com.google.android.gms.internal.ads.zzgmd zzb = new com.google.android.gms.internal.ads.zzgmd(null);
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();

    public static com.google.android.gms.internal.ads.zzgmf zzb() {
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzglq zza() {
        com.google.android.gms.internal.ads.zzglq zzglqVar = (com.google.android.gms.internal.ads.zzglq) this.zzc.get();
        return zzglqVar == null ? zzb : zzglqVar;
    }
}
