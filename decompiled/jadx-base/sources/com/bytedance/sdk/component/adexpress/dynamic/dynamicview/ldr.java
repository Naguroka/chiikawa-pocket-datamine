package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx {
    private static java.lang.String Fy = "";
    private java.lang.Runnable IL;
    private volatile boolean LZ;
    private java.lang.Runnable bg;
    private android.widget.ImageView tC;
    protected com.bytedance.sdk.component.adexpress.dynamic.bX.WR tuV;

    public ldr(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.LZ = true;
        setTag(java.lang.Integer.valueOf(getClickArea()));
        java.lang.String strIL = kg.eo().IL();
        if ("logo-union".equals(strIL)) {
            dynamicRootView.setLogoUnionHeight(this.Kg - ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, this.PX.IL() + this.PX.bg())));
        } else if ("scoreCountWithIcon".equals(strIL)) {
            dynamicRootView.setScoreCountWithIcon(this.Kg - ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, this.PX.IL() + this.PX.bg())));
        }
    }

    private java.lang.String IL(java.lang.String str) {
        try {
            java.util.Map<java.lang.String, java.lang.String> mapVB = this.yDt.getRenderRequest().VB();
            if (mapVB != null && mapVB.size() > 0) {
                return mapVB.get(str);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
    }

    public boolean WR() {
        int iLq;
        int iVb;
        android.graphics.drawable.Drawable backgroundDrawable;
        org.json.JSONObject jSONObjectOptJSONObject;
        final android.view.View view = this.Lq == null ? this : this.Lq;
        setContentDescription(this.Ta.bg(this.PX.Uw()));
        java.lang.String strRFq = this.PX.RFq();
        java.lang.String strKMt = null;
        java.lang.String strBg = (android.text.TextUtils.isEmpty(strRFq) || this.yDt == null || this.yDt.getRenderRequest() == null || this.yDt.getRenderRequest().bX() == null || (jSONObjectOptJSONObject = this.yDt.getRenderRequest().bX().optJSONObject("creative")) == null) ? null : bg(jSONObjectOptJSONObject.opt(strRFq));
        if (android.text.TextUtils.isEmpty(strBg)) {
            strBg = this.PX.LZ();
        }
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
        if (bXVarBX != null) {
            iLq = bXVarBX.Lq();
            iVb = bXVarBX.vb();
        } else {
            iLq = 0;
            iVb = 0;
        }
        if (this.PX.Fy()) {
            int iTuV = this.PX.tuV();
            java.lang.String str = this.PX.IL;
            com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().zx().bg(str).bg(this.iR).IL(this.Kg).eqN(iLq).zx(iVb).bg(IL(str)).bX(2).bg(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.bX(this.VB, iTuV)).bg(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.IL(view, this));
        } else if (!android.text.TextUtils.isEmpty(strBg)) {
            if (!strBg.startsWith("http:") && !strBg.startsWith("https:")) {
                if (this.yDt != null && this.yDt.getRenderRequest() != null) {
                    strKMt = this.yDt.getRenderRequest().kMt();
                }
                strBg = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.IL(strBg, strKMt);
            }
            com.bytedance.sdk.component.zx.eo eoVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().zx().bg(strBg).bg(this.iR).IL(this.Kg).eqN(iLq).zx(iVb).bg(IL(strBg)).bX(2);
            bg(eoVarBX);
            if (!com.bytedance.sdk.component.adexpress.eqN.IL()) {
                if ((view instanceof android.widget.FrameLayout) && android.text.TextUtils.equals(this.Ta.eo().IL(), "vessel")) {
                    if (com.bytedance.sdk.component.adexpress.eqN.eo.IL(strBg)) {
                        this.tC = new com.bytedance.sdk.component.adexpress.ldr.Ta(this.VB);
                    } else {
                        this.tC = new android.widget.ImageView(this.VB);
                    }
                    ((android.widget.FrameLayout) view).addView(this.tC, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    eoVarBX.bX(3).bg(new com.bytedance.sdk.component.zx.xxp() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.1
                        @Override // com.bytedance.sdk.component.zx.xxp
                        public void bg(int i, java.lang.String str2, java.lang.Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.zx.xxp
                        public void bg(com.bytedance.sdk.component.zx.VB vb) {
                            java.lang.Object objIL = vb.IL();
                            if (objIL instanceof byte[]) {
                                com.bytedance.sdk.component.adexpress.eqN.ldr.IL(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.tC, (byte[]) objIL, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.iR, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.Kg);
                            }
                        }
                    });
                } else {
                    bg(eoVarBX, view);
                }
            } else {
                eoVarBX.bg(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.bg(view, this.yDt, this.Ta));
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.PX.Uq() > 0.0d) {
            postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.PX.ayS() > 0) {
                            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                            android.graphics.drawable.Drawable drawableBX = ldrVar.bX(ldrVar.yDt.getBgMaterialCenterCalcColor().get(java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.PX.ayS())));
                            if (drawableBX == null) {
                                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                                drawableBX = ldrVar2.bg(true, ldrVar2.yDt.getBgMaterialCenterCalcColor().get(java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.PX.ayS())));
                            }
                            if (drawableBX != null) {
                                view.setBackground(drawableBX);
                                return;
                            }
                            android.view.View view2 = view;
                            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                            view2.setBackground(ldrVar3.bg(true, ldrVar3.yDt.getBgColor()));
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }, (long) (this.PX.Uq() * 1000.0d));
        }
        if (this.Lq != null) {
            this.Lq.setPadding((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.bX()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.IL()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.eqN()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.bg()));
        }
        if (this.vb || this.PX.yDt() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private static class bX implements com.bytedance.sdk.component.zx.Kg {
        private final int IL;
        private final java.lang.ref.WeakReference<android.content.Context> bg;

        public bX(android.content.Context context, int i) {
            this.bg = new java.lang.ref.WeakReference<>(context);
            this.IL = i;
        }

        @Override // com.bytedance.sdk.component.zx.Kg
        public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap) {
            android.content.Context context = this.bg.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.eqN.bg.bg(context, bitmap, this.IL);
            }
            return null;
        }
    }

    private static class IL implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
        private final java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx> IL;
        private final java.lang.ref.WeakReference<android.view.View> bg;

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public IL(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar) {
            this.bg = new java.lang.ref.WeakReference<>(view);
            this.IL = new java.lang.ref.WeakReference<>(zxVar);
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
            android.graphics.Bitmap bitmapIL;
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar;
            android.view.View view = this.bg.get();
            if (view == null || (bitmapIL = vb.IL()) == null || vb.bX() == null || (zxVar = this.IL.get()) == null) {
                return;
            }
            view.setBackground(zxVar.bg(bitmapIL));
        }
    }

    private static class bg implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
        private final java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView> IL;
        private final com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg bX;
        private final java.lang.ref.WeakReference<android.view.View> bg;

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public bg(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
            this.bg = new java.lang.ref.WeakReference<>(view);
            this.IL = new java.lang.ref.WeakReference<>(dynamicRootView);
            this.bX = kg;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
            android.view.View view = this.bg.get();
            if (!com.bytedance.sdk.component.adexpress.eqN.IL()) {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView = this.IL.get();
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().eqN()) && !"splash_ad".equals(dynamicRootView.getRenderRequest().eqN())) {
                    view.setBackground(new android.graphics.drawable.BitmapDrawable(vb.IL()));
                    return;
                } else {
                    view.setBackground(new android.graphics.drawable.BitmapDrawable(vb.IL()));
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(new android.graphics.drawable.BitmapDrawable(vb.IL()));
            com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg = this.bX;
            if (kg == null || kg.eo() == null || 6 != this.bX.eo().bg() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    private java.lang.String bg(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof org.json.JSONArray) {
            return bg(((org.json.JSONArray) obj).opt(0));
        }
        if (obj instanceof org.json.JSONObject) {
            return bg((java.lang.Object) ((org.json.JSONObject) obj).optString("url"));
        }
        return null;
    }

    private void bg(com.bytedance.sdk.component.zx.eo eoVar, final android.view.View view) {
        eoVar.bg(new com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.3
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i, java.lang.String str, java.lang.Throwable th) {
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
                if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt == null) {
                    return;
                }
                if (!"open_ad".equals(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt.getRenderRequest().eqN()) && !"splash_ad".equals(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt.getRenderRequest().eqN())) {
                    view.setBackground(new android.graphics.drawable.BitmapDrawable(vb.IL()));
                } else {
                    if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                        view.setBackground(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bg(vb.IL(), ((com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tuV) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt.getChildAt(0)).bg));
                        return;
                    }
                    view.setBackground(new android.graphics.drawable.BitmapDrawable(vb.IL()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.drawable.Drawable bX(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    string = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(((java.lang.String) arrayList.get(i2)).substring(0, 7));
            }
            android.graphics.drawable.GradientDrawable gradientDrawableBg = bg(bg(string), iArr);
            gradientDrawableBg.setShape(0);
            gradientDrawableBg.setCornerRadius(com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.Lq()));
            return gradientDrawableBg;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static void bg(com.bytedance.sdk.component.zx.eo eoVar) {
        if ("SMARTISAN".equals(android.os.Build.BRAND) && "SM901".equals(getBuildModel())) {
            eoVar.bg(android.graphics.Bitmap.Config.ARGB_8888);
        }
    }

    private static java.lang.String getBuildModel() {
        try {
            Fy = com.bytedance.sdk.component.utils.tC.bg();
        } catch (java.lang.Throwable unused) {
            Fy = android.os.Build.MODEL;
        }
        if (android.text.TextUtils.isEmpty(Fy)) {
            Fy = android.os.Build.MODEL;
        }
        return Fy;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        android.view.View view = this.Lq == null ? this : this.Lq;
        double dFy = this.Ta.eo().zx().Fy();
        if (dFy < 90.0d && dFy > 0.0d) {
            com.bytedance.sdk.component.utils.iR.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.setVisibility(8);
                }
            }, (long) (dFy * 1000.0d));
        }
        bg(this.Ta.eo().zx().tuV(), view);
        if (!android.text.TextUtils.isEmpty(this.PX.Dxa())) {
            bg();
        }
        super.onAttachedToWindow();
    }

    private void bg(double d, final android.view.View view) {
        if (d > 0.0d) {
            com.bytedance.sdk.component.utils.iR.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.5
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.Ta.eo().zx().eK() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.bg);
            removeCallbacks(this.IL);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(android.view.ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.bX.WR) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void bg() {
        if (this.LZ) {
            int iTxA = this.PX.txA();
            int iSVc = this.PX.sVc();
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.6
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt != null && com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt.getRenderRequest() != null) {
                        com.bytedance.sdk.component.adexpress.IL.Ta renderRequest = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.yDt.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.eqN.eo eoVar = new com.bytedance.sdk.component.adexpress.dynamic.eqN.eo();
                        eoVar.bg(renderRequest.Lq());
                        eoVar.IL(renderRequest.vb());
                        eoVar.bX(renderRequest.xxp());
                        eoVar.bg(renderRequest.VzQ());
                        eoVar.IL(renderRequest.tuV());
                        eoVar.bX(renderRequest.Fy());
                        eoVar.eqN(renderRequest.LZ());
                        eoVar.zx(renderRequest.tC());
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                        android.content.Context context = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.VB;
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                        ldrVar.tuV = new com.bytedance.sdk.component.adexpress.dynamic.bX.WR(context, ldrVar2, ldrVar2.PX, eoVar, renderRequest);
                    } else {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                        android.content.Context context2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.VB;
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar4 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                        ldrVar3.tuV = new com.bytedance.sdk.component.adexpress.dynamic.bX.WR(context2, ldrVar4, ldrVar4.PX);
                    }
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar5 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                    ldrVar5.IL(ldrVar5.tuV);
                    if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.getParent() instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.getParent()).setClipChildren(false);
                    }
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.setClipChildren(false);
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.tuV.setTag(2);
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar6 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                    ldrVar6.bg((android.view.ViewGroup) ldrVar6);
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar7 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                    ldrVar7.addView(ldrVar7.tuV, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.tuV.bX();
                }
            };
            this.bg = runnable;
            postDelayed(runnable, ((long) iTxA) * 1000);
            if (this.PX.ApA() || iSVc >= Integer.MAX_VALUE || iTxA >= iSVc) {
                return;
            }
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.7
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.tuV != null) {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.LZ = false;
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.tuV.eqN();
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this.tuV.setVisibility(4);
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr ldrVar = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr.this;
                        ldrVar.removeView(ldrVar.tuV);
                    }
                }
            };
            this.IL = runnable2;
            postDelayed(runnable2, ((long) iSVc) * 1000);
        }
    }
}
