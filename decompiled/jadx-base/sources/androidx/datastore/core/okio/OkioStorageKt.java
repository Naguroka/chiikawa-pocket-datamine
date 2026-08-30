package androidx.datastore.core.okio;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "path", "Lokio/Path;", "datastore-core-okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageKt {
    public static final androidx.datastore.core.InterProcessCoordinator createSingleProcessCoordinator(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return androidx.datastore.core.InterProcessCoordinatorKt.createSingleProcessCoordinator(path.normalized().toString());
    }
}
