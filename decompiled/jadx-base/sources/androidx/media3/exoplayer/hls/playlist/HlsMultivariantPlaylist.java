package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMultivariantPlaylist extends androidx.media3.exoplayer.hls.playlist.HlsPlaylist {
    public static final androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist EMPTY = new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist("", java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), null, java.util.Collections.emptyList(), false, java.util.Collections.emptyMap(), java.util.Collections.emptyList());
    public static final int GROUP_INDEX_AUDIO = 1;
    public static final int GROUP_INDEX_SUBTITLE = 2;
    public static final int GROUP_INDEX_VARIANT = 0;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> audios;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> closedCaptions;
    public final java.util.List<android.net.Uri> mediaPlaylistUrls;
    public final androidx.media3.common.Format muxedAudioFormat;
    public final java.util.List<androidx.media3.common.Format> muxedCaptionFormats;
    public final java.util.List<androidx.media3.common.DrmInitData> sessionKeyDrmInitData;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> subtitles;
    public final java.util.Map<java.lang.String, java.lang.String> variableDefinitions;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> variants;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> videos;

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy2(java.util.List list) {
        return copy((java.util.List<androidx.media3.common.StreamKey>) list);
    }

    public static final class Variant {
        public final java.lang.String audioGroupId;
        public final java.lang.String captionGroupId;
        public final androidx.media3.common.Format format;
        public final java.lang.String subtitleGroupId;
        public final android.net.Uri url;
        public final java.lang.String videoGroupId;

        public Variant(android.net.Uri uri, androidx.media3.common.Format format, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.url = uri;
            this.format = format;
            this.videoGroupId = str;
            this.audioGroupId = str2;
            this.subtitleGroupId = str3;
            this.captionGroupId = str4;
        }

        public static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant createMediaPlaylistVariantUrl(android.net.Uri uri) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(uri, new androidx.media3.common.Format.Builder().setId("0").setContainerMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).build(), null, null, null, null);
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant copyWithFormat(androidx.media3.common.Format format) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(this.url, format, this.videoGroupId, this.audioGroupId, this.subtitleGroupId, this.captionGroupId);
        }
    }

    public static final class Rendition {
        public final androidx.media3.common.Format format;
        public final java.lang.String groupId;
        public final java.lang.String name;
        public final android.net.Uri url;

        public Rendition(android.net.Uri uri, androidx.media3.common.Format format, java.lang.String str, java.lang.String str2) {
            this.url = uri;
            this.format = format;
            this.groupId = str;
            this.name = str2;
        }
    }

    public HlsMultivariantPlaylist(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list2, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list3, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list4, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list5, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list6, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list7, boolean z, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<androidx.media3.common.DrmInitData> list8) {
        super(str, list, z);
        this.mediaPlaylistUrls = java.util.Collections.unmodifiableList(getMediaPlaylistUrls(list2, list3, list4, list5, list6));
        this.variants = java.util.Collections.unmodifiableList(list2);
        this.videos = java.util.Collections.unmodifiableList(list3);
        this.audios = java.util.Collections.unmodifiableList(list4);
        this.subtitles = java.util.Collections.unmodifiableList(list5);
        this.closedCaptions = java.util.Collections.unmodifiableList(list6);
        this.muxedAudioFormat = format;
        this.muxedCaptionFormats = list7 != null ? java.util.Collections.unmodifiableList(list7) : null;
        this.variableDefinitions = java.util.Collections.unmodifiableMap(map);
        this.sessionKeyDrmInitData = java.util.Collections.unmodifiableList(list8);
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy(java.util.List<androidx.media3.common.StreamKey> list) {
        return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist(this.baseUri, this.tags, copyStreams(this.variants, 0, list), java.util.Collections.emptyList(), copyStreams(this.audios, 1, list), copyStreams(this.subtitles, 2, list), java.util.Collections.emptyList(), this.muxedAudioFormat, this.muxedCaptionFormats, this.hasIndependentSegments, this.variableDefinitions, this.sessionKeyDrmInitData);
    }

    public static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist createSingleVariantMultivariantPlaylist(java.lang.String str) {
        return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist("", java.util.Collections.emptyList(), java.util.Collections.singletonList(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant.createMediaPlaylistVariantUrl(android.net.Uri.parse(str))), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), null, null, false, java.util.Collections.emptyMap(), java.util.Collections.emptyList());
    }

    private static java.util.List<android.net.Uri> getMediaPlaylistUrls(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list2, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list3, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list4, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list5) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            android.net.Uri uri = list.get(i).url;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        addMediaPlaylistUrls(list2, arrayList);
        addMediaPlaylistUrls(list3, arrayList);
        addMediaPlaylistUrls(list4, arrayList);
        addMediaPlaylistUrls(list5, arrayList);
        return arrayList;
    }

    private static void addMediaPlaylistUrls(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list, java.util.List<android.net.Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            android.net.Uri uri = list.get(i).url;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> java.util.List<T> copyStreams(java.util.List<T> list, int i, java.util.List<androidx.media3.common.StreamKey> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                androidx.media3.common.StreamKey streamKey = list2.get(i3);
                if (streamKey.groupIndex == i && streamKey.streamIndex == i2) {
                    arrayList.add(t);
                    break;
                }
            }
        }
        return arrayList;
    }
}
