package androidx.lifecycle;

/* JADX INFO: compiled from: ViewTreeViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/view/View;", "get", "setViewTreeViewModelStoreOwner", "", "viewModelStoreOwner", "set", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeViewModelStoreOwner {
    public static final void set(android.view.View view, androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }

    public static final androidx.lifecycle.ViewModelStoreOwner get(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return (androidx.lifecycle.ViewModelStoreOwner) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.generateSequence(view, new kotlin.jvm.functions.Function1<android.view.View, android.view.View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // kotlin.jvm.functions.Function1
            public final android.view.View invoke(android.view.View view2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                java.lang.Object parent = view2.getParent();
                if (parent instanceof android.view.View) {
                    return (android.view.View) parent;
                }
                return null;
            }
        }), new kotlin.jvm.functions.Function1<android.view.View, androidx.lifecycle.ViewModelStoreOwner>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // kotlin.jvm.functions.Function1
            public final androidx.lifecycle.ViewModelStoreOwner invoke(android.view.View view2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                java.lang.Object tag = view2.getTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner);
                if (tag instanceof androidx.lifecycle.ViewModelStoreOwner) {
                    return (androidx.lifecycle.ViewModelStoreOwner) tag;
                }
                return null;
            }
        }));
    }
}
