package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
final class ReplacingCuesResolver implements androidx.media3.exoplayer.text.CuesResolver {
    private final java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> cuesWithTimingList = new java.util.ArrayList<>();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming, long j) {
        androidx.media3.common.util.Assertions.checkArgument(cuesWithTiming.startTimeUs != androidx.media3.common.C.TIME_UNSET);
        boolean z = cuesWithTiming.startTimeUs <= j && (cuesWithTiming.endTimeUs == androidx.media3.common.C.TIME_UNSET || j < cuesWithTiming.endTimeUs);
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
            if (this.cuesWithTimingList.get(size).startTimeUs <= j) {
                z = false;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return com.google.common.collect.ImmutableList.of();
        }
        androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        if (cuesWithTiming.endTimeUs == androidx.media3.common.C.TIME_UNSET || j < cuesWithTiming.endTimeUs) {
            return cuesWithTiming.cues;
        }
        return com.google.common.collect.ImmutableList.of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter > 0) {
            this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty() || j < this.cuesWithTimingList.get(0).startTimeUs) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i - 1);
                if (cuesWithTiming.endTimeUs != androidx.media3.common.C.TIME_UNSET && cuesWithTiming.endTimeUs <= j) {
                    return cuesWithTiming.endTimeUs;
                }
                return cuesWithTiming.startTimeUs;
            }
        }
        androidx.media3.extractor.text.CuesWithTiming cuesWithTiming2 = (androidx.media3.extractor.text.CuesWithTiming) com.google.common.collect.Iterables.getLast(this.cuesWithTimingList);
        if (cuesWithTiming2.endTimeUs == androidx.media3.common.C.TIME_UNSET || j < cuesWithTiming2.endTimeUs) {
            return cuesWithTiming2.startTimeUs;
        }
        return cuesWithTiming2.endTimeUs;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
            if (j < cuesWithTiming.startTimeUs) {
                androidx.media3.extractor.text.CuesWithTiming cuesWithTiming2 = this.cuesWithTimingList.get(i - 1);
                if (cuesWithTiming2.endTimeUs != androidx.media3.common.C.TIME_UNSET && cuesWithTiming2.endTimeUs > j && cuesWithTiming2.endTimeUs < cuesWithTiming.startTimeUs) {
                    return cuesWithTiming2.endTimeUs;
                }
                return cuesWithTiming.startTimeUs;
            }
        }
        androidx.media3.extractor.text.CuesWithTiming cuesWithTiming3 = (androidx.media3.extractor.text.CuesWithTiming) com.google.common.collect.Iterables.getLast(this.cuesWithTimingList);
        if (cuesWithTiming3.endTimeUs == androidx.media3.common.C.TIME_UNSET || j >= cuesWithTiming3.endTimeUs) {
            return Long.MIN_VALUE;
        }
        return cuesWithTiming3.endTimeUs;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    private int getIndexOfCuesStartingAfter(long j) {
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            if (j < this.cuesWithTimingList.get(i).startTimeUs) {
                return i;
            }
        }
        return this.cuesWithTimingList.size();
    }
}
