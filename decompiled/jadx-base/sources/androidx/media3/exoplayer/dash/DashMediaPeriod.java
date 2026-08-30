package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
final class DashMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>>, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<androidx.media3.exoplayer.dash.DashChunkSource> {
    private static final java.util.regex.Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = java.util.regex.Pattern.compile("CC([1-4])=(.+)");
    private static final java.util.regex.Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = java.util.regex.Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList;
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private final androidx.media3.exoplayer.dash.DashChunkSource.Factory chunkSourceFactory;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private androidx.media3.exoplayer.source.SequenceableLoader compositeSequenceableLoader;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> eventStreams;
    final int id;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.dash.manifest.DashManifest manifest;
    private final androidx.media3.exoplayer.upstream.LoaderErrorThrower manifestLoaderErrorThrower;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final androidx.media3.exoplayer.dash.PlayerEmsgHandler playerEmsgHandler;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfos;
    private final androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final androidx.media3.datasource.TransferListener transferListener;
    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private androidx.media3.exoplayer.dash.EventSampleStream[] eventSampleStreams = new androidx.media3.exoplayer.dash.EventSampleStream[0];
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream = new java.util.IdentityHashMap<>();

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    public DashMediaPeriod(int i, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList, int i2, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, long j, androidx.media3.exoplayer.upstream.LoaderErrorThrower loaderErrorThrower, androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.id = i;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.periodIndex = i2;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.elapsedRealtimeOffsetMs = j;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.playerId = playerId;
        this.playerEmsgHandler = new androidx.media3.exoplayer.dash.PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        androidx.media3.exoplayer.dash.manifest.Period period = dashManifest.getPeriod(i2);
        this.eventStreams = period.eventStreams;
        android.util.Pair<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[]> pairBuildTrackGroups = buildTrackGroups(drmSessionManager, factory, period.adaptationSets, this.eventStreams);
        this.trackGroups = (androidx.media3.exoplayer.source.TrackGroupArray) pairBuildTrackGroups.first;
        this.trackGroupInfos = (androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[]) pairBuildTrackGroups.second;
    }

