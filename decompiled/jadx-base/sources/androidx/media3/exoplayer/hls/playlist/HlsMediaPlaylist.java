package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaPlaylist extends androidx.media3.exoplayer.hls.playlist.HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    public final androidx.media3.common.DrmInitData protectionSchemes;
    public final java.util.Map<android.net.Uri, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport> renditionReports;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> segments;
    public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> trailingParts;
    public final int version;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy(java.util.List<androidx.media3.common.StreamKey> list) {
        return this;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy2(java.util.List list) {
        return copy((java.util.List<androidx.media3.common.StreamKey>) list);
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z, long j2, long j3, boolean z2) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z;
            this.holdBackUs = j2;
            this.partHoldBackUs = j3;
            this.canBlockReload = z2;
        }
    }

    public static final class Segment extends androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase {
        public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> parts;
        public final java.lang.String title;

        public Segment(java.lang.String str, long j, long j2, java.lang.String str2, java.lang.String str3) {
            this(str, null, "", 0L, -1, androidx.media3.common.C.TIME_UNSET, null, str2, str3, j, j2, false, com.google.common.collect.ImmutableList.of());
        }

        public Segment(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, java.lang.String str2, long j, int i, long j2, androidx.media3.common.DrmInitData drmInitData, java.lang.String str3, java.lang.String str4, long j3, long j4, boolean z, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list) {
            super(str, segment, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.title = str2;
            this.parts = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment copyWith(long j, int i) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.parts.size(); i2++) {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = this.parts.get(i2);
                arrayList.add(part.copyWith(j2, i));
                j2 += part.durationUs;
            }
            return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(this.url, this.initializationSegment, this.title, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }
    }

    public static final class Part extends androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, long j, int i, long j2, androidx.media3.common.DrmInitData drmInitData, java.lang.String str2, java.lang.String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, segment, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.isIndependent = z2;
            this.isPreload = z3;
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part copyWith(long j, int i) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(this.url, this.initializationSegment, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    public static class SegmentBase implements java.lang.Comparable<java.lang.Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        public final androidx.media3.common.DrmInitData drmInitData;
        public final long durationUs;
        public final java.lang.String encryptionIV;
        public final java.lang.String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final java.lang.String url;

        private SegmentBase(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, long j, int i, long j2, androidx.media3.common.DrmInitData drmInitData, java.lang.String str2, java.lang.String str3, long j3, long j4, boolean z) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j2;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j3;
            this.byteRangeLength = j4;
            this.hasGapTag = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Long l) {
            if (this.relativeStartTimeUs > l.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l.longValue() ? -1 : 0;
        }
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final android.net.Uri playlistUri;

        public RenditionReport(android.net.Uri uri, long j, int i) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i;
        }
    }

    public HlsMediaPlaylist(int i, java.lang.String str, java.util.List<java.lang.String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, androidx.media3.common.DrmInitData drmInitData, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> list2, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list3, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl, java.util.Map<android.net.Uri, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport> map) {
        super(str, list, z3);
        this.playlistType = i;
        this.startTimeUs = j2;
        this.preciseStart = z;
        this.hasDiscontinuitySequence = z2;
        this.discontinuitySequence = i2;
        this.mediaSequence = j3;
        this.version = i3;
        this.targetDurationUs = j4;
        this.partTargetDurationUs = j5;
        this.hasEndTag = z4;
        this.hasProgramDateTime = z5;
        this.protectionSchemes = drmInitData;
        this.segments = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list2);
        this.trailingParts = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list3);
        this.renditionReports = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
        if (!list3.isEmpty()) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) com.google.common.collect.Iterables.getLast(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (!list2.isEmpty()) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment) com.google.common.collect.Iterables.getLast(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        } else {
            this.durationUs = 0L;
        }
        long jMax = androidx.media3.common.C.TIME_UNSET;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            if (j >= 0) {
                jMax = java.lang.Math.min(this.durationUs, j);
            } else {
                jMax = java.lang.Math.max(0L, this.durationUs + j);
            }
        }
        this.startOffsetUs = jMax;
        this.hasPositiveStartOffset = j >= 0;
        this.serverControl = serverControl;
    }

    public boolean isNewerThan(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist == null) {
            return true;
        }
        long j = this.mediaSequence;
        long j2 = hlsMediaPlaylist.mediaSequence;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.segments.size() - hlsMediaPlaylist.segments.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.trailingParts.size();
        int size3 = hlsMediaPlaylist.trailingParts.size();
        if (size2 <= size3) {
            return size2 == size3 && this.hasEndTag && !hlsMediaPlaylist.hasEndTag;
        }
        return true;
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist copyWith(long j, int i) {
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }
}
