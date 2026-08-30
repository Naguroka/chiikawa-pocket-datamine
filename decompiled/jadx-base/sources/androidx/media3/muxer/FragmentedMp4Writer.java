package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class FragmentedMp4Writer {
    private final androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter;
    private final long fragmentDurationUs;
    private boolean headerCreated;
    private long maxTrackDurationUs;
    private final androidx.media3.muxer.Mp4MoovStructure moovGenerator;
    private final java.nio.channels.FileChannel output;
    private final java.io.FileOutputStream outputStream;
    private final boolean sampleCopyEnabled;
    private androidx.media3.muxer.Track videoTrack;
    private final java.util.List<androidx.media3.muxer.Track> tracks = new java.util.ArrayList();
    private long minInputPresentationTimeUs = Long.MAX_VALUE;
    private int currentFragmentSequenceNumber = 1;

    public static class SampleMetadata {
        public final int compositionTimeOffsetVu;
        public final long durationVu;
        public final int flags;
        public final int size;

        public SampleMetadata(long j, int i, int i2, int i3) {
            this.durationVu = j;
            this.size = i;
            this.flags = i2;
            this.compositionTimeOffsetVu = i3;
        }
    }

    public FragmentedMp4Writer(java.io.FileOutputStream fileOutputStream, androidx.media3.muxer.Mp4MoovStructure mp4MoovStructure, androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter, long j, boolean z) {
        this.outputStream = fileOutputStream;
        this.output = fileOutputStream.getChannel();
        this.moovGenerator = mp4MoovStructure;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.sampleCopyEnabled = z;
        this.fragmentDurationUs = j * 1000;
    }

    public androidx.media3.muxer.Muxer.TrackToken addTrack(int i, androidx.media3.common.Format format) {
        androidx.media3.muxer.Track track = new androidx.media3.muxer.Track(format, this.sampleCopyEnabled);
        this.tracks.add(track);
        if (androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
            this.videoTrack = track;
        }
        return track;
    }

    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkArgument(trackToken instanceof androidx.media3.muxer.Track);
        if (!this.headerCreated) {
            createHeader();
            this.headerCreated = true;
        }
        androidx.media3.muxer.Track track = (androidx.media3.muxer.Track) trackToken;
        if (shouldFlushPendingSamples(track, bufferInfo)) {
            createFragment();
        }
        track.writeSampleData(byteBuffer, bufferInfo);
        android.media.MediaCodec.BufferInfo bufferInfo2 = (android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst());
        android.media.MediaCodec.BufferInfo bufferInfo3 = (android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekLast());
        this.minInputPresentationTimeUs = java.lang.Math.min(this.minInputPresentationTimeUs, bufferInfo2.presentationTimeUs);
        this.maxTrackDurationUs = java.lang.Math.max(this.maxTrackDurationUs, bufferInfo3.presentationTimeUs - bufferInfo2.presentationTimeUs);
    }

    public void close() throws java.io.IOException {
        try {
            createFragment();
        } finally {
            this.output.close();
            this.outputStream.close();
        }
    }

    private static com.google.common.collect.ImmutableList<java.nio.ByteBuffer> createTrafBoxes(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> list, long j) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        int iCalculateMoofBoxSize = calculateMoofBoxSize(list) + 8;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processedTrackInfo = list.get(i);
            builder.add(androidx.media3.muxer.Boxes.traf(androidx.media3.muxer.Boxes.tfhd(processedTrackInfo.trackId, j), androidx.media3.muxer.Boxes.trun(processedTrackInfo.pendingSamplesMetadata, iCalculateMoofBoxSize, processedTrackInfo.hasBFrame)));
            iCalculateMoofBoxSize += processedTrackInfo.totalSamplesSize;
        }
        return builder.build();
    }

    private static int calculateMoofBoxSize(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> list) {
        int trunBoxContentSize = 0;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processedTrackInfo = list.get(i);
            trunBoxContentSize += 32 + 8 + androidx.media3.muxer.Boxes.getTrunBoxContentSize(processedTrackInfo.pendingSamplesMetadata.size(), processedTrackInfo.hasBFrame);
        }
        return 24 + trunBoxContentSize;
    }

    private void createHeader() throws java.io.IOException {
        this.output.position(0L);
        this.output.write(androidx.media3.muxer.Boxes.ftyp());
        this.output.write(this.moovGenerator.moovMetadataHeader(this.tracks, 0L, true));
    }

    private boolean shouldFlushPendingSamples(androidx.media3.muxer.Track track, android.media.MediaCodec.BufferInfo bufferInfo) {
        androidx.media3.muxer.Track track2 = this.videoTrack;
        if (track2 == null) {
            return this.maxTrackDurationUs >= this.fragmentDurationUs;
        }
        if (track.equals(track2) && track.hadKeyframe && (bufferInfo.flags & 1) > 0) {
            return ((android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekLast())).presentationTimeUs - ((android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst())).presentationTimeUs >= this.fragmentDurationUs;
        }
        return false;
    }

    private void createFragment() throws java.io.IOException {
        com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> immutableListProcessAllTracks = processAllTracks();
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableListCreateTrafBoxes = createTrafBoxes(immutableListProcessAllTracks, this.output.position());
        if (immutableListCreateTrafBoxes.isEmpty()) {
            return;
        }
        this.output.write(androidx.media3.muxer.Boxes.moof(androidx.media3.muxer.Boxes.mfhd(this.currentFragmentSequenceNumber), immutableListCreateTrafBoxes));
        writeMdatBox(immutableListProcessAllTracks);
        this.currentFragmentSequenceNumber++;
    }

    private void writeMdatBox(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> list) throws java.io.IOException {
        long jPosition = this.output.position();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(8);
        byteBufferAllocate.put(androidx.media3.common.util.Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.flip();
        this.output.write(byteBufferAllocate);
        long jWrite = 0;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processedTrackInfo = list.get(i);
            for (int i2 = 0; i2 < processedTrackInfo.pendingSamplesByteBuffer.size(); i2++) {
                jWrite += (long) this.output.write(processedTrackInfo.pendingSamplesByteBuffer.get(i2));
            }
        }
        long jPosition2 = this.output.position();
        this.output.position(jPosition);
        java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(4);
        long j = jWrite + ((long) 8);
        androidx.media3.common.util.Assertions.checkArgument(j <= androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, "Only 32-bit long mdat size supported in the fragmented MP4");
        byteBufferAllocate2.putInt((int) j);
        byteBufferAllocate2.flip();
        this.output.write(byteBufferAllocate2);
        this.output.position(jPosition2);
    }

    private com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> processAllTracks() {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < this.tracks.size(); i++) {
            if (!this.tracks.get(i).pendingSamplesBufferInfo.isEmpty()) {
                builder.add(processTrack(i + 1, this.tracks.get(i)));
            }
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processTrack(int i, androidx.media3.muxer.Track track) {
        long j;
        androidx.media3.common.util.Assertions.checkState(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder();
        if (androidx.media3.muxer.AnnexBUtils.doesSampleContainAnnexBNalUnits((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(track.format.sampleMimeType))) {
            while (!track.pendingSamplesByteBuffer.isEmpty()) {
                java.nio.ByteBuffer byteBufferProcess = this.annexBToAvccConverter.process(track.pendingSamplesByteBuffer.removeFirst());
                builder.add(byteBufferProcess);
                android.media.MediaCodec.BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
                bufferInfoRemoveFirst.set(byteBufferProcess.position(), byteBufferProcess.remaining(), bufferInfoRemoveFirst.presentationTimeUs, bufferInfoRemoveFirst.flags);
                builder2.add(bufferInfoRemoveFirst);
            }
        } else {
            builder.addAll((java.lang.Iterable) track.pendingSamplesByteBuffer);
            track.pendingSamplesByteBuffer.clear();
            builder2.addAll((java.lang.Iterable) track.pendingSamplesBufferInfo);
            track.pendingSamplesBufferInfo.clear();
        }
        com.google.common.collect.ImmutableList immutableListBuild = builder2.build();
        if (this.currentFragmentSequenceNumber == 1) {
            j = this.minInputPresentationTimeUs;
        } else {
            j = ((android.media.MediaCodec.BufferInfo) immutableListBuild.get(0)).presentationTimeUs;
        }
        java.util.List<java.lang.Long> listConvertPresentationTimestampsToDurationsVu = androidx.media3.muxer.Boxes.convertPresentationTimestampsToDurationsVu(immutableListBuild, j, track.videoUnitTimebase(), 1);
        java.util.List<java.lang.Integer> listCalculateSampleCompositionTimeOffsets = androidx.media3.muxer.Boxes.calculateSampleCompositionTimeOffsets(immutableListBuild, listConvertPresentationTimestampsToDurationsVu, track.videoUnitTimebase());
        boolean z = !listCalculateSampleCompositionTimeOffsets.isEmpty();
        com.google.common.collect.ImmutableList.Builder builder3 = new com.google.common.collect.ImmutableList.Builder();
        int i2 = 0;
        for (int i3 = 0; i3 < immutableListBuild.size(); i3++) {
            i2 += ((android.media.MediaCodec.BufferInfo) immutableListBuild.get(i3)).size;
            builder3.add(new androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata(listConvertPresentationTimestampsToDurationsVu.get(i3).longValue(), ((android.media.MediaCodec.BufferInfo) immutableListBuild.get(i3)).size, ((android.media.MediaCodec.BufferInfo) immutableListBuild.get(i3)).flags, z ? listCalculateSampleCompositionTimeOffsets.get(i3).intValue() : 0));
        }
        return new androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo(i, i2, z, builder.build(), builder3.build());
    }

    private static class ProcessedTrackInfo {
        public final boolean hasBFrame;
        public final com.google.common.collect.ImmutableList<java.nio.ByteBuffer> pendingSamplesByteBuffer;
        public final com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata> pendingSamplesMetadata;
        public final int totalSamplesSize;
        public final int trackId;

        public ProcessedTrackInfo(int i, int i2, boolean z, com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableList, com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata> immutableList2) {
            this.trackId = i;
            this.totalSamplesSize = i2;
            this.hasBFrame = z;
            this.pendingSamplesByteBuffer = immutableList;
            this.pendingSamplesMetadata = immutableList2;
        }
    }
}
