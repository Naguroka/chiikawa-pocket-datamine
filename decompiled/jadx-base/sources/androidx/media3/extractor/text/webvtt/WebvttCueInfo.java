package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttCueInfo {
    public final androidx.media3.common.text.Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(androidx.media3.common.text.Cue cue, long j, long j2) {
        this.cue = cue;
        this.startTimeUs = j;
        this.endTimeUs = j2;
    }
}
