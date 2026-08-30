package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class CachedRegionTracker implements androidx.media3.datasource.cache.Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final java.lang.String TAG = "CachedRegionTracker";
    private final androidx.media3.datasource.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final androidx.media3.extractor.ChunkIndex chunkIndex;
    private final java.util.TreeSet<androidx.media3.exoplayer.upstream.CachedRegionTracker.Region> regions = new java.util.TreeSet<>();
    private final androidx.media3.exoplayer.upstream.CachedRegionTracker.Region lookupRegion = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(0, 0);

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
    }

    public CachedRegionTracker(androidx.media3.datasource.cache.Cache cache, java.lang.String str, androidx.media3.extractor.ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            java.util.Iterator<androidx.media3.datasource.cache.CacheSpan> itDescendingIterator = cache.addListener(str, this).descendingIterator();
            while (itDescendingIterator.hasNext()) {
                mergeSpan(itDescendingIterator.next());
            }
        }
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }

    public synchronized int getRegionEndTimeMs(long j) {
        this.lookupRegion.startOffset = j;
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionFloor = this.regions.floor(this.lookupRegion);
        if (regionFloor != null && j <= regionFloor.endOffset && regionFloor.endOffsetIndex != -1) {
            int i = regionFloor.endOffsetIndex;
            if (i == this.chunkIndex.length - 1) {
                if (regionFloor.endOffset == this.chunkIndex.offsets[i] + ((long) this.chunkIndex.sizes[i])) {
                    return -2;
                }
            }
            return (int) ((this.chunkIndex.timesUs[i] + ((this.chunkIndex.durationsUs[i] * (regionFloor.endOffset - this.chunkIndex.offsets[i])) / ((long) this.chunkIndex.sizes[i]))) / 1000);
        }
        return -1;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(cacheSpan.position, cacheSpan.position + cacheSpan.length);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionFloor = this.regions.floor(region);
        if (regionFloor == null) {
            androidx.media3.common.util.Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(regionFloor);
        if (regionFloor.startOffset < region.startOffset) {
            androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region2 = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(regionFloor.startOffset, region.startOffset);
            int iBinarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            region2.endOffsetIndex = iBinarySearch;
            this.regions.add(region2);
        }
        if (regionFloor.endOffset > region.endOffset) {
            androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region3 = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(region.endOffset + 1, regionFloor.endOffset);
            region3.endOffsetIndex = regionFloor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    private void mergeSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(cacheSpan.position, cacheSpan.position + cacheSpan.length);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionFloor = this.regions.floor(region);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionCeiling = this.regions.ceiling(region);
        boolean zRegionsConnect = regionsConnect(regionFloor, region);
        if (regionsConnect(region, regionCeiling)) {
            if (zRegionsConnect) {
                regionFloor.endOffset = regionCeiling.endOffset;
                regionFloor.endOffsetIndex = regionCeiling.endOffsetIndex;
            } else {
                region.endOffset = regionCeiling.endOffset;
                region.endOffsetIndex = regionCeiling.endOffsetIndex;
                this.regions.add(region);
            }
            this.regions.remove(regionCeiling);
            return;
        }
        if (zRegionsConnect) {
            regionFloor.endOffset = region.endOffset;
            int i = regionFloor.endOffsetIndex;
            while (i < this.chunkIndex.length - 1) {
                int i2 = i + 1;
                if (this.chunkIndex.offsets[i2] > regionFloor.endOffset) {
                    break;
                } else {
                    i = i2;
                }
            }
            regionFloor.endOffsetIndex = i;
            return;
        }
        int iBinarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region.endOffset);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        region.endOffsetIndex = iBinarySearch;
        this.regions.add(region);
    }

    private boolean regionsConnect(androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region, androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    private static class Region implements java.lang.Comparable<androidx.media3.exoplayer.upstream.CachedRegionTracker.Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j2) {
            this.startOffset = j;
            this.endOffset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region) {
            return androidx.media3.common.util.Util.compareLong(this.startOffset, region.startOffset);
        }
    }
}
