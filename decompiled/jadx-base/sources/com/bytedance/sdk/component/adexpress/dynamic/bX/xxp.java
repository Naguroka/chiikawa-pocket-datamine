package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class xxp implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR {
    private android.content.Context IL;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx bX;
    private com.bytedance.sdk.component.adexpress.ldr.tC bg;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.iR eqN;

    public xxp(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.IL = context;
        this.bX = zxVar;
        this.eqN = iRVar;
        eqN();
    }

    private void eqN() {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.tC(this.IL);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, 120.0f));
        layoutParams.gravity = 17;
        this.bg.setLayoutParams(layoutParams);
        this.bg.setClipChildren(false);
        this.bg.setGuideText(this.eqN.GvG());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar = this.bX;
        if (zxVar != null) {
            this.bg.setOnClickListener((android.view.View.OnClickListener) zxVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void bg() {
        com.bytedance.sdk.component.adexpress.ldr.tC tCVar = this.bg;
        if (tCVar != null) {
            tCVar.bg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void IL() {
        com.bytedance.sdk.component.adexpress.ldr.tC tCVar = this.bg;
        if (tCVar != null) {
            tCVar.IL();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public android.view.ViewGroup bX() {
        return this.bg;
    }
}
