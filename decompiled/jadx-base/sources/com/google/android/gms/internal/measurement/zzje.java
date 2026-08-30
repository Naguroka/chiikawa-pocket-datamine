package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzje {
    private static com.google.android.gms.internal.measurement.zzjd zza;

    public static synchronized com.google.android.gms.internal.measurement.zzjd zza() {
        if (zza == null) {
            zzb(new com.google.android.gms.internal.measurement.zzjh());
        }
        return zza;
    }

    public static synchronized void zzb(com.google.android.gms.internal.measurement.zzjd zzjdVar) {
        if (zza != null) {
            throw new java.lang.IllegalStateException("init() already called");
        }
        zza = zzjdVar;
    }
}
