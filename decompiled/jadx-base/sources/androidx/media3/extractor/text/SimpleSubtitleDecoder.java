package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleSubtitleDecoder extends androidx.media3.decoder.SimpleDecoder<androidx.media3.extractor.text.SubtitleInputBuffer, androidx.media3.extractor.text.SubtitleOutputBuffer, androidx.media3.extractor.text.SubtitleDecoderException> implements androidx.media3.extractor.text.SubtitleDecoder {
    private final java.lang.String name;

    protected abstract androidx.media3.extractor.text.Subtitle decode(byte[] bArr, int i, boolean z) throws androidx.media3.extractor.text.SubtitleDecoderException;

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }

    protected SimpleSubtitleDecoder(java.lang.String str) {
        super(new androidx.media3.extractor.text.SubtitleInputBuffer[2], new androidx.media3.extractor.text.SubtitleOutputBuffer[2]);
        this.name = str;
        setInitialInputBufferSize(1024);
    }

    @Override // androidx.media3.decoder.Decoder
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public final androidx.media3.extractor.text.SubtitleInputBuffer createInputBuffer() {
        return new androidx.media3.extractor.text.SubtitleInputBuffer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public final androidx.media3.extractor.text.SubtitleOutputBuffer createOutputBuffer() {
        return new androidx.media3.extractor.text.SubtitleOutputBuffer() { // from class: androidx.media3.extractor.text.SimpleSubtitleDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                androidx.media3.extractor.text.SimpleSubtitleDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public final androidx.media3.extractor.text.SubtitleDecoderException createUnexpectedDecodeException(java.lang.Throwable th) {
        return new androidx.media3.extractor.text.SubtitleDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public final androidx.media3.extractor.text.SubtitleDecoderException decode(androidx.media3.extractor.text.SubtitleInputBuffer subtitleInputBuffer, androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer, boolean z) {
        try {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(subtitleInputBuffer.data);
            subtitleOutputBuffer.setContent(subtitleInputBuffer.timeUs, decode(byteBuffer.array(), byteBuffer.limit(), z), subtitleInputBuffer.subsampleOffsetUs);
            subtitleOutputBuffer.shouldBeSkipped = false;
            return null;
        } catch (androidx.media3.extractor.text.SubtitleDecoderException e) {
            return e;
        }
    }
}
