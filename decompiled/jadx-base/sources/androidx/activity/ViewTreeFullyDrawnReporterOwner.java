package androidx.activity;

/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeFullyDrawnReporterOwner", "Landroidx/activity/FullyDrawnReporterOwner;", "Landroid/view/View;", "get", "setViewTreeFullyDrawnReporterOwner", "", "fullyDrawnReporterOwner", "set", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeFullyDrawnReporterOwner {
    public static final void set(android.view.View view, androidx.activity.FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(androidx.activity.R.id.report_drawn, fullyDrawnReporterOwner);
    }

    public static final androidx.activity.FullyDrawnReporterOwner get(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        return (androidx.activity.FullyDrawnReporterOwner) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.generateSequence(view, new kotlin.jvm.functions.Function1<android.view.View, android.view.View>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1
            @Override // kotlin.jvm.functions.Function1
            public final android.view.View invoke(android.view.View it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                java.lang.Object parent = it.getParent();
                if (parent instanceof android.view.View) {
                    return (android.view.View) parent;
                }
                return null;
            }
        }), new kotlin.jvm.functions.Function1<android.view.View, androidx.activity.FullyDrawnReporterOwner>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2
            @Override // kotlin.jvm.functions.Function1
            public final androidx.activity.FullyDrawnReporterOwner invoke(android.view.View it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                java.lang.Object tag = it.getTag(androidx.activity.R.id.report_drawn);
                if (tag instanceof androidx.activity.FullyDrawnReporterOwner) {
                    return (androidx.activity.FullyDrawnReporterOwner) tag;
                }
                return null;
            }
        }));
    }
}
