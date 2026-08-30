package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessingPipeline {
    private final com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> audioProcessors;
    private final java.util.List<androidx.media3.common.audio.AudioProcessor> activeAudioProcessors = new java.util.ArrayList();
    private java.nio.ByteBuffer[] outputBuffers = new java.nio.ByteBuffer[0];
    private androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private boolean inputEnded = false;

    public AudioProcessingPipeline(com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> immutableList) {
        this.audioProcessors = immutableList;
    }

    public androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            androidx.media3.common.audio.AudioProcessor audioProcessor = this.audioProcessors.get(i);
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                androidx.media3.common.util.Assertions.checkState(!audioFormatConfigure.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = audioFormatConfigure;
            }
        }
        this.pendingOutputAudioFormat = audioFormat;
        return audioFormat;
    }

    public void flush() {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            androidx.media3.common.audio.AudioProcessor audioProcessor = this.audioProcessors.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new java.nio.ByteBuffer[this.activeAudioProcessors.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.outputBuffers[i2] = this.activeAudioProcessors.get(i2).getOutput();
        }
    }

    public androidx.media3.common.audio.AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        processData(byteBuffer);
    }

    public java.nio.ByteBuffer getOutput() {
        if (!isOperational()) {
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        java.nio.ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        processData(androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER);
        return this.outputBuffers[getFinalOutputBufferIndex()];
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        this.inputEnded = true;
        this.activeAudioProcessors.get(0).queueEndOfStream();
    }

    public boolean isEnded() {
        return this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public void reset() {
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            androidx.media3.common.audio.AudioProcessor audioProcessor = this.audioProcessors.get(i);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.outputBuffers = new java.nio.ByteBuffer[0];
        this.outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingOutputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.inputEnded = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.audio.AudioProcessingPipeline)) {
            return false;
        }
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = (androidx.media3.common.audio.AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            if (this.audioProcessors.get(i) != audioProcessingPipeline.audioProcessors.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.audioProcessors.hashCode();
    }

    private void processData(java.nio.ByteBuffer byteBuffer) {
        boolean z;
        java.nio.ByteBuffer byteBuffer2;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= getFinalOutputBufferIndex(); i++) {
                if (!this.outputBuffers[i].hasRemaining()) {
                    androidx.media3.common.audio.AudioProcessor audioProcessor = this.activeAudioProcessors.get(i);
                    if (audioProcessor.isEnded()) {
                        if (!this.outputBuffers[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                            this.activeAudioProcessors.get(i + 1).queueEndOfStream();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.outputBuffers[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i] = audioProcessor.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i].hasRemaining();
                    }
                }
            }
        }
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }
}
