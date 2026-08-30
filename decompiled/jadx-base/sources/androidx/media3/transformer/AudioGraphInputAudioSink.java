package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class AudioGraphInputAudioSink implements androidx.media3.exoplayer.audio.AudioSink {
    private final androidx.media3.transformer.AudioGraphInputAudioSink.Controller controller;
    private androidx.media3.transformer.AudioGraphInputAudioSink.EditedMediaItemInfo currentEditedMediaItemInfo;
    private androidx.media3.common.Format currentInputFormat;
    private boolean inputStreamEnded;
    private long offsetToCompositionTimeUs;
    private androidx.media3.transformer.AudioGraphInput outputGraphInput;
    private boolean signalledEndOfStream;

    public interface Controller {
        androidx.media3.transformer.AudioGraphInput getAudioGraphInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException;

        long getCurrentPositionUs();

        boolean isEnded();

        default void onPause() {
        }

        default void onPlay() {
        }

        default void onReset() {
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
    }

    public AudioGraphInputAudioSink(androidx.media3.transformer.AudioGraphInputAudioSink.Controller controller) {
        this.controller = controller;
    }

    public void onMediaItemChanged(androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, boolean z) {
        this.currentEditedMediaItemInfo = new androidx.media3.transformer.AudioGraphInputAudioSink.EditedMediaItemInfo(editedMediaItem, z);
        this.offsetToCompositionTimeUs = j;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(androidx.media3.common.Format format, int i, int[] iArr) throws androidx.media3.exoplayer.audio.AudioSink.ConfigurationException {
        androidx.media3.common.util.Assertions.checkArgument(supportsFormat(format));
        androidx.media3.transformer.EditedMediaItem editedMediaItem = ((androidx.media3.transformer.AudioGraphInputAudioSink.EditedMediaItemInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.currentEditedMediaItemInfo)).editedMediaItem;
        androidx.media3.common.util.Assertions.checkArgument(iArr == null);
        this.currentInputFormat = format;
        if (this.outputGraphInput == null) {
            try {
                this.outputGraphInput = this.controller.getAudioGraphInput(editedMediaItem, format);
            } catch (androidx.media3.transformer.ExportException e) {
                throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(e, this.currentInputFormat);
            }
        }
        this.outputGraphInput.onMediaItemChanged(editedMediaItem, androidx.media3.common.C.TIME_UNSET, this.currentInputFormat, false);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (this.currentInputFormat == null) {
            return this.inputStreamEnded;
        }
        return this.inputStreamEnded && (!((androidx.media3.transformer.AudioGraphInputAudioSink.EditedMediaItemInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.currentEditedMediaItemInfo)).isLastInSequence || this.controller.isEnded());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i) {
        androidx.media3.common.util.Assertions.checkState(!this.inputStreamEnded);
        return handleBufferInternal(byteBuffer, j, 0);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        this.inputStreamEnded = true;
        if (this.currentInputFormat == null || this.signalledEndOfStream || !((androidx.media3.transformer.AudioGraphInputAudioSink.EditedMediaItemInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.currentEditedMediaItemInfo)).isLastInSequence) {
            return;
        }
        this.signalledEndOfStream = handleBufferInternal(androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER, Long.MIN_VALUE, 4);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(androidx.media3.common.Format format) {
        return (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_RAW) && format.pcmEncoding == 2) ? 2 : 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(androidx.media3.common.Format format) {
        return getFormatSupport(format) == 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        long currentPositionUs = this.controller.getCurrentPositionUs();
        return currentPositionUs != Long.MIN_VALUE ? currentPositionUs - this.offsetToCompositionTimeUs : currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.controller.onPlay();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.controller.onPause();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.inputStreamEnded = false;
        this.signalledEndOfStream = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        this.currentInputFormat = null;
        this.currentEditedMediaItemInfo = null;
        this.controller.onReset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return androidx.media3.common.PlaybackParameters.DEFAULT;
    }

    private boolean handleBufferInternal(java.nio.ByteBuffer byteBuffer, long j, int i) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.currentInputFormat);
        androidx.media3.common.util.Assertions.checkState(!this.signalledEndOfStream);
        androidx.media3.transformer.AudioGraphInput audioGraphInput = (androidx.media3.transformer.AudioGraphInput) androidx.media3.common.util.Assertions.checkNotNull(this.outputGraphInput);
        androidx.media3.decoder.DecoderInputBuffer inputBuffer = audioGraphInput.getInputBuffer();
        if (inputBuffer == null) {
            return false;
        }
        inputBuffer.ensureSpaceForWrite(byteBuffer.remaining());
        ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(inputBuffer.data)).put(byteBuffer).flip();
        inputBuffer.timeUs = j != Long.MIN_VALUE ? this.offsetToCompositionTimeUs + j : Long.MIN_VALUE;
        inputBuffer.setFlags(i);
        return audioGraphInput.queueInputBuffer();
    }

    private static final class EditedMediaItemInfo {
        public final androidx.media3.transformer.EditedMediaItem editedMediaItem;
        public final boolean isLastInSequence;

        public EditedMediaItemInfo(androidx.media3.transformer.EditedMediaItem editedMediaItem, boolean z) {
            this.editedMediaItem = editedMediaItem;
            this.isLastInSequence = z;
        }
    }
}
