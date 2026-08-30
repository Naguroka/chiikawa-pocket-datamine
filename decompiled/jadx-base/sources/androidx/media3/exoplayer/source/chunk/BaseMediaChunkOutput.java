package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class BaseMediaChunkOutput implements androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider {
    private static final java.lang.String TAG = "BaseMediaChunkOutput";
    private final androidx.media3.exoplayer.source.SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.sampleQueues[i3];
                }
                i3++;
            } else {
                androidx.media3.common.util.Log.e(TAG, "Unmatched track of type: " + i2);
                return new androidx.media3.extractor.DiscardingTrackOutput();
            }
        }
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i] = sampleQueueArr[i].getWriteIndex();
            i++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }
}
