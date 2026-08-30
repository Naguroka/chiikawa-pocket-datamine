package com.bytedance.adsdk.ugeno.WR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends android.graphics.drawable.Drawable {
    private android.widget.ImageView.ScaleType Fy;
    private final android.graphics.RectF Kg;
    private float Lq;
    private android.graphics.Shader.TileMode PX;
    private android.graphics.Shader.TileMode Ta;
    private final android.graphics.RectF VB;
    private float VzQ;
    private final android.graphics.Paint WR;
    private final android.graphics.RectF bX;
    private final android.graphics.Matrix eo;
    private final android.graphics.Bitmap eqN;
    private final int iR;
    private final int ldr;
    private android.content.res.ColorStateList tuV;
    private final boolean[] vb;
    private boolean xxp;
    private boolean yDt;
    private final android.graphics.Paint zx;
    private final android.graphics.RectF bg = new android.graphics.RectF();
    private final android.graphics.RectF IL = new android.graphics.RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public IL(android.graphics.Bitmap bitmap) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.bX = rectF;
        this.Kg = new android.graphics.RectF();
        this.eo = new android.graphics.Matrix();
        this.VB = new android.graphics.RectF();
        this.PX = android.graphics.Shader.TileMode.CLAMP;
        this.Ta = android.graphics.Shader.TileMode.CLAMP;
        this.yDt = true;
        this.Lq = 0.0f;
        this.vb = new boolean[]{true, true, true, true};
        this.xxp = false;
        this.VzQ = 0.0f;
        this.tuV = android.content.res.ColorStateList.valueOf(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.Fy = android.widget.ImageView.ScaleType.FIT_CENTER;
        this.eqN = bitmap;
        int width = bitmap.getWidth();
        this.ldr = width;
        int height = bitmap.getHeight();
        this.iR = height;
        rectF.set(0.0f, 0.0f, width, height);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.zx = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.WR = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.tuV.getColorForState(getState(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.VzQ);
    }

    public static com.bytedance.adsdk.ugeno.WR.eqN.IL bg(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return new com.bytedance.adsdk.ugeno.WR.eqN.IL(bitmap);
        }
        return null;
    }

    public static android.graphics.drawable.Drawable bg(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof com.bytedance.adsdk.ugeno.WR.eqN.IL) {
                return drawable;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && (drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
                return drawable;
            }
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), bg(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        android.graphics.Bitmap bitmapIL = IL(drawable);
        return bitmapIL != null ? new com.bytedance.adsdk.ugeno.WR.eqN.IL(bitmapIL) : drawable;
    }

    public static android.graphics.Bitmap IL(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        try {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(java.lang.Math.max(drawable.getIntrinsicWidth(), 2), java.lang.Math.max(drawable.getIntrinsicHeight(), 2), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable unused) {
            android.util.Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.tuV.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.tuV.getColorForState(iArr, 0);
        if (this.WR.getColor() != colorForState) {
            this.WR.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.WR.eqN.IL$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            bg = iArr;
            try {
                iArr[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    private void bg() {
        float fWidth;
        float fHeight;
        int i = com.bytedance.adsdk.ugeno.WR.eqN.IL.AnonymousClass1.bg[this.Fy.ordinal()];
        if (i == 1) {
            this.Kg.set(this.bg);
            android.graphics.RectF rectF = this.Kg;
            float f = this.VzQ;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.eo.reset();
            this.eo.setTranslate((int) (((this.Kg.width() - this.ldr) * 0.5f) + 0.5f), (int) (((this.Kg.height() - this.iR) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.Kg.set(this.bg);
            android.graphics.RectF rectF2 = this.Kg;
            float f2 = this.VzQ;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.eo.reset();
            float fWidth2 = 0.0f;
            if (this.ldr * this.Kg.height() > this.Kg.width() * this.iR) {
                fWidth = this.Kg.height() / this.iR;
                fHeight = 0.0f;
                fWidth2 = (this.Kg.width() - (this.ldr * fWidth)) * 0.5f;
            } else {
                fWidth = this.Kg.width() / this.ldr;
                fHeight = (this.Kg.height() - (this.iR * fWidth)) * 0.5f;
            }
            this.eo.setScale(fWidth, fWidth);
            android.graphics.Matrix matrix = this.eo;
            float f3 = this.VzQ;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.eo.reset();
            float fMin = (((float) this.ldr) > this.bg.width() || ((float) this.iR) > this.bg.height()) ? java.lang.Math.min(this.bg.width() / this.ldr, this.bg.height() / this.iR) : 1.0f;
            float fWidth3 = (int) (((this.bg.width() - (this.ldr * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.bg.height() - (this.iR * fMin)) * 0.5f) + 0.5f);
            this.eo.setScale(fMin, fMin);
            this.eo.postTranslate(fWidth3, fHeight2);
            this.Kg.set(this.bX);
            this.eo.mapRect(this.Kg);
            android.graphics.RectF rectF3 = this.Kg;
            float f4 = this.VzQ;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.eo.setRectToRect(this.bX, this.Kg, android.graphics.Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.Kg.set(this.bX);
            this.eo.setRectToRect(this.bX, this.bg, android.graphics.Matrix.ScaleToFit.END);
            this.eo.mapRect(this.Kg);
            android.graphics.RectF rectF4 = this.Kg;
            float f5 = this.VzQ;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.eo.setRectToRect(this.bX, this.Kg, android.graphics.Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.Kg.set(this.bX);
            this.eo.setRectToRect(this.bX, this.bg, android.graphics.Matrix.ScaleToFit.START);
            this.eo.mapRect(this.Kg);
            android.graphics.RectF rectF5 = this.Kg;
            float f6 = this.VzQ;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.eo.setRectToRect(this.bX, this.Kg, android.graphics.Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.Kg.set(this.bX);
            this.eo.setRectToRect(this.bX, this.bg, android.graphics.Matrix.ScaleToFit.CENTER);
            this.eo.mapRect(this.Kg);
            android.graphics.RectF rectF6 = this.Kg;
            float f7 = this.VzQ;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.eo.setRectToRect(this.bX, this.Kg, android.graphics.Matrix.ScaleToFit.FILL);
        } else {
            this.Kg.set(this.bg);
            android.graphics.RectF rectF7 = this.Kg;
            float f8 = this.VzQ;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.eo.reset();
            this.eo.setRectToRect(this.bX, this.Kg, android.graphics.Matrix.ScaleToFit.FILL);
        }
        this.IL.set(this.Kg);
        this.yDt = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.bg.set(rect);
        bg();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.yDt) {
            android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(this.eqN, this.PX, this.Ta);
            if (this.PX == android.graphics.Shader.TileMode.CLAMP && this.Ta == android.graphics.Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.eo);
            }
            this.zx.setShader(bitmapShader);
            this.yDt = false;
        }
        if (this.xxp) {
            if (this.VzQ > 0.0f) {
                canvas.drawOval(this.IL, this.zx);
                canvas.drawOval(this.Kg, this.WR);
                return;
            } else {
                canvas.drawOval(this.IL, this.zx);
                return;
            }
        }
        if (bg(this.vb)) {
            float f = this.Lq;
            if (this.VzQ > 0.0f) {
                canvas.drawRoundRect(this.IL, f, f, this.zx);
                canvas.drawRoundRect(this.Kg, f, f, this.WR);
                bg(canvas);
                IL(canvas);
                return;
            }
            canvas.drawRoundRect(this.IL, f, f, this.zx);
            bg(canvas);
            return;
        }
        canvas.drawRect(this.IL, this.zx);
        if (this.VzQ > 0.0f) {
            canvas.drawRect(this.Kg, this.WR);
        }
    }

    private void bg(android.graphics.Canvas canvas) {
        if (IL(this.vb) || this.Lq == 0.0f) {
            return;
        }
        float f = this.IL.left;
        float f2 = this.IL.top;
        float fWidth = this.IL.width() + f;
        float fHeight = this.IL.height() + f2;
        float f3 = this.Lq;
        if (!this.vb[0]) {
            this.VB.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.VB, this.zx);
        }
        if (!this.vb[1]) {
            this.VB.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.VB, this.zx);
        }
        if (!this.vb[2]) {
            this.VB.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.VB, this.zx);
        }
        if (this.vb[3]) {
            return;
        }
        this.VB.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.VB, this.zx);
    }

    private void IL(android.graphics.Canvas canvas) {
        if (IL(this.vb) || this.Lq == 0.0f) {
            return;
        }
        float f = this.IL.left;
        float f2 = this.IL.top;
        float fWidth = f + this.IL.width();
        float fHeight = f2 + this.IL.height();
        float f3 = this.Lq;
        float f4 = this.VzQ / 2.0f;
        if (!this.vb[0]) {
            canvas.drawLine(f - f4, f2, f + f3, f2, this.WR);
            canvas.drawLine(f, f2 - f4, f, f2 + f3, this.WR);
        }
        if (!this.vb[1]) {
            canvas.drawLine((fWidth - f3) - f4, f2, fWidth, f2, this.WR);
            canvas.drawLine(fWidth, f2 - f4, fWidth, f2 + f3, this.WR);
        }
        if (!this.vb[2]) {
            canvas.drawLine((fWidth - f3) - f4, fHeight, fWidth + f4, fHeight, this.WR);
            canvas.drawLine(fWidth, fHeight - f3, fWidth, fHeight, this.WR);
        }
        if (this.vb[3]) {
            return;
        }
        canvas.drawLine(f - f4, fHeight, f + f3, fHeight, this.WR);
        canvas.drawLine(f, fHeight - f3, f, fHeight, this.WR);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.zx.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.zx.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.zx.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.zx.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.zx.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.zx.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.ldr;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.iR;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL bg(float f, float f2, float f3, float f4) {
        java.util.HashSet hashSet = new java.util.HashSet(4);
        hashSet.add(java.lang.Float.valueOf(f));
        hashSet.add(java.lang.Float.valueOf(f2));
        hashSet.add(java.lang.Float.valueOf(f3));
        hashSet.add(java.lang.Float.valueOf(f4));
        hashSet.remove(java.lang.Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new java.lang.IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float fFloatValue = ((java.lang.Float) hashSet.iterator().next()).floatValue();
            if (java.lang.Float.isInfinite(fFloatValue) || java.lang.Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new java.lang.IllegalArgumentException("Invalid radius value: ".concat(java.lang.String.valueOf(fFloatValue)));
            }
            this.Lq = fFloatValue;
        } else {
            this.Lq = 0.0f;
        }
        boolean[] zArr = this.vb;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL bg(float f) {
        this.VzQ = f;
        this.WR.setStrokeWidth(f);
        return this;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL bg(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.tuV = colorStateList;
        this.WR.setColor(colorStateList.getColorForState(getState(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL bg(boolean z) {
        this.xxp = z;
        return this;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL bg(android.widget.ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if (this.Fy != scaleType) {
            this.Fy = scaleType;
            bg();
        }
        return this;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL bg(android.graphics.Shader.TileMode tileMode) {
        if (this.PX != tileMode) {
            this.PX = tileMode;
            this.yDt = true;
            invalidateSelf();
        }
        return this;
    }

    public com.bytedance.adsdk.ugeno.WR.eqN.IL IL(android.graphics.Shader.TileMode tileMode) {
        if (this.Ta != tileMode) {
            this.Ta = tileMode;
            this.yDt = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean bg(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean IL(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
