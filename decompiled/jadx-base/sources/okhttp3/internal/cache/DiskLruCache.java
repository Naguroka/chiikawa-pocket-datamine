package okhttp3.internal.cache;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010)\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004[\\]^B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0016J!\u0010;\u001a\u0002092\n\u0010<\u001a\u00060=R\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0002\b?J\u0006\u0010@\u001a\u000209J \u0010A\u001a\b\u0018\u00010=R\u00020\u00002\u0006\u0010B\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0007J\u0006\u0010D\u001a\u000209J\b\u0010E\u001a\u000209H\u0016J\u0017\u0010F\u001a\b\u0018\u00010GR\u00020\u00002\u0006\u0010B\u001a\u00020(H\u0086\u0002J\u0006\u0010H\u001a\u000209J\u0006\u0010I\u001a\u00020\u0010J\b\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\u0010\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020(H\u0002J\r\u0010P\u001a\u000209H\u0000¢\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020\u00102\u0006\u0010B\u001a\u00020(J\u0019\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0002\bUJ\b\u0010V\u001a\u00020\u0010H\u0002J\u0006\u00105\u001a\u00020\u000bJ\u0010\u0010W\u001a\f\u0012\b\u0012\u00060GR\u00020\u00000XJ\u0006\u0010Y\u001a\u000209J\u0010\u0010Z\u001a\u0002092\u0006\u0010B\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\b\u0012\u00060)R\u00020\u00000'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010\n\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006_"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", com.ironsource.y8.i.W, "", "valueCount", "maxSize", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "civilizedFileSystem", "", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getDirectory", "()Ljava/io/File;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "value", "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "size", "getValueCount$okhttp", "()I", "checkNotClosed", "", "close", "completeEdit", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "success", "completeEdit$okhttp", "delete", "edit", com.ironsource.y8.h.W, "expectedSequenceNumber", "evictAll", "flush", "get", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "isClosed", "journalRebuildRequired", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "rebuildJournal", "rebuildJournal$okhttp", "remove", "removeEntry", "entry", "removeEntry$okhttp", "removeOldestEntry", "snapshots", "", "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.cache.DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final java.io.File directory;
    private final okhttp3.internal.io.FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final java.io.File journalFile;
    private final java.io.File journalFileBackup;
    private final java.io.File journalFileTmp;
    private okio.BufferedSink journalWriter;
    private final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final java.lang.String JOURNAL_FILE = "journal";
    public static final java.lang.String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final java.lang.String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final java.lang.String MAGIC = "libcore.io.DiskLruCache";
    public static final java.lang.String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final kotlin.text.Regex LEGAL_KEY_PATTERN = new kotlin.text.Regex("[a-z0-9_-]{1,120}");
    public static final java.lang.String CLEAN = "CLEAN";
    public static final java.lang.String DIRTY = "DIRTY";
    public static final java.lang.String REMOVE = "REMOVE";
    public static final java.lang.String READ = "READ";

    public final okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String key) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(okhttp3.internal.io.FileSystem fileSystem, java.io.File directory, int i, int i2, long j, okhttp3.internal.concurrent.TaskRunner taskRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        this.lruEntries = new java.util.LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final java.lang.String str = okhttp3.internal.Util.okHttpName + " Cache";
        this.cleanupTask = new okhttp3.internal.concurrent.Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!diskLruCache.initialized || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (java.io.IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (diskLruCache.journalRebuildRequired()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (java.io.IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = okio.Okio.buffer(okio.Okio.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (!(j > 0)) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i2 > 0)) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new java.io.File(directory, JOURNAL_FILE);
        this.journalFileTmp = new java.io.File(directory, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new java.io.File(directory, JOURNAL_FILE_BACKUP);
    }

    /* JADX INFO: renamed from: getFileSystem$okhttp, reason: from getter */
    public final okhttp3.internal.io.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    public final java.io.File getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    private final void readJournal() throws java.io.IOException {
        okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(this.fileSystem.source(this.journalFile));
        try {
            okio.BufferedSource bufferedSource = bufferedSourceBuffer;
            java.lang.String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            java.lang.String utf8LineStrict2 = bufferedSource.readUtf8LineStrict();
            java.lang.String utf8LineStrict3 = bufferedSource.readUtf8LineStrict();
            java.lang.String utf8LineStrict4 = bufferedSource.readUtf8LineStrict();
            java.lang.String utf8LineStrict5 = bufferedSource.readUtf8LineStrict();
            if (kotlin.jvm.internal.Intrinsics.areEqual(MAGIC, utf8LineStrict) && kotlin.jvm.internal.Intrinsics.areEqual(VERSION_1, utf8LineStrict2) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(this.appVersion), utf8LineStrict3) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(this.valueCount), utf8LineStrict4)) {
                int i = 0;
                if (!(utf8LineStrict5.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(bufferedSource.readUtf8LineStrict());
                            i++;
                        } catch (java.io.EOFException unused) {
                            this.redundantOpCount = i - this.lruEntries.size();
                            if (!bufferedSource.exhausted()) {
                                rebuildJournal$okhttp();
                            } else {
                                this.journalWriter = newJournalWriter();
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer, null);
                            return;
                        }
                    }
                }
            }
            throw new java.io.IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer, th);
                throw th2;
            }
        }
    }

    private final okio.BufferedSink newJournalWriter() throws java.io.FileNotFoundException {
        return okio.Okio.buffer(new okhttp3.internal.cache.FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new kotlin.jvm.functions.Function1<java.io.IOException, kotlin.Unit>() { // from class: okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.io.IOException iOException) {
                invoke2(iOException);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.io.IOException it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
                if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(diskLruCache)) {
                    this.this$0.hasJournalErrors = true;
                    return;
                }
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
        }));
    }

    private final void readJournalLine(java.lang.String line) throws java.io.IOException {
        java.lang.String strSubstring;
        java.lang.String str = line;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ' ', 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            throw new java.io.IOException("unexpected journal line: " + line);
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ' ', i, false, 4, (java.lang.Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = line.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            java.lang.String str2 = REMOVE;
            if (iIndexOf$default == str2.length() && kotlin.text.StringsKt.startsWith$default(line, str2, false, 2, (java.lang.Object) null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i, iIndexOf$default2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new okhttp3.internal.cache.DiskLruCache.Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf$default2 != -1) {
            java.lang.String str3 = CLEAN;
            if (iIndexOf$default == str3.length() && kotlin.text.StringsKt.startsWith$default(line, str3, false, 2, (java.lang.Object) null)) {
                java.lang.String strSubstring2 = line.substring(iIndexOf$default2 + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                java.util.List<java.lang.String> listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (java.lang.Object) null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            java.lang.String str4 = DIRTY;
            if (iIndexOf$default == str4.length() && kotlin.text.StringsKt.startsWith$default(line, str4, false, 2, (java.lang.Object) null)) {
                entry.setCurrentEditor$okhttp(new okhttp3.internal.cache.DiskLruCache.Editor(this, entry));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            java.lang.String str5 = READ;
            if (iIndexOf$default == str5.length() && kotlin.text.StringsKt.startsWith$default(line, str5, false, 2, (java.lang.Object) null)) {
                return;
            }
        }
        throw new java.io.IOException("unexpected journal line: " + line);
    }

    private final void processJournal() throws java.io.IOException {
        this.fileSystem.delete(this.journalFileTmp);
        java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            okhttp3.internal.cache.DiskLruCache.Entry next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            okhttp3.internal.cache.DiskLruCache.Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
        okio.BufferedSink bufferedSink = this.journalWriter;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
        try {
            okio.BufferedSink bufferedSink2 = bufferedSinkBuffer;
            bufferedSink2.writeUtf8(MAGIC).writeByte(10);
            bufferedSink2.writeUtf8(VERSION_1).writeByte(10);
            bufferedSink2.writeDecimalLong(this.appVersion).writeByte(10);
            bufferedSink2.writeDecimalLong(this.valueCount).writeByte(10);
            bufferedSink2.writeByte(10);
            for (okhttp3.internal.cache.DiskLruCache.Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor() != null) {
                    bufferedSink2.writeUtf8(DIRTY).writeByte(32);
                    bufferedSink2.writeUtf8(entry.getKey());
                    bufferedSink2.writeByte(10);
                } else {
                    bufferedSink2.writeUtf8(CLEAN).writeByte(32);
                    bufferedSink2.writeUtf8(entry.getKey());
                    entry.writeLengths$okhttp(bufferedSink2);
                    bufferedSink2.writeByte(10);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedSinkBuffer, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(bufferedSinkBuffer, th);
                throw th2;
            }
        }
    }

    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String key) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        okio.BufferedSink bufferedSink = this.journalWriter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
        bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
        if (journalRebuildRequired()) {
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    public static /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor edit$default(okhttp3.internal.cache.DiskLruCache diskLruCache, java.lang.String str, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String key, long expectedSequenceNumber) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
            bufferedSink.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new okhttp3.internal.cache.DiskLruCache.Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            okhttp3.internal.cache.DiskLruCache.Editor editor = new okhttp3.internal.cache.DiskLruCache.Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized long size() throws java.io.IOException {
        initialize();
        return this.size;
    }

    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor editor, boolean success) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editor, "editor");
        okhttp3.internal.cache.DiskLruCache.Entry entry = editor.getEntry();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (success && !entry.getReadable()) {
            int i = this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] written = editor.getWritten();
                kotlin.jvm.internal.Intrinsics.checkNotNull(written);
                if (!written[i2]) {
                    editor.abort();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i2))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i3 = this.valueCount;
        for (int i4 = 0; i4 < i3; i4++) {
            java.io.File file = entry.getDirtyFiles$okhttp().get(i4);
            if (success && !entry.getZombie()) {
                if (this.fileSystem.exists(file)) {
                    java.io.File file2 = entry.getCleanFiles$okhttp().get(i4);
                    this.fileSystem.rename(file, file2);
                    long j = entry.getLengths()[i4];
                    long size = this.fileSystem.size(file2);
                    entry.getLengths()[i4] = size;
                    this.size = (this.size - j) + size;
                }
            } else {
                this.fileSystem.delete(file);
            }
        }
        entry.setCurrentEditor$okhttp(null);
        if (entry.getZombie()) {
            removeEntry$okhttp(entry);
            return;
        }
        this.redundantOpCount++;
        okio.BufferedSink bufferedSink = this.journalWriter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
        if (entry.getReadable() || success) {
            entry.setReadable$okhttp(true);
            bufferedSink.writeUtf8(CLEAN).writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            entry.writeLengths$okhttp(bufferedSink);
            bufferedSink.writeByte(10);
            if (success) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.setSequenceNumber$okhttp(j2);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            bufferedSink.writeUtf8(REMOVE).writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public final synchronized boolean remove(java.lang.String key) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        okhttp3.internal.cache.DiskLruCache.Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(okhttp3.internal.cache.DiskLruCache.Entry entry) throws java.io.IOException {
        okio.BufferedSink bufferedSink;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (bufferedSink = this.journalWriter) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        okhttp3.internal.cache.DiskLruCache.Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.redundantOpCount++;
        okio.BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRebuildRequired()) {
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        okhttp3.internal.cache.DiskLruCache.Editor currentEditor;
        if (this.initialized && !this.closed) {
            java.util.Collection<okhttp3.internal.cache.DiskLruCache.Entry> collectionValues = this.lruEntries.values();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
            for (okhttp3.internal.cache.DiskLruCache.Entry entry : (okhttp3.internal.cache.DiskLruCache.Entry[]) collectionValues.toArray(new okhttp3.internal.cache.DiskLruCache.Entry[0])) {
                if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                    currentEditor.detach$okhttp();
                }
            }
            trimToSize();
            okio.BufferedSink bufferedSink = this.journalWriter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public final void trimToSize() throws java.io.IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final boolean removeOldestEntry() throws java.io.IOException {
        for (okhttp3.internal.cache.DiskLruCache.Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                removeEntry$okhttp(toEvict);
                return true;
            }
        }
        return false;
    }

    public final void delete() throws java.io.IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final synchronized void evictAll() throws java.io.IOException {
        initialize();
        java.util.Collection<okhttp3.internal.cache.DiskLruCache.Entry> collectionValues = this.lruEntries.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
        for (okhttp3.internal.cache.DiskLruCache.Entry entry : (okhttp3.internal.cache.DiskLruCache.Entry[]) collectionValues.toArray(new okhttp3.internal.cache.DiskLruCache.Entry[0])) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    private final void validateKey(java.lang.String key) {
        if (!LEGAL_KEY_PATTERN.matches(key)) {
            throw new java.lang.IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + kotlin.text.Typography.quote).toString());
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\r\u0010\u000b\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012 \u0006*\b\u0018\u00010\u0005R\u00020\u00030\u0005R\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "nextSnapshot", "removeSnapshot", "hasNext", "", "next", "remove", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, kotlin.jvm.internal.markers.KMutableIterator {
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> delegate;
        private okhttp3.internal.cache.DiskLruCache.Snapshot nextSnapshot;
        private okhttp3.internal.cache.DiskLruCache.Snapshot removeSnapshot;

        AnonymousClass1() {
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> it = new java.util.ArrayList(okhttp3.internal.cache.DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            okhttp3.internal.cache.DiskLruCache.Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            okhttp3.internal.cache.DiskLruCache diskLruCache = okhttp3.internal.cache.DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    okhttp3.internal.cache.DiskLruCache.Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return false;
            }
        }

        @Override // java.util.Iterator
        public okhttp3.internal.cache.DiskLruCache.Snapshot next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot);
            return snapshot;
        }

        @Override // java.util.Iterator
        public void remove() {
            okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new java.lang.IllegalStateException("remove() before next()".toString());
            }
            try {
                okhttp3.internal.cache.DiskLruCache.this.remove(snapshot.getKey());
            } catch (java.io.IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }
    }

    public final synchronized java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> snapshots() throws java.io.IOException {
        initialize();
        return new okhttp3.internal.cache.DiskLruCache.AnonymousClass1();
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", com.ironsource.y8.h.W, "", "sequenceNumber", "", "sources", "", "Lokio/Source;", "lengths", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "close", "", "edit", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getLength", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getSource", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Snapshot implements java.io.Closeable {
        private final java.lang.String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final java.util.List<okio.Source> sources;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(okhttp3.internal.cache.DiskLruCache diskLruCache, java.lang.String key, long j, java.util.List<? extends okio.Source> sources, long[] lengths) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sources, "sources");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j;
            this.sources = sources;
            this.lengths = lengths;
        }

        /* JADX INFO: renamed from: key, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        public final okhttp3.internal.cache.DiskLruCache.Editor edit() throws java.io.IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final okio.Source getSource(int index) {
            return this.sources.get(index);
        }

        public final long getLength(int index) {
            return this.lengths[index];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            java.util.Iterator<okio.Source> it = this.sources.iterator();
            while (it.hasNext()) {
                okhttp3.internal.Util.closeQuietly(it.next());
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "done", "", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "written", "", "getWritten$okhttp", org.jacoco.core.internal.instr.InstrSupport.INITMETHOD_DESC, "abort", "", "commit", "detach", "detach$okhttp", "newSink", "Lokio/Sink;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "newSource", "Lokio/Source;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Editor {
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Entry entry;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private final boolean[] written;

        public Editor(okhttp3.internal.cache.DiskLruCache diskLruCache, okhttp3.internal.cache.DiskLruCache.Entry entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        /* JADX INFO: renamed from: getEntry$okhttp, reason: from getter */
        public final okhttp3.internal.cache.DiskLruCache.Entry getEntry() {
            return this.entry;
        }

        /* JADX INFO: renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final void detach$okhttp() throws java.io.IOException {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final okio.Source newSource(int index) {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                okio.Source source = null;
                if (!this.entry.getReadable() || !kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    source = diskLruCache.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                } catch (java.io.FileNotFoundException unused) {
                }
                return source;
            }
        }

        public final okio.Sink newSink(int index) {
            final okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    return okio.Okio.blackhole();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zArr);
                    zArr[index] = true;
                }
                try {
                    return new okhttp3.internal.cache.FaultHidingSink(diskLruCache.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new kotlin.jvm.functions.Function1<java.io.IOException, kotlin.Unit>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.io.IOException iOException) {
                            invoke2(iOException);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(java.io.IOException it) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                            okhttp3.internal.cache.DiskLruCache diskLruCache2 = diskLruCache;
                            okhttp3.internal.cache.DiskLruCache.Editor editor = this;
                            synchronized (diskLruCache2) {
                                editor.detach$okhttp();
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    });
                } catch (java.io.FileNotFoundException unused) {
                    return okio.Okio.blackhole();
                }
            }
        }

        public final void commit() throws java.io.IOException {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.done = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public final void abort() throws java.io.IOException {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit$okhttp(this, false);
                }
                this.done = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001aH\u0002J\u001b\u00105\u001a\u0002062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0000¢\u0006\u0002\b7J\u0013\u00108\u001a\b\u0018\u000109R\u00020\fH\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$¨\u0006?"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", com.ironsource.y8.h.W, "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "cleanFiles", "", "Ljava/io/File;", "getCleanFiles$okhttp", "()Ljava/util/List;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "getKey$okhttp", "()Ljava/lang/String;", "lengths", "", "getLengths$okhttp", "()[J", "lockingSourceCount", "", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "readable", "", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "sequenceNumber", "", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "invalidLengths", "", "strings", "", "newSource", "Lokio/Source;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setLengths", "", "setLengths$okhttp", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot$okhttp", "writeLengths", "writer", "Lokio/BufferedSink;", "writeLengths$okhttp", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Entry {
        private final java.util.List<java.io.File> cleanFiles;
        private okhttp3.internal.cache.DiskLruCache.Editor currentEditor;
        private final java.util.List<java.io.File> dirtyFiles;
        private final java.lang.String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private boolean zombie;

        public Entry(okhttp3.internal.cache.DiskLruCache diskLruCache, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new java.util.ArrayList();
            this.dirtyFiles = new java.util.ArrayList();
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder(key).append('.');
            int length = sbAppend.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i = 0; i < valueCount; i++) {
                sbAppend.append(i);
                this.cleanFiles.add(new java.io.File(this.this$0.getDirectory(), sbAppend.toString()));
                sbAppend.append(".tmp");
                this.dirtyFiles.add(new java.io.File(this.this$0.getDirectory(), sbAppend.toString()));
                sbAppend.setLength(length);
            }
        }

        /* JADX INFO: renamed from: getKey$okhttp, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        public final java.util.List<java.io.File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final java.util.List<java.io.File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        /* JADX INFO: renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        /* JADX INFO: renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        /* JADX INFO: renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final okhttp3.internal.cache.DiskLruCache.Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final void setCurrentEditor$okhttp(okhttp3.internal.cache.DiskLruCache.Editor editor) {
            this.currentEditor = editor;
        }

        /* JADX INFO: renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        /* JADX INFO: renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setLengths$okhttp(java.util.List<java.lang.String> strings) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.this$0.getValueCount()) {
                invalidLengths(strings);
                throw new kotlin.KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = java.lang.Long.parseLong(strings.get(i));
                }
            } catch (java.lang.NumberFormatException unused) {
                invalidLengths(strings);
                throw new kotlin.KotlinNothingValueException();
            }
        }

        public final void writeLengths$okhttp(okio.BufferedSink writer) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j : this.lengths) {
                writer.writeByte(32).writeDecimalLong(j);
            }
        }

        private final java.lang.Void invalidLengths(java.util.List<java.lang.String> strings) throws java.io.IOException {
            throw new java.io.IOException("unexpected journal line: " + strings);
        }

        public final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp() {
            okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(diskLruCache)) {
                if (!this.readable) {
                    return null;
                }
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount = this.this$0.getValueCount();
                    for (int i = 0; i < valueCount; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new okhttp3.internal.cache.DiskLruCache.Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (java.io.FileNotFoundException unused) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        okhttp3.internal.Util.closeQuietly((okio.Source) it.next());
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (java.io.IOException unused2) {
                    }
                    return null;
                }
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
        }

        private final okio.Source newSource(int index) throws java.io.FileNotFoundException {
            final okio.Source source = this.this$0.getFileSystem().source(this.cleanFiles.get(index));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final okhttp3.internal.cache.DiskLruCache diskLruCache = this.this$0;
            return new okio.ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    okhttp3.internal.cache.DiskLruCache diskLruCache2 = diskLruCache;
                    okhttp3.internal.cache.DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                        if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public final synchronized void initialize() throws java.io.IOException {
        if (okhttp3.internal.Util.assertionsEnabled && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = okhttp3.internal.Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (java.io.IOException e) {
                okhttp3.internal.platform.Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                try {
                    delete();
                    this.closed = false;
                    rebuildJournal$okhttp();
                    this.initialized = true;
                } catch (java.lang.Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }
}
