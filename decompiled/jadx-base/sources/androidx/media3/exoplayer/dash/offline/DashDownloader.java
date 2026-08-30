package androidx.media3.exoplayer.dash.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DashDownloader extends androidx.media3.exoplayer.offline.SegmentDownloader<androidx.media3.exoplayer.dash.manifest.DashManifest> {
    private final androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0());
    }

    public DashDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, new androidx.media3.exoplayer.dash.manifest.DashManifestParser(), factory, executor, 20000L);
    }

    @java.lang.Deprecated
    public DashDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.dash.manifest.DashManifest> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public DashDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.dash.manifest.DashManifest> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j) {
        super(mediaItem, parser, factory, executor, j);
        this.baseUrlExclusionList = new androidx.media3.exoplayer.dash.BaseUrlExclusionList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> getSegments(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            androidx.media3.exoplayer.dash.manifest.Period period = dashManifest.getPeriod(i);
            long jMsToUs = androidx.media3.common.util.Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            int i2 = 0;
            for (java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i2), jMsToUs, periodDurationUs, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7 A[SYNTHETIC] */
    private void addSegmentsForAdaptationSet(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet, long j, long j2, boolean z, java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> arrayList) throws java.lang.InterruptedException, java.io.IOException {
        for (int i = 0; i < adaptationSet.representations.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Representation representation = adaptationSet.representations.get(i);
            try {
                try {
                    androidx.media3.exoplayer.dash.DashSegmentIndex segmentIndex = getSegmentIndex(dataSource, adaptationSet.type, representation, z);
                    if (segmentIndex == null) {
                        try {
                            throw new androidx.media3.exoplayer.offline.DownloadException("Missing segment index");
                        } catch (java.io.IOException e) {
                            e = e;
                            if (z) {
                                throw e;
                            }
                        }
                    } else {
                        long segmentCount = segmentIndex.getSegmentCount(j2);
                        if (segmentCount == -1) {
                            throw new androidx.media3.exoplayer.offline.DownloadException("Unbounded segment index");
                        }
                        java.lang.String str = ((androidx.media3.exoplayer.dash.manifest.BaseUrl) androidx.media3.common.util.Util.castNonNull(this.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                        androidx.media3.exoplayer.dash.manifest.RangedUri initializationUri = representation.getInitializationUri();
                        if (initializationUri != null) {
                            arrayList.add(createSegment(representation, str, j, initializationUri));
                        }
                        androidx.media3.exoplayer.dash.manifest.RangedUri indexUri = representation.getIndexUri();
                        if (indexUri != null) {
                            arrayList.add(createSegment(representation, str, j, indexUri));
                        }
                        long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                        long j3 = (firstSegmentNum + segmentCount) - 1;
                        for (long j4 = firstSegmentNum; j4 <= j3; j4++) {
                            arrayList.add(createSegment(representation, str, j + segmentIndex.getTimeUs(j4), segmentIndex.getSegmentUrl(j4)));
                        }
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    if (z) {
                        throw e;
                    }
                }
            } catch (java.io.IOException e3) {
                e = e3;
            }
        }
    }

    private androidx.media3.exoplayer.offline.SegmentDownloader.Segment createSegment(androidx.media3.exoplayer.dash.manifest.Representation representation, java.lang.String str, long j, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri) {
        return new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(j, androidx.media3.exoplayer.dash.DashUtil.buildDataSpec(representation, str, rangedUri, 0, com.google.common.collect.ImmutableMap.of()));
    }

    private androidx.media3.exoplayer.dash.DashSegmentIndex getSegmentIndex(final androidx.media3.datasource.DataSource dataSource, final int i, final androidx.media3.exoplayer.dash.manifest.Representation representation, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        androidx.media3.exoplayer.dash.DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        androidx.media3.extractor.ChunkIndex chunkIndex = (androidx.media3.extractor.ChunkIndex) execute(new androidx.media3.common.util.RunnableFutureTask<androidx.media3.extractor.ChunkIndex, java.io.IOException>() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public androidx.media3.extractor.ChunkIndex doWork() throws java.io.IOException {
                return androidx.media3.exoplayer.dash.DashUtil.loadChunkIndex(dataSource, i, representation);
            }
        }, z);
        if (chunkIndex == null) {
            return null;
        }
        return new androidx.media3.exoplayer.dash.DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }
}
