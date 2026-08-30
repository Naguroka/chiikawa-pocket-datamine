package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n3 extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1083a;
    private com.applovin.impl.dc b;

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    public void initialize(java.util.List<com.applovin.impl.rn> list, java.util.List<com.applovin.impl.rn> list2, java.util.List<com.applovin.impl.rn> list3, java.util.List<com.applovin.impl.rn> list4, java.util.List<com.applovin.impl.rn> list5, com.applovin.impl.sdk.j jVar) {
        this.f1083a = jVar;
        com.applovin.impl.n3.a aVar = new com.applovin.impl.n3.a(this, list, list2, list3, list4, list5);
        this.b = aVar;
        aVar.a(new com.applovin.impl.n3.b());
        this.b.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        final /* synthetic */ java.util.List f;
        final /* synthetic */ java.util.List g;
        final /* synthetic */ java.util.List h;
        final /* synthetic */ java.util.List i;
        final /* synthetic */ java.util.List j;

        @Override // com.applovin.impl.dc
        protected int b() {
            return com.applovin.impl.n3.c.values().length;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.content.Context context, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
            super(context);
            this.f = list;
            this.g = list2;
            this.h = list3;
            this.i = list4;
            this.j = list5;
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            if (i == com.applovin.impl.n3.c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            if (i == com.applovin.impl.n3.c.MISSING_AC_NETWORKS.ordinal()) {
                return this.g.size();
            }
            if (i == com.applovin.impl.n3.c.LISTED_TC_NETWORKS.ordinal()) {
                return this.h.size();
            }
            if (i == com.applovin.impl.n3.c.LISTED_AC_NETWORKS.ordinal()) {
                return this.i.size();
            }
            return this.j.size();
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            if (i == com.applovin.impl.n3.c.MISSING_TC_NETWORKS.ordinal()) {
                return new com.applovin.impl.fj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i == com.applovin.impl.n3.c.MISSING_AC_NETWORKS.ordinal()) {
                return new com.applovin.impl.fj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i == com.applovin.impl.n3.c.LISTED_TC_NETWORKS.ordinal()) {
                return new com.applovin.impl.fj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i == com.applovin.impl.n3.c.LISTED_AC_NETWORKS.ordinal()) {
                return new com.applovin.impl.fj("LISTED ATP NETWORKS (AC STRING)");
            }
            return new com.applovin.impl.fj("NON-CONFIGURABLE NETWORKS");
        }

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            java.util.List list;
            boolean z = true;
            if (i == com.applovin.impl.n3.c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f;
            } else if (i == com.applovin.impl.n3.c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.g;
            } else {
                z = false;
                if (i == com.applovin.impl.n3.c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.h;
                } else if (i == com.applovin.impl.n3.c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.i;
                } else {
                    list = this.j;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.applovin.impl.n3.this.a((com.applovin.impl.rn) it.next(), z));
            }
            return arrayList;
        }
    }

    class b implements com.applovin.impl.dc.a {
        b() {
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.n3.this);
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1083a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView)).setAdapter((android.widget.ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.cc a(com.applovin.impl.rn rnVar, boolean z) {
        com.applovin.impl.cc.b bVarA = com.applovin.impl.cc.a();
        boolean zB = this.f1083a.j0().b();
        com.applovin.impl.rn.a aVarF = rnVar.f();
        com.applovin.impl.rn.a aVar = com.applovin.impl.rn.a.TCF_VENDOR;
        if (aVarF != aVar && (rnVar.f() != com.applovin.impl.rn.a.ATP_NETWORK || !zB)) {
            bVarA.d(rnVar.b());
        } else {
            java.lang.String strC = rnVar.c();
            bVarA.d(strC).d(z ? -65536 : androidx.core.view.ViewCompat.MEASURED_STATE_MASK).b(strC).a((rnVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ") + rnVar.d()).a(true);
        }
        return bVarA.a();
    }
}
