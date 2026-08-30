package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
interface CuesResolver {
    boolean addCues(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
