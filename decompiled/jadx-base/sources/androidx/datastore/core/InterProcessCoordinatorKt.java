package androidx.datastore.core;

/* JADX INFO: compiled from: InterProcessCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", com.ironsource.rc.c.c, "", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InterProcessCoordinatorKt {
    public static final androidx.datastore.core.InterProcessCoordinator createSingleProcessCoordinator(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new androidx.datastore.core.SingleProcessCoordinator(filePath);
    }
}
