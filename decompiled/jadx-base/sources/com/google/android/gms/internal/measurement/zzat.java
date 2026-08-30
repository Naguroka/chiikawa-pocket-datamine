package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzat implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzap {
    private final java.lang.String zza;

    public zzat(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    static /* bridge */ /* synthetic */ java.lang.String zzb(com.google.android.gms.internal.measurement.zzat zzatVar) {
        return zzatVar.zza;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzat) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzas(this);
    }

    public final java.lang.String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:104:0x0191  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01de  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:110:0x0209  */
    /* JADX WARN: Code duplicated, block: B:112:0x021a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0234  */
    /* JADX WARN: Code duplicated, block: B:116:0x023e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0256  */
    /* JADX WARN: Code duplicated, block: B:119:0x0286  */
    /* JADX WARN: Code duplicated, block: B:121:0x0298  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:138:0x031d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0324  */
    /* JADX WARN: Code duplicated, block: B:143:0x0328 A[LOOP:0: B:142:0x0326->B:143:0x0328, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x033c  */
    /* JADX WARN: Code duplicated, block: B:147:0x034e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0362  */
    /* JADX WARN: Code duplicated, block: B:151:0x036e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0379  */
    /* JADX WARN: Code duplicated, block: B:155:0x0389  */
    /* JADX WARN: Code duplicated, block: B:156:0x039c  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0403  */
    /* JADX WARN: Code duplicated, block: B:168:0x0413  */
    /* JADX WARN: Code duplicated, block: B:169:0x0420  */
    /* JADX WARN: Code duplicated, block: B:171:0x0432  */
    /* JADX WARN: Code duplicated, block: B:173:0x0448  */
    /* JADX WARN: Code duplicated, block: B:176:0x045c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0460  */
    /* JADX WARN: Code duplicated, block: B:181:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:183:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:184:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:187:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:188:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:189:0x0501  */
    /* JADX WARN: Code duplicated, block: B:192:0x0515  */
    /* JADX WARN: Code duplicated, block: B:195:0x052b  */
    /* JADX WARN: Code duplicated, block: B:196:0x052e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0547  */
    /* JADX WARN: Code duplicated, block: B:200:0x054a  */
    /* JADX WARN: Code duplicated, block: B:202:0x055f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0574  */
    /* JADX WARN: Code duplicated, block: B:208:0x058b  */
    /* JADX WARN: Code duplicated, block: B:209:0x058d  */
    /* JADX WARN: Code duplicated, block: B:211:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:213:0x05da  */
    /* JADX WARN: Code duplicated, block: B:214:0x05de  */
    /* JADX WARN: Code duplicated, block: B:222:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:224:0x060b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0619 A[LOOP:1: B:225:0x0613->B:227:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x0639  */
    /* JADX WARN: Code duplicated, block: B:232:0x064b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0664  */
    /* JADX WARN: Code duplicated, block: B:245:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[PHI: r4
  0x00c0: PHI (r4v76 java.lang.String) = 
  (r4v5 java.lang.String)
  (r4v6 java.lang.String)
  (r4v7 java.lang.String)
  (r4v9 java.lang.String)
  (r4v10 java.lang.String)
  (r4v11 java.lang.String)
  (r4v12 java.lang.String)
  (r4v13 java.lang.String)
  (r4v15 java.lang.String)
  (r4v16 java.lang.String)
  (r4v17 java.lang.String)
  (r4v18 java.lang.String)
  (r4v19 java.lang.String)
  (r4v20 java.lang.String)
  (r4v23 java.lang.String)
  (r4v77 java.lang.String)
 binds: [B:89:0x0154, B:86:0x0146, B:257:?, B:256:?, B:255:?, B:254:?, B:253:?, B:252:?, B:251:?, B:250:?, B:249:?, B:248:?, B:247:?, B:246:?, B:245:?, B:43:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x0140  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x015d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0167  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017d A[PHI: r3 r4 r6
  0x017d: PHI (r3v61 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v62 java.lang.String) binds: [B:97:0x0179, B:95:0x016c, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r4v75 java.lang.String) = (r4v3 java.lang.String), (r4v4 java.lang.String), (r4v76 java.lang.String) binds: [B:97:0x0179, B:95:0x016c, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r6v36 java.lang.String) = (r6v1 java.lang.String), (r6v2 java.lang.String), (r6v37 java.lang.String) binds: [B:97:0x0179, B:95:0x016c, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        byte b;
        java.lang.String strZzi;
        java.lang.String str7;
        java.lang.String str8;
        int iZza;
        com.google.android.gms.internal.measurement.zzat zzatVar;
        java.lang.StringBuilder sb;
        int i;
        java.lang.String str9;
        com.google.android.gms.internal.measurement.zzap zzapVarZzb;
        int i2;
        double dDoubleValue;
        double dDoubleValue2;
        double dZza;
        java.lang.String strZzi2;
        com.google.android.gms.internal.measurement.zzap zzapVarZza;
        java.lang.String str10;
        java.lang.String str11;
        int iIndexOf;
        com.google.android.gms.internal.measurement.zzat zzatVar2;
        java.lang.String str12;
        double dDoubleValue3;
        double dZza2;
        double dMin;
        double length;
        double dZza3;
        double dMin2;
        java.lang.String str13;
        java.util.ArrayList arrayList;
        java.lang.String strZzi3;
        long jZzd;
        java.lang.String[] strArrSplit;
        int length2;
        int i3;
        int i4;
        boolean zIsEmpty;
        java.lang.String str14;
        com.google.android.gms.internal.measurement.zzg zzgVar2;
        int iZza2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str)) {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                if (!"trim".equals(str)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                    if (str.equals(str5)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    str6 = "toString";
                    if (str.equals(str6)) {
                        b = 14;
                        str5 = r4;
                    } else {
                        str5 = r4;
                        b = -1;
                    }
                    break;
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b = 12;
                        str5 = r4;
                        str6 = "toString";
                    }
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        str5 = r4;
                        str6 = "toString";
                        b = 0;
                    } else {
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                        b = 1;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b = 13;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b = 7;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b = 11;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b = 4;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals(str3)) {
                        b = 15;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        b = 16;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b = 5;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b = 8;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b = 9;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b = 10;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b = 6;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b = 3;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = "toString";
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                default:
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
            }
            strZzi = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
            str7 = str5;
            str8 = str4;
            switch (b) {
                case 0:
                    com.google.android.gms.internal.measurement.zzh.zzj(str8, 1, list);
                    if (list.isEmpty()) {
                        iZza = 0;
                    } else {
                        iZza = (int) com.google.android.gms.internal.measurement.zzh.zza(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue());
                    }
                    java.lang.String str15 = this.zza;
                    return (iZza >= 0 || iZza >= str15.length()) ? com.google.android.gms.internal.measurement.zzap.zzm : new com.google.android.gms.internal.measurement.zzat(java.lang.String.valueOf(str15.charAt(iZza)));
                case 1:
                    zzatVar = this;
                    if (!list.isEmpty()) {
                        sb = new java.lang.StringBuilder(zzatVar.zza);
                        for (i = 0; i < list.size(); i++) {
                            sb.append(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i)).zzi());
                        }
                        return new com.google.android.gms.internal.measurement.zzat(sb.toString());
                    }
                    return zzatVar;
                case 2:
                    com.google.android.gms.internal.measurement.zzh.zzh(str7, 1, list);
                    str9 = this.zza;
                    zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
                    if ("length".equals(zzapVarZzb.zzi())) {
                        return com.google.android.gms.internal.measurement.zzaf.zzk;
                    }
                    double dDoubleValue4 = zzapVarZzb.zzh().doubleValue();
                    return (dDoubleValue4 == java.lang.Math.floor(dDoubleValue4) || (i2 = (int) dDoubleValue4) < 0 || i2 >= str9.length()) ? com.google.android.gms.internal.measurement.zzaf.zzl : com.google.android.gms.internal.measurement.zzaf.zzk;
                case 3:
                    com.google.android.gms.internal.measurement.zzh.zzj("indexOf", 2, list);
                    java.lang.String str16 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                    }
                    java.lang.String str17 = strZzi;
                    if (list.size() < 2) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue();
                    }
                    return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(str16.indexOf(str17, (int) com.google.android.gms.internal.measurement.zzh.zza(dDoubleValue))));
                case 4:
                    com.google.android.gms.internal.measurement.zzh.zzj("lastIndexOf", 2, list);
                    java.lang.String str18 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                    }
                    java.lang.String str19 = strZzi;
                    if (list.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue();
                    }
                    if (java.lang.Double.isNaN(dDoubleValue2)) {
                        dZza = Double.POSITIVE_INFINITY;
                    } else {
                        dZza = com.google.android.gms.internal.measurement.zzh.zza(dDoubleValue2);
                    }
                    return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(str18.lastIndexOf(str19, (int) dZza)));
                case 5:
                    com.google.android.gms.internal.measurement.zzh.zzj("match", 1, list);
                    java.lang.String str20 = this.zza;
                    if (list.size() <= 0) {
                        strZzi2 = "";
                    } else {
                        strZzi2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                    }
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(strZzi2).matcher(str20);
                    return matcher.find() ? new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzat(matcher.group()))) : com.google.android.gms.internal.measurement.zzap.zzg;
                case 6:
                    zzatVar = this;
                    com.google.android.gms.internal.measurement.zzh.zzj("replace", 2, list);
                    zzapVarZza = com.google.android.gms.internal.measurement.zzap.zzf;
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            zzapVarZza = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
                        }
                    }
                    str10 = strZzi;
                    str11 = zzatVar.zza;
                    iIndexOf = str11.indexOf(str10);
                    if (iIndexOf >= 0) {
                        if (zzapVarZza instanceof com.google.android.gms.internal.measurement.zzai) {
                            zzapVarZza = ((com.google.android.gms.internal.measurement.zzai) zzapVarZza).zza(zzgVar, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzat(str10), new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(iIndexOf)), zzatVar));
                        }
                        zzatVar2 = new com.google.android.gms.internal.measurement.zzat(str11.substring(0, iIndexOf) + zzapVarZza.zzi() + str11.substring(iIndexOf + str10.length()));
                        return zzatVar2;
                    }
                    return zzatVar;
                case 7:
                    com.google.android.gms.internal.measurement.zzh.zzj("search", 1, list);
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                    }
                    java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile(strZzi).matcher(this.zza);
                    return matcher2.find() ? new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(matcher2.start())) : new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
                case 8:
                    com.google.android.gms.internal.measurement.zzh.zzj("slice", 2, list);
                    str12 = this.zza;
                    if (list.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue();
                    }
                    dZza2 = com.google.android.gms.internal.measurement.zzh.zza(dDoubleValue3);
                    if (dZza2 < 0.0d) {
                        dMin = java.lang.Math.max(((double) str12.length()) + dZza2, 0.0d);
                    } else {
                        dMin = java.lang.Math.min(dZza2, str12.length());
                    }
                    if (list.size() > 1) {
                        length = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue();
                    } else {
                        length = str12.length();
                    }
                    dZza3 = com.google.android.gms.internal.measurement.zzh.zza(length);
                    if (dZza3 < 0.0d) {
                        dMin2 = java.lang.Math.max(((double) str12.length()) + dZza3, 0.0d);
                    } else {
                        dMin2 = java.lang.Math.min(dZza3, str12.length());
                    }
                    int i5 = (int) dMin;
                    return new com.google.android.gms.internal.measurement.zzat(str12.substring(i5, java.lang.Math.max(0, ((int) dMin2) - i5) + i5));
                case 9:
                    com.google.android.gms.internal.measurement.zzh.zzj("split", 2, list);
                    str13 = this.zza;
                    if (str13.length() == 0) {
                        return new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(this));
                    }
                    arrayList = new java.util.ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzi3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            jZzd = com.google.android.gms.internal.measurement.zzh.zzd(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue());
                        } else {
                            jZzd = 2147483647L;
                        }
                        if (jZzd == 0) {
                            return new com.google.android.gms.internal.measurement.zzae();
                        }
                        strArrSplit = str13.split(java.util.regex.Pattern.quote(strZzi3), ((int) jZzd) + 1);
                        length2 = strArrSplit.length;
                        if (strZzi3.isEmpty() || length2 <= 0) {
                            i3 = length2;
                            i4 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i3 = length2 - 1;
                            if (!strArrSplit[i3].isEmpty()) {
                                i4 = zIsEmpty;
                                i3 = length2;
                                i4 = zIsEmpty;
                            }
                        }
                        i4 = zIsEmpty;
                        if (length2 > jZzd) {
                            i3--;
                        }
                        while (i4 < i3) {
                            arrayList.add(new com.google.android.gms.internal.measurement.zzat(strArrSplit[i4]));
                            i4++;
                        }
                    }
                    return new com.google.android.gms.internal.measurement.zzae(arrayList);
                case 10:
                    com.google.android.gms.internal.measurement.zzh.zzj("substring", 2, list);
                    str14 = this.zza;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZza2 = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZza2 = (int) com.google.android.gms.internal.measurement.zzh.zza(zzgVar2.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) com.google.android.gms.internal.measurement.zzh.zza(zzgVar2.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        length3 = str14.length();
                    }
                    int iMin = java.lang.Math.min(java.lang.Math.max(iZza2, 0), str14.length());
                    int iMin2 = java.lang.Math.min(java.lang.Math.max(length3, 0), str14.length());
                    zzatVar2 = new com.google.android.gms.internal.measurement.zzat(str14.substring(java.lang.Math.min(iMin, iMin2), java.lang.Math.max(iMin, iMin2)));
                    return zzatVar2;
                case 11:
                    com.google.android.gms.internal.measurement.zzh.zzh(str2, 0, list);
                    return new com.google.android.gms.internal.measurement.zzat(this.zza.toUpperCase());
                case 12:
                    com.google.android.gms.internal.measurement.zzh.zzh("toLocaleLowerCase", 0, list);
                    return new com.google.android.gms.internal.measurement.zzat(this.zza.toLowerCase());
                case 13:
                    com.google.android.gms.internal.measurement.zzh.zzh("toLowerCase", 0, list);
                    return new com.google.android.gms.internal.measurement.zzat(this.zza.toLowerCase(java.util.Locale.ENGLISH));
                case 14:
                    zzatVar = this;
                    com.google.android.gms.internal.measurement.zzh.zzh(str6, 0, list);
                    return zzatVar;
                case 15:
                    com.google.android.gms.internal.measurement.zzh.zzh(str3, 0, list);
                    return new com.google.android.gms.internal.measurement.zzat(this.zza.toUpperCase(java.util.Locale.ENGLISH));
                case 16:
                    com.google.android.gms.internal.measurement.zzh.zzh(str3, 0, list);
                    return new com.google.android.gms.internal.measurement.zzat(this.zza.trim());
                default:
                    throw new java.lang.IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "toUpperCase";
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = r4;
                str6 = "toString";
                if (str.equals(str5)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                str6 = "toString";
                if (str.equals(str6)) {
                    b = 14;
                    str5 = r4;
                } else {
                    str5 = r4;
                    b = -1;
                }
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str5 = r4;
                    str6 = "toString";
                }
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str5 = r4;
                    str6 = "toString";
                    b = 0;
                } else {
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                    b = 1;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b = 11;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -399551817:
                if (str.equals(str3)) {
                    b = 15;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b = 16;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 3;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = "toString";
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            default:
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
        }
        strZzi = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
        str7 = str5;
        str8 = str4;
        switch (b) {
            case 0:
                com.google.android.gms.internal.measurement.zzh.zzj(str8, 1, list);
                if (list.isEmpty()) {
                    iZza = (int) com.google.android.gms.internal.measurement.zzh.zza(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue());
                } else {
                    iZza = 0;
                }
                java.lang.String str110 = this.zza;
                if (iZza >= 0) {
                }
                break;
            case 1:
                zzatVar = this;
                if (!list.isEmpty()) {
                    sb = new java.lang.StringBuilder(zzatVar.zza);
                    while (i < list.size()) {
                        sb.append(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i)).zzi());
                    }
                    return new com.google.android.gms.internal.measurement.zzat(sb.toString());
                }
                return zzatVar;
            case 2:
                com.google.android.gms.internal.measurement.zzh.zzh(str7, 1, list);
                str9 = this.zza;
                zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    return com.google.android.gms.internal.measurement.zzaf.zzk;
                }
                double dDoubleValue5 = zzapVarZzb.zzh().doubleValue();
                if (dDoubleValue5 == java.lang.Math.floor(dDoubleValue5)) {
                }
                break;
            case 3:
                com.google.android.gms.internal.measurement.zzh.zzj("indexOf", 2, list);
                java.lang.String str111 = this.zza;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                }
                java.lang.String str112 = strZzi;
                if (list.size() < 2) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue();
                }
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(str111.indexOf(str112, (int) com.google.android.gms.internal.measurement.zzh.zza(dDoubleValue))));
            case 4:
                com.google.android.gms.internal.measurement.zzh.zzj("lastIndexOf", 2, list);
                java.lang.String str113 = this.zza;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                }
                java.lang.String str114 = strZzi;
                if (list.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue();
                }
                if (java.lang.Double.isNaN(dDoubleValue2)) {
                    dZza = Double.POSITIVE_INFINITY;
                } else {
                    dZza = com.google.android.gms.internal.measurement.zzh.zza(dDoubleValue2);
                }
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(str113.lastIndexOf(str114, (int) dZza)));
            case 5:
                com.google.android.gms.internal.measurement.zzh.zzj("match", 1, list);
                java.lang.String str21 = this.zza;
                if (list.size() <= 0) {
                    strZzi2 = "";
                } else {
                    strZzi2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                }
                java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile(strZzi2).matcher(str21);
                if (matcher3.find()) {
                }
            case 6:
                zzatVar = this;
                com.google.android.gms.internal.measurement.zzh.zzj("replace", 2, list);
                zzapVarZza = com.google.android.gms.internal.measurement.zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
                    }
                }
                str10 = strZzi;
                str11 = zzatVar.zza;
                iIndexOf = str11.indexOf(str10);
                if (iIndexOf >= 0) {
                    if (zzapVarZza instanceof com.google.android.gms.internal.measurement.zzai) {
                        zzapVarZza = ((com.google.android.gms.internal.measurement.zzai) zzapVarZza).zza(zzgVar, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzat(str10), new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(iIndexOf)), zzatVar));
                    }
                    zzatVar2 = new com.google.android.gms.internal.measurement.zzat(str11.substring(0, iIndexOf) + zzapVarZza.zzi() + str11.substring(iIndexOf + str10.length()));
                    return zzatVar2;
                }
                return zzatVar;
            case 7:
                com.google.android.gms.internal.measurement.zzh.zzj("search", 1, list);
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                }
                java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile(strZzi).matcher(this.zza);
                if (matcher4.find()) {
                }
            case 8:
                com.google.android.gms.internal.measurement.zzh.zzj("slice", 2, list);
                str12 = this.zza;
                if (list.isEmpty()) {
                    dDoubleValue3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dZza2 = com.google.android.gms.internal.measurement.zzh.zza(dDoubleValue3);
                if (dZza2 < 0.0d) {
                    dMin = java.lang.Math.max(((double) str12.length()) + dZza2, 0.0d);
                } else {
                    dMin = java.lang.Math.min(dZza2, str12.length());
                }
                if (list.size() > 1) {
                    length = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue();
                } else {
                    length = str12.length();
                }
                dZza3 = com.google.android.gms.internal.measurement.zzh.zza(length);
                if (dZza3 < 0.0d) {
                    dMin2 = java.lang.Math.max(((double) str12.length()) + dZza3, 0.0d);
                } else {
                    dMin2 = java.lang.Math.min(dZza3, str12.length());
                }
                int i6 = (int) dMin;
                return new com.google.android.gms.internal.measurement.zzat(str12.substring(i6, java.lang.Math.max(0, ((int) dMin2) - i6) + i6));
            case 9:
                com.google.android.gms.internal.measurement.zzh.zzj("split", 2, list);
                str13 = this.zza;
                if (str13.length() == 0) {
                    return new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(this));
                }
                arrayList = new java.util.ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzi3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        jZzd = com.google.android.gms.internal.measurement.zzh.zzd(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        jZzd = 2147483647L;
                    }
                    if (jZzd == 0) {
                        return new com.google.android.gms.internal.measurement.zzae();
                    }
                    strArrSplit = str13.split(java.util.regex.Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    length2 = strArrSplit.length;
                    if (strZzi3.isEmpty()) {
                        i3 = length2;
                        i4 = 0;
                    } else {
                        i3 = length2;
                        i4 = 0;
                    }
                    i4 = zIsEmpty;
                    if (length2 > jZzd) {
                        i3--;
                    }
                    while (i4 < i3) {
                        arrayList.add(new com.google.android.gms.internal.measurement.zzat(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new com.google.android.gms.internal.measurement.zzae(arrayList);
            case 10:
                com.google.android.gms.internal.measurement.zzh.zzj("substring", 2, list);
                str14 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza2 = (int) com.google.android.gms.internal.measurement.zzh.zza(zzgVar2.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZza2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) com.google.android.gms.internal.measurement.zzh.zza(zzgVar2.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue());
                } else {
                    length3 = str14.length();
                }
                int iMin3 = java.lang.Math.min(java.lang.Math.max(iZza2, 0), str14.length());
                int iMin4 = java.lang.Math.min(java.lang.Math.max(length3, 0), str14.length());
                zzatVar2 = new com.google.android.gms.internal.measurement.zzat(str14.substring(java.lang.Math.min(iMin3, iMin4), java.lang.Math.max(iMin3, iMin4)));
                return zzatVar2;
            case 11:
                com.google.android.gms.internal.measurement.zzh.zzh(str2, 0, list);
                return new com.google.android.gms.internal.measurement.zzat(this.zza.toUpperCase());
            case 12:
                com.google.android.gms.internal.measurement.zzh.zzh("toLocaleLowerCase", 0, list);
                return new com.google.android.gms.internal.measurement.zzat(this.zza.toLowerCase());
            case 13:
                com.google.android.gms.internal.measurement.zzh.zzh("toLowerCase", 0, list);
                return new com.google.android.gms.internal.measurement.zzat(this.zza.toLowerCase(java.util.Locale.ENGLISH));
            case 14:
                zzatVar = this;
                com.google.android.gms.internal.measurement.zzh.zzh(str6, 0, list);
                return zzatVar;
            case 15:
                com.google.android.gms.internal.measurement.zzh.zzh(str3, 0, list);
                return new com.google.android.gms.internal.measurement.zzat(this.zza.toUpperCase(java.util.Locale.ENGLISH));
            case 16:
                com.google.android.gms.internal.measurement.zzh.zzh(str3, 0, list);
                return new com.google.android.gms.internal.measurement.zzat(this.zza.trim());
            default:
                throw new java.lang.IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        return new com.google.android.gms.internal.measurement.zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        return java.lang.Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        java.lang.String str = this.zza;
        if (str.isEmpty()) {
            return java.lang.Double.valueOf(0.0d);
        }
        try {
            return java.lang.Double.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return java.lang.Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return new com.google.android.gms.internal.measurement.zzar(this);
    }
}
