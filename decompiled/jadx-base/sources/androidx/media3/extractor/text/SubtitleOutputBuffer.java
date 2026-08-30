package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class SubtitleOutputBuffer extends androidx.media3.decoder.DecoderOutputBuffer implements androidx.media3.extractor.text.Subtitle {
    private long subsampleOffsetUs;
    private androidx.media3.extractor.text.Subtitle subtitle;

    public void setContent(long j, androidx.media3.extractor.text.Subtitle subtitle, long j2) {
        this.timeUs = j;
        this.subtitle = subtitle;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.timeUs;
        }
        this.subsampleOffsetUs = j2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return ((androidx.media3.extractor.text.Subtitle) androidx.media3.common.util.Assertions.checkNotNull(this.subtitle)).getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        return ((androidx.media3.extractor.text.Subtitle) androidx.media3.common.util.Assertions.checkNotNull(this.subtitle)).getEventTime(i) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return ((androidx.media3.extractor.text.Subtitle) androidx.media3.common.util.Assertions.checkNotNull(this.subtitle)).getNextEventTimeIndex(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public java.util.List<androidx.media3.common.text.Cue> getCues(long j) {
        return ((androidx.media3.extractor.text.Subtitle) androidx.media3.common.util.Assertions.checkNotNull(this.subtitle)).getCues(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }
}
