package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzgtp implements com.google.android.gms.internal.ads.zzgxv {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzgtp(int i) {
        this.zzh = i;
    }

    public static com.google.android.gms.internal.ads.zzgtp zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
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
