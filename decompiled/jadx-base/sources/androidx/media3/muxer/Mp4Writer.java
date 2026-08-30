package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class Mp4Writer {
    private static final int DEFAULT_MOOV_BOX_SIZE_BYTES = 400000;
    private static final java.lang.String FREE_BOX_TYPE = "free";
    private static final long INTERLEAVE_DURATION_US = 1000000;
    private final androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter;
    private boolean canWriteMoovAtStart;
    private long mdatDataEnd;
    private long mdatEnd;
    private long mdatStart;
    private final androidx.media3.muxer.Mp4MoovStructure moovGenerator;
    private final java.nio.channels.FileChannel output;
    private final java.io.FileOutputStream outputStream;
    private long reservedMoovSpaceEnd;
    private long reservedMoovSpaceStart;
    private final boolean sampleCopyEnabled;
    private final java.util.List<androidx.media3.muxer.Track> tracks = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicBoolean hasWrittenSamples = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.google.common.collect.Range<java.lang.Long> lastMoovWritten = com.google.common.collect.Range.closed(0L, 0L);

    public Mp4Writer(java.io.FileOutputStream fileOutputStream, androidx.media3.muxer.Mp4MoovStructure mp4MoovStructure, androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter, boolean z, boolean z2) {
        this.outputStream = fileOutputStream;
        this.output = fileOutputStream.getChannel();
        this.moovGenerator = mp4MoovStructure;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.sampleCopyEnabled = z;
        this.canWriteMoovAtStart = z2;
    }

    public androidx.media3.muxer.Muxer.TrackToken addTrack(int i, androidx.media3.common.Format format) {
        androidx.media3.muxer.Track track = new androidx.media3.muxer.Track(format, i, this.sampleCopyEnabled);
        this.tracks.add(track);
        java.util.Collections.sort(this.tracks, new java.util.Comparator() { // from class: androidx.media3.muxer.Mp4Writer$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.compare(((androidx.media3.muxer.Track) obj).sortKey, ((androidx.media3.muxer.Track) obj2).sortKey);
            }
        });
        return track;
    }

    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkArgument(trackToken instanceof androidx.media3.muxer.Track);
        ((androidx.media3.muxer.Track) trackToken).writeSampleData(byteBuffer, bufferInfo);
        doInterleave();
    }

    public void close() throws java.io.IOException {
        for (int i = 0; i < this.tracks.size(); i++) {
            try {
                flushPending(this.tracks.get(i));
            } catch (java.lang.Throwable th) {
                this.output.close();
                this.outputStream.close();
                throw th;
            }
        }
        if (this.hasWrittenSamples.get()) {
            writeMoovAndTrim();
        }
        this.output.close();
        this.outputStream.close();
    }

    private void writeHeader() throws java.io.IOException {
        this.output.position(0L);
        this.output.write(androidx.media3.muxer.Boxes.ftyp());
        if (this.canWriteMoovAtStart) {
            this.reservedMoovSpaceStart = this.output.position();
            this.output.write(androidx.media3.muxer.BoxUtils.wrapIntoBox(FREE_BOX_TYPE, java.nio.ByteBuffer.allocate(DEFAULT_MOOV_BOX_SIZE_BYTES)));
            this.reservedMoovSpaceEnd = this.output.position();
        }
        this.mdatStart = this.output.position();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(androidx.media3.common.util.Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.putLong(16L);
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
        long j = this.mdatStart + 16;
        this.mdatDataEnd = j;
        if (this.canWriteMoovAtStart) {
            j = Long.MAX_VALUE;
        }
        this.mdatEnd = j;
    }

    private java.nio.ByteBuffer assembleCurrentMoovData() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.tracks.size(); i++) {
            androidx.media3.muxer.Track track = this.tracks.get(i);
            if (!track.writtenSamples.isEmpty()) {
                jMin = java.lang.Math.min(track.writtenSamples.get(0).presentationTimeUs, jMin);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            return this.moovGenerator.moovMetadataHeader(this.tracks, jMin, false);
        }
        return java.nio.ByteBuffer.allocate(0);
    }

    private void safelyReplaceMoovAtEnd(long j, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(j >= ((java.lang.Long) this.lastMoovWritten.upperEndpoint()).longValue());
        androidx.media3.common.util.Assertions.checkState(j >= this.mdatEnd);
        this.output.position(j);
        this.output.write(androidx.media3.muxer.BoxUtils.wrapIntoBox(FREE_BOX_TYPE, byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.mdatEnd = j2;
        updateMdatSize(j2 - this.mdatStart);
        this.lastMoovWritten = com.google.common.collect.Range.closed(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j + ((long) byteBuffer.remaining())));
    }

    private void maybeWriteMoovAtStart() throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long jRemaining = byteBufferAssembleCurrentMoovData.remaining() + 8;
        long j = this.reservedMoovSpaceEnd;
        long j2 = this.reservedMoovSpaceStart;
        if (jRemaining <= j - j2) {
            this.output.position(j2);
            this.output.write(byteBufferAssembleCurrentMoovData);
            this.output.write(androidx.media3.muxer.BoxUtils.wrapIntoBox(FREE_BOX_TYPE, java.nio.ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.output.position()) - 8))));
        } else {
            this.canWriteMoovAtStart = false;
            long j3 = this.mdatDataEnd;
            this.mdatEnd = j3;
            this.output.position(j3);
            this.output.write(byteBufferAssembleCurrentMoovData);
            this.lastMoovWritten = com.google.common.collect.Range.closed(java.lang.Long.valueOf(this.mdatEnd), java.lang.Long.valueOf(this.mdatEnd + ((long) iRemaining)));
            this.output.write(androidx.media3.muxer.BoxUtils.wrapIntoBox(FREE_BOX_TYPE, java.nio.ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.reservedMoovSpaceStart) - 8))), this.reservedMoovSpaceStart);
        }
        updateMdatSize(this.mdatDataEnd - this.mdatStart);
    }

    private void writeMoovAndTrim() throws java.io.IOException {
        if (this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
            return;
        }
        java.nio.ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long j = iRemaining + 8;
        if (this.mdatEnd - this.mdatDataEnd < j) {
            safelyReplaceMoovAtEnd(((java.lang.Long) this.lastMoovWritten.upperEndpoint()).longValue() + j, byteBufferAssembleCurrentMoovData);
            androidx.media3.common.util.Assertions.checkState(this.mdatEnd - this.mdatDataEnd >= j);
        }
        long j2 = this.mdatDataEnd;
        this.output.position(j2);
        this.output.write(byteBufferAssembleCurrentMoovData);
        long j3 = ((long) iRemaining) + j2;
        long jLongValue = ((java.lang.Long) this.lastMoovWritten.upperEndpoint()).longValue() - j3;
        androidx.media3.common.util.Assertions.checkState(jLongValue < 2147483647L);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        byteBufferAllocate.put(androidx.media3.common.util.Util.getUtf8Bytes(FREE_BOX_TYPE));
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
        this.mdatEnd = j2;
        updateMdatSize(j2 - this.mdatStart);
        this.lastMoovWritten = com.google.common.collect.Range.closed(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j2 + ((long) byteBufferAssembleCurrentMoovData.limit())));
        this.output.truncate(j3);
    }

    private void rewriteMoovWithMdatEmptySpace(long j) throws java.io.IOException {
        safelyReplaceMoovAtEnd(java.lang.Math.max(this.mdatEnd + j, ((java.lang.Long) this.lastMoovWritten.upperEndpoint()).longValue()), assembleCurrentMoovData());
    }

    private void flushPending(androidx.media3.muxer.Track track) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        if (track.pendingSamplesBufferInfo.isEmpty()) {
            return;
        }
        if (!this.hasWrittenSamples.getAndSet(true)) {
            writeHeader();
        }
        java.util.Iterator<java.nio.ByteBuffer> it = track.pendingSamplesByteBuffer.iterator();
        long jLimit = 0;
        while (it.hasNext()) {
            jLimit += (long) it.next().limit();
        }
        maybeExtendMdatAndRewriteMoov(jLimit);
        track.writtenChunkOffsets.add(java.lang.Long.valueOf(this.mdatDataEnd));
        track.writtenChunkSampleCounts.add(java.lang.Integer.valueOf(track.pendingSamplesBufferInfo.size()));
        do {
            android.media.MediaCodec.BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
            java.nio.ByteBuffer byteBufferRemoveFirst = track.pendingSamplesByteBuffer.removeFirst();
            if (androidx.media3.muxer.AnnexBUtils.doesSampleContainAnnexBNalUnits((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(track.format.sampleMimeType))) {
                byteBufferRemoveFirst = this.annexBToAvccConverter.process(byteBufferRemoveFirst);
                bufferInfoRemoveFirst.set(byteBufferRemoveFirst.position(), byteBufferRemoveFirst.remaining(), bufferInfoRemoveFirst.presentationTimeUs, bufferInfoRemoveFirst.flags);
            }
            maybeExtendMdatAndRewriteMoov(byteBufferRemoveFirst.remaining());
            long j = this.mdatDataEnd;
            this.mdatDataEnd = j + ((long) this.output.write(byteBufferRemoveFirst, j));
            track.writtenSamples.add(bufferInfoRemoveFirst);
        } while (!track.pendingSamplesBufferInfo.isEmpty());
        androidx.media3.common.util.Assertions.checkState(this.mdatDataEnd <= this.mdatEnd);
    }

    private void maybeExtendMdatAndRewriteMoov(long j) throws java.io.IOException {
        if (this.canWriteMoovAtStart) {
            return;
        }
        long j2 = this.mdatDataEnd;
        if (j2 + j >= this.mdatEnd) {
            rewriteMoovWithMdatEmptySpace(getMdatExtensionAmount(j2) + j);
        }
    }

    private void updateMdatSize(long j) throws java.io.IOException {
        this.output.position(this.mdatStart + 8);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
    }

    private void doInterleave() throws java.io.IOException {
        boolean z = false;
        for (int i = 0; i < this.tracks.size(); i++) {
            androidx.media3.muxer.Track track = this.tracks.get(i);
            if (track.pendingSamplesBufferInfo.size() > 2) {
                if (((android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekLast())).presentationTimeUs - ((android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst())).presentationTimeUs > 1000000) {
                    flushPending(track);
                    z = true;
                }
            }
        }
        if (z && this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
        }
    }

    private long getMdatExtensionAmount(long j) {
        return java.lang.Math.min(androidx.media3.common.C.NANOS_PER_SECOND, java.lang.Math.max(500000L, (long) (j * 0.2f)));
    }
}
