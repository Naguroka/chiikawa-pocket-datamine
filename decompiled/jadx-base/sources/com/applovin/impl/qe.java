package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qe extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.se f1179a;
    private android.database.DataSetObserver b;
    private android.widget.FrameLayout c;
    private android.widget.ListView d;
    private com.applovin.impl.o f;

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        com.applovin.impl.se seVar = this.f1179a;
        if (seVar != null) {
            return seVar.s();
        }
        return null;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.c = (android.widget.FrameLayout) findViewById(android.R.id.content);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.d = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f1179a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.applovin.impl.se seVar = this.f1179a;
        if (seVar == null || seVar.v()) {
            return;
        }
        c();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.applovin.impl.se seVar = this.f1179a;
        if (seVar != null) {
            seVar.unregisterDataSetObserver(this.b);
            this.f1179a.a((com.applovin.impl.dc.a) null);
        }
    }

    public void setListAdapter(com.applovin.impl.se seVar, com.applovin.impl.q qVar) {
        android.database.DataSetObserver dataSetObserver;
        com.applovin.impl.se seVar2 = this.f1179a;
        if (seVar2 != null && (dataSetObserver = this.b) != null) {
            seVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f1179a = seVar;
        this.b = new com.applovin.impl.qe.a();
        b((android.content.Context) this);
        this.f1179a.registerDataSetObserver(this.b);
        this.f1179a.a(new com.applovin.impl.qe.b(qVar));
    }

    class a extends android.database.DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            com.applovin.impl.qe.this.a();
            com.applovin.impl.qe qeVar = com.applovin.impl.qe.this;
            qeVar.b((android.content.Context) qeVar);
        }
    }

    class b implements com.applovin.impl.dc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.q f1181a;

        b(com.applovin.impl.q qVar) {
            this.f1181a = qVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            int iB = kbVar.b();
            if (iB == com.applovin.impl.se.e.APP_INFO.ordinal()) {
                com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.qe.this);
                return;
            }
            if (iB == com.applovin.impl.se.e.MAX.ordinal()) {
                if (com.applovin.impl.qe.this.f1179a.a(ccVar)) {
                    com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerUnifiedFlowActivity.class, this.f1181a, new com.applovin.impl.qe.b.a());
                    return;
                } else {
                    com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.qe.this);
                    return;
                }
            }
            if (iB == com.applovin.impl.se.e.PRIVACY.ordinal()) {
                if (kbVar.a() == com.applovin.impl.se.d.CMP.ordinal()) {
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(com.applovin.impl.qe.this.f1179a.s().j0().k())) {
                        com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerTcfInfoListActivity.class, this.f1181a, new com.applovin.impl.qe.b.C0049b());
                        return;
                    } else {
                        com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.qe.this);
                        return;
                    }
                }
                if (kbVar.a() == com.applovin.impl.se.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                    com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity.class, this.f1181a, new com.applovin.impl.qe.b.c());
                    return;
                }
                return;
            }
            if (iB == com.applovin.impl.se.e.ADS.ordinal()) {
                if (kbVar.a() == com.applovin.impl.se.b.AD_UNITS.ordinal()) {
                    if (com.applovin.impl.qe.this.f1179a.e().size() > 0) {
                        com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerAdUnitsListActivity.class, this.f1181a, new com.applovin.impl.qe.b.d());
                        return;
                    } else {
                        com.applovin.impl.yp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", com.applovin.impl.qe.this);
                        return;
                    }
                }
                if (kbVar.a() == com.applovin.impl.se.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (com.applovin.impl.qe.this.f1179a.j().size() > 0 || com.applovin.impl.qe.this.f1179a.u().size() > 0) {
                        if (com.applovin.impl.qe.this.f1179a.s().k0().c()) {
                            com.applovin.impl.yp.a("Restart Required", ccVar.b(), com.applovin.impl.qe.this);
                            return;
                        } else {
                            com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity.class, this.f1181a, new com.applovin.impl.qe.b.e());
                            return;
                        }
                    }
                    com.applovin.impl.yp.a("Complete Integrations", "Please complete integrations in order to access this.", com.applovin.impl.qe.this);
                    return;
                }
                if (kbVar.a() == com.applovin.impl.se.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (com.applovin.impl.qe.this.f1179a.s().k0().c()) {
                        if (com.applovin.impl.qe.this.f1179a.t().size() > 0) {
                            com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerTestModeNetworkActivity.class, this.f1181a, new com.applovin.impl.qe.b.f());
                            return;
                        } else {
                            com.applovin.impl.yp.a("Complete Integrations", "Please complete integrations in order to access this.", com.applovin.impl.qe.this);
                            return;
                        }
                    }
                    com.applovin.impl.qe.this.getSdk().k0().a();
                    com.applovin.impl.yp.a("Restart Required", ccVar.b(), com.applovin.impl.qe.this);
                    return;
                }
                if (kbVar.a() == com.applovin.impl.se.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerAdUnitsListActivity.class, this.f1181a, new com.applovin.impl.qe.b.g());
                    return;
                }
                return;
            }
            if ((iB == com.applovin.impl.se.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || iB == com.applovin.impl.se.e.INCOMPLETE_NETWORKS.ordinal() || iB == com.applovin.impl.se.e.COMPLETED_NETWORKS.ordinal()) && (ccVar instanceof com.applovin.impl.bg)) {
                com.applovin.impl.r.a(com.applovin.impl.qe.this, com.applovin.mediation.MaxDebuggerDetailActivity.class, this.f1181a, new com.applovin.impl.qe.b.h(ccVar));
            }
        }

        class a implements com.applovin.impl.r.b {
            a() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(com.applovin.impl.qe.this.f1179a.s());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.qe$b$b, reason: collision with other inner class name */
        class C0049b implements com.applovin.impl.r.b {
            C0049b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(com.applovin.impl.qe.this.f1179a.s());
            }
        }

        class c implements com.applovin.impl.r.b {
            c() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(com.applovin.impl.qe.this.f1179a.s());
            }
        }

        class d implements com.applovin.impl.r.b {
            d() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(com.applovin.impl.qe.this.f1179a.e(), false, com.applovin.impl.qe.this.f1179a.s());
            }
        }

        class e implements com.applovin.impl.r.b {
            e() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(com.applovin.impl.qe.this.f1179a.j(), com.applovin.impl.qe.this.f1179a.u(), com.applovin.impl.qe.this.f1179a.s());
            }
        }

        class f implements com.applovin.impl.r.b {
            f() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(com.applovin.impl.qe.this.f1179a.t(), com.applovin.impl.qe.this.f1179a.s());
            }
        }

        class g implements com.applovin.impl.r.b {
            g() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(com.applovin.impl.qe.this.f1179a.n(), true, com.applovin.impl.qe.this.f1179a.s());
            }
        }

        class h implements com.applovin.impl.r.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.applovin.impl.cc f1189a;

            h(com.applovin.impl.cc ccVar) {
                this.f1189a = ccVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((com.applovin.impl.bg) this.f1189a).r());
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.o oVar = new com.applovin.impl.o(this, 50, android.R.attr.progressBarStyleLarge);
        this.f = oVar;
        oVar.setColor(-3355444);
        this.c.addView(this.f, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.f);
        this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final android.content.Context context) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f1179a.g()) || this.f1179a.d()) {
            return;
        }
        this.f1179a.b(true);
        runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.qe$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.Context context) {
        com.applovin.impl.yp.a(this.f1179a.h(), this.f1179a.g(), context);
    }

    private void b() {
        java.lang.String strO = this.f1179a.o();
        if (android.text.TextUtils.isEmpty(strO)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strO);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(android.content.Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.o oVar = this.f;
        if (oVar != null) {
            oVar.b();
            this.c.removeView(this.f);
            this.f = null;
        }
    }
}
