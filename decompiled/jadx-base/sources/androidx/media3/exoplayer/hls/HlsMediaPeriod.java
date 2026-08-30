package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener {
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private androidx.media3.exoplayer.source.SequenceableLoader compositeSequenceableLoader;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final androidx.media3.exoplayer.hls.HlsDataSourceFactory dataSourceFactory;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.source.MediaPeriod.Callback mediaPeriodCallback;
    private final androidx.media3.datasource.TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new androidx.media3.exoplayer.hls.HlsMediaPeriod.SampleStreamWrapperCallback();
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.SampleStream, java.lang.Integer> streamWrapperIndices = new java.util.IdentityHashMap<>();
    private final androidx.media3.exoplayer.hls.TimestampAdjusterProvider timestampAdjusterProvider = new androidx.media3.exoplayer.hls.TimestampAdjusterProvider();
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] sampleStreamWrappers = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[0];
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    static /* synthetic */ int access$106(androidx.media3.exoplayer.hls.HlsMediaPeriod hlsMediaPeriod) {
        int i = hlsMediaPeriod.pendingPrepareCount - 1;
        hlsMediaPeriod.pendingPrepareCount = i;
        return i;
    }

    public HlsMediaPeriod(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker hlsPlaylistTracker, androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z, int i, boolean z2, androidx.media3.exoplayer.analytics.PlayerId playerId, long j) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return (androidx.media3.exoplayer.source.TrackGroupArray) androidx.media3.common.util.Assertions.checkNotNull(this.trackGroups);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        int[] iArr;
        androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        androidx.media3.exoplayer.hls.HlsMediaPeriod hlsMediaPeriod = this;
        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist = (androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) androidx.media3.common.util.Assertions.checkNotNull(hlsMediaPeriod.playlistTracker.getMultivariantPlaylist());
        boolean z = !hlsMultivariantPlaylist.variants.isEmpty();
        int length = hlsMediaPeriod.sampleStreamWrappers.length - hlsMultivariantPlaylist.subtitles.size();
        int i = 0;
        if (z) {
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.sampleStreamWrappers[0];
            iArr = hlsMediaPeriod.manifestUrlIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        } else {
            iArr = new int[0];
            trackGroups = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : list) {
            androidx.media3.common.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z;
                while (true) {
                    androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i2 = r15 < length ? 1 : 2;
                        int[] iArr2 = hlsMediaPeriod.manifestUrlIndicesPerWrapper[r15];
                        for (int i3 = 0; i3 < exoTrackSelection.length(); i3++) {
                            arrayList.add(new androidx.media3.common.StreamKey(i2, iArr2[exoTrackSelection.getIndexInTrackGroup(i3)]));
                        }
                        break;
                    }
                    hlsMediaPeriod = this;
                    r15++;
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i4 = i; i4 < exoTrackSelection.length(); i4++) {
                    arrayList.add(new androidx.media3.common.StreamKey(i, iArr[exoTrackSelection.getIndexInTrackGroup(i4)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
            hlsMediaPeriod = this;
            i = 0;
        }
        if (z2 && !z3) {
            int i5 = iArr[0];
            int i6 = hlsMultivariantPlaylist.variants.get(iArr[0]).format.bitrate;
            for (int i7 = 1; i7 < iArr.length; i7++) {
                int i8 = hlsMultivariantPlaylist.variants.get(iArr[i7]).format.bitrate;
                if (i8 < i6) {
                    i5 = iArr[i7];
                    i6 = i8;
                }
            }
            arrayList.add(new androidx.media3.common.StreamKey(0, i5));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr2[i];
            iArr[i] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i] = -1;
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                androidx.media3.common.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int i2 = 0;
                while (true) {
                    androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i2 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i2].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = exoTrackSelectionArr.length;
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr3 = new androidx.media3.exoplayer.source.SampleStream[length];
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr4 = new androidx.media3.exoplayer.source.SampleStream[exoTrackSelectionArr.length];
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr2 = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[exoTrackSelectionArr.length];
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.sampleStreamWrappers.length) {
            for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = null;
                sampleStreamArr4[i5] = iArr[i5] == i4 ? sampleStreamArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    exoTrackSelection2 = exoTrackSelectionArr[i5];
                }
                exoTrackSelectionArr2[i5] = exoTrackSelection2;
            }
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr3 = exoTrackSelectionArr2;
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = hlsSampleStreamWrapperArr2;
            boolean zSelectTracks = hlsSampleStreamWrapper.selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= exoTrackSelectionArr.length) {
                    break;
                }
                androidx.media3.exoplayer.source.SampleStream sampleStream2 = sampleStreamArr4[i9];
                if (iArr2[i9] == i8) {
                    androidx.media3.common.util.Assertions.checkNotNull(sampleStream2);
                    sampleStreamArr3[i9] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, java.lang.Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    androidx.media3.common.util.Assertions.checkState(sampleStream2 == null);
                }
                i9++;
            }
            if (z2) {
                hlsSampleStreamWrapperArr3[i6] = hlsSampleStreamWrapper;
                i3 = i6 + 1;
                if (i6 == 0) {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(true);
                    if (!zSelectTracks) {
                        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr4.length == 0 || hlsSampleStreamWrapper != hlsSampleStreamWrapperArr4[0]) {
                            this.timestampAdjusterProvider.reset();
                            z = true;
                        }
                    } else {
                        this.timestampAdjusterProvider.reset();
                        z = true;
                    }
                } else {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(i8 < this.audioVideoSampleStreamWrapperCount);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            sampleStreamArr2 = sampleStreamArr;
            hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr3;
            length = i7;
            exoTrackSelectionArr2 = exoTrackSelectionArr3;
        }
        java.lang.System.arraycopy(sampleStreamArr3, 0, sampleStreamArr2, 0, length);
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr5 = (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[]) androidx.media3.common.util.Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i3);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr5;
        com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf(hlsSampleStreamWrapperArr5);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(immutableListCopyOf, com.google.common.collect.Lists.transform(immutableListCopyOf, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.hls.HlsMediaPeriod$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.exoplayer.hls.HlsSampleStreamWrapper) obj).getTrackGroups().getTrackTypes();
            }
        }));
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        if (this.trackGroups == null) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
                hlsSampleStreamWrapper.continuePreparing();
            }
            return false;
        }
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j, false);
            int i = 1;
            while (true) {
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i].seekToUs(j, zSeekToUs);
                i++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        boolean zOnPlaylistError = true;
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    private void buildAndPrepareSampleStreamWrappers(long j) {
        java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> mapEmptyMap;
        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist = (androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) androidx.media3.common.util.Assertions.checkNotNull(this.playlistTracker.getMultivariantPlaylist());
        if (this.useSessionKeys) {
            mapEmptyMap = deriveOverridingDrmInitData(hlsMultivariantPlaylist.sessionKeyDrmInitData);
        } else {
            mapEmptyMap = java.util.Collections.emptyMap();
        }
        java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map = mapEmptyMap;
        boolean z = !hlsMultivariantPlaylist.variants.isEmpty();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list = hlsMultivariantPlaylist.audios;
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list2 = hlsMultivariantPlaylist.subtitles;
        this.pendingPrepareCount = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (z) {
            buildAndPrepareMainSampleStreamWrapper(hlsMultivariantPlaylist, j, arrayList, arrayList2, map);
        }
        buildAndPrepareAudioSampleStreamWrappers(j, list, arrayList, arrayList2, map);
        this.audioVideoSampleStreamWrapperCount = arrayList.size();
        int i = 0;
        while (i < list2.size()) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition rendition = list2.get(i);
            java.lang.String str = "subtitle:" + i + ":" + rendition.name;
            androidx.media3.common.Format format = rendition.format;
            java.util.ArrayList arrayList3 = arrayList2;
            int i2 = i;
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str, 3, new android.net.Uri[]{rendition.url}, new androidx.media3.common.Format[]{format}, null, java.util.Collections.emptyList(), map, j);
            arrayList3.add(new int[]{i2});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new androidx.media3.common.TrackGroup[]{new androidx.media3.common.TrackGroup(str, this.extractorFactory.getOutputTextFormat(format))}, 0, new int[0]);
            i = i2 + 1;
            arrayList2 = arrayList3;
        }
        this.sampleStreamWrappers = (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[]) arrayList.toArray(new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[0]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[0][]);
        this.pendingPrepareCount = this.sampleStreamWrappers.length;
        for (int i3 = 0; i3 < this.audioVideoSampleStreamWrapperCount; i3++) {
            this.sampleStreamWrappers[i3].setIsPrimaryTimestampSource(true);
        }
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private void buildAndPrepareMainSampleStreamWrapper(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, long j, java.util.List<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> list, java.util.List<int[]> list2, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int size = hlsMultivariantPlaylist.variants.size();
        int[] iArr = new int[size];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < hlsMultivariantPlaylist.variants.size(); i5++) {
            androidx.media3.common.Format format = hlsMultivariantPlaylist.variants.get(i5).format;
            if (format.height > 0 || androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr[i5] = 2;
                i3++;
            } else if (androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr[i5] = 1;
                i4++;
            } else {
                iArr[i5] = -1;
            }
        }
        if (i3 > 0) {
            i = i3;
            z2 = false;
            z = true;
        } else if (i4 < size) {
            i = size - i4;
            z = false;
            z2 = true;
        } else {
            i = size;
            z = false;
            z2 = false;
        }
        android.net.Uri[] uriArr = new android.net.Uri[i];
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[i];
        int[] iArr2 = new int[i];
        int i6 = 0;
        for (int i7 = 0; i7 < hlsMultivariantPlaylist.variants.size(); i7++) {
            if ((!z || iArr[i7] == 2) && (!z2 || iArr[i7] != 1)) {
                androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = hlsMultivariantPlaylist.variants.get(i7);
                uriArr[i6] = variant.url;
                formatArr[i6] = variant.format;
                iArr2[i6] = i7;
                i6++;
            }
        }
        java.lang.String str = formatArr[0].codecs;
        int codecCountOfType = androidx.media3.common.util.Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = androidx.media3.common.util.Util.getCodecCountOfType(str, 1);
        boolean z3 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && hlsMultivariantPlaylist.audios.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(com.ironsource.y8.h.Z, (z || codecCountOfType2 <= 0) ? 0 : 1, uriArr, formatArr, hlsMultivariantPlaylist.muxedAudioFormat, hlsMultivariantPlaylist.muxedCaptionFormats, map, j);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list2.add(iArr2);
        if (this.allowChunklessPreparation && z3) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (codecCountOfType > 0) {
                androidx.media3.common.Format[] formatArr2 = new androidx.media3.common.Format[i];
                for (int i8 = 0; i8 < i; i8++) {
                    formatArr2[i8] = deriveVideoFormat(formatArr[i8]);
                }
                arrayList.add(new androidx.media3.common.TrackGroup(com.ironsource.y8.h.Z, formatArr2));
                if (codecCountOfType2 > 0 && (hlsMultivariantPlaylist.muxedAudioFormat != null || hlsMultivariantPlaylist.audios.isEmpty())) {
                    arrayList.add(new androidx.media3.common.TrackGroup("main:audio", deriveAudioFormat(formatArr[0], hlsMultivariantPlaylist.muxedAudioFormat, false)));
                }
                java.util.List<androidx.media3.common.Format> list3 = hlsMultivariantPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i9 = 0; i9 < list3.size(); i9++) {
                        arrayList.add(new androidx.media3.common.TrackGroup("main:cc:" + i9, this.extractorFactory.getOutputTextFormat(list3.get(i9))));
                    }
                }
                i2 = 1;
            } else {
                androidx.media3.common.Format[] formatArr3 = new androidx.media3.common.Format[i];
                for (int i10 = 0; i10 < i; i10++) {
                    formatArr3[i10] = deriveAudioFormat(formatArr[i10], hlsMultivariantPlaylist.muxedAudioFormat, true);
                }
                i2 = 1;
                arrayList.add(new androidx.media3.common.TrackGroup(com.ironsource.y8.h.Z, formatArr3));
            }
            androidx.media3.common.Format[] formatArr4 = new androidx.media3.common.Format[i2];
            formatArr4[0] = new androidx.media3.common.Format.Builder().setId("ID3").setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).build();
            androidx.media3.common.TrackGroup trackGroup = new androidx.media3.common.TrackGroup("main:id3", formatArr4);
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((androidx.media3.common.TrackGroup[]) arrayList.toArray(new androidx.media3.common.TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list, java.util.List<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> list2, java.util.List<int[]> list3, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (androidx.media3.common.util.Util.areEqual(str, list.get(i2).name)) {
                        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition rendition = list.get(i2);
                        arrayList3.add(java.lang.Integer.valueOf(i2));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z &= androidx.media3.common.util.Util.getCodecCountOfType(rendition.format.codecs, 1) == 1;
                    }
                }
                java.lang.String str2 = "audio:" + str;
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str2, 1, (android.net.Uri[]) arrayList.toArray((android.net.Uri[]) androidx.media3.common.util.Util.castNonNullTypeArray(new android.net.Uri[0])), (androidx.media3.common.Format[]) arrayList2.toArray(new androidx.media3.common.Format[0]), null, java.util.Collections.emptyList(), map, j);
                list3.add(com.google.common.primitives.Ints.toArray(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new androidx.media3.common.TrackGroup[]{new androidx.media3.common.TrackGroup(str2, (androidx.media3.common.Format[]) arrayList2.toArray(new androidx.media3.common.Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper buildSampleStreamWrapper(java.lang.String str, int i, android.net.Uri[] uriArr, androidx.media3.common.Format[] formatArr, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map, long j) {
        return new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper(str, i, this.sampleStreamWrapperCallback, new androidx.media3.exoplayer.hls.HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration), map, this.allocator, j, format, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    private static java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> deriveOverridingDrmInitData(java.util.List<androidx.media3.common.DrmInitData> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            androidx.media3.common.DrmInitData drmInitDataMerge = list.get(i);
            java.lang.String str = drmInitDataMerge.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                androidx.media3.common.DrmInitData drmInitData = (androidx.media3.common.DrmInitData) arrayList.get(i2);
                if (android.text.TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static androidx.media3.common.Format deriveVideoFormat(androidx.media3.common.Format format) {
        java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 2);
        return new androidx.media3.common.Format.Builder().setId(format.id).setLabel(format.label).setLabels(format.labels).setContainerMimeType(format.containerMimeType).setSampleMimeType(androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).build();
    }

    private static androidx.media3.common.Format deriveAudioFormat(androidx.media3.common.Format format, androidx.media3.common.Format format2, boolean z) {
        androidx.media3.common.Metadata metadata;
        int i;
        java.lang.String str;
        int i2;
        int i3;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<androidx.media3.common.Label> list;
        java.util.List<androidx.media3.common.Label> listOf = com.google.common.collect.ImmutableList.of();
        if (format2 != null) {
            str3 = format2.codecs;
            metadata = format2.metadata;
            i2 = format2.channelCount;
            i = format2.selectionFlags;
            i3 = format2.roleFlags;
            str = format2.language;
            str2 = format2.label;
            list = format2.labels;
        } else {
            java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z) {
                i2 = format.channelCount;
                i = format.selectionFlags;
                i3 = format.roleFlags;
                str = format.language;
                str2 = format.label;
                listOf = format.labels;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            java.util.List<androidx.media3.common.Label> list2 = listOf;
            str3 = codecsOfType;
            list = list2;
        }
        return new androidx.media3.common.Format.Builder().setId(format.id).setLabel(str2).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(androidx.media3.common.MimeTypes.getMediaMimeType(str3)).setCodecs(str3).setMetadata(metadata).setAverageBitrate(z ? format.averageBitrate : -1).setPeakBitrate(z ? format.peakBitrate : -1).setChannelCount(i2).setSelectionFlags(i).setRoleFlags(i3).setLanguage(str).build();
    }

    private class SampleStreamWrapperCallback implements androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback {
        private SampleStreamWrapperCallback() {
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (androidx.media3.exoplayer.hls.HlsMediaPeriod.access$106(androidx.media3.exoplayer.hls.HlsMediaPeriod.this) > 0) {
                return;
            }
            int i = 0;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : androidx.media3.exoplayer.hls.HlsMediaPeriod.this.sampleStreamWrappers) {
                i += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[i];
            int i2 = 0;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper2 : androidx.media3.exoplayer.hls.HlsMediaPeriod.this.sampleStreamWrappers) {
                int i3 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i4 = 0;
                while (i4 < i3) {
                    trackGroupArr[i2] = hlsSampleStreamWrapper2.getTrackGroups().get(i4);
                    i4++;
                    i2++;
                }
            }
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.trackGroups = new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr);
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.mediaPeriodCallback.onPrepared(androidx.media3.exoplayer.hls.HlsMediaPeriod.this);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(android.net.Uri uri) {
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.mediaPeriodCallback.onContinueLoadingRequested(androidx.media3.exoplayer.hls.HlsMediaPeriod.this);
        }
    }
}
