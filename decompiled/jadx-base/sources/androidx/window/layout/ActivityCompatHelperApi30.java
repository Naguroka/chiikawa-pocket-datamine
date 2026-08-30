package androidx.window.layout;

/* JADX INFO: compiled from: ActivityCompatHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "maximumWindowBounds", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ActivityCompatHelperApi30 {
    public static final androidx.window.layout.ActivityCompatHelperApi30 INSTANCE = new androidx.window.layout.ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final android.graphics.Rect currentWindowBounds(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.graphics.Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final android.graphics.Rect maximumWindowBounds(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.graphics.Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
