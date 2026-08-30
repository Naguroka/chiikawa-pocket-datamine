package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TTDislikeDialogAbstract extends android.app.Dialog implements com.bytedance.sdk.openadsdk.bX.eo.IL {
    protected java.util.List<com.bytedance.sdk.openadsdk.FilterWord> IL;
    protected final com.bytedance.sdk.openadsdk.bX.eo bX;
    protected java.lang.String bg;
    private android.view.View eqN;
    private java.lang.String zx;

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract android.view.View getLayoutView();

    public TTDislikeDialogAbstract(android.content.Context context) {
        super(context);
        com.bytedance.sdk.openadsdk.bX.eo eoVar = new com.bytedance.sdk.openadsdk.bX.eo();
        this.bX = eoVar;
        eoVar.bg(this);
    }

    public TTDislikeDialogAbstract(android.content.Context context, int i, java.lang.String str) {
        super(context, i);
        this.zx = str;
        com.bytedance.sdk.openadsdk.bX.eo eoVar = new com.bytedance.sdk.openadsdk.bX.eo();
        this.bX = eoVar;
        eoVar.bg(this);
    }

    public com.bytedance.sdk.openadsdk.bX.eo getDislikeManager() {
        return this.bX;
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View layoutView = getLayoutView();
        this.eqN = layoutView;
        if (layoutView == null) {
            com.bytedance.sdk.component.utils.PX.IL("getLayoutView,layout  may be abnormal, please check");
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.view.View view = this.eqN;
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void setMaterialMeta(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        this.bg = str;
        this.IL = list;
        this.bX.bg(str);
        this.bX.bg(this.IL);
    }

    public void onSuggestionSubmit(java.lang.String str) {
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.bX;
        if (eoVar != null) {
            eoVar.bX(str);
        }
    }

    public void destroy() {
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.bX;
        if (eoVar != null) {
            eoVar.bg();
        }
    }
}
