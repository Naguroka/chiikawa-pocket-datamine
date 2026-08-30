package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class SilenceSkippingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int AVOID_TRUNCATION_FACTOR = 1000;
    public static final long DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US = 2000000;
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 100000;
    public static final int DEFAULT_MIN_VOLUME_TO_KEEP_PERCENTAGE = 10;

    @java.lang.Deprecated
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final float DEFAULT_SILENCE_RETENTION_RATIO = 0.2f;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int DO_NOT_CHANGE_VOLUME = 3;
    private static final int FADE_IN = 2;
    private static final int FADE_OUT = 0;
    private static final int MUTE = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SHORTENING_SILENCE = 1;
    private int bytesPerFrame;
    private byte[] contiguousOutputBuffer;
    private boolean enabled;
    private final long maxSilenceToKeepDurationUs;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferContentsSize;
    private int maybeSilenceBufferStartIndex;
    private final int minVolumeToKeepPercentageWhenMuting;
    private final long minimumSilenceDurationUs;
    private int outputSilenceFramesSinceNoise;
    private final float silenceRetentionRatio;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    private static int twoByteSampleToInt(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    @java.lang.Deprecated
    public SilenceSkippingAudioProcessor(long j, long j2, short s) {
        this(j, j2 / j, j, 0, s);
    }

    public SilenceSkippingAudioProcessor(long j, float f, long j2, int i, short s) {
        boolean z = false;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        this.minimumSilenceDurationUs = j;
        this.silenceRetentionRatio = f;
        this.maxSilenceToKeepDurationUs = j2;
        this.minVolumeToKeepPercentageWhenMuting = i;
        this.silenceThresholdLevel = s;
        this.maybeSilenceBuffer = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        this.contiguousOutputBuffer = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return audioFormat.sampleRate == -1 ? androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET : audioFormat;
        }
        throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.enabled;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i = this.state;
            if (i == 0) {
                processNoisy(byteBuffer);
            } else if (i == 1) {
                shortenSilenceSilenceUntilNoise(byteBuffer);
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        if (isActive()) {
            this.bytesPerFrame = this.inputAudioFormat.channelCount * 2;
            int iAlignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.minimumSilenceDurationUs) / 2) * 2;
            if (this.maybeSilenceBuffer.length != iAlignToBytePerFrameBoundary) {
                this.maybeSilenceBuffer = new byte[iAlignToBytePerFrameBoundary];
                this.contiguousOutputBuffer = new byte[iAlignToBytePerFrameBoundary];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.enabled = false;
        this.maybeSilenceBuffer = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        this.contiguousOutputBuffer = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    private void processNoisy(java.nio.ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(java.lang.Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(java.lang.Math.min(iFindNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void shortenSilenceSilenceUntilNoise(java.nio.ByteBuffer byteBuffer) {
        int length;
        int i;
        androidx.media3.common.util.Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        int i2 = this.maybeSilenceBufferStartIndex;
        int i3 = this.maybeSilenceBufferContentsSize;
        int i4 = i2 + i3;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i4 < bArr.length) {
            length = bArr.length - (i3 + i2);
            i = i2 + i3;
        } else {
            int length2 = i3 - (bArr.length - i2);
            length = i2 - length2;
            i = length2;
        }
        boolean z = iFindNoisePosition < iLimit;
        int iMin = java.lang.Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, i, iMin);
        int i5 = this.maybeSilenceBufferContentsSize + iMin;
        this.maybeSilenceBufferContentsSize = i5;
        androidx.media3.common.util.Assertions.checkState(i5 <= this.maybeSilenceBuffer.length);
        boolean z2 = z && iPosition < length;
        outputShortenedSilenceBuffer(z2);
        if (z2) {
            this.state = 0;
            this.outputSilenceFramesSinceNoise = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private void outputShortenedSilenceBuffer(boolean z) {
        int length;
        int iCalculateShortenedSilenceLength;
        int i = this.maybeSilenceBufferContentsSize;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i == bArr.length || z) {
            if (this.outputSilenceFramesSinceNoise == 0) {
                if (z) {
                    outputSilence(i, 3);
                    length = i;
                } else {
                    androidx.media3.common.util.Assertions.checkState(i >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    outputSilence(length, 0);
                }
                iCalculateShortenedSilenceLength = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iCalculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.maybeSilenceBuffer.length / 2);
                outputSilence(iCalculateShortenedSilenceLength2, 2);
                iCalculateShortenedSilenceLength = iCalculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iCalculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(iCalculateShortenedSilenceLength, 1);
            }
            androidx.media3.common.util.Assertions.checkState(length % this.bytesPerFrame == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            androidx.media3.common.util.Assertions.checkState(i >= iCalculateShortenedSilenceLength);
            this.maybeSilenceBufferContentsSize -= length;
            int i2 = this.maybeSilenceBufferStartIndex + length;
            this.maybeSilenceBufferStartIndex = i2;
            this.maybeSilenceBufferStartIndex = i2 % this.maybeSilenceBuffer.length;
            int i3 = this.outputSilenceFramesSinceNoise;
            int i4 = this.bytesPerFrame;
            this.outputSilenceFramesSinceNoise = i3 + (iCalculateShortenedSilenceLength / i4);
            this.skippedFrames += (long) ((length - iCalculateShortenedSilenceLength) / i4);
        }
    }

    private int calculateShortenedSilenceLength(int i) {
        int iDurationUsToFrames = ((durationUsToFrames(this.maxSilenceToKeepDurationUs) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length / 2);
        androidx.media3.common.util.Assertions.checkState(iDurationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(java.lang.Math.min((i * this.silenceRetentionRatio) + 0.5f, iDurationUsToFrames));
    }

    private int alignToBytePerFrameBoundary(int i) {
        int i2 = this.bytesPerFrame;
        return (i / i2) * i2;
    }

    private int alignToBytePerFrameBoundary(float f) {
        return alignToBytePerFrameBoundary((int) f);
    }

    private void outputRange(byte[] bArr, int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i % this.bytesPerFrame == 0, "byteOutput size is not aligned to frame size " + i);
        modifyVolume(bArr, i, i2);
        replaceOutputBuffer(i).put(bArr, 0, i).flip();
    }

    private void outputSilence(int i, int i2) {
        if (i == 0) {
            return;
        }
        androidx.media3.common.util.Assertions.checkArgument(this.maybeSilenceBufferContentsSize >= i);
        if (i2 == 2) {
            int i3 = this.maybeSilenceBufferStartIndex;
            int i4 = this.maybeSilenceBufferContentsSize;
            int i5 = i3 + i4;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i5 <= bArr.length) {
                java.lang.System.arraycopy(bArr, (i3 + i4) - i, this.contiguousOutputBuffer, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    java.lang.System.arraycopy(bArr, length - i, this.contiguousOutputBuffer, 0, i);
                } else {
                    int i6 = i - length;
                    java.lang.System.arraycopy(bArr, bArr.length - i6, this.contiguousOutputBuffer, 0, i6);
                    java.lang.System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i6, length);
                }
            }
        } else {
            int i7 = this.maybeSilenceBufferStartIndex;
            int i8 = i7 + i;
            byte[] bArr2 = this.maybeSilenceBuffer;
            if (i8 <= bArr2.length) {
                java.lang.System.arraycopy(bArr2, i7, this.contiguousOutputBuffer, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                java.lang.System.arraycopy(bArr2, i7, this.contiguousOutputBuffer, 0, length2);
                java.lang.System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length2, i - length2);
            }
        }
        androidx.media3.common.util.Assertions.checkArgument(i % this.bytesPerFrame == 0, "sizeToOutput is not aligned to frame size: " + i);
        androidx.media3.common.util.Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        outputRange(this.contiguousOutputBuffer, i, i2);
    }

    private void modifyVolume(byte[] bArr, int i, int i2) {
        int iCalculateFadeInPercentage;
        if (i2 == 3) {
            return;
        }
        for (int i3 = 0; i3 < i; i3 += 2) {
            int iTwoByteSampleToInt = twoByteSampleToInt(bArr[i3 + 1], bArr[i3]);
            if (i2 == 0) {
                iCalculateFadeInPercentage = calculateFadeOutPercentage(i3, i - 1);
            } else if (i2 == 2) {
                iCalculateFadeInPercentage = calculateFadeInPercentage(i3, i - 1);
            } else {
                iCalculateFadeInPercentage = this.minVolumeToKeepPercentageWhenMuting;
            }
            sampleIntToTwoBigEndianBytes(bArr, i3, (iTwoByteSampleToInt * iCalculateFadeInPercentage) / 100);
        }
    }

    private int calculateFadeOutPercentage(int i, int i2) {
        return (((this.minVolumeToKeepPercentageWhenMuting - 100) * ((i * 1000) / i2)) / 1000) + 100;
    }

    private int calculateFadeInPercentage(int i, int i2) {
        int i3 = this.minVolumeToKeepPercentageWhenMuting;
        return i3 + ((((100 - i3) * (i * 1000)) / i2) / 1000);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i, int i2) {
        if (i2 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = 127;
        } else if (i2 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = -128;
        } else {
            bArr[i] = (byte) (i2 & 255);
            bArr[i + 1] = (byte) (i2 >> 8);
        }
    }

    private void output(java.nio.ByteBuffer byteBuffer) {
        replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private int durationUsToFrames(long j) {
        return (int) ((j * ((long) this.inputAudioFormat.sampleRate)) / 1000000);
    }

    private int findNoisePosition(java.nio.ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (isNoise(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.bytesPerFrame;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    private int findNoiseLimit(java.nio.ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (isNoise(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.bytesPerFrame;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private boolean isNoise(byte b, byte b2) {
        return java.lang.Math.abs(twoByteSampleToInt(b, b2)) > this.silenceThresholdLevel;
    }
}
