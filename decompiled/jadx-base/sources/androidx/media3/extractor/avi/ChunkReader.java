package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final int streamHeaderChunkCount;
    protected final androidx.media3.extractor.TrackOutput trackOutput;

    public ChunkReader(int i, int i2, long j, int i3, androidx.media3.extractor.TrackOutput trackOutput) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        this.durationUs = j;
        this.streamHeaderChunkCount = i3;
        this.trackOutput = trackOutput;
        this.chunkId = getChunkIdFourCc(i, i2 == 2 ? CHUNK_TYPE_VIDEO_COMPRESSED : CHUNK_TYPE_AUDIO);
        this.alternativeChunkId = i2 == 2 ? getChunkIdFourCc(i, CHUNK_TYPE_VIDEO_UNCOMPRESSED) : -1;
        this.keyFrameOffsets = new long[512];
        this.keyFrameIndices = new int[512];
    }

    public void appendKeyFrameToIndex(long j) {
        if (this.indexSize == this.keyFrameIndices.length) {
            long[] jArr = this.keyFrameOffsets;
            this.keyFrameOffsets = java.util.Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.keyFrameIndices;
            this.keyFrameIndices = java.util.Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.keyFrameOffsets;
        int i = this.indexSize;
        jArr2[i] = j;
        this.keyFrameIndices[i] = this.indexChunkCount;
        this.indexSize = i + 1;
    }

    public void advanceCurrentChunk() {
        this.currentChunkIndex++;
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.currentChunkIndex);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public void incrementIndexChunkCount() {
        this.indexChunkCount++;
    }

    public void compactIndex() {
        this.keyFrameOffsets = java.util.Arrays.copyOf(this.keyFrameOffsets, this.indexSize);
        this.keyFrameIndices = java.util.Arrays.copyOf(this.keyFrameIndices, this.indexSize);
    }

    public boolean handlesChunkId(int i) {
        return this.chunkId == i || this.alternativeChunkId == i;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return java.util.Arrays.binarySearch(this.keyFrameIndices, this.currentChunkIndex) >= 0;
    }

    public boolean isVideo() {
        return (this.chunkId & CHUNK_TYPE_VIDEO_COMPRESSED) == CHUNK_TYPE_VIDEO_COMPRESSED;
    }

    public boolean isAudio() {
        return (this.chunkId & CHUNK_TYPE_AUDIO) == CHUNK_TYPE_AUDIO;
    }

    public void onChunkStart(int i) {
        this.currentChunkSize = i;
        this.bytesRemainingInCurrentChunk = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean onChunkData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = this.bytesRemainingInCurrentChunk;
        int iSampleData = i - this.trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i, false);
        this.bytesRemainingInCurrentChunk = iSampleData;
        boolean z = iSampleData == 0;
        if (z) {
            if (this.currentChunkSize > 0) {
                this.trackOutput.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.currentChunkSize, 0, null);
            }
            advanceCurrentChunk();
        }
        return z;
    }

    public void seekToPosition(long j) {
        if (this.indexSize == 0) {
            this.currentChunkIndex = 0;
        } else {
            this.currentChunkIndex = this.keyFrameIndices[androidx.media3.common.util.Util.binarySearchFloor(this.keyFrameOffsets, j, true, true)];
        }
    }

    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        int frameDurationUs = (int) (j / getFrameDurationUs());
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.keyFrameIndices, frameDurationUs, true, true);
        if (this.keyFrameIndices[iBinarySearchFloor] == frameDurationUs) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(getSeekPoint(iBinarySearchFloor));
        }
        androidx.media3.extractor.SeekPoint seekPoint = getSeekPoint(iBinarySearchFloor);
        int i = iBinarySearchFloor + 1;
        if (i < this.keyFrameOffsets.length) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, getSeekPoint(i));
        }
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
    }

    private long getChunkTimestampUs(int i) {
        return (this.durationUs * ((long) i)) / ((long) this.streamHeaderChunkCount);
    }

    private androidx.media3.extractor.SeekPoint getSeekPoint(int i) {
        return new androidx.media3.extractor.SeekPoint(((long) this.keyFrameIndices[i]) * getFrameDurationUs(), this.keyFrameOffsets[i]);
    }

    private static int getChunkIdFourCc(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }
}
