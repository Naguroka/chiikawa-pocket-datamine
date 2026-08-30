package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public abstract class HlsPlaylist implements androidx.media3.exoplayer.offline.FilterableManifest<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> {
    public final java.lang.String baseUri;
    public final boolean hasIndependentSegments;
    public final java.util.List<java.lang.String> tags;

    protected HlsPlaylist(java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        this.baseUri = str;
        this.tags = java.util.Collections.unmodifiableList(list);
        this.hasIndependentSegments = z;
    }
}
