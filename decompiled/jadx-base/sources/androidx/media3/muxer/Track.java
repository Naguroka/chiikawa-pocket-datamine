package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class Track implements androidx.media3.muxer.Muxer.TrackToken, androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider {
    public final androidx.media3.common.Format format;
    public boolean hadKeyframe;
    public final java.util.Deque<android.media.MediaCodec.BufferInfo> pendingSamplesBufferInfo;
    public final java.util.Deque<java.nio.ByteBuffer> pendingSamplesByteBuffer;
    private final boolean sampleCopyEnabled;
    public final int sortKey;
    public final java.util.List<java.lang.Long> writtenChunkOffsets;
    public final java.util.List<java.lang.Integer> writtenChunkSampleCounts;
    public final java.util.List<android.media.MediaCodec.BufferInfo> writtenSamples;

    public Track(androidx.media3.common.Format format, boolean z) {
        this(format, 1, z);
    }

    public Track(androidx.media3.common.Format format, int i, boolean z) {
        this.format = format;
        this.sortKey = i;
        this.sampleCopyEnabled = z;
        this.writtenSamples = new java.util.ArrayList();
        this.writtenChunkOffsets = new java.util.ArrayList();
        this.writtenChunkSampleCounts = new java.util.ArrayList();
        this.pendingSamplesBufferInfo = new java.util.ArrayDeque();
        this.pendingSamplesByteBuffer = new java.util.ArrayDeque();
    }

    public void writeSampleData(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        if (bufferInfo.size == 0 || byteBuffer.remaining() == 0) {
            return;
        }
        if ((bufferInfo.flags & 1) > 0) {
            this.hadKeyframe = true;
        }
        if (this.hadKeyframe || !androidx.media3.common.MimeTypes.isVideo(this.format.sampleMimeType)) {
            if (this.sampleCopyEnabled) {
                java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining());
                byteBufferAllocateDirect.put(byteBuffer);
                byteBufferAllocateDirect.rewind();
                android.media.MediaCodec.BufferInfo bufferInfo2 = new android.media.MediaCodec.BufferInfo();
                bufferInfo2.set(byteBufferAllocateDirect.position(), byteBufferAllocateDirect.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                bufferInfo = bufferInfo2;
                byteBuffer = byteBufferAllocateDirect;
            }
            this.pendingSamplesBufferInfo.addLast(bufferInfo);
            this.pendingSamplesByteBuffer.addLast(byteBuffer);
        }
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public int videoUnitTimebase() {
        if (androidx.media3.common.MimeTypes.isAudio(this.format.sampleMimeType)) {
            return androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
        }
        return 90000;
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public com.google.common.collect.ImmutableList<android.media.MediaCodec.BufferInfo> writtenSamples() {
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.writtenSamples);
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public com.google.common.collect.ImmutableList<java.lang.Long> writtenChunkOffsets() {
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.writtenChunkOffsets);
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public com.google.common.collect.ImmutableList<java.lang.Integer> writtenChunkSampleCounts() {
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.writtenChunkSampleCounts);
    }

    @Override // androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider
    public androidx.media3.common.Format format() {
        return this.format;
    }
}
