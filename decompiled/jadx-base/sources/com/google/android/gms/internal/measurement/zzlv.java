package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzlv {
    DOUBLE(0, 1, com.google.android.gms.internal.measurement.zzmn.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.measurement.zzmn.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.measurement.zzmn.LONG),
    UINT64(3, 1, com.google.android.gms.internal.measurement.zzmn.LONG),
    INT32(4, 1, com.google.android.gms.internal.measurement.zzmn.INT),
    FIXED64(5, 1, com.google.android.gms.internal.measurement.zzmn.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.measurement.zzmn.INT),
    BOOL(7, 1, com.google.android.gms.internal.measurement.zzmn.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.measurement.zzmn.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.measurement.zzmn.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.measurement.zzmn.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.measurement.zzmn.INT),
    ENUM(12, 1, com.google.android.gms.internal.measurement.zzmn.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.measurement.zzmn.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.measurement.zzmn.LONG),
    SINT32(15, 1, com.google.android.gms.internal.measurement.zzmn.INT),
    SINT64(16, 1, com.google.android.gms.internal.measurement.zzmn.LONG),
    GROUP(17, 1, com.google.android.gms.internal.measurement.zzmn.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.measurement.zzmn.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.measurement.zzmn.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.measurement.zzmn.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.measurement.zzmn.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.measurement.zzmn.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.measurement.zzmn.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.measurement.zzmn.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.measurement.zzmn.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.measurement.zzmn.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.measurement.zzmn.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.measurement.zzmn.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.measurement.zzmn.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.measurement.zzmn.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.measurement.zzmn.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.measurement.zzmn.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.measurement.zzmn.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.measurement.zzmn.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.measurement.zzmn.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.measurement.zzmn.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.measurement.zzmn.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.measurement.zzmn.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.measurement.zzmn.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.measurement.zzmn.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.measurement.zzmn.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.measurement.zzmn.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.measurement.zzmn.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.measurement.zzmn.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.measurement.zzmn.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.measurement.zzmn.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.measurement.zzmn.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.measurement.zzmn.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.measurement.zzmn.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.measurement.zzmn.VOID);

    private static final com.google.android.gms.internal.measurement.zzlv[] zzZ;
    private final int zzab;

    static {
        com.google.android.gms.internal.measurement.zzlv[] zzlvVarArrValues = values();
        zzZ = new com.google.android.gms.internal.measurement.zzlv[zzlvVarArrValues.length];
        for (com.google.android.gms.internal.measurement.zzlv zzlvVar : zzlvVarArrValues) {
            zzZ[zzlvVar.zzab] = zzlvVar;
        }
    }

    zzlv(int i, int i2, com.google.android.gms.internal.measurement.zzmn zzmnVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zzmnVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.measurement.zzmn zzmnVar2 = com.google.android.gms.internal.measurement.zzmn.VOID;
            zzmnVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}
