package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextRenderer extends androidx.media3.exoplayer.BaseRenderer implements android.os.Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "TextRenderer";
    private final androidx.media3.extractor.text.CueDecoder cueDecoder;
    private final androidx.media3.decoder.DecoderInputBuffer cueDecoderInputBuffer;
    private androidx.media3.exoplayer.text.CuesResolver cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final androidx.media3.exoplayer.FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;
    private androidx.media3.extractor.text.SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private androidx.media3.extractor.text.SubtitleInputBuffer nextSubtitleInputBuffer;
    private final androidx.media3.exoplayer.text.TextOutput output;
    private final android.os.Handler outputHandler;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private androidx.media3.common.Format streamFormat;
    private androidx.media3.extractor.text.SubtitleOutputBuffer subtitle;
    private androidx.media3.extractor.text.SubtitleDecoder subtitleDecoder;
    private final androidx.media3.exoplayer.text.SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    public TextRenderer(androidx.media3.exoplayer.text.TextOutput textOutput, android.os.Looper looper) {
        this(textOutput, looper, androidx.media3.exoplayer.text.SubtitleDecoderFactory.DEFAULT);
    }

    public TextRenderer(androidx.media3.exoplayer.text.TextOutput textOutput, android.os.Looper looper, androidx.media3.exoplayer.text.SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.output = (androidx.media3.exoplayer.text.TextOutput) androidx.media3.common.util.Assertions.checkNotNull(textOutput);
        this.outputHandler = looper == null ? null : androidx.media3.common.util.Util.createHandler(looper, this);
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new androidx.media3.extractor.text.CueDecoder();
        this.cueDecoderInputBuffer = new androidx.media3.decoder.DecoderInputBuffer(1);
        this.formatHolder = new androidx.media3.exoplayer.FormatHolder();
        this.finalStreamEndPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.outputStreamOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.lastRendererPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.legacyDecodingEnabled = false;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) {
        if (isCuesWithTiming(format) || this.subtitleDecoderFactory.supportsFormat(format)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(format.cryptoType == 0 ? 4 : 2);
        }
        if (androidx.media3.common.MimeTypes.isText(format.sampleMimeType)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(1);
        }
        return androidx.media3.exoplayer.RendererCapabilities.create(0);
    }

    public void setFinalStreamEndPositionUs(long j) {
        androidx.media3.common.util.Assertions.checkState(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.text.CuesResolver replacingCuesResolver;
        this.outputStreamOffsetUs = j2;
        androidx.media3.common.Format format = formatArr[0];
        this.streamFormat = format;
        if (!isCuesWithTiming(format)) {
            assertLegacyDecodingEnabledIfRequired();
            if (this.subtitleDecoder != null) {
                this.decoderReplacementState = 1;
                return;
            } else {
                initSubtitleDecoder();
                return;
            }
        }
        if (this.streamFormat.cueReplacementBehavior == 1) {
            replacingCuesResolver = new androidx.media3.exoplayer.text.MergingCuesResolver();
        } else {
            replacingCuesResolver = new androidx.media3.exoplayer.text.ReplacingCuesResolver();
        }
        this.cuesResolver = replacingCuesResolver;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) {
        this.lastRendererPositionUs = j;
        androidx.media3.exoplayer.text.CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = androidx.media3.common.C.TIME_UNSET;
        androidx.media3.common.Format format = this.streamFormat;
        if (format == null || isCuesWithTiming(format)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        androidx.media3.extractor.text.SubtitleDecoder subtitleDecoder = (androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder);
        subtitleDecoder.flush();
        subtitleDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        if (isCurrentStreamFinal()) {
            long j3 = this.finalStreamEndPositionUs;
            if (j3 != androidx.media3.common.C.TIME_UNSET && j >= j3) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        if (isCuesWithTiming((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.streamFormat))) {
            androidx.media3.common.util.Assertions.checkNotNull(this.cuesResolver);
            renderFromCuesWithTiming(j);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j);
        }
    }

    @java.lang.Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z) {
        this.legacyDecodingEnabled = z;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.cuesResolver"})
    private void renderFromCuesWithTiming(long j) {
        boolean andDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !andDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j) {
            andDecodeCuesWithTiming = true;
        }
        if (andDecodeCuesWithTiming) {
            com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j);
            updateOutput(new androidx.media3.common.text.CueGroup(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.cuesResolver"})
    private boolean readAndDecodeCuesWithTiming(long j) {
        if (this.inputStreamEnded || readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) != -4) {
            return false;
        }
        if (this.cueDecoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return false;
        }
        this.cueDecoderInputBuffer.flip();
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.cueDecoderInputBuffer.data);
        androidx.media3.extractor.text.CuesWithTiming cuesWithTimingDecode = this.cueDecoder.decode(this.cueDecoderInputBuffer.timeUs, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.cueDecoderInputBuffer.clear();
        return this.cuesResolver.addCues(cuesWithTimingDecode, j);
    }

    private void renderFromSubtitles(long j) {
        boolean z;
        this.lastRendererPositionUs = j;
        if (this.nextSubtitle == null) {
            ((androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder)).setPositionUs(j);
            try {
                this.nextSubtitle = ((androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder)).dequeueOutputBuffer();
            } catch (androidx.media3.extractor.text.SubtitleDecoderException e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer = this.nextSubtitle;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.decoderReplacementState == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= j) {
                androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer2 = this.subtitle;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.release();
                }
                this.nextSubtitleEventIndex = subtitleOutputBuffer.getNextEventTimeIndex(j);
                this.subtitle = subtitleOutputBuffer;
                this.nextSubtitle = null;
                z = true;
            }
        }
        if (z) {
            androidx.media3.common.util.Assertions.checkNotNull(this.subtitle);
            updateOutput(new androidx.media3.common.text.CueGroup(this.subtitle.getCues(j), getPresentationTimeUs(getCurrentEventTimeUs(j))));
        }
        if (this.decoderReplacementState == 2) {
            return;
        }
        while (!this.inputStreamEnded) {
            try {
                androidx.media3.extractor.text.SubtitleInputBuffer subtitleInputBufferDequeueInputBuffer = this.nextSubtitleInputBuffer;
                if (subtitleInputBufferDequeueInputBuffer == null) {
                    subtitleInputBufferDequeueInputBuffer = ((androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder)).dequeueInputBuffer();
                    if (subtitleInputBufferDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.nextSubtitleInputBuffer = subtitleInputBufferDequeueInputBuffer;
                    }
                }
                if (this.decoderReplacementState == 1) {
                    subtitleInputBufferDequeueInputBuffer.setFlags(4);
                    ((androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder)).queueInputBuffer(subtitleInputBufferDequeueInputBuffer);
                    this.nextSubtitleInputBuffer = null;
                    this.decoderReplacementState = 2;
                    return;
                }
                int source = readSource(this.formatHolder, subtitleInputBufferDequeueInputBuffer, 0);
                if (source == -4) {
                    if (subtitleInputBufferDequeueInputBuffer.isEndOfStream()) {
                        this.inputStreamEnded = true;
                        this.waitingForKeyFrame = false;
                    } else {
                        androidx.media3.common.Format format = this.formatHolder.format;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBufferDequeueInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs;
                        subtitleInputBufferDequeueInputBuffer.flip();
                        this.waitingForKeyFrame &= !subtitleInputBufferDequeueInputBuffer.isKeyFrame();
                    }
                    if (!this.waitingForKeyFrame) {
                        ((androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder)).queueInputBuffer(subtitleInputBufferDequeueInputBuffer);
                        this.nextSubtitleInputBuffer = null;
                    }
                } else if (source == -3) {
                    return;
                }
            } catch (androidx.media3.extractor.text.SubtitleDecoderException e2) {
                handleDecoderError(e2);
                return;
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = androidx.media3.common.C.TIME_UNSET;
        clearOutput();
        this.outputStreamOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.lastRendererPositionUs = androidx.media3.common.C.TIME_UNSET;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        ((androidx.media3.extractor.text.SubtitleDecoder) androidx.media3.common.util.Assertions.checkNotNull(this.subtitleDecoder)).release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        androidx.media3.extractor.text.SubtitleDecoder subtitleDecoderCreateDecoder = this.subtitleDecoderFactory.createDecoder((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.streamFormat));
        this.subtitleDecoder = subtitleDecoderCreateDecoder;
        subtitleDecoderCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        androidx.media3.common.util.Assertions.checkNotNull(this.subtitle);
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    private void updateOutput(androidx.media3.common.text.CueGroup cueGroup) {
        android.os.Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    private void clearOutput() {
        updateOutput(new androidx.media3.common.text.CueGroup(com.google.common.collect.ImmutableList.of(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            invokeUpdateOutputInternal((androidx.media3.common.text.CueGroup) message.obj);
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private void invokeUpdateOutputInternal(androidx.media3.common.text.CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    private void handleDecoderError(androidx.media3.extractor.text.SubtitleDecoderException subtitleDecoderException) {
        androidx.media3.common.util.Log.e(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"subtitle"})
    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        if (nextEventTimeIndex == -1) {
            androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
            return subtitleOutputBuffer.getEventTime(subtitleOutputBuffer.getEventTimeCount() - 1);
        }
        return this.subtitle.getEventTime(nextEventTimeIndex - 1);
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getPresentationTimeUs(long j) {
        androidx.media3.common.util.Assertions.checkState(j != androidx.media3.common.C.TIME_UNSET);
        androidx.media3.common.util.Assertions.checkState(this.outputStreamOffsetUs != androidx.media3.common.C.TIME_UNSET);
        return j - this.outputStreamOffsetUs;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"streamFormat"})
    private void assertLegacyDecodingEnabledIfRequired() {
        androidx.media3.common.util.Assertions.checkState(this.legacyDecodingEnabled || java.util.Objects.equals(this.streamFormat.sampleMimeType, androidx.media3.common.MimeTypes.APPLICATION_CEA608) || java.util.Objects.equals(this.streamFormat.sampleMimeType, androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608) || java.util.Objects.equals(this.streamFormat.sampleMimeType, androidx.media3.common.MimeTypes.APPLICATION_CEA708), "Legacy decoding is disabled, can't handle " + this.streamFormat.sampleMimeType + " samples (expected application/x-media3-cues).");
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private static boolean isCuesWithTiming(androidx.media3.common.Format format) {
        return java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES);
    }
}
