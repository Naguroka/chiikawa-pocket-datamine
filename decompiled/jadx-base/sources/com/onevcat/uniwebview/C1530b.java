package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1530b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f3706a;
    public final android.app.Activity b;
    public final android.view.View c;
    public int d;
    public int e;
    public final android.widget.FrameLayout.LayoutParams f;
    public float g;

    public C1530b(com.onevcat.uniwebview.X x, android.app.Activity activity) {
        this.f3706a = x;
        this.b = activity;
        android.view.View childAt = x.getChildAt(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "mContent.getChildAt(0)");
        this.c = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.onevcat.uniwebview.C1530b.a(this.f$0);
            }
        });
        android.view.ViewGroup.LayoutParams layoutParams = x.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        this.f = (android.widget.FrameLayout.LayoutParams) layoutParams;
        this.g = childAt.getRootView().getHeight();
    }

    public static final void a(com.onevcat.uniwebview.C1530b this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.b.getResources().getConfiguration().orientation;
        android.graphics.Rect rect = new android.graphics.Rect();
        this$0.c.getWindowVisibleDisplayFrame(rect);
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(0, (rect.bottom - rect.top) - ((int) this$0.f3706a.getY()));
        if (i != this$0.e) {
            this$0.e = i;
            this$0.d = iCoerceAtLeast;
            return;
        }
        if (iCoerceAtLeast != this$0.d) {
            android.widget.FrameLayout.LayoutParams layoutParams = this$0.f;
            float f = this$0.g;
            float y = this$0.c.getY() + f;
            int height = this$0.c.getRootView().getHeight();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            this$0.c.getWindowVisibleDisplayFrame(rect2);
            layoutParams.height = (int) (f - kotlin.ranges.RangesKt.coerceAtLeast(0.0f, (y + (height - kotlin.ranges.RangesKt.coerceAtLeast(0, (rect2.bottom - rect2.top) - ((int) this$0.f3706a.getY())))) - this$0.c.getRootView().getHeight()));
            this$0.f3706a.requestLayout();
            this$0.d = iCoerceAtLeast;
        }
    }
}
