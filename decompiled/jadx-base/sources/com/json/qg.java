package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class qg extends android.widget.FrameLayout implements com.json.qh {
    private static final java.lang.String b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.vg f3201a;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3202a;
        final /* synthetic */ java.lang.String b;

        a(java.lang.String str, java.lang.String str2) {
            this.f3202a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qg qgVar = com.json.qg.this;
            qgVar.removeView(qgVar.f3201a.getPresentingView());
            com.json.qg.this.f3201a.a(this.f3202a, this.b);
            com.json.qg.this.f3201a = null;
        }
    }

    public qg(android.content.Context context) {
        super(context);
    }

    public qg(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public qg(com.json.vg vgVar, android.content.Context context) {
        super(context);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(vgVar.d().c(), vgVar.d().a()));
        this.f3201a = vgVar;
        addView(vgVar.getPresentingView());
    }

    private void b() throws java.lang.Exception {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = this.f3201a.c().a().getJSONObject(com.json.pg.p).getJSONObject(com.json.pg.s);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("adViewId", this.f3201a.b());
        this.f3201a.c().a(com.ironsource.y8.g.R, jSONObject);
    }

    public void a() throws java.lang.Exception {
        com.json.vg vgVar = this.f3201a;
        if (vgVar == null || vgVar.c() == null) {
            throw new java.lang.Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.json.qh
    public synchronized void a(java.lang.String str, java.lang.String str2) {
        com.json.vg vgVar = this.f3201a;
        if (vgVar != null && vgVar.c() != null && this.f3201a.getPresentingView() != null) {
            this.f3201a.c().e();
            com.json.cg.f2559a.d(new com.ironsource.qg.a(str, str2));
        }
    }

    @Override // com.json.qh
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.json.vg vgVar = this.f3201a;
        if (vgVar == null) {
            return;
        }
        vgVar.a(str, str2, str3);
    }

    @Override // com.json.qh
    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        this.f3201a.a(jSONObject, str, str2);
    }

    @Override // com.json.qh
    public void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        this.f3201a.b(jSONObject, str, str2);
    }

    @Override // com.json.qh
    public void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        this.f3201a.c(jSONObject, str, str2);
    }

    @Override // com.json.qh
    public android.webkit.WebView getPresentingView() {
        return this.f3201a.getPresentingView();
    }

    public com.json.og getSize() {
        com.json.vg vgVar = this.f3201a;
        return vgVar != null ? vgVar.d() : new com.json.og();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        com.json.sdk.utils.Logger.i(b, "onVisibilityChanged: " + i);
        com.json.vg vgVar = this.f3201a;
        if (vgVar == null) {
            return;
        }
        try {
            vgVar.c().a(com.json.pg.k, i, isShown());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        com.json.sdk.utils.Logger.i(b, "onWindowVisibilityChanged: " + i);
        com.json.vg vgVar = this.f3201a;
        if (vgVar == null) {
            return;
        }
        try {
            vgVar.c().a(com.json.pg.l, i, isShown());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}
