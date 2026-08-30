package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class CuesWithTimingSubtitle implements androidx.media3.extractor.text.Subtitle {
    private static final com.google.common.collect.Ordering<androidx.media3.extractor.text.CuesWithTiming> CUES_BY_START_TIME_ASCENDING = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.extractor.text.CuesWithTimingSubtitle$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return java.lang.Long.valueOf(androidx.media3.extractor.text.CuesWithTimingSubtitle.normalizeUnsetStartTimeToZero(((androidx.media3.extractor.text.CuesWithTiming) obj).startTimeUs));
        }
    });
    private static final java.lang.String TAG = "CuesWithTimingSubtitle";
    private final com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue>> eventCues;
    private final long[] eventTimesUs;

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public CuesWithTimingSubtitle(java.util.List<androidx.media3.extractor.text.CuesWithTiming> list) {
        if (list.size() == 1) {
            androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = (androidx.media3.extractor.text.CuesWithTiming) com.google.common.collect.Iterables.getOnlyElement(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == androidx.media3.common.C.TIME_UNSET) {
                this.eventCues = com.google.common.collect.ImmutableList.of(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableList) cuesWithTiming.cues, com.google.common.collect.ImmutableList.of());
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, jNormalizeUnsetStartTimeToZero + cuesWithTiming.durationUs};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        java.util.Arrays.fill(jArr, Long.MAX_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.collect.ImmutableList immutableListSortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, list);
        int i = 0;
        for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
            androidx.media3.extractor.text.CuesWithTiming cuesWithTiming2 = (androidx.media3.extractor.text.CuesWithTiming) immutableListSortedCopyOf.get(i2);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i != 0) {
                int i3 = i - 1;
                long j2 = this.eventTimesUs[i3];
                if (j2 < jNormalizeUnsetStartTimeToZero2) {
                    this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i++;
                } else if (j2 == jNormalizeUnsetStartTimeToZero2 && ((com.google.common.collect.ImmutableList) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, cuesWithTiming2.cues);
                } else {
                    androidx.media3.common.util.Log.w(TAG, "Truncating unsupported overlapping cues.");
                    this.eventTimesUs[i3] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.set(i3, cuesWithTiming2.cues);
                }
            } else {
                this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                arrayList.add(cuesWithTiming2.cues);
                i++;
            }
            if (cuesWithTiming2.durationUs != androidx.media3.common.C.TIME_UNSET) {
                this.eventTimesUs[i] = j;
                arrayList.add(com.google.common.collect.ImmutableList.of());
                i++;
            }
        }
        this.eventCues = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> getCues(long j) {
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        return iBinarySearchFloor == -1 ? com.google.common.collect.ImmutableList.of() : this.eventCues.get(iBinarySearchFloor);
    }
}
