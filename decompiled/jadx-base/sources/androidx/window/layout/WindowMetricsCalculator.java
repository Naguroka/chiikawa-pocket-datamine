package androidx.window.layout;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", "activity", "Landroid/app/Activity;", "computeMaximumWindowMetrics", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface WindowMetricsCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.WindowMetricsCalculator.Companion INSTANCE = androidx.window.layout.WindowMetricsCalculator.Companion.$$INSTANCE;

    @kotlin.jvm.JvmStatic
    static androidx.window.layout.WindowMetricsCalculator getOrCreate() {
        return INSTANCE.getOrCreate();
    }

    @kotlin.jvm.JvmStatic
    static void overrideDecorator(androidx.window.layout.WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        INSTANCE.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @kotlin.jvm.JvmStatic
    static void reset() {
        INSTANCE.reset();
    }

    androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.app.Activity activity);

    androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.app.Activity activity);

    /* JADX INFO: compiled from: WindowMetricsCalculator.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "()V", "decorator", "Lkotlin/Function1;", "Landroidx/window/layout/WindowMetricsCalculator;", "getOrCreate", "overrideDecorator", "", "overridingDecorator", "Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "reset", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.window.layout.WindowMetricsCalculator.Companion $$INSTANCE = new androidx.window.layout.WindowMetricsCalculator.Companion();
        private static kotlin.jvm.functions.Function1<? super androidx.window.layout.WindowMetricsCalculator, ? extends androidx.window.layout.WindowMetricsCalculator> decorator = new kotlin.jvm.functions.Function1<androidx.window.layout.WindowMetricsCalculator, androidx.window.layout.WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // kotlin.jvm.functions.Function1
            public final androidx.window.layout.WindowMetricsCalculator invoke(androidx.window.layout.WindowMetricsCalculator it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        };

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.layout.WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(androidx.window.layout.WindowMetricsCalculatorCompat.INSTANCE);
        }

        @kotlin.jvm.JvmStatic
        public final void overrideDecorator(androidx.window.layout.WindowMetricsCalculatorDecorator overridingDecorator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = new androidx.window.layout.WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @kotlin.jvm.JvmStatic
        public final void reset() {
            decorator = new kotlin.jvm.functions.Function1<androidx.window.layout.WindowMetricsCalculator, androidx.window.layout.WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$reset$1
                @Override // kotlin.jvm.functions.Function1
                public final androidx.window.layout.WindowMetricsCalculator invoke(androidx.window.layout.WindowMetricsCalculator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return it;
                }
            };
        }
    }
}
