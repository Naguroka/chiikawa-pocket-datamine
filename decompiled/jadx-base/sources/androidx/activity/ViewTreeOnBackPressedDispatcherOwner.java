package androidx.activity;

/* JADX INFO: compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeOnBackPressedDispatcherOwner", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroid/view/View;", "get", "setViewTreeOnBackPressedDispatcherOwner", "", "onBackPressedDispatcherOwner", "set", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final void set(android.view.View view, androidx.activity.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(androidx.activity.R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static final androidx.activity.OnBackPressedDispatcherOwner get(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return (androidx.activity.OnBackPressedDispatcherOwner) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.generateSequence(view, new kotlin.jvm.functions.Function1<android.view.View, android.view.View>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1
            @Override // kotlin.jvm.functions.Function1
            public final android.view.View invoke(android.view.View it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                java.lang.Object parent = it.getParent();
                if (parent instanceof android.view.View) {
                    return (android.view.View) parent;
                }
                return null;
            }
        }), new kotlin.jvm.functions.Function1<android.view.View, androidx.activity.OnBackPressedDispatcherOwner>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
            @Override // kotlin.jvm.functions.Function1
            public final androidx.activity.OnBackPressedDispatcherOwner invoke(android.view.View it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                java.lang.Object tag = it.getTag(androidx.activity.R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof androidx.activity.OnBackPressedDispatcherOwner) {
                    return (androidx.activity.OnBackPressedDispatcherOwner) tag;
                }
                return null;
            }
        }));
    }
}
