package com.bytedance.adsdk.ugeno.WR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.ImageView implements com.bytedance.adsdk.ugeno.bg.zx, com.bytedance.adsdk.ugeno.core.IAnimation {
    static final /* synthetic */ boolean IL = true;
    public static final android.graphics.Shader.TileMode bg = android.graphics.Shader.TileMode.CLAMP;
    private static final android.widget.ImageView.ScaleType[] eqN = {android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE};
    private com.bytedance.adsdk.ugeno.bX Fy;
    private float Kg;
    private com.bytedance.adsdk.ugeno.bg.ldr LZ;
    private int Lq;
    private boolean PX;
    private boolean Ta;
    private android.graphics.drawable.Drawable VB;
    private android.graphics.Shader.TileMode VzQ;
    private android.graphics.ColorFilter WR;
    private float bX;
    private boolean eo;
    private android.content.res.ColorStateList iR;
    private android.graphics.drawable.Drawable ldr;
    private android.graphics.Shader.TileMode tuV;
    private int vb;
    private android.widget.ImageView.ScaleType xxp;
    private boolean yDt;
    private final float[] zx;

    public bg(android.content.Context context) {
        super(context);
        this.zx = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.iR = android.content.res.ColorStateList.valueOf(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.Kg = 0.0f;
        this.WR = null;
        this.eo = false;
        this.PX = false;
        this.Ta = false;
        this.yDt = false;
        android.graphics.Shader.TileMode tileMode = bg;
        this.VzQ = tileMode;
        this.tuV = tileMode;
        this.LZ = new com.bytedance.adsdk.ugeno.bg.ldr(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
        return this.xxp;
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (!IL && scaleType == null) {
            throw new java.lang.AssertionError();
        }
        if (this.xxp != scaleType) {
            this.xxp = scaleType;
            switch (com.bytedance.adsdk.ugeno.WR.eqN.bg.AnonymousClass1.bg[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            bX();
            bg(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.WR.eqN.bg$1, reason: invalid class name */
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
                bg[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.Lq = 0;
        this.VB = com.bytedance.adsdk.ugeno.WR.eqN.IL.bg(drawable);
        bX();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.Lq = 0;
        this.VB = com.bytedance.adsdk.ugeno.WR.eqN.IL.bg(bitmap);
        bX();
        super.setImageDrawable(this.VB);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.Lq != i) {
            this.Lq = i;
            this.VB = bg();
            bX();
            super.setImageDrawable(this.VB);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private android.graphics.drawable.Drawable bg() {
        android.content.res.Resources resources = getResources();
        android.graphics.drawable.Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.Lq;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (java.lang.Exception e) {
                android.util.Log.w("RoundedImageView", "Unable to find resource: " + this.Lq, e);
                this.Lq = 0;
            }
        }
        return com.bytedance.adsdk.ugeno.WR.eqN.IL.bg(drawable);
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.vb != i) {
            this.vb = i;
            android.graphics.drawable.Drawable drawableIL = IL();
            this.ldr = drawableIL;
            setBackgroundDrawable(drawableIL);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(i);
        this.ldr = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private android.graphics.drawable.Drawable IL() {
        android.content.res.Resources resources = getResources();
        android.graphics.drawable.Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.vb;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (java.lang.Exception e) {
                android.util.Log.w("RoundedImageView", "Unable to find resource: " + this.vb, e);
                this.vb = 0;
            }
        }
        return com.bytedance.adsdk.ugeno.WR.eqN.IL.bg(drawable);
    }

    private void bX() {
        bg(this.VB, this.xxp);
    }

    private void bg(boolean z) {
        if (this.yDt) {
            if (z) {
                this.ldr = com.bytedance.adsdk.ugeno.WR.eqN.IL.bg(this.ldr);
            }
            bg(this.ldr, android.widget.ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.WR != colorFilter) {
            this.WR = colorFilter;
            this.PX = true;
            this.eo = true;
            eqN();
            invalidate();
        }
    }

    private void eqN() {
        android.graphics.drawable.Drawable drawable = this.VB;
        if (drawable == null || !this.eo) {
            return;
        }
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        this.VB = drawableMutate;
        if (this.PX) {
            drawableMutate.setColorFilter(this.WR);
        }
    }

    private void bg(android.graphics.drawable.Drawable drawable, android.widget.ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof com.bytedance.adsdk.ugeno.WR.eqN.IL) {
            com.bytedance.adsdk.ugeno.WR.eqN.IL il = (com.bytedance.adsdk.ugeno.WR.eqN.IL) drawable;
            il.bg(scaleType).bg(this.Kg).bg(this.iR).bg(this.Ta).bg(this.VzQ).IL(this.tuV);
            float[] fArr = this.zx;
            if (fArr != null) {
                il.bg(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            eqN();
            return;
        }
        if (drawable instanceof android.graphics.drawable.LayerDrawable) {
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                bg(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.ldr = drawable;
        bg(true);
        super.setBackgroundDrawable(this.ldr);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.zx) {
            fMax = java.lang.Math.max(f, fMax);
        }
        return fMax;
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        bg(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        bg(f, f, f, f);
    }

    public void bg(float f, float f2, float f3, float f4) {
        float[] fArr = this.zx;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        bX();
        bg(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.Kg;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.Kg == f) {
            return;
        }
        this.Kg = f;
        bX();
        bg(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.iR.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(android.content.res.ColorStateList.valueOf(i));
    }

    public android.content.res.ColorStateList getBorderColors() {
        return this.iR;
    }

    public void setBorderColor(android.content.res.ColorStateList colorStateList) {
        if (this.iR.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        }
        this.iR = colorStateList;
        bX();
        bg(false);
        if (this.Kg > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.Ta = z;
        bX();
        bg(false);
        invalidate();
    }

    public android.graphics.Shader.TileMode getTileModeX() {
        return this.VzQ;
    }

    public void setTileModeX(android.graphics.Shader.TileMode tileMode) {
        if (this.VzQ == tileMode) {
            return;
        }
        this.VzQ = tileMode;
        bX();
        bg(false);
        invalidate();
    }

    public android.graphics.Shader.TileMode getTileModeY() {
        return this.tuV;
    }

    public void setTileModeY(android.graphics.Shader.TileMode tileMode) {
        if (this.tuV == tileMode) {
            return;
        }
        this.tuV = tileMode;
        bX();
        bg(false);
        invalidate();
    }

    public void bg(com.bytedance.adsdk.ugeno.bX bXVar) {
        this.Fy = bXVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.Fy;
        if (bXVar != null) {
            int[] iArrBg = bXVar.bg(i, i2);
            super.onMeasure(iArrBg[0], iArrBg[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.Fy;
        if (bXVar != null) {
            bXVar.bg(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.bX bXVar = this.Fy;
        if (bXVar != null) {
            bXVar.bg(canvas, this);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.Fy;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i3);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.Fy;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.Fy;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.bX;
    }

    public void setShine(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.LZ;
        if (ldrVar != null) {
            ldrVar.bX(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getShine() {
        return this.LZ.getShine();
    }

    public void setStretch(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.LZ;
        if (ldrVar != null) {
            ldrVar.eqN(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getStretch() {
        return this.LZ.getStretch();
    }

    public void setRubIn(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.LZ;
        if (ldrVar != null) {
            ldrVar.zx(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getRubIn() {
        return this.LZ.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.bX = f;
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.LZ;
        if (ldrVar != null) {
            ldrVar.IL(f);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.LZ;
        if (ldrVar != null) {
            ldrVar.bg(f);
        }
    }

    public float getBorderRadius() {
        return this.LZ.bg();
    }
}
