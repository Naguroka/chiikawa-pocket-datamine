package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlSubtitle implements androidx.media3.extractor.text.Subtitle {
    private final long[] eventTimesUs;
    private final java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> globalStyles;
    private final java.util.Map<java.lang.String, java.lang.String> imageMap;
    private final java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> regionMap;
    private final androidx.media3.extractor.text.ttml.TtmlNode root;

    public TtmlSubtitle(androidx.media3.extractor.text.ttml.TtmlNode ttmlNode, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        this.root = ttmlNode;
        this.regionMap = map2;
        this.imageMap = map3;
        this.globalStyles = map != null ? java.util.Collections.unmodifiableMap(map) : java.util.Collections.emptyMap();
        this.eventTimesUs = ttmlNode.getEventTimesUs();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (iBinarySearchCeil < this.eventTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventTimesUs.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        return this.eventTimesUs[i];
    }

    androidx.media3.extractor.text.ttml.TtmlNode getRoot() {
        return this.root;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public java.util.List<androidx.media3.common.text.Cue> getCues(long j) {
        return this.root.getCues(j, this.globalStyles, this.regionMap, this.imageMap);
    }

    java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> getGlobalStyles() {
        return this.globalStyles;
    }
}
