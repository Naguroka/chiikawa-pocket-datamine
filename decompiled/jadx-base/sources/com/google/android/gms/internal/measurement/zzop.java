package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzop {
    DOUBLE(com.google.android.gms.internal.measurement.zzoq.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.measurement.zzoq.FLOAT, 5),
    INT64(com.google.android.gms.internal.measurement.zzoq.LONG, 0),
    UINT64(com.google.android.gms.internal.measurement.zzoq.LONG, 0),
    INT32(com.google.android.gms.internal.measurement.zzoq.INT, 0),
    FIXED64(com.google.android.gms.internal.measurement.zzoq.LONG, 1),
    FIXED32(com.google.android.gms.internal.measurement.zzoq.INT, 5),
    BOOL(com.google.android.gms.internal.measurement.zzoq.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.measurement.zzoq.STRING, 2),
    GROUP(com.google.android.gms.internal.measurement.zzoq.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.measurement.zzoq.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.measurement.zzoq.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.measurement.zzoq.INT, 0),
    ENUM(com.google.android.gms.internal.measurement.zzoq.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.measurement.zzoq.INT, 5),
    SFIXED64(com.google.android.gms.internal.measurement.zzoq.LONG, 1),
    SINT32(com.google.android.gms.internal.measurement.zzoq.INT, 0),
    SINT64(com.google.android.gms.internal.measurement.zzoq.LONG, 0);

    private final com.google.android.gms.internal.measurement.zzoq zzt;

    zzop(com.google.android.gms.internal.measurement.zzoq zzoqVar, int i) {
        this.zzt = zzoqVar;
    }

    public final com.google.android.gms.internal.measurement.zzoq zza() {
        return this.zzt;
    }
}
