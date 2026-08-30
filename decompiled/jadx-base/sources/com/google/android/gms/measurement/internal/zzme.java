package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzme {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    BACKOFF(3);

    private final int zzf;

    zzme(int i) {
        this.zzf = i;
    }

    public final int zza() {
        return this.zzf;
    }
}
