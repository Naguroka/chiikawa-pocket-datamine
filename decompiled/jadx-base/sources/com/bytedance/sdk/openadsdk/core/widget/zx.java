package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends android.widget.ImageView {
    private android.graphics.Movie IL;
    private float Kg;
    private boolean Lq;
    private int PX;
    private volatile boolean Ta;
    private int VB;
    private float WR;
    private long bX;
    private int bg;
    private float eo;
    private int eqN;
    private boolean iR;
    private boolean ldr;
    private boolean yDt;
    private android.graphics.drawable.AnimatedImageDrawable zx;

    public zx(android.content.Context context) {
        super(context);
        this.ldr = android.os.Build.VERSION.SDK_INT >= 28;
        this.iR = false;
        this.yDt = true;
        this.Lq = true;
        bg();
    }

    void bg() {
        if (this.ldr) {
            return;
        }
        setLayerType(1, null);
    }

    public void bg(int i, boolean z) {
        this.Ta = z;
        this.bg = i;
        if (i != -1) {
            if (!this.ldr) {
                this.IL = bg(i);
            } else {
                this.zx = IL(i);
            }
        }
    }

    public void bg(byte[] bArr, boolean z) {
        this.Ta = z;
        if (bArr != null) {
            if (!this.ldr) {
                this.IL = bg(bArr);
            } else {
                this.zx = IL(bArr);
            }
            bX();
        }
    }

    public void setRepeatConfig(boolean z) {
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable;
        this.Lq = z;
        if (z) {
            return;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.zx) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("GifView", "setRepeatConfig error", e);
        }
    }

    private android.graphics.Movie bg(int i) {
        try {
            return android.graphics.Movie.decodeStream(getResources().openRawResource(i));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private android.graphics.Movie bg(byte[] bArr) {
        try {
            return android.graphics.Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private android.graphics.drawable.AnimatedImageDrawable IL(int i) {
        if (i != -1 && android.os.Build.VERSION.SDK_INT >= 28) {
            return bg(android.graphics.ImageDecoder.createSource(getResources(), i));
        }
        return null;
    }

    private android.graphics.drawable.AnimatedImageDrawable IL(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bg(bX(bArr));
    }

    private android.graphics.ImageDecoder.Source bX(byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        try {
            java.io.File fileBg = bg(getContext(), com.bytedance.sdk.openadsdk.multipro.IL.bX() ? "GIF_AD_CACHE/" : "/GIF_CACHE/", "TT_GIF_FILE");
            fileOutputStream = new java.io.FileOutputStream(fileBg);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    android.graphics.ImageDecoder.Source sourceCreateSource = android.graphics.ImageDecoder.createSource(fileBg);
                    try {
                        fileOutputStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                    return sourceCreateSource;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.bytedance.sdk.component.utils.PX.bg("GifView", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        return null;
    }

    private android.graphics.drawable.AnimatedImageDrawable bg(android.graphics.ImageDecoder.Source source) {
        try {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                return null;
            }
            android.graphics.drawable.Drawable drawableDecodeDrawable = android.graphics.ImageDecoder.decodeDrawable(source);
            setImageDrawable(drawableDecodeDrawable);
            if (drawableDecodeDrawable instanceof android.graphics.drawable.AnimatedImageDrawable) {
                android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = (android.graphics.drawable.AnimatedImageDrawable) drawableDecodeDrawable;
                if (!this.Ta) {
                    animatedImageDrawable.start();
                }
                return animatedImageDrawable;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public void IL() {
        if (this.IL == null || !this.Ta) {
            return;
        }
        this.Ta = false;
        if (!this.ldr) {
            this.bX = android.os.SystemClock.uptimeMillis() - ((long) this.eqN);
            invalidate();
            return;
        }
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = this.zx;
        if (animatedImageDrawable == null || animatedImageDrawable.isRunning()) {
            return;
        }
        this.zx.start();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        android.graphics.Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.ldr || (movie = this.IL) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.IL.height();
        float fMax = 1.0f / java.lang.Math.max((android.view.View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = android.view.View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (android.view.View.MeasureSpec.getMode(i2) == 0 || iHeight <= (size = android.view.View.MeasureSpec.getSize(i2))) ? 1.0f : iHeight / size);
        this.eo = fMax;
        int i3 = (int) (iWidth * fMax);
        this.VB = i3;
        int i4 = (int) (iHeight * fMax);
        this.PX = i4;
        setMeasuredDimension(i3, i4);
    }

    public static java.io.File bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.bytedance.sdk.component.utils.ldr.bg(context, com.bytedance.sdk.openadsdk.multipro.IL.bX(), str, str2);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.IL != null && !this.ldr) {
            this.Kg = (getWidth() - this.VB) / 2.0f;
            this.WR = (getHeight() - this.PX) / 2.0f;
        }
        this.yDt = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.IL != null && !this.ldr) {
            try {
                if (!this.Ta) {
                    eqN();
                    bg(canvas);
                    bX();
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

    private void bX() {
        if (this.IL == null || this.ldr || !this.yDt) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void eqN() {
        if (this.IL == null) {
            return;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.bX == 0) {
            this.bX = jUptimeMillis;
        }
        int iDuration = this.IL.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (!this.Lq && java.lang.Math.abs(iDuration - this.eqN) < 60) {
            this.eqN = iDuration;
            this.Ta = true;
        } else {
            this.eqN = (int) ((jUptimeMillis - this.bX) % ((long) iDuration));
        }
    }

    private void bg(android.graphics.Canvas canvas) {
        android.graphics.Movie movie = this.IL;
        if (movie == null) {
            return;
        }
        movie.setTime(this.eqN);
        float f = this.eo;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.IL.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            android.graphics.Movie movie2 = this.IL;
            float f2 = this.Kg;
            float f3 = this.eo;
            movie2.draw(canvas, f2 / f3, this.WR / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.IL != null) {
            this.yDt = i == 1;
            bX();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.IL != null) {
            this.yDt = i == 0;
            bX();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.IL != null) {
            this.yDt = i == 0;
            bX();
        }
    }
}
