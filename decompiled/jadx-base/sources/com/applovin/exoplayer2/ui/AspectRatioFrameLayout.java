package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ui.AspectRatioFrameLayout.c f556a;
    private float b;
    private int c;

    public interface b {
    }

    private final class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f557a;
        private float b;
        private boolean c;
        private boolean d;

        private c() {
        }

        public void a(float f, float f2, boolean z) {
            this.f557a = f;
            this.b = f2;
            this.c = z;
            if (this.d) {
                return;
            }
            this.d = true;
            com.applovin.exoplayer2.ui.AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d = false;
            com.applovin.exoplayer2.ui.AspectRatioFrameLayout.a(com.applovin.exoplayer2.ui.AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(android.content.Context context) {
        this(context, null);
    }

    static /* synthetic */ com.applovin.exoplayer2.ui.AspectRatioFrameLayout.b a(com.applovin.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.b / f5) - 1.0f;
        if (java.lang.Math.abs(f6) <= 0.01f) {
            this.f556a.a(this.b, f5, false);
            return;
        }
        int i3 = this.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.b;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.b;
                    } else {
                        f2 = this.b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.b;
            measuredWidth = (int) (f4 * f);
        }
        this.f556a.a(this.b, f5, true);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(com.applovin.exoplayer2.ui.AspectRatioFrameLayout.b bVar) {
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.applovin.sdk.R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f556a = new com.applovin.exoplayer2.ui.AspectRatioFrameLayout.c();
    }
}