    public void updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, int i) {
        this.manifest = dashManifest;
        this.periodIndex = i;
        this.playerEmsgHandler.updateManifest(dashManifest);
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] chunkSampleStreamArr = this.sampleStreams;
        if (chunkSampleStreamArr != null) {
            for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                ((androidx.media3.exoplayer.dash.DashChunkSource) chunkSampleStream.getChunkSource()).updateManifest(dashManifest, i);
            }
            this.callback.onContinueLoadingRequested(this);
        }
        this.eventStreams = dashManifest.getPeriod(i).eventStreams;
        for (androidx.media3.exoplayer.dash.EventSampleStream eventSampleStream : this.eventSampleStreams) {
            for (androidx.media3.exoplayer.dash.manifest.EventStream eventStream : this.eventStreams) {
                if (eventStream.id().equals(eventSampleStream.eventStreamId())) {
                    eventSampleStream.updateEventStream(eventStream, dashManifest.dynamic && i == dashManifest.getPeriodCount() - 1);
                    break;
                }
            }
        }
    }

    public void release() {
        this.playerEmsgHandler.release();
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release(this);
        }
        this.callback = null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback
    public synchronized void onSampleStreamReleased(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream) {
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerRemove = this.trackEmsgHandlerBySampleStream.remove(chunkSampleStream);
        if (playerTrackEmsgHandlerRemove != null) {
            playerTrackEmsgHandlerRemove.release();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list2 = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : list) {
            androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo = this.trackGroupInfos[this.trackGroups.indexOf(exoTrackSelection.getTrackGroup())];
            if (trackGroupInfo.trackGroupCategory == 0) {
                int[] iArr = trackGroupInfo.adaptationSetIndices;
                int length = exoTrackSelection.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < exoTrackSelection.length(); i++) {
                    iArr2[i] = exoTrackSelection.getIndexInTrackGroup(i);
                }
                java.util.Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).representations.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr2[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = list2.get(iArr[i2]).representations.size();
                            i3 = i6;
                        }
                    }
                    arrayList.add(new androidx.media3.common.StreamKey(this.periodIndex, iArr[i2], i5 - i3));
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] streamIndexToTrackGroupIndex = getStreamIndexToTrackGroupIndex(exoTrackSelectionArr);
        releaseDisabledStreams(exoTrackSelectionArr, zArr, sampleStreamArr);
        releaseOrphanEmbeddedStreams(exoTrackSelectionArr, sampleStreamArr, streamIndexToTrackGroupIndex);
        selectNewStreams(exoTrackSelectionArr, sampleStreamArr, zArr2, j, streamIndexToTrackGroupIndex);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (androidx.media3.exoplayer.source.SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream) {
                arrayList.add((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof androidx.media3.exoplayer.dash.EventSampleStream) {
                arrayList2.add((androidx.media3.exoplayer.dash.EventSampleStream) sampleStream);
            }
        }
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        androidx.media3.exoplayer.dash.EventSampleStream[] eventSampleStreamArr = new androidx.media3.exoplayer.dash.EventSampleStream[arrayList2.size()];
        this.eventSampleStreams = eventSampleStreamArr;
        arrayList2.toArray(eventSampleStreamArr);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, com.google.common.collect.Lists.transform(arrayList, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.dash.DashMediaPeriod$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) obj).primaryTrackType));
            }
        }));
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
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
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j);
        }
        for (androidx.media3.exoplayer.dash.EventSampleStream eventSampleStream : this.eventSampleStreams) {
            eventSampleStream.seekToUs(j);
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }

    private int[] getStreamIndexToTrackGroupIndex(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                iArr[i] = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    private void releaseDisabledStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (exoTrackSelectionArr[i] == null || !zArr[i]) {
                androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream) {
                    ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStream).release(this);
                } else if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) {
                    ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) sampleStream).release();
                }
                sampleStreamArr[i] = null;
            }
        }
    }

    private void releaseOrphanEmbeddedStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i];
            if ((sampleStream instanceof androidx.media3.exoplayer.source.EmptySampleStream) || (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream)) {
                int primaryStreamIndex = getPrimaryStreamIndex(i, iArr);
                if (primaryStreamIndex == -1) {
                    z = sampleStreamArr[i] instanceof androidx.media3.exoplayer.source.EmptySampleStream;
                } else {
                    androidx.media3.exoplayer.source.SampleStream sampleStream2 = sampleStreamArr[i];
                    z = (sampleStream2 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) && ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) sampleStream2).parent == sampleStreamArr[primaryStreamIndex];
                }
                if (!z) {
                    androidx.media3.exoplayer.source.SampleStream sampleStream3 = sampleStreamArr[i];
                    if (sampleStream3 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) {
                        ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) sampleStream3).release();
                    }
                    sampleStreamArr[i] = null;
                }
            }
        }
    }

    private void selectNewStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream == null) {
                    zArr[i] = true;
                    androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo = this.trackGroupInfos[iArr[i]];
                    if (trackGroupInfo.trackGroupCategory == 0) {
                        sampleStreamArr[i] = buildSampleStream(trackGroupInfo, exoTrackSelection, j);
                    } else if (trackGroupInfo.trackGroupCategory == 2) {
                        sampleStreamArr[i] = new androidx.media3.exoplayer.dash.EventSampleStream(this.eventStreams.get(trackGroupInfo.eventStreamGroupIndex), exoTrackSelection.getTrackGroup().getFormat(0), this.manifest.dynamic);
                    }
                } else if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream) {
                    ((androidx.media3.exoplayer.dash.DashChunkSource) ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStream).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo2 = this.trackGroupInfos[iArr[i2]];
                if (trackGroupInfo2.trackGroupCategory == 1) {
                    int primaryStreamIndex = getPrimaryStreamIndex(i2, iArr);
                    if (primaryStreamIndex == -1) {
                        sampleStreamArr[i2] = new androidx.media3.exoplayer.source.EmptySampleStream();
                    } else {
                        sampleStreamArr[i2] = ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStreamArr[primaryStreamIndex]).selectEmbeddedTrack(j, trackGroupInfo2.trackType);
                    }
                }
            }
        }
    }

    private int getPrimaryStreamIndex(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.trackGroupInfos[i2].primaryTrackGroupIndex;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.trackGroupInfos[i5].trackGroupCategory == 0) {
                return i4;
            }
        }
        return -1;
    }

    private static android.util.Pair<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[]> buildTrackGroups(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2) {
        int[][] groupedAdaptationSetIndices = getGroupedAdaptationSetIndices(list);
        int length = groupedAdaptationSetIndices.length;
        boolean[] zArr = new boolean[length];
        androidx.media3.common.Format[][] formatArr = new androidx.media3.common.Format[length][];
        int iIdentifyEmbeddedTracks = identifyEmbeddedTracks(length, list, groupedAdaptationSetIndices, zArr, formatArr) + length + list2.size();
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[iIdentifyEmbeddedTracks];
        androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfoArr = new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[iIdentifyEmbeddedTracks];
        buildManifestEventTrackGroupInfos(list2, trackGroupArr, trackGroupInfoArr, buildPrimaryAndEmbeddedTrackGroupInfos(drmSessionManager, factory, list, groupedAdaptationSetIndices, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return android.util.Pair.create(new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    private static int[][] getGroupedAdaptationSetIndices(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list) {
        androidx.media3.exoplayer.dash.manifest.Descriptor descriptorFindAdaptationSetSwitchingProperty;
        java.lang.Integer num;
        int size = list.size();
        java.util.HashMap mapNewHashMapWithExpectedSize = com.google.common.collect.Maps.newHashMapWithExpectedSize(size);
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        android.util.SparseArray sparseArray = new android.util.SparseArray(size);
        for (int i = 0; i < size; i++) {
            mapNewHashMapWithExpectedSize.put(java.lang.Long.valueOf(list.get(i).id), java.lang.Integer.valueOf(i));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(i2);
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.essentialProperties);
            if (descriptorFindTrickPlayProperty == null) {
                descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.supplementalProperties);
            }
            int iIntValue = (descriptorFindTrickPlayProperty == null || (num = (java.lang.Integer) mapNewHashMapWithExpectedSize.get(java.lang.Long.valueOf(java.lang.Long.parseLong(descriptorFindTrickPlayProperty.value)))) == null) ? i2 : num.intValue();
            if (iIntValue == i2 && (descriptorFindAdaptationSetSwitchingProperty = findAdaptationSetSwitchingProperty(adaptationSet.supplementalProperties)) != null) {
                for (java.lang.String str : androidx.media3.common.util.Util.split(descriptorFindAdaptationSetSwitchingProperty.value, ",")) {
                    java.lang.Integer num2 = (java.lang.Integer) mapNewHashMapWithExpectedSize.get(java.lang.Long.valueOf(java.lang.Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = java.lang.Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i2) {
                java.util.List list2 = (java.util.List) sparseArray.get(i2);
                java.util.List list3 = (java.util.List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] array = com.google.common.primitives.Ints.toArray((java.util.Collection) arrayList.get(i3));
            iArr[i3] = array;
            java.util.Arrays.sort(array);
        }
        return iArr;
    }

    private static int identifyEmbeddedTracks(int i, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[][] iArr, boolean[] zArr, androidx.media3.common.Format[][] formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (hasEventMessageTrack(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            androidx.media3.common.Format[] closedCaptionTrackFormats = getClosedCaptionTrackFormats(list, iArr[i3]);
            formatArr[i3] = closedCaptionTrackFormats;
            if (closedCaptionTrackFormats.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[][] iArr, int i, boolean[] zArr, androidx.media3.common.Format[][] formatArr, androidx.media3.common.TrackGroup[] trackGroupArr, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfoArr) {
        java.lang.String string;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int[] iArr2 = iArr[i5];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i7 : iArr2) {
                arrayList.addAll(list.get(i7).representations);
            }
            int size = arrayList.size();
            androidx.media3.common.Format[] formatArr2 = new androidx.media3.common.Format[size];
            for (int i8 = 0; i8 < size; i8++) {
                androidx.media3.common.Format format = ((androidx.media3.exoplayer.dash.manifest.Representation) arrayList.get(i8)).format;
                formatArr2[i8] = format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format)).build();
            }
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(iArr2[0]);
            if (adaptationSet.id != -1) {
                string = java.lang.Long.toString(adaptationSet.id);
            } else {
                string = "unset:" + i5;
            }
            int i9 = i6 + 1;
            if (zArr[i5]) {
                i2 = i9 + 1;
            } else {
                i2 = i9;
                i9 = -1;
            }
            if (formatArr[i5].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            maybeUpdateFormatsForParsedText(factory, formatArr2);
            trackGroupArr[i6] = new androidx.media3.common.TrackGroup(string, formatArr2);
            trackGroupInfoArr[i6] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.primaryTrack(adaptationSet.type, iArr2, i6, i9, i2);
            if (i9 != -1) {
                java.lang.String str = string + ":emsg";
                trackGroupArr[i9] = new androidx.media3.common.TrackGroup(str, new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).build());
                trackGroupInfoArr[i9] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.embeddedEmsgTrack(iArr2, i6);
                i4 = -1;
            } else {
                i4 = -1;
            }
            if (i2 != i4) {
                trackGroupInfoArr[i2] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.embeddedClosedCaptionTrack(iArr2, i6, com.google.common.collect.ImmutableList.copyOf(formatArr[i5]));
                maybeUpdateFormatsForParsedText(factory, formatArr[i5]);
                trackGroupArr[i2] = new androidx.media3.common.TrackGroup(string + ":cc", formatArr[i5]);
            }
            i5++;
            i6 = i3;
        }
        return i6;
    }

    private static void buildManifestEventTrackGroupInfos(java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list, androidx.media3.common.TrackGroup[] trackGroupArr, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfoArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            androidx.media3.exoplayer.dash.manifest.EventStream eventStream = list.get(i2);
            trackGroupArr[i] = new androidx.media3.common.TrackGroup(eventStream.id() + ":" + i2, new androidx.media3.common.Format.Builder().setId(eventStream.id()).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).build());
            trackGroupInfoArr[i] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.mpdEventTrack(i2);
            i2++;
            i++;
        }
    }

    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> buildSampleStream(androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, long j) {
        androidx.media3.common.TrackGroup trackGroup;
        int i;
        com.google.common.collect.ImmutableList<androidx.media3.common.Format> immutableListOf;
        int i2;
        boolean z = trackGroupInfo.embeddedEventMessageTrackGroupIndex != -1;
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = null;
        if (z) {
            trackGroup = this.trackGroups.get(trackGroupInfo.embeddedEventMessageTrackGroupIndex);
            i = 1;
        } else {
            trackGroup = null;
            i = 0;
        }
        if (trackGroupInfo.embeddedClosedCaptionTrackGroupIndex != -1) {
            immutableListOf = this.trackGroupInfos[trackGroupInfo.embeddedClosedCaptionTrackGroupIndex].embeddedClosedCaptionTrackOriginalFormats;
        } else {
            immutableListOf = com.google.common.collect.ImmutableList.of();
        }
        int size = i + immutableListOf.size();
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[size];
        int[] iArr = new int[size];
        if (z) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < immutableListOf.size(); i3++) {
            androidx.media3.common.Format format = immutableListOf.get(i3);
            formatArr[i2] = format;
            iArr[i2] = 3;
            arrayList.add(format);
            i2++;
        }
        if (this.manifest.dynamic && z) {
            playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = this.playerEmsgHandler.newPlayerTrackEmsgHandler();
        }
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream = new androidx.media3.exoplayer.source.chunk.ChunkSampleStream<>(trackGroupInfo.trackType, iArr, formatArr, this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z, arrayList, playerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration), this, this.allocator, j, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.mediaSourceEventDispatcher);
        synchronized (this) {
            this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
        }
        return chunkSampleStream;
    }

    private static androidx.media3.exoplayer.dash.manifest.Descriptor findAdaptationSetSwitchingProperty(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        return findDescriptor(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static androidx.media3.exoplayer.dash.manifest.Descriptor findTrickPlayProperty(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        return findDescriptor(list, "http://dashif.org/guidelines/trickmode");
    }

    private static androidx.media3.exoplayer.dash.manifest.Descriptor findDescriptor(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list, java.lang.String str) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if (str.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    private static boolean hasEventMessageTrack(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[] iArr) {
        for (int i : iArr) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list2 = list.get(i).representations;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static androidx.media3.common.Format[] getClosedCaptionTrackFormats(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[] iArr) {
        for (int i : iArr) {
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(i);
            java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2 = list.get(i).accessibilityDescriptors;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA608_SERVICE_DESCRIPTOR_REGEX, new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA608).setId(adaptationSet.id + ":cea608").build());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA708_SERVICE_DESCRIPTOR_REGEX, new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA708).setId(adaptationSet.id + ":cea708").build());
                }
            }
        }
        return new androidx.media3.common.Format[0];
    }

    private static androidx.media3.common.Format[] parseClosedCaptionDescriptor(androidx.media3.exoplayer.dash.manifest.Descriptor descriptor, java.util.regex.Pattern pattern, androidx.media3.common.Format format) {
        java.lang.String str = descriptor.value;
        if (str == null) {
            return new androidx.media3.common.Format[]{format};
        }
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str, ";");
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            java.util.regex.Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new androidx.media3.common.Format[]{format};
            }
            int i2 = java.lang.Integer.parseInt(matcher.group(1));
            formatArr[i] = format.buildUpon().setId(format.id + ":" + i2).setAccessibilityChannel(i2).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    private static void maybeUpdateFormatsForParsedText(androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, androidx.media3.common.Format[] formatArr) {
        for (int i = 0; i < formatArr.length; i++) {
            formatArr[i] = factory.getOutputTextFormat(formatArr[i]);
        }
    }

    private static androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] newSampleStreamArray(int i) {
        return new androidx.media3.exoplayer.source.chunk.ChunkSampleStream[i];
    }

    private static final class TrackGroupInfo {
        private static final int CATEGORY_EMBEDDED = 1;
        private static final int CATEGORY_MANIFEST_EVENTS = 2;
        private static final int CATEGORY_PRIMARY = 0;
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final com.google.common.collect.ImmutableList<androidx.media3.common.Format> embeddedClosedCaptionTrackOriginalFormats;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo primaryTrack(int i, int[] iArr, int i2, int i3, int i4) {
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(i, 0, iArr, i2, i3, i4, -1, com.google.common.collect.ImmutableList.of());
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo embeddedEmsgTrack(int[] iArr, int i) {
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(5, 1, iArr, i, -1, -1, -1, com.google.common.collect.ImmutableList.of());
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo embeddedClosedCaptionTrack(int[] iArr, int i, com.google.common.collect.ImmutableList<androidx.media3.common.Format> immutableList) {
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(3, 1, iArr, i, -1, -1, -1, immutableList);
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo mpdEventTrack(int i) {
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i, com.google.common.collect.ImmutableList.of());
        }

        private TrackGroupInfo(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, com.google.common.collect.ImmutableList<androidx.media3.common.Format> immutableList) {
            this.trackType = i;
            this.adaptationSetIndices = iArr;
            this.trackGroupCategory = i2;
            this.primaryTrackGroupIndex = i3;
            this.embeddedEventMessageTrackGroupIndex = i4;
            this.embeddedClosedCaptionTrackGroupIndex = i5;
            this.eventStreamGroupIndex = i6;
            this.embeddedClosedCaptionTrackOriginalFormats = immutableList;
        }
    }
}
