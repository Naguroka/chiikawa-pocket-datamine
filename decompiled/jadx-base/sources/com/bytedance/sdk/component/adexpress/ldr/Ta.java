package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class Ta extends android.widget.ImageView {
    private long IL;
    private float Kg;
    private volatile boolean PX;
    private boolean Ta;
    private int VB;
    private float WR;
    private int bX;
    private android.graphics.Movie bg;
    private int eo;
    private android.graphics.drawable.AnimatedImageDrawable eqN;
    private float iR;
    private boolean ldr;
    private boolean yDt;
    private boolean zx;

    public Ta(android.content.Context context) {
        super(context);
        this.zx = android.os.Build.VERSION.SDK_INT >= 28;
        this.ldr = false;
        this.Ta = true;
        this.yDt = true;
        bg();
    }

    void bg() {
        if (this.zx) {
            return;
        }
        setLayerType(1, null);
    }

    private void setDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (android.os.Build.VERSION.SDK_INT >= 28 && (drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
            android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = (android.graphics.drawable.AnimatedImageDrawable) drawable;
            this.eqN = animatedImageDrawable;
            if (!this.PX) {
                animatedImageDrawable.start();
            }
            if (!this.yDt) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        IL();
    }

    public void setRepeatConfig(boolean z) {
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable;
        this.yDt = z;
        if (z) {
            return;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.eqN) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("GifView", "setRepeatConfig error", e);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        android.graphics.Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.zx || (movie = this.bg) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.bg.height();
        float fMax = 1.0f / java.lang.Math.max((android.view.View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = android.view.View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (android.view.View.MeasureSpec.getMode(i2) == 0 || iHeight <= (size = android.view.View.MeasureSpec.getSize(i2))) ? 1.0f : iHeight / size);
        this.WR = fMax;
        int i3 = (int) (iWidth * fMax);
        this.eo = i3;
        int i4 = (int) (iHeight * fMax);
        this.VB = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.bg != null && !this.zx) {
            this.iR = (getWidth() - this.eo) / 2.0f;
            this.Kg = (getHeight() - this.VB) / 2.0f;
        }
        this.Ta = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.bg != null && !this.zx) {
            try {
                if (!this.PX) {
                    bX();
                    bg(canvas);
                    IL();
                    return;
                }
                bg(canvas);
                return;
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("GifView", "onDraw->Throwable->", th);
                return;
            }
        }
        super.onDraw(canvas);
    }

    private void IL() {
        if (this.bg == null || this.zx || !this.Ta) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void bX() {
        if (this.bg == null) {
            return;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.IL == 0) {
            this.IL = jUptimeMillis;
        }
        int iDuration = this.bg.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (!this.yDt && java.lang.Math.abs(iDuration - this.bX) < 60) {
            this.bX = iDuration;
            this.PX = true;
        } else {
            this.bX = (int) ((jUptimeMillis - this.IL) % ((long) iDuration));
        }
    }

    private void bg(android.graphics.Canvas canvas) {
        android.graphics.Movie movie = this.bg;
        if (movie == null) {
            return;
        }
        movie.setTime(this.bX);
        float f = this.WR;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.bg.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            android.graphics.Movie movie2 = this.bg;
            float f2 = this.iR;
            float f3 = this.WR;
            movie2.draw(canvas, f2 / f3, this.Kg / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.bg != null) {
            this.Ta = i == 1;
            IL();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.bg != null) {
            this.Ta = i == 0;
            IL();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.bg != null) {
            this.Ta = i == 0;
            IL();
        }
    }
}
