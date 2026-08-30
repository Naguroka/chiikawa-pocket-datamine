package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class SefSlowMotionFlattener {
    static final int INPUT_FRAME_RATE = 30;
    private static final int NAL_START_CODE_LENGTH = androidx.media3.container.NalUnitUtil.NAL_START_CODE.length;
    private static final int TARGET_OUTPUT_FRAME_RATE = 30;
    private final float captureFrameRate;
    private androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo currentSegmentInfo;
    private long frameTimeDeltaUs;
    private final int inputMaxLayer;
    private final java.lang.String mimeType;
    private androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo nextSegmentInfo;
    private final int normalSpeedMaxLayer;
    private final java.util.Iterator<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> segmentIterator;
    private final androidx.media3.extractor.metadata.mp4.SlowMotionData slowMotionData;
    private final byte[] scratch = new byte[NAL_START_CODE_LENGTH];
    private long lastSamplePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;

    private static final class MetadataInfo {
        public float captureFrameRate = -3.4028235E38f;
        public int inputMaxLayer = -1;
        public int normalSpeedMaxLayer = -1;
        public androidx.media3.extractor.metadata.mp4.SlowMotionData slowMotionData;
    }

    public SefSlowMotionFlattener(androidx.media3.common.Format format) {
        androidx.media3.transformer.SefSlowMotionFlattener.MetadataInfo metadataInfo = getMetadataInfo(format.metadata);
        androidx.media3.extractor.metadata.mp4.SlowMotionData slowMotionData = metadataInfo.slowMotionData;
        this.slowMotionData = slowMotionData;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        this.mimeType = str;
        if (slowMotionData != null) {
            androidx.media3.common.util.Assertions.checkArgument(str.equals("video/avc") || str.equals("video/hevc"), "Unsupported MIME type for SEF slow motion video track: " + str);
        }
        java.util.Iterator<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> it = (slowMotionData != null ? slowMotionData.segments : com.google.common.collect.ImmutableList.of()).iterator();
        this.segmentIterator = it;
        this.captureFrameRate = metadataInfo.captureFrameRate;
        int i = metadataInfo.inputMaxLayer;
        this.inputMaxLayer = i;
        int i2 = metadataInfo.normalSpeedMaxLayer;
        this.normalSpeedMaxLayer = i2;
        this.nextSegmentInfo = it.hasNext() ? new androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo(it.next(), i, i2) : null;
    }

    public boolean dropOrTransformSample(java.nio.ByteBuffer byteBuffer, long j) {
        int i;
        if (this.slowMotionData == null) {
            this.lastSamplePresentationTimeUs = j;
            return false;
        }
        int iPosition = byteBuffer.position();
        byteBuffer.position(NAL_START_CODE_LENGTH + iPosition);
        byteBuffer.get(this.scratch, 0, 4);
        if (this.mimeType.equals("video/avc")) {
            byte[] bArr = this.scratch;
            androidx.media3.common.util.Assertions.checkState((bArr[0] & 31) == 14 && (((bArr[1] & 255) >> 7) == 1), "Missing SVC extension prefix NAL unit.");
            i = (this.scratch[3] & 255) >> 5;
        } else if (this.mimeType.equals("video/hevc")) {
            i = (this.scratch[1] & 7) - 1;
        } else {
            throw new java.lang.IllegalStateException();
        }
        boolean zProcessCurrentFrame = processCurrentFrame(i, j);
        this.lastSamplePresentationTimeUs = getCurrentFrameOutputTimeUs(j);
        if (!zProcessCurrentFrame) {
            return true;
        }
        byteBuffer.position(iPosition);
        return false;
    }

    public long getSamplePresentationTimeUs() {
        androidx.media3.common.util.Assertions.checkState(this.lastSamplePresentationTimeUs != androidx.media3.common.C.TIME_UNSET);
        return this.lastSamplePresentationTimeUs;
    }

    boolean processCurrentFrame(int i, long j) {
        while (true) {
            androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo segmentInfo = this.nextSegmentInfo;
            if (segmentInfo == null || j < segmentInfo.endTimeUs) {
                break;
            }
            enterNextSegment();
        }
        androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo segmentInfo2 = this.nextSegmentInfo;
        if (segmentInfo2 != null && j >= segmentInfo2.startTimeUs) {
            enterNextSegment();
        } else {
            androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo segmentInfo3 = this.currentSegmentInfo;
            if (segmentInfo3 != null && j >= segmentInfo3.endTimeUs) {
                leaveCurrentSegment();
            }
        }
        androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo segmentInfo4 = this.currentSegmentInfo;
        return i <= (segmentInfo4 != null ? segmentInfo4.maxLayer : this.normalSpeedMaxLayer) || shouldKeepFrameForOutputValidity(i, j);
    }

    private void enterNextSegment() {
        if (this.currentSegmentInfo != null) {
            leaveCurrentSegment();
        }
        this.currentSegmentInfo = this.nextSegmentInfo;
        this.nextSegmentInfo = this.segmentIterator.hasNext() ? new androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo(this.segmentIterator.next(), this.inputMaxLayer, this.normalSpeedMaxLayer) : null;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"currentSegmentInfo"})
    private void leaveCurrentSegment() {
        this.frameTimeDeltaUs += (this.currentSegmentInfo.endTimeUs - this.currentSegmentInfo.startTimeUs) * ((long) (this.currentSegmentInfo.speedDivisor - 1));
        this.currentSegmentInfo = null;
    }

    private boolean shouldKeepFrameForOutputValidity(int i, long j) {
        androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo segmentInfo = this.nextSegmentInfo;
        if (segmentInfo != null && i < segmentInfo.maxLayer) {
            long j2 = ((this.nextSegmentInfo.startTimeUs - j) * 30) / 1000000;
            float f = (-(1 << (this.inputMaxLayer - this.nextSegmentInfo.maxLayer))) + 0.45f;
            for (int i2 = 1; i2 < this.nextSegmentInfo.maxLayer && j2 < (1 << (this.inputMaxLayer - i2)) + f; i2++) {
                if (i <= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    long getCurrentFrameOutputTimeUs(long j) {
        long j2 = this.frameTimeDeltaUs + j;
        androidx.media3.transformer.SefSlowMotionFlattener.SegmentInfo segmentInfo = this.currentSegmentInfo;
        if (segmentInfo != null) {
            j2 += (j - segmentInfo.startTimeUs) * ((long) (this.currentSegmentInfo.speedDivisor - 1));
        }
        return java.lang.Math.round((j2 * 30) / this.captureFrameRate);
    }

    private static androidx.media3.transformer.SefSlowMotionFlattener.MetadataInfo getMetadataInfo(androidx.media3.common.Metadata metadata) {
        androidx.media3.transformer.SefSlowMotionFlattener.MetadataInfo metadataInfo = new androidx.media3.transformer.SefSlowMotionFlattener.MetadataInfo();
        if (metadata == null) {
            return metadataInfo;
        }
        for (int i = 0; i < metadata.length(); i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry) {
                androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry smtaMetadataEntry = (androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry) entry;
                metadataInfo.captureFrameRate = smtaMetadataEntry.captureFrameRate;
                metadataInfo.inputMaxLayer = smtaMetadataEntry.svcTemporalLayerCount - 1;
            } else if (entry instanceof androidx.media3.extractor.metadata.mp4.SlowMotionData) {
                metadataInfo.slowMotionData = (androidx.media3.extractor.metadata.mp4.SlowMotionData) entry;
            }
        }
        if (metadataInfo.slowMotionData == null) {
            return metadataInfo;
        }
        androidx.media3.common.util.Assertions.checkState(metadataInfo.inputMaxLayer != -1, "SVC temporal layer count not found.");
        androidx.media3.common.util.Assertions.checkState(metadataInfo.captureFrameRate != -3.4028235E38f, "Capture frame rate not found.");
        androidx.media3.common.util.Assertions.checkState(metadataInfo.captureFrameRate % 1.0f == 0.0f && metadataInfo.captureFrameRate % 30.0f == 0.0f, "Invalid capture frame rate: " + metadataInfo.captureFrameRate);
        int i2 = ((int) metadataInfo.captureFrameRate) / 30;
        for (int i3 = metadataInfo.inputMaxLayer; i3 >= 0; i3--) {
            if ((i2 & 1) == 1) {
                androidx.media3.common.util.Assertions.checkState((i2 >> 1) == 0, "Could not compute normal speed max SVC layer for capture frame rate  " + metadataInfo.captureFrameRate);
                metadataInfo.normalSpeedMaxLayer = i3;
                break;
            }
            i2 >>= 1;
        }
        return metadataInfo;
    }

    private static final class SegmentInfo {
        public final long endTimeUs;
        public final int maxLayer;
        public final int speedDivisor;
        public final long startTimeUs;

        public SegmentInfo(androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment, int i, int i2) {
            this.startTimeUs = androidx.media3.common.util.Util.msToUs(segment.startTimeMs);
            this.endTimeUs = androidx.media3.common.util.Util.msToUs(segment.endTimeMs);
            int i3 = segment.speedDivisor;
            this.speedDivisor = i3;
            this.maxLayer = getSlowMotionMaxLayer(i3, i, i2);
        }

        private static int getSlowMotionMaxLayer(int i, int i2, int i3) {
            for (int i4 = i; i4 > 0; i4 >>= 1) {
                if ((i4 & 1) == 1) {
                    androidx.media3.common.util.Assertions.checkState((i4 >> 1) == 0, "Invalid speed divisor: " + i);
                    break;
                }
                i3++;
            }
            return java.lang.Math.min(i3, i2);
        }
    }
}
