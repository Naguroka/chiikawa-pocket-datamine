package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataRetriever {
    private MetadataRetriever() {
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.media3.exoplayer.source.TrackGroupArray> retrieveMetadata(android.content.Context context, androidx.media3.common.MediaItem mediaItem) {
        return retrieveMetadata(context, mediaItem, androidx.media3.common.util.Clock.DEFAULT);
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.media3.exoplayer.source.TrackGroupArray> retrieveMetadata(androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.common.MediaItem mediaItem) {
        return retrieveMetadata(factory, mediaItem, androidx.media3.common.util.Clock.DEFAULT);
    }

    static com.google.common.util.concurrent.ListenableFuture<androidx.media3.exoplayer.source.TrackGroupArray> retrieveMetadata(android.content.Context context, androidx.media3.common.MediaItem mediaItem, androidx.media3.common.util.Clock clock) {
        return retrieveMetadata(new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, new androidx.media3.extractor.DefaultExtractorsFactory().setMp4ExtractorFlags(6)), mediaItem, clock);
    }

    private static com.google.common.util.concurrent.ListenableFuture<androidx.media3.exoplayer.source.TrackGroupArray> retrieveMetadata(androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.common.MediaItem mediaItem, androidx.media3.common.util.Clock clock) {
        return new androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal(factory, clock).retrieveMetadata(mediaItem);
    }

    private static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
        private final androidx.media3.common.util.HandlerWrapper mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private final com.google.common.util.concurrent.SettableFuture<androidx.media3.exoplayer.source.TrackGroupArray> trackGroupsFuture;

        public MetadataRetrieverInternal(androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.common.util.Clock clock) {
            this.mediaSourceFactory = factory;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:MetadataRetriever");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            this.mediaSourceHandler = clock.createHandler(handlerThread.getLooper(), new androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback());
            this.trackGroupsFuture = com.google.common.util.concurrent.SettableFuture.create();
        }

        public com.google.common.util.concurrent.ListenableFuture<androidx.media3.exoplayer.source.TrackGroupArray> retrieveMetadata(androidx.media3.common.MediaItem mediaItem) {
            this.mediaSourceHandler.obtainMessage(1, mediaItem).sendToTarget();
            return this.trackGroupsFuture;
        }

        private final class MediaSourceHandlerCallback implements android.os.Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
            private androidx.media3.exoplayer.source.MediaSource mediaSource;
            private final androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller mediaSourceCaller = new androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller();

            public MediaSourceHandlerCallback() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                int i = message.what;
                if (i == 1) {
                    androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSource = androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceFactory.createMediaSource((androidx.media3.common.MediaItem) message.obj);
                    this.mediaSource = mediaSourceCreateMediaSource;
                    mediaSourceCreateMediaSource.prepareSource(this.mediaSourceCaller, null, androidx.media3.exoplayer.analytics.PlayerId.UNSET);
                    androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessage(2);
                    return true;
                }
                if (i == 2) {
                    try {
                        androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.mediaPeriod;
                        if (mediaPeriod == null) {
                            ((androidx.media3.exoplayer.source.MediaSource) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSource)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100);
                    } catch (java.lang.Exception e) {
                        androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.trackGroupsFuture.setException(e);
                        androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(4).sendToTarget();
                    }
                    return true;
                }
                if (i == 3) {
                    ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Assertions.checkNotNull(this.mediaPeriod)).continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                if (this.mediaPeriod != null) {
                    ((androidx.media3.exoplayer.source.MediaSource) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
                }
                ((androidx.media3.exoplayer.source.MediaSource) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSource)).releaseSource(this.mediaSourceCaller);
                androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.removeCallbacksAndMessages(null);
                androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceThread.quit();
                return true;
            }

            private final class MediaSourceCaller implements androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller {
                private boolean mediaPeriodCreated;
                private final androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller.MediaPeriodCallback mediaPeriodCallback = new androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller.MediaPeriodCallback();
                private final androidx.media3.exoplayer.upstream.Allocator allocator = new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536);

                public MediaSourceCaller() {
                }

                @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
                    if (this.mediaPeriodCreated) {
                        return;
                    }
                    this.mediaPeriodCreated = true;
                    androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.this.mediaPeriod = mediaSource.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.allocator, 0L);
                    androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.this.mediaPeriod.prepare(this.mediaPeriodCallback, 0L);
                }

                private final class MediaPeriodCallback implements androidx.media3.exoplayer.source.MediaPeriod.Callback {
                    private MediaPeriodCallback() {
                    }

                    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
                        androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.trackGroupsFuture.set(mediaPeriod.getTrackGroups());
                        androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(4).sendToTarget();
                    }

                    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
                        androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }
                }
            }
        }
    }
}
