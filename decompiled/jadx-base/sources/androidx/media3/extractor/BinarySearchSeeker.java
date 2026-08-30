package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final androidx.media3.extractor.BinarySearchSeeker.BinarySearchSeekMap seekMap;
    protected androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams;
    protected final androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker timestampSeeker;

    public static final class DefaultSeekTimestampConverter implements androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface TimestampSeeker {
        default void onSeekFinished() {
        }

        androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException;
    }

    protected void onSeekOperationFinished(boolean z, long j) {
    }

    protected BinarySearchSeeker(androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter, androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i;
        this.seekMap = new androidx.media3.extractor.BinarySearchSeeker.BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5, j6);
    }

    public final androidx.media3.extractor.SeekMap getSeekMap() {
        return this.seekMap;
    }

    public final void setSeekTargetUs(long j) {
        androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j);
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public int handlePendingSeek(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        while (true) {
            androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams = (androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams) androidx.media3.common.util.Assertions.checkStateNotNull(this.seekOperationParams);
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            }
            if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            extractorInput.resetPeekPosition();
            androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult timestampSearchResultSearchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
            int i = timestampSearchResultSearchForTimestamp.type;
            if (i == -3) {
                markSeekOperationFinished(false, nextSearchBytePosition);
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            if (i == -2) {
                seekOperationParams.updateSeekFloor(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new java.lang.IllegalStateException("Invalid case");
                    }
                    skipInputUntilPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    markSeekOperationFinished(true, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate, positionHolder);
                }
                seekOperationParams.updateSeekCeiling(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            }
        }
    }

    protected androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams createSeekParamsForTargetTimeUs(long j) {
        return new androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams(j, this.seekMap.timeUsToTargetTime(j), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    protected final void markSeekOperationFinished(boolean z, long j) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z, j);
    }

    protected final boolean skipInputUntilPosition(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
        long position = j - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }

    protected final int seekToPosition(androidx.media3.extractor.ExtractorInput extractorInput, long j, androidx.media3.extractor.PositionHolder positionHolder) {
        if (j == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j;
        return 1;
    }

    protected static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        protected static long calculateNextSearchBytePosition(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return androidx.media3.common.util.Util.constrainValue(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        protected SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.seekTimeUs = j;
            this.targetTimePosition = j2;
            this.floorTimePosition = j3;
            this.ceilingTimePosition = j4;
            this.floorBytePosition = j5;
            this.ceilingBytePosition = j6;
            this.approxBytesPerFrame = j7;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j, long j2) {
            this.floorTimePosition = j;
            this.floorBytePosition = j2;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j, long j2) {
            this.ceilingTimePosition = j;
            this.ceilingBytePosition = j2;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }
    }

    public static final class TimestampSearchResult {
        public static final androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(-3, androidx.media3.common.C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i, long j, long j2) {
            this.type = i;
            this.timestampToUpdate = j;
            this.bytePositionToUpdate = j2;
        }

        public static androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult overestimatedResult(long j, long j2) {
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(-1, j, j2);
        }

        public static androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult underestimatedResult(long j, long j2) {
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(-2, j, j2);
        }

        public static androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult targetFoundResult(long j) {
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(0, androidx.media3.common.C.TIME_UNSET, j);
        }
    }

    public static class BinarySearchSeekMap implements androidx.media3.extractor.SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter;

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public BinarySearchSeekMap(androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5, long j6) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j;
            this.floorTimePosition = j2;
            this.ceilingTimePosition = j3;
            this.floorBytePosition = j4;
            this.ceilingBytePosition = j5;
            this.approxBytesPerFrame = j6;
        }

        @Override // androidx.media3.extractor.SeekMap
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(j, androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        public long timeUsToTargetTime(long j) {
            return this.seekTimestampConverter.timeUsToTargetTime(j);
        }
    }
}
