package androidx.customview.poolingcontainer;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "", "()V", "listeners", "Ljava/util/ArrayList;", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "Lkotlin/collections/ArrayList;", "addListener", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onRelease", "removeListener", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class PoolingContainerListenerHolder {
    private final java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> listeners = new java.util.ArrayList<>();

    public final void addListener(androidx.customview.poolingcontainer.PoolingContainerListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    public final void removeListener(androidx.customview.poolingcontainer.PoolingContainerListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void onRelease() {
        for (int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.listeners); -1 < lastIndex; lastIndex--) {
            this.listeners.get(lastIndex).onRelease();
        }
    }
}
