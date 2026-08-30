package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class TextureAssetLoader implements androidx.media3.transformer.AssetLoader {
    private final androidx.media3.transformer.AssetLoader.Listener assetLoaderListener;
    private final androidx.media3.transformer.EditedMediaItem editedMediaItem;
    private final androidx.media3.common.Format format;
    private final androidx.media3.common.OnInputFrameProcessedListener frameProcessedListener;
    private boolean isEndOfStreamSignaled;
    private volatile boolean isStarted;
    private boolean isTrackAdded;
    private volatile long lastQueuedPresentationTimeUs;
    private int progressState;
    private androidx.media3.transformer.SampleConsumer sampleConsumer;

    public TextureAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.common.Format format, androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        androidx.media3.common.util.Assertions.checkArgument(editedMediaItem.durationUs != androidx.media3.common.C.TIME_UNSET);
        androidx.media3.common.util.Assertions.checkArgument((format.height == -1 || format.width == -1) ? false : true);
        this.editedMediaItem = editedMediaItem;
        this.assetLoaderListener = listener;
        this.format = format.buildUpon().setColorInfo(androidx.media3.transformer.TransformerUtil.getValidColor(format.colorInfo)).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_RAW).build();
        this.frameProcessedListener = onInputFrameProcessedListener;
        this.progressState = 0;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.progressState = 2;
        this.assetLoaderListener.onDurationUs(this.editedMediaItem.durationUs);
        this.assetLoaderListener.onTrackCount(1);
        this.isStarted = true;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        if (this.progressState == 2) {
            progressHolder.progress = java.lang.Math.round((this.lastQueuedPresentationTimeUs / this.editedMediaItem.durationUs) * 100.0f);
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
        try {
            if (!this.isTrackAdded) {
                if (!this.isStarted) {
                    return false;
                }
                this.assetLoaderListener.onTrackAdded(this.format, 2);
                this.isTrackAdded = true;
            }
            if (this.sampleConsumer == null) {
                androidx.media3.transformer.SampleConsumer sampleConsumerOnOutputFormat = this.assetLoaderListener.onOutputFormat(this.format);
                if (sampleConsumerOnOutputFormat == null) {
                    return false;
                }
                this.sampleConsumer = sampleConsumerOnOutputFormat;
                sampleConsumerOnOutputFormat.setOnInputFrameProcessedListener(this.frameProcessedListener);
            }
            int iQueueInputTexture = this.sampleConsumer.queueInputTexture(i, j);
            if (iQueueInputTexture == 2) {
                return false;
            }
            if (iQueueInputTexture == 3) {
                this.isEndOfStreamSignaled = true;
            }
            this.lastQueuedPresentationTimeUs = j;
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
            if (this.isEndOfStreamSignaled) {
                return;
            }
            this.isEndOfStreamSignaled = true;
            ((androidx.media3.transformer.SampleConsumer) androidx.media3.common.util.Assertions.checkNotNull(this.sampleConsumer)).signalEndOfVideoInput();
        } catch (java.lang.RuntimeException e) {
            this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e, 1000));
        }
    }
}
