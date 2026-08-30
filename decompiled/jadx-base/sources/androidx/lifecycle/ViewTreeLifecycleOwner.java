package androidx.lifecycle;

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/View;", "get", "setViewTreeLifecycleOwner", "", "lifecycleOwner", "set", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeLifecycleOwner {
    public static final void set(android.view.View view, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }

    public static final androidx.lifecycle.LifecycleOwner get(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return (androidx.lifecycle.LifecycleOwner) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.generateSequence(view, new kotlin.jvm.functions.Function1<android.view.View, android.view.View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // kotlin.jvm.functions.Function1
            public final android.view.View invoke(android.view.View currentView) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentView, "currentView");
                java.lang.Object parent = currentView.getParent();
                if (parent instanceof android.view.View) {
                    return (android.view.View) parent;
                }
                return null;
            }
        }), new kotlin.jvm.functions.Function1<android.view.View, androidx.lifecycle.LifecycleOwner>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // kotlin.jvm.functions.Function1
            public final androidx.lifecycle.LifecycleOwner invoke(android.view.View viewParent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewParent, "viewParent");
                java.lang.Object tag = viewParent.getTag(androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner);
                if (tag instanceof androidx.lifecycle.LifecycleOwner) {
                    return (androidx.lifecycle.LifecycleOwner) tag;
                }
                return null;
            }
        }));
    }
}
