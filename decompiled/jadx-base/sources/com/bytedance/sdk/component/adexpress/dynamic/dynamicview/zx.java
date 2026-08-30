package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zx extends android.widget.FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS {
    private float Fy;
    private float IL;
    protected int Kg;
    private com.bytedance.sdk.component.utils.LZ LZ;
    protected android.view.View Lq;
    protected com.bytedance.sdk.component.adexpress.dynamic.eqN.iR PX;
    protected com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg Ta;
    protected android.content.Context VB;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX VzQ;
    protected int WR;
    protected float bX;
    private float bg;
    protected int eo;
    protected float eqN;
    protected int iR;
    protected float ldr;
    private float tuV;
    protected boolean vb;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.bg.IL xxp;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView yDt;
    protected float zx;
    private static final android.view.View.OnTouchListener tC = new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            return true;
        }
    };
    private static final android.view.View.OnClickListener rri = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.3
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
        }
    };

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.IL = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.bg = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.tuV;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.tuV = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.Fy;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.Fy = f;
        this.VzQ.bg(this, f);
    }

    public zx(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context);
        this.VB = context;
        this.yDt = dynamicRootView;
        this.Ta = kg;
        this.bX = kg.ldr();
        this.eqN = kg.iR();
        this.zx = kg.Kg();
        this.ldr = kg.WR();
        this.WR = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.bX);
        this.eo = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.eqN);
        this.iR = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.zx);
        this.Kg = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.ldr);
        com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar = new com.bytedance.sdk.component.adexpress.dynamic.eqN.iR(kg.eo());
        this.PX = iRVar;
        if (iRVar.VzQ() > 0) {
            this.iR += this.PX.VzQ() * 2;
            this.Kg += this.PX.VzQ() * 2;
            this.WR -= this.PX.VzQ();
            this.eo -= this.PX.VzQ();
            java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB = kg.VB();
            if (listVB != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2 : listVB) {
                    kg2.bX(kg2.ldr() + com.bytedance.sdk.component.adexpress.eqN.Kg.IL(this.VB, this.PX.VzQ()));
                    kg2.eqN(kg2.iR() + com.bytedance.sdk.component.adexpress.eqN.Kg.IL(this.VB, this.PX.VzQ()));
                    kg2.bg(com.bytedance.sdk.component.adexpress.eqN.Kg.IL(this.VB, this.PX.VzQ()));
                    kg2.IL(com.bytedance.sdk.component.adexpress.eqN.Kg.IL(this.VB, this.PX.VzQ()));
                }
            }
        }
        this.vb = this.PX.yDt() > 0.0d;
        this.VzQ = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX();
    }

    public void setShouldInvisible(boolean z) {
        this.vb = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.vb;
    }

    public boolean bX() {
        WR();
        ldr();
        eqN();
        return true;
    }

    public void bg(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar = this.PX;
        if (iRVar != null && iRVar.bg(i)) {
            WR();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx)) {
                    ((com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx) childAt).bg(i);
                }
            }
        }
    }

    protected boolean eqN() {
        android.view.View.OnTouchListener onTouchListener;
        android.view.View.OnClickListener onClickListener;
        android.view.View view = this.Lq;
        android.view.View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (zx()) {
            onTouchListener = (android.view.View.OnTouchListener) getDynamicClickListener();
            onClickListener = (android.view.View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = tC;
            onClickListener = rri;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iBg = com.bytedance.sdk.component.adexpress.dynamic.IL.bg.bg(this.PX);
            if (iBg == 2 || iBg == 3) {
                view2.setOnClickListener(rri);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        bg(view2);
        IL(view2);
        return true;
    }

    protected void bg(android.view.View view) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("width", this.Ta.Kg());
            jSONObject.put("height", this.Ta.WR());
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.bg.Fy, this.PX.LKE());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.bg.LZ, this.Ta.eo().IL());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.bg.tC, this.Ta.bX());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.bg.rri, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.PX.LKE());
            view.setTag(2097610715, this.Ta.eo().IL());
            view.setTag(2097610714, this.Ta.bX());
            view.setTag(2097610713, jSONObject.toString());
            int iBg = com.bytedance.sdk.component.adexpress.dynamic.IL.bg.bg(this.PX);
            if (iBg == 1) {
                view.setTag(2097610707, new android.util.Pair(this.PX.JAA(), java.lang.Long.valueOf(this.PX.Ja())));
                view.setTag(2097610708, java.lang.Integer.valueOf(iBg));
            }
        } catch (org.json.JSONException unused) {
        }
    }

    protected void IL(android.view.View view) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg = this.Ta;
        if (kg == null || (ldrVarZx = kg.eo().zx()) == null) {
            return;
        }
        view.setTag(2097610716, java.lang.Boolean.valueOf(ldrVarZx.mLT()));
    }

    public boolean zx() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar = this.PX;
        return (iRVar == null || iRVar.Uw() == 0) ? false : true;
    }

    public void ldr() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
        layoutParams.topMargin = this.eo;
        layoutParams.leftMargin = this.WR;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.PX.Uw();
    }

    public java.lang.String getImageObjectFit() {
        return this.PX.lM();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ldr.bg getDynamicClickListener() {
        return this.yDt.getDynamicClickListener();
    }

    protected android.graphics.drawable.Drawable getBackgroundDrawable() {
        return bg(false, "");
    }

    protected android.graphics.drawable.Drawable bg(boolean z, java.lang.String str) {
        java.lang.String[] strArrSplit;
        int[] iArr;
        int iDDQ;
        if (!android.text.TextUtils.isEmpty(this.PX.ZQc())) {
            try {
                java.lang.String strZQc = this.PX.ZQc();
                java.lang.String strSubstring = strZQc.substring(strZQc.indexOf("(") + 1, strZQc.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new java.lang.String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d = java.lang.Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (java.lang.Exception unused) {
                }
                android.graphics.drawable.GradientDrawable gradientDrawableBg = bg(bg(strArrSplit[0]), iArr);
                gradientDrawableBg.setShape(0);
                gradientDrawableBg.setCornerRadius(com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.Lq()));
                return gradientDrawableBg;
            } catch (java.lang.Exception unused2) {
                android.graphics.drawable.Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        android.graphics.drawable.GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fBg = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.Lq());
        drawable.setCornerRadius(fBg);
        if (fBg < 1.0f) {
            float fBg2 = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.aGH());
            float fBg3 = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.VW());
            float fBg4 = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.VJ());
            float fBg5 = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.daV());
            float[] fArr = new float[8];
            if (fBg2 > 0.0f) {
                fArr[0] = fBg2;
                fArr[1] = fBg2;
            }
            if (fBg3 > 0.0f) {
                fArr[2] = fBg3;
                fArr[3] = fBg3;
            }
            if (fBg4 > 0.0f) {
                fArr[4] = fBg4;
                fArr[5] = fBg4;
            }
            if (fBg5 > 0.0f) {
                fArr[6] = fBg5;
                fArr[7] = fBg5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            iDDQ = android.graphics.Color.parseColor(str);
        } else {
            iDDQ = this.PX.DDQ();
        }
        drawable.setColor(iDDQ);
        if (this.PX.xxp() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.xxp()), this.PX.vb());
            return drawable;
        }
        if (this.PX.VzQ() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.PX.VzQ(), this.PX.vb());
        drawable.setAlpha(50);
        if (!android.text.TextUtils.equals(this.Ta.eo().IL(), "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Fy((int) fBg, this.PX.VzQ());
    }

    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL bg(android.graphics.Bitmap bitmap) {
        return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bg(bitmap, null);
    }

    protected android.graphics.drawable.Drawable getMutilBackgroundDrawable() {
        try {
            return new android.graphics.drawable.LayerDrawable(bg(IL(this.PX.ZQc().replaceAll("/\\*.*\\*/", ""))));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private android.graphics.drawable.Drawable[] bg(java.util.List<java.lang.String> list) {
        android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            if (str.contains("linear-gradient")) {
                java.lang.String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(strArrSplit[i3].substring(0, 7));
                    i2 = i3;
                }
                android.graphics.drawable.GradientDrawable gradientDrawableBg = bg(bg(strArrSplit[0]), iArr);
                gradientDrawableBg.setShape(0);
                gradientDrawableBg.setCornerRadius(com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.Lq()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableBg;
            }
        }
        return drawableArr;
    }

    private java.util.List<java.lang.String> IL(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && (i = i - 1) == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    protected android.graphics.drawable.GradientDrawable getDrawable() {
        return new android.graphics.drawable.GradientDrawable();
    }

    protected android.graphics.drawable.GradientDrawable bg(android.graphics.drawable.GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new android.graphics.drawable.GradientDrawable();
        }
        if (iArr.length == 1) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new android.graphics.drawable.GradientDrawable(orientation, iArr);
    }

    protected android.graphics.drawable.GradientDrawable.Orientation bg(java.lang.String str) {
        try {
            int i = (int) java.lang.Float.parseFloat(str.substring(0, str.length() - 3));
            if (i <= 90) {
                return android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i <= 180) {
                return android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i <= 270) {
                return android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (java.lang.Exception unused) {
            return android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.VzQ.bg(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX bXVar = this.VzQ;
        android.view.View view = this.Lq;
        if (view == null) {
            view = this;
        }
        bXVar.bg(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        iR();
        bg();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        IL();
        super.onDetachedFromWindow();
    }

    public void iR() {
        if (Kg()) {
            return;
        }
        android.view.View view = this.Lq;
        if (view == null) {
            view = this;
        }
        this.xxp = new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.IL(view, this.Ta.eo().zx().eK());
        post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.this.xxp != null) {
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.this.xxp.bg();
                }
            }
        });
    }

    public void IL() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.bg.IL il = this.xxp;
        if (il != null) {
            il.IL();
        }
    }

    protected boolean Kg() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg = this.Ta;
        return kg == null || kg.eo() == null || this.Ta.eo().zx() == null || this.Ta.eo().zx().eK() == null;
    }

    public int getDynamicWidth() {
        return this.iR;
    }

    public int getDynamicHeight() {
        return this.Kg;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVarEo;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg = this.Ta;
        if (kg == null || (zxVarEo = kg.eo()) == null) {
            return null;
        }
        return zxVarEo.zx();
    }

    private void bg() {
        if (isShown()) {
            int iBg = com.bytedance.sdk.component.adexpress.dynamic.IL.bg.bg(this.PX);
            if (iBg == 2) {
                if (this.LZ == null) {
                    this.LZ = new com.bytedance.sdk.component.utils.LZ(getContext().getApplicationContext(), 1);
                }
                new java.lang.Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.4
                };
                com.bytedance.sdk.component.adexpress.IL.Ta renderRequest = this.yDt.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.Lq();
                    renderRequest.LZ();
                    renderRequest.tuV();
                    return;
                }
                return;
            }
            if (iBg == 3) {
                if (this.LZ == null) {
                    this.LZ = new com.bytedance.sdk.component.utils.LZ(getContext().getApplicationContext(), 2);
                }
                new java.lang.Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.5
                };
                com.bytedance.sdk.component.adexpress.IL.Ta renderRequest2 = this.yDt.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.xxp();
                    renderRequest2.tC();
                    renderRequest2.VzQ();
                    renderRequest2.Fy();
                }
            }
        }
    }
}
