package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4 extends android.app.Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.w4 f1417a;
    private android.widget.FrameLayout b;
    private android.widget.ListView c;

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.b = (android.widget.FrameLayout) findViewById(android.R.id.content);
        this.c = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.applovin.impl.w4 w4Var = this.f1417a;
        if (w4Var == null) {
            finish();
            return;
        }
        this.c.setAdapter((android.widget.ListAdapter) w4Var);
        com.applovin.impl.w4 w4Var2 = this.f1417a;
        if (w4Var2 != null && !w4Var2.e().v().g()) {
            a(com.applovin.sdk.R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        com.applovin.impl.w4 w4Var3 = this.f1417a;
        if (w4Var3 == null || !w4Var3.f()) {
            return;
        }
        a(com.applovin.sdk.R.string.applovin_creative_debugger_no_ads_text);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.applovin.impl.w4 w4Var = this.f1417a;
        if (w4Var != null) {
            w4Var.a((com.applovin.impl.dc.a) null);
            this.f1417a.g();
        }
    }

    class a implements com.applovin.impl.dc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.q f1418a;

        a(com.applovin.impl.q qVar) {
            this.f1418a = qVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            if (kbVar.b() != com.applovin.impl.w4.a.RECENT_ADS.ordinal()) {
                return;
            }
            com.applovin.impl.r.a(com.applovin.impl.v4.this, com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity.class, this.f1418a, new com.applovin.impl.v4.a.C0057a(kbVar));
        }

        /* JADX INFO: renamed from: com.applovin.impl.v4$a$a, reason: collision with other inner class name */
        class C0057a implements com.applovin.impl.r.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.applovin.impl.kb f1419a;

            C0057a(com.applovin.impl.kb kbVar) {
                this.f1419a = kbVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((com.applovin.impl.v6) com.applovin.impl.v4.this.f1417a.d().get(this.f1419a.a()), com.applovin.impl.v4.this.f1417a.e());
            }
        }
    }

    public void a(com.applovin.impl.w4 w4Var, com.applovin.impl.q qVar) {
        this.f1417a = w4Var;
        w4Var.a(new com.applovin.impl.v4.a(qVar));
    }

    private void a(int i) {
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}
