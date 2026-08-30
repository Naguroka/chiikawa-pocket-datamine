package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzmf {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzh;

    zzmf(int i) {
        this.zzh = i;
    }

    public static com.google.android.gms.measurement.internal.zzmf zzb(int i) {
        for (com.google.android.gms.measurement.internal.zzmf zzmfVar : values()) {
            if (zzmfVar.zzh == i) {
                return zzmfVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzh;
    }
}
