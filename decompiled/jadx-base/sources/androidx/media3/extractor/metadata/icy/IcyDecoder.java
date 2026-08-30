package androidx.media3.extractor.metadata.icy;

/* JADX INFO: loaded from: classes.dex */
public final class IcyDecoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final java.util.regex.Pattern METADATA_ELEMENT = java.util.regex.Pattern.compile("(.+?)='(.*?)';", 32);
    private static final java.lang.String STREAM_KEY_NAME = "streamtitle";
    private static final java.lang.String STREAM_KEY_URL = "streamurl";
    private final java.nio.charset.CharsetDecoder utf8Decoder = com.google.common.base.Charsets.UTF_8.newDecoder();
    private final java.nio.charset.CharsetDecoder iso88591Decoder = com.google.common.base.Charsets.ISO_8859_1.newDecoder();

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        java.lang.String strDecodeToString = decodeToString(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        java.lang.String str = null;
        if (strDecodeToString == null) {
            return new androidx.media3.common.Metadata(new androidx.media3.extractor.metadata.icy.IcyInfo(bArr, null, null));
        }
        java.util.regex.Matcher matcher = METADATA_ELEMENT.matcher(strDecodeToString);
        java.lang.String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(strGroup);
                lowerCase.hashCode();
                if (lowerCase.equals(STREAM_KEY_URL)) {
                    str2 = strGroup2;
                } else if (lowerCase.equals(STREAM_KEY_NAME)) {
                    str = strGroup2;
                }
            }
        }
        return new androidx.media3.common.Metadata(new androidx.media3.extractor.metadata.icy.IcyInfo(bArr, str, str2));
    }

    private java.lang.String decodeToString(java.nio.ByteBuffer byteBuffer) {
        try {
            java.lang.String string = this.utf8Decoder.decode(byteBuffer).toString();
            this.utf8Decoder.reset();
            byteBuffer.rewind();
            return string;
        } catch (java.nio.charset.CharacterCodingException unused) {
            this.utf8Decoder.reset();
            byteBuffer.rewind();
            try {
                return this.iso88591Decoder.decode(byteBuffer).toString();
            } catch (java.nio.charset.CharacterCodingException unused2) {
                return null;
            } finally {
                this.iso88591Decoder.reset();
                byteBuffer.rewind();
            }
        } catch (java.lang.Throwable th) {
            this.utf8Decoder.reset();
            byteBuffer.rewind();
            throw th;
        }
    }
}
