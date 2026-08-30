package androidx.window.layout;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "Landroid/app/Activity;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface WindowInfoTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.WindowInfoTracker.Companion INSTANCE = androidx.window.layout.WindowInfoTracker.Companion.$$INSTANCE;

    @kotlin.jvm.JvmStatic
    static androidx.window.layout.WindowInfoTracker getOrCreate(android.content.Context context) {
        return INSTANCE.getOrCreate(context);
    }

    @kotlin.jvm.JvmStatic
    static void overrideDecorator(androidx.window.layout.WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        INSTANCE.overrideDecorator(windowInfoTrackerDecorator);
    }

    @kotlin.jvm.JvmStatic
    static void reset() {
        INSTANCE.reset();
    }

    kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo(android.app.Activity activity);

    /* JADX INFO: compiled from: WindowInfoTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "()V", "DEBUG", "", "TAG", "", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "getOrCreate", "Landroidx/window/layout/WindowInfoTracker;", "context", "Landroid/content/Context;", "overrideDecorator", "", "overridingDecorator", "reset", "windowBackend", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ androidx.window.layout.WindowInfoTracker.Companion $$INSTANCE = new androidx.window.layout.WindowInfoTracker.Companion();
        private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.layout.WindowInfoTracker.class).getSimpleName();
        private static androidx.window.layout.WindowInfoTrackerDecorator decorator = androidx.window.layout.EmptyDecorator.INSTANCE;

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.layout.WindowInfoTracker getOrCreate(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return decorator.decorate(new androidx.window.layout.WindowInfoTrackerImpl(androidx.window.layout.WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        public final androidx.window.layout.WindowBackend windowBackend$window_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.window.layout.ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new androidx.window.layout.ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (java.lang.Throwable unused) {
                if (DEBUG) {
                    android.util.Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            return extensionWindowLayoutInfoBackend == null ? androidx.window.layout.SidecarWindowBackend.INSTANCE.getInstance(context) : extensionWindowLayoutInfoBackend;
        }

        @kotlin.jvm.JvmStatic
        public final void overrideDecorator(androidx.window.layout.WindowInfoTrackerDecorator overridingDecorator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @kotlin.jvm.JvmStatic
        public final void reset() {
            decorator = androidx.window.layout.EmptyDecorator.INSTANCE;
        }
    }
}
