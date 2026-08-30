package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzei {
    public static final int zza;
    public static final java.lang.String zzb;
    public static final java.lang.String zzc;
    public static final java.lang.String zzd;
    public static final java.lang.String zze;
    public static final byte[] zzf;
    private static final java.util.regex.Pattern zzg;
    private static java.util.HashMap zzh;
    private static final java.lang.String[] zzi;
    private static final java.lang.String[] zzj;
    private static final int[] zzk;
    private static final int[] zzl;
    private static final int[] zzm;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        zza = i;
        java.lang.String str = android.os.Build.DEVICE;
        zzb = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        zzc = str2;
        java.lang.String str3 = android.os.Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i;
        zzf = new byte[0];
        zzg = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzi = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzj = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzk = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzl = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzm = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, org.objectweb.asm.Opcodes.MONITOREXIT, com.ironsource.g3.c.b.c, com.ironsource.g3.c.b.f, org.objectweb.asm.Opcodes.D2F, org.objectweb.asm.Opcodes.DCMPL, 158, 153, 140, 139, 130, org.objectweb.asm.Opcodes.I2L, org.objectweb.asm.Opcodes.JSR, org.objectweb.asm.Opcodes.DRETURN, org.objectweb.asm.Opcodes.IF_ACMPNE, org.objectweb.asm.Opcodes.IF_ICMPLT, org.objectweb.asm.Opcodes.GETFIELD, org.objectweb.asm.Opcodes.PUTSTATIC, org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 189, org.objectweb.asm.Opcodes.IFNONNULL, 192, com.ironsource.g3.c.b.b, com.ironsource.g3.c.b.g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, org.objectweb.asm.Opcodes.INVOKESPECIAL, org.objectweb.asm.Opcodes.ARETURN, org.objectweb.asm.Opcodes.INVOKEINTERFACE, org.objectweb.asm.Opcodes.ARRAYLENGTH, org.objectweb.asm.Opcodes.LOOKUPSWITCH, 172, org.objectweb.asm.Opcodes.IF_ACMPEQ, org.objectweb.asm.Opcodes.IF_ICMPGE, org.objectweb.asm.Opcodes.D2L, 136, 129, 134, org.objectweb.asm.Opcodes.I2S, org.objectweb.asm.Opcodes.LCMP, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, org.objectweb.asm.Opcodes.L2F, org.objectweb.asm.Opcodes.D2I, 135, 128, org.objectweb.asm.Opcodes.FCMPL, org.objectweb.asm.Opcodes.I2C, 155, 156, org.objectweb.asm.Opcodes.RETURN, org.objectweb.asm.Opcodes.INVOKEVIRTUAL, org.objectweb.asm.Opcodes.ATHROW, org.objectweb.asm.Opcodes.INVOKESTATIC, org.objectweb.asm.Opcodes.LRETURN, org.objectweb.asm.Opcodes.TABLESWITCH, org.objectweb.asm.Opcodes.IF_ICMPGT, org.objectweb.asm.Opcodes.IF_ICMPLE, 249, 254, 247, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, org.objectweb.asm.Opcodes.INSTANCEOF, org.objectweb.asm.Opcodes.IFNULL, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, org.objectweb.asm.Opcodes.FRETURN, org.objectweb.asm.Opcodes.RET, org.objectweb.asm.Opcodes.IF_ICMPNE, org.objectweb.asm.Opcodes.GOTO, org.objectweb.asm.Opcodes.GETSTATIC, org.objectweb.asm.Opcodes.PUTFIELD, 188, org.objectweb.asm.Opcodes.NEW, 150, org.objectweb.asm.Opcodes.I2B, org.objectweb.asm.Opcodes.DCMPG, org.objectweb.asm.Opcodes.IF_ICMPEQ, 138, 141, org.objectweb.asm.Opcodes.IINC, org.objectweb.asm.Opcodes.LXOR, 222, 217, 208, 215, org.objectweb.asm.Opcodes.MONITORENTER, org.objectweb.asm.Opcodes.MULTIANEWARRAY, 204, com.ironsource.g3.c.b.d, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static com.google.android.gms.internal.ads.zzab zzA(int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_RAW);
        zzzVar.zzz(i2);
        zzzVar.zzab(i3);
        zzzVar.zzU(i);
        return zzzVar.zzag();
    }

    public static java.lang.String zzB(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String zzC(byte[] bArr, int i, int i2) {
        return new java.lang.String(bArr, i, i2, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String zzD(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA;
            default:
                return "camera motion";
        }
    }

    public static java.lang.String zzE(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strReplace = str.replace('_', org.objectweb.asm.signature.SignatureVisitor.SUPER);
        if (!strReplace.isEmpty() && !strReplace.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        java.lang.String strZza = com.google.android.gms.internal.ads.zzftt.zza(str);
        int i = 0;
        java.lang.String str2 = strZza.split("-", 2)[0];
        if (zzh == null) {
            zzh = zzR();
        }
        java.lang.String str3 = (java.lang.String) zzh.get(str2);
        if (str3 != null) {
            strZza = str3.concat(java.lang.String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) && !"zh".equals(str2)) {
            return strZza;
        }
        while (true) {
            java.lang.String[] strArr = zzj;
            int length = strArr.length;
            if (i >= 18) {
                return strZza;
            }
            if (strZza.startsWith(strArr[i])) {
                return java.lang.String.valueOf(strArr[i + 1]).concat(java.lang.String.valueOf(strZza.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    public static boolean zzG(android.util.SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static boolean zzH(com.google.android.gms.internal.ads.zzdy zzdyVar, com.google.android.gms.internal.ads.zzdy zzdyVar2, java.util.zip.Inflater inflater) {
        boolean z = false;
        if (zzdyVar.zzb() <= 0) {
            return false;
        }
        if (zzdyVar2.zzc() < zzdyVar.zzb()) {
            int iZzb = zzdyVar.zzb();
            zzdyVar2.zzF(iZzb + iZzb);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(zzdyVar.zzN(), zzdyVar.zzd(), zzdyVar.zzb());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zzdyVar2.zzN(), iInflate, zzdyVar2.zzc() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == zzdyVar2.zzc()) {
                        int iZzc = zzdyVar2.zzc();
                        zzdyVar2.zzF(iZzc + iZzc);
                    }
                } else {
                    zzdyVar2.zzK(iInflate);
                    z = true;
                    break;
                }
            } catch (java.util.zip.DataFormatException unused) {
            } catch (java.lang.Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z;
    }

    public static boolean zzI(android.content.Context context) {
        return zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzJ(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean zzK(android.content.Context context) {
        int i = zza;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            java.lang.String str = zzd;
            if (com.google.android.gms.internal.ads.zzftt.zzc(str, "moto g(20)") || com.google.android.gms.internal.ads.zzftt.zzc(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && com.google.android.gms.internal.ads.zzftt.zzc(zzd, "sm-x200");
    }

    public static boolean zzL(int i) {
        return i == 10 || i == 13;
    }

    public static boolean zzM(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static java.lang.Object[] zzN(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.ads.zzcw.zzd(i <= objArr.length);
        return java.util.Arrays.copyOf(objArr, i);
    }

    private static int zzO(int i, int i2) {
        return (char) (zzl[i ^ (i2 >> 12)] ^ ((char) (i2 << 4)));
    }

    private static long zzP(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        long jZzd = com.google.android.gms.internal.ads.zzgal.zzd(j, j2);
        if (jZzd != Long.MAX_VALUE && jZzd != Long.MIN_VALUE) {
            return com.google.android.gms.internal.ads.zzgal.zzb(jZzd, j3, roundingMode);
        }
        long jZzc = com.google.android.gms.internal.ads.zzgal.zzc(java.lang.Math.abs(j2), java.lang.Math.abs(j3));
        long jZzb = com.google.android.gms.internal.ads.zzgal.zzb(j2, jZzc, java.math.RoundingMode.UNNECESSARY);
        long jZzb2 = com.google.android.gms.internal.ads.zzgal.zzb(j3, jZzc, java.math.RoundingMode.UNNECESSARY);
        long jZzc2 = com.google.android.gms.internal.ads.zzgal.zzc(java.lang.Math.abs(j), java.lang.Math.abs(jZzb2));
        long jZzb3 = com.google.android.gms.internal.ads.zzgal.zzb(j, jZzc2, java.math.RoundingMode.UNNECESSARY);
        long jZzb4 = com.google.android.gms.internal.ads.zzgal.zzb(jZzb2, jZzc2, java.math.RoundingMode.UNNECESSARY);
        long jZzd2 = com.google.android.gms.internal.ads.zzgal.zzd(jZzb3, jZzb);
        if (jZzd2 != Long.MAX_VALUE && jZzd2 != Long.MIN_VALUE) {
            return com.google.android.gms.internal.ads.zzgal.zzb(jZzd2, jZzb4, roundingMode);
        }
        double d = jZzb3 * (jZzb / jZzb4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.android.gms.internal.ads.zzgag.zzb(d, roundingMode);
    }

    private static java.lang.String zzQ(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.ads.zzdo.zzd("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static java.util.HashMap zzR() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzi.length;
        java.util.HashMap map = new java.util.HashMap(length + 88);
        int i = 0;
        for (java.lang.String str : iSOLanguages) {
            try {
                java.lang.String iSO3Language = new java.util.Locale(str).getISO3Language();
                if (!android.text.TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (java.util.MissingResourceException unused) {
            }
        }
        while (true) {
            java.lang.String[] strArr = zzi;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j, boolean z, boolean z2) {
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        do {
            iBinarySearch++;
            if (iBinarySearch >= jArr.length) {
                break;
            }
        } while (jArr[iBinarySearch] == j);
        return !z ? iBinarySearch : iBinarySearch - 1;
    }

    public static int zzb(com.google.android.gms.internal.ads.zzdp zzdpVar, long j, boolean z, boolean z2) {
        int iZza = zzdpVar.zza() - 1;
        int i = 0;
        while (i <= iZza) {
            int i2 = (i + iZza) >>> 1;
            if (zzdpVar.zzb(i2) < j) {
                i = i2 + 1;
            } else {
                iZza = i2 - 1;
            }
        }
        int i3 = iZza + 1;
        if (i3 < zzdpVar.zza() && zzdpVar.zzb(i3) == j) {
            return i3;
        }
        if (iZza == -1) {
            return 0;
        }
        return iZza;
    }

    public static int zzc(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i);
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? java.lang.Math.max(0, i2) : i2;
    }

    public static int zzd(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = iBinarySearch + 1;
        }
        return z2 ? java.lang.Math.max(0, i) : i;
    }

    public static int zze(byte[] bArr, int i, int i2, int i3) {
        int iZzO = 65535;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = bArr[i4] & 255;
            iZzO = zzO(i5 & 15, zzO(i5 >> 4, iZzO));
        }
        return iZzO;
    }

    public static int zzf(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzk[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zzg(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzm[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    public static int zzh(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int zzi(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (zza >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int zzj(java.nio.ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i2 : java.lang.Integer.reverseBytes(i2);
    }

    public static int zzk(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzl(int i) {
        if (i == 2 || i == 4) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static int zzm(java.lang.String str) {
        java.lang.String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        java.lang.String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        str2.getClass();
        try {
            i = java.lang.Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return i;
    }

    public static int zzn(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public static int zzo(android.net.Uri uri) {
        byte b;
        int i;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && com.google.android.gms.internal.ads.zzftt.zzc("rtsp", scheme)) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (com.google.android.gms.internal.ads.zzftt.zza(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b = 2;
                    break;
                case "mpd":
                    b = 0;
                    break;
                case "isml":
                    b = 3;
                    break;
                case "m3u8":
                    b = 1;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i = 0;
            } else if (b != 1) {
                i = (b == 2 || b == 3) ? 1 : 4;
            } else {
                i = 2;
            }
            if (i != 4) {
                return i;
            }
        }
        java.util.regex.Pattern pattern = zzg;
        java.lang.String path = uri.getPath();
        path.getClass();
        java.util.regex.Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        java.lang.String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long zzp(long j, int i) {
        return zzu(j, i, 1000000L, java.math.RoundingMode.UP);
    }

    public static long zzq(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j * ((double) f));
    }

    public static long zzr(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j / ((double) f));
    }

    public static long zzs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzt(long j, int i) {
        return zzu(j, 1000000L, i, java.math.RoundingMode.DOWN);
    }

    public static long zzu(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return com.google.android.gms.internal.ads.zzgal.zzb(j, com.google.android.gms.internal.ads.zzgal.zzb(j3, j2, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return com.google.android.gms.internal.ads.zzgal.zzd(j, com.google.android.gms.internal.ads.zzgal.zzb(j2, j3, java.math.RoundingMode.UNNECESSARY));
        }
        if (j3 < j || j3 % j != 0) {
            return (j3 >= j || j % j3 != 0) ? zzP(j, j2, j3, roundingMode) : com.google.android.gms.internal.ads.zzgal.zzd(j2, com.google.android.gms.internal.ads.zzgal.zzb(j, j3, java.math.RoundingMode.UNNECESSARY));
        }
        return com.google.android.gms.internal.ads.zzgal.zzb(j2, com.google.android.gms.internal.ads.zzgal.zzb(j3, j, java.math.RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzv(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static android.graphics.Point zzw(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            java.lang.String strZzQ = zza < 28 ? zzQ("sys.display-size") : zzQ("vendor.display-size");
            if (!android.text.TextUtils.isEmpty(strZzQ)) {
                try {
                    java.lang.String[] strArrSplit = strZzQ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i2 = java.lang.Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new android.graphics.Point(i, i2);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                com.google.android.gms.internal.ads.zzdo.zzc("Util", "Invalid display size: ".concat(java.lang.String.valueOf(strZzQ)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new android.graphics.Point(3840, 2160);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static android.media.AudioFormat zzx(int i, int i2, int i3) {
        return new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static android.os.Handler zzy(android.os.Handler.Callback callback) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.zzcw.zzb(looperMyLooper);
        return new android.os.Handler(looperMyLooper, null);
    }

    public static android.os.Looper zzz() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : android.os.Looper.getMainLooper();
    }

    public static void zzF(long[] jArr, long j, long j2) {
        java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jZzb = com.google.android.gms.internal.ads.zzgal.zzb(j2, 1000000L, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.android.gms.internal.ads.zzgal.zzb(jArr[i], jZzb, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jZzb2 = com.google.android.gms.internal.ads.zzgal.zzb(1000000L, j2, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.android.gms.internal.ads.zzgal.zzd(jArr[i], jZzb2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = com.google.android.gms.internal.ads.zzgal.zzb(1000000L, com.google.android.gms.internal.ads.zzgal.zzb(j2, j3, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = zzP(j3, 1000000L, j2, roundingMode);
                } else {
                    jArr[i2] = com.google.android.gms.internal.ads.zzgal.zzd(1000000L, com.google.android.gms.internal.ads.zzgal.zzb(j3, j2, java.math.RoundingMode.UNNECESSARY));
                }
            }
        }
    }
}
