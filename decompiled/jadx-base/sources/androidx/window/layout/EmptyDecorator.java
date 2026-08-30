package androidx.window.layout;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/EmptyDecorator;", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "()V", "decorate", "Landroidx/window/layout/WindowInfoTracker;", "tracker", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class EmptyDecorator implements androidx.window.layout.WindowInfoTrackerDecorator {
    public static final androidx.window.layout.EmptyDecorator INSTANCE = new androidx.window.layout.EmptyDecorator();

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public androidx.window.layout.WindowInfoTracker decorate(androidx.window.layout.WindowInfoTracker tracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }

    private EmptyDecorator() {
    }
}
