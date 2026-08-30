package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class SequencePlayerRenderersWrapper implements androidx.media3.exoplayer.RenderersFactory {
    private static final int DEFAULT_FRAME_RATE = 30;
    private final androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider;
    private final android.content.Context context;
    private final androidx.media3.exoplayer.image.ImageDecoder.Factory imageDecoderFactory;
    private final androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline;
    private final androidx.media3.transformer.EditedMediaItemSequence sequence;

    public static androidx.media3.transformer.SequencePlayerRenderersWrapper create(android.content.Context context, androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence, androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline, androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, androidx.media3.exoplayer.image.ImageDecoder.Factory factory) {
        return new androidx.media3.transformer.SequencePlayerRenderersWrapper(context, editedMediaItemSequence, previewAudioPipeline, compositingVideoSinkProvider, factory);
    }

    public static androidx.media3.transformer.SequencePlayerRenderersWrapper createForAudio(android.content.Context context, androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence, androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline) {
        return new androidx.media3.transformer.SequencePlayerRenderersWrapper(context, editedMediaItemSequence, previewAudioPipeline, null, null);
    }

    private SequencePlayerRenderersWrapper(android.content.Context context, androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence, androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline, androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, androidx.media3.exoplayer.image.ImageDecoder.Factory factory) {
        this.context = context;
        this.sequence = editedMediaItemSequence;
        this.previewAudioPipeline = previewAudioPipeline;
        this.compositingVideoSinkProvider = compositingVideoSinkProvider;
        this.imageDecoderFactory = factory;
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public androidx.media3.exoplayer.Renderer[] createRenderers(android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.text.TextOutput textOutput, androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new androidx.media3.transformer.SequencePlayerRenderersWrapper.SequenceAudioRenderer(this.context, this, handler, audioRendererEventListener, this.previewAudioPipeline.createInput()));
        if (this.compositingVideoSinkProvider != null) {
            arrayList.add(new androidx.media3.transformer.SequencePlayerRenderersWrapper.SequenceVideoRenderer((android.content.Context) androidx.media3.common.util.Assertions.checkStateNotNull(this.context), handler, videoRendererEventListener, this));
            arrayList.add(new androidx.media3.transformer.SequencePlayerRenderersWrapper.SequenceImageRenderer(this));
        }
        return (androidx.media3.exoplayer.Renderer[]) arrayList.toArray(new androidx.media3.exoplayer.Renderer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getOffsetToCompositionTimeUs(int i, long j) {
        long presentationDurationUs = -j;
        if (i == 0) {
            presentationDurationUs -= this.sequence.editedMediaItems.get(0).mediaItem.clippingConfiguration.startPositionUs;
        }
        for (int i2 = 0; i2 < i; i2++) {
            presentationDurationUs += this.sequence.editedMediaItems.get(i2).getPresentationDurationUs();
        }
        return presentationDurationUs;
    }

    private static final class SequenceAudioRenderer extends androidx.media3.exoplayer.audio.MediaCodecAudioRenderer {
        private final androidx.media3.transformer.AudioGraphInputAudioSink audioSink;
        private androidx.media3.transformer.EditedMediaItem pendingEditedMediaItem;
        private long pendingOffsetToCompositionTimeUs;
        private final androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper;

        public SequenceAudioRenderer(android.content.Context context, androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.transformer.AudioGraphInputAudioSink audioGraphInputAudioSink) {
            super(context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT, handler, audioRendererEventListener, audioGraphInputAudioSink);
            this.sequencePlayerRenderersWrapper = sequencePlayerRenderersWrapper;
            this.audioSink = audioGraphInputAudioSink;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
        public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
            super.render(j, j2);
            do {
                try {
                } catch (androidx.media3.exoplayer.audio.AudioSink.ConfigurationException | androidx.media3.exoplayer.audio.AudioSink.InitializationException | androidx.media3.exoplayer.audio.AudioSink.WriteException | androidx.media3.transformer.ExportException e) {
                    throw createRendererException(e, null, 5002);
                }
            } while (this.sequencePlayerRenderersWrapper.previewAudioPipeline.processData());
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
            androidx.media3.common.util.Assertions.checkState(getTimeline().getWindowCount() == 1);
            int indexOfPeriod = getTimeline().getIndexOfPeriod(mediaPeriodId.periodUid);
            this.pendingEditedMediaItem = this.sequencePlayerRenderersWrapper.sequence.editedMediaItems.get(indexOfPeriod);
            this.pendingOffsetToCompositionTimeUs = this.sequencePlayerRenderersWrapper.getOffsetToCompositionTimeUs(indexOfPeriod, j2);
            super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        }

        @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
        protected void onProcessedStreamChange() {
            super.onProcessedStreamChange();
            onMediaItemChanged();
        }

        @Override // androidx.media3.exoplayer.audio.MediaCodecAudioRenderer, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
            super.onPositionReset(j, z);
            onMediaItemChanged();
        }

        private void onMediaItemChanged() {
            androidx.media3.transformer.EditedMediaItem editedMediaItem = (androidx.media3.transformer.EditedMediaItem) androidx.media3.common.util.Assertions.checkStateNotNull(this.pendingEditedMediaItem);
            this.audioSink.onMediaItemChanged(editedMediaItem, this.pendingOffsetToCompositionTimeUs, editedMediaItem == com.google.common.collect.Iterables.getLast(this.sequencePlayerRenderersWrapper.sequence.editedMediaItems));
        }
    }

    private static final class SequenceVideoRenderer extends androidx.media3.exoplayer.video.MediaCodecVideoRenderer {
        private long offsetToCompositionTimeUs;
        private com.google.common.collect.ImmutableList<androidx.media3.common.Effect> pendingEffect;
        private final androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper;
        private final androidx.media3.exoplayer.video.VideoSink videoSink;

        public SequenceVideoRenderer(android.content.Context context, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper) {
            super(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.getDefault(context), androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT, 5000L, false, handler, videoRendererEventListener, 50, 30.0f, (androidx.media3.exoplayer.video.VideoSinkProvider) androidx.media3.common.util.Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.compositingVideoSinkProvider));
            this.sequencePlayerRenderersWrapper = sequencePlayerRenderersWrapper;
            this.videoSink = ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider) androidx.media3.common.util.Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.compositingVideoSinkProvider)).getSink();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
            androidx.media3.common.util.Assertions.checkState(getTimeline().getWindowCount() == 1);
            super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
            int indexOfPeriod = getTimeline().getIndexOfPeriod(mediaPeriodId.periodUid);
            this.offsetToCompositionTimeUs = this.sequencePlayerRenderersWrapper.getOffsetToCompositionTimeUs(indexOfPeriod, j2);
            this.pendingEffect = this.sequencePlayerRenderersWrapper.sequence.editedMediaItems.get(indexOfPeriod).effects.videoEffects;
        }

        @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
        protected long getBufferTimestampAdjustmentUs() {
            return this.offsetToCompositionTimeUs;
        }

        @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
        protected void onReadyToRegisterVideoSinkInputStream() {
            com.google.common.collect.ImmutableList<androidx.media3.common.Effect> immutableList = this.pendingEffect;
            if (immutableList != null) {
                this.videoSink.setPendingVideoEffects(immutableList);
                this.pendingEffect = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SequenceImageRenderer extends androidx.media3.exoplayer.image.ImageRenderer {
        private final androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider;
        private androidx.media3.transformer.EditedMediaItem editedMediaItem;
        private boolean inputStreamPendingRegistration;
        private boolean mayRenderStartOfStream;
        private long offsetToCompositionTimeUs;
        private androidx.media3.exoplayer.ExoPlaybackException pendingExoPlaybackException;
        private final androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper;
        private long streamOffsetUs;
        private androidx.media3.common.util.ConstantRateTimestampIterator timestampIterator;
        private com.google.common.collect.ImmutableList<androidx.media3.common.Effect> videoEffects;
        private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
        private final androidx.media3.exoplayer.video.VideoSink videoSink;

        static /* synthetic */ void lambda$onEnabled$0(java.lang.Runnable runnable) {
        }

        public SequenceImageRenderer(androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapper) {
            super((androidx.media3.exoplayer.image.ImageDecoder.Factory) androidx.media3.common.util.Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.imageDecoderFactory), androidx.media3.exoplayer.image.ImageOutput.NO_OP);
            this.sequencePlayerRenderersWrapper = sequencePlayerRenderersWrapper;
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider = (androidx.media3.exoplayer.video.CompositingVideoSinkProvider) androidx.media3.common.util.Assertions.checkStateNotNull(sequencePlayerRenderersWrapper.compositingVideoSinkProvider);
            this.compositingVideoSinkProvider = compositingVideoSinkProvider;
            this.videoSink = compositingVideoSinkProvider.getSink();
            this.videoFrameReleaseControl = (androidx.media3.exoplayer.video.VideoFrameReleaseControl) androidx.media3.common.util.Assertions.checkStateNotNull(compositingVideoSinkProvider.getVideoFrameReleaseControl());
            this.videoEffects = com.google.common.collect.ImmutableList.of();
            this.streamOffsetUs = androidx.media3.common.C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
            super.onEnabled(z, z2);
            this.mayRenderStartOfStream = z2;
            this.videoSink.onRendererEnabled(z2);
            if (z) {
                this.videoFrameReleaseControl.join(false);
            }
            if (!this.videoSink.isInitialized()) {
                androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().build();
                try {
                    this.videoSink.initialize(formatBuild);
                } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
                    throw createRendererException(e, formatBuild, 7000);
                }
            }
            this.videoSink.setListener(androidx.media3.exoplayer.video.VideoSink.Listener.NO_OP, new java.util.concurrent.Executor() { // from class: androidx.media3.transformer.SequencePlayerRenderersWrapper$SequenceImageRenderer$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    androidx.media3.transformer.SequencePlayerRenderersWrapper.SequenceImageRenderer.lambda$onEnabled$0(runnable);
                }
            });
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onDisabled() {
            super.onDisabled();
            this.videoSink.onRendererDisabled();
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.Renderer
        public boolean isEnded() {
            androidx.media3.common.util.ConstantRateTimestampIterator constantRateTimestampIterator;
            return super.isEnded() && this.videoSink.isEnded() && ((constantRateTimestampIterator = this.timestampIterator) == null || !constantRateTimestampIterator.hasNext());
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.Renderer
        public boolean isReady() {
            return super.isReady() && (!this.mayRenderStartOfStream || this.videoSink.isReady());
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onReset() {
            super.onReset();
            this.pendingExoPlaybackException = null;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
            this.videoSink.flush(true);
            super.onPositionReset(j, z);
            this.timestampIterator = createTimestampIterator(j);
            if (z) {
                this.videoFrameReleaseControl.join(false);
            }
        }

        @Override // androidx.media3.exoplayer.BaseRenderer
        protected void onStarted() throws androidx.media3.exoplayer.ExoPlaybackException {
            super.onStarted();
            this.videoSink.onRendererStarted();
        }

        @Override // androidx.media3.exoplayer.BaseRenderer
        protected void onStopped() {
            super.onStopped();
            this.videoSink.onRendererStopped();
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.BaseRenderer
        protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
            androidx.media3.common.util.Assertions.checkState(getTimeline().getWindowCount() == 1);
            super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
            this.streamOffsetUs = j2;
            int indexOfPeriod = getTimeline().getIndexOfPeriod(mediaPeriodId.periodUid);
            this.editedMediaItem = this.sequencePlayerRenderersWrapper.sequence.editedMediaItems.get(indexOfPeriod);
            this.offsetToCompositionTimeUs = this.sequencePlayerRenderersWrapper.getOffsetToCompositionTimeUs(indexOfPeriod, j2);
            this.timestampIterator = createTimestampIterator(j);
            this.videoEffects = this.editedMediaItem.effects.videoEffects;
            this.inputStreamPendingRegistration = true;
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer, androidx.media3.exoplayer.Renderer
        public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
            androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = this.pendingExoPlaybackException;
            if (exoPlaybackException != null) {
                this.pendingExoPlaybackException = null;
                throw exoPlaybackException;
            }
            super.render(j, j2);
            this.compositingVideoSinkProvider.render(j, j2);
        }

        @Override // androidx.media3.exoplayer.image.ImageRenderer
        protected boolean processOutputBuffer(long j, long j2, android.graphics.Bitmap bitmap, long j3) {
            if (this.inputStreamPendingRegistration) {
                androidx.media3.common.util.Assertions.checkState(this.streamOffsetUs != androidx.media3.common.C.TIME_UNSET);
                this.videoSink.setPendingVideoEffects(this.videoEffects);
                this.videoSink.setStreamOffsetAndAdjustmentUs(this.streamOffsetUs, this.offsetToCompositionTimeUs);
                this.videoSink.registerInputStream(2, new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.IMAGE_RAW).setWidth(bitmap.getWidth()).setHeight(bitmap.getHeight()).setColorInfo(androidx.media3.common.ColorInfo.SRGB_BT709_FULL).setFrameRate(30.0f).build());
                this.inputStreamPendingRegistration = false;
            }
            return this.videoSink.queueBitmap(bitmap, (androidx.media3.common.util.TimestampIterator) androidx.media3.common.util.Assertions.checkStateNotNull(this.timestampIterator));
        }

        private androidx.media3.common.util.ConstantRateTimestampIterator createTimestampIterator(long j) {
            long j2 = this.streamOffsetUs;
            long j3 = this.offsetToCompositionTimeUs + j2;
            return new androidx.media3.common.util.ConstantRateTimestampIterator(j3 + (j - j2), j3 + ((androidx.media3.transformer.EditedMediaItem) androidx.media3.common.util.Assertions.checkNotNull(this.editedMediaItem)).getPresentationDurationUs(), 30.0f);
        }
    }
}
