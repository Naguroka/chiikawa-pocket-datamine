package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzhs {
    DOUBLE(com.google.android.gms.internal.play_billing.zzht.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.play_billing.zzht.FLOAT, 5),
    INT64(com.google.android.gms.internal.play_billing.zzht.LONG, 0),
    UINT64(com.google.android.gms.internal.play_billing.zzht.LONG, 0),
    INT32(com.google.android.gms.internal.play_billing.zzht.INT, 0),
    FIXED64(com.google.android.gms.internal.play_billing.zzht.LONG, 1),
    FIXED32(com.google.android.gms.internal.play_billing.zzht.INT, 5),
    BOOL(com.google.android.gms.internal.play_billing.zzht.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.play_billing.zzht.STRING, 2),
    GROUP(com.google.android.gms.internal.play_billing.zzht.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.play_billing.zzht.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.play_billing.zzht.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.play_billing.zzht.INT, 0),
    ENUM(com.google.android.gms.internal.play_billing.zzht.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.play_billing.zzht.INT, 5),
    SFIXED64(com.google.android.gms.internal.play_billing.zzht.LONG, 1),
    SINT32(com.google.android.gms.internal.play_billing.zzht.INT, 0),
    SINT64(com.google.android.gms.internal.play_billing.zzht.LONG, 0);

    private final com.google.android.gms.internal.play_billing.zzht zzt;
    private final int zzu;

    zzhs(com.google.android.gms.internal.play_billing.zzht zzhtVar, int i) {
        this.zzt = zzhtVar;
        this.zzu = i;
    }

    public final com.google.android.gms.internal.play_billing.zzht zza() {
        return this.zzt;
    }
}
