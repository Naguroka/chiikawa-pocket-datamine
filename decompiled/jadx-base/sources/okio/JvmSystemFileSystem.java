package okio;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\f\u0010!\u001a\u00020\n*\u00020\u0006H\u0002J\f\u0010\"\u001a\u00020\n*\u00020\u0006H\u0002¨\u0006#"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", com.ironsource.y8.h.b, "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "requireCreate", "requireExist", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JvmSystemFileSystem extends okio.FileSystem {
    public java.lang.String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        java.io.File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new java.io.FileNotFoundException("no such file");
        }
        okio.Path.Companion companion = okio.Path.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(canonicalFile);
        return okio.Path.Companion.get$default(companion, canonicalFile, false, 1, (java.lang.Object) null);
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        java.io.File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new okio.FileMetadata(zIsFile, zIsDirectory, null, java.lang.Long.valueOf(length), null, java.lang.Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
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
        java.io.File file = dir.toFile();
        java.lang.String[] list = file.list();
        if (list == null) {
            if (!throwOnFailure) {
                return null;
            }
            if (file.exists()) {
                throw new java.io.IOException("failed to list " + dir);
            }
            throw new java.io.FileNotFoundException("no such file: " + dir);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            arrayList.add(dir.resolve(str));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return new okio.JvmFileHandle(false, new java.io.RandomAccessFile(file.toFile(), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (!((mustCreate && mustExist) ? false : true)) {
            throw new java.lang.IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (mustCreate) {
            requireCreate(file);
        }
        if (mustExist) {
            requireExist(file);
        }
        return new okio.JvmFileHandle(true, new java.io.RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return okio.Okio.source(file.toFile());
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path file, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate) {
            requireCreate(file);
        }
        return okio.Okio__JvmOkioKt.sink$default(file.toFile(), false, 1, null);
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path file, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (mustExist) {
            requireExist(file);
        }
        return okio.Okio.sink(file.toFile(), true);
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path dir, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        okio.FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
        boolean z = false;
        if (fileMetadataMetadataOrNull != null && fileMetadataMetadataOrNull.getIsDirectory()) {
            z = true;
        }
        if (!z) {
            throw new java.io.IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new java.io.IOException(dir + " already exists.");
        }
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        if (!source.toFile().renameTo(target.toFile())) {
            throw new java.io.IOException("failed to move " + source + " to " + target);
        }
    }

    @Override // okio.FileSystem
    public void delete(okio.Path path, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        java.io.File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new java.io.IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new java.io.FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        throw new java.io.IOException("unsupported");
    }

    private final void requireExist(okio.Path path) throws java.io.IOException {
        if (!exists(path)) {
            throw new java.io.IOException(path + " doesn't exist.");
        }
    }

    private final void requireCreate(okio.Path path) throws java.io.IOException {
        if (exists(path)) {
            throw new java.io.IOException(path + " already exists.");
        }
    }
}
