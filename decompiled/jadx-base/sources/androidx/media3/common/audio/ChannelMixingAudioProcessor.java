package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelMixingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private final android.util.SparseArray<androidx.media3.common.audio.ChannelMixingMatrix> matrixByInputChannelCount = new android.util.SparseArray<>();

    public void putChannelMixingMatrix(androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix) {
        this.matrixByInputChannelCount.put(channelMixingMatrix.getInputChannelCount(), channelMixingMatrix);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix = this.matrixByInputChannelCount.get(audioFormat.channelCount);
        if (channelMixingMatrix == null) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("No mixing matrix for input channel count", audioFormat);
        }
        if (channelMixingMatrix.isIdentity()) {
            return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        }
        return new androidx.media3.common.audio.AudioProcessor.AudioFormat(audioFormat.sampleRate, channelMixingMatrix.getOutputChannelCount(), 2);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix = (androidx.media3.common.audio.ChannelMixingMatrix) androidx.media3.common.util.Assertions.checkStateNotNull(this.matrixByInputChannelCount.get(this.inputAudioFormat.channelCount));
        int iRemaining = byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
        java.nio.ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(this.outputAudioFormat.bytesPerFrame * iRemaining);
        androidx.media3.common.audio.AudioMixingUtil.mix(byteBuffer, this.inputAudioFormat, byteBufferReplaceOutputBuffer, this.outputAudioFormat, channelMixingMatrix, iRemaining, false, true);
        byteBufferReplaceOutputBuffer.flip();
    }
}
