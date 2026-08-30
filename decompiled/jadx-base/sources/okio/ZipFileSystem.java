package okio;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "fileSystem", "entries", "", "Lokio/internal/ZipEntry;", "comment", "", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "appendingSink", "Lokio/Sink;", com.ironsource.y8.h.b, "mustExist", "", "atomicMove", "", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ZipFileSystem extends okio.FileSystem {
    private static final okio.ZipFileSystem.Companion Companion = new okio.ZipFileSystem.Companion(null);
    private static final okio.Path ROOT = okio.Path.Companion.get$default(okio.Path.INSTANCE, "/", false, 1, (java.lang.Object) null);
    private final java.lang.String comment;
    private final java.util.Map<okio.Path, okio.internal.ZipEntry> entries;
    private final okio.FileSystem fileSystem;
    private final okio.Path zipPath;

    public ZipFileSystem(okio.Path zipPath, okio.FileSystem fileSystem, java.util.Map<okio.Path, okio.internal.ZipEntry> entries, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path path) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new java.io.FileNotFoundException(java.lang.String.valueOf(path));
    }

    private final okio.Path canonicalizeInternal(okio.Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) throws java.lang.Throwable {
        okio.FileMetadata localHeader;
        java.lang.Throwable th;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.internal.ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        java.lang.Throwable th2 = null;
        if (zipEntry == null) {
            return null;
        }
        okio.FileMetadata fileMetadata = new okio.FileMetadata(!zipEntry.getIsDirectory(), zipEntry.getIsDirectory(), null, zipEntry.getIsDirectory() ? null : java.lang.Long.valueOf(zipEntry.getSize()), null, zipEntry.getLastModifiedAtMillis(), null, null, 128, null);
        if (zipEntry.getOffset() == -1) {
            return fileMetadata;
        }
        okio.FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        try {
            okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            try {
                localHeader = okio.internal.ZipFilesKt.readLocalHeader(bufferedSourceBuffer, fileMetadata);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th4) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (java.lang.Throwable th5) {
                        kotlin.ExceptionsKt.addSuppressed(th4, th5);
                    }
                }
                th = th4;
                localHeader = null;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(localHeader);
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (java.lang.Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(localHeader);
            return localHeader;
        } catch (java.lang.Throwable th7) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (java.lang.Throwable th8) {
                    kotlin.ExceptionsKt.addSuppressed(th7, th8);
                }
            }
            localHeader = null;
            th2 = th7;
        }
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.lang.UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.io.IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path dir) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.util.List<okio.Path> list = list(dir, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    private final java.util.List<okio.Path> list(okio.Path dir, boolean throwOnFailure) throws java.io.IOException {
        okio.internal.ZipEntry zipEntry = this.entries.get(canonicalizeInternal(dir));
        if (zipEntry != null) {
            return kotlin.collections.CollectionsKt.toList(zipEntry.getChildren());
        }
        if (throwOnFailure) {
            throw new java.io.IOException("not a directory: " + dir);
        }
        return null;
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path file) throws java.lang.Throwable {
        okio.BufferedSource bufferedSourceBuffer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        okio.internal.ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
        if (zipEntry == null) {
            throw new java.io.FileNotFoundException("no such file: " + file);
        }
        okio.FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        java.lang.Throwable th = null;
        try {
            bufferedSourceBuffer = okio.Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            bufferedSourceBuffer = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSourceBuffer);
        okio.internal.ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        if (zipEntry.getCompressionMethod() == 0) {
            return new okio.internal.FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true);
        }
        return new okio.internal.FixedLengthSource(new okio.InflaterSource(new okio.internal.FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new java.util.zip.Inflater(true)), zipEntry.getSize(), false);
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path file, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path file, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path dir, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(okio.Path path, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        throw new java.io.IOException("zip file systems are read-only");
    }

    /* JADX INFO: compiled from: ZipFileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokio/ZipFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okio.Path getROOT() {
            return okio.ZipFileSystem.ROOT;
        }
    }
}
