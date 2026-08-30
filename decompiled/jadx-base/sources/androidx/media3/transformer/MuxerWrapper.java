package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class MuxerWrapper {
    private static final long MAX_TRACK_WRITE_AHEAD_US = androidx.media3.common.util.Util.msToUs(500);
    public static final int MUXER_MODE_APPEND = 2;
    public static final int MUXER_MODE_DEFAULT = 0;
    public static final int MUXER_MODE_MUX_PARTIAL = 1;
    public static final int MUXER_RELEASE_REASON_CANCELLED = 1;
    public static final int MUXER_RELEASE_REASON_COMPLETED = 0;
    public static final int MUXER_RELEASE_REASON_ERROR = 2;
    private static final java.lang.String MUXER_TIMEOUT_ERROR_FORMAT_STRING = "Abort: no output sample written in the last %d milliseconds. DebugTrace: %s";
    private static final java.lang.String TIMER_THREAD_NAME = "Muxer:Timer";
    private final java.util.concurrent.ScheduledExecutorService abortScheduledExecutorService;
    private java.util.concurrent.ScheduledFuture<?> abortScheduledFuture;
    private volatile int additionalRotationDegrees;
    private final androidx.media3.common.Format appendVideoFormat;
    private final android.media.MediaCodec.BufferInfo bufferInfo;
    private final boolean dropSamplesBeforeFirstVideoSample;
    private long firstVideoPresentationTimeUs;
    private boolean isAborted;
    private boolean isEnded;
    private boolean isReady;
    private final androidx.media3.transformer.MuxerWrapper.Listener listener;
    private final long maxDelayBetweenSamplesMs;
    private long maxEndedTrackTimeUs;
    private long minTrackTimeUs;
    private boolean muxedPartialAudio;
    private boolean muxedPartialVideo;
    private androidx.media3.muxer.Muxer muxer;
    private final androidx.media3.muxer.Muxer.Factory muxerFactory;
    private int muxerMode;
    private final java.lang.String outputPath;
    private int previousTrackType;
    private volatile int trackCount;
    private final android.util.SparseArray<androidx.media3.transformer.MuxerWrapper.TrackInfo> trackTypeToInfo;

    public interface Listener {
        void onEnded(long j, long j2);

        void onError(androidx.media3.transformer.ExportException exportException);

        void onTrackEnded(int i, androidx.media3.common.Format format, int i2, int i3);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MuxerMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MuxerReleaseReason {
    }

    public static final class AppendTrackFormatException extends java.lang.Exception {
        public AppendTrackFormatException(java.lang.String str) {
            super(str);
        }
    }

    public MuxerWrapper(java.lang.String str, androidx.media3.muxer.Muxer.Factory factory, androidx.media3.transformer.MuxerWrapper.Listener listener, int i, boolean z, androidx.media3.common.Format format, long j) {
        this.outputPath = str;
        this.muxerFactory = factory;
        this.listener = listener;
        boolean z2 = false;
        androidx.media3.common.util.Assertions.checkArgument(i == 0 || i == 1);
        this.muxerMode = i;
        this.dropSamplesBeforeFirstVideoSample = z;
        if ((i == 0 && format == null) || (i == 1 && format != null)) {
            z2 = true;
        }
        androidx.media3.common.util.Assertions.checkArgument(z2, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.appendVideoFormat = format;
        this.maxDelayBetweenSamplesMs = j;
        this.trackTypeToInfo = new android.util.SparseArray<>();
        this.previousTrackType = -2;
        this.firstVideoPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.abortScheduledExecutorService = androidx.media3.common.util.Util.newSingleThreadScheduledExecutor(TIMER_THREAD_NAME);
        this.bufferInfo = new android.media.MediaCodec.BufferInfo();
    }

    public static java.util.List<byte[]> getMostCompatibleInitializationData(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        if (format.initializationDataEquals(format2)) {
            return format.initializationData;
        }
        if (!java.util.Objects.equals(format2.sampleMimeType, "video/avc") || !java.util.Objects.equals(format.sampleMimeType, "video/avc") || format2.initializationData.size() != 2 || format.initializationData.size() != 2 || !java.util.Arrays.equals(format2.initializationData.get(1), format.initializationData.get(1))) {
            return null;
        }
        byte[] bArr = format2.initializationData.get(0);
        byte[] bArr2 = format.initializationData.get(0);
        int length = androidx.media3.container.NalUnitUtil.NAL_START_CODE.length + 3;
        if (length >= bArr.length || bArr.length != bArr2.length) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (i != length && bArr[i] != bArr2[i]) {
                return null;
            }
        }
        for (int i2 = 0; i2 < androidx.media3.container.NalUnitUtil.NAL_START_CODE.length; i2++) {
            if (bArr[i2] != androidx.media3.container.NalUnitUtil.NAL_START_CODE[i2]) {
                return null;
            }
        }
        if ((bArr[androidx.media3.container.NalUnitUtil.NAL_START_CODE.length] & 31) != 7 || bArr[androidx.media3.container.NalUnitUtil.NAL_START_CODE.length + 1] == 0) {
            return null;
        }
        if (bArr2[length] >= bArr[length]) {
            return format.initializationData;
        }
        return format2.initializationData;
    }

    public void changeToAppendMode() {
        androidx.media3.common.util.Assertions.checkState(this.muxerMode == 1);
        this.muxerMode = 2;
    }

    public void setAdditionalRotationDegrees(int i) {
        androidx.media3.common.util.Assertions.checkState(this.trackTypeToInfo.size() == 0 || this.additionalRotationDegrees == i, "The additional rotation cannot be changed after adding track formats.");
        this.additionalRotationDegrees = i;
    }

    public void setTrackCount(int i) {
        if (this.muxerMode == 2) {
            return;
        }
        androidx.media3.common.util.Assertions.checkState(this.trackTypeToInfo.size() == 0, "The track count cannot be changed after adding track formats.");
        this.trackCount = i;
    }

    public boolean supportsSampleMimeType(java.lang.String str) {
        return getSupportedSampleMimeTypes(androidx.media3.common.MimeTypes.getTrackType(str)).contains(str);
    }

    public com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i) {
        return this.muxerFactory.getSupportedSampleMimeTypes(i);
    }

    public void addTrackFormat(androidx.media3.common.Format format) throws androidx.media3.muxer.Muxer.MuxerException, androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException {
        java.lang.String str = format.sampleMimeType;
        int trackType = androidx.media3.common.MimeTypes.getTrackType(str);
        androidx.media3.common.util.Assertions.checkArgument(trackType == 1 || trackType == 2, "Unsupported track format: " + str);
        if (trackType == 2) {
            format = format.buildUpon().setRotationDegrees((format.rotationDegrees + this.additionalRotationDegrees) % 360).build();
            if (this.muxerMode == 1) {
                java.util.List<byte[]> mostCompatibleInitializationData = getMostCompatibleInitializationData(format, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.appendVideoFormat));
                if (mostCompatibleInitializationData == null) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Switching to MUXER_MODE_APPEND will fail.");
                }
                format = format.buildUpon().setInitializationData(mostCompatibleInitializationData).build();
            }
        }
        if (this.muxerMode == 2) {
            if (trackType == 2) {
                androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.trackTypeToInfo, 2));
                androidx.media3.common.Format format2 = this.trackTypeToInfo.get(2).format;
                if (!androidx.media3.common.util.Util.areEqual(format2.sampleMimeType, format.sampleMimeType)) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Video format mismatch - sampleMimeType: " + format2.sampleMimeType + " != " + format.sampleMimeType);
                }
                if (format2.width != format.width) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Video format mismatch - width: " + format2.width + " != " + format.width);
                }
                if (format2.height != format.height) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Video format mismatch - height: " + format2.height + " != " + format.height);
                }
                if (format2.rotationDegrees != format.rotationDegrees) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Video format mismatch - rotationDegrees: " + format2.rotationDegrees + " != " + format.rotationDegrees);
                }
                if (!format.initializationDataEquals((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.appendVideoFormat))) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("The initialization data of the newly added track format doesn't match appendVideoFormat.");
                }
            } else if (trackType == 1) {
                androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.trackTypeToInfo, 1));
                androidx.media3.common.Format format3 = this.trackTypeToInfo.get(1).format;
                if (!androidx.media3.common.util.Util.areEqual(format3.sampleMimeType, format.sampleMimeType)) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Audio format mismatch - sampleMimeType: " + format3.sampleMimeType + " != " + format.sampleMimeType);
                }
                if (format3.channelCount != format.channelCount) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Audio format mismatch - channelCount: " + format3.channelCount + " != " + format.channelCount);
                }
                if (format3.sampleRate != format.sampleRate) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Audio format mismatch - sampleRate: " + format3.sampleRate + " != " + format.sampleRate);
                }
                if (!format3.initializationDataEquals(format)) {
                    throw new androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException("Audio format mismatch - initializationData.");
                }
            }
            resetAbortTimer();
            return;
        }
        int i = this.trackCount;
        androidx.media3.common.util.Assertions.checkState(i > 0, "The track count should be set before the formats are added.");
        androidx.media3.common.util.Assertions.checkState(this.trackTypeToInfo.size() < i, "All track formats have already been added.");
        androidx.media3.common.util.Assertions.checkState(!androidx.media3.common.util.Util.contains(this.trackTypeToInfo, trackType), "There is already a track of type " + trackType);
        ensureMuxerInitialized();
        this.trackTypeToInfo.put(trackType, new androidx.media3.transformer.MuxerWrapper.TrackInfo(format, this.muxer.addTrack(format)));
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_MUXER, androidx.media3.effect.DebugTraceUtil.EVENT_INPUT_FORMAT, androidx.media3.common.C.TIME_UNSET, com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, androidx.media3.common.util.Util.getTrackTypeString(trackType), format);
        if (format.metadata != null) {
            for (int i2 = 0; i2 < format.metadata.length(); i2++) {
                this.muxer.addMetadataEntry(format.metadata.get(i2));
            }
        }
        if (this.trackTypeToInfo.size() == i) {
            this.isReady = true;
            resetAbortTimer();
        }
    }

    public androidx.media3.common.Format getTrackFormat(int i) {
        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.util.Util.contains(this.trackTypeToInfo, i));
        return this.trackTypeToInfo.get(i).format;
    }

    public boolean writeSample(int i, java.nio.ByteBuffer byteBuffer, boolean z, long j) throws androidx.media3.muxer.Muxer.MuxerException {
        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.util.Util.contains(this.trackTypeToInfo, i));
        androidx.media3.transformer.MuxerWrapper.TrackInfo trackInfo = this.trackTypeToInfo.get(i);
        boolean zCanWriteSample = canWriteSample(i, j);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_MUXER, androidx.media3.effect.DebugTraceUtil.EVENT_CAN_WRITE_SAMPLE, j, com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, androidx.media3.common.util.Util.getTrackTypeString(i), java.lang.Boolean.valueOf(zCanWriteSample));
        if (i == 2) {
            if (this.firstVideoPresentationTimeUs == androidx.media3.common.C.TIME_UNSET) {
                this.firstVideoPresentationTimeUs = j;
            }
        } else if (i == 1 && this.dropSamplesBeforeFirstVideoSample && androidx.media3.common.util.Util.contains(this.trackTypeToInfo, 2)) {
            long j2 = this.firstVideoPresentationTimeUs;
            if (j2 != androidx.media3.common.C.TIME_UNSET && j < j2) {
                resetAbortTimer();
                return true;
            }
        }
        if (!zCanWriteSample) {
            return false;
        }
        trackInfo.sampleCount++;
        trackInfo.bytesWritten += (long) byteBuffer.remaining();
        trackInfo.timeUs = java.lang.Math.max(trackInfo.timeUs, j);
        resetAbortTimer();
        androidx.media3.common.util.Assertions.checkStateNotNull(this.muxer);
        this.bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), j, androidx.media3.transformer.TransformerUtil.getMediaCodecFlags(z ? 1 : 0));
        this.muxer.writeSampleData(trackInfo.trackToken, byteBuffer, this.bufferInfo);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_MUXER, androidx.media3.effect.DebugTraceUtil.EVENT_ACCEPTED_INPUT, j, "%s", androidx.media3.common.util.Util.getTrackTypeString(i));
        this.previousTrackType = i;
        return true;
    }

    public void endTrack(int i) {
        if (this.isReady && androidx.media3.common.util.Util.contains(this.trackTypeToInfo, i)) {
            androidx.media3.transformer.MuxerWrapper.TrackInfo trackInfo = this.trackTypeToInfo.get(i);
            this.maxEndedTrackTimeUs = java.lang.Math.max(this.maxEndedTrackTimeUs, trackInfo.timeUs);
            this.listener.onTrackEnded(i, trackInfo.format, trackInfo.getAverageBitrate(), trackInfo.sampleCount);
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_MUXER, androidx.media3.effect.DebugTraceUtil.EVENT_INPUT_ENDED, trackInfo.timeUs, "%s", androidx.media3.common.util.Util.getTrackTypeString(i));
            if (this.muxerMode != 1) {
                this.trackTypeToInfo.delete(i);
                if (this.trackTypeToInfo.size() == 0) {
                    this.isEnded = true;
                    androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_MUXER, androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_ENDED, this.maxEndedTrackTimeUs);
                }
            } else if (i == 2) {
                this.muxedPartialVideo = true;
            } else if (i == 1) {
                this.muxedPartialAudio = true;
            }
            if (this.muxerMode == 1 && this.muxedPartialVideo && (this.muxedPartialAudio || this.trackCount == 1)) {
                this.listener.onEnded(androidx.media3.common.util.Util.usToMs(this.maxEndedTrackTimeUs), getCurrentOutputSizeBytes());
                java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.abortScheduledFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    return;
                }
                return;
            }
            if (this.isEnded) {
                this.listener.onEnded(androidx.media3.common.util.Util.usToMs(this.maxEndedTrackTimeUs), getCurrentOutputSizeBytes());
                this.abortScheduledExecutorService.shutdownNow();
            }
        }
    }

    public boolean isEnded() {
        if (this.isEnded) {
            return true;
        }
        return this.muxerMode == 1 && this.muxedPartialVideo && (this.muxedPartialAudio || this.trackCount == 1);
    }

    public void finishWritingAndMaybeRelease(int i) throws androidx.media3.muxer.Muxer.MuxerException {
        if (i == 0 && this.muxerMode == 1) {
            return;
        }
        this.isReady = false;
        this.abortScheduledExecutorService.shutdownNow();
        androidx.media3.muxer.Muxer muxer = this.muxer;
        if (muxer != null) {
            try {
                muxer.close();
            } catch (androidx.media3.muxer.Muxer.MuxerException e) {
                if (i != 1 || !((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(e.getMessage())).equals(androidx.media3.transformer.FrameworkMuxer.MUXER_STOPPING_FAILED_ERROR_MESSAGE)) {
                    throw e;
                }
            }
        }
    }

    private boolean canWriteSample(int i, long j) {
        if ((this.dropSamplesBeforeFirstVideoSample && i != 2 && androidx.media3.common.util.Util.contains(this.trackTypeToInfo, 2) && this.firstVideoPresentationTimeUs == androidx.media3.common.C.TIME_UNSET) || !this.isReady) {
            return false;
        }
        if (this.trackTypeToInfo.size() == 1) {
            return true;
        }
        long j2 = j - this.trackTypeToInfo.get(i).timeUs;
        long j3 = MAX_TRACK_WRITE_AHEAD_US;
        if (j2 > j3 && androidx.media3.common.MimeTypes.getTrackType(((androidx.media3.transformer.MuxerWrapper.TrackInfo) androidx.media3.common.util.Assertions.checkNotNull(getTrackInfoWithMinTimeUs(this.trackTypeToInfo))).format.sampleMimeType) == i) {
            return true;
        }
        if (i != this.previousTrackType) {
            this.minTrackTimeUs = ((androidx.media3.transformer.MuxerWrapper.TrackInfo) androidx.media3.common.util.Assertions.checkNotNull(getTrackInfoWithMinTimeUs(this.trackTypeToInfo))).timeUs;
        }
        return j - this.minTrackTimeUs <= j3;
    }

    private void resetAbortTimer() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.muxer);
        if (this.maxDelayBetweenSamplesMs == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.abortScheduledFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.abortScheduledFuture = this.abortScheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.media3.transformer.MuxerWrapper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m436x627093f5();
            }
        }, this.maxDelayBetweenSamplesMs, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: lambda$resetAbortTimer$0$androidx-media3-transformer-MuxerWrapper, reason: not valid java name */
    /* synthetic */ void m436x627093f5() {
        if (this.isAborted) {
            return;
        }
        this.isAborted = true;
        this.listener.onError(androidx.media3.transformer.ExportException.createForMuxer(new java.lang.IllegalStateException(androidx.media3.common.util.Util.formatInvariant(MUXER_TIMEOUT_ERROR_FORMAT_STRING, java.lang.Long.valueOf(this.maxDelayBetweenSamplesMs), androidx.media3.effect.DebugTraceUtil.generateTraceSummary())), 7002));
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"muxer"})
    private void ensureMuxerInitialized() throws androidx.media3.muxer.Muxer.MuxerException {
        if (this.muxer == null) {
            this.muxer = this.muxerFactory.create(this.outputPath);
        }
    }

    private long getCurrentOutputSizeBytes() {
        long length = new java.io.File(this.outputPath).length();
        if (length > 0) {
            return length;
        }
        return -1L;
    }

    private static androidx.media3.transformer.MuxerWrapper.TrackInfo getTrackInfoWithMinTimeUs(android.util.SparseArray<androidx.media3.transformer.MuxerWrapper.TrackInfo> sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        androidx.media3.transformer.MuxerWrapper.TrackInfo trackInfoValueAt = sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            androidx.media3.transformer.MuxerWrapper.TrackInfo trackInfoValueAt2 = sparseArray.valueAt(i);
            if (trackInfoValueAt2.timeUs < trackInfoValueAt.timeUs) {
                trackInfoValueAt = trackInfoValueAt2;
            }
        }
        return trackInfoValueAt;
    }

    private static final class TrackInfo {
        public long bytesWritten;
        public final androidx.media3.common.Format format;
        public int sampleCount;
        public long timeUs;
        public final androidx.media3.muxer.Muxer.TrackToken trackToken;

        public TrackInfo(androidx.media3.common.Format format, androidx.media3.muxer.Muxer.TrackToken trackToken) {
            this.format = format;
            this.trackToken = trackToken;
        }

        public int getAverageBitrate() {
            long j = this.timeUs;
            if (j <= 0) {
                return androidx.media3.common.C.RATE_UNSET_INT;
            }
            long j2 = this.bytesWritten;
            return j2 <= 0 ? androidx.media3.common.C.RATE_UNSET_INT : (int) androidx.media3.common.util.Util.scaleLargeTimestamp(j2, 8000000L, j);
        }
    }
}
