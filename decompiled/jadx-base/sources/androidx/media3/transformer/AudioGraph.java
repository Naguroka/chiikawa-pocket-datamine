package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class AudioGraph {
    private static final java.lang.String TAG = "AudioGraph";
    private final androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
    private int finishedInputs;
    private boolean isMixerConfigured;
    private boolean isMixerReady;
    private final androidx.media3.transformer.AudioMixer mixer;
    private long pendingStartTimeUs;
    private final java.util.List<androidx.media3.transformer.AudioGraph.InputInfo> inputInfos = new java.util.ArrayList();
    private androidx.media3.common.audio.AudioProcessor.AudioFormat mixerAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private java.nio.ByteBuffer mixerOutput = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;

    public AudioGraph(androidx.media3.transformer.AudioMixer.Factory factory, com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> immutableList) {
        this.mixer = factory.create();
        this.audioProcessingPipeline = new androidx.media3.common.audio.AudioProcessingPipeline(immutableList);
    }

    public static boolean isInputAudioFormatValid(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return (audioFormat.encoding == -1 || audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) ? false : true;
    }

    public androidx.media3.transformer.AudioGraphInput registerInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        androidx.media3.common.util.Assertions.checkArgument(format.pcmEncoding != -1);
        try {
            androidx.media3.transformer.AudioGraphInput audioGraphInput = new androidx.media3.transformer.AudioGraphInput(this.mixerAudioFormat, editedMediaItem, format);
            if (java.util.Objects.equals(this.mixerAudioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET)) {
                androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = audioGraphInput.getOutputAudioFormat();
                this.mixerAudioFormat = outputAudioFormat;
                this.audioProcessingPipeline.configure(outputAudioFormat);
                this.audioProcessingPipeline.flush();
            }
            this.inputInfos.add(new androidx.media3.transformer.AudioGraph.InputInfo(audioGraphInput));
            androidx.media3.effect.DebugTraceUtil.logEvent("AudioGraph", androidx.media3.effect.DebugTraceUtil.EVENT_REGISTER_NEW_INPUT_STREAM, androidx.media3.common.C.TIME_UNSET, "%s", format);
            return audioGraphInput;
        } catch (androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException e) {
            throw androidx.media3.transformer.ExportException.createForAudioProcessing(e, "Error while registering input " + this.inputInfos.size());
        }
    }

    public androidx.media3.common.audio.AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.audioProcessingPipeline.getOutputAudioFormat();
    }

    public java.nio.ByteBuffer getOutput() throws androidx.media3.transformer.ExportException {
        if (!ensureMixerReady()) {
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        if (!this.mixer.isEnded()) {
            feedMixer();
        }
        if (!this.mixerOutput.hasRemaining()) {
            this.mixerOutput = this.mixer.getOutput();
        }
        if (this.audioProcessingPipeline.isOperational()) {
            feedProcessingPipelineFromMixer();
            return this.audioProcessingPipeline.getOutput();
        }
        return this.mixerOutput;
    }

    public void blockInput() {
        for (int i = 0; i < this.inputInfos.size(); i++) {
            this.inputInfos.get(i).audioGraphInput.blockInput();
        }
    }

    public void unblockInput() {
        for (int i = 0; i < this.inputInfos.size(); i++) {
            this.inputInfos.get(i).audioGraphInput.unblockInput();
        }
    }

    public void setPendingStartTimeUs(long j) {
        this.pendingStartTimeUs = j;
    }

    public void flush() {
        for (int i = 0; i < this.inputInfos.size(); i++) {
            androidx.media3.transformer.AudioGraph.InputInfo inputInfo = this.inputInfos.get(i);
            inputInfo.mixerSourceId = -1;
            inputInfo.audioGraphInput.flush();
        }
        this.mixer.reset();
        this.isMixerConfigured = false;
        this.isMixerReady = false;
        this.mixerOutput = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.audioProcessingPipeline.flush();
        this.finishedInputs = 0;
    }

    public void reset() {
        for (int i = 0; i < this.inputInfos.size(); i++) {
            this.inputInfos.get(i).audioGraphInput.release();
        }
        this.inputInfos.clear();
        this.mixer.reset();
        this.audioProcessingPipeline.reset();
        this.finishedInputs = 0;
        this.mixerOutput = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.mixerAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    public boolean isEnded() {
        if (this.audioProcessingPipeline.isOperational()) {
            return this.audioProcessingPipeline.isEnded();
        }
        return isMixerEnded();
    }

    private boolean ensureMixerReady() throws androidx.media3.transformer.ExportException {
        if (this.isMixerReady) {
            return true;
        }
        if (!this.isMixerConfigured) {
            try {
                this.mixer.configure(this.mixerAudioFormat, -1, this.pendingStartTimeUs);
                this.isMixerConfigured = true;
            } catch (androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException e) {
                throw androidx.media3.transformer.ExportException.createForAudioProcessing(e, "Error while configuring mixer");
            }
        }
        this.isMixerReady = true;
        for (int i = 0; i < this.inputInfos.size(); i++) {
            androidx.media3.transformer.AudioGraph.InputInfo inputInfo = this.inputInfos.get(i);
            if (inputInfo.mixerSourceId == -1) {
                androidx.media3.transformer.AudioGraphInput audioGraphInput = inputInfo.audioGraphInput;
                try {
                    audioGraphInput.getOutput();
                    long startTimeUs = audioGraphInput.getStartTimeUs();
                    if (startTimeUs == androidx.media3.common.C.TIME_UNSET) {
                        this.isMixerReady = false;
                    } else if (startTimeUs != Long.MIN_VALUE) {
                        inputInfo.mixerSourceId = this.mixer.addSource(audioGraphInput.getOutputAudioFormat(), startTimeUs);
                    }
                } catch (androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException e2) {
                    throw androidx.media3.transformer.ExportException.createForAudioProcessing(e2, "Unhandled format while adding source " + inputInfo.mixerSourceId);
                }
            }
        }
        return this.isMixerReady;
    }

    private void feedMixer() throws androidx.media3.transformer.ExportException {
        for (int i = 0; i < this.inputInfos.size(); i++) {
            feedMixerFromInput(this.inputInfos.get(i));
        }
    }

    private void feedMixerFromInput(androidx.media3.transformer.AudioGraph.InputInfo inputInfo) throws androidx.media3.transformer.ExportException {
        int i = inputInfo.mixerSourceId;
        if (this.mixer.hasSource(i)) {
            androidx.media3.transformer.AudioGraphInput audioGraphInput = inputInfo.audioGraphInput;
            if (audioGraphInput.isEnded()) {
                this.mixer.removeSource(i);
                inputInfo.mixerSourceId = -1;
                this.finishedInputs++;
            } else {
                try {
                    this.mixer.queueInput(i, audioGraphInput.getOutput());
                } catch (androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException e) {
                    throw androidx.media3.transformer.ExportException.createForAudioProcessing(e, "AudioGraphInput (sourceId=" + i + ") reconfiguration");
                }
            }
        }
    }

    private void feedProcessingPipelineFromMixer() {
        if (isMixerEnded()) {
            this.audioProcessingPipeline.queueEndOfStream();
        } else {
            this.audioProcessingPipeline.queueInput(this.mixerOutput);
        }
    }

    private boolean isMixerEnded() {
        return !this.mixerOutput.hasRemaining() && this.finishedInputs >= this.inputInfos.size() && this.mixer.isEnded();
    }

    private static final class InputInfo {
        public final androidx.media3.transformer.AudioGraphInput audioGraphInput;
        public int mixerSourceId = -1;

        public InputInfo(androidx.media3.transformer.AudioGraphInput audioGraphInput) {
            this.audioGraphInput = audioGraphInput;
        }
    }
}
