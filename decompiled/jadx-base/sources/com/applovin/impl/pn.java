package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pn extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1146a;
    private com.applovin.impl.dc b;
    private final java.util.List c = new java.util.ArrayList();
    private final java.util.List d = new java.util.ArrayList();
    private final java.util.List f = new java.util.ArrayList();
    private final java.util.List g = new java.util.ArrayList();
    private final java.util.List h = new java.util.ArrayList();

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.applovin.impl.pn.d.values().length);
        java.lang.Integer numG = this.f1146a.j0().g();
        java.lang.String strK = this.f1146a.j0().k();
        java.lang.String strC = this.f1146a.j0().c();
        arrayList.add(a(com.applovin.impl.uj.r.a(), numG));
        arrayList.add(a(com.applovin.impl.uj.s.a(), strK, !com.applovin.impl.tn.b(strK)));
        arrayList.add(a(com.applovin.impl.uj.t.a(), strC, false));
        return arrayList;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f1146a = jVar;
        com.applovin.impl.qn qnVarJ0 = jVar.j0();
        a(qnVarJ0.i());
        com.applovin.impl.pn.a aVar = new com.applovin.impl.pn.a(this);
        this.b = aVar;
        aVar.a(new com.applovin.impl.pn.b(qnVarJ0, jVar));
        this.b.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        @Override // com.applovin.impl.dc
        protected int b() {
            return com.applovin.impl.pn.e.values().length;
        }

        a(android.content.Context context) {
            super(context);
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            if (i == com.applovin.impl.pn.e.IAB_TCF_PARAMETERS.ordinal()) {
                return com.applovin.impl.pn.d.values().length;
            }
            return com.applovin.impl.pn.c.values().length;
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            if (i == com.applovin.impl.pn.e.IAB_TCF_PARAMETERS.ordinal()) {
                return new com.applovin.impl.fj("IAB TCF Parameters");
            }
            return new com.applovin.impl.fj("CMP CONFIGURATION");
        }

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            return i == com.applovin.impl.pn.e.IAB_TCF_PARAMETERS.ordinal() ? com.applovin.impl.pn.this.c() : com.applovin.impl.pn.this.a();
        }
    }

    class b implements com.applovin.impl.dc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.qn f1147a;
        final /* synthetic */ com.applovin.impl.sdk.j b;

        b(com.applovin.impl.qn qnVar, com.applovin.impl.sdk.j jVar) {
            this.f1147a = qnVar;
            this.b = jVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            java.lang.String strA;
            java.lang.String strC;
            if (kbVar.b() == com.applovin.impl.pn.e.IAB_TCF_PARAMETERS.ordinal()) {
                if (kbVar.a() == com.applovin.impl.pn.d.TC_STRING.ordinal()) {
                    strA = com.applovin.impl.uj.s.a();
                    strC = this.f1147a.k();
                } else {
                    strA = com.applovin.impl.uj.t.a();
                    strC = this.f1147a.c();
                }
                com.applovin.impl.r.a(com.applovin.impl.pn.this, com.applovin.mediation.MaxDebuggerTcfStringActivity.class, this.b.e(), new com.applovin.impl.pn.b.a(strA, strC));
                return;
            }
            if (kbVar.a() == com.applovin.impl.pn.c.CONFIGURED_NETWORKS.ordinal()) {
                com.applovin.impl.r.a(com.applovin.impl.pn.this, com.applovin.mediation.MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new com.applovin.impl.pn.b.C0045b());
            } else {
                com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.pn.this);
            }
        }

        class a implements com.applovin.impl.r.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f1148a;
            final /* synthetic */ java.lang.String b;

            a(java.lang.String str, java.lang.String str2) {
                this.f1148a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f1148a, this.b, com.applovin.impl.pn.b.this.b);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.pn$b$b, reason: collision with other inner class name */
        class C0045b implements com.applovin.impl.r.b {
            C0045b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(com.applovin.impl.pn.this.f, com.applovin.impl.pn.this.g, com.applovin.impl.pn.this.c, com.applovin.impl.pn.this.d, com.applovin.impl.pn.this.h, com.applovin.impl.pn.b.this.b);
            }
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1146a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView)).setAdapter((android.widget.ListAdapter) this.b);
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.applovin.impl.dc dcVar = this.b;
        if (dcVar != null) {
            dcVar.a((com.applovin.impl.dc.a) null);
        }
    }

    private void a(com.applovin.impl.rn rnVar, java.util.List list) {
        if (rnVar.d() != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (rnVar.d().equals(((com.applovin.impl.rn) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(rnVar);
    }

    private com.applovin.impl.cc b() {
        com.applovin.impl.cc.b bVarA;
        java.lang.String strA = com.applovin.impl.uj.p.a();
        java.lang.Integer numE = this.f1146a.j0().e();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f1146a.j0().d())) {
            bVarA = com.applovin.impl.cc.a(com.applovin.impl.cc.c.RIGHT_DETAIL);
        } else {
            bVarA = com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).b("Unknown CMP SDK ID").a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(com.applovin.sdk.R.drawable.applovin_ic_warning).b(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.applovin.impl.pn.c.values().length);
        int size = this.f.size() + this.g.size();
        arrayList.add(b());
        arrayList.add(a(com.applovin.impl.uj.q.a(), this.f1146a.j0().f()));
        arrayList.add(com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        arrayList.add(com.applovin.impl.cc.a(com.applovin.impl.cc.c.RIGHT_DETAIL).d("Configured CMP Networks").c(size > 0 ? "Missing " + size + " network(s)" : "").c(size > 0 ? -65536 : androidx.core.view.ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private com.applovin.impl.cc a(java.lang.String str, java.lang.String str2, boolean z) {
        boolean zIsValidString = com.applovin.impl.sdk.utils.StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        com.applovin.impl.cc.b bVarA = bVarD.c(str2).c(z ? -65536 : androidx.core.view.ViewCompat.MEASURED_STATE_MASK).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }

    private com.applovin.impl.cc a(java.lang.String str, java.lang.Integer num) {
        return com.applovin.impl.cc.a(com.applovin.impl.cc.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : -65536).a();
    }

    private void a(java.util.List list) {
        boolean zB = this.f1146a.j0().b();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.rn rnVar = (com.applovin.impl.rn) it.next();
            if (rnVar.f() == com.applovin.impl.rn.a.TCF_VENDOR) {
                if (java.lang.Boolean.TRUE.equals(rnVar.a())) {
                    a(rnVar, this.c);
                } else {
                    a(rnVar, this.f);
                }
            } else if (rnVar.f() != com.applovin.impl.rn.a.ATP_NETWORK) {
                this.h.add(rnVar);
            } else if (zB) {
                if (java.lang.Boolean.TRUE.equals(rnVar.a())) {
                    a(rnVar, this.d);
                } else {
                    a(rnVar, this.g);
                }
            } else {
                this.h.add(rnVar);
            }
        }
    }
}
