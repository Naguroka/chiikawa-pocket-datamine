package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public class WaveformAudioBufferSink implements androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink {
    private final int barsPerSecond;
    private androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat;
    private final androidx.media3.exoplayer.audio.WaveformAudioBufferSink.Listener listener;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat mixingAudioFormat;
    private final java.nio.ByteBuffer mixingBuffer;
    private final android.util.SparseArray<androidx.media3.exoplayer.audio.WaveformAudioBufferSink.WaveformBar> outputChannels;
    private int samplesPerBar;

    public interface Listener {
        void onNewWaveformBar(int i, androidx.media3.exoplayer.audio.WaveformAudioBufferSink.WaveformBar waveformBar);
    }

    public static class WaveformBar {
        private int sampleCount;
        private double squareSum;
        private float minSampleValue = 1.0f;
        private float maxSampleValue = -1.0f;

        public int getSampleCount() {
            return this.sampleCount;
        }

        public double getMinSampleValue() {
            return this.minSampleValue;
        }

        public double getMaxSampleValue() {
            return this.maxSampleValue;
        }

        public double getRootMeanSquare() {
            return java.lang.Math.sqrt(this.squareSum / ((double) this.sampleCount));
        }

        public void addSample(float f) {
            com.google.common.base.Preconditions.checkArgument(f >= -1.0f && f <= 1.0f);
            this.minSampleValue = java.lang.Math.min(this.minSampleValue, f);
            this.maxSampleValue = java.lang.Math.max(this.maxSampleValue, f);
            double d = f;
            this.squareSum += d * d;
            this.sampleCount++;
        }
    }

    public WaveformAudioBufferSink(int i, int i2, androidx.media3.exoplayer.audio.WaveformAudioBufferSink.Listener listener) {
        this.barsPerSecond = i;
        this.listener = listener;
        this.mixingBuffer = java.nio.ByteBuffer.allocate(androidx.media3.common.util.Util.getPcmFrameSize(4, i2));
        this.outputChannels = new android.util.SparseArray<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.outputChannels.append(i3, new androidx.media3.exoplayer.audio.WaveformAudioBufferSink.WaveformBar());
        }
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public void flush(int i, int i2, int i3) {
        this.samplesPerBar = i / this.barsPerSecond;
        this.inputAudioFormat = new androidx.media3.common.audio.AudioProcessor.AudioFormat(i, i2, i3);
        this.mixingAudioFormat = new androidx.media3.common.audio.AudioProcessor.AudioFormat(i, this.outputChannels.size(), 4);
        this.channelMixingMatrix = androidx.media3.common.audio.ChannelMixingMatrix.create(i2, this.outputChannels.size());
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public void handleBuffer(java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.inputAudioFormat);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.mixingAudioFormat);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.channelMixingMatrix);
        while (byteBuffer.hasRemaining()) {
            this.mixingBuffer.rewind();
            androidx.media3.common.audio.AudioMixingUtil.mix(byteBuffer, this.inputAudioFormat, this.mixingBuffer, this.mixingAudioFormat, this.channelMixingMatrix, 1, false, true);
            this.mixingBuffer.rewind();
            for (int i = 0; i < this.outputChannels.size(); i++) {
                androidx.media3.exoplayer.audio.WaveformAudioBufferSink.WaveformBar waveformBar = this.outputChannels.get(i);
                waveformBar.addSample(this.mixingBuffer.getFloat());
                if (waveformBar.getSampleCount() >= this.samplesPerBar) {
                    this.listener.onNewWaveformBar(i, waveformBar);
                    this.outputChannels.put(i, new androidx.media3.exoplayer.audio.WaveformAudioBufferSink.WaveformBar());
                }
            }
        }
    }
}
