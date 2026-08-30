package okio;

/* JADX INFO: compiled from: NioSystemFileSystem.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "()V", "atomicMove", "", "source", "Lokio/Path;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "createSymlink", "metadataOrNull", "Lokio/FileMetadata;", "nioPath", "Ljava/nio/file/Path;", "path", "toString", "", "zeroToNull", "", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class NioSystemFileSystem extends okio.JvmSystemFileSystem {
    @Override // okio.JvmSystemFileSystem
    public java.lang.String toString() {
        return "NioSystemFileSystem";
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return metadataOrNull(path.toNioPath());
    }

    protected final okio.FileMetadata metadataOrNull(java.nio.file.Path nioPath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            java.nio.file.attribute.BasicFileAttributes attributes = java.nio.file.Files.readAttributes(nioPath, (java.lang.Class<java.nio.file.attribute.BasicFileAttributes>) java.nio.file.attribute.BasicFileAttributes.class, java.nio.file.LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? java.nio.file.Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            okio.Path path = symbolicLink != null ? okio.Path.Companion.get$default(okio.Path.INSTANCE, symbolicLink, false, 1, (java.lang.Object) null) : null;
            java.lang.Long lValueOf = java.lang.Long.valueOf(attributes.size());
            java.nio.file.attribute.FileTime fileTimeCreationTime = attributes.creationTime();
            java.lang.Long lZeroToNull = fileTimeCreationTime != null ? zeroToNull(fileTimeCreationTime) : null;
            java.nio.file.attribute.FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            java.lang.Long lZeroToNull2 = fileTimeLastModifiedTime != null ? zeroToNull(fileTimeLastModifiedTime) : null;
            java.nio.file.attribute.FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new okio.FileMetadata(zIsRegularFile, zIsDirectory, path, lValueOf, lZeroToNull, lZeroToNull2, fileTimeLastAccessTime != null ? zeroToNull(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (java.nio.file.NoSuchFileException | java.nio.file.FileSystemException unused) {
            return null;
        }
    }

    private final java.lang.Long zeroToNull(java.nio.file.attribute.FileTime fileTime) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        try {
            java.nio.file.Files.move(source.toNioPath(), target.toNioPath(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e) {
            throw new java.io.FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        java.nio.file.Files.createSymbolicLink(source.toNioPath(), target.toNioPath(), new java.nio.file.attribute.FileAttribute[0]);
    }
}
