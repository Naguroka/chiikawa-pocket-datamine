package androidx.media3.extractor.text.cea;

/* JADX INFO: loaded from: classes.dex */
final class CeaSubtitle implements androidx.media3.extractor.text.Subtitle {
    private final java.util.List<androidx.media3.common.text.Cue> cues;

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public CeaSubtitle(java.util.List<androidx.media3.common.text.Cue> list) {
        this.cues = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public java.util.List<androidx.media3.common.text.Cue> getCues(long j) {
        return j >= 0 ? this.cues : java.util.Collections.emptyList();
    }
}
