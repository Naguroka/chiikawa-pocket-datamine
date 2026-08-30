package okio;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020 H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006)"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "delegate", "(Lokio/FileSystem;)V", "()Lokio/FileSystem;", "appendingSink", "Lokio/Sink;", com.ironsource.y8.h.b, "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadataOrNull", "Lokio/FileMetadata;", "onPathParameter", com.ironsource.y8.f.b, "", "parameterName", "onPathResult", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ForwardingFileSystem extends okio.FileSystem {
    private final okio.FileSystem delegate;

    public okio.Path onPathParameter(okio.Path path, java.lang.String functionName, java.lang.String parameterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionName, "functionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    public okio.Path onPathResult(okio.Path path, java.lang.String functionName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    /* JADX INFO: renamed from: delegate, reason: from getter */
    public final okio.FileSystem getDelegate() {
        return this.delegate;
    }

    public ForwardingFileSystem(okio.FileSystem delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        if (fileMetadataMetadataOrNull.getSymlinkTarget() == null) {
            return fileMetadataMetadataOrNull;
        }
        return fileMetadataMetadataOrNull.copy((251 & 1) != 0 ? fileMetadataMetadataOrNull.isRegularFile : false, (251 & 2) != 0 ? fileMetadataMetadataOrNull.isDirectory : false, (251 & 4) != 0 ? fileMetadataMetadataOrNull.symlinkTarget : onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), (251 & 8) != 0 ? fileMetadataMetadataOrNull.size : null, (251 & 16) != 0 ? fileMetadataMetadataOrNull.createdAtMillis : null, (251 & 32) != 0 ? fileMetadataMetadataOrNull.lastModifiedAtMillis : null, (251 & 64) != 0 ? fileMetadataMetadataOrNull.lastAccessedAtMillis : null, (251 & 128) != 0 ? fileMetadataMetadataOrNull.extras : null);
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path dir) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.util.List<okio.Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((okio.Path) it.next(), "list"));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.util.List<okio.Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((okio.Path) it.next(), "listOrNull"));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path dir, boolean followSymlinks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return kotlin.sequences.SequencesKt.map(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), followSymlinks), new kotlin.jvm.functions.Function1<okio.Path, okio.Path>() { // from class: okio.ForwardingFileSystem.listRecursively.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final okio.Path invoke(okio.Path it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return okio.ForwardingFileSystem.this.onPathResult(it, "listRecursively");
            }
        });
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", com.ironsource.y8.h.b));
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", com.ironsource.y8.h.b), mustCreate, mustExist);
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.source(onPathParameter(file, "source", com.ironsource.y8.h.b));
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path file, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", com.ironsource.y8.h.b), mustCreate);
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path file, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", com.ironsource.y8.h.b), mustExist);
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path dir, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), mustCreate);
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.FileSystem
    public void delete(okio.Path path, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), mustExist);
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET));
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.delegate + ')';
    }
}
