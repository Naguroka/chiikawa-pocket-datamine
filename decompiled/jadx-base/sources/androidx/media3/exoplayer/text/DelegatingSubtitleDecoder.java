package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
final class DelegatingSubtitleDecoder extends androidx.media3.extractor.text.SimpleSubtitleDecoder {
    private final androidx.media3.extractor.text.SubtitleParser subtitleParser;

    public DelegatingSubtitleDecoder(java.lang.String str, androidx.media3.extractor.text.SubtitleParser subtitleParser) {
        super(str);
        this.subtitleParser = subtitleParser;
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    protected androidx.media3.extractor.text.Subtitle decode(byte[] bArr, int i, boolean z) {
        if (z) {
            this.subtitleParser.reset();
        }
        return this.subtitleParser.parseToLegacySubtitle(bArr, 0, i);
    }
}
