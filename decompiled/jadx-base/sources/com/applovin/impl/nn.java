package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nn extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1100a;
    private com.applovin.impl.dc b;

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private com.applovin.impl.cc a(java.lang.String str, java.lang.String str2) {
        return com.applovin.impl.cc.a().d(str).c(str2).a();
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f1100a = jVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String strA = com.applovin.impl.a4.b().a(this);
        boolean zB = jVar.j0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (com.applovin.impl.rn rnVar : jVar.j0().i()) {
            java.lang.Boolean boolA = rnVar.a();
            if (boolA != null) {
                if (rnVar.f() == com.applovin.impl.rn.a.TCF_VENDOR) {
                    arrayList.add(a(rnVar.b(), java.lang.String.valueOf(boolA)));
                } else if (rnVar.f() == com.applovin.impl.rn.a.ATP_NETWORK) {
                    arrayList2.add(a(rnVar.b(), java.lang.String.valueOf(boolA)));
                }
            } else if (zB && rnVar.f() == com.applovin.impl.rn.a.ATP_NETWORK) {
                arrayList2.add(a(rnVar.b(), strA));
            }
        }
        com.applovin.impl.nn.a aVar = new com.applovin.impl.nn.a(this, arrayList, arrayList2, zB);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        final /* synthetic */ java.util.ArrayList f;
        final /* synthetic */ java.util.ArrayList g;
        final /* synthetic */ boolean h;

        @Override // com.applovin.impl.dc
        protected int b() {
            return com.applovin.impl.nn.b.values().length;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z) {
            super(context);
            this.f = arrayList;
            this.g = arrayList2;
            this.h = z;
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            if (i == com.applovin.impl.nn.b.TC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            return this.g.size();
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            if (i == com.applovin.impl.nn.b.TC_NETWORKS.ordinal()) {
                return new com.applovin.impl.fj("TCF VENDORS (TC STRING)");
            }
            return new com.applovin.impl.fj(this.h ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            if (i == com.applovin.impl.nn.b.TC_NETWORKS.ordinal()) {
                return this.f;
            }
            return this.g;
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1100a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView)).setAdapter((android.widget.ListAdapter) this.b);
    }
}
