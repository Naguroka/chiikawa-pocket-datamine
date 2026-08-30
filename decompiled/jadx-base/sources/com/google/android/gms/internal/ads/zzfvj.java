package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfvj {
    public static com.google.android.gms.internal.ads.zzfvf zza(com.google.android.gms.internal.ads.zzfvf zzfvfVar) {
        if ((zzfvfVar instanceof com.google.android.gms.internal.ads.zzfvi) || (zzfvfVar instanceof com.google.android.gms.internal.ads.zzfvg)) {
            return zzfvfVar;
        }
        return zzfvfVar instanceof java.io.Serializable ? new com.google.android.gms.internal.ads.zzfvg(zzfvfVar) : new com.google.android.gms.internal.ads.zzfvi(zzfvfVar);
    }
}
