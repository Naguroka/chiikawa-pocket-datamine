package androidx.media3.exoplayer.hls.offline;

/* JADX INFO: loaded from: classes.dex */
public final class HlsDownloader extends androidx.media3.exoplayer.offline.SegmentDownloader<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> {
    public HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0());
    }

    public HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser(), factory, executor, 20000L);
    }

    @java.lang.Deprecated
    public HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j) {
        super(mediaItem, parser, factory, executor, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> getSegments(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.hls.playlist.HlsPlaylist hlsPlaylist, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        java.util.ArrayList<androidx.media3.datasource.DataSpec> arrayList = new java.util.ArrayList();
        if (hlsPlaylist instanceof androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) {
            addMediaPlaylistDataSpecs(((androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) hlsPlaylist).mediaPlaylistUrls, arrayList);
        } else {
            arrayList.add(androidx.media3.exoplayer.offline.SegmentDownloader.getCompressibleDataSpec(android.net.Uri.parse(hlsPlaylist.baseUri)));
        }
        java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> arrayList2 = new java.util.ArrayList<>();
        java.util.HashSet<android.net.Uri> hashSet = new java.util.HashSet<>();
        for (androidx.media3.datasource.DataSpec dataSpec : arrayList) {
            arrayList2.add(new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(0L, dataSpec));
            try {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) getManifest(dataSource, dataSpec, z);
                java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = null;
                for (int i = 0; i < list.size(); i++) {
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment2 = list.get(i);
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                    if (segment3 != null && segment3 != segment) {
                        addSegment(hlsMediaPlaylist, segment3, hashSet, arrayList2);
                        segment = segment3;
                    }
                    addSegment(hlsMediaPlaylist, segment2, hashSet, arrayList2);
                }
            } catch (java.io.IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }

    private void addMediaPlaylistDataSpecs(java.util.List<android.net.Uri> list, java.util.List<androidx.media3.datasource.DataSpec> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(androidx.media3.exoplayer.offline.SegmentDownloader.getCompressibleDataSpec(list.get(i)));
        }
    }

    private void addSegment(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, java.util.HashSet<android.net.Uri> hashSet, java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> arrayList) {
        java.lang.String str = hlsMediaPlaylist.baseUri;
        long j = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        if (segment.fullSegmentEncryptionKeyUri != null) {
            android.net.Uri uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(str, segment.fullSegmentEncryptionKeyUri);
            if (hashSet.add(uriResolveToUri)) {
                arrayList.add(new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(j, androidx.media3.exoplayer.offline.SegmentDownloader.getCompressibleDataSpec(uriResolveToUri)));
            }
        }
        arrayList.add(new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(j, new androidx.media3.datasource.DataSpec(androidx.media3.common.util.UriUtil.resolveToUri(str, segment.url), segment.byteRangeOffset, segment.byteRangeLength)));
    }
}
