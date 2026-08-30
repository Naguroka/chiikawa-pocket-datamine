package androidx.savedstate;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "savedstate-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @kotlin.ReplaceWith(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ androidx.savedstate.SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(view);
    }
}
