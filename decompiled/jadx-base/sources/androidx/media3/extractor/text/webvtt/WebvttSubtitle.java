package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
final class WebvttSubtitle implements androidx.media3.extractor.text.Subtitle {
    private final java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueInfo> list) {
        this.cueInfos = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.extractor.text.webvtt.WebvttCueInfo webvttCueInfo = list.get(i);
            int i2 = i * 2;
            this.cueTimesUs[i2] = webvttCueInfo.startTimeUs;
            this.cueTimesUs[i2 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr = this.cueTimesUs;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, jArr.length);
        this.sortedCueTimesUs = jArrCopyOf;
        java.util.Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.sortedCueTimesUs, j, false, false);
        if (iBinarySearchCeil < this.sortedCueTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        androidx.media3.common.util.Assertions.checkArgument(i < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public java.util.List<androidx.media3.common.text.Cue> getCues(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < this.cueInfos.size(); i++) {
            long[] jArr = this.cueTimesUs;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                androidx.media3.extractor.text.webvtt.WebvttCueInfo webvttCueInfo = this.cueInfos.get(i);
                if (webvttCueInfo.cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(webvttCueInfo.cue);
                }
            }
        }
        java.util.Collections.sort(arrayList2, new java.util.Comparator() { // from class: androidx.media3.extractor.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.compare(((androidx.media3.extractor.text.webvtt.WebvttCueInfo) obj).startTimeUs, ((androidx.media3.extractor.text.webvtt.WebvttCueInfo) obj2).startTimeUs);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((androidx.media3.extractor.text.webvtt.WebvttCueInfo) arrayList2.get(i3)).cue.buildUpon().setLine((-1) - i3, 1).build());
        }
        return arrayList;
    }
}
