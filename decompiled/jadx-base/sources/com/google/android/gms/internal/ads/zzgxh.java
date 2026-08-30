package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzgxh {
    DOUBLE(0, 1, com.google.android.gms.internal.ads.zzgyi.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.ads.zzgyi.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.ads.zzgyi.LONG),
    UINT64(3, 1, com.google.android.gms.internal.ads.zzgyi.LONG),
    INT32(4, 1, com.google.android.gms.internal.ads.zzgyi.INT),
    FIXED64(5, 1, com.google.android.gms.internal.ads.zzgyi.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.ads.zzgyi.INT),
    BOOL(7, 1, com.google.android.gms.internal.ads.zzgyi.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.ads.zzgyi.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.ads.zzgyi.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.ads.zzgyi.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.ads.zzgyi.INT),
    ENUM(12, 1, com.google.android.gms.internal.ads.zzgyi.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.ads.zzgyi.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.ads.zzgyi.LONG),
    SINT32(15, 1, com.google.android.gms.internal.ads.zzgyi.INT),
    SINT64(16, 1, com.google.android.gms.internal.ads.zzgyi.LONG),
    GROUP(17, 1, com.google.android.gms.internal.ads.zzgyi.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.ads.zzgyi.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.ads.zzgyi.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.ads.zzgyi.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.ads.zzgyi.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.ads.zzgyi.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.ads.zzgyi.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.ads.zzgyi.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.ads.zzgyi.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.ads.zzgyi.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.ads.zzgyi.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.ads.zzgyi.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.ads.zzgyi.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.ads.zzgyi.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.ads.zzgyi.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.ads.zzgyi.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.ads.zzgyi.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.ads.zzgyi.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.ads.zzgyi.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.ads.zzgyi.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.ads.zzgyi.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.ads.zzgyi.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.ads.zzgyi.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.ads.zzgyi.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.ads.zzgyi.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.ads.zzgyi.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.ads.zzgyi.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.ads.zzgyi.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.ads.zzgyi.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.ads.zzgyi.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.ads.zzgyi.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.ads.zzgyi.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.ads.zzgyi.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.ads.zzgyi.VOID);

    private static final com.google.android.gms.internal.ads.zzgxh[] zzZ;
    private final int zzab;

    static {
        com.google.android.gms.internal.ads.zzgxh[] zzgxhVarArrValues = values();
        zzZ = new com.google.android.gms.internal.ads.zzgxh[zzgxhVarArrValues.length];
        for (com.google.android.gms.internal.ads.zzgxh zzgxhVar : zzgxhVarArrValues) {
            zzZ[zzgxhVar.zzab] = zzgxhVar;
        }
    }

    zzgxh(int i, int i2, com.google.android.gms.internal.ads.zzgyi zzgyiVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zzgyiVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.ads.zzgyi zzgyiVar2 = com.google.android.gms.internal.ads.zzgyi.VOID;
            zzgyiVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}
