package androidx.customview.poolingcontainer;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\n\u0010\u0013\u001a\u00020\u0010*\u00020\u0006\u001a\n\u0010\u0014\u001a\u00020\u0010*\u00020\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0005\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"IsPoolingContainerTag", "", "PoolingContainerListenerHolderTag", "value", "", "isPoolingContainer", "Landroid/view/View;", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isWithinPoolingContainer", "poolingContainerListenerHolder", "Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "getPoolingContainerListenerHolder", "(Landroid/view/View;)Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "addPoolingContainerListener", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "callPoolingContainerOnRelease", "callPoolingContainerOnReleaseForChildren", "Landroid/view/ViewGroup;", "removePoolingContainerListener", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PoolingContainer {
    private static final int PoolingContainerListenerHolderTag = androidx.customview.poolingcontainer.R.id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = androidx.customview.poolingcontainer.R.id.is_pooling_container_tag;

    public static final void addPoolingContainerListener(android.view.View view, androidx.customview.poolingcontainer.PoolingContainerListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        getPoolingContainerListenerHolder(view).addListener(listener);
    }

    public static final void removePoolingContainerListener(android.view.View view, androidx.customview.poolingcontainer.PoolingContainerListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        getPoolingContainerListenerHolder(view).removeListener(listener);
    }

    public static final boolean isPoolingContainer(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.Object tag = view.getTag(IsPoolingContainerTag);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void setPoolingContainer(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(IsPoolingContainerTag, java.lang.Boolean.valueOf(z));
    }

    public static final boolean isWithinPoolingContainer(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        for (java.lang.Object obj : androidx.core.view.ViewKt.getAncestors(view)) {
            if ((obj instanceof android.view.View) && isPoolingContainer((android.view.View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void callPoolingContainerOnRelease(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.util.Iterator<android.view.View> it = androidx.core.view.ViewKt.getAllViews(view).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        java.util.Iterator<android.view.View> it = androidx.core.view.ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    private static final androidx.customview.poolingcontainer.PoolingContainerListenerHolder getPoolingContainerListenerHolder(android.view.View view) {
        int i = PoolingContainerListenerHolderTag;
        androidx.customview.poolingcontainer.PoolingContainerListenerHolder poolingContainerListenerHolder = (androidx.customview.poolingcontainer.PoolingContainerListenerHolder) view.getTag(i);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        androidx.customview.poolingcontainer.PoolingContainerListenerHolder poolingContainerListenerHolder2 = new androidx.customview.poolingcontainer.PoolingContainerListenerHolder();
        view.setTag(i, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }
}
