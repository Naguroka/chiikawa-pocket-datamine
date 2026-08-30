package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class PreviewAudioPipeline {
    private final androidx.media3.transformer.AudioGraph audioGraph;
    private int audioGraphInputsCreated;
    private final androidx.media3.exoplayer.audio.AudioSink finalAudioSink;
    private int inputAudioSinksCreated;
    private int inputAudioSinksPlaying;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private long outputFramesWritten;
    private long seekPositionUs;

    static /* synthetic */ int access$008(androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.inputAudioSinksCreated;
        previewAudioPipeline.inputAudioSinksCreated = i + 1;
        return i;
    }

    static /* synthetic */ int access$208(androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.audioGraphInputsCreated;
        previewAudioPipeline.audioGraphInputsCreated = i + 1;
        return i;
    }

    static /* synthetic */ int access$408(androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.inputAudioSinksPlaying;
        previewAudioPipeline.inputAudioSinksPlaying = i + 1;
        return i;
    }

    static /* synthetic */ int access$410(androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.inputAudioSinksPlaying;
        previewAudioPipeline.inputAudioSinksPlaying = i - 1;
        return i;
    }

    public PreviewAudioPipeline(androidx.media3.transformer.AudioMixer.Factory factory, com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> immutableList, androidx.media3.exoplayer.audio.AudioSink audioSink) {
        this.audioGraph = new androidx.media3.transformer.AudioGraph(factory, immutableList);
        this.finalAudioSink = audioSink;
    }

    public void release() {
        this.audioGraph.reset();
        this.finalAudioSink.reset();
        this.finalAudioSink.release();
        this.audioGraphInputsCreated = 0;
        this.inputAudioSinksCreated = 0;
        this.inputAudioSinksPlaying = 0;
    }

    public androidx.media3.transformer.AudioGraphInputAudioSink createInput() {
        return new androidx.media3.transformer.AudioGraphInputAudioSink(new androidx.media3.transformer.PreviewAudioPipeline.SinkController());
    }

    public boolean processData() throws androidx.media3.transformer.ExportException, androidx.media3.exoplayer.audio.AudioSink.WriteException, androidx.media3.exoplayer.audio.AudioSink.InitializationException, androidx.media3.exoplayer.audio.AudioSink.ConfigurationException {
        int i = this.inputAudioSinksCreated;
        if (i == 0 || i != this.audioGraphInputsCreated) {
            return false;
        }
        if (java.util.Objects.equals(this.outputAudioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET)) {
            androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = this.audioGraph.getOutputAudioFormat();
            if (java.util.Objects.equals(outputAudioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET)) {
                return false;
            }
            this.finalAudioSink.configure(androidx.media3.common.util.Util.getPcmFormat(outputAudioFormat), 0, null);
            this.outputAudioFormat = outputAudioFormat;
        }
        if (this.audioGraph.isEnded()) {
            if (this.finalAudioSink.isEnded()) {
                return false;
            }
            this.finalAudioSink.playToEndOfStream();
            return false;
        }
        java.nio.ByteBuffer output = this.audioGraph.getOutput();
        if (!output.hasRemaining()) {
            return false;
        }
        int iRemaining = output.remaining();
        boolean zHandleBuffer = this.finalAudioSink.handleBuffer(output, getBufferPresentationTimeUs(), 1);
        this.outputFramesWritten += (long) ((iRemaining - output.remaining()) / this.outputAudioFormat.bytesPerFrame);
        return zHandleBuffer;
    }

    private long getBufferPresentationTimeUs() {
        return this.seekPositionUs + androidx.media3.common.util.Util.sampleCountToDurationUs(this.outputFramesWritten, this.outputAudioFormat.sampleRate);
    }

    public void startSeek(long j) {
        this.finalAudioSink.pause();
        this.audioGraph.blockInput();
        this.audioGraph.setPendingStartTimeUs(j);
        this.audioGraph.flush();
        this.finalAudioSink.flush();
        this.outputFramesWritten = 0L;
        this.seekPositionUs = j;
    }

    public void endSeek() {
        this.audioGraph.unblockInput();
    }

    private final class SinkController implements androidx.media3.transformer.AudioGraphInputAudioSink.Controller {
        private boolean playing;

        public SinkController() {
            androidx.media3.transformer.PreviewAudioPipeline.access$008(androidx.media3.transformer.PreviewAudioPipeline.this);
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public androidx.media3.transformer.AudioGraphInput getAudioGraphInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
            androidx.media3.transformer.AudioGraphInput audioGraphInputRegisterInput = androidx.media3.transformer.PreviewAudioPipeline.this.audioGraph.registerInput(editedMediaItem, format);
            androidx.media3.transformer.PreviewAudioPipeline.access$208(androidx.media3.transformer.PreviewAudioPipeline.this);
            return audioGraphInputRegisterInput;
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public long getCurrentPositionUs() {
            return androidx.media3.transformer.PreviewAudioPipeline.this.finalAudioSink.getCurrentPositionUs(false);
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public boolean isEnded() {
            return androidx.media3.transformer.PreviewAudioPipeline.this.finalAudioSink.isEnded();
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public void onPlay() {
            if (this.playing) {
                return;
            }
            this.playing = true;
            androidx.media3.transformer.PreviewAudioPipeline.access$408(androidx.media3.transformer.PreviewAudioPipeline.this);
            if (androidx.media3.transformer.PreviewAudioPipeline.this.inputAudioSinksCreated == androidx.media3.transformer.PreviewAudioPipeline.this.inputAudioSinksPlaying) {
                androidx.media3.transformer.PreviewAudioPipeline.this.finalAudioSink.play();
            }
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public void onPause() {
            if (this.playing) {
                this.playing = false;
                if (androidx.media3.transformer.PreviewAudioPipeline.this.inputAudioSinksCreated == androidx.media3.transformer.PreviewAudioPipeline.this.inputAudioSinksPlaying) {
                    androidx.media3.transformer.PreviewAudioPipeline.this.finalAudioSink.pause();
                }
                androidx.media3.transformer.PreviewAudioPipeline.access$410(androidx.media3.transformer.PreviewAudioPipeline.this);
            }
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public void onReset() {
            onPause();
        }
    }
}
