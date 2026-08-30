package androidx.window.layout;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.window.layout.WindowMetricsCalculator, androidx.window.layout.WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(java.lang.Object obj) {
        super(1, obj, androidx.window.layout.WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.window.layout.WindowMetricsCalculator invoke(androidx.window.layout.WindowMetricsCalculator p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return ((androidx.window.layout.WindowMetricsCalculatorDecorator) this.receiver).decorate(p0);
    }
}
