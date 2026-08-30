package androidx.window.layout;

/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/DisplayCompatHelperApi17;", "", "()V", "getRealSize", "", "display", "Landroid/view/Display;", "point", "Landroid/graphics/Point;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DisplayCompatHelperApi17 {
    public static final androidx.window.layout.DisplayCompatHelperApi17 INSTANCE = new androidx.window.layout.DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(android.view.Display display, android.graphics.Point point) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(display, "display");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }
}
