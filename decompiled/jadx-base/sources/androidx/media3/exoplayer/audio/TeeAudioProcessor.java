package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class TeeAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private final androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink audioBufferSink;

    public interface AudioBufferSink {
        void flush(int i, int i2, int i3);

        void handleBuffer(java.nio.ByteBuffer byteBuffer);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }

    public TeeAudioProcessor(androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink audioBufferSink) {
        this.audioBufferSink = (androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink) androidx.media3.common.util.Assertions.checkNotNull(audioBufferSink);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.audioBufferSink.handleBuffer(androidx.media3.common.util.Util.createReadOnlyByteBuffer(byteBuffer));
        replaceOutputBuffer(iRemaining).put(byteBuffer).flip();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onFlush() {
        flushSinkIfActive();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onQueueEndOfStream() {
        flushSinkIfActive();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onReset() {
        flushSinkIfActive();
    }

    private void flushSinkIfActive() {
        if (isActive()) {
            this.audioBufferSink.flush(this.inputAudioFormat.sampleRate, this.inputAudioFormat.channelCount, this.inputAudioFormat.encoding);
        }
    }

    public static final class WavFileAudioBufferSink implements androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink {
        private static final int FILE_SIZE_MINUS_44_OFFSET = 40;
        private static final int FILE_SIZE_MINUS_8_OFFSET = 4;
        private static final int HEADER_LENGTH = 44;
        private static final java.lang.String TAG = "WaveFileAudioBufferSink";
        private int bytesWritten;
        private int channelCount;
        private int counter;
        private int encoding;
        private final java.lang.String outputFileNamePrefix;
        private java.io.RandomAccessFile randomAccessFile;
        private int sampleRateHz;
        private final byte[] scratchBuffer;
        private final java.nio.ByteBuffer scratchByteBuffer;

        public WavFileAudioBufferSink(java.lang.String str) {
            this.outputFileNamePrefix = str;
            byte[] bArr = new byte[1024];
            this.scratchBuffer = bArr;
            this.scratchByteBuffer = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
        public void flush(int i, int i2, int i3) {
            try {
                reset();
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(TAG, "Error resetting", e);
            }
            this.sampleRateHz = i;
            this.channelCount = i2;
            this.encoding = i3;
        }

        @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
        public void handleBuffer(java.nio.ByteBuffer byteBuffer) {
            try {
                maybePrepareFile();
                writeBuffer(byteBuffer);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(TAG, "Error writing data", e);
            }
        }

        private void maybePrepareFile() throws java.io.IOException {
            if (this.randomAccessFile != null) {
                return;
            }
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(getNextOutputFileName(), "rw");
            writeFileHeader(randomAccessFile);
            this.randomAccessFile = randomAccessFile;
            this.bytesWritten = 44;
        }

        private void writeFileHeader(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
            randomAccessFile.writeInt(androidx.media3.extractor.WavUtil.RIFF_FOURCC);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(androidx.media3.extractor.WavUtil.WAVE_FOURCC);
            randomAccessFile.writeInt(androidx.media3.extractor.WavUtil.FMT_FOURCC);
            this.scratchByteBuffer.clear();
            this.scratchByteBuffer.putInt(16);
            this.scratchByteBuffer.putShort((short) androidx.media3.extractor.WavUtil.getTypeForPcmEncoding(this.encoding));
            this.scratchByteBuffer.putShort((short) this.channelCount);
            this.scratchByteBuffer.putInt(this.sampleRateHz);
            int pcmFrameSize = androidx.media3.common.util.Util.getPcmFrameSize(this.encoding, this.channelCount);
            this.scratchByteBuffer.putInt(this.sampleRateHz * pcmFrameSize);
            this.scratchByteBuffer.putShort((short) pcmFrameSize);
            this.scratchByteBuffer.putShort((short) ((pcmFrameSize * 8) / this.channelCount));
            randomAccessFile.write(this.scratchBuffer, 0, this.scratchByteBuffer.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        private void writeBuffer(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            java.io.RandomAccessFile randomAccessFile = (java.io.RandomAccessFile) androidx.media3.common.util.Assertions.checkNotNull(this.randomAccessFile);
            while (byteBuffer.hasRemaining()) {
                int iMin = java.lang.Math.min(byteBuffer.remaining(), this.scratchBuffer.length);
                byteBuffer.get(this.scratchBuffer, 0, iMin);
                randomAccessFile.write(this.scratchBuffer, 0, iMin);
                this.bytesWritten += iMin;
            }
        }

        private void reset() throws java.io.IOException {
            java.io.RandomAccessFile randomAccessFile = this.randomAccessFile;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.scratchByteBuffer.clear();
                this.scratchByteBuffer.putInt(this.bytesWritten - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.scratchBuffer, 0, 4);
                this.scratchByteBuffer.clear();
                this.scratchByteBuffer.putInt(this.bytesWritten - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.scratchBuffer, 0, 4);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.w(TAG, "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.randomAccessFile = null;
            }
        }

        private java.lang.String getNextOutputFileName() {
            int i = this.counter;
            this.counter = i + 1;
            return androidx.media3.common.util.Util.formatInvariant("%s-%04d.wav", this.outputFileNamePrefix, java.lang.Integer.valueOf(i));
        }
    }
}
