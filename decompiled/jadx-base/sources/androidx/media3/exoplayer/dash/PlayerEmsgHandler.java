package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerEmsgHandler implements android.os.Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private androidx.media3.exoplayer.dash.manifest.DashManifest manifest;
    private final androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final java.util.TreeMap<java.lang.Long, java.lang.Long> manifestPublishTimeToExpiryTimeUs = new java.util.TreeMap<>();
    private final android.os.Handler handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper(this);
    private final androidx.media3.extractor.metadata.emsg.EventMessageDecoder decoder = new androidx.media3.extractor.metadata.emsg.EventMessageDecoder();

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    public PlayerEmsgHandler(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, androidx.media3.exoplayer.upstream.Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    public void updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.manifest = dashManifest;
        removePreviouslyExpiredManifestPublishTimeValues();
    }

    public androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler(this.allocator);
    }

    public void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.ManifestExpiryEventInfo manifestExpiryEventInfo = (androidx.media3.exoplayer.dash.PlayerEmsgHandler.ManifestExpiryEventInfo) message.obj;
        handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
        return true;
    }

    boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        boolean z = false;
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        java.util.Map.Entry<java.lang.Long, java.lang.Long> entryCeilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(this.manifest.publishTimeMs);
        if (entryCeilingExpiryEntryForPublishTime != null && entryCeilingExpiryEntryForPublishTime.getValue().longValue() < j) {
            this.expiredManifestPublishTimeUs = entryCeilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z = true;
        }
        if (z) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z;
    }

    void onChunkLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
    }

    boolean onChunkLoadError(boolean z) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        if (!z) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    private void handleManifestExpiredMessage(long j, long j2) {
        java.lang.Long l = this.manifestPublishTimeToExpiryTimeUs.get(java.lang.Long.valueOf(j2));
        if (l == null) {
            this.manifestPublishTimeToExpiryTimeUs.put(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.manifestPublishTimeToExpiryTimeUs.put(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j));
        }
    }

    private java.util.Map.Entry<java.lang.Long, java.lang.Long> ceilingExpiryEntryForPublishTime(long j) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(java.lang.Long.valueOf(j));
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Long, java.lang.Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    private void notifyManifestPublishTimeExpired() {
        this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(androidx.media3.extractor.metadata.emsg.EventMessage eventMessage) {
        try {
            return androidx.media3.common.util.Util.parseXsDateTime(androidx.media3.common.util.Util.fromUtf8Bytes(eventMessage.messageData));
        } catch (androidx.media3.common.ParserException unused) {
            return androidx.media3.common.C.TIME_UNSET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPlayerEmsgEvent(java.lang.String str, java.lang.String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D.equals(str2));
    }

    public final class PlayerTrackEmsgHandler implements androidx.media3.extractor.TrackOutput {
        private final androidx.media3.exoplayer.source.SampleQueue sampleQueue;
        private final androidx.media3.exoplayer.FormatHolder formatHolder = new androidx.media3.exoplayer.FormatHolder();
        private final androidx.media3.extractor.metadata.MetadataInputBuffer buffer = new androidx.media3.extractor.metadata.MetadataInputBuffer();
        private long maxLoadedChunkEndTimeUs = androidx.media3.common.C.TIME_UNSET;

        PlayerTrackEmsgHandler(androidx.media3.exoplayer.upstream.Allocator allocator) {
            this.sampleQueue = androidx.media3.exoplayer.source.SampleQueue.createWithoutDrm(allocator);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(androidx.media3.common.Format format) {
            this.sampleQueue.format(format);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
            return this.sampleQueue.sampleData(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
            this.sampleQueue.sampleData(parsableByteArray, i);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            this.sampleQueue.sampleMetadata(j, i, i2, i3, cryptoData);
            parseAndDiscardSamples();
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
            return androidx.media3.exoplayer.dash.PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j);
        }

        public void onChunkLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
            if (this.maxLoadedChunkEndTimeUs == androidx.media3.common.C.TIME_UNSET || chunk.endTimeUs > this.maxLoadedChunkEndTimeUs) {
                this.maxLoadedChunkEndTimeUs = chunk.endTimeUs;
            }
            androidx.media3.exoplayer.dash.PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public boolean onChunkLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
            long j = this.maxLoadedChunkEndTimeUs;
            return androidx.media3.exoplayer.dash.PlayerEmsgHandler.this.onChunkLoadError(j != androidx.media3.common.C.TIME_UNSET && j < chunk.startTimeUs);
        }

        public void release() {
            this.sampleQueue.release();
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBufferDequeueSample = dequeueSample();
                if (metadataInputBufferDequeueSample != null) {
                    long j = metadataInputBufferDequeueSample.timeUs;
                    androidx.media3.common.Metadata metadataDecode = androidx.media3.exoplayer.dash.PlayerEmsgHandler.this.decoder.decode(metadataInputBufferDequeueSample);
                    if (metadataDecode != null) {
                        androidx.media3.extractor.metadata.emsg.EventMessage eventMessage = (androidx.media3.extractor.metadata.emsg.EventMessage) metadataDecode.get(0);
                        if (androidx.media3.exoplayer.dash.PlayerEmsgHandler.isPlayerEmsgEvent(eventMessage.schemeIdUri, eventMessage.value)) {
                            parsePlayerEmsgEvent(j, eventMessage);
                        }
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        private androidx.media3.extractor.metadata.MetadataInputBuffer dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, 0, false) != -4) {
                return null;
            }
            this.buffer.flip();
            return this.buffer;
        }

        private void parsePlayerEmsgEvent(long j, androidx.media3.extractor.metadata.emsg.EventMessage eventMessage) {
            long manifestPublishTimeMsInEmsg = androidx.media3.exoplayer.dash.PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(eventMessage);
            if (manifestPublishTimeMsInEmsg == androidx.media3.common.C.TIME_UNSET) {
                return;
            }
            onManifestExpiredMessageEncountered(j, manifestPublishTimeMsInEmsg);
        }

        private void onManifestExpiredMessageEncountered(long j, long j2) {
            androidx.media3.exoplayer.dash.PlayerEmsgHandler.this.handler.sendMessage(androidx.media3.exoplayer.dash.PlayerEmsgHandler.this.handler.obtainMessage(1, new androidx.media3.exoplayer.dash.PlayerEmsgHandler.ManifestExpiryEventInfo(j, j2)));
        }
    }

    private static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j, long j2) {
            this.eventTimeUs = j;
            this.manifestPublishTimeMsInEmsg = j2;
        }
    }
}
