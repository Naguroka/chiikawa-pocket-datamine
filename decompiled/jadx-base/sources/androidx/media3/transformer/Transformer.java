package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class Transformer {
    public static final long DEFAULT_MAX_DELAY_BETWEEN_MUXER_SAMPLES_MS = 10000;
    public static final int PROGRESS_STATE_AVAILABLE = 2;
    public static final int PROGRESS_STATE_NOT_STARTED = 0;

    @java.lang.Deprecated
    public static final int PROGRESS_STATE_NO_TRANSFORMATION = 0;
    public static final int PROGRESS_STATE_UNAVAILABLE = 3;
    public static final int PROGRESS_STATE_WAITING_FOR_AVAILABILITY = 1;
    private static final int TRANSFORMER_STATE_COPY_OUTPUT = 4;
    private static final int TRANSFORMER_STATE_PROCESS_AUDIO = 3;
    private static final int TRANSFORMER_STATE_PROCESS_FULL_INPUT = 0;
    private static final int TRANSFORMER_STATE_PROCESS_MEDIA_START = 5;
    private static final int TRANSFORMER_STATE_PROCESS_REMAINING_VIDEO = 2;
    private static final int TRANSFORMER_STATE_REMUX_PROCESSED_VIDEO = 1;
    private static final int TRANSFORMER_STATE_REMUX_REMAINING_MEDIA = 6;
    private final androidx.media3.common.util.HandlerWrapper applicationHandler;
    private final androidx.media3.transformer.AssetLoader.Factory assetLoaderFactory;
    private final androidx.media3.transformer.AudioMixer.Factory audioMixerFactory;
    private final com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> audioProcessors;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.transformer.Transformer.ComponentListener componentListener;
    private androidx.media3.transformer.Composition composition;
    private final android.content.Context context;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> copyOutputFuture;
    private final androidx.media3.common.DebugViewProvider debugViewProvider;
    private final androidx.media3.transformer.Codec.EncoderFactory encoderFactory;
    private final androidx.media3.transformer.ExportResult.Builder exportResultBuilder;
    private final boolean fileStartsOnVideoFrameEnabled;
    private final boolean flattenForSlowMotion;
    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata> getResumeMetadataFuture;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.transformer.Transformer.Listener> listeners;
    private final android.os.Looper looper;
    private final long maxDelayBetweenMuxerSamplesMs;
    private androidx.media3.transformer.Mp4Info mediaItemInfo;
    private final androidx.media3.muxer.Muxer.Factory muxerFactory;
    private java.lang.String oldFilePath;
    private java.lang.String outputFilePath;
    private final boolean removeAudio;
    private final boolean removeVideo;
    private androidx.media3.transformer.MuxerWrapper remuxingMuxerWrapper;
    private androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata resumeMetadata;
    private final androidx.media3.transformer.TransformationRequest transformationRequest;
    private androidx.media3.transformer.TransformerInternal transformerInternal;
    private int transformerState;
    private final boolean trimOptimizationEnabled;
    private final com.google.common.collect.ImmutableList<androidx.media3.common.Effect> videoEffects;
    private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProgressState {
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.transformer");
    }

    public static final class Builder {
        private androidx.media3.transformer.AssetLoader.Factory assetLoaderFactory;
        private java.lang.String audioMimeType;
        private androidx.media3.transformer.AudioMixer.Factory audioMixerFactory;
        private com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> audioProcessors;
        private androidx.media3.common.util.Clock clock;
        private final android.content.Context context;
        private androidx.media3.common.DebugViewProvider debugViewProvider;
        private androidx.media3.transformer.Codec.EncoderFactory encoderFactory;
        private boolean fileStartsOnVideoFrameEnabled;
        private boolean flattenForSlowMotion;
        private androidx.media3.common.util.ListenerSet<androidx.media3.transformer.Transformer.Listener> listeners;
        private android.os.Looper looper;
        private long maxDelayBetweenMuxerSamplesMs;
        private androidx.media3.muxer.Muxer.Factory muxerFactory;
        private boolean removeAudio;
        private boolean removeVideo;
        private androidx.media3.transformer.TransformationRequest transformationRequest;
        private boolean trimOptimizationEnabled;
        private com.google.common.collect.ImmutableList<androidx.media3.common.Effect> videoEffects;
        private androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private java.lang.String videoMimeType;

        static /* synthetic */ void lambda$new$0(androidx.media3.transformer.Transformer.Listener listener, androidx.media3.common.FlagSet flagSet) {
        }

        static /* synthetic */ void lambda$setClock$2(androidx.media3.transformer.Transformer.Listener listener, androidx.media3.common.FlagSet flagSet) {
        }

        static /* synthetic */ void lambda$setLooper$1(androidx.media3.transformer.Transformer.Listener listener, androidx.media3.common.FlagSet flagSet) {
        }

        public Builder(android.content.Context context) {
            android.content.Context applicationContext = context.getApplicationContext();
            this.context = applicationContext;
            this.maxDelayBetweenMuxerSamplesMs = 10000L;
            this.audioProcessors = com.google.common.collect.ImmutableList.of();
            this.videoEffects = com.google.common.collect.ImmutableList.of();
            this.audioMixerFactory = new androidx.media3.transformer.DefaultAudioMixer.Factory();
            this.videoFrameProcessorFactory = new androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder().build();
            this.encoderFactory = new androidx.media3.transformer.DefaultEncoderFactory.Builder(applicationContext).build();
            this.muxerFactory = new androidx.media3.transformer.DefaultMuxer.Factory();
            this.looper = androidx.media3.common.util.Util.getCurrentOrMainLooper();
            this.debugViewProvider = androidx.media3.common.DebugViewProvider.NONE;
            this.clock = androidx.media3.common.util.Clock.DEFAULT;
            this.listeners = new androidx.media3.common.util.ListenerSet<>(this.looper, this.clock, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.transformer.Transformer$Builder$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                    androidx.media3.transformer.Transformer.Builder.lambda$new$0((androidx.media3.transformer.Transformer.Listener) obj, flagSet);
                }
            });
        }

        private Builder(androidx.media3.transformer.Transformer transformer) {
            this.context = transformer.context;
            this.audioMimeType = transformer.transformationRequest.audioMimeType;
            this.videoMimeType = transformer.transformationRequest.videoMimeType;
            this.transformationRequest = transformer.transformationRequest;
            this.audioProcessors = transformer.audioProcessors;
            this.videoEffects = transformer.videoEffects;
            this.removeAudio = transformer.removeAudio;
            this.removeVideo = transformer.removeVideo;
            this.trimOptimizationEnabled = transformer.trimOptimizationEnabled;
            this.fileStartsOnVideoFrameEnabled = transformer.fileStartsOnVideoFrameEnabled;
            this.maxDelayBetweenMuxerSamplesMs = transformer.maxDelayBetweenMuxerSamplesMs;
            this.listeners = transformer.listeners;
            this.assetLoaderFactory = transformer.assetLoaderFactory;
            this.audioMixerFactory = transformer.audioMixerFactory;
            this.videoFrameProcessorFactory = transformer.videoFrameProcessorFactory;
            this.encoderFactory = transformer.encoderFactory;
            this.muxerFactory = transformer.muxerFactory;
            this.looper = transformer.looper;
            this.debugViewProvider = transformer.debugViewProvider;
            this.clock = transformer.clock;
        }

        public androidx.media3.transformer.Transformer.Builder setAudioMimeType(java.lang.String str) {
            java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.MimeTypes.isAudio(strNormalizeMimeType), "Not an audio MIME type: " + strNormalizeMimeType);
            this.audioMimeType = strNormalizeMimeType;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setVideoMimeType(java.lang.String str) {
            java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.MimeTypes.isVideo(strNormalizeMimeType), "Not a video MIME type: " + strNormalizeMimeType);
            this.videoMimeType = strNormalizeMimeType;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setTransformationRequest(androidx.media3.transformer.TransformationRequest transformationRequest) {
            this.transformationRequest = transformationRequest;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setAudioProcessors(java.util.List<androidx.media3.common.audio.AudioProcessor> list) {
            this.audioProcessors = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
            this.videoEffects = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setRemoveAudio(boolean z) {
            this.removeAudio = z;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setRemoveVideo(boolean z) {
            this.removeVideo = z;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setFlattenForSlowMotion(boolean z) {
            this.flattenForSlowMotion = z;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder experimentalSetTrimOptimizationEnabled(boolean z) {
            this.trimOptimizationEnabled = z;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setEnsureFileStartsOnVideoFrameEnabled(boolean z) {
            this.fileStartsOnVideoFrameEnabled = z;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setMaxDelayBetweenMuxerSamplesMs(long j) {
            this.maxDelayBetweenMuxerSamplesMs = j;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.transformer.Transformer.Builder setListener(androidx.media3.transformer.Transformer.Listener listener) {
            this.listeners.clear();
            this.listeners.add(listener);
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder addListener(androidx.media3.transformer.Transformer.Listener listener) {
            this.listeners.add(listener);
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder removeListener(androidx.media3.transformer.Transformer.Listener listener) {
            this.listeners.remove(listener);
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder removeAllListeners() {
            this.listeners.clear();
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setAssetLoaderFactory(androidx.media3.transformer.AssetLoader.Factory factory) {
            this.assetLoaderFactory = factory;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setAudioMixerFactory(androidx.media3.transformer.AudioMixer.Factory factory) {
            this.audioMixerFactory = factory;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setVideoFrameProcessorFactory(androidx.media3.common.VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setEncoderFactory(androidx.media3.transformer.Codec.EncoderFactory encoderFactory) {
            this.encoderFactory = encoderFactory;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setMuxerFactory(androidx.media3.muxer.Muxer.Factory factory) {
            this.muxerFactory = factory;
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setLooper(android.os.Looper looper) {
            this.looper = looper;
            this.listeners = this.listeners.copy(looper, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.transformer.Transformer$Builder$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                    androidx.media3.transformer.Transformer.Builder.lambda$setLooper$1((androidx.media3.transformer.Transformer.Listener) obj, flagSet);
                }
            });
            return this;
        }

        public androidx.media3.transformer.Transformer.Builder setDebugViewProvider(androidx.media3.common.DebugViewProvider debugViewProvider) {
            this.debugViewProvider = debugViewProvider;
            return this;
        }

        androidx.media3.transformer.Transformer.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            this.listeners = this.listeners.copy(this.looper, clock, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.transformer.Transformer$Builder$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                    androidx.media3.transformer.Transformer.Builder.lambda$setClock$2((androidx.media3.transformer.Transformer.Listener) obj, flagSet);
                }
            });
            return this;
        }

        public androidx.media3.transformer.Transformer build() {
            androidx.media3.transformer.TransformationRequest.Builder builderBuildUpon;
            androidx.media3.transformer.TransformationRequest transformationRequest = this.transformationRequest;
            if (transformationRequest == null) {
                builderBuildUpon = new androidx.media3.transformer.TransformationRequest.Builder();
            } else {
                builderBuildUpon = transformationRequest.buildUpon();
            }
            java.lang.String str = this.audioMimeType;
            if (str != null) {
                builderBuildUpon.setAudioMimeType(str);
            }
            java.lang.String str2 = this.videoMimeType;
            if (str2 != null) {
                builderBuildUpon.setVideoMimeType(str2);
            }
            androidx.media3.transformer.TransformationRequest transformationRequestBuild = builderBuildUpon.build();
            this.transformationRequest = transformationRequestBuild;
            if (transformationRequestBuild.audioMimeType != null) {
                checkSampleMimeType(this.transformationRequest.audioMimeType);
            }
            if (this.transformationRequest.videoMimeType != null) {
                checkSampleMimeType(this.transformationRequest.videoMimeType);
            }
            return new androidx.media3.transformer.Transformer(this.context, this.transformationRequest, this.audioProcessors, this.videoEffects, this.removeAudio, this.removeVideo, this.flattenForSlowMotion, this.trimOptimizationEnabled, this.fileStartsOnVideoFrameEnabled, this.maxDelayBetweenMuxerSamplesMs, this.listeners, this.assetLoaderFactory, this.audioMixerFactory, this.videoFrameProcessorFactory, this.encoderFactory, this.muxerFactory, this.looper, this.debugViewProvider, this.clock);
        }

        private void checkSampleMimeType(java.lang.String str) {
            androidx.media3.common.util.Assertions.checkState(this.muxerFactory.getSupportedSampleMimeTypes(androidx.media3.common.MimeTypes.getTrackType(str)).contains(str), "Unsupported sample MIME type " + str);
        }
    }

    public interface Listener {
        @java.lang.Deprecated
        default void onFallbackApplied(androidx.media3.common.MediaItem mediaItem, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.TransformationRequest transformationRequest2) {
        }

        @java.lang.Deprecated
        default void onTransformationCompleted(androidx.media3.common.MediaItem mediaItem) {
        }

        @java.lang.Deprecated
        default void onTransformationError(androidx.media3.common.MediaItem mediaItem, java.lang.Exception exc) {
        }

        @java.lang.Deprecated
        default void onTransformationCompleted(androidx.media3.common.MediaItem mediaItem, androidx.media3.transformer.TransformationResult transformationResult) {
            onTransformationCompleted(mediaItem);
        }

        default void onCompleted(androidx.media3.transformer.Composition composition, androidx.media3.transformer.ExportResult exportResult) {
            onTransformationCompleted(composition.sequences.get(0).editedMediaItems.get(0).mediaItem, new androidx.media3.transformer.TransformationResult.Builder(exportResult).build());
        }

        @java.lang.Deprecated
        default void onTransformationError(androidx.media3.common.MediaItem mediaItem, androidx.media3.transformer.TransformationException transformationException) {
            onTransformationError(mediaItem, (java.lang.Exception) transformationException);
        }

        @java.lang.Deprecated
        default void onTransformationError(androidx.media3.common.MediaItem mediaItem, androidx.media3.transformer.TransformationResult transformationResult, androidx.media3.transformer.TransformationException transformationException) {
            onTransformationError(mediaItem, transformationException);
        }

        default void onError(androidx.media3.transformer.Composition composition, androidx.media3.transformer.ExportResult exportResult, androidx.media3.transformer.ExportException exportException) {
            onTransformationError(composition.sequences.get(0).editedMediaItems.get(0).mediaItem, new androidx.media3.transformer.TransformationResult.Builder(exportResult).build(), new androidx.media3.transformer.TransformationException(exportException));
        }

        default void onFallbackApplied(androidx.media3.transformer.Composition composition, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.TransformationRequest transformationRequest2) {
            onFallbackApplied(composition.sequences.get(0).editedMediaItems.get(0).mediaItem, transformationRequest, transformationRequest2);
        }
    }

    private Transformer(android.content.Context context, androidx.media3.transformer.TransformationRequest transformationRequest, com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> immutableList, com.google.common.collect.ImmutableList<androidx.media3.common.Effect> immutableList2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, androidx.media3.common.util.ListenerSet<androidx.media3.transformer.Transformer.Listener> listenerSet, androidx.media3.transformer.AssetLoader.Factory factory, androidx.media3.transformer.AudioMixer.Factory factory2, androidx.media3.common.VideoFrameProcessor.Factory factory3, androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.muxer.Muxer.Factory factory4, android.os.Looper looper, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.util.Clock clock) {
        androidx.media3.common.util.Assertions.checkState((z && z2) ? false : true, "Audio and video cannot both be removed.");
        this.context = context;
        this.transformationRequest = transformationRequest;
        this.audioProcessors = immutableList;
        this.videoEffects = immutableList2;
        this.removeAudio = z;
        this.removeVideo = z2;
        this.flattenForSlowMotion = z3;
        this.trimOptimizationEnabled = z4;
        this.fileStartsOnVideoFrameEnabled = z5;
        this.maxDelayBetweenMuxerSamplesMs = j;
        this.listeners = listenerSet;
        this.assetLoaderFactory = factory;
        this.audioMixerFactory = factory2;
        this.videoFrameProcessorFactory = factory3;
        this.encoderFactory = encoderFactory;
        this.muxerFactory = factory4;
        this.looper = looper;
        this.debugViewProvider = debugViewProvider;
        this.clock = clock;
        this.transformerState = 0;
        this.applicationHandler = clock.createHandler(looper, null);
        this.componentListener = new androidx.media3.transformer.Transformer.ComponentListener();
        this.exportResultBuilder = new androidx.media3.transformer.ExportResult.Builder();
    }

    public androidx.media3.transformer.Transformer.Builder buildUpon() {
        return new androidx.media3.transformer.Transformer.Builder();
    }

    @java.lang.Deprecated
    public void setListener(androidx.media3.transformer.Transformer.Listener listener) {
        verifyApplicationThread();
        this.listeners.clear();
        this.listeners.add(listener);
    }

    public void addListener(androidx.media3.transformer.Transformer.Listener listener) {
        verifyApplicationThread();
        this.listeners.add(listener);
    }

    public void removeListener(androidx.media3.transformer.Transformer.Listener listener) {
        verifyApplicationThread();
        this.listeners.remove(listener);
    }

    public void removeAllListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public void start(androidx.media3.transformer.Composition composition, java.lang.String str) {
        verifyApplicationThread();
        initialize(composition, str);
        if (!this.trimOptimizationEnabled || isMultiAsset()) {
            startInternal(composition, new androidx.media3.transformer.MuxerWrapper(str, this.muxerFactory, this.componentListener, 0, this.fileStartsOnVideoFrameEnabled, null, this.maxDelayBetweenMuxerSamplesMs), this.componentListener, 0L, false);
        } else {
            processMediaBeforeFirstSyncSampleAfterTrimStartTime();
        }
    }

    public void start(androidx.media3.transformer.EditedMediaItem editedMediaItem, java.lang.String str) {
        start(new androidx.media3.transformer.Composition.Builder(new androidx.media3.transformer.EditedMediaItemSequence(editedMediaItem, new androidx.media3.transformer.EditedMediaItem[0]), new androidx.media3.transformer.EditedMediaItemSequence[0]).build(), str);
    }

    public void start(androidx.media3.common.MediaItem mediaItem, java.lang.String str) {
        if (!mediaItem.clippingConfiguration.equals(androidx.media3.common.MediaItem.ClippingConfiguration.UNSET) && this.flattenForSlowMotion) {
            throw new java.lang.IllegalArgumentException("Clipping is not supported when slow motion flattening is requested");
        }
        start(new androidx.media3.transformer.EditedMediaItem.Builder(mediaItem).setRemoveAudio(this.removeAudio).setRemoveVideo(this.removeVideo).setFlattenForSlowMotion(this.flattenForSlowMotion).setEffects(new androidx.media3.transformer.Effects(this.audioProcessors, this.videoEffects)).build(), str);
    }

    @java.lang.Deprecated
    public void startTransformation(androidx.media3.common.MediaItem mediaItem, java.lang.String str) {
        start(mediaItem, str);
    }

    public android.os.Looper getApplicationLooper() {
        return this.looper;
    }

    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        verifyApplicationThread();
        if (isExportResumed()) {
            return 3;
        }
        if (isExportTrimOptimization()) {
            return getTrimOptimizationProgress(progressHolder);
        }
        androidx.media3.transformer.TransformerInternal transformerInternal = this.transformerInternal;
        if (transformerInternal == null) {
            return 0;
        }
        return transformerInternal.getProgress(progressHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExportResumed() {
        int i = this.transformerState;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExportTrimOptimization() {
        int i = this.transformerState;
        return i == 5 || i == 6;
    }

    private int getTrimOptimizationProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        int progress;
        if (this.mediaItemInfo == null) {
            return 1;
        }
        float f = (this.mediaItemInfo.firstSyncSampleTimestampUsAfterTimeUs - ((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition)).sequences.get(0).editedMediaItems.get(0).mediaItem.clippingConfiguration.startPositionUs) / this.mediaItemInfo.durationUs;
        if (this.transformerState == 5) {
            androidx.media3.transformer.TransformerInternal transformerInternal = this.transformerInternal;
            if (transformerInternal == null || (progress = transformerInternal.getProgress(progressHolder)) == 0 || progress == 1) {
                return 1;
            }
            if (progress == 2) {
                progressHolder.progress = java.lang.Math.round(progressHolder.progress * f);
                return 2;
            }
            if (progress == 3) {
                return 3;
            }
            throw new java.lang.IllegalStateException();
        }
        float f2 = 100.0f * f;
        androidx.media3.transformer.TransformerInternal transformerInternal2 = this.transformerInternal;
        if (transformerInternal2 == null) {
            progressHolder.progress = java.lang.Math.round(f2);
            return 2;
        }
        int progress2 = transformerInternal2.getProgress(progressHolder);
        if (progress2 == 0 || progress2 == 1) {
            progressHolder.progress = java.lang.Math.round(f2);
            return 2;
        }
        if (progress2 == 2) {
            progressHolder.progress = java.lang.Math.round(f2 + ((1.0f - f) * progressHolder.progress));
            return 2;
        }
        if (progress2 == 3) {
            return 3;
        }
        throw new java.lang.IllegalStateException();
    }

    public void cancel() {
        verifyApplicationThread();
        androidx.media3.transformer.TransformerInternal transformerInternal = this.transformerInternal;
        if (transformerInternal == null) {
            return;
        }
        try {
            transformerInternal.cancel();
            this.transformerInternal = null;
            com.google.common.util.concurrent.ListenableFuture<androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata> listenableFuture = this.getResumeMetadataFuture;
            if (listenableFuture != null && !listenableFuture.isDone()) {
                this.getResumeMetadataFuture.cancel(false);
            }
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture2 = this.copyOutputFuture;
            if (listenableFuture2 == null || listenableFuture2.isDone()) {
                return;
            }
            this.copyOutputFuture.cancel(false);
        } catch (java.lang.Throwable th) {
            this.transformerInternal = null;
            throw th;
        }
    }

    public void resume(androidx.media3.transformer.Composition composition, java.lang.String str, java.lang.String str2) {
        verifyApplicationThread();
        initialize(composition, str);
        this.oldFilePath = str2;
        remuxProcessedVideo();
    }

    private void initialize(androidx.media3.transformer.Composition composition, java.lang.String str) {
        this.composition = composition;
        this.outputFilePath = str;
        this.exportResultBuilder.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processFullInput() {
        this.transformerState = 0;
        startInternal((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition), new androidx.media3.transformer.MuxerWrapper((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.outputFilePath), this.muxerFactory, this.componentListener, 0, false, null, this.maxDelayBetweenMuxerSamplesMs), this.componentListener, 0L, false);
    }

    private void remuxProcessedVideo() {
        this.transformerState = 1;
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata> resumeMetadataAsync = androidx.media3.transformer.TransmuxTranscodeHelper.getResumeMetadataAsync(this.context, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.oldFilePath), (androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition));
        this.getResumeMetadataFuture = resumeMetadataAsync;
        com.google.common.util.concurrent.FutureCallback<androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata> futureCallback = new com.google.common.util.concurrent.FutureCallback<androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata>() { // from class: androidx.media3.transformer.Transformer.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata resumeMetadata) {
                if (resumeMetadata.lastSyncSampleTimestampUs == androidx.media3.common.C.TIME_UNSET || resumeMetadata.lastSyncSampleTimestampUs == 0) {
                    androidx.media3.transformer.Transformer.this.processFullInput();
                    return;
                }
                androidx.media3.transformer.Transformer.this.resumeMetadata = resumeMetadata;
                androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper = new androidx.media3.transformer.MuxerWrapper((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.Transformer.this.outputFilePath), androidx.media3.transformer.Transformer.this.muxerFactory, androidx.media3.transformer.Transformer.this.componentListener, 1, false, resumeMetadata.videoFormat, androidx.media3.transformer.Transformer.this.maxDelayBetweenMuxerSamplesMs);
                androidx.media3.transformer.Transformer transformer = androidx.media3.transformer.Transformer.this;
                transformer.startInternal(androidx.media3.transformer.TransmuxTranscodeHelper.createVideoOnlyComposition(transformer.oldFilePath, resumeMetadata.lastSyncSampleTimestampUs), (androidx.media3.transformer.MuxerWrapper) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper), androidx.media3.transformer.Transformer.this.componentListener, 0L, true);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.media3.transformer.Transformer.this.processFullInput();
            }
        };
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.applicationHandler;
        java.util.Objects.requireNonNull(handlerWrapper);
        com.google.common.util.concurrent.Futures.addCallback(resumeMetadataAsync, futureCallback, new androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRemainingVideo() {
        this.transformerState = 2;
        androidx.media3.transformer.Composition compositionBuildUponComposition = androidx.media3.transformer.TransmuxTranscodeHelper.buildUponComposition((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition), true, false, this.resumeMetadata);
        androidx.media3.common.util.Assertions.checkNotNull(this.remuxingMuxerWrapper);
        this.remuxingMuxerWrapper.changeToAppendMode();
        startInternal(compositionBuildUponComposition, this.remuxingMuxerWrapper, this.componentListener, ((androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata) androidx.media3.common.util.Assertions.checkNotNull(this.resumeMetadata)).lastSyncSampleTimestampUs, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAudio() {
        this.transformerState = 3;
        startInternal(androidx.media3.transformer.TransmuxTranscodeHelper.createAudioTranscodeAndVideoTransmuxComposition((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition), (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.outputFilePath)), new androidx.media3.transformer.MuxerWrapper((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.oldFilePath), this.muxerFactory, this.componentListener, 0, false, null, this.maxDelayBetweenMuxerSamplesMs), this.componentListener, 0L, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copyOutput() {
        this.transformerState = 4;
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFutureCopyFileAsync = androidx.media3.transformer.TransmuxTranscodeHelper.copyFileAsync(new java.io.File((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.oldFilePath)), new java.io.File((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.outputFilePath)));
        this.copyOutputFuture = listenableFutureCopyFileAsync;
        com.google.common.util.concurrent.FutureCallback<java.lang.Void> futureCallback = new com.google.common.util.concurrent.FutureCallback<java.lang.Void>() { // from class: androidx.media3.transformer.Transformer.2
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(java.lang.Void r1) {
                androidx.media3.transformer.Transformer.this.onExportCompletedWithSuccess();
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.media3.transformer.Transformer.this.onExportCompletedWithError(androidx.media3.transformer.ExportException.createForUnexpected(new java.io.IOException("Copy output task failed for the resumed export", th)));
            }
        };
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.applicationHandler;
        java.util.Objects.requireNonNull(handlerWrapper);
        com.google.common.util.concurrent.Futures.addCallback(listenableFutureCopyFileAsync, futureCallback, new androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper));
    }

    private void processMediaBeforeFirstSyncSampleAfterTrimStartTime() {
        this.transformerState = 5;
        final androidx.media3.transformer.EditedMediaItem editedMediaItem = ((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition)).sequences.get(0).editedMediaItems.get(0);
        final long j = editedMediaItem.mediaItem.clippingConfiguration.startPositionUs;
        final long j2 = editedMediaItem.mediaItem.clippingConfiguration.endPositionUs;
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.transformer.Mp4Info> mp4Info = androidx.media3.transformer.TransmuxTranscodeHelper.getMp4Info(this.context, ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(editedMediaItem.mediaItem.localConfiguration)).uri.toString(), j);
        com.google.common.util.concurrent.FutureCallback<androidx.media3.transformer.Mp4Info> futureCallback = new com.google.common.util.concurrent.FutureCallback<androidx.media3.transformer.Mp4Info>() { // from class: androidx.media3.transformer.Transformer.3
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(androidx.media3.transformer.Mp4Info mp4Info2) {
                if (mp4Info2.firstSyncSampleTimestampUsAfterTimeUs == androidx.media3.common.C.TIME_UNSET) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(4);
                    androidx.media3.transformer.Transformer.this.processFullInput();
                    return;
                }
                if (mp4Info2.firstSyncSampleTimestampUsAfterTimeUs != Long.MIN_VALUE) {
                    long j3 = j2;
                    if (j3 == Long.MIN_VALUE || j3 >= mp4Info2.firstSyncSampleTimestampUsAfterTimeUs) {
                        if (mp4Info2.firstSyncSampleTimestampUsAfterTimeUs - j > ((mp4Info2.audioFormat == null || mp4Info2.audioFormat.sampleRate == -1) ? 0L : androidx.media3.common.util.Util.sampleCountToDurationUs(1024L, mp4Info2.audioFormat.sampleRate))) {
                            androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper = new androidx.media3.transformer.MuxerWrapper((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.Transformer.this.outputFilePath), androidx.media3.transformer.Transformer.this.muxerFactory, androidx.media3.transformer.Transformer.this.componentListener, 1, false, mp4Info2.videoFormat, androidx.media3.transformer.Transformer.this.maxDelayBetweenMuxerSamplesMs);
                            if (androidx.media3.transformer.TransformerUtil.shouldTranscodeVideo((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(mp4Info2.videoFormat), androidx.media3.transformer.Transformer.this.composition, 0, androidx.media3.transformer.Transformer.this.transformationRequest, androidx.media3.transformer.Transformer.this.encoderFactory, androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper) || (mp4Info2.audioFormat != null && androidx.media3.transformer.TransformerUtil.shouldTranscodeAudio(mp4Info2.audioFormat, androidx.media3.transformer.Transformer.this.composition, 0, androidx.media3.transformer.Transformer.this.transformationRequest, androidx.media3.transformer.Transformer.this.encoderFactory, androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper))) {
                                androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper = null;
                                androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(3);
                                androidx.media3.transformer.Transformer.this.processFullInput();
                                return;
                            } else {
                                androidx.media3.transformer.Transformer.this.mediaItemInfo = mp4Info2;
                                androidx.media3.transformer.TransformerUtil.maybeSetMuxerWrapperAdditionalRotationDegrees(androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper, editedMediaItem.effects.videoEffects, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(mp4Info2.videoFormat));
                                androidx.media3.transformer.Composition compositionBuildUponCompositionForTrimOptimization = androidx.media3.transformer.TransmuxTranscodeHelper.buildUponCompositionForTrimOptimization(androidx.media3.transformer.Transformer.this.composition, j, mp4Info2.firstSyncSampleTimestampUsAfterTimeUs, mp4Info2.durationUs, false, true);
                                androidx.media3.transformer.Transformer transformer = androidx.media3.transformer.Transformer.this;
                                transformer.startInternal(compositionBuildUponCompositionForTrimOptimization, (androidx.media3.transformer.MuxerWrapper) androidx.media3.common.util.Assertions.checkNotNull(transformer.remuxingMuxerWrapper), androidx.media3.transformer.Transformer.this.componentListener, 0L, false);
                                return;
                            }
                        }
                        androidx.media3.transformer.Transformer transformer2 = androidx.media3.transformer.Transformer.this;
                        transformer2.composition = androidx.media3.transformer.TransmuxTranscodeHelper.buildUponCompositionForTrimOptimization(transformer2.composition, mp4Info2.firstSyncSampleTimestampUsAfterTimeUs, j2, mp4Info2.durationUs, true, false);
                        androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(2);
                        androidx.media3.transformer.Transformer.this.processFullInput();
                        return;
                    }
                }
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(2);
                androidx.media3.transformer.Transformer.this.processFullInput();
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(5);
                androidx.media3.transformer.Transformer.this.processFullInput();
            }
        };
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.applicationHandler;
        java.util.Objects.requireNonNull(handlerWrapper);
        com.google.common.util.concurrent.Futures.addCallback(mp4Info, futureCallback, new androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remuxRemainingMedia() {
        this.transformerState = 6;
        androidx.media3.transformer.EditedMediaItem editedMediaItem = ((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition)).sequences.get(0).editedMediaItems.get(0);
        androidx.media3.transformer.Mp4Info mp4Info = (androidx.media3.transformer.Mp4Info) androidx.media3.common.util.Assertions.checkNotNull(this.mediaItemInfo);
        long j = editedMediaItem.mediaItem.clippingConfiguration.startPositionUs;
        androidx.media3.transformer.Composition compositionBuildUponCompositionForTrimOptimization = androidx.media3.transformer.TransmuxTranscodeHelper.buildUponCompositionForTrimOptimization(this.composition, mp4Info.firstSyncSampleTimestampUsAfterTimeUs, editedMediaItem.mediaItem.clippingConfiguration.endPositionUs, mp4Info.durationUs, true, true);
        androidx.media3.common.util.Assertions.checkNotNull(this.remuxingMuxerWrapper);
        this.remuxingMuxerWrapper.changeToAppendMode();
        startInternal(compositionBuildUponCompositionForTrimOptimization, this.remuxingMuxerWrapper, this.componentListener, mp4Info.firstSyncSampleTimestampUsAfterTimeUs - j, false);
    }

    private boolean isMultiAsset() {
        return ((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition)).sequences.size() > 1 || this.composition.sequences.get(0).editedMediaItems.size() > 1;
    }

    private void verifyApplicationThread() {
        if (android.os.Looper.myLooper() != this.looper) {
            throw new java.lang.IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal(androidx.media3.transformer.Composition composition, androidx.media3.transformer.MuxerWrapper muxerWrapper, androidx.media3.transformer.Transformer.ComponentListener componentListener, long j, boolean z) {
        androidx.media3.common.util.Assertions.checkState(this.transformerInternal == null, "There is already an export in progress.");
        androidx.media3.transformer.TransformationRequest transformationRequestBuild = this.transformationRequest;
        if (composition.hdrMode != 0) {
            transformationRequestBuild = transformationRequestBuild.buildUpon().setHdrMode(composition.hdrMode).build();
        }
        androidx.media3.transformer.TransformationRequest transformationRequest = transformationRequestBuild;
        androidx.media3.transformer.FallbackListener fallbackListener = new androidx.media3.transformer.FallbackListener(composition, this.listeners, this.applicationHandler, transformationRequest);
        androidx.media3.transformer.AssetLoader.Factory defaultAssetLoaderFactory = this.assetLoaderFactory;
        if (z || defaultAssetLoaderFactory == null) {
            defaultAssetLoaderFactory = new androidx.media3.transformer.DefaultAssetLoaderFactory(this.context, new androidx.media3.transformer.DefaultDecoderFactory(this.context), this.clock);
        }
        androidx.media3.effect.DebugTraceUtil.reset();
        androidx.media3.transformer.TransformerInternal transformerInternal = new androidx.media3.transformer.TransformerInternal(this.context, composition, transformationRequest, defaultAssetLoaderFactory, this.audioMixerFactory, this.videoFrameProcessorFactory, this.encoderFactory, muxerWrapper, componentListener, fallbackListener, this.applicationHandler, this.debugViewProvider, this.clock, j);
        this.transformerInternal = transformerInternal;
        transformerInternal.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExportCompletedWithSuccess() {
        this.listeners.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.transformer.Transformer$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                this.f$0.m439xbb46ef5((androidx.media3.transformer.Transformer.Listener) obj);
            }
        });
        this.listeners.flushEvents();
        this.transformerState = 0;
    }

    /* JADX INFO: renamed from: lambda$onExportCompletedWithSuccess$0$androidx-media3-transformer-Transformer, reason: not valid java name */
    /* synthetic */ void m439xbb46ef5(androidx.media3.transformer.Transformer.Listener listener) {
        listener.onCompleted((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition), this.exportResultBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExportCompletedWithError(final androidx.media3.transformer.ExportException exportException) {
        this.listeners.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.transformer.Transformer$$ExternalSyntheticLambda1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                this.f$0.m438x46be917b(exportException, (androidx.media3.transformer.Transformer.Listener) obj);
            }
        });
        this.listeners.flushEvents();
        this.transformerState = 0;
    }

    /* JADX INFO: renamed from: lambda$onExportCompletedWithError$1$androidx-media3-transformer-Transformer, reason: not valid java name */
    /* synthetic */ void m438x46be917b(androidx.media3.transformer.ExportException exportException, androidx.media3.transformer.Transformer.Listener listener) {
        listener.onError((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(this.composition), this.exportResultBuilder.build(), exportException);
    }

    private final class ComponentListener implements androidx.media3.transformer.TransformerInternal.Listener, androidx.media3.transformer.MuxerWrapper.Listener {
        private ComponentListener() {
        }

        @Override // androidx.media3.transformer.TransformerInternal.Listener
        public void onCompleted(com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> immutableList, java.lang.String str, java.lang.String str2) {
            androidx.media3.transformer.Transformer.this.exportResultBuilder.addProcessedInputs(immutableList);
            if (str != null) {
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setAudioEncoderName(str);
            }
            if (str2 != null) {
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setVideoEncoderName(str2);
            }
            androidx.media3.transformer.Transformer.this.transformerInternal = null;
            if (androidx.media3.transformer.Transformer.this.transformerState == 1) {
                androidx.media3.transformer.Transformer.this.processRemainingVideo();
                return;
            }
            if (androidx.media3.transformer.Transformer.this.transformerState == 2) {
                androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper = null;
                androidx.media3.transformer.Transformer.this.processAudio();
                return;
            }
            if (androidx.media3.transformer.Transformer.this.transformerState == 3) {
                androidx.media3.transformer.Transformer.this.copyOutput();
                return;
            }
            if (androidx.media3.transformer.Transformer.this.transformerState == 5) {
                androidx.media3.transformer.Transformer.this.remuxRemainingMedia();
            } else {
                if (androidx.media3.transformer.Transformer.this.transformerState == 6) {
                    androidx.media3.transformer.Transformer.this.mediaItemInfo = null;
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(1);
                    androidx.media3.transformer.Transformer.this.onExportCompletedWithSuccess();
                    return;
                }
                androidx.media3.transformer.Transformer.this.onExportCompletedWithSuccess();
            }
        }

        @Override // androidx.media3.transformer.TransformerInternal.Listener
        public void onError(com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> immutableList, java.lang.String str, java.lang.String str2, androidx.media3.transformer.ExportException exportException) {
            if (exportException.errorCode != 7003 || (!androidx.media3.transformer.Transformer.this.isExportTrimOptimization() && !androidx.media3.transformer.Transformer.this.isExportResumed())) {
                androidx.media3.transformer.Transformer.this.exportResultBuilder.addProcessedInputs(immutableList);
                if (str != null) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setAudioEncoderName(str);
                }
                if (str2 != null) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setVideoEncoderName(str2);
                }
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setExportException(exportException);
                androidx.media3.transformer.Transformer.this.transformerInternal = null;
                androidx.media3.transformer.Transformer.this.onExportCompletedWithError(exportException);
                return;
            }
            androidx.media3.transformer.Transformer.this.remuxingMuxerWrapper = null;
            androidx.media3.transformer.Transformer.this.transformerInternal = null;
            androidx.media3.transformer.Transformer.this.exportResultBuilder.reset();
            androidx.media3.transformer.Transformer.this.exportResultBuilder.setOptimizationResult(6);
            androidx.media3.transformer.Transformer.this.processFullInput();
        }

        @Override // androidx.media3.transformer.MuxerWrapper.Listener
        public void onTrackEnded(int i, androidx.media3.common.Format format, int i2, int i3) {
            if (i == 1) {
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setAudioMimeType(format.sampleMimeType).setAverageAudioBitrate(i2);
                if (format.channelCount != -1) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setChannelCount(format.channelCount);
                }
                if (format.sampleRate != -1) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setSampleRate(format.sampleRate);
                    return;
                }
                return;
            }
            if (i == 2) {
                androidx.media3.transformer.Transformer.this.exportResultBuilder.setVideoMimeType(format.sampleMimeType).setAverageVideoBitrate(i2).setColorInfo(format.colorInfo).setVideoFrameCount(i3);
                if (format.height != -1) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setHeight(format.height);
                }
                if (format.width != -1) {
                    androidx.media3.transformer.Transformer.this.exportResultBuilder.setWidth(format.width);
                }
            }
        }

        @Override // androidx.media3.transformer.MuxerWrapper.Listener
        public void onEnded(long j, long j2) {
            androidx.media3.transformer.Transformer.this.exportResultBuilder.setDurationMs(j).setFileSizeBytes(j2);
            ((androidx.media3.transformer.TransformerInternal) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.Transformer.this.transformerInternal)).endWithCompletion();
        }

        @Override // androidx.media3.transformer.MuxerWrapper.Listener
        public void onError(androidx.media3.transformer.ExportException exportException) {
            ((androidx.media3.transformer.TransformerInternal) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.Transformer.this.transformerInternal)).endWithException(exportException);
        }
    }
}
