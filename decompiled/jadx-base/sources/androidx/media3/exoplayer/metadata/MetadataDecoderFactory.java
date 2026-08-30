package androidx.media3.exoplayer.metadata;

/* JADX INFO: loaded from: classes.dex */
public interface MetadataDecoderFactory {
    public static final androidx.media3.exoplayer.metadata.MetadataDecoderFactory DEFAULT = new androidx.media3.exoplayer.metadata.MetadataDecoderFactory() { // from class: androidx.media3.exoplayer.metadata.MetadataDecoderFactory.1
        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public boolean supportsFormat(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            return androidx.media3.common.MimeTypes.APPLICATION_ID3.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_EMSG.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SCTE35.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_ICY.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_AIT.equals(str);
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public androidx.media3.extractor.metadata.MetadataDecoder createDecoder(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder();
                    case "application/x-icy":
                        return new androidx.media3.extractor.metadata.icy.IcyDecoder();
                    case "application/id3":
                        return new androidx.media3.extractor.metadata.id3.Id3Decoder();
                    case "application/x-emsg":
                        return new androidx.media3.extractor.metadata.emsg.EventMessageDecoder();
                    case "application/x-scte35":
                        return new androidx.media3.extractor.metadata.scte35.SpliceInfoDecoder();
                }
            }
            throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    androidx.media3.extractor.metadata.MetadataDecoder createDecoder(androidx.media3.common.Format format);

    boolean supportsFormat(androidx.media3.common.Format format);
}
