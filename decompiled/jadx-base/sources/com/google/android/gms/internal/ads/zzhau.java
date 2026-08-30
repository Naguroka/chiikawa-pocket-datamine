package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzhau {
    DOUBLE(com.google.android.gms.internal.ads.zzhav.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.ads.zzhav.FLOAT, 5),
    INT64(com.google.android.gms.internal.ads.zzhav.LONG, 0),
    UINT64(com.google.android.gms.internal.ads.zzhav.LONG, 0),
    INT32(com.google.android.gms.internal.ads.zzhav.INT, 0),
    FIXED64(com.google.android.gms.internal.ads.zzhav.LONG, 1),
    FIXED32(com.google.android.gms.internal.ads.zzhav.INT, 5),
    BOOL(com.google.android.gms.internal.ads.zzhav.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.ads.zzhav.STRING, 2),
    GROUP(com.google.android.gms.internal.ads.zzhav.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.ads.zzhav.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.ads.zzhav.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.ads.zzhav.INT, 0),
    ENUM(com.google.android.gms.internal.ads.zzhav.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.ads.zzhav.INT, 5),
    SFIXED64(com.google.android.gms.internal.ads.zzhav.LONG, 1),
    SINT32(com.google.android.gms.internal.ads.zzhav.INT, 0),
    SINT64(com.google.android.gms.internal.ads.zzhav.LONG, 0);

    private final com.google.android.gms.internal.ads.zzhav zzt;

    zzhau(com.google.android.gms.internal.ads.zzhav zzhavVar, int i) {
        this.zzt = zzhavVar;
    }

    public final com.google.android.gms.internal.ads.zzhav zza() {
        return this.zzt;
    }
}
