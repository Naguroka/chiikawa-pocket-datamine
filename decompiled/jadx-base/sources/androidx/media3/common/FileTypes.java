package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int AVIF = 21;
    public static final int BMP = 19;
    private static final java.lang.String EXTENSION_AAC = ".aac";
    private static final java.lang.String EXTENSION_AC3 = ".ac3";
    private static final java.lang.String EXTENSION_AC4 = ".ac4";
    private static final java.lang.String EXTENSION_ADTS = ".adts";
    private static final java.lang.String EXTENSION_AMR = ".amr";
    private static final java.lang.String EXTENSION_AVI = ".avi";
    private static final java.lang.String EXTENSION_AVIF = ".avif";
    private static final java.lang.String EXTENSION_BMP = ".bmp";
    private static final java.lang.String EXTENSION_DIB = ".dib";
    private static final java.lang.String EXTENSION_EC3 = ".ec3";
    private static final java.lang.String EXTENSION_FLAC = ".flac";
    private static final java.lang.String EXTENSION_FLV = ".flv";
    private static final java.lang.String EXTENSION_HEIC = ".heic";
    private static final java.lang.String EXTENSION_HEIF = ".heif";
    private static final java.lang.String EXTENSION_JPEG = ".jpeg";
    private static final java.lang.String EXTENSION_JPG = ".jpg";
    private static final java.lang.String EXTENSION_M2P = ".m2p";
    private static final java.lang.String EXTENSION_MID = ".mid";
    private static final java.lang.String EXTENSION_MIDI = ".midi";
    private static final java.lang.String EXTENSION_MP3 = ".mp3";
    private static final java.lang.String EXTENSION_MP4 = ".mp4";
    private static final java.lang.String EXTENSION_MPEG = ".mpeg";
    private static final java.lang.String EXTENSION_MPG = ".mpg";
    private static final java.lang.String EXTENSION_OPUS = ".opus";
    private static final java.lang.String EXTENSION_PNG = ".png";
    private static final java.lang.String EXTENSION_PREFIX_CMF = ".cmf";
    private static final java.lang.String EXTENSION_PREFIX_M4 = ".m4";
    private static final java.lang.String EXTENSION_PREFIX_MK = ".mk";
    private static final java.lang.String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final java.lang.String EXTENSION_PREFIX_OG = ".og";
    private static final java.lang.String EXTENSION_PREFIX_TS = ".ts";
    private static final java.lang.String EXTENSION_PS = ".ps";
    private static final java.lang.String EXTENSION_SMF = ".smf";
    private static final java.lang.String EXTENSION_TS = ".ts";
    private static final java.lang.String EXTENSION_VTT = ".vtt";
    private static final java.lang.String EXTENSION_WAV = ".wav";
    private static final java.lang.String EXTENSION_WAVE = ".wave";
    private static final java.lang.String EXTENSION_WEBM = ".webm";
    private static final java.lang.String EXTENSION_WEBP = ".webp";
    private static final java.lang.String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;
    static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int HEIF = 20;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PNG = 17;
    public static final int PS = 10;
    public static final int TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBP = 18;
    public static final int WEBVTT = 13;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
    }

    public static int inferFileTypeFromResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.List<java.lang.String> list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int inferFileTypeFromMimeType(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
        strNormalizeMimeType.hashCode();
        switch (strNormalizeMimeType) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int inferFileTypeFromUri(android.net.Uri uri) {
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC3) || lastPathSegment.endsWith(EXTENSION_EC3)) {
            return 0;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC4)) {
            return 1;
        }
        if (lastPathSegment.endsWith(EXTENSION_ADTS) || lastPathSegment.endsWith(EXTENSION_AAC)) {
            return 2;
        }
        if (lastPathSegment.endsWith(EXTENSION_AMR)) {
            return 3;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
            return 4;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLV)) {
            return 5;
        }
        if (lastPathSegment.endsWith(EXTENSION_MID) || lastPathSegment.endsWith(EXTENSION_MIDI) || lastPathSegment.endsWith(EXTENSION_SMF)) {
            return 15;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_WEBM)) {
            return 6;
        }
        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_OPUS)) {
            return 9;
        }
        if (lastPathSegment.endsWith(EXTENSION_PS) || lastPathSegment.endsWith(EXTENSION_MPEG) || lastPathSegment.endsWith(EXTENSION_MPG) || lastPathSegment.endsWith(EXTENSION_M2P)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(EXTENSION_WAV) || lastPathSegment.endsWith(EXTENSION_WAVE)) {
            return 12;
        }
        if (lastPathSegment.endsWith(EXTENSION_VTT) || lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
            return 13;
        }
        if (lastPathSegment.endsWith(EXTENSION_JPG) || lastPathSegment.endsWith(EXTENSION_JPEG)) {
            return 14;
        }
        if (lastPathSegment.endsWith(EXTENSION_AVI)) {
            return 16;
        }
        if (lastPathSegment.endsWith(EXTENSION_PNG)) {
            return 17;
        }
        if (lastPathSegment.endsWith(EXTENSION_WEBP)) {
            return 18;
        }
        if (lastPathSegment.endsWith(EXTENSION_BMP) || lastPathSegment.endsWith(EXTENSION_DIB)) {
            return 19;
        }
        if (lastPathSegment.endsWith(EXTENSION_HEIC) || lastPathSegment.endsWith(EXTENSION_HEIF)) {
            return 20;
        }
        return lastPathSegment.endsWith(EXTENSION_AVIF) ? 21 : -1;
    }
}
