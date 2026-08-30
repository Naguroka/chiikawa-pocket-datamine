package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzmn {
    VOID(java.lang.Void.class, java.lang.Void.class, null),
    INT(java.lang.Integer.TYPE, java.lang.Integer.class, 0),
    LONG(java.lang.Long.TYPE, java.lang.Long.class, 0L),
    FLOAT(java.lang.Float.TYPE, java.lang.Float.class, java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.TYPE, java.lang.Double.class, java.lang.Double.valueOf(0.0d)),
    BOOLEAN(java.lang.Boolean.TYPE, java.lang.Boolean.class, false),
    STRING(java.lang.String.class, java.lang.String.class, ""),
    BYTE_STRING(com.google.android.gms.internal.measurement.zzld.class, com.google.android.gms.internal.measurement.zzld.class, com.google.android.gms.internal.measurement.zzld.zzb),
    ENUM(java.lang.Integer.TYPE, java.lang.Integer.class, null),
    MESSAGE(java.lang.Object.class, java.lang.Object.class, null);

    private final java.lang.Class zzl;

    zzmn(java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        this.zzl = cls2;
    }

    public final java.lang.Class zza() {
        return this.zzl;
    }
}
