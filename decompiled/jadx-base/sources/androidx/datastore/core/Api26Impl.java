package androidx.datastore.core;

/* JADX INFO: compiled from: FileMoves.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/datastore/core/Api26Impl;", "", "()V", "move", "", "srcFile", "Ljava/io/File;", "dstFile", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Api26Impl {
    public static final androidx.datastore.core.Api26Impl INSTANCE = new androidx.datastore.core.Api26Impl();

    private Api26Impl() {
    }

    public final boolean move(java.io.File srcFile, java.io.File dstFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(srcFile, "srcFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstFile, "dstFile");
        try {
            java.nio.file.Files.move(srcFile.toPath(), dstFile.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
