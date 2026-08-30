package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public class SampleQueue implements androidx.media3.extractor.TrackOutput {
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final java.lang.String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private androidx.media3.exoplayer.drm.DrmSession currentDrmSession;
    private androidx.media3.common.Format downstreamFormat;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final androidx.media3.exoplayer.source.SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private androidx.media3.common.Format unadjustedUpstreamFormat;
    private androidx.media3.common.Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangeListener;
    private long upstreamSourceId;
    private final androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder extrasHolder = new androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder();
    private int capacity = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private androidx.media3.extractor.TrackOutput.CryptoData[] cryptoDatas = new androidx.media3.extractor.TrackOutput.CryptoData[1000];
    private final androidx.media3.exoplayer.source.SpannedData<androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata> sharedSampleMetadata = new androidx.media3.exoplayer.source.SpannedData<>(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.source.SampleQueue$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.util.Consumer
        public final void accept(java.lang.Object obj) {
            ((androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) obj).drmSessionReference.release();
        }
    });
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;
    private boolean allSamplesAreSyncSamples = true;

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(androidx.media3.common.Format format);
    }

    public static androidx.media3.exoplayer.source.SampleQueue createWithoutDrm(androidx.media3.exoplayer.upstream.Allocator allocator) {
        return new androidx.media3.exoplayer.source.SampleQueue(allocator, null, null);
    }

    public static androidx.media3.exoplayer.source.SampleQueue createWithDrm(androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new androidx.media3.exoplayer.source.SampleQueue(allocator, (androidx.media3.exoplayer.drm.DrmSessionManager) androidx.media3.common.util.Assertions.checkNotNull(drmSessionManager), (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) androidx.media3.common.util.Assertions.checkNotNull(eventDispatcher));
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.source.SampleQueue createWithDrm(androidx.media3.exoplayer.upstream.Allocator allocator, android.os.Looper looper, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, androidx.media3.exoplayer.analytics.PlayerId.UNSET);
        return new androidx.media3.exoplayer.source.SampleQueue(allocator, (androidx.media3.exoplayer.drm.DrmSessionManager) androidx.media3.common.util.Assertions.checkNotNull(drmSessionManager), (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) androidx.media3.common.util.Assertions.checkNotNull(eventDispatcher));
    }

    protected SampleQueue(androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new androidx.media3.exoplayer.source.SampleDataQueue(allocator);
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    public void reset(boolean z) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
            this.allSamplesAreSyncSamples = true;
        }
    }

    public final void setStartTimeUs(long j) {
        this.startTimeUs = j;
    }

    public final void sourceId(long j) {
        this.upstreamSourceId = j;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void discardUpstreamSamples(int i) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    public final void discardUpstreamFrom(long j) {
        if (this.length == 0) {
            return;
        }
        androidx.media3.common.util.Assertions.checkArgument(j > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public void maybeThrowError() throws java.io.IOException {
        androidx.media3.exoplayer.drm.DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((androidx.media3.exoplayer.drm.DrmSession.DrmSessionException) androidx.media3.common.util.Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized long peekSourceId() {
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public final synchronized androidx.media3.common.Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return java.lang.Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public synchronized boolean isReady(boolean z) {
        androidx.media3.common.Format format;
        boolean z2 = true;
        if (!hasNextSample()) {
            if (!z && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
                z2 = false;
            }
            return z2;
        }
        if (this.sharedSampleMetadata.get(getReadIndex()).format != this.downstreamFormat) {
            return true;
        }
        return mayReadSample(getRelativeIndex(this.readPosition));
    }

    public int read(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int iPeekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i & 2) != 0, z, this.extrasHolder);
        if (iPeekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                } else {
                    this.sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z2) {
                this.readPosition++;
            }
        }
        return iPeekSampleMetadata;
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i2 = this.absoluteFirstIndex;
        if (i >= i2 && i <= this.length + i2) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        int iFindSampleBefore;
        rewind();
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex] && (j <= this.largestQueuedTimestampUs || z)) {
            if (this.allSamplesAreSyncSamples) {
                iFindSampleBefore = findSampleAfter(relativeIndex, this.length - this.readPosition, j, z);
            } else {
                iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
            }
            if (iFindSampleBefore == -1) {
                return false;
            }
            this.startTimeUs = j;
            this.readPosition += iFindSampleBefore;
            return true;
        }
        return false;
    }

    public final synchronized int getSkipCount(long j, boolean z) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex]) {
            if (j > this.largestQueuedTimestampUs && z) {
                return this.length - this.readPosition;
            }
            int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
            if (iFindSampleBefore == -1) {
                return 0;
            }
            return iFindSampleBefore;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void skip(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.readPosition + i <= this.length) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        this.readPosition += i;
    }

    public final void discardTo(long j, boolean z, boolean z2) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j, z, z2));
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setUpstreamFormatChangeListener(androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(androidx.media3.common.Format format) {
        androidx.media3.common.Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
        return this.sampleDataQueue.sampleData(dataReader, i, z);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
        this.sampleDataQueue.sampleData(parsableByteArray, i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        int i4;
        if (this.upstreamFormatAdjustmentRequired) {
            format((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.unadjustedUpstreamFormat));
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        long j2 = this.sampleOffsetUs + j;
        if (!this.allSamplesAreSyncSamples) {
            i4 = i;
        } else {
            if (j2 < this.startTimeUs) {
                return;
            }
            if (i5 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    androidx.media3.common.util.Log.w(TAG, "Overriding unexpected non-sync sample for format: " + this.upstreamFormat);
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.pendingSplice) {
            if (!z || !attemptSplice(j2)) {
                return;
            } else {
                this.pendingSplice = false;
            }
        }
        commitSample(j2, i4, (this.sampleDataQueue.getTotalBytesWritten() - ((long) i2)) - ((long) i3), i2, cryptoData);
    }

    protected final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    protected androidx.media3.common.Format getAdjustedUpstreamFormat(androidx.media3.common.Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized int peekSampleMetadata(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        decoderInputBuffer.waitingForKeys = false;
        if (!hasNextSample()) {
            if (!z2 && !this.isLastSampleQueued) {
                androidx.media3.common.Format format = this.upstreamFormat;
                if (format == null || (!z && format == this.downstreamFormat)) {
                    return -3;
                }
                onFormatResult((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(format), formatHolder);
                return -5;
            }
            decoderInputBuffer.setFlags(4);
            decoderInputBuffer.timeUs = Long.MIN_VALUE;
            return -4;
        }
        androidx.media3.common.Format format2 = this.sharedSampleMetadata.get(getReadIndex()).format;
        if (!z && format2 == this.downstreamFormat) {
            int relativeIndex = getRelativeIndex(this.readPosition);
            if (!mayReadSample(relativeIndex)) {
                decoderInputBuffer.waitingForKeys = true;
                return -3;
            }
            decoderInputBuffer.setFlags(this.flags[relativeIndex]);
            if (this.readPosition == this.length - 1 && (z2 || this.isLastSampleQueued)) {
                decoderInputBuffer.addFlag(536870912);
            }
            decoderInputBuffer.timeUs = this.timesUs[relativeIndex];
            sampleExtrasHolder.size = this.sizes[relativeIndex];
            sampleExtrasHolder.offset = this.offsets[relativeIndex];
            sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
            return -4;
        }
        onFormatResult(format2, formatHolder);
        return -5;
    }

    private synchronized boolean setUpstreamFormat(androidx.media3.common.Format format) {
        this.upstreamFormatRequired = false;
        if (androidx.media3.common.util.Util.areEqual(format, this.upstreamFormat)) {
            return false;
        }
        if (!this.sharedSampleMetadata.isEmpty() && this.sharedSampleMetadata.getEndValue().format.equals(format)) {
            this.upstreamFormat = this.sharedSampleMetadata.getEndValue().format;
        } else {
            this.upstreamFormat = format;
        }
        this.allSamplesAreSyncSamples &= androidx.media3.common.MimeTypes.allSamplesAreSyncSamples(this.upstreamFormat.sampleMimeType, this.upstreamFormat.codecs);
        this.loggedUnexpectedNonSyncSample = false;
        return true;
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.length;
        if (i2 != 0) {
            long[] jArr = this.timesUs;
            int i3 = this.relativeFirstIndex;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.readPosition) != i2) {
                    i2 = i + 1;
                }
                int iFindSampleBefore = findSampleBefore(i3, i2, j, z);
                if (iFindSampleBefore == -1) {
                    return -1L;
                }
                return discardSamples(iFindSampleBefore);
            }
        }
        return -1L;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.readPosition;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i = this.length;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private void releaseDrmSessionReferences() {
        androidx.media3.exoplayer.drm.DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference drmSessionReferencePreacquireSession;
        int i3 = this.length;
        if (i3 > 0) {
            int relativeIndex = getRelativeIndex(i3 - 1);
            androidx.media3.common.util.Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j2);
        }
        this.isLastSampleQueued = (536870912 & i) != 0;
        this.largestQueuedTimestampUs = java.lang.Math.max(this.largestQueuedTimestampUs, j);
        int relativeIndex2 = getRelativeIndex(this.length);
        this.timesUs[relativeIndex2] = j;
        this.offsets[relativeIndex2] = j2;
        this.sizes[relativeIndex2] = i2;
        this.flags[relativeIndex2] = i;
        this.cryptoDatas[relativeIndex2] = cryptoData;
        this.sourceIds[relativeIndex2] = this.upstreamSourceId;
        if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
            androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.upstreamFormat);
            androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager = this.drmSessionManager;
            if (drmSessionManager != null) {
                drmSessionReferencePreacquireSession = drmSessionManager.preacquireSession(this.drmEventDispatcher, format);
            } else {
                drmSessionReferencePreacquireSession = androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference.EMPTY;
            }
            this.sharedSampleMetadata.appendSpan(getWriteIndex(), new androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata(format, drmSessionReferencePreacquireSession));
        }
        int i4 = this.length + 1;
        this.length = i4;
        int i5 = this.capacity;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            androidx.media3.extractor.TrackOutput.CryptoData[] cryptoDataArr = new androidx.media3.extractor.TrackOutput.CryptoData[i6];
            int i7 = this.relativeFirstIndex;
            int i8 = i5 - i7;
            java.lang.System.arraycopy(this.offsets, i7, jArr2, 0, i8);
            java.lang.System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i8);
            java.lang.System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i8);
            java.lang.System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i8);
            java.lang.System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i8);
            java.lang.System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i8);
            int i9 = this.relativeFirstIndex;
            java.lang.System.arraycopy(this.offsets, 0, jArr2, i8, i9);
            java.lang.System.arraycopy(this.timesUs, 0, jArr3, i8, i9);
            java.lang.System.arraycopy(this.flags, 0, iArr, i8, i9);
            java.lang.System.arraycopy(this.sizes, 0, iArr2, i8, i9);
            java.lang.System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i8, i9);
            java.lang.System.arraycopy(this.sourceIds, 0, jArr, i8, i9);
            this.offsets = jArr2;
            this.timesUs = jArr3;
            this.flags = iArr;
            this.sizes = iArr2;
            this.cryptoDatas = cryptoDataArr;
            this.sourceIds = jArr;
            this.relativeFirstIndex = 0;
            this.capacity = i6;
        }
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.length == 0) {
            return j > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
        return true;
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z = false;
        androidx.media3.common.util.Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i2 = this.length - writeIndex;
        this.length = i2;
        this.largestQueuedTimestampUs = java.lang.Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z = true;
        }
        this.isLastSampleQueued = z;
        this.sharedSampleMetadata.discardFrom(i);
        int i3 = this.length;
        if (i3 == 0) {
            return 0L;
        }
        int relativeIndex = getRelativeIndex(i3 - 1);
        return this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]);
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private void onFormatResult(androidx.media3.common.Format format, androidx.media3.exoplayer.FormatHolder formatHolder) {
        androidx.media3.common.Format format2 = this.downstreamFormat;
        boolean z = format2 == null;
        androidx.media3.common.DrmInitData drmInitData = format2 == null ? null : format2.drmInitData;
        this.downstreamFormat = format;
        androidx.media3.common.DrmInitData drmInitData2 = format.drmInitData;
        androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z || !androidx.media3.common.util.Util.areEqual(drmInitData, drmInitData2)) {
            androidx.media3.exoplayer.drm.DrmSession drmSession = this.currentDrmSession;
            androidx.media3.exoplayer.drm.DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = drmSessionAcquireSession;
            formatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private boolean mayReadSample(int i) {
        androidx.media3.exoplayer.drm.DrmSession drmSession = this.currentDrmSession;
        return drmSession == null || drmSession.getState() == 4 || ((this.flags[i] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys());
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.timesUs[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.flags[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i3;
    }

    private int findSampleAfter(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.timesUs[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    private int countUnreadSamplesBefore(long j) {
        int i = this.length;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.readPosition && this.timesUs[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i;
    }

    private long discardSamples(int i) {
        this.largestDiscardedTimestampUs = java.lang.Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i));
        this.length -= i;
        int i2 = this.absoluteFirstIndex + i;
        this.absoluteFirstIndex = i2;
        int i3 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i3;
        int i4 = this.capacity;
        if (i3 >= i4) {
            this.relativeFirstIndex = i3 - i4;
        }
        int i5 = this.readPosition - i;
        this.readPosition = i5;
        if (i5 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i2);
        if (this.length == 0) {
            int i6 = this.relativeFirstIndex;
            if (i6 == 0) {
                i6 = this.capacity;
            }
            int i7 = i6 - 1;
            return this.offsets[i7] + ((long) this.sizes[i7]);
        }
        return this.offsets[this.relativeFirstIndex];
    }

    private long getLargestTimestamp(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = java.lang.Math.max(jMax, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.relativeFirstIndex + i;
        int i3 = this.capacity;
        return i2 < i3 ? i2 : i2 - i3;
    }

    static final class SampleExtrasHolder {
        public androidx.media3.extractor.TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;

        SampleExtrasHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SharedSampleMetadata {
        public final androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference drmSessionReference;
        public final androidx.media3.common.Format format;

        private SharedSampleMetadata(androidx.media3.common.Format format, androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }
}
