package okio;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bH&J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0011\u001a\u00020\u0006J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0016J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u0006J\u0012\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0006J$\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH&J:\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001a\u00020\u00062\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u0002H&0(¢\u0006\u0002\b*H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u0006H&JD\u0010/\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002H&0(¢\u0006\u0002\b*H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Lokio/FileSystem;", "", "()V", "appendingSink", "Lokio/Sink;", com.ironsource.y8.h.b, "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "canonicalize", "path", "copy", "createDirectories", "dir", "mustCreate", "createDirectory", "createSymlink", "delete", "deleteRecursively", "fileOrDirectory", "exists", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "Lokio/FileMetadata;", "metadataOrNull", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "read", "T", "readerAction", "Lkotlin/Function1;", "Lokio/BufferedSource;", "Lkotlin/ExtensionFunctionType;", "-read", "(Lokio/Path;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sink", "Lokio/Source;", "write", "writerAction", "Lokio/BufferedSink;", "-write", "(Lokio/Path;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileSystem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.FileSystem.Companion INSTANCE = new okio.FileSystem.Companion(null);
    public static final okio.FileSystem RESOURCES;
    public static final okio.FileSystem SYSTEM;
    public static final okio.Path SYSTEM_TEMPORARY_DIRECTORY;

    @kotlin.jvm.JvmStatic
    public static final okio.FileSystem get(java.nio.file.FileSystem fileSystem) {
        return INSTANCE.get(fileSystem);
    }

    public abstract okio.Sink appendingSink(okio.Path file, boolean mustExist) throws java.io.IOException;

    public abstract void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException;

    public abstract okio.Path canonicalize(okio.Path path) throws java.io.IOException;

    public abstract void createDirectory(okio.Path dir, boolean mustCreate) throws java.io.IOException;

    public abstract void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException;

    public abstract void delete(okio.Path path, boolean mustExist) throws java.io.IOException;

    public abstract java.util.List<okio.Path> list(okio.Path dir) throws java.io.IOException;

    public abstract java.util.List<okio.Path> listOrNull(okio.Path dir);

    public abstract okio.FileMetadata metadataOrNull(okio.Path path) throws java.io.IOException;

    public abstract okio.FileHandle openReadOnly(okio.Path file) throws java.io.IOException;

    public abstract okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) throws java.io.IOException;

    public abstract okio.Sink sink(okio.Path file, boolean mustCreate) throws java.io.IOException;

    public abstract okio.Source source(okio.Path file) throws java.io.IOException;

    public final okio.FileMetadata metadata(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    public final boolean exists(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    public static /* synthetic */ kotlin.sequences.Sequence listRecursively$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.listRecursively(path, z);
    }

    public kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path dir, boolean followSymlinks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, dir, followSymlinks);
    }

    public final kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }

    public static /* synthetic */ okio.FileHandle openReadWrite$default(okio.FileSystem fileSystem, okio.Path path, boolean z, boolean z2, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fileSystem.openReadWrite(path, z, z2);
    }

    public final okio.FileHandle openReadWrite(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.sink(path, z);
    }

    public final okio.Sink sink(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m3022write$default(okio.FileSystem fileSystem, okio.Path file, boolean z, kotlin.jvm.functions.Function1 writerAction, int i, java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objInvoke;
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writerAction, "writerAction");
            okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(fileSystem.sink(file, z));
            java.lang.Throwable th = null;
            try {
                objInvoke = writerAction.invoke(bufferedSinkBuffer);
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            } catch (java.lang.Throwable th3) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (java.lang.Throwable th4) {
                        kotlin.ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                objInvoke = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(objInvoke);
            return objInvoke;
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
    }

    public static /* synthetic */ okio.Sink appendingSink$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.appendingSink(path, z);
    }

    public final okio.Sink appendingSink(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    public static /* synthetic */ void createDirectory$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectory(path, z);
    }

    public final void createDirectory(okio.Path dir) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public static /* synthetic */ void createDirectories$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectories(path, z);
    }

    public final void createDirectories(okio.Path dir, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, dir, mustCreate);
    }

    public final void createDirectories(okio.Path dir) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public void copy(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public static /* synthetic */ void delete$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.delete(path, z);
    }

    public final void delete(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public static /* synthetic */ void deleteRecursively$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.deleteRecursively(path, z);
    }

    public void deleteRecursively(okio.Path fileOrDirectory, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, mustExist);
    }

    public final void deleteRecursively(okio.Path fileOrDirectory) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokio/FileSystem$Companion;", "", "()V", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.FileSystem get(java.nio.file.FileSystem fileSystem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            return new okio.NioFileSystemWrappingFileSystem(fileSystem);
        }
    }

    static {
        okio.NioSystemFileSystem jvmSystemFileSystem;
        try {
            java.lang.Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new okio.NioSystemFileSystem();
        } catch (java.lang.ClassNotFoundException unused) {
            jvmSystemFileSystem = new okio.JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        okio.Path.Companion companion = okio.Path.INSTANCE;
        java.lang.String property = java.lang.System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = okio.Path.Companion.get$default(companion, property, false, 1, (java.lang.Object) null);
        java.lang.ClassLoader classLoader = okio.internal.ResourceFileSystem.class.getClassLoader();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new okio.internal.ResourceFileSystem(classLoader, false, null, 4, null);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m3023read(okio.Path file, kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> readerAction) throws java.lang.Throwable {
        T tInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(source(file));
        java.lang.Throwable th = null;
        try {
            tInvoke = readerAction.invoke(bufferedSourceBuffer);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th3) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m3024write(okio.Path file, boolean mustCreate, kotlin.jvm.functions.Function1<? super okio.BufferedSink, ? extends T> writerAction) throws java.lang.Throwable {
        T tInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(sink(file, mustCreate));
        java.lang.Throwable th = null;
        try {
            tInvoke = writerAction.invoke(bufferedSinkBuffer);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th3) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(tInvoke);
        return tInvoke;
    }
}
