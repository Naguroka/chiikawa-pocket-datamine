package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
class SegmentSpeedProvider implements androidx.media3.common.audio.SpeedProvider {
    private static final int INPUT_FRAME_RATE = 30;
    private final float baseSpeedMultiplier;
    private final com.google.common.collect.ImmutableSortedMap<java.lang.Long, java.lang.Float> speedsByStartTimeUs;

    public SegmentSpeedProvider(androidx.media3.common.Metadata metadata) {
        float captureFrameRate = getCaptureFrameRate(metadata);
        float f = captureFrameRate == -3.4028235E38f ? 1.0f : captureFrameRate / 30.0f;
        this.baseSpeedMultiplier = f;
        this.speedsByStartTimeUs = buildSpeedByStartTimeUsMap(metadata, f);
    }

    @Override // androidx.media3.common.audio.SpeedProvider
    public float getSpeed(long j) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        java.util.Map.Entry<java.lang.Long, java.lang.Float> entryFloorEntry = this.speedsByStartTimeUs.floorEntry(java.lang.Long.valueOf(j));
        return entryFloorEntry != null ? entryFloorEntry.getValue().floatValue() : this.baseSpeedMultiplier;
    }

    @Override // androidx.media3.common.audio.SpeedProvider
    public long getNextSpeedChangeTimeUs(long j) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        java.lang.Long lHigherKey = this.speedsByStartTimeUs.higherKey(java.lang.Long.valueOf(j));
        return lHigherKey != null ? lHigherKey.longValue() : androidx.media3.common.C.TIME_UNSET;
    }

    private static com.google.common.collect.ImmutableSortedMap<java.lang.Long, java.lang.Float> buildSpeedByStartTimeUsMap(androidx.media3.common.Metadata metadata, float f) {
        com.google.common.collect.ImmutableList<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> immutableListExtractSlowMotionSegments = extractSlowMotionSegments(metadata);
        if (immutableListExtractSlowMotionSegments.isEmpty()) {
            return com.google.common.collect.ImmutableSortedMap.of();
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (int i = 0; i < immutableListExtractSlowMotionSegments.size(); i++) {
            androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment = immutableListExtractSlowMotionSegments.get(i);
            treeMap.put(java.lang.Long.valueOf(androidx.media3.common.util.Util.msToUs(segment.startTimeMs)), java.lang.Float.valueOf(f / segment.speedDivisor));
        }
        for (int i2 = 0; i2 < immutableListExtractSlowMotionSegments.size(); i2++) {
            androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment2 = immutableListExtractSlowMotionSegments.get(i2);
            if (!treeMap.containsKey(java.lang.Long.valueOf(androidx.media3.common.util.Util.msToUs(segment2.endTimeMs)))) {
                treeMap.put(java.lang.Long.valueOf(androidx.media3.common.util.Util.msToUs(segment2.endTimeMs)), java.lang.Float.valueOf(f));
            }
        }
        return com.google.common.collect.ImmutableSortedMap.copyOf((java.util.Map) treeMap);
    }

    private static float getCaptureFrameRate(androidx.media3.common.Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry) {
                return ((androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry) entry).captureFrameRate;
            }
        }
        return -3.4028235E38f;
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> extractSlowMotionSegments(androidx.media3.common.Metadata metadata) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < metadata.length(); i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.mp4.SlowMotionData) {
                arrayList.addAll(((androidx.media3.extractor.metadata.mp4.SlowMotionData) entry).segments);
            }
        }
        return com.google.common.collect.ImmutableList.sortedCopyOf(androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.BY_START_THEN_END_THEN_DIVISOR, arrayList);
    }
}
