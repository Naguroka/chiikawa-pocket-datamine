package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleCache implements androidx.media3.datasource.cache.Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final java.lang.String TAG = "SimpleCache";
    private static final java.lang.String UID_FILE_SUFFIX = ".uid";
    private static final java.util.HashSet<java.io.File> lockedCacheDirs = new java.util.HashSet<>();
    private final java.io.File cacheDir;
    private final androidx.media3.datasource.cache.CachedContentIndex contentIndex;
    private final androidx.media3.datasource.cache.CacheEvictor evictor;
    private final androidx.media3.datasource.cache.CacheFileMetadataIndex fileIndex;
    private androidx.media3.datasource.cache.Cache.CacheException initializationException;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.media3.datasource.cache.Cache.Listener>> listeners;
    private final java.util.Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    public static synchronized boolean isCacheFolderLocked(java.io.File file) {
        return lockedCacheDirs.contains(file.getAbsoluteFile());
    }

    public static void delete(java.io.File file, androidx.media3.database.DatabaseProvider databaseProvider) {
        if (file.exists()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        androidx.media3.datasource.cache.CacheFileMetadataIndex.delete(databaseProvider, jLoadUid);
                    } catch (androidx.media3.database.DatabaseIOException unused) {
                        androidx.media3.common.util.Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                    try {
                        androidx.media3.datasource.cache.CachedContentIndex.delete(databaseProvider, jLoadUid);
                    } catch (androidx.media3.database.DatabaseIOException unused2) {
                        androidx.media3.common.util.Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                }
            }
            androidx.media3.common.util.Util.recursiveDelete(file);
        }
    }

    @java.lang.Deprecated
    public SimpleCache(java.io.File file, androidx.media3.datasource.cache.CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, null, false, true);
    }

    public SimpleCache(java.io.File file, androidx.media3.datasource.cache.CacheEvictor cacheEvictor, androidx.media3.database.DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    public SimpleCache(java.io.File file, androidx.media3.datasource.cache.CacheEvictor cacheEvictor, androidx.media3.database.DatabaseProvider databaseProvider, byte[] bArr, boolean z, boolean z2) {
        this(file, cacheEvictor, new androidx.media3.datasource.cache.CachedContentIndex(databaseProvider, file, bArr, z, z2), (databaseProvider == null || z2) ? null : new androidx.media3.datasource.cache.CacheFileMetadataIndex(databaseProvider));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media3.datasource.cache.SimpleCache$1] */
    SimpleCache(java.io.File file, androidx.media3.datasource.cache.CacheEvictor cacheEvictor, androidx.media3.datasource.cache.CachedContentIndex cachedContentIndex, androidx.media3.datasource.cache.CacheFileMetadataIndex cacheFileMetadataIndex) {
        if (!lockFolder(file)) {
            throw new java.lang.IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.cacheDir = file;
        this.evictor = cacheEvictor;
        this.contentIndex = cachedContentIndex;
        this.fileIndex = cacheFileMetadataIndex;
        this.listeners = new java.util.HashMap<>();
        this.random = new java.util.Random();
        this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
        this.uid = -1L;
        final android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        new java.lang.Thread("ExoPlayer:SimpleCacheInit") { // from class: androidx.media3.datasource.cache.SimpleCache.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (androidx.media3.datasource.cache.SimpleCache.this) {
                    conditionVariable.open();
                    androidx.media3.datasource.cache.SimpleCache.this.initialize();
                    androidx.media3.datasource.cache.SimpleCache.this.evictor.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    public synchronized void checkInitialization() throws androidx.media3.datasource.cache.Cache.CacheException {
        androidx.media3.datasource.cache.Cache.CacheException cacheException = this.initializationException;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getUid() {
        return this.uid;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpans();
        try {
            try {
                this.contentIndex.store();
                unlockFolder(this.cacheDir);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(TAG, "Storing index file failed", e);
                unlockFolder(this.cacheDir);
            }
            this.released = true;
        } catch (java.lang.Throwable th) {
            unlockFolder(this.cacheDir);
            this.released = true;
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized java.util.NavigableSet<androidx.media3.datasource.cache.CacheSpan> addListener(java.lang.String str, androidx.media3.datasource.cache.Cache.Listener listener) {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        androidx.media3.common.util.Assertions.checkNotNull(str);
        androidx.media3.common.util.Assertions.checkNotNull(listener);
        java.util.ArrayList<androidx.media3.datasource.cache.Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void removeListener(java.lang.String str, androidx.media3.datasource.cache.Cache.Listener listener) {
        if (this.released) {
            return;
        }
        java.util.ArrayList<androidx.media3.datasource.cache.Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized java.util.NavigableSet<androidx.media3.datasource.cache.CacheSpan> getCachedSpans(java.lang.String str) {
        java.util.TreeSet treeSet;
        androidx.media3.common.util.Assertions.checkState(!this.released);
        androidx.media3.datasource.cache.CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent == null || cachedContent.isEmpty()) {
            treeSet = new java.util.TreeSet();
        } else {
            treeSet = new java.util.TreeSet((java.util.Collection) cachedContent.getSpans());
        }
        return treeSet;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized java.util.Set<java.lang.String> getKeys() {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        return new java.util.HashSet(this.contentIndex.getKeys());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getCacheSpace() {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized androidx.media3.datasource.cache.CacheSpan startReadWrite(java.lang.String str, long j, long j2) throws java.lang.InterruptedException, androidx.media3.datasource.cache.Cache.CacheException {
        androidx.media3.datasource.cache.CacheSpan cacheSpanStartReadWriteNonBlocking;
        androidx.media3.common.util.Assertions.checkState(!this.released);
        checkInitialization();
        while (true) {
            cacheSpanStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j, j2);
            if (cacheSpanStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return cacheSpanStartReadWriteNonBlocking;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized androidx.media3.datasource.cache.CacheSpan startReadWriteNonBlocking(java.lang.String str, long j, long j2) throws androidx.media3.datasource.cache.Cache.CacheException {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        checkInitialization();
        androidx.media3.datasource.cache.SimpleCacheSpan span = getSpan(str, j, j2);
        if (span.isCached) {
            return touchSpan(str, span);
        }
        if (this.contentIndex.getOrAdd(str).lockRange(j, span.length)) {
            return span;
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized java.io.File startFile(java.lang.String str, long j, long j2) throws androidx.media3.datasource.cache.Cache.CacheException {
        androidx.media3.datasource.cache.CachedContent cachedContent;
        java.io.File file;
        androidx.media3.common.util.Assertions.checkState(!this.released);
        checkInitialization();
        cachedContent = this.contentIndex.get(str);
        androidx.media3.common.util.Assertions.checkNotNull(cachedContent);
        androidx.media3.common.util.Assertions.checkState(cachedContent.isFullyLocked(j, j2));
        if (!this.cacheDir.exists()) {
            createCacheDirectories(this.cacheDir);
            removeStaleSpans();
        }
        this.evictor.onStartFile(this, str, j, j2);
        file = new java.io.File(this.cacheDir, java.lang.Integer.toString(this.random.nextInt(10)));
        if (!file.exists()) {
            createCacheDirectories(file);
        }
        return androidx.media3.datasource.cache.SimpleCacheSpan.getCacheFile(file, cachedContent.id, j, java.lang.System.currentTimeMillis());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void commitFile(java.io.File file, long j) throws androidx.media3.datasource.cache.Cache.CacheException {
        boolean z = true;
        androidx.media3.common.util.Assertions.checkState(!this.released);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan = (androidx.media3.datasource.cache.SimpleCacheSpan) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.datasource.cache.SimpleCacheSpan.createCacheEntry(file, j, this.contentIndex));
            androidx.media3.datasource.cache.CachedContent cachedContent = (androidx.media3.datasource.cache.CachedContent) androidx.media3.common.util.Assertions.checkNotNull(this.contentIndex.get(simpleCacheSpan.key));
            androidx.media3.common.util.Assertions.checkState(cachedContent.isFullyLocked(simpleCacheSpan.position, simpleCacheSpan.length));
            long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(cachedContent.getMetadata());
            if (contentLength != -1) {
                if (simpleCacheSpan.position + simpleCacheSpan.length > contentLength) {
                    z = false;
                }
                androidx.media3.common.util.Assertions.checkState(z);
            }
            if (this.fileIndex != null) {
                try {
                    this.fileIndex.set(file.getName(), simpleCacheSpan.length, simpleCacheSpan.lastTouchTimestamp);
                    addSpan(simpleCacheSpan);
                    try {
                        this.contentIndex.store();
                        notifyAll();
                        return;
                    } catch (java.io.IOException e) {
                        throw new androidx.media3.datasource.cache.Cache.CacheException(e);
                    }
                } catch (java.io.IOException e2) {
                    throw new androidx.media3.datasource.cache.Cache.CacheException(e2);
                }
            }
            addSpan(simpleCacheSpan);
            this.contentIndex.store();
            notifyAll();
            return;
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void releaseHoleSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        androidx.media3.datasource.cache.CachedContent cachedContent = (androidx.media3.datasource.cache.CachedContent) androidx.media3.common.util.Assertions.checkNotNull(this.contentIndex.get(cacheSpan.key));
        cachedContent.unlockRange(cacheSpan.position);
        this.contentIndex.maybeRemove(cachedContent.key);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void removeResource(java.lang.String str) {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        java.util.Iterator<androidx.media3.datasource.cache.CacheSpan> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void removeSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        removeSpanInternal(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized boolean isCached(java.lang.String str, long j, long j2) {
        androidx.media3.datasource.cache.CachedContent cachedContent;
        androidx.media3.common.util.Assertions.checkState(!this.released);
        cachedContent = this.contentIndex.get(str);
        return cachedContent != null && cachedContent.getCachedBytesLength(j, j2) >= j2;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getCachedLength(java.lang.String str, long j, long j2) {
        androidx.media3.datasource.cache.CachedContent cachedContent;
        androidx.media3.common.util.Assertions.checkState(!this.released);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.contentIndex.get(str);
        return cachedContent != null ? cachedContent.getCachedBytesLength(j, j2) : -j2;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized long getCachedBytes(java.lang.String str, long j, long j2) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 < 0 ? Long.MAX_VALUE : j4;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long cachedLength = getCachedLength(str, j6, j5 - j6);
            if (cachedLength > 0) {
                j3 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j6 += cachedLength;
        }
        return j3;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void applyContentMetadataMutations(java.lang.String str, androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations) throws androidx.media3.datasource.cache.Cache.CacheException {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        checkInitialization();
        this.contentIndex.applyContentMetadataMutations(str, contentMetadataMutations);
        try {
            this.contentIndex.store();
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.cache.Cache.CacheException(e);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized androidx.media3.datasource.cache.ContentMetadata getContentMetadata(java.lang.String str) {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        return this.contentIndex.getContentMetadata(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (androidx.media3.datasource.cache.Cache.CacheException e) {
                this.initializationException = e;
                return;
            }
        }
        java.io.File[] fileArrListFiles = this.cacheDir.listFiles();
        if (fileArrListFiles == null) {
            java.lang.String str = "Failed to list cache directory files: " + this.cacheDir;
            androidx.media3.common.util.Log.e(TAG, str);
            this.initializationException = new androidx.media3.datasource.cache.Cache.CacheException(str);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.uid = jLoadUid;
        if (jLoadUid == -1) {
            try {
                this.uid = createUid(this.cacheDir);
            } catch (java.io.IOException e2) {
                java.lang.String str2 = "Failed to create cache UID: " + this.cacheDir;
                androidx.media3.common.util.Log.e(TAG, str2, e2);
                this.initializationException = new androidx.media3.datasource.cache.Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            this.contentIndex.initialize(this.uid);
            androidx.media3.datasource.cache.CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.initialize(this.uid);
                java.util.Map<java.lang.String, androidx.media3.datasource.cache.CacheFileMetadata> all = this.fileIndex.getAll();
                loadDirectory(this.cacheDir, true, fileArrListFiles, all);
                this.fileIndex.removeAll(all.keySet());
            } else {
                loadDirectory(this.cacheDir, true, fileArrListFiles, null);
            }
            this.contentIndex.removeEmpty();
            try {
                this.contentIndex.store();
            } catch (java.io.IOException e3) {
                androidx.media3.common.util.Log.e(TAG, "Storing index file failed", e3);
            }
        } catch (java.io.IOException e4) {
            java.lang.String str3 = "Failed to initialize cache indices: " + this.cacheDir;
            androidx.media3.common.util.Log.e(TAG, str3, e4);
            this.initializationException = new androidx.media3.datasource.cache.Cache.CacheException(str3, e4);
        }
    }

    private void loadDirectory(java.io.File file, boolean z, java.io.File[] fileArr, java.util.Map<java.lang.String, androidx.media3.datasource.cache.CacheFileMetadata> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (java.io.File file2 : fileArr) {
            java.lang.String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z || (!androidx.media3.datasource.cache.CachedContentIndex.isIndexFile(name) && !name.endsWith(UID_FILE_SUFFIX))) {
                androidx.media3.datasource.cache.CacheFileMetadata cacheFileMetadataRemove = map != null ? map.remove(name) : null;
                if (cacheFileMetadataRemove != null) {
                    j2 = cacheFileMetadataRemove.length;
                    j = cacheFileMetadataRemove.lastTouchTimestamp;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpanCreateCacheEntry = androidx.media3.datasource.cache.SimpleCacheSpan.createCacheEntry(file2, j2, j, this.contentIndex);
                if (simpleCacheSpanCreateCacheEntry != null) {
                    addSpan(simpleCacheSpanCreateCacheEntry);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private androidx.media3.datasource.cache.SimpleCacheSpan touchSpan(java.lang.String str, androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan) {
        boolean z;
        if (!this.touchCacheSpans) {
            return simpleCacheSpan;
        }
        java.lang.String name = ((java.io.File) androidx.media3.common.util.Assertions.checkNotNull(simpleCacheSpan.file)).getName();
        long j = simpleCacheSpan.length;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        androidx.media3.datasource.cache.CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
        if (cacheFileMetadataIndex != null) {
            try {
                cacheFileMetadataIndex.set(name, j, jCurrentTimeMillis);
            } catch (java.io.IOException unused) {
                androidx.media3.common.util.Log.w(TAG, "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        androidx.media3.datasource.cache.SimpleCacheSpan lastTouchTimestamp = ((androidx.media3.datasource.cache.CachedContent) androidx.media3.common.util.Assertions.checkNotNull(this.contentIndex.get(str))).setLastTouchTimestamp(simpleCacheSpan, jCurrentTimeMillis, z);
        notifySpanTouched(simpleCacheSpan, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private androidx.media3.datasource.cache.SimpleCacheSpan getSpan(java.lang.String str, long j, long j2) {
        androidx.media3.datasource.cache.SimpleCacheSpan span;
        androidx.media3.datasource.cache.CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent == null) {
            return androidx.media3.datasource.cache.SimpleCacheSpan.createHole(str, j, j2);
        }
        while (true) {
            span = cachedContent.getSpan(j, j2);
            if (!span.isCached || ((java.io.File) androidx.media3.common.util.Assertions.checkNotNull(span.file)).length() == span.length) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    private void addSpan(androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan) {
        this.contentIndex.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private void removeSpanInternal(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        androidx.media3.datasource.cache.CachedContent cachedContent = this.contentIndex.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            java.lang.String name = ((java.io.File) androidx.media3.common.util.Assertions.checkNotNull(cacheSpan.file)).getName();
            try {
                this.fileIndex.remove(name);
            } catch (java.io.IOException unused) {
                androidx.media3.common.util.Log.w(TAG, "Failed to remove file index entry for: " + name);
            }
        }
        this.contentIndex.maybeRemove(cachedContent.key);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.media3.datasource.cache.CachedContent> it = this.contentIndex.getAll().iterator();
        while (it.hasNext()) {
            for (androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan : it.next().getSpans()) {
                if (((java.io.File) androidx.media3.common.util.Assertions.checkNotNull(simpleCacheSpan.file)).length() != simpleCacheSpan.length) {
                    arrayList.add(simpleCacheSpan);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpanInternal((androidx.media3.datasource.cache.CacheSpan) arrayList.get(i));
        }
    }

    private void notifySpanRemoved(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        java.util.ArrayList<androidx.media3.datasource.cache.Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanAdded(androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan) {
        java.util.ArrayList<androidx.media3.datasource.cache.Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanTouched(androidx.media3.datasource.cache.SimpleCacheSpan simpleCacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        java.util.ArrayList<androidx.media3.datasource.cache.Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static long loadUid(java.io.File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            java.io.File file = fileArr[i];
            java.lang.String name = file.getName();
            if (name.endsWith(UID_FILE_SUFFIX)) {
                try {
                    return parseUid(name);
                } catch (java.lang.NumberFormatException unused) {
                    androidx.media3.common.util.Log.e(TAG, "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static long createUid(java.io.File file) throws java.io.IOException {
        long jNextLong = new java.security.SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : java.lang.Math.abs(jNextLong);
        java.io.File file2 = new java.io.File(file, java.lang.Long.toString(jAbs, 16) + UID_FILE_SUFFIX);
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new java.io.IOException("Failed to create UID file: " + file2);
    }

    private static long parseUid(java.lang.String str) {
        return java.lang.Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private static void createCacheDirectories(java.io.File file) throws androidx.media3.datasource.cache.Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        java.lang.String str = "Failed to create cache directory: " + file;
        androidx.media3.common.util.Log.e(TAG, str);
        throw new androidx.media3.datasource.cache.Cache.CacheException(str);
    }

    private static synchronized boolean lockFolder(java.io.File file) {
        return lockedCacheDirs.add(file.getAbsoluteFile());
    }

    private static synchronized void unlockFolder(java.io.File file) {
        lockedCacheDirs.remove(file.getAbsoluteFile());
    }
}
