package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDashChunkSource implements androidx.media3.exoplayer.dash.DashChunkSource {
    private final int[] adaptationSetIndices;
    private final androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private final androidx.media3.datasource.DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;
    private java.io.IOException fatalError;
    private long lastChunkRequestRealtimeMs = androidx.media3.common.C.TIME_UNSET;
    private androidx.media3.exoplayer.dash.manifest.DashManifest manifest;
    private final androidx.media3.exoplayer.upstream.LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;
    private final androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder[] representationHolders;
    private androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements androidx.media3.exoplayer.dash.DashChunkSource.Factory {
        private final androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory chunkExtractorFactory;
        private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(androidx.media3.datasource.DataSource.Factory factory) {
            this(factory, 1);
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory, int i) {
            this(androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.FACTORY, factory, i);
        }

        public Factory(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory factory, androidx.media3.datasource.DataSource.Factory factory2, int i) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public androidx.media3.exoplayer.dash.DefaultDashChunkSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.chunkExtractorFactory.setSubtitleParserFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public androidx.media3.exoplayer.dash.DefaultDashChunkSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.chunkExtractorFactory.experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public androidx.media3.exoplayer.dash.DashChunkSource createDashChunkSource(androidx.media3.exoplayer.upstream.LoaderErrorThrower loaderErrorThrower, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, java.util.List<androidx.media3.common.Format> list, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration) {
            androidx.media3.datasource.DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new androidx.media3.exoplayer.dash.DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i, iArr, exoTrackSelection, i2, dataSourceCreateDataSource, j, this.maxSegmentsPerLoad, z, list, playerTrackEmsgHandler, playerId, cmcdConfiguration);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format) {
            return this.chunkExtractorFactory.getOutputTextFormat(format);
        }
    }

    public DefaultDashChunkSource(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory factory, androidx.media3.exoplayer.upstream.LoaderErrorThrower loaderErrorThrower, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, int i2, androidx.media3.datasource.DataSource dataSource, long j, int i3, boolean z, java.util.List<androidx.media3.common.Format> list, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        this.trackType = i2;
        this.dataSource = dataSource;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler;
        this.cmcdConfiguration = cmcdConfiguration;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Representation> representations = getRepresentations();
        this.representationHolders = new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder[exoTrackSelection.length()];
        int i4 = 0;
        while (i4 < this.representationHolders.length) {
            androidx.media3.exoplayer.dash.manifest.Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i4));
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrlSelectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder[] representationHolderArr = this.representationHolders;
            if (baseUrlSelectBaseUrl == null) {
                baseUrlSelectBaseUrl = representation.baseUrls.get(0);
            }
            int i5 = i4;
            representationHolderArr[i5] = new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(periodDurationUs, representation, baseUrlSelectBaseUrl, factory.createProgressiveMediaExtractor(i2, representation.format, z, list, playerTrackEmsgHandler, playerId), 0L, representation.getIndex());
            i4 = i5 + 1;
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        for (androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = representationHolder.getSegmentNum(j);
                    long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                    return seekParameters.resolveSeekPositionUs(j, segmentStartTimeUs, (segmentStartTimeUs >= j || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                androidx.media3.exoplayer.dash.manifest.Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i2));
                androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (androidx.media3.exoplayer.source.BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void maybeThrowError() throws java.io.IOException {
        java.io.IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j, androidx.media3.exoplayer.source.chunk.Chunk chunk, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0196  */
    /* JADX WARN: Code duplicated, block: B:58:0x019f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void getNextChunk(androidx.media3.exoplayer.LoadingInfo loadingInfo, long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.ChunkHolder chunkHolder) {
        boolean z;
        boolean z2;
        boolean z3;
        long firstAvailableSegmentNum;
        long lastAvailableSegmentNum;
        boolean z4;
        long segmentNum;
        long segmentEndTimeUs;
        boolean z5;
        int i;
        int i2;
        androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr;
        long j2;
        long j3;
        if (this.fatalError != null) {
            return;
        }
        long j4 = loadingInfo.playbackPositionUs;
        long j5 = j - j4;
        long jMsToUs = androidx.media3.common.util.Util.msToUs(this.manifest.availabilityStartTimeMs) + androidx.media3.common.util.Util.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + j;
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs)) {
            long jMsToUs2 = androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
            long nowPeriodTimeUs = getNowPeriodTimeUs(jMsToUs2);
            androidx.media3.exoplayer.source.chunk.MediaChunk mediaChunk = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.trackSelection.length();
            androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr2 = new androidx.media3.exoplayer.source.chunk.MediaChunkIterator[length];
            int i3 = 0;
            while (i3 < length) {
                androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder = this.representationHolders[i3];
                if (representationHolder.segmentIndex == null) {
                    mediaChunkIteratorArr2[i3] = androidx.media3.exoplayer.source.chunk.MediaChunkIterator.EMPTY;
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j2 = j5;
                    j3 = jMsToUs2;
                } else {
                    long firstAvailableSegmentNum2 = representationHolder.getFirstAvailableSegmentNum(jMsToUs2);
                    long lastAvailableSegmentNum2 = representationHolder.getLastAvailableSegmentNum(jMsToUs2);
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j2 = j5;
                    j3 = jMsToUs2;
                    long segmentNum2 = getSegmentNum(representationHolder, mediaChunk, j, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
                    if (segmentNum2 < firstAvailableSegmentNum2) {
                        mediaChunkIteratorArr[i] = androidx.media3.exoplayer.source.chunk.MediaChunkIterator.EMPTY;
                    } else {
                        mediaChunkIteratorArr[i] = new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationSegmentIterator(updateSelectedBaseUrl(i), segmentNum2, lastAvailableSegmentNum2, nowPeriodTimeUs);
                    }
                }
                i3 = i + 1;
                jMsToUs2 = j3;
                length = i2;
                mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                j5 = j2;
            }
            long j6 = j5;
            long j7 = jMsToUs2;
            this.trackSelection.updateSelectedTrack(j4, j6, getAvailableLiveDurationUs(j7, j4), list, mediaChunkIteratorArr2);
            int selectedIndex = this.trackSelection.getSelectedIndex();
            androidx.media3.exoplayer.upstream.CmcdData.Factory factory = this.cmcdConfiguration == null ? null : new androidx.media3.exoplayer.upstream.CmcdData.Factory(this.cmcdConfiguration, this.trackSelection, java.lang.Math.max(0L, j6), loadingInfo.playbackSpeed, "d", this.manifest.dynamic, loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs), list.isEmpty());
            this.lastChunkRequestRealtimeMs = android.os.SystemClock.elapsedRealtime();
            androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolderUpdateSelectedBaseUrl = updateSelectedBaseUrl(selectedIndex);
            if (representationHolderUpdateSelectedBaseUrl.chunkExtractor != null) {
                androidx.media3.exoplayer.dash.manifest.Representation representation = representationHolderUpdateSelectedBaseUrl.representation;
                androidx.media3.exoplayer.dash.manifest.RangedUri initializationUri = representationHolderUpdateSelectedBaseUrl.chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
                androidx.media3.exoplayer.dash.manifest.RangedUri indexUri = representationHolderUpdateSelectedBaseUrl.segmentIndex == null ? representation.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    chunkHolder.chunk = newInitializationChunk(representationHolderUpdateSelectedBaseUrl, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri, factory);
                    return;
                }
            }
            long j8 = representationHolderUpdateSelectedBaseUrl.periodDurationUs;
            if (this.manifest.dynamic) {
                z = true;
                if (this.periodIndex == this.manifest.getPeriodCount() - 1) {
                    z2 = true;
                }
                long j9 = androidx.media3.common.C.TIME_UNSET;
                if (z2 || j8 != androidx.media3.common.C.TIME_UNSET) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (representationHolderUpdateSelectedBaseUrl.getSegmentCount() == 0) {
                    chunkHolder.endOfStream = z3;
                    return;
                }
                firstAvailableSegmentNum = representationHolderUpdateSelectedBaseUrl.getFirstAvailableSegmentNum(j7);
                lastAvailableSegmentNum = representationHolderUpdateSelectedBaseUrl.getLastAvailableSegmentNum(j7);
                if (z2) {
                    segmentEndTimeUs = representationHolderUpdateSelectedBaseUrl.getSegmentEndTimeUs(lastAvailableSegmentNum);
                    if (segmentEndTimeUs + (segmentEndTimeUs - representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(lastAvailableSegmentNum)) >= j8) {
                        z5 = z;
                    } else {
                        z5 = false;
                    }
                    z3 &= z5;
                }
                z4 = z3;
                segmentNum = getSegmentNum(representationHolderUpdateSelectedBaseUrl, mediaChunk, j, firstAvailableSegmentNum, lastAvailableSegmentNum);
                if (segmentNum < firstAvailableSegmentNum) {
                    this.fatalError = new androidx.media3.exoplayer.source.BehindLiveWindowException();
                }
                if (segmentNum <= lastAvailableSegmentNum || (this.missingLastSegment && segmentNum >= lastAvailableSegmentNum)) {
                    chunkHolder.endOfStream = z4;
                }
                if (z4 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(segmentNum) >= j8) {
                    chunkHolder.endOfStream = true;
                    return;
                }
                int iMin = (int) java.lang.Math.min(this.maxSegmentsPerLoad, (lastAvailableSegmentNum - segmentNum) + 1);
                if (j8 != androidx.media3.common.C.TIME_UNSET) {
                    while (iMin > 1 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs((((long) iMin) + segmentNum) - 1) >= j8) {
                        iMin--;
                    }
                }
                int i4 = iMin;
                if (list.isEmpty()) {
                    j9 = j;
                }
                chunkHolder.chunk = newMediaChunk(representationHolderUpdateSelectedBaseUrl, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum, i4, j9, nowPeriodTimeUs, factory);
                return;
            }
            z = true;
            z2 = false;
            long j10 = androidx.media3.common.C.TIME_UNSET;
            if (z2) {
                z3 = z;
            } else {
                z3 = z;
            }
            if (representationHolderUpdateSelectedBaseUrl.getSegmentCount() == 0) {
                chunkHolder.endOfStream = z3;
                return;
            }
            firstAvailableSegmentNum = representationHolderUpdateSelectedBaseUrl.getFirstAvailableSegmentNum(j7);
            lastAvailableSegmentNum = representationHolderUpdateSelectedBaseUrl.getLastAvailableSegmentNum(j7);
            if (z2) {
                segmentEndTimeUs = representationHolderUpdateSelectedBaseUrl.getSegmentEndTimeUs(lastAvailableSegmentNum);
                if (segmentEndTimeUs + (segmentEndTimeUs - representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(lastAvailableSegmentNum)) >= j8) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                z3 &= z5;
            }
            z4 = z3;
            segmentNum = getSegmentNum(representationHolderUpdateSelectedBaseUrl, mediaChunk, j, firstAvailableSegmentNum, lastAvailableSegmentNum);
            if (segmentNum < firstAvailableSegmentNum) {
                this.fatalError = new androidx.media3.exoplayer.source.BehindLiveWindowException();
            } else {
                if (segmentNum <= lastAvailableSegmentNum) {
                }
                chunkHolder.endOfStream = z4;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        androidx.media3.extractor.ChunkIndex chunkIndex;
        if (chunk instanceof androidx.media3.exoplayer.source.chunk.InitializationChunk) {
            int iIndexOf = this.trackSelection.indexOf(((androidx.media3.exoplayer.source.chunk.InitializationChunk) chunk).trackFormat);
            androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = ((androidx.media3.exoplayer.source.chunk.ChunkExtractor) androidx.media3.common.util.Assertions.checkStateNotNull(representationHolder.chunkExtractor)).getChunkIndex()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.copyWithNewSegmentIndex(new androidx.media3.exoplayer.dash.DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk, boolean z, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z) {
            return false;
        }
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof androidx.media3.exoplayer.source.chunk.MediaChunk) && (loadErrorInfo.exception instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) && ((androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) loadErrorInfo.exception).responseCode == 404) {
            androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
            long segmentCount = representationHolder.getSegmentCount();
            if (segmentCount != -1 && segmentCount != 0) {
                if (((androidx.media3.exoplayer.source.chunk.MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                    this.missingLastSegment = true;
                    return true;
                }
            }
        }
        androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (baseUrlSelectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(baseUrlSelectBaseUrl)) {
            return true;
        }
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions fallbackOptionsCreateFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((!fallbackOptionsCreateFallbackOptions.isFallbackAvailable(2) && !fallbackOptionsCreateFallbackOptions.isFallbackAvailable(1)) || (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(fallbackOptionsCreateFallbackOptions, loadErrorInfo)) == null || !fallbackOptionsCreateFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            return false;
        }
        if (fallbackSelectionFor.type == 2) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelection;
            return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
        }
        if (fallbackSelectionFor.type != 1) {
            return false;
        }
        this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder : this.representationHolders) {
            androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int priorityCount = androidx.media3.exoplayer.dash.BaseUrlExclusionList.getPriorityCount(list);
        return new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i);
    }

    private long getSegmentNum(androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder, androidx.media3.exoplayer.source.chunk.MediaChunk mediaChunk, long j, long j2, long j3) {
        if (mediaChunk != null) {
            return mediaChunk.getNextChunkIndex();
        }
        return androidx.media3.common.util.Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"manifest", "adaptationSetIndices"})
    private java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Representation> getRepresentations() {
        java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Representation> arrayList = new java.util.ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long getAvailableLiveDurationUs(long j, long j2) {
        if (!this.manifest.dynamic || this.representationHolders[0].getSegmentCount() == 0) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        return java.lang.Math.max(0L, java.lang.Math.min(getNowPeriodTimeUs(j), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j))) - j2);
    }

    private long getNowPeriodTimeUs(long j) {
        return this.manifest.availabilityStartTimeMs == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : j - androidx.media3.common.util.Util.msToUs(this.manifest.availabilityStartTimeMs + this.manifest.getPeriod(this.periodIndex).startMs);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.chunkExtractor"})
    protected androidx.media3.exoplayer.source.chunk.Chunk newInitializationChunk(androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder, androidx.media3.datasource.DataSource dataSource, androidx.media3.common.Format format, int i, java.lang.Object obj, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri2, androidx.media3.exoplayer.upstream.CmcdData.Factory factory) {
        androidx.media3.exoplayer.dash.manifest.Representation representation = representationHolder.representation;
        if (rangedUri != null) {
            androidx.media3.exoplayer.dash.manifest.RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(rangedUri2, representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge != null) {
                rangedUri = rangedUriAttemptMerge;
            }
        } else {
            rangedUri = (androidx.media3.exoplayer.dash.manifest.RangedUri) androidx.media3.common.util.Assertions.checkNotNull(rangedUri2);
        }
        androidx.media3.datasource.DataSpec dataSpecBuildDataSpec = androidx.media3.exoplayer.dash.DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, rangedUri, 0, com.google.common.collect.ImmutableMap.of());
        if (factory != null) {
            dataSpecBuildDataSpec = factory.setObjectType(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(dataSpecBuildDataSpec);
        }
        return new androidx.media3.exoplayer.source.chunk.InitializationChunk(dataSource, dataSpecBuildDataSpec, format, i, obj, representationHolder.chunkExtractor);
    }

    protected androidx.media3.exoplayer.source.chunk.Chunk newMediaChunk(androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder, androidx.media3.datasource.DataSource dataSource, int i, androidx.media3.common.Format format, int i2, java.lang.Object obj, long j, int i3, long j2, long j3, androidx.media3.exoplayer.upstream.CmcdData.Factory factory) {
        androidx.media3.datasource.DataSpec dataSpecAddToDataSpec;
        androidx.media3.exoplayer.dash.manifest.Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j);
        androidx.media3.exoplayer.dash.manifest.RangedUri segmentUrl = representationHolder.getSegmentUrl(j);
        if (representationHolder.chunkExtractor == null) {
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j);
            androidx.media3.datasource.DataSpec dataSpecBuildDataSpec = androidx.media3.exoplayer.dash.DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j, j3) ? 0 : 8, com.google.common.collect.ImmutableMap.of());
            if (factory != null) {
                factory.setChunkDurationUs(segmentEndTimeUs - segmentStartTimeUs).setObjectType(androidx.media3.exoplayer.upstream.CmcdData.Factory.getObjectType(this.trackSelection));
                android.util.Pair<java.lang.String, java.lang.String> nextObjectAndRangeRequest = getNextObjectAndRangeRequest(j, segmentUrl, representationHolder);
                if (nextObjectAndRangeRequest != null) {
                    factory.setNextObjectRequest((java.lang.String) nextObjectAndRangeRequest.first).setNextRangeRequest((java.lang.String) nextObjectAndRangeRequest.second);
                }
                dataSpecAddToDataSpec = factory.createCmcdData().addToDataSpec(dataSpecBuildDataSpec);
            } else {
                dataSpecAddToDataSpec = dataSpecBuildDataSpec;
            }
            return new androidx.media3.exoplayer.source.chunk.SingleSampleMediaChunk(dataSource, dataSpecAddToDataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            androidx.media3.exoplayer.dash.manifest.RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(((long) i4) + j), representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i5++;
            i4++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long j4 = (((long) i5) + j) - 1;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j4);
        long j5 = representationHolder.periodDurationUs;
        long j6 = androidx.media3.common.C.TIME_UNSET;
        if (j5 != androidx.media3.common.C.TIME_UNSET && j5 <= segmentEndTimeUs2) {
            j6 = j5;
        }
        androidx.media3.datasource.DataSpec dataSpecBuildDataSpec2 = androidx.media3.exoplayer.dash.DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j4, j3) ? 0 : 8, com.google.common.collect.ImmutableMap.of());
        if (factory != null) {
            factory.setChunkDurationUs(segmentEndTimeUs2 - segmentStartTimeUs).setObjectType(androidx.media3.exoplayer.upstream.CmcdData.Factory.getObjectType(this.trackSelection));
            android.util.Pair<java.lang.String, java.lang.String> nextObjectAndRangeRequest2 = getNextObjectAndRangeRequest(j, segmentUrl, representationHolder);
            if (nextObjectAndRangeRequest2 != null) {
                factory.setNextObjectRequest((java.lang.String) nextObjectAndRangeRequest2.first).setNextRangeRequest((java.lang.String) nextObjectAndRangeRequest2.second);
            }
            dataSpecBuildDataSpec2 = factory.createCmcdData().addToDataSpec(dataSpecBuildDataSpec2);
        }
        androidx.media3.datasource.DataSpec dataSpec = dataSpecBuildDataSpec2;
        long j7 = -representation.presentationTimeOffsetUs;
        if (androidx.media3.common.MimeTypes.isImage(format.sampleMimeType)) {
            j7 += segmentStartTimeUs;
        }
        return new androidx.media3.exoplayer.source.chunk.ContainerMediaChunk(dataSource, dataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs2, j2, j6, j, i5, j7, representationHolder.chunkExtractor);
    }

    private android.util.Pair<java.lang.String, java.lang.String> getNextObjectAndRangeRequest(long j, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder) {
        long j2 = j + 1;
        if (j2 >= representationHolder.getSegmentCount()) {
            return null;
        }
        androidx.media3.exoplayer.dash.manifest.RangedUri segmentUrl = representationHolder.getSegmentUrl(j2);
        java.lang.String relativePath = androidx.media3.common.util.UriUtil.getRelativePath(rangedUri.resolveUri(representationHolder.selectedBaseUrl.url), segmentUrl.resolveUri(representationHolder.selectedBaseUrl.url));
        java.lang.String str = segmentUrl.start + "-";
        if (segmentUrl.length != -1) {
            str = str + (segmentUrl.start + segmentUrl.length);
        }
        return new android.util.Pair<>(relativePath, str);
    }

    private androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder updateSelectedBaseUrl(int i) {
        androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder = this.representationHolders[i];
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (baseUrlSelectBaseUrl == null || baseUrlSelectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolderCopyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(baseUrlSelectBaseUrl);
        this.representationHolders[i] = representationHolderCopyWithNewSelectedBaseUrl;
        return representationHolderCopyWithNewSelectedBaseUrl;
    }

    protected static final class RepresentationSegmentIterator extends androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder representationHolder, long j, long j2, long j3) {
            super(j, j2);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j3;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public androidx.media3.datasource.DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            return androidx.media3.exoplayer.dash.DashUtil.buildDataSpec(this.representationHolder.representation, this.representationHolder.selectedBaseUrl.url, this.representationHolder.getSegmentUrl(currentIndex), this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8, com.google.common.collect.ImmutableMap.of());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }
    }

    protected static final class RepresentationHolder {
        final androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final androidx.media3.exoplayer.dash.manifest.Representation representation;
        public final androidx.media3.exoplayer.dash.DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final androidx.media3.exoplayer.dash.manifest.BaseUrl selectedBaseUrl;

        RepresentationHolder(long j, androidx.media3.exoplayer.dash.manifest.Representation representation, androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl, androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor, long j2, androidx.media3.exoplayer.dash.DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j2;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder copyWithNewRepresentation(long j, androidx.media3.exoplayer.dash.manifest.Representation representation) throws androidx.media3.exoplayer.source.BehindLiveWindowException {
            long segmentNum;
            long segmentNum2;
            androidx.media3.exoplayer.dash.DashSegmentIndex index = this.representation.getIndex();
            androidx.media3.exoplayer.dash.DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j);
            if (segmentCount == 0) {
                return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            androidx.media3.common.util.Assertions.checkStateNotNull(index2);
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j2 = (segmentCount + firstSegmentNum) - 1;
            long timeUs2 = index.getTimeUs(j2) + index.getDurationUs(j2, j);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j3 = this.segmentNumShift;
            if (timeUs2 != timeUs3) {
                if (timeUs2 < timeUs3) {
                    throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum2 = j3 - (index2.getSegmentNum(timeUs, j) - firstSegmentNum);
                } else {
                    segmentNum = index.getSegmentNum(timeUs3, j);
                }
                return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
            }
            segmentNum = j2 + 1;
            segmentNum2 = j3 + (segmentNum - firstSegmentNum2);
            return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
        }

        androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder copyWithNewSegmentIndex(androidx.media3.exoplayer.dash.DashSegmentIndex dashSegmentIndex) {
            return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder copyWithNewSelectedBaseUrl(androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl) {
            return new androidx.media3.exoplayer.dash.DefaultDashChunkSource.RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public long getFirstSegmentNum() {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getFirstAvailableSegmentNum(long j) {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getFirstAvailableSegmentNum(this.periodDurationUs, j) + this.segmentNumShift;
        }

        public long getSegmentCount() {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentStartTimeUs(long j) {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getTimeUs(j - this.segmentNumShift);
        }

        public long getSegmentEndTimeUs(long j) {
            return getSegmentStartTimeUs(j) + ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getDurationUs(j - this.segmentNumShift, this.periodDurationUs);
        }

        public long getSegmentNum(long j) {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(long j) {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getSegmentUrl(j - this.segmentNumShift);
        }

        public long getLastAvailableSegmentNum(long j) {
            return (getFirstAvailableSegmentNum(j) + ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).getAvailableSegmentCount(this.periodDurationUs, j)) - 1;
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j, long j2) {
            return ((androidx.media3.exoplayer.dash.DashSegmentIndex) androidx.media3.common.util.Assertions.checkStateNotNull(this.segmentIndex)).isExplicit() || j2 == androidx.media3.common.C.TIME_UNSET || getSegmentEndTimeUs(j) <= j2;
        }
    }
}
