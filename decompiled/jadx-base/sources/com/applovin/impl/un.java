package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class un extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1409a;
    private java.util.List b;
    private java.util.List c;
    private com.applovin.impl.dc d;
    private java.util.List f;
    private java.util.List g;
    private android.widget.ListView h;

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public un() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(java.util.List<com.applovin.impl.ic> list, java.util.List<com.applovin.impl.ic> list2, final com.applovin.impl.sdk.j jVar) {
        this.f1409a = jVar;
        this.b = list;
        this.c = list2;
        this.f = a(list);
        this.g = a(list2);
        com.applovin.impl.un.a aVar = new com.applovin.impl.un.a(this);
        this.d = aVar;
        aVar.a(new com.applovin.impl.dc.a() { // from class: com.applovin.impl.un$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.dc.a
            public final void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
                this.f$0.a(jVar, kbVar, ccVar);
            }
        });
        this.d.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc a() {
            return new com.applovin.impl.cc.b(com.applovin.impl.cc.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.dc
        protected int b() {
            return com.applovin.impl.un.c.COUNT.ordinal();
        }

        a(android.content.Context context) {
            super(context);
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            return i == com.applovin.impl.un.c.BIDDERS.ordinal() ? com.applovin.impl.un.this.f.size() : com.applovin.impl.un.this.g.size();
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            if (i == com.applovin.impl.un.c.BIDDERS.ordinal()) {
                return new com.applovin.impl.fj("BIDDERS");
            }
            return new com.applovin.impl.fj("WATERFALL");
        }

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            return i == com.applovin.impl.un.c.BIDDERS.ordinal() ? com.applovin.impl.un.this.f : com.applovin.impl.un.this.g;
        }
    }

    class b extends com.applovin.impl.bg {
        final /* synthetic */ com.applovin.impl.ic p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.applovin.impl.je jeVar, android.content.Context context, com.applovin.impl.ic icVar) {
            super(jeVar, context);
            this.p = icVar;
        }

        @Override // com.applovin.impl.cc
        public android.text.SpannedString k() {
            return com.applovin.impl.sdk.utils.StringUtils.createSpannedString(this.p.a(), o() ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public int d() {
            if (com.applovin.impl.un.this.f1409a.k0().b() == null || !com.applovin.impl.un.this.f1409a.k0().b().equals(this.p.b())) {
                return 0;
            }
            return com.applovin.sdk.R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public int e() {
            if (com.applovin.impl.un.this.f1409a.k0().b() == null || !com.applovin.impl.un.this.f1409a.k0().b().equals(this.p.b())) {
                return super.e();
            }
            return -16776961;
        }
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.ic icVar = (com.applovin.impl.ic) it.next();
            arrayList.add(new com.applovin.impl.un.b(icVar.d(), this, icVar));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.h = listView;
        listView.setAdapter((android.widget.ListAdapter) this.d);
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1409a;
    }

    @Override // com.applovin.impl.re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f = a(this.b);
        this.g = a(this.c);
        this.d.c();
    }

    private com.applovin.impl.ic a(com.applovin.impl.kb kbVar) {
        if (kbVar.b() == com.applovin.impl.un.c.BIDDERS.ordinal()) {
            return (com.applovin.impl.ic) this.b.get(kbVar.a());
        }
        return (com.applovin.impl.ic) this.c.get(kbVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.j jVar, com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
        java.util.List listB = a(kbVar).b();
        if (listB.equals(jVar.k0().b())) {
            jVar.k0().a((java.util.List) null);
        } else {
            jVar.k0().a(listB);
        }
        this.d.notifyDataSetChanged();
    }
}
