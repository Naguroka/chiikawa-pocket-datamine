package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.ArrayList f850a = new java.util.ArrayList();
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static java.lang.String a(int i) {
        if (i == 32) {
            return androidx.media3.common.MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return androidx.media3.common.MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return androidx.media3.common.MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return androidx.media3.common.MimeTypes.VIDEO_VP9;
        }
        if (i == 165) {
            return androidx.media3.common.MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return androidx.media3.common.MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return androidx.media3.common.MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return androidx.media3.common.MimeTypes.AUDIO_MPEG;
            case 106:
                return androidx.media3.common.MimeTypes.VIDEO_MPEG;
            default:
                switch (i) {
                    case org.objectweb.asm.Opcodes.RET /* 169 */:
                    case 172:
                        return androidx.media3.common.MimeTypes.AUDIO_DTS;
                    case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                    case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                        return androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
                    case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                        return androidx.media3.common.MimeTypes.AUDIO_OPUS;
                    case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                        return androidx.media3.common.MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    static com.applovin.impl.hf.a c(java.lang.String str) {
        java.util.regex.Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1));
        java.lang.String strGroup = matcher.group(2);
        try {
            return new com.applovin.impl.hf.a(java.lang.Integer.parseInt(str2, 16), strGroup != null ? java.lang.Integer.parseInt(strGroup) : 0);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static int f(java.lang.String str) {
        java.util.ArrayList arrayList = f850a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        com.applovin.impl.c8.a(arrayList.get(0));
        throw null;
    }

    public static boolean g(java.lang.String str) {
        return "audio".equals(d(str));
    }

    public static boolean i(java.lang.String str) {
        return "video".equals(d(str));
    }

    public static boolean h(java.lang.String str) {
        return "text".equals(d(str)) || androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_TTML.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_TX3G.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_MP4VTT.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_RAWCC.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_VOBSUB.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_PGS.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.hf.a aVarC;
        int iA;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (aVarC = c(str2)) == null || (iA = aVarC.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if (androidx.media3.common.MimeTypes.APPLICATION_ID3.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_EMSG.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return f(str);
    }

    public static int b(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.hf.a aVarC;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (aVarC = c(str2)) == null) {
                    return 0;
                }
                return aVarC.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return androidx.media3.common.MimeTypes.AUDIO_FLAC;
            case "audio/x-wav":
                return androidx.media3.common.MimeTypes.AUDIO_WAV;
            case "audio/mp3":
                return androidx.media3.common.MimeTypes.AUDIO_MPEG;
            default:
                return str;
        }
    }

    private static java.lang.String d(java.lang.String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f851a;
        public final int b;

        public a(int i, int i2) {
            this.f851a = i;
            this.b = i2;
        }

        public int a() {
            int i = this.b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private static java.lang.String a(java.lang.String str) {
        java.util.ArrayList arrayList = f850a;
        if (arrayList.size() <= 0) {
            return null;
        }
        com.applovin.impl.c8.a(arrayList.get(0));
        throw null;
    }

    public static java.lang.String b(java.lang.String str) {
        com.applovin.impl.hf.a aVarC;
        java.lang.String strA = null;
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return androidx.media3.common.MimeTypes.VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return androidx.media3.common.MimeTypes.VIDEO_VP8;
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (aVarC = c(lowerCase)) != null) {
                strA = a(aVarC.f851a);
            }
            return strA == null ? androidx.media3.common.MimeTypes.AUDIO_AAC : strA;
        }
        if (lowerCase.startsWith("mha1")) {
            return androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHA1;
        }
        if (lowerCase.startsWith("mhm1")) {
            return androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1;
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return androidx.media3.common.MimeTypes.AUDIO_AC3;
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        if (lowerCase.startsWith(androidx.media3.common.MimeTypes.CODEC_E_AC3_JOC)) {
            return androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC;
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return androidx.media3.common.MimeTypes.AUDIO_AC4;
        }
        if (lowerCase.startsWith("dtsc")) {
            return androidx.media3.common.MimeTypes.AUDIO_DTS;
        }
        if (lowerCase.startsWith("dtse")) {
            return androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS;
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
        }
        if (lowerCase.startsWith("dtsx")) {
            return androidx.media3.common.MimeTypes.AUDIO_DTS_X;
        }
        if (lowerCase.startsWith("opus")) {
            return androidx.media3.common.MimeTypes.AUDIO_OPUS;
        }
        if (lowerCase.startsWith("vorbis")) {
            return androidx.media3.common.MimeTypes.AUDIO_VORBIS;
        }
        if (lowerCase.startsWith("flac")) {
            return androidx.media3.common.MimeTypes.AUDIO_FLAC;
        }
        if (lowerCase.startsWith("stpp")) {
            return androidx.media3.common.MimeTypes.APPLICATION_TTML;
        }
        if (lowerCase.startsWith("wvtt")) {
            return androidx.media3.common.MimeTypes.TEXT_VTT;
        }
        if (lowerCase.contains("cea708")) {
            return androidx.media3.common.MimeTypes.APPLICATION_CEA708;
        }
        return (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? androidx.media3.common.MimeTypes.APPLICATION_CEA608 : a(lowerCase);
    }
}
