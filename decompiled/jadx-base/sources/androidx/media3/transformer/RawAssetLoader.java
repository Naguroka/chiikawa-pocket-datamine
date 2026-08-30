package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class RawAssetLoader implements androidx.media3.transformer.AssetLoader {
    private final androidx.media3.transformer.AssetLoader.Listener assetLoaderListener;
    private final androidx.media3.common.Format audioFormat;
    private androidx.media3.transformer.SampleConsumer audioSampleConsumer;
    private final androidx.media3.transformer.EditedMediaItem editedMediaItem;
    private final androidx.media3.common.OnInputFrameProcessedListener frameProcessedListener;
    private boolean isAudioEndOfStreamSignaled;
    private boolean isAudioTrackAdded;
    private volatile boolean isStarted;
    private boolean isVideoEndOfStreamSignaled;
    private boolean isVideoTrackAdded;
    private volatile long lastQueuedAudioPresentationTimeUs;
    private volatile long lastQueuedVideoPresentationTimeUs;
    private int progressState;
    private final androidx.media3.common.Format videoFormat;
    private androidx.media3.transformer.SampleConsumer videoSampleConsumer;

    public RawAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.common.Format format, androidx.media3.common.Format format2, androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        boolean z = true;
        androidx.media3.common.util.Assertions.checkArgument((format == null && format2 == null) ? false : true);
        androidx.media3.common.util.Assertions.checkArgument(editedMediaItem.durationUs != androidx.media3.common.C.TIME_UNSET);
        if (format2 != null && (format2.height == -1 || format2.width == -1)) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        this.editedMediaItem = editedMediaItem;
        this.assetLoaderListener = listener;
        this.audioFormat = format;
        this.videoFormat = format2 != null ? format2.buildUpon().setColorInfo(androidx.media3.transformer.TransformerUtil.getValidColor(format2.colorInfo)).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_RAW).build() : null;
        this.frameProcessedListener = onInputFrameProcessedListener;
        this.progressState = 0;
        this.lastQueuedAudioPresentationTimeUs = Long.MAX_VALUE;
        this.lastQueuedVideoPresentationTimeUs = Long.MAX_VALUE;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.progressState = 2;
        this.assetLoaderListener.onDurationUs(this.editedMediaItem.durationUs);
        this.assetLoaderListener.onTrackCount((this.audioFormat == null || this.videoFormat == null) ? 1 : 2);
        this.isStarted = true;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        if (this.progressState == 2) {
            long jMin = java.lang.Math.min(this.lastQueuedAudioPresentationTimeUs, this.lastQueuedVideoPresentationTimeUs);
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            progressHolder.progress = java.lang.Math.round((jMin / this.editedMediaItem.durationUs) * 100.0f);
        }
        return this.progressState;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.String> getDecoderNames() {
        return com.google.common.collect.ImmutableMap.of();
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void release() {
        this.progressState = 0;
    }

    public boolean queueInputTexture(int i, long j) {
        androidx.media3.common.util.Assertions.checkState(!this.isVideoEndOfStreamSignaled);
        try {
            if (!this.isVideoTrackAdded) {
                if (!this.isStarted) {
                    return false;
                }
                this.assetLoaderListener.onTrackAdded((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.videoFormat), 2);
                this.isVideoTrackAdded = true;
            }
            if (this.videoSampleConsumer == null) {
                androidx.media3.transformer.SampleConsumer sampleConsumerOnOutputFormat = this.assetLoaderListener.onOutputFormat((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.videoFormat));
                if (sampleConsumerOnOutputFormat == null) {
                    return false;
                }
                this.videoSampleConsumer = sampleConsumerOnOutputFormat;
                sampleConsumerOnOutputFormat.setOnInputFrameProcessedListener((androidx.media3.common.OnInputFrameProcessedListener) androidx.media3.common.util.Assertions.checkNotNull(this.frameProcessedListener));
            }
            int iQueueInputTexture = this.videoSampleConsumer.queueInputTexture(i, j);
            if (iQueueInputTexture == 2) {
                return false;
            }
            if (iQueueInputTexture == 3) {
                this.isVideoEndOfStreamSignaled = true;
            }
            this.lastQueuedVideoPresentationTimeUs = j;
            return true;
        } catch (androidx.media3.transformer.ExportException e) {
            this.assetLoaderListener.onError(e);
            return false;
        } catch (java.lang.RuntimeException e2) {
            this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e2, 1000));
            return false;
        }
    }

    public void signalEndOfVideoInput() {
        try {
            if (this.isVideoEndOfStreamSignaled) {
                return;
            }
            this.isVideoEndOfStreamSignaled = true;
            ((androidx.media3.transformer.SampleConsumer) androidx.media3.common.util.Assertions.checkNotNull(this.videoSampleConsumer)).signalEndOfVideoInput();
        } catch (java.lang.RuntimeException e) {
            this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e, 1000));
        }
    }

    public boolean queueAudioData(java.nio.ByteBuffer byteBuffer, long j, boolean z) {
        androidx.media3.common.util.Assertions.checkState(!this.isAudioEndOfStreamSignaled);
        if (!this.isStarted) {
            return false;
        }
        try {
            if (!this.isAudioTrackAdded) {
                this.assetLoaderListener.onTrackAdded((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.audioFormat), 2);
                this.isAudioTrackAdded = true;
            }
            if (this.audioSampleConsumer == null) {
                androidx.media3.transformer.SampleConsumer sampleConsumerOnOutputFormat = this.assetLoaderListener.onOutputFormat((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.audioFormat));
                if (sampleConsumerOnOutputFormat == null) {
                    return false;
                }
                this.audioSampleConsumer = sampleConsumerOnOutputFormat;
            }
            androidx.media3.decoder.DecoderInputBuffer inputBuffer = this.audioSampleConsumer.getInputBuffer();
            if (inputBuffer == null) {
                return false;
            }
            inputBuffer.ensureSpaceForWrite(byteBuffer.remaining());
            inputBuffer.data.put(byteBuffer).flip();
            if (z) {
                inputBuffer.addFlag(4);
            }
            if (this.audioSampleConsumer.queueInputBuffer()) {
                this.lastQueuedAudioPresentationTimeUs = j;
                this.isAudioEndOfStreamSignaled = z;
                return true;
            }
        } catch (androidx.media3.transformer.ExportException e) {
            this.assetLoaderListener.onError(e);
        } catch (java.lang.RuntimeException e2) {
            this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e2, 1000));
        }
        return false;
    }
}
