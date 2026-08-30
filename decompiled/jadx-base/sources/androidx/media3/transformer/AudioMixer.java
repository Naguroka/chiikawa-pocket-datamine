package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioMixer {

    public interface Factory {
        androidx.media3.transformer.AudioMixer create();
    }

    int addSource(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, long j) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;

    void configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, int i, long j) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;

    java.nio.ByteBuffer getOutput();

    boolean hasSource(int i);

    boolean isEnded();

    void queueInput(int i, java.nio.ByteBuffer byteBuffer);

    void removeSource(int i);

    void reset();

    void setEndTimeUs(long j);

    void setSourceVolume(int i, float f);

    boolean supportsSourceAudioFormat(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat);

    @java.lang.Deprecated
    static androidx.media3.transformer.AudioMixer create() {
        return new androidx.media3.transformer.DefaultAudioMixer.Factory(true, true).create();
    }
}
