package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends android.view.ViewGroup implements com.bytedance.adsdk.ugeno.IL.IL, com.bytedance.adsdk.ugeno.bg.zx {
    private final com.bytedance.adsdk.ugeno.yoga.PX IL;
    private com.bytedance.adsdk.ugeno.bX bX;
    private final java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.PX> bg;
    private com.bytedance.adsdk.ugeno.bg.ldr eqN;

    public Kg(android.content.Context context) {
        this(context, null, 0);
    }

    public Kg(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.eqN = new com.bytedance.adsdk.ugeno.bg.ldr(this);
        com.bytedance.adsdk.ugeno.yoga.PX pxBg = com.bytedance.adsdk.ugeno.yoga.Ta.bg();
        this.IL = pxBg;
        this.bg = new java.util.HashMap();
        pxBg.bg(this);
        pxBg.bg((com.bytedance.adsdk.ugeno.yoga.WR) new com.bytedance.adsdk.ugeno.yoga.Kg.IL());
        bg((com.bytedance.adsdk.ugeno.yoga.Kg.bg) generateDefaultLayoutParams(), pxBg, this);
    }

    public com.bytedance.adsdk.ugeno.yoga.PX getYogaNode() {
        return this.IL;
    }

    public com.bytedance.adsdk.ugeno.yoga.PX bg(android.view.View view) {
        return this.bg.get(view);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.IL
    public void bg(int i) {
        com.bytedance.adsdk.ugeno.yoga.PX px = this.IL;
        if (px != null) {
            bg(px, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.IL
    public void IL(int i) {
        com.bytedance.adsdk.ugeno.yoga.PX px = this.IL;
        if (px != null) {
            IL(px, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.IL
    public void bg(android.view.View view, int i) {
        com.bytedance.adsdk.ugeno.yoga.PX pxBg;
        if (view == null || (pxBg = bg(view)) == null) {
            return;
        }
        bg(pxBg, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.IL
    public void IL(android.view.View view, int i) {
        com.bytedance.adsdk.ugeno.yoga.PX pxBg;
        if (view == null || (pxBg = bg(view)) == null) {
            return;
        }
        IL(pxBg, i);
        view.requestLayout();
    }

    private void bg(com.bytedance.adsdk.ugeno.yoga.PX px, int i) {
        if (i == -1) {
            px.zx(100.0f);
        } else if (i == -2) {
            px.bX();
        } else {
            px.eqN(i);
        }
    }

    private void IL(com.bytedance.adsdk.ugeno.yoga.PX px, int i) {
        if (i == -1) {
            px.iR(100.0f);
        } else if (i == -2) {
            px.eqN();
        } else {
            px.ldr(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.IL
    public void bX(android.view.View view, int i) {
        eqN(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        com.bytedance.adsdk.ugeno.yoga.PX pxBg;
        this.IL.bg((com.bytedance.adsdk.ugeno.yoga.WR) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.bg) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.bg.containsKey(view)) {
            return;
        }
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.Kg) {
            pxBg = ((com.bytedance.adsdk.ugeno.yoga.Kg) view).getYogaNode();
        } else {
            if (this.bg.containsKey(view)) {
                pxBg = this.bg.get(view);
            } else {
                pxBg = com.bytedance.adsdk.ugeno.yoga.Ta.bg();
            }
            pxBg.bg(view);
            pxBg.bg((com.bytedance.adsdk.ugeno.yoga.WR) new com.bytedance.adsdk.ugeno.yoga.Kg.IL());
        }
        bg((com.bytedance.adsdk.ugeno.yoga.Kg.bg) view.getLayoutParams(), pxBg, view);
        this.bg.put(view, pxBg);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, java.lang.Integer.valueOf(this.IL.bg()));
        } else {
            com.bytedance.adsdk.ugeno.yoga.PX px = this.IL;
            px.bg(pxBg, px.bg());
        }
    }

    public void eqN(android.view.View view, int i) {
        int iBg;
        view.setVisibility(i);
        try {
            com.bytedance.adsdk.ugeno.yoga.PX px = this.bg.get(view);
            java.lang.Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (iBg = this.IL.bg(px)) == -1) {
                    return;
                }
                this.IL.IL(iBg);
                view.setTag(151060224, java.lang.Integer.valueOf(iBg));
                bg(this.IL);
                return;
            }
            if (tag == null || this.IL.bg(px) != -1) {
                return;
            }
            int iIntValue = ((java.lang.Integer) tag).intValue();
            if (iIntValue < this.IL.bg()) {
                this.IL.bg(this.bg.get(view), iIntValue);
            } else {
                this.IL.bg(this.bg.get(view), this.IL.bg());
            }
            bg(this.IL);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void bg(com.bytedance.adsdk.ugeno.yoga.PX px) {
        if (px.IL() != null) {
            bg(px.IL());
        } else {
            px.bg(Float.NaN, Float.NaN);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        bg(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        bg(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        bg(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bg(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bg(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            bg(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            bg(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    private void bg(android.view.View view, boolean z) {
        com.bytedance.adsdk.ugeno.yoga.PX px = this.bg.get(view);
        if (px == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.yoga.PX pxIL = px.IL();
        for (int i = 0; i < pxIL.bg(); i++) {
            if (pxIL.bg(i).equals(px)) {
                pxIL.IL(i);
                break;
            }
        }
        px.bg((java.lang.Object) null);
        this.bg.remove(view);
        if (z) {
            this.IL.bg(Float.NaN, Float.NaN);
        }
    }

    private void bg(com.bytedance.adsdk.ugeno.yoga.PX px, float f, float f2) {
        android.view.View view = (android.view.View) px.WR();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = java.lang.Math.round(px.zx() + f);
            int iRound2 = java.lang.Math.round(px.ldr() + f2);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(px.iR()), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(px.Kg()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iBg = px.bg();
        for (int i = 0; i < iBg; i++) {
            if (equals(view)) {
                bg(px.bg(i), f, f2);
            } else if (!(view instanceof com.bytedance.adsdk.ugeno.yoga.Kg)) {
                bg(px.bg(i), px.zx() + f, px.ldr() + f2);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.bg(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.ldr();
        }
        if (!(getParent() instanceof com.bytedance.adsdk.ugeno.yoga.Kg)) {
            bg(android.view.View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        bg(this.IL, 0.0f, 0.0f);
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.bX;
        if (bXVar2 != null) {
            bXVar2.bg(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(getParent() instanceof com.bytedance.adsdk.ugeno.yoga.Kg)) {
            bg(i, i2);
        }
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            int[] iArrBg = bXVar.bg(i, i2);
            setMeasuredDimension(iArrBg[0], iArrBg[1]);
        } else {
            setMeasuredDimension(java.lang.Math.round(this.IL.iR()), java.lang.Math.round(this.IL.Kg()));
        }
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.bX;
        if (bXVar2 != null) {
            bXVar2.zx();
        }
    }

    private void bg(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.IL.ldr(size2);
        }
        if (mode == 1073741824) {
            this.IL.eqN(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.IL.WR(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.IL.Kg(size);
        }
        this.IL.bg(Float.NaN, Float.NaN);
    }

    protected static void bg(com.bytedance.adsdk.ugeno.yoga.Kg.bg bgVar, com.bytedance.adsdk.ugeno.yoga.PX px, android.view.View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            px.bg(com.bytedance.adsdk.ugeno.yoga.eqN.RTL);
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            if (background.getPadding(rect)) {
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.LEFT, rect.left);
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.TOP, rect.top);
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.RIGHT, rect.right);
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.BOTTOM, rect.bottom);
            }
        }
        for (int i = 0; i < bgVar.bg.size(); i++) {
            int iKeyAt = bgVar.bg.keyAt(i);
            float fFloatValue = bgVar.bg.valueAt(i).floatValue();
            if (iKeyAt == 4) {
                px.bX(com.bytedance.adsdk.ugeno.yoga.IL.bg(java.lang.Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.IL.bg(java.lang.Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                px.IL(com.bytedance.adsdk.ugeno.yoga.IL.bg(java.lang.Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                px.eo(fFloatValue);
            } else if (iKeyAt == 8) {
                px.bX(fFloatValue);
            } else if (iKeyAt == 1) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.ldr.bg(java.lang.Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                px.bg(fFloatValue);
            } else if (iKeyAt == 7) {
                px.IL(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    px.iR(100.0f);
                } else if (fFloatValue == -2.0f) {
                    px.eqN();
                } else {
                    px.ldr(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.zx.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.iR.bg(java.lang.Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.zx.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.zx.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.zx.BOTTOM, fFloatValue);
            } else if (iKeyAt == 22) {
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                px.IL(com.bytedance.adsdk.ugeno.yoga.zx.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                px.bX(com.bytedance.adsdk.ugeno.yoga.zx.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                px.bX(com.bytedance.adsdk.ugeno.yoga.zx.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                px.bX(com.bytedance.adsdk.ugeno.yoga.zx.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                px.bX(com.bytedance.adsdk.ugeno.yoga.zx.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.Lq.bg(java.lang.Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    px.zx(100.0f);
                } else if (fFloatValue == -2.0f) {
                    px.bX();
                } else {
                    px.eqN(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                px.bg(com.bytedance.adsdk.ugeno.yoga.xxp.bg(java.lang.Math.round(fFloatValue)));
            }
        }
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.bytedance.adsdk.ugeno.yoga.Kg.bg(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.bytedance.adsdk.ugeno.yoga.Kg.bg(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.bytedance.adsdk.ugeno.yoga.Kg.bg;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i4);
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.bX = bXVar;
    }

    public void setBorderRadius(float f) {
        this.eqN.bg(f);
    }

    public float getBorderRadius() {
        return this.eqN.bg();
    }

    public void setRipple(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.eqN;
        if (ldrVar != null) {
            ldrVar.IL(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.eqN.getRipple();
    }

    public void setShine(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.eqN;
        if (ldrVar != null) {
            ldrVar.bX(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getShine() {
        return this.eqN.getShine();
    }

    public void setStretch(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.eqN;
        if (ldrVar != null) {
            ldrVar.eqN(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getStretch() {
        return this.eqN.getStretch();
    }

    public void setRubIn(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.eqN;
        if (ldrVar != null) {
            ldrVar.zx(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getRubIn() {
        return this.eqN.getRubIn();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.eqN.bg(i);
    }

    public static class bg extends android.view.ViewGroup.LayoutParams {
        android.util.SparseArray<java.lang.String> IL;
        private float Kg;
        private float Lq;
        private float PX;
        private float Ta;
        private float VB;
        private float WR;
        private float bX;
        android.util.SparseArray<java.lang.Float> bg;
        private float eo;
        private float eqN;
        private float iR;
        private float ldr;
        private float vb;
        private float xxp;
        private float yDt;
        private float zx;

        public bg(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof com.bytedance.adsdk.ugeno.yoga.Kg.bg) {
                com.bytedance.adsdk.ugeno.yoga.Kg.bg bgVar = (com.bytedance.adsdk.ugeno.yoga.Kg.bg) layoutParams;
                this.bg = bgVar.bg.clone();
                this.IL = bgVar.IL.clone();
                return;
            }
            this.bg = new android.util.SparseArray<>();
            this.IL = new android.util.SparseArray<>();
            if (layoutParams.width >= 0) {
                this.bg.put(15, java.lang.Float.valueOf(this.width));
            }
            if (layoutParams.height >= 0) {
                this.bg.put(16, java.lang.Float.valueOf(this.height));
            }
        }

        public bg(int i, int i2) {
            super(i, i2);
            this.bg = new android.util.SparseArray<>();
            this.IL = new android.util.SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.bg.put(15, java.lang.Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.bg.put(16, java.lang.Float.valueOf(i2));
            }
        }

        public void bg(float f) {
            this.iR = f;
            this.bg.put(5, java.lang.Float.valueOf(f));
        }

        public void IL(float f) {
            this.Kg = f;
            this.bg.put(6, java.lang.Float.valueOf(f));
        }

        public void bX(float f) {
            this.WR = f;
            this.bg.put(7, java.lang.Float.valueOf(f));
        }

        public void eqN(float f) {
            this.eo = f;
            this.bg.put(8, java.lang.Float.valueOf(f));
        }

        public void zx(float f) {
            this.VB = f;
            this.bg.put(9, java.lang.Float.valueOf(f));
        }

        public void ldr(float f) {
            this.PX = f;
            this.bg.put(14, java.lang.Float.valueOf(f));
        }

        public void iR(float f) {
            this.Ta = f;
            this.bg.put(10, java.lang.Float.valueOf(f));
        }

        public void Kg(float f) {
            this.yDt = f;
            this.bg.put(11, java.lang.Float.valueOf(f));
        }

        public void WR(float f) {
            this.Lq = f;
            this.bg.put(12, java.lang.Float.valueOf(f));
        }

        public void eo(float f) {
            this.vb = f;
            this.bg.put(13, java.lang.Float.valueOf(f));
        }

        public void VB(float f) {
            this.bX = f;
            this.bg.put(17, java.lang.Float.valueOf(f));
        }

        public void PX(float f) {
            this.eqN = f;
            this.bg.put(18, java.lang.Float.valueOf(f));
        }

        public void Ta(float f) {
            this.zx = f;
            this.bg.put(19, java.lang.Float.valueOf(f));
        }

        public void yDt(float f) {
            this.ldr = f;
            this.bg.put(20, java.lang.Float.valueOf(f));
        }

        public void Lq(float f) {
            this.xxp = f;
            this.bg.put(25, java.lang.Float.valueOf(f));
        }
    }

    public static class IL implements com.bytedance.adsdk.ugeno.yoga.WR {
        @Override // com.bytedance.adsdk.ugeno.yoga.WR
        public long bg(com.bytedance.adsdk.ugeno.yoga.PX px, float f, com.bytedance.adsdk.ugeno.yoga.eo eoVar, float f2, com.bytedance.adsdk.ugeno.yoga.eo eoVar2) {
            android.view.View view = (android.view.View) px.WR();
            if (view == null || (view instanceof com.bytedance.adsdk.ugeno.yoga.Kg)) {
                return com.bytedance.adsdk.ugeno.yoga.VB.bg(0, 0);
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) f, bg(eoVar)), android.view.View.MeasureSpec.makeMeasureSpec((int) f2, bg(eoVar2)));
            return com.bytedance.adsdk.ugeno.yoga.VB.bg(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int bg(com.bytedance.adsdk.ugeno.yoga.eo eoVar) {
            if (eoVar == com.bytedance.adsdk.ugeno.yoga.eo.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return eoVar == com.bytedance.adsdk.ugeno.yoga.eo.EXACTLY ? 1073741824 : 0;
        }
    }
}
