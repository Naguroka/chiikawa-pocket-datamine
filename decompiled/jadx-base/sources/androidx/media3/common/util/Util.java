package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Util {
    private static final int[] CRC16_BYTES_MSBF;
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;
    public static final java.lang.String DEVICE;
    public static final java.lang.String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final long[] EMPTY_LONG_ARRAY;
    private static final java.util.regex.Pattern ESCAPED_CHARACTER_PATTERN;
    private static final java.lang.String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final java.lang.String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final java.util.regex.Pattern ISM_PATH_PATTERN;
    public static final java.lang.String MANUFACTURER;
    public static final java.lang.String MODEL;
    public static final int SDK_INT;
    private static final java.lang.String TAG = "Util";
    private static final java.util.regex.Pattern XS_DATE_TIME_PATTERN;
    private static final java.util.regex.Pattern XS_DURATION_PATTERN;
    private static final java.lang.String[] additionalIsoLanguageReplacements;
    private static final java.lang.String[] isoLegacyTagReplacements;
    private static java.util.HashMap<java.lang.String, java.lang.String> languageTagReplacementMap;

    public static long addWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T castNonNull(T t) {
        return t;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static int compareLong(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static java.lang.String getAdaptiveMimeTypeForContentType(int i) {
        if (i == 0) {
            return androidx.media3.common.MimeTypes.APPLICATION_MPD;
        }
        if (i == 1) {
            return androidx.media3.common.MimeTypes.APPLICATION_SS;
        }
        if (i != 2) {
            return null;
        }
        return androidx.media3.common.MimeTypes.APPLICATION_M3U8;
    }

    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i) {
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

    @java.lang.Deprecated
    public static int getAudioContentTypeForStreamType(int i) {
        if (i != 0) {
            return (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int getAudioUsageForStreamType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 6;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                return i != 8 ? 1 : 3;
            }
        }
        return i2;
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i) {
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

    public static int getPcmEncoding(int i) {
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

    public static int getStreamTypeForAudioUsage(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
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

    public static boolean isEncodingHighResolutionPcm(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean isEncodingLinearPcm(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean isLinebreak(int i) {
        return i == 10 || i == 13;
    }

    public static long msToUs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    private static boolean shouldEscapeCharacter(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    public static long toUnsignedLong(int i) {
        return ((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        SDK_INT = i;
        java.lang.String str = android.os.Build.DEVICE;
        DEVICE = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        MANUFACTURER = str2;
        java.lang.String str3 = android.os.Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        XS_DATE_TIME_PATTERN = java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, org.objectweb.asm.Opcodes.MONITOREXIT, com.ironsource.g3.c.b.c, com.ironsource.g3.c.b.f, org.objectweb.asm.Opcodes.D2F, org.objectweb.asm.Opcodes.DCMPL, 158, 153, 140, 139, 130, org.objectweb.asm.Opcodes.I2L, org.objectweb.asm.Opcodes.JSR, org.objectweb.asm.Opcodes.DRETURN, org.objectweb.asm.Opcodes.IF_ACMPNE, org.objectweb.asm.Opcodes.IF_ICMPLT, org.objectweb.asm.Opcodes.GETFIELD, org.objectweb.asm.Opcodes.PUTSTATIC, org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 189, org.objectweb.asm.Opcodes.IFNONNULL, 192, com.ironsource.g3.c.b.b, com.ironsource.g3.c.b.g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, org.objectweb.asm.Opcodes.INVOKESPECIAL, org.objectweb.asm.Opcodes.ARETURN, org.objectweb.asm.Opcodes.INVOKEINTERFACE, org.objectweb.asm.Opcodes.ARRAYLENGTH, org.objectweb.asm.Opcodes.LOOKUPSWITCH, 172, org.objectweb.asm.Opcodes.IF_ACMPEQ, org.objectweb.asm.Opcodes.IF_ICMPGE, org.objectweb.asm.Opcodes.D2L, 136, 129, 134, org.objectweb.asm.Opcodes.I2S, org.objectweb.asm.Opcodes.LCMP, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, org.objectweb.asm.Opcodes.L2F, org.objectweb.asm.Opcodes.D2I, 135, 128, org.objectweb.asm.Opcodes.FCMPL, org.objectweb.asm.Opcodes.I2C, 155, 156, org.objectweb.asm.Opcodes.RETURN, org.objectweb.asm.Opcodes.INVOKEVIRTUAL, org.objectweb.asm.Opcodes.ATHROW, org.objectweb.asm.Opcodes.INVOKESTATIC, org.objectweb.asm.Opcodes.LRETURN, org.objectweb.asm.Opcodes.TABLESWITCH, org.objectweb.asm.Opcodes.IF_ICMPGT, org.objectweb.asm.Opcodes.IF_ICMPLE, 249, 254, 247, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, org.objectweb.asm.Opcodes.INSTANCEOF, org.objectweb.asm.Opcodes.IFNULL, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, org.objectweb.asm.Opcodes.FRETURN, org.objectweb.asm.Opcodes.RET, org.objectweb.asm.Opcodes.IF_ICMPNE, org.objectweb.asm.Opcodes.GOTO, org.objectweb.asm.Opcodes.GETSTATIC, org.objectweb.asm.Opcodes.PUTFIELD, 188, org.objectweb.asm.Opcodes.NEW, 150, org.objectweb.asm.Opcodes.I2B, org.objectweb.asm.Opcodes.DCMPG, org.objectweb.asm.Opcodes.IF_ICMPEQ, 138, 141, org.objectweb.asm.Opcodes.IINC, org.objectweb.asm.Opcodes.LXOR, 222, 217, 208, 215, org.objectweb.asm.Opcodes.MONITORENTER, org.objectweb.asm.Opcodes.MULTIANEWARRAY, 204, com.ironsource.g3.c.b.d, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private Util() {
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        return com.google.common.io.ByteStreams.toByteArray(inputStream);
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i = 0;
        for (int i2 : iArr) {
            int i3 = i + 1;
            bArr[i] = (byte) (i2 >> 24);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i2 >> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i2 >> 8);
            i = i5 + 1;
            bArr[i5] = (byte) i2;
        }
        return bArr;
    }

    public static byte[] toByteArray(float f) {
        return com.google.common.primitives.Ints.toByteArray(java.lang.Float.floatToIntBits(f));
    }

    public static android.content.Intent registerReceiverNotExported(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        if (SDK_INT < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static android.content.ComponentName startForegroundService(android.content.Context context, android.content.Intent intent) {
        if (SDK_INT >= 26) {
            return context.startForegroundService(intent);
        }
        return context.startService(intent);
    }

    public static void setForegroundServiceNotification(android.app.Service service, int i, android.app.Notification notification, int i2, java.lang.String str) {
        if (SDK_INT >= 29) {
            androidx.media3.common.util.Util.Api29.startForeground(service, i, notification, i2, str);
        } else {
            service.startForeground(i, notification);
        }
    }

    @java.lang.Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity activity, android.net.Uri... uriArr) {
        for (android.net.Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity activity, androidx.media3.common.MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    public static boolean maybeRequestReadStoragePermission(android.app.Activity activity, androidx.media3.common.MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (androidx.media3.common.MediaItem mediaItem : mediaItemArr) {
            if (mediaItem.localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, mediaItem.localConfiguration.uri)) {
                    return true;
                }
                com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i = 0; i < immutableList.size(); i++) {
                    if (maybeRequestReadStoragePermission(activity, immutableList.get(i).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean maybeRequestReadStoragePermission(android.app.Activity activity, android.net.Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    private static boolean isReadStoragePermissionRequestNeeded(android.app.Activity activity, android.net.Uri uri) {
        if (SDK_INT < 23) {
            return false;
        }
        if (isLocalFileUri(uri)) {
            return !isAppSpecificStorageFileUri(activity, uri);
        }
        return isMediaStoreExternalContentUri(uri);
    }

    private static boolean isAppSpecificStorageFileUri(android.app.Activity activity, android.net.Uri uri) {
        try {
            java.lang.String path = uri.getPath();
            if (path == null) {
                return false;
            }
            java.lang.String canonicalPath = new java.io.File(path).getCanonicalPath();
            java.lang.String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            java.lang.String canonicalPath3 = null;
            java.io.File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            return canonicalPath.startsWith(canonicalPath2) || (canonicalPath3 != null && canonicalPath.startsWith(canonicalPath3));
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private static boolean isMediaStoreExternalContentUri(android.net.Uri uri) {
        if (!"content".equals(uri.getScheme()) || !com.ironsource.y8.h.I0.equals(uri.getAuthority())) {
            return false;
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        java.lang.String str = pathSegments.get(0);
        return com.json.y3.e.equals(str) || "external_primary".equals(str);
    }

    public static boolean checkCleartextTrafficPermitted(androidx.media3.common.MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (androidx.media3.common.MediaItem mediaItem : mediaItemArr) {
            if (mediaItem.localConfiguration != null) {
                if (isTrafficRestricted(mediaItem.localConfiguration.uri)) {
                    return false;
                }
                for (int i = 0; i < mediaItem.localConfiguration.subtitleConfigurations.size(); i++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isLocalFileUri(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        return android.text.TextUtils.isEmpty(scheme) || com.ironsource.y8.h.b.equals(scheme);
    }

    public static boolean isRunningOnEmulator() {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(DEVICE);
        return lowerCase.contains("emulator") || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic");
    }

    public static boolean areEqual(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T> boolean contentEquals(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!java.util.Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static <T> int contentHashCode(android.util.SparseArray<T> sparseArray) {
        if (SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + java.util.Objects.hashCode(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    public static boolean contains(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contains(android.util.SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static <T> void removeRange(java.util.List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
        androidx.media3.common.util.Assertions.checkArgument(i <= tArr.length);
        return (T[]) java.util.Arrays.copyOf(tArr, i);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        androidx.media3.common.util.Assertions.checkArgument(i2 <= tArr.length);
        return (T[]) java.util.Arrays.copyOfRange(tArr, i, i2);
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length + tArr2.length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> void nullSafeListToArray(java.util.List<T> list, T[] tArr) {
        androidx.media3.common.util.Assertions.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static android.os.Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static android.os.Handler createHandlerForCurrentLooper(android.os.Handler.Callback callback) {
        return createHandler((android.os.Looper) androidx.media3.common.util.Assertions.checkStateNotNull(android.os.Looper.myLooper()), callback);
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper(android.os.Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    public static android.os.Handler createHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new android.os.Handler(looper, callback);
    }

    public static boolean postOrRun(android.os.Handler handler, java.lang.Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static <T> com.google.common.util.concurrent.ListenableFuture<T> postOrRunWithCompletion(android.os.Handler handler, final java.lang.Runnable runnable, final T t) {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        postOrRun(handler, new java.lang.Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.Util.lambda$postOrRunWithCompletion$0(settableFutureCreate, runnable, t);
            }
        });
        return settableFutureCreate;
    }

    static /* synthetic */ void lambda$postOrRunWithCompletion$0(com.google.common.util.concurrent.SettableFuture settableFuture, java.lang.Runnable runnable, java.lang.Object obj) {
        try {
            if (settableFuture.isCancelled()) {
                return;
            }
            runnable.run();
            settableFuture.set(obj);
        } catch (java.lang.Throwable th) {
            settableFuture.setException(th);
        }
    }

    public static <T, U> com.google.common.util.concurrent.ListenableFuture<T> transformFutureAsync(final com.google.common.util.concurrent.ListenableFuture<U> listenableFuture, final com.google.common.util.concurrent.AsyncFunction<U, T> asyncFunction) {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        settableFutureCreate.addListener(new java.lang.Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.Util.lambda$transformFutureAsync$1(settableFutureCreate, listenableFuture);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.Util.lambda$transformFutureAsync$2(listenableFuture, settableFutureCreate, asyncFunction);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    static /* synthetic */ void lambda$transformFutureAsync$1(com.google.common.util.concurrent.SettableFuture settableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    static /* synthetic */ void lambda$transformFutureAsync$2(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.SettableFuture settableFuture, com.google.common.util.concurrent.AsyncFunction asyncFunction) {
        try {
            try {
                settableFuture.setFuture(asyncFunction.apply(com.google.common.util.concurrent.Futures.getDone(listenableFuture)));
            } catch (java.lang.Throwable th) {
                settableFuture.setException(th);
            }
        } catch (java.lang.Error e) {
            e = e;
            settableFuture.setException(e);
        } catch (java.util.concurrent.CancellationException unused) {
            settableFuture.cancel(false);
        } catch (java.lang.RuntimeException e2) {
            e = e2;
            settableFuture.setException(e);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            java.lang.Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            settableFuture.setException(e);
        }
    }

    public static android.os.Looper getCurrentOrMainLooper() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : android.os.Looper.getMainLooper();
    }

    static /* synthetic */ java.lang.Thread lambda$newSingleThreadExecutor$3(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    public static java.util.concurrent.ExecutorService newSingleThreadExecutor(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.media3.common.util.Util.lambda$newSingleThreadExecutor$3(str, runnable);
            }
        });
    }

    static /* synthetic */ java.lang.Thread lambda$newSingleThreadScheduledExecutor$4(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    public static java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor(final java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.media3.common.util.Util.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
            }
        });
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static boolean readBoolean(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static java.lang.String getLocaleLanguageTag(java.util.Locale locale) {
        return SDK_INT >= 21 ? getLocaleLanguageTagV21(locale) : locale.toString();
    }

    public static java.lang.String normalizeLanguageCode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strReplace = str.replace('_', org.objectweb.asm.signature.SignatureVisitor.SUPER);
        if (!strReplace.isEmpty() && !strReplace.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        java.lang.String str2 = splitAtFirst(lowerCase, "-")[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        java.lang.String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(lowerCase) : lowerCase;
    }

    public static java.lang.String loadAsset(android.content.Context context, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return fromUtf8Bytes(com.google.common.io.ByteStreams.toByteArray(inputStreamOpen));
        } finally {
            closeQuietly(inputStreamOpen);
        }
    }

    public static java.lang.String fromUtf8Bytes(byte[] bArr) {
        return new java.lang.String(bArr, com.google.common.base.Charsets.UTF_8);
    }

    public static java.lang.String fromUtf8Bytes(byte[] bArr, int i, int i2) {
        return new java.lang.String(bArr, i, i2, com.google.common.base.Charsets.UTF_8);
    }

    public static byte[] getUtf8Bytes(java.lang.String str) {
        return str.getBytes(com.google.common.base.Charsets.UTF_8);
    }

    public static java.lang.String[] split(java.lang.String str, java.lang.String str2) {
        return str.split(str2, -1);
    }

    public static java.lang.String[] splitAtFirst(java.lang.String str, java.lang.String str2) {
        return str.split(str2, 2);
    }

    public static java.lang.String formatInvariant(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static long ceilDivide(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static int constrainValue(int i, int i2, int i3) {
        return java.lang.Math.max(i2, java.lang.Math.min(i, i3));
    }

    public static long constrainValue(long j, long j2, long j3) {
        return java.lang.Math.max(j2, java.lang.Math.min(j, j3));
    }

    public static float constrainValue(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f, f3));
    }

    public static int linearSearch(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static int linearSearch(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
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

    public static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
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
            i = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? java.lang.Math.max(0, i) : i;
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchFloor(java.util.List<? extends java.lang.Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int iBinarySearch = java.util.Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? java.lang.Math.max(0, i) : i;
    }

    public static int binarySearchFloor(androidx.media3.common.util.LongArray longArray, long j, boolean z, boolean z2) {
        int i;
        int size = longArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (longArray.get(i3) < j) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        if (z && (i = size + 1) < longArray.size() && longArray.get(i) == j) {
            return i;
        }
        if (z2 && size == -1) {
            return 0;
        }
        return size;
    }

    public static int binarySearchCeil(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= iArr.length) {
                    break;
                }
            } while (iArr[iBinarySearch] == i);
            i2 = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? java.lang.Math.min(iArr.length - 1, i2) : i2;
    }

    public static int binarySearchCeil(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? java.lang.Math.min(jArr.length - 1, i) : i;
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchCeil(java.util.List<? extends java.lang.Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int iBinarySearch = java.util.Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? java.lang.Math.min(list.size() - 1, i) : i;
    }

    public static long minValue(android.util.SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new java.util.NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < sparseLongArray.size(); i++) {
            jMin = java.lang.Math.min(jMin, sparseLongArray.valueAt(i));
        }
        return jMin;
    }

    public static long maxValue(android.util.SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new java.util.NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < sparseLongArray.size(); i++) {
            jMax = java.lang.Math.max(jMax, sparseLongArray.valueAt(i));
        }
        return jMax;
    }

    public static long usToMs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long sampleCountToDurationUs(long j, int i) {
        return scaleLargeValue(j, 1000000L, i, java.math.RoundingMode.FLOOR);
    }

    public static long durationUsToSampleCount(long j, int i) {
        return scaleLargeValue(j, i, 1000000L, java.math.RoundingMode.CEILING);
    }

    public static long parseXsDuration(java.lang.String str) {
        java.util.regex.Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (matcher.matches()) {
            boolean zIsEmpty = true ^ android.text.TextUtils.isEmpty(matcher.group(1));
            java.lang.String strGroup = matcher.group(3);
            double d = strGroup != null ? java.lang.Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
            java.lang.String strGroup2 = matcher.group(5);
            double d2 = d + (strGroup2 != null ? java.lang.Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
            java.lang.String strGroup3 = matcher.group(7);
            double d3 = d2 + (strGroup3 != null ? java.lang.Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
            java.lang.String strGroup4 = matcher.group(10);
            double d4 = d3 + (strGroup4 != null ? java.lang.Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
            java.lang.String strGroup5 = matcher.group(12);
            double d5 = d4 + (strGroup5 != null ? java.lang.Double.parseDouble(strGroup5) * 60.0d : 0.0d);
            java.lang.String strGroup6 = matcher.group(14);
            long j = (long) ((d5 + (strGroup6 != null ? java.lang.Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
            return zIsEmpty ? -j : j;
        }
        return (long) (java.lang.Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static long parseXsDateTime(java.lang.String str) throws androidx.media3.common.ParserException {
        java.util.regex.Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (java.lang.Integer.parseInt(matcher.group(12)) * 60) + java.lang.Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)) - 1, java.lang.Integer.parseInt(matcher.group(3)), java.lang.Integer.parseInt(matcher.group(4)), java.lang.Integer.parseInt(matcher.group(5)), java.lang.Integer.parseInt(matcher.group(6)));
        if (!android.text.TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new java.math.BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
    }

    public static long scaleLargeValue(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return com.google.common.math.LongMath.divide(j, com.google.common.math.LongMath.divide(j3, j2, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return com.google.common.math.LongMath.saturatedMultiply(j, com.google.common.math.LongMath.divide(j2, j3, java.math.RoundingMode.UNNECESSARY));
        }
        if (j3 >= j && j3 % j == 0) {
            return com.google.common.math.LongMath.divide(j2, com.google.common.math.LongMath.divide(j3, j, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j && j % j3 == 0) {
            return com.google.common.math.LongMath.saturatedMultiply(j2, com.google.common.math.LongMath.divide(j, j3, java.math.RoundingMode.UNNECESSARY));
        }
        return scaleLargeValueFallback(j, j2, j3, roundingMode);
    }

    public static long[] scaleLargeValues(java.util.List<java.lang.Long> list, long j, long j2, java.math.RoundingMode roundingMode) {
        int i;
        int size = list.size();
        long[] jArr = new long[size];
        if (j == 0) {
            return jArr;
        }
        int i2 = 0;
        if (j2 >= j && j2 % j == 0) {
            long jDivide = com.google.common.math.LongMath.divide(j2, j, java.math.RoundingMode.UNNECESSARY);
            while (i2 < size) {
                jArr[i2] = com.google.common.math.LongMath.divide(list.get(i2).longValue(), jDivide, roundingMode);
                i2++;
            }
            return jArr;
        }
        if (j2 < j && j % j2 == 0) {
            long jDivide2 = com.google.common.math.LongMath.divide(j, j2, java.math.RoundingMode.UNNECESSARY);
            while (i2 < size) {
                jArr[i2] = com.google.common.math.LongMath.saturatedMultiply(list.get(i2).longValue(), jDivide2);
                i2++;
            }
            return jArr;
        }
        int i3 = 0;
        while (i3 < size) {
            long jLongValue = list.get(i3).longValue();
            if (jLongValue != 0) {
                if (j2 >= jLongValue && j2 % jLongValue == 0) {
                    jArr[i3] = com.google.common.math.LongMath.divide(j, com.google.common.math.LongMath.divide(j2, jLongValue, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 < jLongValue && jLongValue % j2 == 0) {
                    jArr[i3] = com.google.common.math.LongMath.saturatedMultiply(j, com.google.common.math.LongMath.divide(jLongValue, j2, java.math.RoundingMode.UNNECESSARY));
                } else {
                    i = i3;
                    jArr[i] = scaleLargeValueFallback(jLongValue, j, j2, roundingMode);
                }
                i = i3;
            } else {
                i = i3;
            }
            i3 = i + 1;
        }
        return jArr;
    }

    public static void scaleLargeValuesInPlace(long[] jArr, long j, long j2, java.math.RoundingMode roundingMode) {
        if (j == 0) {
            java.util.Arrays.fill(jArr, 0L);
            return;
        }
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long jDivide = com.google.common.math.LongMath.divide(j2, j, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.common.math.LongMath.divide(jArr[i], jDivide, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long jDivide2 = com.google.common.math.LongMath.divide(j, j2, java.math.RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = com.google.common.math.LongMath.saturatedMultiply(jArr[i], jDivide2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = com.google.common.math.LongMath.divide(j, com.google.common.math.LongMath.divide(j2, j3, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 < j3 && j3 % j2 == 0) {
                    jArr[i2] = com.google.common.math.LongMath.saturatedMultiply(j, com.google.common.math.LongMath.divide(j3, j2, java.math.RoundingMode.UNNECESSARY));
                } else {
                    jArr[i2] = scaleLargeValueFallback(j3, j, j2, roundingMode);
                }
            }
        }
    }

    private static long scaleLargeValueFallback(long j, long j2, long j3, java.math.RoundingMode roundingMode) {
        long jSaturatedMultiply = com.google.common.math.LongMath.saturatedMultiply(j, j2);
        if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
            return com.google.common.math.LongMath.divide(jSaturatedMultiply, j3, roundingMode);
        }
        long jGcd = com.google.common.math.LongMath.gcd(java.lang.Math.abs(j2), java.lang.Math.abs(j3));
        long jDivide = com.google.common.math.LongMath.divide(j2, jGcd, java.math.RoundingMode.UNNECESSARY);
        long jDivide2 = com.google.common.math.LongMath.divide(j3, jGcd, java.math.RoundingMode.UNNECESSARY);
        long jGcd2 = com.google.common.math.LongMath.gcd(java.lang.Math.abs(j), java.lang.Math.abs(jDivide2));
        long jDivide3 = com.google.common.math.LongMath.divide(j, jGcd2, java.math.RoundingMode.UNNECESSARY);
        long jDivide4 = com.google.common.math.LongMath.divide(jDivide2, jGcd2, java.math.RoundingMode.UNNECESSARY);
        long jSaturatedMultiply2 = com.google.common.math.LongMath.saturatedMultiply(jDivide3, jDivide);
        if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
            return com.google.common.math.LongMath.divide(jSaturatedMultiply2, jDivide4, roundingMode);
        }
        double d = jDivide3 * (jDivide / jDivide4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.common.math.DoubleMath.roundToLong(d, roundingMode);
    }

    public static long scaleLargeTimestamp(long j, long j2, long j3) {
        return scaleLargeValue(j, j2, j3, java.math.RoundingMode.FLOOR);
    }

    public static long[] scaleLargeTimestamps(java.util.List<java.lang.Long> list, long j, long j2) {
        return scaleLargeValues(list, j, j2, java.math.RoundingMode.FLOOR);
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
        scaleLargeValuesInPlace(jArr, j, j2, java.math.RoundingMode.FLOOR);
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j * ((double) f));
    }

    public static long getPlayoutDurationForMediaDuration(long j, float f) {
        return f == 1.0f ? j : java.lang.Math.round(j / ((double) f));
    }

    public static int getIntegerCodeForString(java.lang.String str) {
        int length = str.length();
        androidx.media3.common.util.Assertions.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt << 8) | str.charAt(i);
        }
        return iCharAt;
    }

    public static long toLong(int i, int i2) {
        return toUnsignedLong(i2) | (toUnsignedLong(i) << 32);
    }

    public static byte[] getBytesFromHexString(java.lang.String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((java.lang.Character.digit(str.charAt(i2), 16) << 4) + java.lang.Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static java.lang.String toHexString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(java.lang.Character.forDigit((bArr[i] >> 4) & 15, 16)).append(java.lang.Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    public static java.lang.String getUserAgent(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + android.os.Build.VERSION.RELEASE + ") AndroidXMedia3/1.4.0";
    }

    public static int getCodecCountOfType(java.lang.String str, int i) {
        int i2 = 0;
        for (java.lang.String str2 : splitCodecs(str)) {
            if (i == androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                i2++;
            }
        }
        return i2;
    }

    public static java.lang.String getCodecsOfType(java.lang.String str, int i) {
        java.lang.String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArrSplitCodecs) {
            if (i == androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static java.lang.String[] splitCodecs(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? new java.lang.String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    public static androidx.media3.common.Format getPcmFormat(int i, int i2, int i3) {
        return new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setChannelCount(i2).setSampleRate(i3).setPcmEncoding(i).build();
    }

    public static androidx.media3.common.Format getPcmFormat(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int getAudioTrackChannelConfig(int i) {
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
                if (SDK_INT >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static android.media.AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static int getPcmFrameSize(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
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
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static int generateAudioSessionIdV21(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static java.util.UUID getDrmUuid(java.lang.String str) {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "playready":
                return androidx.media3.common.C.PLAYREADY_UUID;
            case "widevine":
                return androidx.media3.common.C.WIDEVINE_UUID;
            case "clearkey":
                return androidx.media3.common.C.CLEARKEY_UUID;
            default:
                try {
                    return java.util.UUID.fromString(str);
                } catch (java.lang.RuntimeException unused) {
                    return null;
                }
        }
    }

    @java.lang.Deprecated
    public static int inferContentType(android.net.Uri uri, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        return inferContentTypeForExtension(str);
    }

    public static int inferContentType(android.net.Uri uri) {
        int iInferContentTypeForExtension;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && com.google.common.base.Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iInferContentTypeForExtension;
        }
        java.util.regex.Matcher matcher = ISM_PATH_PATTERN.matcher((java.lang.CharSequence) androidx.media3.common.util.Assertions.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        java.lang.String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
                return 0;
            }
            if (strGroup.contains(ISM_HLS_FORMAT_EXTENSION)) {
                return 2;
            }
        }
        return 1;
    }

    @java.lang.Deprecated
    public static int inferContentType(java.lang.String str) {
        return inferContentType(android.net.Uri.parse("file:///" + str));
    }

    public static int inferContentTypeForExtension(java.lang.String str) {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(android.net.Uri uri, java.lang.String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        str.hashCode();
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static android.net.Uri fixSmoothStreamingIsmManifestUri(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        java.util.regex.Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? android.net.Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static java.lang.String getStringForTime(java.lang.StringBuilder sb, java.util.Formatter formatter, long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = 0;
        }
        java.lang.String str = j < 0 ? "-" : "";
        long jAbs = (java.lang.Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j2)).toString();
    }

    public static java.lang.String escapeFileName(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (shouldEscapeCharacter(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 2) + length);
        while (i2 > 0) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (shouldEscapeCharacter(cCharAt)) {
                sb.append('%').append(java.lang.Integer.toHexString(cCharAt));
                i2--;
            } else {
                sb.append(cCharAt);
            }
            i = i4;
        }
        if (i < length) {
            sb.append((java.lang.CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public static java.lang.String unescapeFileName(java.lang.String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = length - (i * 2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i3);
        java.util.regex.Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i > 0 && matcher.find()) {
            sb.append((java.lang.CharSequence) str, iEnd, matcher.start()).append((char) java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)), 16));
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sb.append((java.lang.CharSequence) str, iEnd, length);
        }
        if (sb.length() != i3) {
            return null;
        }
        return sb.toString();
    }

    public static android.net.Uri getDataUriForString(java.lang.String str, java.lang.String str2) {
        return android.net.Uri.parse("data:" + str + ";base64," + android.util.Base64.encodeToString(str2.getBytes(), 2));
    }

    public static void sneakyThrow(java.lang.Throwable th) throws java.lang.Throwable {
        sneakyThrowInternal(th);
    }

    private static <T extends java.lang.Throwable> void sneakyThrowInternal(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    public static void recursiveDelete(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static java.io.File createTempDirectory(android.content.Context context, java.lang.String str) throws java.io.IOException {
        java.io.File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static java.io.File createTempFile(android.content.Context context, java.lang.String str) throws java.io.IOException {
        return java.io.File.createTempFile(str, null, (java.io.File) androidx.media3.common.util.Assertions.checkNotNull(context.getCacheDir()));
    }

    public static int crc32(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = CRC32_BYTES_MSBF[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int crc16(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = com.google.common.primitives.UnsignedBytes.toInt(bArr[i]);
            i3 = crc16UpdateFourBits(i4 & 15, crc16UpdateFourBits(i4 >> 4, i3));
            i++;
        }
        return i3;
    }

    private static int crc16UpdateFourBits(int i, int i2) {
        return (CRC16_BYTES_MSBF[(i ^ ((i2 >> 12) & 255)) & 255] ^ ((i2 << 4) & 65535)) & 65535;
    }

    public static int crc8(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = CRC8_BYTES_MSBF[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    public static byte[] gzip(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static int getBigEndianInt(java.nio.ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i2 : java.lang.Integer.reverseBytes(i2);
    }

    public static java.nio.ByteBuffer createReadOnlyByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    public static java.lang.String getCountryCode(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!android.text.TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.Ascii.toUpperCase(networkCountryIso);
            }
        }
        return com.google.common.base.Ascii.toUpperCase(java.util.Locale.getDefault().getCountry());
    }

    public static java.lang.String[] getSystemLanguageCodes() {
        java.lang.String[] systemLocales = getSystemLocales();
        for (int i = 0; i < systemLocales.length; i++) {
            systemLocales[i] = normalizeLanguageCode(systemLocales[i]);
        }
        return systemLocales;
    }

    public static java.util.Locale getDefaultDisplayLocale() {
        return SDK_INT >= 24 ? java.util.Locale.getDefault(java.util.Locale.Category.DISPLAY) : java.util.Locale.getDefault();
    }

    public static boolean inflate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, java.util.zip.Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(parsableByteArray2.getData(), iInflate, parsableByteArray2.capacity() - iInflate);
                if (inflater.finished()) {
                    parsableByteArray2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
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

    public static boolean isTv(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean isAutomotive(android.content.Context context) {
        return SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean isWear(android.content.Context context) {
        return SDK_INT >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((android.view.WindowManager) androidx.media3.common.util.Assertions.checkNotNull((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context context, android.view.Display display) {
        java.lang.String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!android.text.TextUtils.isEmpty(systemProperty)) {
                try {
                    java.lang.String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i2 = java.lang.Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new android.graphics.Point(i, i2);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                androidx.media3.common.util.Log.e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new android.graphics.Point(3840, 2160);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        if (SDK_INT >= 23) {
            getDisplaySizeV23(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static java.lang.String getTrackTypeString(int i) {
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
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? "custom (" + i + ")" : "?";
        }
    }

    public static boolean isBitmapFactorySupportedMimeType(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "image/avif":
                return SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static java.util.List<java.lang.String> getSelectionFlagStrings(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i & 1) != 0) {
            arrayList.add("default");
        }
        if ((i & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static java.util.List<java.lang.String> getRoleFlagStrings(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 1) != 0) {
            arrayList.add(com.ironsource.y8.h.Z);
        }
        if ((i & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static long getNowUnixTimeMs(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return java.lang.System.currentTimeMillis();
        }
        return j + android.os.SystemClock.elapsedRealtime();
    }

    public static <T> void moveItems(java.util.List<T> list, int i, int i2, int i3) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(java.lang.Math.min(i3, list.size()), arrayDeque);
    }

    public static boolean tableExists(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        return android.database.DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new java.lang.String[]{str}) > 0;
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(java.lang.String str) {
        java.lang.String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        java.lang.String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            int i = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str2));
            return z ? -i : i;
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean isFrameDropAllowedOnSurfaceInput(android.content.Context context) {
        int i = SDK_INT;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i == 30) {
                java.lang.String str = MODEL;
                if (com.google.common.base.Ascii.equalsIgnoreCase(str, "moto g(20)") || com.google.common.base.Ascii.equalsIgnoreCase(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(android.content.Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    public static java.lang.String getFormatSupportString(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new java.lang.IllegalStateException();
    }

    public static androidx.media3.common.Player.Commands getAvailableCommands(androidx.media3.common.Player player, androidx.media3.common.Player.Commands commands) {
        boolean zIsPlayingAd = player.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean zHasNextMediaItem = player.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean zIsEmpty = player.getCurrentTimeline().isEmpty();
        boolean z = false;
        androidx.media3.common.Player.Commands.Builder builderAddIf = new androidx.media3.common.Player.Commands.Builder().addAll(commands).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z = true;
        }
        return builderAddIf.addIf(12, z).build();
    }

    public static long sum(long... jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, android.content.res.Resources resources, int i) {
        if (SDK_INT >= 21) {
            return androidx.media3.common.util.Util.Api21.getDrawable(context, resources, i);
        }
        return resources.getDrawable(i);
    }

    public static java.lang.String intToStringMaxRadix(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(androidx.media3.common.Player player) {
        return shouldShowPlayButton(player, true);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(androidx.media3.common.Player player, boolean z) {
        if (player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4) {
            return true;
        }
        return z && player.getPlaybackSuppressionReason() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    public static boolean handlePlayButtonAction(androidx.media3.common.Player player) {
        boolean z = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 && player.isCommandAvailable(2)) {
            player.prepare();
        } else {
            if (playbackState == 4 && player.isCommandAvailable(4)) {
                player.seekToDefaultPosition();
            }
            if (player.isCommandAvailable(1)) {
                return z;
            }
            player.play();
            return true;
        }
        z = true;
        if (player.isCommandAvailable(1)) {
            return z;
        }
        player.play();
        return true;
    }

    public static boolean handlePauseButtonAction(androidx.media3.common.Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    public static boolean handlePlayPauseButtonAction(androidx.media3.common.Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    public static boolean handlePlayPauseButtonAction(androidx.media3.common.Player player, boolean z) {
        if (shouldShowPlayButton(player, z)) {
            return handlePlayButtonAction(player);
        }
        return handlePauseButtonAction(player);
    }

    private static java.lang.String getSystemProperty(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            androidx.media3.common.util.Log.e(TAG, "Failed to read system property " + str, e);
            return null;
        }
    }

    private static void getDisplaySizeV23(android.view.Display display, android.graphics.Point point) {
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    private static java.lang.String[] getSystemLocales() {
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new java.lang.String[]{getLocaleLanguageTag(configuration.locale)};
    }

    private static java.lang.String[] getSystemLocalesV24(android.content.res.Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    private static java.lang.String getLocaleLanguageTagV21(java.util.Locale locale) {
        return locale.toLanguageTag();
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> createIsoLanguageReplacementMap() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
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
            java.lang.String[] strArr = additionalIsoLanguageReplacements;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    private static boolean requestExternalStoragePermission(android.app.Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    private static boolean requestReadMediaPermissions(android.app.Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    private static boolean isTrafficRestricted(android.net.Uri uri) {
        return androidx.webkit.ProxyConfig.MATCH_HTTP.equals(uri.getScheme()) && !android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(uri.getHost()));
    }

    private static java.lang.String maybeReplaceLegacyLanguageTags(java.lang.String str) {
        int i = 0;
        while (true) {
            java.lang.String[] strArr = isoLegacyTagReplacements;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, android.content.res.Resources resources, int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    private static class Api29 {
        public static void startForeground(android.app.Service service, int i, android.app.Notification notification, int i2, java.lang.String str) {
            try {
                service.startForeground(i, notification, i2);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.e(androidx.media3.common.util.Util.TAG, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e;
            }
        }

        private Api29() {
        }
    }
}
