package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
final class MergingCuesResolver implements androidx.media3.exoplayer.text.CuesResolver {
    private static final com.google.common.collect.Ordering<androidx.media3.extractor.text.CuesWithTiming> CUES_DISPLAY_PRIORITY_COMPARATOR = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return java.lang.Long.valueOf(((androidx.media3.extractor.text.CuesWithTiming) obj).startTimeUs);
        }
    }).compound(com.google.common.collect.Ordering.natural().reverse().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda1
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return java.lang.Long.valueOf(((androidx.media3.extractor.text.CuesWithTiming) obj).durationUs);
        }
    }));
    private final java.util.List<androidx.media3.extractor.text.CuesWithTiming> cuesWithTimingList = new java.util.ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming, long j) {
        androidx.media3.common.util.Assertions.checkArgument(cuesWithTiming.startTimeUs != androidx.media3.common.C.TIME_UNSET);
        androidx.media3.common.util.Assertions.checkArgument(cuesWithTiming.durationUs != androidx.media3.common.C.TIME_UNSET);
        boolean z = cuesWithTiming.startTimeUs <= j && j < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).startTimeUs) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                com.google.common.collect.ImmutableList immutableListSortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
                for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
                    builder.addAll((java.lang.Iterable) ((androidx.media3.extractor.text.CuesWithTiming) immutableListSortedCopyOf.get(i2)).cues);
                }
                return builder.build();
            }
        }
        return com.google.common.collect.ImmutableList.of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j > j2 && j > this.cuesWithTimingList.get(i).endTimeUs) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            long j3 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j3 <= j) {
                jMax = java.lang.Math.max(jMax, j3);
            } else {
                if (j2 > j) {
                    break;
                }
                jMax = java.lang.Math.max(jMax, j2);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        long jMin = -9223372036854775807L;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            long j3 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j < j2) {
                if (jMin != androidx.media3.common.C.TIME_UNSET) {
                    jMin = java.lang.Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == androidx.media3.common.C.TIME_UNSET ? j3 : java.lang.Math.min(jMin, j3);
            }
        }
        if (jMin != androidx.media3.common.C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }
}
