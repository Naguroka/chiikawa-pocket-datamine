package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingAudioSink implements androidx.media3.exoplayer.audio.AudioSink {
    private final androidx.media3.exoplayer.audio.AudioSink sink;

    public ForwardingAudioSink(androidx.media3.exoplayer.audio.AudioSink audioSink) {
        this.sink = audioSink;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener) {
        this.sink.setListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.sink.setPlayerId(playerId);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(androidx.media3.common.util.Clock clock) {
        this.sink.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(androidx.media3.common.Format format) {
        return this.sink.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(androidx.media3.common.Format format) {
        return this.sink.getFormatSupport(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.AudioOffloadSupport getFormatOffloadSupport(androidx.media3.common.Format format) {
        return this.sink.getFormatOffloadSupport(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        return this.sink.getCurrentPositionUs(z);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(androidx.media3.common.Format format, int i, int[] iArr) throws androidx.media3.exoplayer.audio.AudioSink.ConfigurationException {
        this.sink.configure(format, i, iArr);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.sink.play();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.sink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i) throws androidx.media3.exoplayer.audio.AudioSink.WriteException, androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        return this.sink.handleBuffer(byteBuffer, j, i);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws androidx.media3.exoplayer.audio.AudioSink.WriteException {
        this.sink.playToEndOfStream();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return this.sink.isEnded();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return this.sink.hasPendingData();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.sink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.sink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.sink.setSkipSilenceEnabled(z);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.sink.getSkipSilenceEnabled();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        this.sink.setAudioAttributes(audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.sink.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
        this.sink.setAudioSessionId(i);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        this.sink.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.sink.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOutputStreamOffsetUs(long j) {
        this.sink.setOutputStreamOffsetUs(j);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        this.sink.enableTunnelingV21();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        this.sink.disableTunneling();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i) {
        this.sink.setOffloadMode(i);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i, int i2) {
        this.sink.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
        this.sink.setVolume(f);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.sink.pause();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.sink.flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        this.sink.reset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.sink.release();
    }
}
