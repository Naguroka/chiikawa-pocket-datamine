package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg extends com.bytedance.sdk.openadsdk.core.zx.bX {
    protected android.content.Context IL;
    protected int Kg;
    protected java.lang.String PX;
    protected boolean VB;
    protected int WR;
    protected com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private com.bytedance.sdk.openadsdk.eqN.iR bg;
    protected boolean eo;
    protected com.bytedance.sdk.openadsdk.bX.bX eqN;
    protected int iR;
    protected java.lang.String ldr;
    protected com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract zx;

    protected abstract void bg(android.view.View view, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt);

    @Override // android.view.View
    public java.lang.Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public bg(android.content.Context context) {
        super(context);
        this.ldr = "embeded_ad";
        this.eo = true;
        this.VB = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public bg(android.content.Context context, java.lang.String str) {
        super(context);
        this.ldr = "embeded_ad";
        this.eo = true;
        this.VB = true;
        this.PX = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // android.view.View
    public void setTag(java.lang.Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(com.bytedance.sdk.openadsdk.core.Ja ja) {
        if (ja instanceof com.bytedance.sdk.openadsdk.bX.bX) {
            this.eqN = (com.bytedance.sdk.openadsdk.bX.bX) ja;
        }
    }

    public void setDislikeOuter(com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (tTDislikeDialogAbstract != null && (tuv = this.bX) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(tuv.Ny(), this.bX.kU());
        }
        this.zx = tTDislikeDialogAbstract;
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract tTDislikeDialogAbstract = this.zx;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.bX.bX bXVar = this.eqN;
        if (bXVar != null) {
            bXVar.bg();
        } else {
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bg(this.bX, (java.lang.String) null);
        }
    }

    protected java.lang.String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv == null) {
            return "";
        }
        if (tuv.RiO() == null || android.text.TextUtils.isEmpty(this.bX.RiO().IL())) {
            return !android.text.TextUtils.isEmpty(this.bX.bN()) ? this.bX.bN() : "";
        }
        return this.bX.RiO().IL();
    }

    protected java.lang.String getTitle() {
        if (this.bX.RiO() != null && !android.text.TextUtils.isEmpty(this.bX.RiO().IL())) {
            return this.bX.RiO().IL();
        }
        if (android.text.TextUtils.isEmpty(this.bX.bN())) {
            return !android.text.TextUtils.isEmpty(this.bX.wS()) ? this.bX.wS() : "";
        }
        return this.bX.bN();
    }

    protected java.lang.String getDescription() {
        if (android.text.TextUtils.isEmpty(this.bX.wS())) {
            return !android.text.TextUtils.isEmpty(this.bX.cZH()) ? this.bX.cZH() : "";
        }
        return this.bX.wS();
    }

    public float getRealWidth() {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, this.iR);
    }

    public float getRealHeight() {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, this.Kg);
    }

    protected void bg(android.view.View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.IL.IL il;
        if (view == null) {
            return;
        }
        if (z) {
            android.content.Context context = this.IL;
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
            java.lang.String str = this.ldr;
            il = new com.bytedance.sdk.openadsdk.core.IL.bg(context, tuv, str, com.bytedance.sdk.openadsdk.utils.ayS.bg(str));
        } else {
            android.content.Context context2 = this.IL;
            com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.bX;
            java.lang.String str2 = this.ldr;
            il = new com.bytedance.sdk.openadsdk.core.IL.IL(context2, tuv2, str2, com.bytedance.sdk.openadsdk.utils.ayS.bg(str2));
        }
        view.setOnTouchListener(il);
        view.setOnClickListener(il);
        il.bg(new com.bytedance.sdk.openadsdk.core.Kg.IL() { // from class: com.bytedance.sdk.openadsdk.core.Kg.bg.1
            @Override // com.bytedance.sdk.openadsdk.core.Kg.IL
            public void bg(android.view.View view2, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
                com.bytedance.sdk.openadsdk.core.Kg.bg.this.bg(view2, i, ydt);
            }
        });
    }

    protected com.bytedance.sdk.openadsdk.core.Ta.IL.ldr getVideoView() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv != null && this.IL != null) {
            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
                try {
                    ldrVar = new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr(this.IL, this.bX, this.ldr, true, false, this.bg);
                    ldrVar.setVideoCacheUrl(this.PX);
                    ldrVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL() { // from class: com.bytedance.sdk.openadsdk.core.Kg.bg.2
                        @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL
                        public void bg(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    ldrVar.setIsAutoPlay(this.eo);
                    ldrVar.setIsQuiet(this.VB);
                } catch (java.lang.Throwable unused) {
                    ldrVar = null;
                }
            } else {
                ldrVar = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX) && ldrVar != null && ldrVar.bg(0L, true, false)) {
                return ldrVar;
            }
        }
        return null;
    }

    protected void bg(int i) {
        this.VB = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(java.lang.String.valueOf(this.WR));
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(i);
        if (3 == iIL) {
            this.eo = false;
            return;
        }
        int iBX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (1 != iIL || !com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX)) {
            if (2 == iIL) {
                if (com.bytedance.sdk.openadsdk.utils.ayS.zx(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX)) {
                    this.eo = true;
                    return;
                }
                return;
            }
            if (5 != iIL) {
                return;
            }
            if (!com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) && !com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX)) {
                return;
            }
        }
        this.eo = true;
    }

    protected void bg(android.view.View view) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv == null || tuv.Dxa() == null || view == null) {
            return;
        }
        bg(view, this.bX.kMt() == 1 && this.eo);
    }
}
