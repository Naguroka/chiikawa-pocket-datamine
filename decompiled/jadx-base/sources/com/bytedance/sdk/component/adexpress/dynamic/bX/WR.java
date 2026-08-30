package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends android.widget.FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.bX.Kg {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx IL;
    private android.view.View.OnTouchListener Kg;
    private com.bytedance.sdk.component.adexpress.IL.Ta PX;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.eo VB;
    private int WR;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.iR bX;
    private android.content.Context bg;
    private boolean eo;
    private android.view.View eqN;
    private com.bytedance.sdk.component.adexpress.ldr.tuV iR;
    private java.lang.String ldr;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.iR zx;

    public WR(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        super(context);
        this.bg = context;
        this.IL = zxVar;
        this.bX = iRVar;
        iR();
    }

    public WR(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.eo eoVar, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        super(context);
        this.bg = context;
        this.IL = zxVar;
        this.bX = iRVar;
        this.VB = eoVar;
        this.PX = ta;
        iR();
    }

    private void iR() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.ldr = this.bX.Dxa();
        this.WR = this.bX.Pae();
        this.eo = this.bX.GZ();
        com.bytedance.sdk.component.adexpress.dynamic.bX.iR iRVarBg = com.bytedance.sdk.component.adexpress.dynamic.bX.eo.bg(this.bg, this.IL, this.bX, this.VB, this.PX);
        this.zx = iRVarBg;
        if (iRVarBg != null) {
            this.eqN = iRVarBg.bX();
            if (this.bX.bN()) {
                setBackgroundColor(android.graphics.Color.parseColor("#50000000"));
            }
            if (android.text.TextUtils.equals(this.ldr, "6")) {
                if (this.bX.bCU() && !android.text.TextUtils.isEmpty(this.bX.Ld())) {
                    this.iR = new com.bytedance.sdk.component.adexpress.ldr.tuV(this.bg, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(this.bX.Ld()));
                } else {
                    this.iR = new com.bytedance.sdk.component.adexpress.ldr.tuV(this.bg, android.graphics.Color.parseColor("#99000000"));
                }
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.bg);
                frameLayout.addView(this.iR, new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.WR.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.dynamic.bX.WR.this.iR.IL();
                    }
                });
            }
            if (bg(this.ldr) && com.bytedance.sdk.component.adexpress.eqN.IL()) {
                int color = android.graphics.Color.parseColor("#99000000");
                if (this.bX.bCU() && !android.text.TextUtils.isEmpty(this.bX.Ld())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(this.bX.Ld());
                    } catch (java.lang.Exception unused) {
                    }
                }
                android.view.View view = new android.view.View(this.bg);
                view.setBackgroundColor(color);
                addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.zx.bX());
            bg(this.zx.bX());
            setVisibility(0);
        }
    }

    private boolean bg(java.lang.String str) {
        return android.text.TextUtils.equals(str, "24") || android.text.TextUtils.equals(str, "23") || android.text.TextUtils.equals(str, "25") || android.text.TextUtils.equals(str, "22") || android.text.TextUtils.equals(str, "1");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.Kg instanceof com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bX) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void bg(android.view.ViewGroup viewGroup) {
        if (this.eqN == null) {
            return;
        }
        java.lang.String str = this.ldr;
        str.hashCode();
        switch (str) {
            case "0":
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.zx(this, this.WR);
                setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.bX.bCU() || android.text.TextUtils.isEmpty(this.bX.Ld())) {
                    setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
                }
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.ldr(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.IL(this, this);
                break;
            case "5":
                if (this.bX.bCU() && !android.text.TextUtils.isEmpty(this.bX.Ld())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.bg(this.bX.Ld()));
                } else {
                    setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
                }
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bX(this);
                this.eqN.setTag(2);
                break;
            case "8":
            case "11":
                this.IL.setClipChildren(false);
                this.IL.setClipChildren(false);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.IL.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.ldr(this);
                break;
            case "9":
            case "17":
                this.eqN.setTag(2);
                break;
            case "10":
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.eqN(this, this.WR, this.eo);
                break;
            case "12":
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bX(this);
                this.eqN.setTag(2);
                break;
            case "13":
            case "24":
                if (this.ldr.equals("24") && com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    this.IL.setClipChildren(false);
                    this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.ldr(this);
                    break;
                } else {
                    this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.zx(this, this.WR);
                    break;
                }
                break;
            case "14":
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.IL(this, this);
                break;
            case "16":
                android.view.View view = this.eqN;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.ldr.Fy) && ((com.bytedance.sdk.component.adexpress.ldr.Fy) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.ldr.Fy) this.eqN).getShakeLayout().setTag(2);
                }
                this.eqN.setTag(2);
                break;
            case "18":
                android.view.View view2 = this.eqN;
                if (view2 != null && (view2 instanceof com.bytedance.sdk.component.adexpress.ldr.Uw) && ((com.bytedance.sdk.component.adexpress.ldr.Uw) view2).getWriggleLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.ldr.Uw) this.eqN).getWriggleLayout().setTag(2);
                }
                this.eqN.setTag(2);
                break;
            case "20":
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bg(this, this.WR, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.Kg(this, this.eo);
                    break;
                } else {
                    this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.iR(this, this.WR, viewGroup);
                    break;
                }
                break;
            case "23":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.ldr(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.Kg(this, this.eo);
                    break;
                }
                break;
            case "29":
                android.view.View view3 = this.eqN;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.ldr.ldr) && ((com.bytedance.sdk.component.adexpress.ldr.ldr) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.ldr.ldr) this.eqN).getShakeView().setTag(2);
                }
                this.Kg = new com.bytedance.sdk.component.adexpress.dynamic.bX.bg.zx(this, this.WR);
                break;
        }
        android.view.View.OnTouchListener onTouchListener = this.Kg;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (Kg()) {
            this.eqN.setTag(2);
            setOnClickListener((android.view.View.OnClickListener) this.IL.getDynamicClickListener());
        }
    }

    private boolean Kg() {
        return (this.bX.GZ() || android.text.TextUtils.equals("9", this.ldr) || android.text.TextUtils.equals("16", this.ldr) || android.text.TextUtils.equals("17", this.ldr) || android.text.TextUtils.equals("18", this.ldr) || android.text.TextUtils.equals("20", this.ldr) || android.text.TextUtils.equals("29", this.ldr) || android.text.TextUtils.equals("10", this.ldr)) ? false : true;
    }

    public void bX() {
        com.bytedance.sdk.component.adexpress.dynamic.bX.iR iRVar = this.zx;
        if (iRVar != null) {
            iRVar.bg();
        }
    }

    public void eqN() {
        com.bytedance.sdk.component.adexpress.dynamic.bX.iR iRVar = this.zx;
        if (iRVar != null) {
            iRVar.IL();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.sdk.component.adexpress.dynamic.bX.iR iRVar = this.zx;
            if (iRVar != null) {
                iRVar.IL();
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
        }
    }

    public void zx() {
        if (this.eqN != null && android.text.TextUtils.equals(this.ldr, "2")) {
            android.view.View view = this.eqN;
            if (view instanceof com.bytedance.sdk.component.adexpress.ldr.bX) {
                ((com.bytedance.sdk.component.adexpress.ldr.bX) view).bX();
            }
        }
    }

    public void ldr() {
        if (this.eqN != null && android.text.TextUtils.equals(this.ldr, "2")) {
            android.view.View view = this.eqN;
            if (view instanceof com.bytedance.sdk.component.adexpress.ldr.bX) {
                ((com.bytedance.sdk.component.adexpress.ldr.bX) view).eqN();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.Kg
    public void bg() {
        if (android.text.TextUtils.equals(this.ldr, "6")) {
            com.bytedance.sdk.component.adexpress.ldr.tuV tuv = this.iR;
            if (tuv != null) {
                tuv.bX();
                postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.WR.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.dynamic.bX.WR.this.WR();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (android.text.TextUtils.equals(this.ldr, "20")) {
            postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.WR.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.bX.WR.this.WR();
                }
            }, 400L);
        } else {
            WR();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.Kg
    public void IL() {
        if (Kg()) {
            setOnClickListener((android.view.View.OnClickListener) this.IL.getDynamicClickListener());
            performClick();
            if (this.bX.eDa()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WR() {
        if (this.Kg != null) {
            setOnClickListener((android.view.View.OnClickListener) this.IL.getDynamicClickListener());
            performClick();
            if (this.bX.eDa()) {
                return;
            }
            setVisibility(8);
        }
    }
}
