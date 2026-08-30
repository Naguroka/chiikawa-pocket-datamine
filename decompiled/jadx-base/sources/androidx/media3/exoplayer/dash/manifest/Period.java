package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class Period {
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> adaptationSets;
    public final androidx.media3.exoplayer.dash.manifest.Descriptor assetIdentifier;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> eventStreams;
    public final java.lang.String id;
    public final long startMs;

    public Period(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list) {
        this(str, j, list, java.util.Collections.emptyList(), null);
    }

    public Period(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2) {
        this(str, j, list, list2, null);
    }

    public Period(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2, androidx.media3.exoplayer.dash.manifest.Descriptor descriptor) {
        this.id = str;
        this.startMs = j;
        this.adaptationSets = java.util.Collections.unmodifiableList(list);
        this.eventStreams = java.util.Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }

    public int getAdaptationSetIndex(int i) {
        int size = this.adaptationSets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.adaptationSets.get(i2).type == i) {
                return i2;
            }
        }
        return -1;
    }
}
