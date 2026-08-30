package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private final androidx.media3.datasource.DataSource encryptionDataSource;
    private android.net.Uri expectedPlaylistUrl;
    private final androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
    private java.io.IOException fatalError;
    private boolean independentSegments;
    private boolean isPrimaryTimestampSource;
    private final androidx.media3.datasource.DataSource mediaDataSource;
    private final java.util.List<androidx.media3.common.Format> muxedCaptionFormats;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final androidx.media3.common.Format[] playlistFormats;
    private final androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final android.net.Uri[] playlistUrls;
    private boolean seenExpectedPlaylistError;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final androidx.media3.exoplayer.hls.TimestampAdjusterProvider timestampAdjusterProvider;
    private final androidx.media3.common.TrackGroup trackGroup;
    private androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection;
    private long lastChunkRequestRealtimeMs = androidx.media3.common.C.TIME_UNSET;
    private final androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache keyCache = new androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache(4);
    private byte[] scratchSpace = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    private long liveEdgeInPeriodTimeUs = androidx.media3.common.C.TIME_UNSET;

    public static final class HlsChunkHolder {
        public androidx.media3.exoplayer.source.chunk.Chunk chunk;
        public boolean endOfStream;
        public android.net.Uri playlistUrl;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }
    }

    public HlsChunkSource(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker hlsPlaylistTracker, android.net.Uri[] uriArr, androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.hls.TimestampAdjusterProvider timestampAdjusterProvider, long j, java.util.List<androidx.media3.common.Format> list, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.playlistUrls = uriArr;
        this.playlistFormats = formatArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.timestampAdjusterInitializationTimeoutMs = j;
        this.muxedCaptionFormats = list;
        this.playerId = playerId;
        this.cmcdConfiguration = cmcdConfiguration;
        androidx.media3.datasource.DataSource dataSourceCreateDataSource = hlsDataSourceFactory.createDataSource(1);
        this.mediaDataSource = dataSourceCreateDataSource;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new androidx.media3.common.TrackGroup(formatArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((formatArr[i].roleFlags & 16384) == 0) {
                arrayList.add(java.lang.Integer.valueOf(i));
            }
        }
        this.trackSelection = new androidx.media3.exoplayer.hls.HlsChunkSource.InitializationTrackSelection(this.trackGroup, com.google.common.primitives.Ints.toArray(arrayList));
    }

    public void maybeThrowError() throws java.io.IOException {
        java.io.IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        android.net.Uri uri = this.expectedPlaylistUrl;
        if (uri == null || !this.seenExpectedPlaylistError) {
            return;
        }
        this.playlistTracker.maybeThrowPlaylistRefreshError(uri);
    }

    public androidx.media3.common.TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public boolean hasIndependentSegments() {
        return this.independentSegments;
    }

    public void setTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        deactivatePlaylistForSelectedTrack();
        this.trackSelection = exoTrackSelection;
    }

    public androidx.media3.exoplayer.trackselection.ExoTrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public void reset() {
        deactivatePlaylistForSelectedTrack();
        this.fatalError = null;
    }

    public void setIsPrimaryTimestampSource(boolean z) {
        this.isPrimaryTimestampSource = z;
    }

    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        int selectedIndex = this.trackSelection.getSelectedIndex();
        android.net.Uri[] uriArr = this.playlistUrls;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : this.playlistTracker.getPlaylistSnapshot(uriArr[this.trackSelection.getSelectedIndexInTrackGroup()], true);
        if (playlistSnapshot == null || playlistSnapshot.segments.isEmpty() || !playlistSnapshot.hasIndependentSegments) {
            return j;
        }
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j2 = j - initialStartTimeUs;
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor((java.util.List<? extends java.lang.Comparable<? super java.lang.Long>>) playlistSnapshot.segments, java.lang.Long.valueOf(j2), true, true);
        long j3 = playlistSnapshot.segments.get(iBinarySearchFloor).relativeStartTimeUs;
        return seekParameters.resolveSeekPositionUs(j2, j3, iBinarySearchFloor != playlistSnapshot.segments.size() - 1 ? playlistSnapshot.segments.get(iBinarySearchFloor + 1).relativeStartTimeUs : j3) + initialStartTimeUs;
    }

    public int getChunkPublicationState(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list;
        if (hlsMediaChunk.partIndex == -1) {
            return 1;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) androidx.media3.common.util.Assertions.checkNotNull(this.playlistTracker.getPlaylistSnapshot(this.playlistUrls[this.trackGroup.indexOf(hlsMediaChunk.trackFormat)], false));
        int i = (int) (hlsMediaChunk.chunkIndex - hlsMediaPlaylist.mediaSequence);
        if (i < 0) {
            return 1;
        }
        if (i < hlsMediaPlaylist.segments.size()) {
            list = hlsMediaPlaylist.segments.get(i).parts;
        } else {
            list = hlsMediaPlaylist.trailingParts;
        }
        if (hlsMediaChunk.partIndex >= list.size()) {
            return 2;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = list.get(hlsMediaChunk.partIndex);
        if (part.isPreload) {
            return 0;
        }
        return androidx.media3.common.util.Util.areEqual(android.net.Uri.parse(androidx.media3.common.util.UriUtil.resolve(hlsMediaPlaylist.baseUri, part.url)), hlsMediaChunk.dataSpec.uri) ? 1 : 2;
    }

    public void getNextChunk(androidx.media3.exoplayer.LoadingInfo loadingInfo, long j, java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> list, boolean z, androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder hlsChunkHolder) {
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist;
        int i;
        long initialStartTimeUs;
        android.net.Uri uri;
        androidx.media3.exoplayer.upstream.CmcdData.Factory objectType;
        long j2;
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = list.isEmpty() ? null : (androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.common.collect.Iterables.getLast(list);
        int iIndexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        long j3 = loadingInfo.playbackPositionUs;
        long jMax = j - j3;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j3);
        if (hlsMediaChunk != null && !this.independentSegments) {
            long durationUs = hlsMediaChunk.getDurationUs();
            jMax = java.lang.Math.max(0L, jMax - durationUs);
            if (jResolveTimeToLiveEdgeUs != androidx.media3.common.C.TIME_UNSET) {
                jResolveTimeToLiveEdgeUs = java.lang.Math.max(0L, jResolveTimeToLiveEdgeUs - durationUs);
            }
        }
        long j4 = jResolveTimeToLiveEdgeUs;
        long j5 = jMax;
        this.trackSelection.updateSelectedTrack(j3, j5, j4, list, createMediaChunkIterators(hlsMediaChunk, j));
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z2 = iIndexOf != selectedIndexInTrackGroup;
        android.net.Uri uri2 = this.playlistUrls[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(uri2)) {
            hlsChunkHolder.playlistUrl = uri2;
            this.seenExpectedPlaylistError &= uri2.equals(this.expectedPlaylistUrl);
            this.expectedPlaylistUrl = uri2;
            return;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri2, true);
        androidx.media3.common.util.Assertions.checkNotNull(playlistSnapshot);
        this.independentSegments = playlistSnapshot.hasIndependentSegments;
        updateLiveEdgeTimeUs(playlistSnapshot);
        long initialStartTimeUs2 = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        int i2 = iIndexOf;
        android.util.Pair<java.lang.Long, java.lang.Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, z2, playlistSnapshot, initialStartTimeUs2, j);
        long jLongValue = ((java.lang.Long) nextMediaSequenceAndPartIndex.first).longValue();
        int iIntValue = ((java.lang.Integer) nextMediaSequenceAndPartIndex.second).intValue();
        if (jLongValue >= playlistSnapshot.mediaSequence || hlsMediaChunk == null || !z2) {
            hlsMediaPlaylist = playlistSnapshot;
            i = selectedIndexInTrackGroup;
            initialStartTimeUs = initialStartTimeUs2;
            uri = uri2;
        } else {
            android.net.Uri uri3 = this.playlistUrls[i2];
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot2 = this.playlistTracker.getPlaylistSnapshot(uri3, true);
            androidx.media3.common.util.Assertions.checkNotNull(playlistSnapshot2);
            initialStartTimeUs = playlistSnapshot2.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            android.util.Pair<java.lang.Long, java.lang.Integer> nextMediaSequenceAndPartIndex2 = getNextMediaSequenceAndPartIndex(hlsMediaChunk, false, playlistSnapshot2, initialStartTimeUs, j);
            jLongValue = ((java.lang.Long) nextMediaSequenceAndPartIndex2.first).longValue();
            iIntValue = ((java.lang.Integer) nextMediaSequenceAndPartIndex2.second).intValue();
            i = i2;
            uri = uri3;
            hlsMediaPlaylist = playlistSnapshot2;
        }
        if (i != i2 && i2 != -1) {
            this.playlistTracker.deactivatePlaylistForPlayback(this.playlistUrls[i2]);
        }
        if (jLongValue < hlsMediaPlaylist.mediaSequence) {
            this.fatalError = new androidx.media3.exoplayer.source.BehindLiveWindowException();
            return;
        }
        androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder nextSegmentHolder = getNextSegmentHolder(hlsMediaPlaylist, jLongValue, iIntValue);
        if (nextSegmentHolder == null) {
            if (!hlsMediaPlaylist.hasEndTag) {
                hlsChunkHolder.playlistUrl = uri;
                this.seenExpectedPlaylistError &= uri.equals(this.expectedPlaylistUrl);
                this.expectedPlaylistUrl = uri;
                return;
            } else {
                if (z || hlsMediaPlaylist.segments.isEmpty()) {
                    hlsChunkHolder.endOfStream = true;
                    return;
                }
                nextSegmentHolder = new androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase) com.google.common.collect.Iterables.getLast(hlsMediaPlaylist.segments), (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())) - 1, -1);
            }
        }
        this.seenExpectedPlaylistError = false;
        this.expectedPlaylistUrl = null;
        if (this.cmcdConfiguration != null) {
            objectType = new androidx.media3.exoplayer.upstream.CmcdData.Factory(this.cmcdConfiguration, this.trackSelection, java.lang.Math.max(0L, j5), loadingInfo.playbackSpeed, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, !hlsMediaPlaylist.hasEndTag, loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs), list.isEmpty()).setObjectType(getIsMuxedAudioAndVideo() ? androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO : androidx.media3.exoplayer.upstream.CmcdData.Factory.getObjectType(this.trackSelection));
            if (nextSegmentHolder.partIndex == -1) {
                j2 = nextSegmentHolder.mediaSequence + 1;
            } else {
                j2 = nextSegmentHolder.mediaSequence;
            }
            androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder nextSegmentHolder2 = getNextSegmentHolder(hlsMediaPlaylist, j2, nextSegmentHolder.partIndex == -1 ? -1 : nextSegmentHolder.partIndex + 1);
            if (nextSegmentHolder2 != null) {
                objectType.setNextObjectRequest(androidx.media3.common.util.UriUtil.getRelativePath(androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, nextSegmentHolder.segmentBase.url), androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, nextSegmentHolder2.segmentBase.url)));
                java.lang.String str = nextSegmentHolder2.segmentBase.byteRangeOffset + "-";
                if (nextSegmentHolder2.segmentBase.byteRangeLength != -1) {
                    str = str + (nextSegmentHolder2.segmentBase.byteRangeOffset + nextSegmentHolder2.segmentBase.byteRangeLength);
                }
                objectType.setNextRangeRequest(str);
            } else {
                hlsMediaChunk = hlsMediaChunk;
            }
        } else {
            hlsMediaChunk = hlsMediaChunk;
            objectType = null;
        }
        this.lastChunkRequestRealtimeMs = android.os.SystemClock.elapsedRealtime();
        android.net.Uri fullEncryptionKeyUri = getFullEncryptionKeyUri(hlsMediaPlaylist, nextSegmentHolder.segmentBase.initializationSegment);
        hlsChunkHolder.chunk = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri, i, true, objectType);
        if (hlsChunkHolder.chunk != null) {
            return;
        }
        android.net.Uri fullEncryptionKeyUri2 = getFullEncryptionKeyUri(hlsMediaPlaylist, nextSegmentHolder.segmentBase);
        hlsChunkHolder.chunk = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri2, i, false, objectType);
        if (hlsChunkHolder.chunk != null) {
            return;
        }
        boolean zShouldSpliceIn = androidx.media3.exoplayer.hls.HlsMediaChunk.shouldSpliceIn(hlsMediaChunk, uri, hlsMediaPlaylist, nextSegmentHolder, initialStartTimeUs);
        if (zShouldSpliceIn && nextSegmentHolder.isPreload) {
            return;
        }
        hlsChunkHolder.chunk = androidx.media3.exoplayer.hls.HlsMediaChunk.createInstance(this.extractorFactory, this.mediaDataSource, this.playlistFormats[i], initialStartTimeUs, hlsMediaPlaylist, nextSegmentHolder, uri, this.muxedCaptionFormats, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.isPrimaryTimestampSource, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, hlsMediaChunk, this.keyCache.get(fullEncryptionKeyUri2), this.keyCache.get(fullEncryptionKeyUri), zShouldSpliceIn, this.playerId, objectType);
    }

    private boolean getIsMuxedAudioAndVideo() {
        androidx.media3.common.Format format = this.trackGroup.getFormat(this.trackSelection.getSelectedIndex());
        return (androidx.media3.common.MimeTypes.getAudioMediaMimeType(format.codecs) == null || androidx.media3.common.MimeTypes.getVideoMediaMimeType(format.codecs) == null) ? false : true;
    }

    private static androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder getNextSegmentHolder(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j, int i) {
        int i2 = (int) (j - hlsMediaPlaylist.mediaSequence);
        if (i2 == hlsMediaPlaylist.segments.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < hlsMediaPlaylist.trailingParts.size()) {
                return new androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(i), j, i);
            }
            return null;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i2);
        if (i == -1) {
            return new androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder(segment, j, -1);
        }
        if (i < segment.parts.size()) {
            return new androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder(segment.parts.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < hlsMediaPlaylist.segments.size()) {
            return new androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder(hlsMediaPlaylist.segments.get(i3), j + 1, -1);
        }
        if (hlsMediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(0), j + 1, 0);
    }

    public void onChunkLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        if (chunk instanceof androidx.media3.exoplayer.hls.HlsChunkSource.EncryptionKeyChunk) {
            androidx.media3.exoplayer.hls.HlsChunkSource.EncryptionKeyChunk encryptionKeyChunk = (androidx.media3.exoplayer.hls.HlsChunkSource.EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            this.keyCache.put(encryptionKeyChunk.dataSpec.uri, (byte[]) androidx.media3.common.util.Assertions.checkNotNull(encryptionKeyChunk.getResult()));
        }
    }

    public boolean maybeExcludeTrack(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j) {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), j);
    }

    public boolean onPlaylistError(android.net.Uri uri, long j) {
        int iIndexOf;
        int i = 0;
        while (true) {
            android.net.Uri[] uriArr = this.playlistUrls;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iIndexOf = this.trackSelection.indexOf(i)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError |= uri.equals(this.expectedPlaylistUrl);
        return j == androidx.media3.common.C.TIME_UNSET || (this.trackSelection.excludeTrack(iIndexOf, j) && this.playlistTracker.excludeMediaPlaylist(uri, j));
    }

    public androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] createMediaChunkIterators(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk, long j) {
        int i;
        int iIndexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        int length = this.trackSelection.length();
        androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr = new androidx.media3.exoplayer.source.chunk.MediaChunkIterator[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(i2);
            android.net.Uri uri = this.playlistUrls[indexInTrackGroup];
            if (!this.playlistTracker.isSnapshotValid(uri)) {
                mediaChunkIteratorArr[i2] = androidx.media3.exoplayer.source.chunk.MediaChunkIterator.EMPTY;
                i = i2;
            } else {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, z);
                androidx.media3.common.util.Assertions.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                i = i2;
                android.util.Pair<java.lang.Long, java.lang.Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, indexInTrackGroup != iIndexOf ? true : z, playlistSnapshot, initialStartTimeUs, j);
                mediaChunkIteratorArr[i] = new androidx.media3.exoplayer.hls.HlsChunkSource.HlsMediaPlaylistSegmentIterator(playlistSnapshot.baseUri, initialStartTimeUs, getSegmentBaseList(playlistSnapshot, ((java.lang.Long) nextMediaSequenceAndPartIndex.first).longValue(), ((java.lang.Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            }
            i2 = i + 1;
            z = false;
        }
        return mediaChunkIteratorArr;
    }

    public int getPreferredQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    public boolean shouldCancelLoad(long j, androidx.media3.exoplayer.source.chunk.Chunk chunk, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    static java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase> getSegmentBaseList(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j, int i) {
        int i2 = (int) (j - hlsMediaPlaylist.mediaSequence);
        if (i2 < 0 || hlsMediaPlaylist.segments.size() < i2) {
            return com.google.common.collect.ImmutableList.of();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i2 < hlsMediaPlaylist.segments.size()) {
            if (i != -1) {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i2);
                if (i == 0) {
                    arrayList.add(segment);
                } else if (i < segment.parts.size()) {
                    arrayList.addAll(segment.parts.subList(i, segment.parts.size()));
                }
                i2++;
            }
            arrayList.addAll(hlsMediaPlaylist.segments.subList(i2, hlsMediaPlaylist.segments.size()));
            i = 0;
        }
        if (hlsMediaPlaylist.partTargetDurationUs != androidx.media3.common.C.TIME_UNSET) {
            int i3 = i != -1 ? i : 0;
            if (i3 < hlsMediaPlaylist.trailingParts.size()) {
                arrayList.addAll(hlsMediaPlaylist.trailingParts.subList(i3, hlsMediaPlaylist.trailingParts.size()));
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public boolean obtainsChunksForPlaylist(android.net.Uri uri) {
        return androidx.media3.common.util.Util.contains(this.playlistUrls, uri);
    }

    private android.util.Pair<java.lang.Long, java.lang.Integer> getNextMediaSequenceAndPartIndex(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk, boolean z, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j, long j2) {
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list;
        long nextChunkIndex;
        int i = -1;
        if (hlsMediaChunk == null || z) {
            long j3 = hlsMediaPlaylist.durationUs + j;
            if (hlsMediaChunk != null && !this.independentSegments) {
                j2 = hlsMediaChunk.startTimeUs;
            }
            if (!hlsMediaPlaylist.hasEndTag && j2 >= j3) {
                return new android.util.Pair<>(java.lang.Long.valueOf(hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())), -1);
            }
            long j4 = j2 - j;
            int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor((java.util.List<? extends java.lang.Comparable<? super java.lang.Long>>) hlsMediaPlaylist.segments, java.lang.Long.valueOf(j4), true, !this.playlistTracker.isLive() || hlsMediaChunk == null);
            long j5 = ((long) iBinarySearchFloor) + hlsMediaPlaylist.mediaSequence;
            if (iBinarySearchFloor >= 0) {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(iBinarySearchFloor);
                if (j4 < segment.relativeStartTimeUs + segment.durationUs) {
                    list = segment.parts;
                } else {
                    list = hlsMediaPlaylist.trailingParts;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = list.get(i2);
                    if (j4 < part.relativeStartTimeUs + part.durationUs) {
                        if (!part.isIndependent) {
                            break;
                        }
                        j5 += list == hlsMediaPlaylist.trailingParts ? 1L : 0L;
                        i = i2;
                        break;
                    }
                }
            }
            return new android.util.Pair<>(java.lang.Long.valueOf(j5), java.lang.Integer.valueOf(i));
        }
        if (hlsMediaChunk.isLoadCompleted()) {
            if (hlsMediaChunk.partIndex == -1) {
                nextChunkIndex = hlsMediaChunk.getNextChunkIndex();
            } else {
                nextChunkIndex = hlsMediaChunk.chunkIndex;
            }
            return new android.util.Pair<>(java.lang.Long.valueOf(nextChunkIndex), java.lang.Integer.valueOf(hlsMediaChunk.partIndex != -1 ? hlsMediaChunk.partIndex + 1 : -1));
        }
        return new android.util.Pair<>(java.lang.Long.valueOf(hlsMediaChunk.chunkIndex), java.lang.Integer.valueOf(hlsMediaChunk.partIndex));
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        long j2 = this.liveEdgeInPeriodTimeUs;
        return (j2 > androidx.media3.common.C.TIME_UNSET ? 1 : (j2 == androidx.media3.common.C.TIME_UNSET ? 0 : -1)) != 0 ? j2 - j : androidx.media3.common.C.TIME_UNSET;
    }

    private void updateLiveEdgeTimeUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? androidx.media3.common.C.TIME_UNSET : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    private androidx.media3.exoplayer.source.chunk.Chunk maybeCreateEncryptionChunkFor(android.net.Uri uri, int i, boolean z, androidx.media3.exoplayer.upstream.CmcdData.Factory factory) {
        if (uri == null) {
            return null;
        }
        byte[] bArrRemove = this.keyCache.remove(uri);
        if (bArrRemove != null) {
            this.keyCache.put(uri, bArrRemove);
            return null;
        }
        androidx.media3.datasource.DataSpec dataSpecBuild = new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setFlags(1).build();
        if (factory != null) {
            if (z) {
                factory.setObjectType(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            }
            dataSpecBuild = factory.createCmcdData().addToDataSpec(dataSpecBuild);
        }
        return new androidx.media3.exoplayer.hls.HlsChunkSource.EncryptionKeyChunk(this.encryptionDataSource, dataSpecBuild, this.playlistFormats[i], this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.scratchSpace);
    }

    private static android.net.Uri getFullEncryptionKeyUri(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase) {
        if (segmentBase == null || segmentBase.fullSegmentEncryptionKeyUri == null) {
            return null;
        }
        return androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.fullSegmentEncryptionKeyUri);
    }

    private void deactivatePlaylistForSelectedTrack() {
        this.playlistTracker.deactivatePlaylistForPlayback(this.playlistUrls[this.trackSelection.getSelectedIndexInTrackGroup()]);
    }

    static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase, long j, int i) {
            this.segmentBase = segmentBase;
            this.mediaSequence = j;
            this.partIndex = i;
            this.isPreload = (segmentBase instanceof androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) && ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) segmentBase).isPreload;
        }
    }

    private static final class InitializationTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {
        private int selectedIndex;

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public java.lang.Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        public InitializationTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(iArr[0]));
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (isTrackExcluded(this.selectedIndex, jElapsedRealtime)) {
                for (int i = this.length - 1; i >= 0; i--) {
                    if (!isTrackExcluded(i, jElapsedRealtime)) {
                        this.selectedIndex = i;
                        return;
                    }
                }
                throw new java.lang.IllegalStateException();
            }
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }
    }

    private static final class EncryptionKeyChunk extends androidx.media3.exoplayer.source.chunk.DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i, java.lang.Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i, obj, bArr);
        }

        @Override // androidx.media3.exoplayer.source.chunk.DataChunk
        protected void consume(byte[] bArr, int i) {
            this.result = java.util.Arrays.copyOf(bArr, i);
        }

        public byte[] getResult() {
            return this.result;
        }
    }

    static final class HlsMediaPlaylistSegmentIterator extends androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator {
        private final java.lang.String playlistBaseUri;
        private final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.playlistBaseUri = str;
            this.startOfPlaylistInPeriodUs = j;
            this.segmentBases = list;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public androidx.media3.datasource.DataSpec getDataSpec() {
            checkInBounds();
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return new androidx.media3.datasource.DataSpec(androidx.media3.common.util.UriUtil.resolveToUri(this.playlistBaseUri, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.startOfPlaylistInPeriodUs + this.segmentBases.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return this.startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }
    }
}
