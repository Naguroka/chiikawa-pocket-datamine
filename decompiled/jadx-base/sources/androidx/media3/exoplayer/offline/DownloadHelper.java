package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadHelper {
    public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    private androidx.media3.exoplayer.offline.DownloadHelper.Callback callback;
    private final android.os.Handler callbackHandler;
    private java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
    private androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer mediaPreparer;
    private final androidx.media3.exoplayer.source.MediaSource mediaSource;
    private final androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilities;
    private final android.util.SparseIntArray scratchSet;
    private androidx.media3.exoplayer.source.TrackGroupArray[] trackGroupArrays;
    private java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector trackSelector;
    private final androidx.media3.common.Timeline.Window window;

    public interface Callback {
        void onPrepareError(androidx.media3.exoplayer.offline.DownloadHelper downloadHelper, java.io.IOException iOException);

        void onPrepared(androidx.media3.exoplayer.offline.DownloadHelper downloadHelper);
    }

    public static class LiveContentUnsupportedException extends java.io.IOException {
    }

    static /* synthetic */ androidx.media3.exoplayer.drm.DrmSessionManager lambda$createMediaSourceInternal$6(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.common.MediaItem mediaItem) {
        return drmSessionManager;
    }

    static /* synthetic */ void lambda$getRendererCapabilities$0(androidx.media3.common.text.CueGroup cueGroup) {
    }

    static /* synthetic */ void lambda$getRendererCapabilities$1(androidx.media3.common.Metadata metadata) {
    }

    static /* synthetic */ void lambda$new$2() {
    }

    public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(android.content.Context context) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
        androidx.media3.exoplayer.Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(), new androidx.media3.exoplayer.video.VideoRendererEventListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper.1
        }, new androidx.media3.exoplayer.audio.AudioRendererEventListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper.2
        }, new androidx.media3.exoplayer.text.TextOutput() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda4
            @Override // androidx.media3.exoplayer.text.TextOutput
            public final void onCues(androidx.media3.common.text.CueGroup cueGroup) {
                androidx.media3.exoplayer.offline.DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
            }
        }, new androidx.media3.exoplayer.metadata.MetadataOutput() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda5
            @Override // androidx.media3.exoplayer.metadata.MetadataOutput
            public final void onMetadata(androidx.media3.common.Metadata metadata) {
                androidx.media3.exoplayer.offline.DownloadHelper.lambda$getRendererCapabilities$1(metadata);
            }
        });
        androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = new androidx.media3.exoplayer.RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i = 0; i < rendererArrCreateRenderers.length; i++) {
            rendererCapabilitiesArr[i] = rendererArrCreateRenderers[i].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.util.Assertions.checkArgument(isProgressive((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, factory, null);
    }

    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager) {
        androidx.media3.exoplayer.RendererCapabilitiesList unreleaseableRendererCapabilitiesList;
        boolean zIsProgressive = isProgressive((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration));
        androidx.media3.common.util.Assertions.checkArgument(zIsProgressive || factory != null);
        androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSourceInternal = zIsProgressive ? null : createMediaSourceInternal(mediaItem, (androidx.media3.datasource.DataSource.Factory) androidx.media3.common.util.Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            unreleaseableRendererCapabilitiesList = new androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList();
        } else {
            unreleaseableRendererCapabilitiesList = new androidx.media3.exoplayer.offline.DownloadHelper.UnreleaseableRendererCapabilitiesList(new androidx.media3.exoplayer.RendererCapabilities[0]);
        }
        return new androidx.media3.exoplayer.offline.DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, unreleaseableRendererCapabilitiesList);
    }

    public static androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, androidx.media3.datasource.DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    public static androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    @java.lang.Deprecated
    public DownloadHelper(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr) {
        this(mediaItem, mediaSource, trackSelectionParameters, new androidx.media3.exoplayer.offline.DownloadHelper.UnreleaseableRendererCapabilitiesList(rendererCapabilitiesArr));
    }

    public DownloadHelper(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilitiesList) {
        this.localConfiguration = (androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(trackSelectionParameters, new androidx.media3.exoplayer.offline.DownloadHelper.DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesList;
        this.scratchSet = new android.util.SparseIntArray();
        defaultTrackSelector.init(new androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda6
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                androidx.media3.exoplayer.offline.DownloadHelper.lambda$new$2();
            }
        }, new androidx.media3.exoplayer.offline.DownloadHelper.FakeBandwidthMeter());
        this.callbackHandler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
        this.window = new androidx.media3.common.Timeline.Window();
    }

    public void prepare(final androidx.media3.exoplayer.offline.DownloadHelper.Callback callback) {
        androidx.media3.common.util.Assertions.checkState(this.callback == null);
        this.callback = callback;
        if (this.mediaSource != null) {
            this.mediaPreparer = new androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer(this.mediaSource, this);
        } else {
            this.callbackHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m175xc63c3cd5(callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$prepare$3$androidx-media3-exoplayer-offline-DownloadHelper, reason: not valid java name */
    /* synthetic */ void m175xc63c3cd5(androidx.media3.exoplayer.offline.DownloadHelper.Callback callback) {
        callback.onPrepared(this);
    }

    public void release() {
        androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
        this.rendererCapabilities.release();
    }

    public java.lang.Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public androidx.media3.common.Tracks getTracks(int i) {
        assertPreparedWithMedia();
        return androidx.media3.exoplayer.trackselection.TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i], this.immutableTrackSelectionsByPeriodAndRenderer[i]);
    }

    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups(int i) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i];
    }

    public androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i];
    }

    public java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> getTrackSelections(int i, int i2) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i][i2];
    }

    public void clearTrackSelections(int i) {
        assertPreparedWithMedia();
        for (int i2 = 0; i2 < this.rendererCapabilities.size(); i2++) {
            this.trackSelectionsByPeriodAndRenderer[i][i2].clear();
        }
    }

    public void replaceTrackSelections(int i, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i);
            addTrackSelectionInternal(i, trackSelectionParameters);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addTrackSelection(int i, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i, trackSelectionParameters);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addAudioLanguagesToSelection(java.lang.String... strArr) {
        try {
            assertPreparedWithMedia();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (androidx.media3.exoplayer.RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (java.lang.String str : strArr) {
                androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i = 0; i < periodCount; i++) {
                    addTrackSelectionInternal(i, trackSelectionParametersBuild);
                }
            }
        } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addTextLanguagesToSelection(boolean z, java.lang.String... strArr) {
        try {
            assertPreparedWithMedia();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (androidx.media3.exoplayer.RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (java.lang.String str : strArr) {
                androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i = 0; i < periodCount; i++) {
                    addTrackSelectionInternal(i, trackSelectionParametersBuild);
                }
            }
        } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i, int i2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithMedia();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            int i3 = 0;
            while (i3 < this.mappedTrackInfos[i].getRendererCount()) {
                builderBuildUpon.setRendererDisabled(i3, i3 != i2);
                i3++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i, builderBuildUpon.build());
                return;
            }
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = this.mappedTrackInfos[i].getTrackGroups(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                builderBuildUpon.setSelectionOverride(i2, trackGroups, list.get(i4));
                addTrackSelectionInternal(i, builderBuildUpon.build());
            }
        } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public androidx.media3.exoplayer.offline.DownloadRequest getDownloadRequest(byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public androidx.media3.exoplayer.offline.DownloadRequest getDownloadRequest(java.lang.String str, byte[] bArr) {
        androidx.media3.exoplayer.offline.DownloadRequest.Builder data = new androidx.media3.exoplayer.offline.DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType).setKeySetId(this.localConfiguration.drmConfiguration != null ? this.localConfiguration.drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i = 0; i < length; i++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i][i2]);
            }
            arrayList.addAll(this.mediaPreparer.mediaPeriods[i].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void addTrackSelectionInternal(int i, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i);
        com.google.common.collect.UnmodifiableIterator<androidx.media3.common.TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType(it.next()).build());
            runTrackSelection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkNotNull(this.mediaPreparer);
        androidx.media3.common.util.Assertions.checkNotNull(this.mediaPreparer.mediaPeriods);
        androidx.media3.common.util.Assertions.checkNotNull(this.mediaPreparer.timeline);
        int length = this.mediaPreparer.mediaPeriods.length;
        int size = this.rendererCapabilities.size();
        this.trackSelectionsByPeriodAndRenderer = (java.util.List[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.util.List.class, length, size);
        this.immutableTrackSelectionsByPeriodAndRenderer = (java.util.List[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.util.List.class, length, size);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < size; i2++) {
                this.trackSelectionsByPeriodAndRenderer[i][i2] = new java.util.ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i][i2] = java.util.Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i][i2]);
            }
        }
        this.trackGroupArrays = new androidx.media3.exoplayer.source.TrackGroupArray[length];
        this.mappedTrackInfos = new androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo[length];
        for (int i3 = 0; i3 < length; i3++) {
            this.trackGroupArrays[i3] = this.mediaPreparer.mediaPeriods[i3].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i3).info);
            this.mappedTrackInfos[i3] = (androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo) androidx.media3.common.util.Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.callbackHandler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m174xa451279();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onMediaPrepared$4$androidx-media3-exoplayer-offline-DownloadHelper, reason: not valid java name */
    /* synthetic */ void m174xa451279() {
        ((androidx.media3.exoplayer.offline.DownloadHelper.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final java.io.IOException iOException) {
        ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.callbackHandler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m173x674611d1(iOException);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onMediaPreparationFailed$5$androidx-media3-exoplayer-offline-DownloadHelper, reason: not valid java name */
    /* synthetic */ void m173x674611d1(java.io.IOException iOException) {
        ((androidx.media3.exoplayer.offline.DownloadHelper.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepareError(this, iOException);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
        androidx.media3.common.util.Assertions.checkState(this.isPreparedWithMedia);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private androidx.media3.exoplayer.trackselection.TrackSelectorResult runTrackSelection(int i) throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean z;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities.getRendererCapabilities(), this.trackGroupArrays[i], new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i)), this.mediaPreparer.timeline);
        for (int i2 = 0; i2 < trackSelectorResultSelectTracks.length; i2++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i2];
            if (exoTrackSelection != null) {
                java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        z = false;
                        break;
                    }
                    androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = list.get(i3);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i4 = 0; i4 < exoTrackSelection2.length(); i4++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i4), 0);
                        }
                        for (int i5 = 0; i5 < exoTrackSelection.length(); i5++) {
                            this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i5), 0);
                        }
                        int[] iArr = new int[this.scratchSet.size()];
                        for (int i6 = 0; i6 < this.scratchSet.size(); i6++) {
                            iArr[i6] = this.scratchSet.keyAt(i6);
                        }
                        list.set(i3, new androidx.media3.exoplayer.offline.DownloadHelper.DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                        z = true;
                        break;
                    }
                    i3++;
                }
                if (!z) {
                    list.add(exoTrackSelection);
                }
            }
        }
        return trackSelectorResultSelectTracks;
    }

    private static androidx.media3.exoplayer.source.MediaSource createMediaSourceInternal(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.DataSource.Factory factory, final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager) {
        androidx.media3.exoplayer.source.DefaultMediaSourceFactory defaultMediaSourceFactory = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(factory, androidx.media3.extractor.ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new androidx.media3.exoplayer.drm.DrmSessionManagerProvider() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda1
                @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
                public final androidx.media3.exoplayer.drm.DrmSessionManager get(androidx.media3.common.MediaItem mediaItem2) {
                    return androidx.media3.exoplayer.offline.DownloadHelper.lambda$createMediaSourceInternal$6(drmSessionManager, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    private static boolean isProgressive(androidx.media3.common.MediaItem.LocalConfiguration localConfiguration) {
        return androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class MediaPreparer implements androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller, androidx.media3.exoplayer.source.MediaPeriod.Callback, android.os.Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final androidx.media3.exoplayer.offline.DownloadHelper downloadHelper;
        public androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriods;
        private final androidx.media3.exoplayer.source.MediaSource mediaSource;
        private final android.os.Handler mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private boolean released;
        public androidx.media3.common.Timeline timeline;
        private final androidx.media3.exoplayer.upstream.Allocator allocator = new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536);
        private final java.util.ArrayList<androidx.media3.exoplayer.source.MediaPeriod> pendingMediaPeriods = new java.util.ArrayList<>();
        private final android.os.Handler downloadHelperHandler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(new android.os.Handler.Callback() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$MediaPreparer$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.handleDownloadHelperCallbackMessage(message);
            }
        });

        public MediaPreparer(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.offline.DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            android.os.Handler handlerCreateHandler = androidx.media3.common.util.Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(4);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 1) {
                this.mediaSource.prepareSource(this, null, androidx.media3.exoplayer.analytics.PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(2);
                return true;
            }
            int i2 = 0;
            if (i == 2) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i2 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i2).maybeThrowPrepareError();
                            i2++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100L);
                } catch (java.io.IOException e) {
                    this.downloadHelperHandler.obtainMessage(2, e).sendToTarget();
                }
                return true;
            }
            if (i == 3) {
                androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = (androidx.media3.exoplayer.source.MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                }
                return true;
            }
            if (i != 4) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i2 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i2]);
                    i2++;
                }
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
            androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new androidx.media3.common.Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(2, new androidx.media3.exoplayer.offline.DownloadHelper.LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new androidx.media3.exoplayer.source.MediaPeriod[timeline.getPeriodCount()];
            int i = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i >= mediaPeriodArr.length) {
                    break;
                }
                androidx.media3.exoplayer.source.MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i)), this.allocator, 0L);
                this.mediaPeriods[i] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i++;
            }
            for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(2);
                this.downloadHelperHandler.sendEmptyMessage(1);
            }
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(3, mediaPeriod).sendToTarget();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(android.os.Message message) {
            if (this.released) {
                return false;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
                    this.downloadHelperHandler.obtainMessage(2, new java.io.IOException(e)).sendToTarget();
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((java.io.IOException) androidx.media3.common.util.Util.castNonNull(message.obj));
            return true;
        }
    }

    private static final class DownloadTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {
        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public java.lang.Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        }

        private static final class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
            public androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[definitionArr.length];
                for (int i = 0; i < definitionArr.length; i++) {
                    exoTrackSelectionArr[i] = definitionArr[i] == null ? null : new androidx.media3.exoplayer.offline.DownloadHelper.DownloadTrackSelection(definitionArr[i].group, definitionArr[i].tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }
    }

    private static final class FakeBandwidthMeter implements androidx.media3.exoplayer.upstream.BandwidthMeter {
        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public androidx.media3.datasource.TransferListener getTransferListener() {
            return null;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        }

        private FakeBandwidthMeter() {
        }
    }

    private static final class UnreleaseableRendererCapabilitiesList implements androidx.media3.exoplayer.RendererCapabilitiesList {
        private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public void release() {
        }

        private UnreleaseableRendererCapabilitiesList(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr) {
            this.rendererCapabilities = rendererCapabilitiesArr;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities() {
            return this.rendererCapabilities;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public int size() {
            return this.rendererCapabilities.length;
        }
    }
}
