package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
final class SimpleCacheSpan extends androidx.media3.datasource.cache.CacheSpan {
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V1 = java.util.regex.Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V2 = java.util.regex.Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V3 = java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    static final java.lang.String COMMON_SUFFIX = ".exo";
    private static final java.lang.String SUFFIX = ".v3.exo";

    public static java.io.File getCacheFile(java.io.File file, int i, long j, long j2) {
        return new java.io.File(file, i + "." + j + "." + j2 + SUFFIX);
    }

    public static androidx.media3.datasource.cache.SimpleCacheSpan createLookup(java.lang.String str, long j) {
        return new androidx.media3.datasource.cache.SimpleCacheSpan(str, j, -1L, androidx.media3.common.C.TIME_UNSET, null);
    }

    public static androidx.media3.datasource.cache.SimpleCacheSpan createHole(java.lang.String str, long j, long j2) {
        return new androidx.media3.datasource.cache.SimpleCacheSpan(str, j, j2, androidx.media3.common.C.TIME_UNSET, null);
    }

    public static androidx.media3.datasource.cache.SimpleCacheSpan createCacheEntry(java.io.File file, long j, androidx.media3.datasource.cache.CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j, androidx.media3.common.C.TIME_UNSET, cachedContentIndex);
    }

    public static androidx.media3.datasource.cache.SimpleCacheSpan createCacheEntry(java.io.File file, long j, long j2, androidx.media3.datasource.cache.CachedContentIndex cachedContentIndex) {
        java.io.File file2;
        java.lang.String keyForId;
        java.lang.String name = file.getName();
        if (name.endsWith(SUFFIX)) {
            file2 = file;
        } else {
            java.io.File fileUpgradeFile = upgradeFile(file, cachedContentIndex);
            if (fileUpgradeFile == null) {
                return null;
            }
            file2 = fileUpgradeFile;
            name = fileUpgradeFile.getName();
        }
        java.util.regex.Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches() || (keyForId = cachedContentIndex.getKeyForId(java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new androidx.media3.datasource.cache.SimpleCacheSpan(keyForId, java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))), length, j2 == androidx.media3.common.C.TIME_UNSET ? java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(3))) : j2, file2);
    }

    private static java.io.File upgradeFile(java.io.File file, androidx.media3.datasource.cache.CachedContentIndex cachedContentIndex) {
        java.lang.String strUnescapeFileName;
        java.lang.String name = file.getName();
        java.util.regex.Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = androidx.media3.common.util.Util.unescapeFileName((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            strUnescapeFileName = matcher.matches() ? (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)) : null;
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        java.io.File cacheFile = getCacheFile((java.io.File) androidx.media3.common.util.Assertions.checkStateNotNull(file.getParentFile()), cachedContentIndex.assignIdForKey(strUnescapeFileName), java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))), java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(3))));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    private SimpleCacheSpan(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        super(str, j, j2, j3, file);
    }

    public androidx.media3.datasource.cache.SimpleCacheSpan copyWithFileAndLastTouchTimestamp(java.io.File file, long j) {
        androidx.media3.common.util.Assertions.checkState(this.isCached);
        return new androidx.media3.datasource.cache.SimpleCacheSpan(this.key, this.position, this.length, j, file);
    }
}
