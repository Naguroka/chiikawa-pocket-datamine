package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAssetLoader implements androidx.media3.transformer.AssetLoader {
    private static final int QUEUE_BITMAP_INTERVAL_MS = 10;
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private final androidx.media3.transformer.EditedMediaItem editedMediaItem;
    private final androidx.media3.transformer.AssetLoader.Listener listener;
    private volatile int progress;
    private int progressState;
    private final boolean retainHdrFromUltraHdrImage;
    private androidx.media3.transformer.SampleConsumer sampleConsumer;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;

    /* synthetic */ ImageAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, androidx.media3.transformer.ImageAssetLoader.AnonymousClass1 anonymousClass1) {
        this(editedMediaItem, listener, bitmapLoader, z);
    }

    public static final class Factory implements androidx.media3.transformer.AssetLoader.Factory {
        private final androidx.media3.common.util.BitmapLoader bitmapLoader;

        public Factory(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            this.bitmapLoader = bitmapLoader;
        }

        @Override // androidx.media3.transformer.AssetLoader.Factory
        public androidx.media3.transformer.AssetLoader createAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, android.os.Looper looper, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.transformer.AssetLoader.CompositionSettings compositionSettings) {
            return new androidx.media3.transformer.ImageAssetLoader(editedMediaItem, listener, this.bitmapLoader, compositionSettings.retainHdrFromUltraHdrImage, null);
        }
    }

    private ImageAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z) {
        this.retainHdrFromUltraHdrImage = z;
        androidx.media3.common.util.Assertions.checkState(editedMediaItem.durationUs != androidx.media3.common.C.TIME_UNSET);
        androidx.media3.common.util.Assertions.checkState(editedMediaItem.frameRate != -2147483647);
        this.editedMediaItem = editedMediaItem;
        this.listener = listener;
        this.bitmapLoader = bitmapLoader;
        this.scheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.progressState = 0;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.progressState = 2;
        this.listener.onDurationUs(this.editedMediaItem.durationUs);
        this.listener.onTrackCount(1);
        com.google.common.util.concurrent.Futures.addCallback(this.bitmapLoader.loadBitmap(((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(this.editedMediaItem.mediaItem.localConfiguration)).uri), new androidx.media3.transformer.ImageAssetLoader.AnonymousClass1(), this.scheduledExecutorService);
    }

    /* JADX INFO: renamed from: androidx.media3.transformer.ImageAssetLoader$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.common.util.concurrent.FutureCallback<android.graphics.Bitmap> {
        AnonymousClass1() {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(final android.graphics.Bitmap bitmap) {
            androidx.media3.transformer.ImageAssetLoader.this.progress = 50;
            androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setHeight(bitmap.getHeight()).setWidth(bitmap.getWidth()).setSampleMimeType(androidx.media3.common.MimeTypes.IMAGE_RAW).setColorInfo(androidx.media3.common.ColorInfo.SRGB_BT709_FULL).build();
            final androidx.media3.common.Format formatBuild2 = (androidx.media3.transformer.ImageAssetLoader.this.retainHdrFromUltraHdrImage && androidx.media3.common.util.Util.SDK_INT >= 34 && bitmap.hasGainmap()) ? formatBuild.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.IMAGE_JPEG_R).build() : formatBuild;
            try {
                androidx.media3.transformer.ImageAssetLoader.this.listener.onTrackAdded(formatBuild, 2);
                androidx.media3.transformer.ImageAssetLoader.this.scheduledExecutorService.submit(new java.lang.Runnable() { // from class: androidx.media3.transformer.ImageAssetLoader$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m435x43001df4(bitmap, formatBuild2);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                androidx.media3.transformer.ImageAssetLoader.this.listener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e, 1000));
            }
        }

        /* JADX INFO: renamed from: lambda$onSuccess$0$androidx-media3-transformer-ImageAssetLoader$1, reason: not valid java name */
        /* synthetic */ void m435x43001df4(android.graphics.Bitmap bitmap, androidx.media3.common.Format format) {
            androidx.media3.transformer.ImageAssetLoader.this.m434x5369e40d(bitmap, format);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(java.lang.Throwable th) {
            androidx.media3.transformer.ImageAssetLoader.this.listener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(th, 2000));
        }
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        if (this.progressState == 2) {
            progressHolder.progress = this.progress;
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
        this.scheduledExecutorService.shutdownNow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queueBitmapInternal, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m434x5369e40d(final android.graphics.Bitmap bitmap, final androidx.media3.common.Format format) {
        try {
            androidx.media3.transformer.SampleConsumer sampleConsumer = this.sampleConsumer;
            if (sampleConsumer == null) {
                this.sampleConsumer = this.listener.onOutputFormat(format);
                this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.media3.transformer.ImageAssetLoader$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m433x99f2566e(bitmap, format);
                    }
                }, 10L, java.util.concurrent.TimeUnit.MILLISECONDS);
                return;
            }
            int iQueueInputBitmap = sampleConsumer.queueInputBitmap(bitmap, new androidx.media3.common.util.ConstantRateTimestampIterator(this.editedMediaItem.durationUs, this.editedMediaItem.frameRate));
            if (iQueueInputBitmap == 1) {
                this.progress = 100;
                this.sampleConsumer.signalEndOfVideoInput();
            } else if (iQueueInputBitmap == 2) {
                this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.media3.transformer.ImageAssetLoader$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m434x5369e40d(bitmap, format);
                    }
                }, 10L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } else {
                if (iQueueInputBitmap == 3) {
                    this.progress = 100;
                    return;
                }
                throw new java.lang.IllegalStateException();
            }
        } catch (androidx.media3.transformer.ExportException e) {
            this.listener.onError(e);
        } catch (java.lang.RuntimeException e2) {
            this.listener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e2, 1000));
        }
    }
}
