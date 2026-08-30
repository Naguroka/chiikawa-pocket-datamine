package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class TransformerInternal {
    private static final int DRAIN_EXPORTERS_DELAY_MS = 10;
    private static final int END_REASON_CANCELLED = 1;
    private static final int END_REASON_COMPLETED = 0;
    private static final int END_REASON_ERROR = 2;
    private static final int MSG_DRAIN_EXPORTERS = 3;
    private static final int MSG_END = 4;
    private static final int MSG_REGISTER_SAMPLE_EXPORTER = 2;
    private static final int MSG_START = 1;
    private static final java.lang.String TAG = "TransformerInternal";
    private final androidx.media3.common.util.HandlerWrapper applicationHandler;
    private final androidx.media3.transformer.TransformerInternal.AssetLoaderInputTracker assetLoaderInputTracker;
    private final java.lang.Object assetLoaderLock;
    private java.lang.RuntimeException cancelException;
    private final androidx.media3.common.util.ConditionVariable canceledConditionVariable;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.transformer.Composition composition;
    private final boolean compositionHasLoopingSequence;
    private final android.content.Context context;
    private long currentMaxSequenceDurationUs;
    private final androidx.media3.transformer.CapturingEncoderFactory encoderFactory;
    private final androidx.media3.common.util.HandlerWrapper internalHandler;
    private final android.os.HandlerThread internalHandlerThread;
    private final androidx.media3.transformer.ProgressHolder internalProgressHolder;
    private boolean isDrainingExporters;
    private final androidx.media3.transformer.TransformerInternal.Listener listener;
    private final androidx.media3.transformer.MuxerWrapper muxerWrapper;
    private int nonLoopingSequencesWithNonFinalDuration;
    private final java.lang.Object progressLock;
    private int progressState;
    private int progressValue;
    private volatile boolean released;
    private final java.util.List<androidx.media3.transformer.SampleExporter> sampleExporters;
    private final java.util.List<androidx.media3.transformer.SequenceAssetLoader> sequenceAssetLoaders;
    private final java.lang.Object setMaxSequenceDurationUsLock;
    private final long videoSampleTimestampOffsetUs;

    public interface Listener {
        void onCompleted(com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> immutableList, java.lang.String str, java.lang.String str2);

        void onError(com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> immutableList, java.lang.String str, java.lang.String str2, androidx.media3.transformer.ExportException exportException);
    }

    static /* synthetic */ int access$1110(androidx.media3.transformer.TransformerInternal transformerInternal) {
        int i = transformerInternal.nonLoopingSequencesWithNonFinalDuration;
        transformerInternal.nonLoopingSequencesWithNonFinalDuration = i - 1;
        return i;
    }

    public TransformerInternal(android.content.Context context, androidx.media3.transformer.Composition composition, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.AssetLoader.Factory factory, androidx.media3.transformer.AudioMixer.Factory factory2, androidx.media3.common.VideoFrameProcessor.Factory factory3, androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.transformer.MuxerWrapper muxerWrapper, androidx.media3.transformer.TransformerInternal.Listener listener, androidx.media3.transformer.FallbackListener fallbackListener, androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.util.Clock clock, long j) {
        this.context = context;
        this.composition = composition;
        this.encoderFactory = new androidx.media3.transformer.CapturingEncoderFactory(encoderFactory);
        this.listener = listener;
        this.applicationHandler = handlerWrapper;
        this.clock = clock;
        this.videoSampleTimestampOffsetUs = j;
        this.muxerWrapper = muxerWrapper;
        android.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + com.ironsource.y8.i.e);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Transformer:Internal");
        this.internalHandlerThread = handlerThread;
        handlerThread.start();
        this.sequenceAssetLoaders = new java.util.ArrayList();
        android.os.Looper looper = handlerThread.getLooper();
        this.assetLoaderLock = new java.lang.Object();
        this.assetLoaderInputTracker = new androidx.media3.transformer.TransformerInternal.AssetLoaderInputTracker(composition);
        for (int i = 0; i < composition.sequences.size(); i++) {
            androidx.media3.transformer.TransformerInternal.SequenceAssetLoaderListener sequenceAssetLoaderListener = new androidx.media3.transformer.TransformerInternal.SequenceAssetLoaderListener(i, composition, transformationRequest, factory2, factory3, fallbackListener, debugViewProvider);
            androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence = composition.sequences.get(i);
            this.sequenceAssetLoaders.add(new androidx.media3.transformer.SequenceAssetLoader(editedMediaItemSequence, composition.forceAudioTrack, factory, new androidx.media3.transformer.AssetLoader.CompositionSettings(transformationRequest.hdrMode, composition.retainHdrFromUltraHdrImage), sequenceAssetLoaderListener, clock, looper));
            if (!editedMediaItemSequence.isLooping) {
                this.nonLoopingSequencesWithNonFinalDuration++;
            }
        }
        this.compositionHasLoopingSequence = this.nonLoopingSequencesWithNonFinalDuration != composition.sequences.size();
        this.setMaxSequenceDurationUsLock = new java.lang.Object();
        this.canceledConditionVariable = new androidx.media3.common.util.ConditionVariable();
        this.progressLock = new java.lang.Object();
        this.internalProgressHolder = new androidx.media3.transformer.ProgressHolder();
        this.sampleExporters = new java.util.ArrayList();
        this.internalHandler = clock.createHandler(looper, new android.os.Handler.Callback() { // from class: androidx.media3.transformer.TransformerInternal$$ExternalSyntheticLambda3
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.handleMessage(message);
            }
        });
    }

    public void start() {
        verifyInternalThreadAlive();
        this.internalHandler.sendEmptyMessage(1);
        synchronized (this.progressLock) {
            this.progressState = 1;
            this.progressValue = 0;
        }
    }

    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        int i;
        if (this.released) {
            return 0;
        }
        synchronized (this.progressLock) {
            if (this.progressState == 2) {
                progressHolder.progress = this.progressValue;
            }
            i = this.progressState;
        }
        return i;
    }

    public void cancel() {
        if (this.released) {
            return;
        }
        verifyInternalThreadAlive();
        this.internalHandler.obtainMessage(4, 1, 0, null).sendToTarget();
        this.clock.onThreadBlocked();
        this.canceledConditionVariable.blockUninterruptible();
        this.canceledConditionVariable.close();
        java.lang.RuntimeException runtimeException = this.cancelException;
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void endWithCompletion() {
        verifyInternalThreadAlive();
        this.internalHandler.obtainMessage(4, 0, 0, null).sendToTarget();
    }

    public void endWithException(androidx.media3.transformer.ExportException exportException) {
        verifyInternalThreadAlive();
        this.internalHandler.obtainMessage(4, 2, 0, exportException).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyInternalThreadAlive() {
        androidx.media3.common.util.Assertions.checkState(this.internalHandlerThread.isAlive(), "Internal thread is dead.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        if (this.released && message.what != 4) {
            return true;
        }
        try {
            int i = message.what;
            if (i == 1) {
                startInternal();
            } else if (i == 2) {
                registerSampleExporterInternal((androidx.media3.transformer.SampleExporter) message.obj);
            } else if (i == 3) {
                drainExportersInternal();
            } else {
                if (i != 4) {
                    return false;
                }
                endInternal(message.arg1, (androidx.media3.transformer.ExportException) message.obj);
            }
        } catch (androidx.media3.transformer.ExportException e) {
            endInternal(2, e);
        } catch (java.lang.RuntimeException e2) {
            endInternal(2, androidx.media3.transformer.ExportException.createForUnexpected(e2));
        }
        return true;
    }

    private void startInternal() {
        for (int i = 0; i < this.sequenceAssetLoaders.size(); i++) {
            this.sequenceAssetLoaders.get(i).start();
        }
    }

    private void registerSampleExporterInternal(androidx.media3.transformer.SampleExporter sampleExporter) {
        this.sampleExporters.add(sampleExporter);
        if (this.isDrainingExporters) {
            return;
        }
        this.internalHandler.sendEmptyMessage(3);
        this.isDrainingExporters = true;
    }

    private void drainExportersInternal() throws androidx.media3.transformer.ExportException {
        for (int i = 0; i < this.sampleExporters.size(); i++) {
            while (this.sampleExporters.get(i).processData()) {
            }
        }
        updateProgressInternal();
        if (this.muxerWrapper.isEnded()) {
            return;
        }
        this.internalHandler.sendEmptyMessageDelayed(3, 10);
    }

    private void endInternal(int i, final androidx.media3.transformer.ExportException exportException) {
        final com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i2 = 0; i2 < this.sequenceAssetLoaders.size(); i2++) {
            builder.addAll((java.lang.Iterable) this.sequenceAssetLoaders.get(i2).getProcessedInputs());
        }
        boolean z = i == 1;
        boolean z2 = this.released;
        androidx.media3.transformer.ExportException exportExceptionCreateForMuxer = null;
        if (!this.released) {
            this.released = true;
            synchronized (this.progressLock) {
                this.progressState = 0;
                this.progressValue = 0;
            }
            android.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "] [" + androidx.media3.common.MediaLibraryInfo.registeredModules() + com.ironsource.y8.i.e);
            for (int i3 = 0; i3 < this.sampleExporters.size(); i3++) {
                try {
                    this.sampleExporters.get(i3).release();
                } catch (java.lang.RuntimeException e) {
                    if (exportExceptionCreateForMuxer == null) {
                        exportExceptionCreateForMuxer = androidx.media3.transformer.ExportException.createForUnexpected(e);
                        this.cancelException = e;
                    }
                }
            }
            for (int i4 = 0; i4 < this.sequenceAssetLoaders.size(); i4++) {
                try {
                    this.sequenceAssetLoaders.get(i4).release();
                } catch (java.lang.RuntimeException e2) {
                    if (exportExceptionCreateForMuxer == null) {
                        androidx.media3.transformer.ExportException exportExceptionCreateForUnexpected = androidx.media3.transformer.ExportException.createForUnexpected(e2);
                        this.cancelException = e2;
                        exportExceptionCreateForMuxer = exportExceptionCreateForUnexpected;
                    }
                }
            }
            try {
                this.muxerWrapper.finishWritingAndMaybeRelease(getMuxerReleaseReason(i));
            } catch (androidx.media3.muxer.Muxer.MuxerException e3) {
                if (exportExceptionCreateForMuxer == null) {
                    exportExceptionCreateForMuxer = androidx.media3.transformer.ExportException.createForMuxer(e3, 7001);
                }
            } catch (java.lang.RuntimeException e4) {
                if (exportExceptionCreateForMuxer == null) {
                    androidx.media3.transformer.ExportException exportExceptionCreateForUnexpected2 = androidx.media3.transformer.ExportException.createForUnexpected(e4);
                    this.cancelException = e4;
                    exportExceptionCreateForMuxer = exportExceptionCreateForUnexpected2;
                }
            }
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.internalHandler;
            final android.os.HandlerThread handlerThread = this.internalHandlerThread;
            java.util.Objects.requireNonNull(handlerThread);
            handlerWrapper.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.TransformerInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            });
        }
        if (z) {
            this.canceledConditionVariable.open();
            return;
        }
        if (exportException == null) {
            exportException = exportExceptionCreateForMuxer;
        }
        if (exportException == null) {
            if (z2) {
                return;
            }
            androidx.media3.common.util.Assertions.checkState(this.applicationHandler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.TransformerInternal$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m441x4638ca0c(builder);
                }
            }));
        } else if (z2) {
            android.util.Log.w(TAG, "Export error after export ended", exportException);
        } else {
            androidx.media3.common.util.Assertions.checkState(this.applicationHandler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.TransformerInternal$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m440x46af300b(builder, exportException);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: lambda$endInternal$0$androidx-media3-transformer-TransformerInternal, reason: not valid java name */
    /* synthetic */ void m440x46af300b(com.google.common.collect.ImmutableList.Builder builder, androidx.media3.transformer.ExportException exportException) {
        this.listener.onError(builder.build(), this.encoderFactory.getAudioEncoderName(), this.encoderFactory.getVideoEncoderName(), exportException);
    }

    /* JADX INFO: renamed from: lambda$endInternal$1$androidx-media3-transformer-TransformerInternal, reason: not valid java name */
    /* synthetic */ void m441x4638ca0c(com.google.common.collect.ImmutableList.Builder builder) {
        this.listener.onCompleted(builder.build(), this.encoderFactory.getAudioEncoderName(), this.encoderFactory.getVideoEncoderName());
    }

    private int getMuxerReleaseReason(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new java.lang.IllegalStateException("Unexpected end reason " + i);
    }

    private void updateProgressInternal() {
        if (this.released) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.sequenceAssetLoaders.size(); i3++) {
            if (!this.composition.sequences.get(i3).isLooping) {
                this.internalProgressHolder.progress = 0;
                int progress = this.sequenceAssetLoaders.get(i3).getProgress(this.internalProgressHolder);
                if (progress != 2) {
                    synchronized (this.progressLock) {
                        this.progressState = progress;
                        this.progressValue = 0;
                    }
                    return;
                }
                i += this.internalProgressHolder.progress;
                i2++;
            }
        }
        synchronized (this.progressLock) {
            this.progressState = 2;
            this.progressValue = i / i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SequenceAssetLoaderListener implements androidx.media3.transformer.AssetLoader.Listener {
        private final androidx.media3.transformer.AudioMixer.Factory audioMixerFactory;
        private final androidx.media3.transformer.Composition composition;
        private long currentSequenceDurationUs;
        private final androidx.media3.common.DebugViewProvider debugViewProvider;
        private final androidx.media3.transformer.FallbackListener fallbackListener;
        private final androidx.media3.transformer.EditedMediaItem firstEditedMediaItem;
        private final int sequenceIndex;
        private final androidx.media3.transformer.TransformationRequest transformationRequest;
        private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

        @Override // androidx.media3.transformer.AssetLoader.Listener
        public void onDurationUs(long j) {
        }

        public SequenceAssetLoaderListener(int i, androidx.media3.transformer.Composition composition, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.AudioMixer.Factory factory, androidx.media3.common.VideoFrameProcessor.Factory factory2, androidx.media3.transformer.FallbackListener fallbackListener, androidx.media3.common.DebugViewProvider debugViewProvider) {
            this.sequenceIndex = i;
            this.firstEditedMediaItem = composition.sequences.get(i).editedMediaItems.get(0);
            this.composition = composition;
            this.transformationRequest = transformationRequest;
            this.audioMixerFactory = factory;
            this.videoFrameProcessorFactory = factory2;
            this.fallbackListener = fallbackListener;
            this.debugViewProvider = debugViewProvider;
        }

        @Override // androidx.media3.transformer.AssetLoader.Listener
        public void onTrackCount(int i) {
            if (i > 0) {
                synchronized (androidx.media3.transformer.TransformerInternal.this.assetLoaderLock) {
                    androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.setTrackCount(this.sequenceIndex, i);
                }
                return;
            }
            onError(androidx.media3.transformer.ExportException.createForAssetLoader(new java.lang.IllegalStateException("AssetLoader instances must provide at least 1 track."), 1001));
        }

        @Override // androidx.media3.transformer.AssetLoader.Listener
        public boolean onTrackAdded(androidx.media3.common.Format format, int i) {
            boolean zShouldTranscode;
            int processedTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
            synchronized (androidx.media3.transformer.TransformerInternal.this.assetLoaderLock) {
                androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.registerTrack(this.sequenceIndex, format);
                if (androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.hasRegisteredAllTracks()) {
                    int outputTrackCount = androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getOutputTrackCount();
                    androidx.media3.transformer.TransformerInternal.this.muxerWrapper.setTrackCount(outputTrackCount);
                    this.fallbackListener.setTrackCount(outputTrackCount);
                }
                zShouldTranscode = shouldTranscode(format, i);
                if (!zShouldTranscode && androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType) == 2) {
                    androidx.media3.transformer.TransformerUtil.maybeSetMuxerWrapperAdditionalRotationDegrees(androidx.media3.transformer.TransformerInternal.this.muxerWrapper, this.firstEditedMediaItem.effects.videoEffects, format);
                }
                androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.setShouldTranscode(processedTrackType, zShouldTranscode);
            }
            return zShouldTranscode;
        }

        @Override // androidx.media3.transformer.AssetLoader.Listener
        public androidx.media3.transformer.SampleConsumer onOutputFormat(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
            synchronized (androidx.media3.transformer.TransformerInternal.this.assetLoaderLock) {
                if (!androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.hasRegisteredAllTracks()) {
                    return null;
                }
                final int processedTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
                if (androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.shouldTranscode(processedTrackType)) {
                    if (androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getIndexForPrimarySequence(processedTrackType) == this.sequenceIndex) {
                        createDecodedSampleExporter(format);
                    }
                } else {
                    createEncodedSampleExporter(processedTrackType);
                }
                androidx.media3.transformer.SampleExporter sampleExporter = androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getSampleExporter(processedTrackType);
                if (sampleExporter == null) {
                    return null;
                }
                final androidx.media3.transformer.GraphInput input = sampleExporter.getInput(this.firstEditedMediaItem, format, this.sequenceIndex);
                ((androidx.media3.transformer.SequenceAssetLoader) androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.get(this.sequenceIndex)).addOnMediaItemChangedListener(new androidx.media3.transformer.OnMediaItemChangedListener() { // from class: androidx.media3.transformer.TransformerInternal$SequenceAssetLoaderListener$$ExternalSyntheticLambda0
                    @Override // androidx.media3.transformer.OnMediaItemChangedListener
                    public final void onMediaItemChanged(androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, androidx.media3.common.Format format2, boolean z) {
                        this.f$0.m442xcfd36976(processedTrackType, input, editedMediaItem, j, format2, z);
                    }
                }, processedTrackType);
                androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.registerGraphInput(processedTrackType);
                if (androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.hasAssociatedAllTracksWithGraphInput(processedTrackType)) {
                    androidx.media3.transformer.TransformerInternal.this.verifyInternalThreadAlive();
                    androidx.media3.transformer.TransformerInternal.this.internalHandler.obtainMessage(2, sampleExporter).sendToTarget();
                }
                return input;
            }
        }

        /* JADX INFO: renamed from: lambda$onOutputFormat$0$androidx-media3-transformer-TransformerInternal$SequenceAssetLoaderListener, reason: not valid java name */
        /* synthetic */ void m442xcfd36976(int i, androidx.media3.transformer.GraphInput graphInput, androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, androidx.media3.common.Format format, boolean z) {
            onMediaItemChanged(i, j, z);
            graphInput.onMediaItemChanged(editedMediaItem, j, format, z);
        }

        @Override // androidx.media3.transformer.AssetLoader.Listener
        public void onError(androidx.media3.transformer.ExportException exportException) {
            androidx.media3.transformer.TransformerInternal.this.endWithException(exportException);
        }

        private void createDecodedSampleExporter(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
            androidx.media3.common.Format formatBuild;
            int processedTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
            androidx.media3.common.util.Assertions.checkState(androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getSampleExporter(processedTrackType) == null);
            androidx.media3.common.Format assetLoaderInputFormat = androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getAssetLoaderInputFormat(this.sequenceIndex, processedTrackType);
            if (androidx.media3.common.MimeTypes.isAudio(format.sampleMimeType)) {
                androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.registerSampleExporter(1, new androidx.media3.transformer.AudioSampleExporter(assetLoaderInputFormat, format, this.transformationRequest, this.firstEditedMediaItem, this.composition.effects.audioProcessors, this.audioMixerFactory, androidx.media3.transformer.TransformerInternal.this.encoderFactory, androidx.media3.transformer.TransformerInternal.this.muxerWrapper, this.fallbackListener));
                return;
            }
            if (androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
                formatBuild = assetLoaderInputFormat.buildUpon().setColorInfo(androidx.media3.transformer.TransformerUtil.getDecoderOutputColor(androidx.media3.transformer.TransformerUtil.getValidColor(assetLoaderInputFormat.colorInfo), this.transformationRequest.hdrMode == 1)).build();
            } else if (androidx.media3.common.MimeTypes.isImage(format.sampleMimeType)) {
                formatBuild = format.buildUpon().setColorInfo(androidx.media3.transformer.TransformerUtil.getValidColor(format.colorInfo)).build();
            } else {
                throw androidx.media3.transformer.ExportException.createForUnexpected(new java.lang.IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
            }
            androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.registerSampleExporter(2, new androidx.media3.transformer.VideoSampleExporter(androidx.media3.transformer.TransformerInternal.this.context, formatBuild, this.transformationRequest, this.composition.videoCompositorSettings, this.composition.effects.videoEffects, this.videoFrameProcessorFactory, androidx.media3.transformer.TransformerInternal.this.encoderFactory, androidx.media3.transformer.TransformerInternal.this.muxerWrapper, new androidx.media3.common.util.Consumer() { // from class: androidx.media3.transformer.TransformerInternal$SequenceAssetLoaderListener$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.onError((androidx.media3.transformer.ExportException) obj);
                }
            }, this.fallbackListener, this.debugViewProvider, androidx.media3.transformer.TransformerInternal.this.videoSampleTimestampOffsetUs, androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.hasMultipleConcurrentVideoTracks()));
        }

        private void createEncodedSampleExporter(int i) {
            androidx.media3.common.util.Assertions.checkState(androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getSampleExporter(i) == null);
            androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.registerSampleExporter(i, new androidx.media3.transformer.EncodedSampleExporter(androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.getAssetLoaderInputFormat(this.sequenceIndex, i), this.transformationRequest, androidx.media3.transformer.TransformerInternal.this.muxerWrapper, this.fallbackListener, androidx.media3.transformer.TransformerInternal.this.videoSampleTimestampOffsetUs));
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:32:0x0073 A[Catch: all -> 0x00a8, TryCatch #0 {, blocks: (B:24:0x0056, B:25:0x005b, B:29:0x0065, B:36:0x00a6, B:32:0x0073, B:33:0x0082, B:35:0x008e), top: B:44:0x0056 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x008e A[Catch: all -> 0x00a8, LOOP:0: B:33:0x0082->B:35:0x008e, LOOP_END, TryCatch #0 {, blocks: (B:24:0x0056, B:25:0x005b, B:29:0x0065, B:36:0x00a6, B:32:0x0073, B:33:0x0082, B:35:0x008e), top: B:44:0x0056 }] */
        private void onMediaItemChanged(int i, long j, boolean z) {
            if (androidx.media3.transformer.TransformerInternal.this.compositionHasLoopingSequence) {
                synchronized (androidx.media3.transformer.TransformerInternal.this.assetLoaderLock) {
                    if (androidx.media3.transformer.TransformerInternal.this.assetLoaderInputTracker.sequenceHasMultipleTracks(this.sequenceIndex) && i == 2) {
                        return;
                    }
                    if (this.composition.sequences.get(this.sequenceIndex).isLooping) {
                        return;
                    }
                    boolean z2 = true;
                    androidx.media3.common.util.Assertions.checkState(j != androidx.media3.common.C.TIME_UNSET, "MediaItem duration required for sequence looping could not be extracted.");
                    this.currentSequenceDurationUs += j;
                    synchronized (androidx.media3.transformer.TransformerInternal.this.setMaxSequenceDurationUsLock) {
                        if (!z) {
                            if (androidx.media3.transformer.TransformerInternal.this.nonLoopingSequencesWithNonFinalDuration == 0) {
                                z2 = false;
                            }
                            if (this.currentSequenceDurationUs <= androidx.media3.transformer.TransformerInternal.this.currentMaxSequenceDurationUs) {
                                androidx.media3.transformer.TransformerInternal transformerInternal = androidx.media3.transformer.TransformerInternal.this;
                                transformerInternal.currentMaxSequenceDurationUs = java.lang.Math.max(this.currentSequenceDurationUs, transformerInternal.currentMaxSequenceDurationUs);
                                for (int i2 = 0; i2 < androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.size(); i2++) {
                                    ((androidx.media3.transformer.SequenceAssetLoader) androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.get(i2)).setMaxSequenceDurationUs(androidx.media3.transformer.TransformerInternal.this.currentMaxSequenceDurationUs, z2);
                                }
                            } else {
                                androidx.media3.transformer.TransformerInternal transformerInternal2 = androidx.media3.transformer.TransformerInternal.this;
                                transformerInternal2.currentMaxSequenceDurationUs = java.lang.Math.max(this.currentSequenceDurationUs, transformerInternal2.currentMaxSequenceDurationUs);
                                while (i2 < androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.size()) {
                                    ((androidx.media3.transformer.SequenceAssetLoader) androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.get(i2)).setMaxSequenceDurationUs(androidx.media3.transformer.TransformerInternal.this.currentMaxSequenceDurationUs, z2);
                                }
                            }
                        } else {
                            androidx.media3.transformer.TransformerInternal.access$1110(androidx.media3.transformer.TransformerInternal.this);
                            if (androidx.media3.transformer.TransformerInternal.this.nonLoopingSequencesWithNonFinalDuration == 0) {
                                z2 = false;
                            }
                            if (this.currentSequenceDurationUs <= androidx.media3.transformer.TransformerInternal.this.currentMaxSequenceDurationUs || z2) {
                                androidx.media3.transformer.TransformerInternal transformerInternal3 = androidx.media3.transformer.TransformerInternal.this;
                                transformerInternal3.currentMaxSequenceDurationUs = java.lang.Math.max(this.currentSequenceDurationUs, transformerInternal3.currentMaxSequenceDurationUs);
                                while (i2 < androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.size()) {
                                    ((androidx.media3.transformer.SequenceAssetLoader) androidx.media3.transformer.TransformerInternal.this.sequenceAssetLoaders.get(i2)).setMaxSequenceDurationUs(androidx.media3.transformer.TransformerInternal.this.currentMaxSequenceDurationUs, z2);
                                }
                            }
                        }
                        throw th;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0022  */
        private boolean shouldTranscode(androidx.media3.common.Format format, int i) {
            boolean zShouldTranscodeAudio;
            boolean z = (i & 2) != 0;
            boolean z2 = (i & 1) != 0;
            androidx.media3.common.util.Assertions.checkArgument(z || z2);
            int processedTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
            if (!z2) {
                zShouldTranscodeAudio = true;
            } else if (processedTrackType == 1) {
                zShouldTranscodeAudio = androidx.media3.transformer.TransformerUtil.shouldTranscodeAudio(format, this.composition, this.sequenceIndex, this.transformationRequest, androidx.media3.transformer.TransformerInternal.this.encoderFactory, androidx.media3.transformer.TransformerInternal.this.muxerWrapper);
            } else if (processedTrackType == 2 && (androidx.media3.transformer.TransformerUtil.shouldTranscodeVideo(format, this.composition, this.sequenceIndex, this.transformationRequest, androidx.media3.transformer.TransformerInternal.this.encoderFactory, androidx.media3.transformer.TransformerInternal.this.muxerWrapper) || androidx.media3.transformer.TransformerInternal.clippingRequiresTranscode(this.firstEditedMediaItem.mediaItem))) {
                zShouldTranscodeAudio = true;
            } else {
                zShouldTranscodeAudio = false;
            }
            androidx.media3.common.util.Assertions.checkState(!zShouldTranscodeAudio || z);
            return zShouldTranscodeAudio;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean clippingRequiresTranscode(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.clippingConfiguration.startPositionMs > 0 && !mediaItem.clippingConfiguration.startsAtKeyFrame;
    }

    private static final class AssetLoaderInputTracker {
        private final java.util.List<androidx.media3.transformer.TransformerInternal.AssetLoaderInputTracker.SequenceMetadata> sequencesMetadata = new java.util.ArrayList();
        private final android.util.SparseArray<java.lang.Integer> trackTypeToNumberOfRegisteredGraphInput;
        private final android.util.SparseArray<androidx.media3.transformer.SampleExporter> trackTypeToSampleExporter;
        private final android.util.SparseArray<java.lang.Boolean> trackTypeToShouldTranscode;

        private static final class SequenceMetadata {
            public final android.util.SparseArray<androidx.media3.common.Format> trackTypeToFirstAssetLoaderInputFormat = new android.util.SparseArray<>();
            public int requiredTrackCount = -1;
        }

        public AssetLoaderInputTracker(androidx.media3.transformer.Composition composition) {
            for (int i = 0; i < composition.sequences.size(); i++) {
                this.sequencesMetadata.add(new androidx.media3.transformer.TransformerInternal.AssetLoaderInputTracker.SequenceMetadata());
            }
            this.trackTypeToSampleExporter = new android.util.SparseArray<>();
            this.trackTypeToShouldTranscode = new android.util.SparseArray<>();
            this.trackTypeToNumberOfRegisteredGraphInput = new android.util.SparseArray<>();
        }

        public androidx.media3.common.Format getAssetLoaderInputFormat(int i, int i2) {
            android.util.SparseArray<androidx.media3.common.Format> sparseArray = this.sequencesMetadata.get(i).trackTypeToFirstAssetLoaderInputFormat;
            androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(sparseArray, i2));
            return sparseArray.get(i2);
        }

        public boolean sequenceHasMultipleTracks(int i) {
            return this.sequencesMetadata.get(i).trackTypeToFirstAssetLoaderInputFormat.size() > 1;
        }

        public void setTrackCount(int i, int i2) {
            this.sequencesMetadata.get(i).requiredTrackCount = i2;
        }

        public boolean hasAllTrackCounts() {
            for (int i = 0; i < this.sequencesMetadata.size(); i++) {
                if (this.sequencesMetadata.get(i).requiredTrackCount == -1) {
                    return false;
                }
            }
            return true;
        }

        public void registerTrack(int i, androidx.media3.common.Format format) {
            int processedTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
            android.util.SparseArray<androidx.media3.common.Format> sparseArray = this.sequencesMetadata.get(i).trackTypeToFirstAssetLoaderInputFormat;
            androidx.media3.common.util.Assertions.checkState(!androidx.media3.common.util.Util.contains(sparseArray, processedTrackType));
            sparseArray.put(processedTrackType, format);
        }

        public int getIndexForPrimarySequence(int i) {
            androidx.media3.common.util.Assertions.checkState(hasRegisteredAllTracks(), "Primary track can only be queried after all tracks are added.");
            for (int i2 = 0; i2 < this.sequencesMetadata.size(); i2++) {
                if (androidx.media3.common.util.Util.contains(this.sequencesMetadata.get(i2).trackTypeToFirstAssetLoaderInputFormat, i)) {
                    return i2;
                }
            }
            return -1;
        }

        public boolean hasRegisteredAllTracks() {
            if (!hasAllTrackCounts()) {
                return false;
            }
            for (int i = 0; i < this.sequencesMetadata.size(); i++) {
                androidx.media3.transformer.TransformerInternal.AssetLoaderInputTracker.SequenceMetadata sequenceMetadata = this.sequencesMetadata.get(i);
                if (sequenceMetadata.requiredTrackCount != sequenceMetadata.trackTypeToFirstAssetLoaderInputFormat.size()) {
                    return false;
                }
            }
            return true;
        }

        public void registerGraphInput(int i) {
            this.trackTypeToNumberOfRegisteredGraphInput.put(i, java.lang.Integer.valueOf(androidx.media3.common.util.Util.contains(this.trackTypeToNumberOfRegisteredGraphInput, i) ? 1 + this.trackTypeToNumberOfRegisteredGraphInput.get(i).intValue() : 1));
        }

        public boolean hasAssociatedAllTracksWithGraphInput(int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.sequencesMetadata.size(); i3++) {
                if (androidx.media3.common.util.Util.contains(this.sequencesMetadata.get(i3).trackTypeToFirstAssetLoaderInputFormat, i)) {
                    i2++;
                }
            }
            return this.trackTypeToNumberOfRegisteredGraphInput.get(i).intValue() == i2;
        }

        public int getOutputTrackCount() {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.sequencesMetadata.size(); i3++) {
                android.util.SparseArray<androidx.media3.common.Format> sparseArray = this.sequencesMetadata.get(i3).trackTypeToFirstAssetLoaderInputFormat;
                if (androidx.media3.common.util.Util.contains(sparseArray, 1)) {
                    i = 1;
                }
                if (androidx.media3.common.util.Util.contains(sparseArray, 2)) {
                    i2 = 1;
                }
            }
            return i + i2;
        }

        public boolean hasMultipleConcurrentVideoTracks() {
            if (this.sequencesMetadata.size() < 2) {
                return false;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.sequencesMetadata.size(); i2++) {
                if (androidx.media3.common.util.Util.contains(this.sequencesMetadata.get(i2).trackTypeToFirstAssetLoaderInputFormat, 2)) {
                    i++;
                }
            }
            return i > 1;
        }

        public void registerSampleExporter(int i, androidx.media3.transformer.SampleExporter sampleExporter) {
            androidx.media3.common.util.Assertions.checkState(!androidx.media3.common.util.Util.contains(this.trackTypeToSampleExporter, i), "Exactly one SampleExporter can be added for each track type.");
            this.trackTypeToSampleExporter.put(i, sampleExporter);
        }

        public void setShouldTranscode(int i, boolean z) {
            if (androidx.media3.common.util.Util.contains(this.trackTypeToShouldTranscode, i)) {
                androidx.media3.common.util.Assertions.checkState(z == this.trackTypeToShouldTranscode.get(i).booleanValue());
            } else {
                this.trackTypeToShouldTranscode.put(i, java.lang.Boolean.valueOf(z));
            }
        }

        public boolean shouldTranscode(int i) {
            androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.trackTypeToShouldTranscode, i));
            return this.trackTypeToShouldTranscode.get(i).booleanValue();
        }

        public androidx.media3.transformer.SampleExporter getSampleExporter(int i) {
            return this.trackTypeToSampleExporter.get(i);
        }
    }
}
