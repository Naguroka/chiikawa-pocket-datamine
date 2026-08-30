package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
final class ChannelMappingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private int[] outputChannels;
    private int[] pendingOutputChannels;

    ChannelMappingAudioProcessor() {
    }

    public void setChannelMap(int[] iArr) {
        this.pendingOutputChannels = iArr;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        }
        if (audioFormat.encoding != 2) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z = audioFormat.channelCount != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= audioFormat.channelCount) {
                throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
            }
            z |= i2 != i;
            i++;
        }
        if (z) {
            return new androidx.media3.common.audio.AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, 2);
        }
        return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        int[] iArr = (int[]) androidx.media3.common.util.Assertions.checkNotNull(this.outputChannels);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        java.nio.ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.inputAudioFormat.bytesPerFrame;
        }
        byteBuffer.position(iLimit);
        byteBufferReplaceOutputBuffer.flip();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onFlush() {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }
}
