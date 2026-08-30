package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbb {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.ArrayList zzb = new java.util.ArrayList();
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    public static int zza(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzba zzbaVarZzc;
        switch (str) {
            case "audio/mpeg":
                return 9;
            case "audio/mp4a-latm":
                if (str2 == null || (zzbaVarZzc = zzc(str2)) == null) {
                    return 0;
                }
                return zzbaVarZzc.zza();
            case "audio/ac3":
                return 5;
            case "audio/eac3":
                return 6;
            case "audio/eac3-joc":
                return 18;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts":
                return 7;
            case "audio/vnd.dts.hd":
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/true-hd":
                return 14;
            case "audio/opus":
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (zzi(str)) {
            return 2;
        }
        if ("text".equals(zzj(str)) || androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_TTML.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_TX3G.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_MP4VTT.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_RAWCC.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_VOBSUB.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_PGS.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (zzh(str)) {
            return 4;
        }
        if (androidx.media3.common.MimeTypes.APPLICATION_ID3.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_EMSG.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SCTE35.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_ICY.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_AIT.equals(str)) {
            return 5;
        }
        if (androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = zzb.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzaz zzazVar = (com.google.android.gms.internal.ads.zzaz) zzb.get(i);
            java.lang.String str2 = zzazVar.zza;
            if (str.equals(null)) {
                int i2 = zzazVar.zzb;
                return 0;
            }
        }
        return -1;
    }

    static com.google.android.gms.internal.ads.zzba zzc(java.lang.String str) {
        java.util.regex.Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String strGroup = matcher.group(1);
        strGroup.getClass();
        java.lang.String strGroup2 = matcher.group(2);
        try {
            return new com.google.android.gms.internal.ads.zzba(java.lang.Integer.parseInt(strGroup, 16), strGroup2 != null ? java.lang.Integer.parseInt(strGroup2) : 0);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.String zzd(int i) {
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
        if (i == 221) {
            return androidx.media3.common.MimeTypes.AUDIO_VORBIS;
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
            case 108:
                return androidx.media3.common.MimeTypes.IMAGE_JPEG;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public static java.lang.String zze(java.lang.String str) {
        byte b;
        if (str == null) {
            return null;
        }
        java.lang.String strZza = com.google.android.gms.internal.ads.zzftt.zza(str);
        switch (strZza) {
            case "audio/x-flac":
                b = 0;
                break;
            case "application/x-mpegurl":
                b = 3;
                break;
            case "audio/x-wav":
                b = 2;
                break;
            case "audio/mpeg-l1":
                b = 4;
                break;
            case "audio/mpeg-l2":
                b = 5;
                break;
            case "audio/mp3":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return androidx.media3.common.MimeTypes.AUDIO_FLAC;
        }
        if (b == 1) {
            return androidx.media3.common.MimeTypes.AUDIO_MPEG;
        }
        if (b == 2) {
            return androidx.media3.common.MimeTypes.AUDIO_WAV;
        }
        if (b == 3) {
            return androidx.media3.common.MimeTypes.APPLICATION_M3U8;
        }
        if (b != 4) {
            return b != 5 ? strZza : androidx.media3.common.MimeTypes.AUDIO_MPEG_L2;
        }
        return androidx.media3.common.MimeTypes.AUDIO_MPEG_L1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    public static boolean zzf(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzba zzbaVarZzc;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mpeg":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
            case "audio/flac":
            case "audio/ac3":
            case "audio/eac3":
            case "audio/eac3-joc":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (zzbaVarZzc = zzc(str2)) == null || (iZza = zzbaVarZzc.zza()) == 0 || iZza == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean zzg(java.lang.String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzh(java.lang.String str) {
        return "image".equals(zzj(str)) || androidx.media3.common.MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    public static boolean zzi(java.lang.String str) {
        return "video".equals(zzj(str));
    }

    private static java.lang.String zzj(java.lang.String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
