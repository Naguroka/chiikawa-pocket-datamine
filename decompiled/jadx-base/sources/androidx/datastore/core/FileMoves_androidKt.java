package androidx.datastore.core;

/* JADX INFO: compiled from: FileMoves.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"atomicMoveTo", "", "Ljava/io/File;", "toFile", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(java.io.File file, java.io.File toFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toFile, "toFile");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.datastore.core.Api26Impl.INSTANCE.move(file, toFile);
        }
        return file.renameTo(toFile);
    }
}
