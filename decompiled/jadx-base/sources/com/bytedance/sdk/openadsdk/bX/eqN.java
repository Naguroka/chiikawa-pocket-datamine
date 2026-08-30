package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract {
    private com.bytedance.sdk.openadsdk.bX.eqN.bg eqN;
    private java.lang.String zx;

    public interface bg {
        void IL();

        void bg();

        void bg(int i, com.bytedance.sdk.openadsdk.FilterWord filterWord);
    }

    public eqN(android.content.Context context, java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2) {
        super(context, com.bytedance.sdk.component.utils.Fy.ldr(context, "tt_dislikeDialog"), str2);
        this.bg = str;
        this.IL = list;
    }

    public void bg(com.bytedance.sdk.openadsdk.bX.eqN.bg bgVar) {
        this.eqN = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            bg();
            IL();
            setMaterialMeta(this.bg, this.IL);
        } catch (java.lang.Throwable unused) {
            dismiss();
        }
    }

    public void bg(java.lang.String str) {
        this.zx = str;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public android.view.View getLayoutView() {
        return new com.bytedance.sdk.openadsdk.bX.WR(getContext(), this.bX, this.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        return new android.view.ViewGroup.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.IL
    public void bg(int i) {
        com.bytedance.sdk.openadsdk.FilterWord filterWordIL;
        if (com.bytedance.sdk.openadsdk.bX.eo.bX == i) {
            dismiss();
            return;
        }
        if (com.bytedance.sdk.openadsdk.bX.eo.zx == i) {
            com.bytedance.sdk.openadsdk.bX.eqN.bg bgVar = this.eqN;
            if (bgVar != null) {
                bgVar.bg();
                return;
            }
            return;
        }
        if (com.bytedance.sdk.openadsdk.bX.eo.IL != i || (filterWordIL = this.bX.IL()) == null || com.bytedance.sdk.openadsdk.bX.eo.bg.equals(filterWordIL)) {
            return;
        }
        com.bytedance.sdk.openadsdk.bX.eqN.bg bgVar2 = this.eqN;
        if (bgVar2 != null) {
            try {
                bgVar2.bg(0, filterWordIL);
            } catch (java.lang.Throwable unused) {
            }
        }
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (android.view.WindowManager.BadTokenException unused) {
        }
    }

    private void bg() {
        android.view.Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }

    private void IL() {
        setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.bX.eqN.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface dialogInterface) {
                if (com.bytedance.sdk.openadsdk.bX.eqN.this.eqN != null) {
                    com.bytedance.sdk.openadsdk.bX.eqN.bg unused = com.bytedance.sdk.openadsdk.bX.eqN.this.eqN;
                }
            }
        });
        setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.bX.eqN.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                if (com.bytedance.sdk.openadsdk.bX.eqN.this.eqN != null) {
                    com.bytedance.sdk.openadsdk.bX.eqN.this.eqN.IL();
                }
            }
        });
    }
}
