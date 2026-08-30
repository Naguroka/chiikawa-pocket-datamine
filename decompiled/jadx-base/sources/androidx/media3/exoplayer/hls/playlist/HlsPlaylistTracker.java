package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public interface HlsPlaylistTracker {

    public interface Factory {
        androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker createTracker(androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory);
    }

    public interface PlaylistEventListener {
        void onPlaylistChanged();

        boolean onPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z);
    }

    public interface PrimaryPlaylistListener {
        void onPrimaryPlaylistRefreshed(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist);
    }

    void addListener(androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener playlistEventListener);

    default void deactivatePlaylistForPlayback(android.net.Uri uri) {
    }

    boolean excludeMediaPlaylist(android.net.Uri uri, long j);

    long getInitialStartTimeUs();

    androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist getMultivariantPlaylist();

    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist getPlaylistSnapshot(android.net.Uri uri, boolean z);

    boolean isLive();

    boolean isSnapshotValid(android.net.Uri uri);

    void maybeThrowPlaylistRefreshError(android.net.Uri uri) throws java.io.IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws java.io.IOException;

    void refreshPlaylist(android.net.Uri uri);

    void removeListener(androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener playlistEventListener);

    void start(android.net.Uri uri, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener);

    void stop();

    public static final class PlaylistStuckException extends java.io.IOException {
        public final android.net.Uri url;

        public PlaylistStuckException(android.net.Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistResetException extends java.io.IOException {
        public final android.net.Uri url;

        public PlaylistResetException(android.net.Uri uri) {
            this.url = uri;
        }
    }
}
