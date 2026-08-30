package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class HlsManifest {
    public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist mediaPlaylist;
    public final androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;

    HlsManifest(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.mediaPlaylist = hlsMediaPlaylist;
    }
}
