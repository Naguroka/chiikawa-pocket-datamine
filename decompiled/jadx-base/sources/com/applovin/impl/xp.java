package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1515a;
    public static final java.lang.String b;
    public static final java.lang.String c;
    public static final java.lang.String d;
    public static final java.lang.String e;
    public static final byte[] f;
    private static final java.util.regex.Pattern g;
    private static final java.util.regex.Pattern h;
    private static final java.util.regex.Pattern i;
    private static final java.util.regex.Pattern j;
    private static java.util.HashMap k;
    private static final java.lang.String[] l;
    private static final java.lang.String[] m;
    private static final int[] n;
    private static final int[] o;

    static {
        int i2 = android.os.Build.VERSION.SDK_INT;
        f1515a = i2;
        java.lang.String str = android.os.Build.DEVICE;
        b = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        c = str2;
        java.lang.String str3 = android.os.Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f = new byte[0];
        g = java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        h = java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        i = java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        j = java.util.regex.Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        l = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        m = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, org.objectweb.asm.Opcodes.MONITOREXIT, com.ironsource.g3.c.b.c, com.ironsource.g3.c.b.f, org.objectweb.asm.Opcodes.D2F, org.objectweb.asm.Opcodes.DCMPL, 158, 153, 140, 139, 130, org.objectweb.asm.Opcodes.I2L, org.objectweb.asm.Opcodes.JSR, org.objectweb.asm.Opcodes.DRETURN, org.objectweb.asm.Opcodes.IF_ACMPNE, org.objectweb.asm.Opcodes.IF_ICMPLT, org.objectweb.asm.Opcodes.GETFIELD, org.objectweb.asm.Opcodes.PUTSTATIC, org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 189, org.objectweb.asm.Opcodes.IFNONNULL, 192, com.ironsource.g3.c.b.b, com.ironsource.g3.c.b.g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, org.objectweb.asm.Opcodes.INVOKESPECIAL, org.objectweb.asm.Opcodes.ARETURN, org.objectweb.asm.Opcodes.INVOKEINTERFACE, org.objectweb.asm.Opcodes.ARRAYLENGTH, org.objectweb.asm.Opcodes.LOOKUPSWITCH, 172, org.objectweb.asm.Opcodes.IF_ACMPEQ, org.objectweb.asm.Opcodes.IF_ICMPGE, org.objectweb.asm.Opcodes.D2L, 136, 129, 134, org.objectweb.asm.Opcodes.I2S, org.objectweb.asm.Opcodes.LCMP, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, org.objectweb.asm.Opcodes.L2F, org.objectweb.asm.Opcodes.D2I, 135, 128, org.objectweb.asm.Opcodes.FCMPL, org.objectweb.asm.Opcodes.I2C, 155, 156, org.objectweb.asm.Opcodes.RETURN, org.objectweb.asm.Opcodes.INVOKEVIRTUAL, org.objectweb.asm.Opcodes.ATHROW, org.objectweb.asm.Opcodes.INVOKESTATIC, org.objectweb.asm.Opcodes.LRETURN, org.objectweb.asm.Opcodes.TABLESWITCH, org.objectweb.asm.Opcodes.IF_ICMPGT, org.objectweb.asm.Opcodes.IF_ICMPLE, 249, 254, 247, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, org.objectweb.asm.Opcodes.INSTANCEOF, org.objectweb.asm.Opcodes.IFNULL, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, org.objectweb.asm.Opcodes.FRETURN, org.objectweb.asm.Opcodes.RET, org.objectweb.asm.Opcodes.IF_ICMPNE, org.objectweb.asm.Opcodes.GOTO, org.objectweb.asm.Opcodes.GETSTATIC, org.objectweb.asm.Opcodes.PUTFIELD, 188, org.objectweb.asm.Opcodes.NEW, 150, org.objectweb.asm.Opcodes.I2B, org.objectweb.asm.Opcodes.DCMPG, org.objectweb.asm.Opcodes.IF_ICMPEQ, 138, 141, org.objectweb.asm.Opcodes.IINC, org.objectweb.asm.Opcodes.LXOR, 222, 217, 208, 215, org.objectweb.asm.Opcodes.MONITORENTER, org.objectweb.asm.Opcodes.MULTIANEWARRAY, 204, com.ironsource.g3.c.b.d, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int a(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static long a(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static java.lang.Object a(java.lang.Object obj) {
        return obj;
    }

    public static java.lang.Object[] a(java.lang.Object[] objArr) {
        return objArr;
    }

    public static int b(int i2) {
        if (i2 == 2 || i2 == 4) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i2 == 10) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i2 == 7) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
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
                switch (i2) {
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

    public static long b(long j2) {
        return (j2 == androidx.media3.common.C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static int d(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 == 24) {
            return 536870912;
        }
        if (i2 != 32) {
            return 0;
        }
        return com.google.android.gms.drive.DriveFile.MODE_READ_WRITE;
    }

    public static long d(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    public static int e(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static boolean f(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean g(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean h(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static long i(int i2) {
        return ((long) i2) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static java.util.concurrent.ExecutorService e(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.applovin.impl.xp$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return com.applovin.impl.xp.a(str, runnable);
            }
        });
    }

    public static java.lang.String[] e() {
        java.lang.String[] strArrF = f();
        for (int i2 = 0; i2 < strArrF.length; i2++) {
            strArrF[i2] = f(strArrF[i2]);
        }
        return strArrF;
    }

    public static java.lang.String f(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strReplace = str.replace('_', org.objectweb.asm.signature.SignatureVisitor.SUPER);
        if (!strReplace.isEmpty() && !strReplace.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(str);
        java.lang.String str2 = b(lowerCase, "-")[0];
        if (k == null) {
            k = c();
        }
        java.lang.String str3 = (java.lang.String) k.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? d(lowerCase) : lowerCase;
    }

    private static java.lang.String[] f() {
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        return f1515a >= 24 ? a(configuration) : new java.lang.String[]{a(configuration.locale)};
    }

    public static int b(java.util.List list, java.lang.Comparable comparable, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = java.util.Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || ((java.lang.Comparable) list.get(i2)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? java.lang.Math.max(0, i3) : i3;
    }

    public static int a(java.util.List list, java.lang.Comparable comparable, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = java.util.Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= size || ((java.lang.Comparable) list.get(i2)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? java.lang.Math.min(list.size() - 1, i3) : i3;
    }

    public static int b(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? java.lang.Math.max(0, i3) : i3;
    }

    public static boolean d(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static android.graphics.Point c(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager;
        android.view.Display display = (f1515a < 17 || (displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((android.view.WindowManager) com.applovin.impl.b1.a((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return a(context, display);
    }

    public static int a(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? java.lang.Math.min(jArr.length - 1, i3) : i3;
    }

    public static long b(long j2, long j3, long j4) {
        return java.lang.Math.max(j3, java.lang.Math.min(j2, j4));
    }

    public static int a(com.applovin.impl.qc qcVar, long j2, boolean z, boolean z2) {
        int i2;
        int iA = qcVar.a() - 1;
        int i3 = 0;
        while (i3 <= iA) {
            int i4 = (i3 + iA) >>> 1;
            if (qcVar.a(i4) < j2) {
                i3 = i4 + 1;
            } else {
                iA = i4 - 1;
            }
        }
        if (z && (i2 = iA + 1) < qcVar.a() && qcVar.a(i2) == j2) {
            return i2;
        }
        if (z2 && iA == -1) {
            return 0;
        }
        return iA;
    }

    public static int a(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? java.lang.Math.max(0, i4) : i4;
    }

    private static void c(android.view.Display display, android.graphics.Point point) {
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static int b(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = o[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    private static java.lang.String d(java.lang.String str) {
        int i2 = 0;
        while (true) {
            java.lang.String[] strArr = m;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                return strArr[i2 + 1] + str.substring(strArr[i2].length());
            }
            i2 += 2;
        }
    }

    public static android.os.Looper d() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : android.os.Looper.getMainLooper();
    }

    public static int a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static android.os.Handler b() {
        return b((android.os.Handler.Callback) null);
    }

    public static void a(com.applovin.impl.h5 h5Var) {
        if (h5Var != null) {
            try {
                h5Var.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static float a(float f2, float f3, float f4) {
        return java.lang.Math.max(f3, java.lang.Math.min(f2, f4));
    }

    public static java.lang.String c(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new java.lang.IllegalStateException();
    }

    public static java.lang.String b(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!android.text.TextUtils.isEmpty(networkCountryIso)) {
                return com.applovin.exoplayer2.common.base.Ascii.toUpperCase(networkCountryIso);
            }
        }
        return com.applovin.exoplayer2.common.base.Ascii.toUpperCase(java.util.Locale.getDefault().getCountry());
    }

    public static int a(int i2, int i3, int i4) {
        return java.lang.Math.max(i3, java.lang.Math.min(i2, i4));
    }

    public static byte[] c(java.lang.String str) {
        return str.getBytes(com.applovin.exoplayer2.common.base.Charsets.UTF_8);
    }

    public static long c(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (j2 * (j3 / j4));
    }

    public static int a(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = n[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    private static void b(android.view.Display display, android.graphics.Point point) {
        display.getRealSize(point);
    }

    public static android.os.Handler a() {
        return a((android.os.Handler.Callback) null);
    }

    public static long c(int i2, int i3) {
        return i(i3) | (i(i2) << 32);
    }

    public static long c(long j2) {
        return (j2 == androidx.media3.common.C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    private static java.util.HashMap c() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        java.util.HashMap map = new java.util.HashMap(iSOLanguages.length + l.length);
        int i2 = 0;
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
            java.lang.String[] strArr = l;
            if (i2 >= strArr.length) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int a(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    private static java.lang.String b(java.util.Locale locale) {
        return locale.toLanguageTag();
    }

    public static int a(int i2) {
        switch (i2) {
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
                int i3 = f1515a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int b(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    public static long b(long j2, float f2) {
        return f2 == 1.0f ? j2 : java.lang.Math.round(j2 / ((double) f2));
    }

    public static int a(java.nio.ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i3 : java.lang.Integer.reverseBytes(i3);
    }

    public static java.lang.String[] b(java.lang.String str, java.lang.String str2) {
        return str.split(str2, 2);
    }

    public static android.os.Handler b(android.os.Handler.Callback callback) {
        return a(d(), callback);
    }

    public static java.lang.String b(java.lang.Object[] objArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static com.applovin.impl.e9 b(int i2, int i3, int i4) {
        return new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.AUDIO_RAW).c(i3).n(i4).j(i2).a();
    }

    private static java.lang.String b(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e2) {
            com.applovin.impl.oc.a("Util", "Failed to read system property " + str, e2);
            return null;
        }
    }

    public static android.graphics.Point a(android.content.Context context, android.view.Display display) {
        java.lang.String strB;
        if (display.getDisplayId() == 0 && d(context)) {
            if (f1515a < 28) {
                strB = b("sys.display-size");
            } else {
                strB = b("vendor.display-size");
            }
            if (!android.text.TextUtils.isEmpty(strB)) {
                try {
                    java.lang.String[] strArrA = a(strB.trim(), "x");
                    if (strArrA.length == 2) {
                        int i2 = java.lang.Integer.parseInt(strArrA[0]);
                        int i3 = java.lang.Integer.parseInt(strArrA[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new android.graphics.Point(i2, i3);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                com.applovin.impl.oc.b("Util", "Invalid display size: " + strB);
            }
            if ("Sony".equals(c) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new android.graphics.Point(3840, 2160);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        int i4 = f1515a;
        if (i4 >= 23) {
            c(display, point);
        } else if (i4 >= 17) {
            b(display, point);
        } else {
            a(display, point);
        }
        return point;
    }

    private static void a(android.view.Display display, android.graphics.Point point) {
        display.getSize(point);
    }

    public static int a(java.lang.String str) {
        java.lang.String[] strArrA;
        int length;
        if (str == null || (length = (strArrA = a(str, "_")).length) < 2) {
            return 0;
        }
        java.lang.String str2 = strArrA[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrA[length - 2]);
        try {
            int i2 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) str2));
            return z ? -i2 : i2;
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static long a(long j2, float f2) {
        return f2 == 1.0f ? j2 : java.lang.Math.round(j2 * ((double) f2));
    }

    public static long a(long j2) {
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            return java.lang.System.currentTimeMillis();
        }
        return j2 + android.os.SystemClock.elapsedRealtime();
    }

    public static java.lang.String a(java.lang.StringBuilder sb, java.util.Formatter formatter, long j2) {
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            j2 = 0;
        }
        java.lang.String str = j2 < 0 ? "-" : "";
        long jAbs = (java.lang.Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3)).toString();
    }

    private static java.lang.String[] a(android.content.res.Configuration configuration) {
        return a(configuration.getLocales().toLanguageTags(), ",");
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + android.os.Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    }

    public static boolean a(com.applovin.impl.ah ahVar, com.applovin.impl.ah ahVar2, java.util.zip.Inflater inflater) {
        if (ahVar.a() <= 0) {
            return false;
        }
        if (ahVar2.b() < ahVar.a()) {
            ahVar2.a(ahVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(ahVar.c(), ahVar.d(), ahVar.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(ahVar2.c(), iInflate, ahVar2.b() - iInflate);
                if (inflater.finished()) {
                    ahVar2.e(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == ahVar2.b()) {
                        ahVar2.a(ahVar2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (java.util.zip.DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (java.lang.Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static boolean a(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        return android.text.TextUtils.isEmpty(scheme) || com.ironsource.y8.h.b.equals(scheme);
    }

    public static int a(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static java.lang.Object[] a(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length + objArr2.length);
        java.lang.System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
        return objArrCopyOf;
    }

    public static java.lang.Object[] a(java.lang.Object[] objArr, int i2) {
        com.applovin.impl.b1.a(i2 <= objArr.length);
        return java.util.Arrays.copyOf(objArr, i2);
    }

    public static java.lang.Object[] a(java.lang.Object[] objArr, int i2, int i3) {
        com.applovin.impl.b1.a(i2 >= 0);
        com.applovin.impl.b1.a(i3 <= objArr.length);
        return java.util.Arrays.copyOfRange(objArr, i2, i3);
    }

    public static boolean a(android.os.Handler handler, java.lang.Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean a(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 < j2 && j2 % j3 == 0) {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
            return;
        }
        double d2 = j2 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = (long) (jArr[i2] * d2);
            i2++;
        }
    }

    public static java.lang.String[] a(java.lang.String str, java.lang.String str2) {
        return str.split(str2, -1);
    }

    public static byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 != -1) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static java.lang.CharSequence a(java.lang.CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static void a(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static android.os.Handler a(android.os.Handler.Callback callback) {
        return a((android.os.Looper) com.applovin.impl.b1.b(android.os.Looper.myLooper()), callback);
    }

    public static android.os.Handler a(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new android.os.Handler(looper, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Thread a(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    public static java.lang.String a(java.util.Locale locale) {
        return f1515a >= 21 ? b(locale) : locale.toString();
    }

    public static java.lang.String a(byte[] bArr) {
        return new java.lang.String(bArr, com.applovin.exoplayer2.common.base.Charsets.UTF_8);
    }

    public static java.lang.String a(byte[] bArr, int i2, int i3) {
        return new java.lang.String(bArr, i2, i3, com.applovin.exoplayer2.common.base.Charsets.UTF_8);
    }

    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }
}
