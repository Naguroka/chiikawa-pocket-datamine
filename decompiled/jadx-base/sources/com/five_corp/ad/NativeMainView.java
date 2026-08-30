package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class NativeMainView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f1771a;
    public final com.five_corp.ad.internal.logger.a b;
    public double c;
    public final int d;
    public boolean e;

    public NativeMainView(android.content.Context context, android.widget.FrameLayout frameLayout, com.five_corp.ad.internal.logger.a aVar, int i) {
        super(context);
        this.e = false;
        this.f1771a = frameLayout;
        this.b = aVar;
        this.c = 0.0d;
        this.d = i;
        addView(frameLayout);
    }

    public int getLogicalHeight() {
        if (this.e) {
            return getHeight();
        }
        int i = this.d;
        double d = this.c;
        if (d == 0.0d) {
            return 0;
        }
        return (int) (((double) i) * d);
    }

    public int getLogicalWidth() {
        return this.e ? getWidth() : this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.e = true;
        } catch (java.lang.Throwable th) {
            this.b.a(th);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return callOnClick();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.widget.FrameLayout frameLayout;
        try {
            int i3 = this.d;
            int i4 = 0;
            if (i3 > 0) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                int i5 = this.d;
                double d = this.c;
                if (d != 0.0d) {
                    i4 = (int) (((double) i5) * d);
                }
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (android.view.View.MeasureSpec.getMode(i) == 0) {
                int size = android.view.View.MeasureSpec.getSize(i2);
                double d2 = this.c;
                if (d2 != 0.0d) {
                    i4 = (int) (((double) size) / d2);
                }
                i = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (android.view.View.MeasureSpec.getMode(i2) == 0) {
                int size2 = android.view.View.MeasureSpec.getSize(i);
                double d3 = this.c;
                if (d3 != 0.0d) {
                    i4 = (int) (((double) size2) * d3);
                }
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
            int size3 = android.view.View.MeasureSpec.getSize(i);
            int size4 = android.view.View.MeasureSpec.getSize(i2);
            double d4 = this.c;
            if (d4 != 0.0d) {
                double d5 = size4;
                double d6 = size3;
                if (d5 < d4 * d6) {
                    frameLayout = this.f1771a;
                    layoutParams = new android.widget.FrameLayout.LayoutParams((int) (d5 / this.c), size4, 17);
                } else {
                    android.widget.FrameLayout frameLayout2 = this.f1771a;
                    layoutParams = new android.widget.FrameLayout.LayoutParams(size3, (int) (d6 * this.c), 17);
                    frameLayout = frameLayout2;
                }
                frameLayout.setLayoutParams(layoutParams);
            }
        } catch (java.lang.Throwable th) {
            this.b.a(th);
        }
        super.onMeasure(i, i2);
    }

    public void setConfigHeightToWidthRatio(double d) {
        this.c = d;
    }
}
