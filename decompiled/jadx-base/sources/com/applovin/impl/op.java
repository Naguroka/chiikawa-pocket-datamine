package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class op extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1128a;
    private com.applovin.impl.dc b;

    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.applovin.impl.op.e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f1128a = jVar;
        com.applovin.impl.op.a aVar = new com.applovin.impl.op.a(this);
        this.b = aVar;
        aVar.a(new com.applovin.impl.op.b(jVar));
        this.b.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        @Override // com.applovin.impl.dc
        protected int b() {
            return com.applovin.impl.op.d.values().length;
        }

        a(android.content.Context context) {
            super(context);
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            if (i == com.applovin.impl.op.d.SETTINGS.ordinal()) {
                return com.applovin.impl.op.e.values().length;
            }
            return com.applovin.impl.op.c.values().length;
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            if (i == com.applovin.impl.op.d.SETTINGS.ordinal()) {
                return new com.applovin.impl.fj("SETTINGS");
            }
            return new com.applovin.impl.fj("GDPR APPLICABILITY");
        }

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            return i == com.applovin.impl.op.d.SETTINGS.ordinal() ? com.applovin.impl.op.this.c() : com.applovin.impl.op.this.a();
        }
    }

    class b implements com.applovin.impl.dc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f1129a;

        b(com.applovin.impl.sdk.j jVar) {
            this.f1129a = jVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            if (kbVar.b() == com.applovin.impl.op.d.SETTINGS.ordinal()) {
                if (kbVar.a() == com.applovin.impl.op.e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f1129a.u().g() != null) {
                        com.applovin.impl.tp.a(this.f1129a.u().g(), com.applovin.impl.sdk.j.m(), this.f1129a);
                        return;
                    } else {
                        com.applovin.impl.yp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", com.applovin.impl.op.this);
                        return;
                    }
                }
                if (kbVar.a() != com.applovin.impl.op.e.TERMS_OF_SERVICE_URL.ordinal() || this.f1129a.u().h() == null) {
                    return;
                }
                com.applovin.impl.tp.a(this.f1129a.u().h(), com.applovin.impl.sdk.j.m(), this.f1129a);
            }
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1128a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
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

    private com.applovin.impl.cc d() {
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a().d("Terms of Service URL");
        if (this.f1128a.u().h() != null) {
            bVarD.a(com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_checkmarkColor, this));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    private com.applovin.impl.cc a(com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        java.lang.String str;
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a().d("Consent Flow Geography");
        if (consentFlowUserGeography == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown";
        }
        return bVarD.c(str).b(z).a();
    }

    private com.applovin.impl.cc b(com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        java.lang.String str;
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a().d("Debug User Geography");
        if (consentFlowUserGeography == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None";
        }
        return bVarD.c(str).b(z).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.applovin.impl.op.c.values().length);
        com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f1128a.s().getConsentFlowUserGeography();
        com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyE = this.f1128a.u().e();
        boolean z = com.applovin.impl.yp.c(this.f1128a) && consentFlowUserGeographyE != com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(com.applovin.impl.cc.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z));
        arrayList.add(b(consentFlowUserGeographyE, z));
        return arrayList;
    }

    private com.applovin.impl.cc b() {
        boolean z = this.f1128a.u().g() != null;
        return com.applovin.impl.cc.a().d("Privacy Policy URL").a(z ? com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered : com.applovin.sdk.R.drawable.applovin_ic_x_mark).b(com.applovin.impl.t3.a(z ? com.applovin.sdk.R.color.applovin_sdk_checkmarkColor : com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
