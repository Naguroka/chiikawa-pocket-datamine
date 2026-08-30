package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class SilenceMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final androidx.media3.common.Format FORMAT;
    public static final java.lang.String MEDIA_ID = "SilenceMediaSource";
    private static final androidx.media3.common.MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;
    private androidx.media3.common.MediaItem mediaItem;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public static final class Factory {
        private long durationUs;
        private java.lang.Object tag;

        public androidx.media3.exoplayer.source.SilenceMediaSource.Factory setDurationUs(long j) {
            this.durationUs = j;
            return this;
        }

        public androidx.media3.exoplayer.source.SilenceMediaSource.Factory setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public androidx.media3.exoplayer.source.SilenceMediaSource createMediaSource() {
            androidx.media3.common.util.Assertions.checkState(this.durationUs > 0);
            return new androidx.media3.exoplayer.source.SilenceMediaSource(this.durationUs, androidx.media3.exoplayer.source.SilenceMediaSource.MEDIA_ITEM.buildUpon().setTag(this.tag).build());
        }
    }

    static {
        androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setChannelCount(2).setSampleRate(SAMPLE_RATE_HZ).setPcmEncoding(2).build();
        FORMAT = formatBuild;
        MEDIA_ITEM = new androidx.media3.common.MediaItem.Builder().setMediaId(MEDIA_ID).setUri(android.net.Uri.EMPTY).setMimeType(formatBuild.sampleMimeType).build();
        SILENCE_SAMPLE = new byte[androidx.media3.common.util.Util.getPcmFrameSize(2, 2) * 1024];
    }

    public SilenceMediaSource(long j) {
        this(j, MEDIA_ITEM);
    }

    private SilenceMediaSource(long j, androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        this.durationUs = j;
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        refreshSourceInfo(new androidx.media3.exoplayer.source.SinglePeriodTimeline(this.durationUs, true, false, false, (java.lang.Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        return new androidx.media3.exoplayer.source.SilenceMediaSource.SilenceMediaPeriod(this.durationUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    private static final class SilenceMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod {
        private static final androidx.media3.exoplayer.source.TrackGroupArray TRACKS = new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup(androidx.media3.exoplayer.source.SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final java.util.ArrayList<androidx.media3.exoplayer.source.SampleStream> sampleStreams = new java.util.ArrayList<>();

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return androidx.media3.common.C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
        }

        public SilenceMediaPeriod(long j) {
            this.durationUs = j;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < exoTrackSelectionArr.length; i++) {
                androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStreamArr[i] = null;
                }
                if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                    androidx.media3.exoplayer.source.SilenceMediaSource.SilenceSampleStream silenceSampleStream = new androidx.media3.exoplayer.source.SilenceMediaSource.SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(jConstrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i] = silenceSampleStream;
                    zArr2[i] = true;
                }
            }
            return jConstrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < this.sampleStreams.size(); i++) {
                ((androidx.media3.exoplayer.source.SilenceMediaSource.SilenceSampleStream) this.sampleStreams.get(i)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
            return constrainSeekPosition(j);
        }

        private long constrainSeekPosition(long j) {
            return androidx.media3.common.util.Util.constrainValue(j, 0L, this.durationUs);
        }
    }

    private static final class SilenceSampleStream implements androidx.media3.exoplayer.source.SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        public SilenceSampleStream(long j) {
            this.durationBytes = androidx.media3.exoplayer.source.SilenceMediaSource.getAudioByteCount(j);
            seekTo(0L);
        }

        public void seekTo(long j) {
            this.positionBytes = androidx.media3.common.util.Util.constrainValue(androidx.media3.exoplayer.source.SilenceMediaSource.getAudioByteCount(j), 0L, this.durationBytes);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            if (!this.sentFormat || (i & 2) != 0) {
                formatHolder.format = androidx.media3.exoplayer.source.SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j = this.durationBytes;
            long j2 = this.positionBytes;
            long j3 = j - j2;
            if (j3 != 0) {
                decoderInputBuffer.timeUs = androidx.media3.exoplayer.source.SilenceMediaSource.getAudioPositionUs(j2);
                decoderInputBuffer.addFlag(1);
                int iMin = (int) java.lang.Math.min(androidx.media3.exoplayer.source.SilenceMediaSource.SILENCE_SAMPLE.length, j3);
                if ((i & 4) == 0) {
                    decoderInputBuffer.ensureSpaceForWrite(iMin);
                    decoderInputBuffer.data.put(androidx.media3.exoplayer.source.SilenceMediaSource.SILENCE_SAMPLE, 0, iMin);
                }
                if ((i & 1) == 0) {
                    this.positionBytes += (long) iMin;
                }
                return -4;
            }
            decoderInputBuffer.addFlag(4);
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            long j2 = this.positionBytes;
            seekTo(j);
            return (int) ((this.positionBytes - j2) / ((long) androidx.media3.exoplayer.source.SilenceMediaSource.SILENCE_SAMPLE.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j) {
        return ((long) androidx.media3.common.util.Util.getPcmFrameSize(2, 2)) * ((j * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j) {
        return ((j / ((long) androidx.media3.common.util.Util.getPcmFrameSize(2, 2))) * 1000000) / 44100;
    }
}
