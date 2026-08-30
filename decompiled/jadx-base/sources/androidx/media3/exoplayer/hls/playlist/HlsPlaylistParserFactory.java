package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public interface HlsPlaylistParserFactory {
    androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> createPlaylistParser();

    androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> createPlaylistParser(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist);
}
