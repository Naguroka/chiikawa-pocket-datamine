package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public class CuesWithTiming {
    public final com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(java.util.List<androidx.media3.common.text.Cue> list, long j, long j2) {
        this.cues = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.startTimeUs = j;
        this.durationUs = j2;
        long j3 = androidx.media3.common.C.TIME_UNSET;
        if (j != androidx.media3.common.C.TIME_UNSET && j2 != androidx.media3.common.C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.endTimeUs = j3;
    }
}
