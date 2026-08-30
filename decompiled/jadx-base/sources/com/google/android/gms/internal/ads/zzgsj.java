package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzgsj implements com.google.android.gms.internal.ads.zzgxv {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzgsj(int i) {
        this.zzh = i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
