package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class BatchBuffer extends androidx.media3.decoder.DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    static final int MAX_SIZE_BYTES = 3072000;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    public BatchBuffer() {
        super(2);
        this.maxSampleCount = 32;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.sampleCount = 0;
    }

    public void setMaxSampleCount(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        this.maxSampleCount = i;
    }

    public long getFirstSampleTimeUs() {
        return this.timeUs;
    }

    public long getLastSampleTimeUs() {
        return this.lastSampleTimeUs;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public boolean hasSamples() {
        return this.sampleCount > 0;
    }

    public boolean append(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        androidx.media3.common.util.Assertions.checkArgument(!decoderInputBuffer.isEncrypted());
        androidx.media3.common.util.Assertions.checkArgument(!decoderInputBuffer.hasSupplementalData());
        androidx.media3.common.util.Assertions.checkArgument(!decoderInputBuffer.isEndOfStream());
        if (!canAppendSampleBuffer(decoderInputBuffer)) {
            return false;
        }
        int i = this.sampleCount;
        this.sampleCount = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        java.nio.ByteBuffer byteBuffer = decoderInputBuffer.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.lastSampleTimeUs = decoderInputBuffer.timeUs;
        return true;
    }

    private boolean canAppendSampleBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        if (!hasSamples()) {
            return true;
        }
        if (this.sampleCount >= this.maxSampleCount) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer = decoderInputBuffer.data;
        return byteBuffer == null || this.data == null || this.data.position() + byteBuffer.remaining() <= MAX_SIZE_BYTES;
    }
}
