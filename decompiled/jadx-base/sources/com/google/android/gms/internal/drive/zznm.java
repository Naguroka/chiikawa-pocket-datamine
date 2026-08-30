package com.google.android.gms.internal.drive;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzxc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public class zznm {
    public static final com.google.android.gms.internal.drive.zznm zzwu;
    public static final com.google.android.gms.internal.drive.zznm zzwv;
    public static final com.google.android.gms.internal.drive.zznm zzww;
    public static final com.google.android.gms.internal.drive.zznm zzwx;
    public static final com.google.android.gms.internal.drive.zznm zzwy;
    public static final com.google.android.gms.internal.drive.zznm zzwz;
    public static final com.google.android.gms.internal.drive.zznm zzxa;
    public static final com.google.android.gms.internal.drive.zznm zzxb;
    public static final com.google.android.gms.internal.drive.zznm zzxc;
    public static final com.google.android.gms.internal.drive.zznm zzxd;
    public static final com.google.android.gms.internal.drive.zznm zzxe;
    public static final com.google.android.gms.internal.drive.zznm zzxf;
    public static final com.google.android.gms.internal.drive.zznm zzxg;
    public static final com.google.android.gms.internal.drive.zznm zzxh;
    public static final com.google.android.gms.internal.drive.zznm zzxi;
    public static final com.google.android.gms.internal.drive.zznm zzxj;
    public static final com.google.android.gms.internal.drive.zznm zzxk;
    public static final com.google.android.gms.internal.drive.zznm zzxl;
    private static final /* synthetic */ com.google.android.gms.internal.drive.zznm[] zzxo;
    private final com.google.android.gms.internal.drive.zznr zzxm;
    private final int zzxn;

    public static com.google.android.gms.internal.drive.zznm[] values() {
        return (com.google.android.gms.internal.drive.zznm[]) zzxo.clone();
    }

    private zznm(java.lang.String str, int i, com.google.android.gms.internal.drive.zznr zznrVar, int i2) {
        super(str, i);
        this.zzxm = zznrVar;
        this.zzxn = i2;
    }

    public final com.google.android.gms.internal.drive.zznr zzfj() {
        return this.zzxm;
    }

    public final int zzfk() {
        return this.zzxn;
    }

    /* synthetic */ zznm(java.lang.String str, int i, com.google.android.gms.internal.drive.zznr zznrVar, int i2, com.google.android.gms.internal.drive.zznl zznlVar) {
        this(str, i, zznrVar, i2);
    }

    static {
        com.google.android.gms.internal.drive.zznm zznmVar = new com.google.android.gms.internal.drive.zznm("DOUBLE", 0, com.google.android.gms.internal.drive.zznr.DOUBLE, 1);
        zzwu = zznmVar;
        com.google.android.gms.internal.drive.zznm zznmVar2 = new com.google.android.gms.internal.drive.zznm("FLOAT", 1, com.google.android.gms.internal.drive.zznr.FLOAT, 5);
        zzwv = zznmVar2;
        final int i = 2;
        com.google.android.gms.internal.drive.zznm zznmVar3 = new com.google.android.gms.internal.drive.zznm("INT64", 2, com.google.android.gms.internal.drive.zznr.LONG, 0);
        zzww = zznmVar3;
        final int i2 = 3;
        com.google.android.gms.internal.drive.zznm zznmVar4 = new com.google.android.gms.internal.drive.zznm("UINT64", 3, com.google.android.gms.internal.drive.zznr.LONG, 0);
        zzwx = zznmVar4;
        com.google.android.gms.internal.drive.zznm zznmVar5 = new com.google.android.gms.internal.drive.zznm("INT32", 4, com.google.android.gms.internal.drive.zznr.INT, 0);
        zzwy = zznmVar5;
        com.google.android.gms.internal.drive.zznm zznmVar6 = new com.google.android.gms.internal.drive.zznm("FIXED64", 5, com.google.android.gms.internal.drive.zznr.LONG, 1);
        zzwz = zznmVar6;
        com.google.android.gms.internal.drive.zznm zznmVar7 = new com.google.android.gms.internal.drive.zznm("FIXED32", 6, com.google.android.gms.internal.drive.zznr.INT, 5);
        zzxa = zznmVar7;
        com.google.android.gms.internal.drive.zznm zznmVar8 = new com.google.android.gms.internal.drive.zznm("BOOL", 7, com.google.android.gms.internal.drive.zznr.BOOLEAN, 0);
        zzxb = zznmVar8;
        final com.google.android.gms.internal.drive.zznr zznrVar = com.google.android.gms.internal.drive.zznr.STRING;
        final java.lang.String str = "STRING";
        final int i3 = 8;
        com.google.android.gms.internal.drive.zznm zznmVar9 = new com.google.android.gms.internal.drive.zznm(str, i3, zznrVar, i) { // from class: com.google.android.gms.internal.drive.zznn
            {
                int i4 = 8;
                int i5 = 2;
                com.google.android.gms.internal.drive.zznl zznlVar = null;
            }
        };
        zzxc = zznmVar9;
        final com.google.android.gms.internal.drive.zznr zznrVar2 = com.google.android.gms.internal.drive.zznr.MESSAGE;
        final java.lang.String str2 = "GROUP";
        final int i4 = 9;
        com.google.android.gms.internal.drive.zznm zznmVar10 = new com.google.android.gms.internal.drive.zznm(str2, i4, zznrVar2, i2) { // from class: com.google.android.gms.internal.drive.zzno
            {
                int i5 = 9;
                int i6 = 3;
                com.google.android.gms.internal.drive.zznl zznlVar = null;
            }
        };
        zzxd = zznmVar10;
        final com.google.android.gms.internal.drive.zznr zznrVar3 = com.google.android.gms.internal.drive.zznr.MESSAGE;
        final java.lang.String str3 = "MESSAGE";
        final int i5 = 10;
        com.google.android.gms.internal.drive.zznm zznmVar11 = new com.google.android.gms.internal.drive.zznm(str3, i5, zznrVar3, i) { // from class: com.google.android.gms.internal.drive.zznp
            {
                int i6 = 10;
                int i7 = 2;
                com.google.android.gms.internal.drive.zznl zznlVar = null;
            }
        };
        zzxe = zznmVar11;
        final com.google.android.gms.internal.drive.zznr zznrVar4 = com.google.android.gms.internal.drive.zznr.BYTE_STRING;
        final java.lang.String str4 = "BYTES";
        final int i6 = 11;
        com.google.android.gms.internal.drive.zznm zznmVar12 = new com.google.android.gms.internal.drive.zznm(str4, i6, zznrVar4, i) { // from class: com.google.android.gms.internal.drive.zznq
            {
                int i7 = 11;
                int i8 = 2;
                com.google.android.gms.internal.drive.zznl zznlVar = null;
            }
        };
        zzxf = zznmVar12;
        com.google.android.gms.internal.drive.zznm zznmVar13 = new com.google.android.gms.internal.drive.zznm("UINT32", 12, com.google.android.gms.internal.drive.zznr.INT, 0);
        zzxg = zznmVar13;
        com.google.android.gms.internal.drive.zznm zznmVar14 = new com.google.android.gms.internal.drive.zznm("ENUM", 13, com.google.android.gms.internal.drive.zznr.ENUM, 0);
        zzxh = zznmVar14;
        com.google.android.gms.internal.drive.zznm zznmVar15 = new com.google.android.gms.internal.drive.zznm("SFIXED32", 14, com.google.android.gms.internal.drive.zznr.INT, 5);
        zzxi = zznmVar15;
        com.google.android.gms.internal.drive.zznm zznmVar16 = new com.google.android.gms.internal.drive.zznm("SFIXED64", 15, com.google.android.gms.internal.drive.zznr.LONG, 1);
        zzxj = zznmVar16;
        com.google.android.gms.internal.drive.zznm zznmVar17 = new com.google.android.gms.internal.drive.zznm("SINT32", 16, com.google.android.gms.internal.drive.zznr.INT, 0);
        zzxk = zznmVar17;
        com.google.android.gms.internal.drive.zznm zznmVar18 = new com.google.android.gms.internal.drive.zznm("SINT64", 17, com.google.android.gms.internal.drive.zznr.LONG, 0);
        zzxl = zznmVar18;
        zzxo = new com.google.android.gms.internal.drive.zznm[]{zznmVar, zznmVar2, zznmVar3, zznmVar4, zznmVar5, zznmVar6, zznmVar7, zznmVar8, zznmVar9, zznmVar10, zznmVar11, zznmVar12, zznmVar13, zznmVar14, zznmVar15, zznmVar16, zznmVar17, zznmVar18};
    }
}
