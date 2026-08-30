package androidx.window.layout;

/* JADX INFO: compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u001d\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "()V", "translate", "Landroidx/window/layout/FoldingFeature;", "activity", "Landroid/app/Activity;", "oemFeature", "Landroidx/window/extensions/layout/FoldingFeature;", "translate$window_release", "Landroidx/window/layout/WindowLayoutInfo;", "info", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "validBounds", "", "bounds", "Landroidx/window/core/Bounds;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final androidx.window.layout.ExtensionsWindowLayoutInfoAdapter INSTANCE = new androidx.window.layout.ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    public final androidx.window.layout.FoldingFeature translate$window_release(android.app.Activity activity, androidx.window.extensions.layout.FoldingFeature oemFeature) {
        androidx.window.layout.HardwareFoldingFeature.Type fold;
        androidx.window.layout.FoldingFeature.State state;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getHINGE();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = androidx.window.layout.FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = androidx.window.layout.FoldingFeature.State.HALF_OPENED;
        }
        android.graphics.Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (validBounds(activity, new androidx.window.core.Bounds(bounds))) {
            android.graphics.Rect bounds2 = oemFeature.getBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
            return new androidx.window.layout.HardwareFoldingFeature(new androidx.window.core.Bounds(bounds2), fold, state);
        }
        return null;
    }

    public final androidx.window.layout.WindowLayoutInfo translate$window_release(android.app.Activity activity, androidx.window.extensions.layout.WindowLayoutInfo info) {
        androidx.window.layout.FoldingFeature foldingFeatureTranslate$window_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        java.util.List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                androidx.window.layout.ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(feature, "feature");
                foldingFeatureTranslate$window_release = extensionsWindowLayoutInfoAdapter.translate$window_release(activity, feature);
            } else {
                foldingFeatureTranslate$window_release = null;
            }
            if (foldingFeatureTranslate$window_release != null) {
                arrayList.add(foldingFeatureTranslate$window_release);
            }
        }
        return new androidx.window.layout.WindowLayoutInfo(arrayList);
    }

    private final boolean validBounds(android.app.Activity activity, androidx.window.core.Bounds bounds) {
        android.graphics.Rect bounds2 = androidx.window.layout.WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) {
            return (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) ? false : true;
        }
        return false;
    }
}
