package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
final class CachedContent {
    private static final java.lang.String TAG = "CachedContent";
    private final java.util.TreeSet<androidx.media3.datasource.cache.SimpleCacheSpan> cachedSpans;
    public final int id;
    public final java.lang.String key;
    private final java.util.ArrayList<androidx.media3.datasource.cache.CachedContent.Range> lockedRanges;
    private androidx.media3.datasource.cache.DefaultContentMetadata metadata;

    public CachedContent(int i, java.lang.String str) {
        this(i, str, androidx.media3.datasource.cache.DefaultContentMetadata.EMPTY);
    }

    public CachedContent(int i, java.lang.String str, androidx.media3.datasource.cache.DefaultContentMetadata defaultContentMetadata) {
        this.id = i;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new java.util.TreeSet<>();
        this.lockedRanges = new java.util.ArrayList<>();
    }

    public androidx.media3.datasource.cache.DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public boolean applyMetadataMutations(androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations) {
        androidx.media3.datasource.cache.DefaultContentMetadata defaultContentMetadata = this.metadata;
        androidx.media3.datasource.cache.DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean isFullyLocked(long j, long j2) {
        for (int i = 0; i < this.lockedRanges.size(); i++) {
            if (this.lockedRanges.get(i).contains(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean lockRange(long j, long j2) {
        for (int i = 0; i < this.lockedRanges.size(); i++) {
            if (this.lockedRanges.get(i).intersects(j, j2)) {
                return false;
            }
        }
        this.lockedRanges.add(new androidx.media3.datasource.cache.CachedContent.Range(j, j2));
        return true;
    }

    public void unlockRange(long j) {
        for (int i = 0; i < this.lockedRanges.size(); i++) {
            if (this.lockedRanges.get(i).position == j) {
                this.lockedRanges.remove(i);
                return;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public void addSpan(androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public java.util.TreeSet<androidx.media3.datasource.cache.SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public androidx.media3.datasource.cache.SimpleCacheSpan getSpan(long j, long j2) {
        androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpanCreateLookup = androidx.media3.datasource.cache.SimpleCacheSpan.createLookup(this.key, j);
        androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpanFloor = this.cachedSpans.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j) {
            return simpleCacheSpanFloor;
        }
        androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanCeiling != null) {
            long j3 = simpleCacheSpanCeiling.position - j;
            j2 = j2 == -1 ? j3 : java.lang.Math.min(j3, j2);
        }
        return androidx.media3.datasource.cache.SimpleCacheSpan.createHole(this.key, j, j2);
    }

    public long getCachedBytesLength(long j, long j2) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        androidx.media3.common.util.Assertions.checkArgument(j2 >= 0);
        androidx.media3.datasource.cache.SimpleCacheSpan span = getSpan(j, j2);
        if (span.isHoleSpan()) {
            return -java.lang.Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j4) {
            for (androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                if (simpleCacheSpan.position > jMax) {
                    break;
                }
                jMax = java.lang.Math.max(jMax, simpleCacheSpan.position + simpleCacheSpan.length);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return java.lang.Math.min(jMax - j, j2);
    }

    public androidx.media3.datasource.cache.SimpleCacheSpan setLastTouchTimestamp(androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan, long j, boolean z) {
        androidx.media3.common.util.Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        java.io.File file = (java.io.File) androidx.media3.common.util.Assertions.checkNotNull(simpleCacheSpan.file);
        if (z) {
            java.io.File cacheFile = androidx.media3.datasource.cache.SimpleCacheSpan.getCacheFile((java.io.File) androidx.media3.common.util.Assertions.checkNotNull(file.getParentFile()), this.id, simpleCacheSpan.position, j);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                androidx.media3.common.util.Log.w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        }
        androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpanCopyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j);
        this.cachedSpans.add(simpleCacheSpanCopyWithFileAndLastTouchTimestamp);
        return simpleCacheSpanCopyWithFileAndLastTouchTimestamp;
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean removeSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        if (cacheSpan.file == null) {
            return true;
        }
        cacheSpan.file.delete();
        return true;
    }

    public int hashCode() {
        return (((this.id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.datasource.cache.CachedContent cachedContent = (androidx.media3.datasource.cache.CachedContent) obj;
        return this.id == cachedContent.id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata);
    }

    private static final class Range {
        public final long length;
        public final long position;

        public Range(long j, long j2) {
            this.position = j;
            this.length = j2;
        }

        public boolean contains(long j, long j2) {
            long j3 = this.length;
            if (j3 == -1) {
                return j >= this.position;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.position;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean intersects(long j, long j2) {
            long j3 = this.position;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.length;
            return j4 == -1 || j3 + j4 > j;
        }
    }
}
