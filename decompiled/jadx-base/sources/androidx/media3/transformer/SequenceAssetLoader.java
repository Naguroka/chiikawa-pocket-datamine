package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class SequenceAssetLoader implements androidx.media3.transformer.AssetLoader, androidx.media3.transformer.AssetLoader.Listener {
    private static final androidx.media3.common.Format FORCE_AUDIO_TRACK_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AAC).setSampleRate(44100).setChannelCount(2).build();
    private final androidx.media3.transformer.AssetLoader.Factory assetLoaderFactory;
    private final androidx.media3.transformer.AssetLoader.CompositionSettings compositionSettings;
    private volatile long currentAssetDurationAfterEffectsAppliedUs;
    private volatile long currentAssetDurationUs;
    private androidx.media3.transformer.AssetLoader currentAssetLoader;
    private int currentMediaItemIndex;
    private boolean decodeAudio;
    private boolean decodeVideo;
    private final java.util.List<androidx.media3.transformer.EditedMediaItem> editedMediaItems;
    private final boolean forceAudioTrack;
    private final androidx.media3.common.util.HandlerWrapper handler;
    private boolean isCurrentAssetFirstAsset;
    private final boolean isLooping;
    private volatile boolean isMaxSequenceDurationUsFinal;
    private boolean isTrackCountReported;
    private volatile long maxSequenceDurationUs;
    private final java.util.Map<java.lang.Integer, androidx.media3.transformer.OnMediaItemChangedListener> mediaItemChangedListenersByTrackType;
    private final java.util.concurrent.atomic.AtomicInteger nonEndedTrackCount;
    private final com.google.common.collect.ImmutableList.Builder<androidx.media3.transformer.ExportResult.ProcessedInput> processedInputsBuilder;
    private int processedInputsSize;
    private volatile boolean released;
    private final java.util.concurrent.atomic.AtomicInteger reportedTrackCount;
    private final java.util.Map<java.lang.Integer, androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper> sampleConsumersByTrackType;
    private final androidx.media3.transformer.AssetLoader.Listener sequenceAssetLoaderListener;
    private int sequenceLoopCount;

    static /* synthetic */ int access$1308(androidx.media3.transformer.SequenceAssetLoader sequenceAssetLoader) {
        int i = sequenceAssetLoader.sequenceLoopCount;
        sequenceAssetLoader.sequenceLoopCount = i + 1;
        return i;
    }

    static /* synthetic */ int access$408(androidx.media3.transformer.SequenceAssetLoader sequenceAssetLoader) {
        int i = sequenceAssetLoader.currentMediaItemIndex;
        sequenceAssetLoader.currentMediaItemIndex = i + 1;
        return i;
    }

    public SequenceAssetLoader(androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence, boolean z, androidx.media3.transformer.AssetLoader.Factory factory, androidx.media3.transformer.AssetLoader.CompositionSettings compositionSettings, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.common.util.Clock clock, android.os.Looper looper) {
        com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItem> immutableList = editedMediaItemSequence.editedMediaItems;
        this.editedMediaItems = immutableList;
        this.isLooping = editedMediaItemSequence.isLooping;
        this.forceAudioTrack = z;
        this.assetLoaderFactory = factory;
        this.compositionSettings = compositionSettings;
        this.sequenceAssetLoaderListener = listener;
        this.handler = clock.createHandler(looper, null);
        this.sampleConsumersByTrackType = new java.util.HashMap();
        this.mediaItemChangedListenersByTrackType = new java.util.HashMap();
        this.processedInputsBuilder = new com.google.common.collect.ImmutableList.Builder<>();
        this.reportedTrackCount = new java.util.concurrent.atomic.AtomicInteger();
        this.nonEndedTrackCount = new java.util.concurrent.atomic.AtomicInteger();
        this.isCurrentAssetFirstAsset = true;
        this.currentAssetLoader = factory.createAssetLoader(immutableList.get(0), looper, this, compositionSettings);
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.currentAssetLoader.start();
        if (this.editedMediaItems.size() > 1 || this.isLooping) {
            this.sequenceAssetLoaderListener.onDurationUs(androidx.media3.common.C.TIME_UNSET);
        }
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        if (this.isLooping) {
            return 3;
        }
        int progress = this.currentAssetLoader.getProgress(progressHolder);
        int size = this.editedMediaItems.size();
        if (size == 1 || progress == 0) {
            return progress;
        }
        int i = (this.currentMediaItemIndex * 100) / size;
        if (progress == 2) {
            i += progressHolder.progress / size;
        }
        progressHolder.progress = i;
        return 2;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.String> getDecoderNames() {
        return this.currentAssetLoader.getDecoderNames();
    }

    public com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> getProcessedInputs() {
        addCurrentProcessedInput();
        return this.processedInputsBuilder.build();
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void release() {
        this.currentAssetLoader.release();
        this.released = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentProcessedInput() {
        int size = this.sequenceLoopCount * this.editedMediaItems.size();
        int i = this.currentMediaItemIndex;
        if (size + i >= this.processedInputsSize) {
            androidx.media3.common.MediaItem mediaItem = this.editedMediaItems.get(i).mediaItem;
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.String> decoderNames = this.currentAssetLoader.getDecoderNames();
            this.processedInputsBuilder.add(new androidx.media3.transformer.ExportResult.ProcessedInput(mediaItem, decoderNames.get(1), decoderNames.get(2)));
            this.processedInputsSize++;
        }
    }

    public void addOnMediaItemChangedListener(androidx.media3.transformer.OnMediaItemChangedListener onMediaItemChangedListener, int i) {
        androidx.media3.common.util.Assertions.checkArgument(i == 1 || i == 2);
        androidx.media3.common.util.Assertions.checkArgument(this.mediaItemChangedListenersByTrackType.get(java.lang.Integer.valueOf(i)) == null);
        this.mediaItemChangedListenersByTrackType.put(java.lang.Integer.valueOf(i), onMediaItemChangedListener);
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public boolean onTrackAdded(androidx.media3.common.Format format, int i) {
        int i2 = 0;
        boolean z = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType) == 1;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z ? "audio" : "video";
        objArr[1] = format;
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_ASSET_LOADER, androidx.media3.effect.DebugTraceUtil.EVENT_INPUT_FORMAT, androidx.media3.common.C.TIME_UNSET, com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, objArr);
        if (!this.isCurrentAssetFirstAsset) {
            return z ? this.decodeAudio : this.decodeVideo;
        }
        if (this.forceAudioTrack && this.reportedTrackCount.get() == 1 && !z) {
            i2 = 1;
        }
        if (!this.isTrackCountReported) {
            this.sequenceAssetLoaderListener.onTrackCount(this.reportedTrackCount.get() + i2);
            this.isTrackCountReported = true;
        }
        boolean zOnTrackAdded = this.sequenceAssetLoaderListener.onTrackAdded(format, i);
        if (z) {
            this.decodeAudio = zOnTrackAdded;
        } else {
            this.decodeVideo = zOnTrackAdded;
        }
        if (i2 != 0) {
            this.sequenceAssetLoaderListener.onTrackAdded(FORCE_AUDIO_TRACK_FORMAT, 2);
            this.decodeAudio = true;
        }
        return zOnTrackAdded;
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper onOutputFormat(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper sampleConsumerWrapper;
        int processedTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_ASSET_LOADER, androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_FORMAT, androidx.media3.common.C.TIME_UNSET, com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, androidx.media3.common.util.Util.getTrackTypeString(processedTrackType), format);
        if (this.isCurrentAssetFirstAsset) {
            androidx.media3.transformer.SampleConsumer sampleConsumerOnOutputFormat = this.sequenceAssetLoaderListener.onOutputFormat(format);
            if (sampleConsumerOnOutputFormat == null) {
                return null;
            }
            sampleConsumerWrapper = new androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper(sampleConsumerOnOutputFormat, processedTrackType);
            this.sampleConsumersByTrackType.put(java.lang.Integer.valueOf(processedTrackType), sampleConsumerWrapper);
            if (this.forceAudioTrack && this.reportedTrackCount.get() == 1 && processedTrackType == 2) {
                this.sampleConsumersByTrackType.put(1, new androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper((androidx.media3.transformer.SampleConsumer) androidx.media3.common.util.Assertions.checkStateNotNull(this.sequenceAssetLoaderListener.onOutputFormat(FORCE_AUDIO_TRACK_FORMAT.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setPcmEncoding(2).build())), processedTrackType));
            }
        } else {
            androidx.media3.common.util.Assertions.checkState(!(this.reportedTrackCount.get() == 1 && processedTrackType == 1 && this.sampleConsumersByTrackType.size() == 2), "Inputs with no video track are not supported when the output contains a video track");
            sampleConsumerWrapper = (androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper) androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleConsumersByTrackType.get(java.lang.Integer.valueOf(processedTrackType)), androidx.media3.common.util.Util.formatInvariant("The preceding MediaItem does not contain any track of type %d. If the Composition contains a sequence that starts with items without audio tracks (like images), followed by items with audio tracks, Composition.Builder.experimentalSetForceAudioTrack() needs to be set to true.", java.lang.Integer.valueOf(processedTrackType)));
        }
        onMediaItemChanged(processedTrackType, format);
        if (this.reportedTrackCount.get() == 1 && this.sampleConsumersByTrackType.size() == 2) {
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, androidx.media3.transformer.SequenceAssetLoader.SampleConsumerWrapper>> it = this.sampleConsumersByTrackType.entrySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().getKey().intValue();
                if (processedTrackType != iIntValue) {
                    onMediaItemChanged(iIntValue, null);
                }
            }
        }
        return sampleConsumerWrapper;
    }

    private void onMediaItemChanged(int i, androidx.media3.common.Format format) {
        androidx.media3.transformer.OnMediaItemChangedListener onMediaItemChangedListener = this.mediaItemChangedListenersByTrackType.get(java.lang.Integer.valueOf(i));
        if (onMediaItemChangedListener == null) {
            return;
        }
        onMediaItemChangedListener.onMediaItemChanged(this.editedMediaItems.get(this.currentMediaItemIndex), (i == 1 && this.isLooping && this.decodeAudio) ? androidx.media3.common.C.TIME_UNSET : this.currentAssetDurationUs, format, this.currentMediaItemIndex == this.editedMediaItems.size() - 1);
    }

    public void setMaxSequenceDurationUs(long j, boolean z) {
        this.maxSequenceDurationUs = j;
        this.isMaxSequenceDurationUsFinal = z;
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public void onDurationUs(long j) {
        androidx.media3.common.util.Assertions.checkArgument(j != androidx.media3.common.C.TIME_UNSET || this.currentMediaItemIndex == this.editedMediaItems.size() - 1, "Could not retrieve required duration for EditedMediaItem " + this.currentMediaItemIndex);
        this.currentAssetDurationAfterEffectsAppliedUs = this.editedMediaItems.get(this.currentMediaItemIndex).getDurationAfterEffectsApplied(j);
        this.currentAssetDurationUs = j;
        if (this.editedMediaItems.size() != 1 || this.isLooping) {
            return;
        }
        this.sequenceAssetLoaderListener.onDurationUs(this.currentAssetDurationAfterEffectsAppliedUs);
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public void onTrackCount(int i) {
        this.reportedTrackCount.set(i);
        this.nonEndedTrackCount.set(i);
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public void onError(androidx.media3.transformer.ExportException exportException) {
        this.sequenceAssetLoaderListener.onError(exportException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SampleConsumerWrapper implements androidx.media3.transformer.SampleConsumer {
        private boolean audioLoopingEnded;
        private final androidx.media3.transformer.SampleConsumer sampleConsumer;
        private long totalDurationUs;
        private final int trackType;
        private boolean videoLoopingEnded;

        public SampleConsumerWrapper(androidx.media3.transformer.SampleConsumer sampleConsumer, int i) {
            this.sampleConsumer = sampleConsumer;
            this.trackType = i;
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public androidx.media3.decoder.DecoderInputBuffer getInputBuffer() {
            return this.sampleConsumer.getInputBuffer();
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public boolean queueInputBuffer() {
            androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = (androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleConsumer.getInputBuffer());
            long j = this.totalDurationUs + decoderInputBuffer.timeUs;
            if (androidx.media3.transformer.SequenceAssetLoader.this.isLooping && (j >= androidx.media3.transformer.SequenceAssetLoader.this.maxSequenceDurationUs || this.audioLoopingEnded)) {
                if (androidx.media3.transformer.SequenceAssetLoader.this.isMaxSequenceDurationUsFinal && !this.audioLoopingEnded) {
                    ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.data)).limit(0);
                    decoderInputBuffer.setFlags(4);
                    androidx.media3.common.util.Assertions.checkState(this.sampleConsumer.queueInputBuffer());
                    this.audioLoopingEnded = true;
                    androidx.media3.transformer.SequenceAssetLoader.this.nonEndedTrackCount.decrementAndGet();
                }
                return false;
            }
            if (decoderInputBuffer.isEndOfStream()) {
                androidx.media3.transformer.SequenceAssetLoader.this.nonEndedTrackCount.decrementAndGet();
                if (androidx.media3.transformer.SequenceAssetLoader.this.currentMediaItemIndex < androidx.media3.transformer.SequenceAssetLoader.this.editedMediaItems.size() - 1 || androidx.media3.transformer.SequenceAssetLoader.this.isLooping) {
                    if (this.trackType == 1 && !androidx.media3.transformer.SequenceAssetLoader.this.isLooping && androidx.media3.transformer.SequenceAssetLoader.this.decodeAudio) {
                        androidx.media3.common.util.Assertions.checkState(this.sampleConsumer.queueInputBuffer());
                    } else {
                        decoderInputBuffer.clear();
                        decoderInputBuffer.timeUs = 0L;
                    }
                    if (androidx.media3.transformer.SequenceAssetLoader.this.nonEndedTrackCount.get() == 0) {
                        switchAssetLoader();
                    }
                    return true;
                }
            }
            androidx.media3.common.util.Assertions.checkState(this.sampleConsumer.queueInputBuffer());
            return true;
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public int queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
            if (androidx.media3.transformer.SequenceAssetLoader.this.isLooping) {
                long j = -9223372036854775807L;
                while (timestampIterator.hasNext()) {
                    long next = timestampIterator.next();
                    if (this.totalDurationUs + next > androidx.media3.transformer.SequenceAssetLoader.this.maxSequenceDurationUs) {
                        if (!androidx.media3.transformer.SequenceAssetLoader.this.isMaxSequenceDurationUsFinal) {
                            return 2;
                        }
                        if (j == androidx.media3.common.C.TIME_UNSET) {
                            if (this.videoLoopingEnded) {
                                return 2;
                            }
                            this.videoLoopingEnded = true;
                            signalEndOfVideoInput();
                            return 3;
                        }
                        androidx.media3.transformer.SequenceAssetLoader.ClippingIterator clippingIterator = new androidx.media3.transformer.SequenceAssetLoader.ClippingIterator(timestampIterator.copyOf(), j);
                        this.videoLoopingEnded = true;
                        timestampIterator = clippingIterator;
                        break;
                    }
                    j = next;
                }
            }
            return this.sampleConsumer.queueInputBitmap(bitmap, timestampIterator.copyOf());
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
            this.sampleConsumer.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public int queueInputTexture(int i, long j) {
            long j2 = this.totalDurationUs + j;
            if (androidx.media3.transformer.SequenceAssetLoader.this.isLooping && j2 >= androidx.media3.transformer.SequenceAssetLoader.this.maxSequenceDurationUs) {
                if (!androidx.media3.transformer.SequenceAssetLoader.this.isMaxSequenceDurationUsFinal || this.videoLoopingEnded) {
                    return 2;
                }
                this.videoLoopingEnded = true;
                signalEndOfVideoInput();
                return 3;
            }
            return this.sampleConsumer.queueInputTexture(i, j);
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public android.view.Surface getInputSurface() {
            return this.sampleConsumer.getInputSurface();
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public int getPendingVideoFrameCount() {
            return this.sampleConsumer.getPendingVideoFrameCount();
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public boolean registerVideoFrame(long j) {
            long j2 = this.totalDurationUs + j;
            if (androidx.media3.transformer.SequenceAssetLoader.this.isLooping && j2 >= androidx.media3.transformer.SequenceAssetLoader.this.maxSequenceDurationUs) {
                if (!androidx.media3.transformer.SequenceAssetLoader.this.isMaxSequenceDurationUsFinal || this.videoLoopingEnded) {
                    return false;
                }
                this.videoLoopingEnded = true;
                signalEndOfVideoInput();
                return false;
            }
            return this.sampleConsumer.registerVideoFrame(j);
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public void signalEndOfVideoInput() {
            boolean z;
            androidx.media3.transformer.SequenceAssetLoader.this.nonEndedTrackCount.decrementAndGet();
            if (androidx.media3.transformer.SequenceAssetLoader.this.isLooping) {
                z = this.videoLoopingEnded;
            } else {
                z = androidx.media3.transformer.SequenceAssetLoader.this.currentMediaItemIndex == androidx.media3.transformer.SequenceAssetLoader.this.editedMediaItems.size() - 1;
            }
            if (!z) {
                if (androidx.media3.transformer.SequenceAssetLoader.this.nonEndedTrackCount.get() == 0) {
                    switchAssetLoader();
                    return;
                }
                return;
            }
            this.sampleConsumer.signalEndOfVideoInput();
        }

        private void switchAssetLoader() {
            androidx.media3.transformer.SequenceAssetLoader.this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.SequenceAssetLoader$SampleConsumerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m437x77936abd();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$switchAssetLoader$0$androidx-media3-transformer-SequenceAssetLoader$SampleConsumerWrapper, reason: not valid java name */
        /* synthetic */ void m437x77936abd() {
            try {
                if (androidx.media3.transformer.SequenceAssetLoader.this.released) {
                    return;
                }
                androidx.media3.transformer.SequenceAssetLoader.this.addCurrentProcessedInput();
                this.totalDurationUs += androidx.media3.transformer.SequenceAssetLoader.this.currentAssetDurationAfterEffectsAppliedUs;
                androidx.media3.transformer.SequenceAssetLoader.this.currentAssetLoader.release();
                androidx.media3.transformer.SequenceAssetLoader.this.isCurrentAssetFirstAsset = false;
                androidx.media3.transformer.SequenceAssetLoader.access$408(androidx.media3.transformer.SequenceAssetLoader.this);
                if (androidx.media3.transformer.SequenceAssetLoader.this.currentMediaItemIndex == androidx.media3.transformer.SequenceAssetLoader.this.editedMediaItems.size()) {
                    androidx.media3.transformer.SequenceAssetLoader.this.currentMediaItemIndex = 0;
                    androidx.media3.transformer.SequenceAssetLoader.access$1308(androidx.media3.transformer.SequenceAssetLoader.this);
                }
                androidx.media3.transformer.EditedMediaItem editedMediaItem = (androidx.media3.transformer.EditedMediaItem) androidx.media3.transformer.SequenceAssetLoader.this.editedMediaItems.get(androidx.media3.transformer.SequenceAssetLoader.this.currentMediaItemIndex);
                androidx.media3.transformer.SequenceAssetLoader sequenceAssetLoader = androidx.media3.transformer.SequenceAssetLoader.this;
                androidx.media3.transformer.AssetLoader.Factory factory = sequenceAssetLoader.assetLoaderFactory;
                android.os.Looper looper = (android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(android.os.Looper.myLooper());
                androidx.media3.transformer.SequenceAssetLoader sequenceAssetLoader2 = androidx.media3.transformer.SequenceAssetLoader.this;
                sequenceAssetLoader.currentAssetLoader = factory.createAssetLoader(editedMediaItem, looper, sequenceAssetLoader2, sequenceAssetLoader2.compositionSettings);
                androidx.media3.transformer.SequenceAssetLoader.this.currentAssetLoader.start();
            } catch (java.lang.RuntimeException e) {
                androidx.media3.transformer.SequenceAssetLoader.this.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e, 1000));
            }
        }
    }

    private static final class ClippingIterator implements androidx.media3.common.util.TimestampIterator {
        private final long clippingValue;
        private boolean hasReachedClippingValue;
        private final androidx.media3.common.util.TimestampIterator iterator;

        public ClippingIterator(androidx.media3.common.util.TimestampIterator timestampIterator, long j) {
            this.iterator = timestampIterator;
            this.clippingValue = j;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public boolean hasNext() {
            return !this.hasReachedClippingValue && this.iterator.hasNext();
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long next() {
            androidx.media3.common.util.Assertions.checkState(hasNext());
            long next = this.iterator.next();
            if (this.clippingValue <= next) {
                this.hasReachedClippingValue = true;
            }
            return next;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public androidx.media3.common.util.TimestampIterator copyOf() {
            return new androidx.media3.transformer.SequenceAssetLoader.ClippingIterator(this.iterator.copyOf(), this.clippingValue);
        }
    }
}
