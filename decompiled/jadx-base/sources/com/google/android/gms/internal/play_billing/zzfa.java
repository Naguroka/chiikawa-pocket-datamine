package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzfa {
    DOUBLE(0, 1, com.google.android.gms.internal.play_billing.zzfr.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.play_billing.zzfr.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.play_billing.zzfr.LONG),
    UINT64(3, 1, com.google.android.gms.internal.play_billing.zzfr.LONG),
    INT32(4, 1, com.google.android.gms.internal.play_billing.zzfr.INT),
    FIXED64(5, 1, com.google.android.gms.internal.play_billing.zzfr.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.play_billing.zzfr.INT),
    BOOL(7, 1, com.google.android.gms.internal.play_billing.zzfr.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.play_billing.zzfr.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.play_billing.zzfr.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.play_billing.zzfr.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.play_billing.zzfr.INT),
    ENUM(12, 1, com.google.android.gms.internal.play_billing.zzfr.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.play_billing.zzfr.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.play_billing.zzfr.LONG),
    SINT32(15, 1, com.google.android.gms.internal.play_billing.zzfr.INT),
    SINT64(16, 1, com.google.android.gms.internal.play_billing.zzfr.LONG),
    GROUP(17, 1, com.google.android.gms.internal.play_billing.zzfr.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.play_billing.zzfr.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.play_billing.zzfr.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.play_billing.zzfr.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.play_billing.zzfr.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.play_billing.zzfr.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.play_billing.zzfr.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.play_billing.zzfr.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.play_billing.zzfr.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.play_billing.zzfr.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.play_billing.zzfr.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.play_billing.zzfr.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.play_billing.zzfr.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.play_billing.zzfr.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.play_billing.zzfr.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.play_billing.zzfr.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.play_billing.zzfr.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.play_billing.zzfr.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.play_billing.zzfr.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.play_billing.zzfr.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.play_billing.zzfr.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.play_billing.zzfr.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.play_billing.zzfr.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.play_billing.zzfr.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.play_billing.zzfr.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.play_billing.zzfr.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.play_billing.zzfr.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.play_billing.zzfr.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.play_billing.zzfr.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.play_billing.zzfr.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.play_billing.zzfr.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.play_billing.zzfr.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.play_billing.zzfr.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.play_billing.zzfr.VOID);

    private static final com.google.android.gms.internal.play_billing.zzfa[] zzZ;
    private final int zzab;

    static {
        com.google.android.gms.internal.play_billing.zzfa[] zzfaVarArrValues = values();
        zzZ = new com.google.android.gms.internal.play_billing.zzfa[zzfaVarArrValues.length];
        for (com.google.android.gms.internal.play_billing.zzfa zzfaVar : zzfaVarArrValues) {
            zzZ[zzfaVar.zzab] = zzfaVar;
        }
    }

    zzfa(int i, int i2, com.google.android.gms.internal.play_billing.zzfr zzfrVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zzfrVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.play_billing.zzfr zzfrVar2 = com.google.android.gms.internal.play_billing.zzfr.VOID;
            zzfrVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}
