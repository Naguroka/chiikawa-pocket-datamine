package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultSubtitleParserFactory implements androidx.media3.extractor.text.SubtitleParser.Factory {
    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public boolean supportsFormat(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        return java.util.Objects.equals(str, androidx.media3.common.MimeTypes.TEXT_SSA) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.TEXT_VTT) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_MP4VTT) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_SUBRIP) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_TX3G) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_PGS) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_TTML);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public int getCueReplacementBehavior(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                    return new androidx.media3.extractor.text.dvb.DvbParser(format.initializationData);
                case "application/pgs":
                    return new androidx.media3.extractor.text.pgs.PgsParser();
                case "application/x-mp4-vtt":
                    return new androidx.media3.extractor.text.webvtt.Mp4WebvttParser();
                case "text/vtt":
                    return new androidx.media3.extractor.text.webvtt.WebvttParser();
                case "application/x-quicktime-tx3g":
                    return new androidx.media3.extractor.text.tx3g.Tx3gParser(format.initializationData);
                case "text/x-ssa":
                    return new androidx.media3.extractor.text.ssa.SsaParser(format.initializationData);
                case "application/x-subrip":
                    return new androidx.media3.extractor.text.subrip.SubripParser();
                case "application/ttml+xml":
                    return new androidx.media3.extractor.text.ttml.TtmlParser();
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
