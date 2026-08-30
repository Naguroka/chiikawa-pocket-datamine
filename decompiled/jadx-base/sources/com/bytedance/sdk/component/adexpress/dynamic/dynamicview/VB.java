package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class VB extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    private java.lang.String bg;

    public VB(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        if (!android.text.TextUtils.isEmpty(this.PX.Dt()) && kg.tuV()) {
            com.bytedance.sdk.component.adexpress.ldr.eo eoVar = new com.bytedance.sdk.component.adexpress.ldr.eo(context);
            eoVar.setAnimationsLoop(this.PX.Ny());
            eoVar.setImageLottieTosPath(this.PX.Dt());
            eoVar.setLottieAppNameMaxLength(this.PX.qp());
            eoVar.setLottieAdTitleMaxLength(this.PX.kU());
            eoVar.setLottieAdDescMaxLength(this.PX.bOf());
            eoVar.setData(kg.Fy());
            this.Lq = eoVar;
        } else if (this.PX.Lq() > 0.0f) {
            this.Lq = new com.bytedance.sdk.component.adexpress.ldr.Ja(context);
            ((com.bytedance.sdk.component.adexpress.ldr.Ja) this.Lq).setXRound((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, this.PX.Lq()));
            ((com.bytedance.sdk.component.adexpress.ldr.Ja) this.Lq).setYRound((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, this.PX.Lq()));
        } else if (!Kg() && "arrowButton".equals(kg.eo().IL())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.IL il = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.IL(context);
            il.setBrickNativeValue(this.PX);
            this.Lq = il;
        } else if (com.bytedance.sdk.component.adexpress.eqN.eo.IL(this.PX.VB())) {
            this.Lq = new com.bytedance.sdk.component.adexpress.ldr.Ta(context);
        } else {
            this.Lq = new android.widget.ImageView(context);
        }
        this.bg = getImageKey();
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(kg.eo().IL())) {
            if (this.PX.IL() > 0 || this.PX.bg() > 0) {
                this.iR = java.lang.Math.min(this.iR, this.Kg);
                this.Kg = java.lang.Math.min(this.iR, this.Kg);
                this.WR = (int) (this.WR + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, this.PX.IL() + (this.PX.bg() / 2) + 0.5f));
            } else {
                this.iR = java.lang.Math.max(this.iR, this.Kg);
                this.Kg = java.lang.Math.max(this.iR, this.Kg);
            }
            this.PX.bg(this.iR / 2);
        }
        addView(this.Lq, new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) this.Lq).getDrawable();
        if (android.os.Build.VERSION.SDK_INT < 28 || !(drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
            return;
        }
        ((android.graphics.drawable.AnimatedImageDrawable) drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) this.Lq).getDrawable();
        if (android.os.Build.VERSION.SDK_INT < 28 || !(drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
            return;
        }
        ((android.graphics.drawable.AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        int iVb;
        super.WR();
        if (!android.text.TextUtils.isEmpty(this.PX.Dt())) {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iLq = 0;
        if ("arrowButton".equals(this.Ta.eo().IL())) {
            ((android.widget.ImageView) this.Lq).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(this.VB, "tt_white_righterbackicon_titlebar"));
            if (((android.widget.ImageView) this.Lq).getDrawable() != null) {
                ((android.widget.ImageView) this.Lq).getDrawable().setAutoMirrored(true);
            }
            this.Lq.setPadding(0, 0, 0, 0);
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.Lq.setBackgroundColor(this.PX.DDQ());
        java.lang.String strBX = this.Ta.eo().bX();
        if ("user".equals(strBX)) {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            ((android.widget.ImageView) this.Lq).setColorFilter(this.PX.iR());
            ((android.widget.ImageView) this.Lq).setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_user"));
            ((android.widget.ImageView) this.Lq).setPadding(this.iR / 10, this.Kg / 5, this.iR / 10, 0);
        } else if (strBX != null && strBX.startsWith("@")) {
            try {
                ((android.widget.ImageView) this.Lq).setImageResource(java.lang.Integer.parseInt(strBX.substring(1)));
            } catch (java.lang.Exception unused) {
            }
        }
        com.bytedance.sdk.component.zx.Lq lqZx = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().zx();
        java.lang.String strVB = this.PX.VB();
        if (!android.text.TextUtils.isEmpty(strVB) && !strVB.startsWith("http:") && !strVB.startsWith("https:")) {
            strVB = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.IL(strVB, (this.yDt == null || this.yDt.getRenderRequest() == null) ? null : this.yDt.getRenderRequest().kMt());
        }
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
        if (bXVarBX != null) {
            iLq = bXVarBX.Lq();
            iVb = bXVarBX.vb();
        } else {
            iVb = 0;
        }
        com.bytedance.sdk.component.zx.eo eoVarZx = lqZx.bg(strVB).bg(this.bg).bg(this.iR).IL(this.Kg).eqN(iLq).zx(iVb);
        java.lang.String strYDt = this.yDt.getRenderRequest().yDt();
        if (!android.text.TextUtils.isEmpty(strYDt)) {
            eoVarZx.IL(strYDt);
        }
        if (bg()) {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            eoVarZx.bg(android.graphics.Bitmap.Config.ARGB_4444).bX(2).bg(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.bg(this.VB)).bg(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.IL(this.Lq, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                eoVarZx.bg((android.widget.ImageView) this.Lq);
            }
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        }
        if ((this.Lq instanceof android.widget.ImageView) && "cover".equals(getImageObjectFit())) {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.eqN.IL()) {
            bg(eoVarZx);
        }
        return true;
    }

    private static class bg implements com.bytedance.sdk.component.zx.Kg {
        private final java.lang.ref.WeakReference<android.content.Context> bg;

        public bg(android.content.Context context) {
            this.bg = new java.lang.ref.WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.zx.Kg
        public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap) {
            android.content.Context context = this.bg.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.eqN.bg.bg(context, bitmap, 25);
            }
            return null;
        }
    }

    private static class IL implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
        private android.content.res.Resources IL;
        private java.lang.ref.WeakReference<android.view.View> bg;

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public IL(android.view.View view, android.content.res.Resources resources) {
            this.bg = new java.lang.ref.WeakReference<>(view);
            this.IL = resources;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
            android.graphics.Bitmap bitmapIL;
            android.view.View view = this.bg.get();
            if (view == null || (bitmapIL = vb.IL()) == null || vb.bX() == null) {
                return;
            }
            view.setBackground(new android.graphics.drawable.BitmapDrawable(this.IL, bitmapIL));
        }
    }

    private boolean bg() {
        java.lang.String strPX = this.PX.PX();
        if (this.PX.Fy()) {
            return true;
        }
        if (android.text.TextUtils.isEmpty(strPX)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(strPX);
            return java.lang.Math.abs((((float) this.iR) / (((float) this.Kg) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    private java.lang.String getImageKey() {
        java.util.Map<java.lang.String, java.lang.String> mapVB = this.yDt.getRenderRequest().VB();
        if (mapVB == null || mapVB.size() <= 0) {
            return null;
        }
        return mapVB.get(this.PX.VB());
    }

    private void bg(com.bytedance.sdk.component.zx.eo eoVar) {
        eoVar.bX(3).bg(new com.bytedance.sdk.component.zx.xxp() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.1
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i, java.lang.String str, java.lang.Throwable th) {
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB vb) {
                java.lang.Object objIL = vb.IL();
                if ((objIL instanceof byte[]) && (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.this.Lq instanceof android.widget.ImageView)) {
                    com.bytedance.sdk.component.adexpress.eqN.ldr.IL((android.widget.ImageView) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.this.Lq, (byte[]) objIL, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.this.iR, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.this.Kg);
                }
            }
        });
    }
}
