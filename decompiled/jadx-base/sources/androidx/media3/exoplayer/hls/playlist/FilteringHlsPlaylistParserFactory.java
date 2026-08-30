package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class FilteringHlsPlaylistParserFactory implements androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory {
    private final androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory;
    private final java.util.List<androidx.media3.common.StreamKey> streamKeys;

    public FilteringHlsPlaylistParserFactory(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory, java.util.List<androidx.media3.common.StreamKey> list) {
        this.hlsPlaylistParserFactory = hlsPlaylistParserFactory;
        this.streamKeys = list;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory
    public androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> createPlaylistParser() {
        return new androidx.media3.exoplayer.offline.FilteringManifestParser(this.hlsPlaylistParserFactory.createPlaylistParser(), this.streamKeys);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory
    public androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> createPlaylistParser(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        return new androidx.media3.exoplayer.offline.FilteringManifestParser(this.hlsPlaylistParserFactory.createPlaylistParser(hlsMultivariantPlaylist, hlsMediaPlaylist), this.streamKeys);
    }
}
