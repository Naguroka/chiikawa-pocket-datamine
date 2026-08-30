package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsPlaylistParserFactory implements androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory {
    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory
    public androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> createPlaylistParser() {
        return new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory
    public androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> createPlaylistParser(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        return new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser(hlsMultivariantPlaylist, hlsMediaPlaylist);
    }
}
