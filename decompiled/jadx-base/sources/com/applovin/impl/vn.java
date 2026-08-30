package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vn extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1433a;
    private java.util.List b;
    private com.applovin.impl.dc c;
    private java.util.List d;
    private android.widget.ListView f;

    public vn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(java.util.List<com.applovin.impl.je> list, com.applovin.impl.sdk.j jVar) {
        this.f1433a = jVar;
        this.b = list;
        this.d = a(list);
        com.applovin.impl.vn.a aVar = new com.applovin.impl.vn.a(this, list);
        this.c = aVar;
        aVar.a(new com.applovin.impl.vn.b(list, jVar));
        this.c.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        final /* synthetic */ java.util.List f;

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc a() {
            return new com.applovin.impl.cc.b(com.applovin.impl.cc.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.dc
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            return new com.applovin.impl.fj("TEST MODE NETWORKS");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.content.Context context, java.util.List list) {
            super(context);
            this.f = list;
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            return this.f.size();
        }

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            return com.applovin.impl.vn.this.d;
        }
    }

    class b implements com.applovin.impl.dc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f1434a;
        final /* synthetic */ com.applovin.impl.sdk.j b;

        b(java.util.List list, com.applovin.impl.sdk.j jVar) {
            this.f1434a = list;
            this.b = jVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            java.util.List listU = ((com.applovin.impl.je) this.f1434a.get(kbVar.a())).u();
            if (listU.equals(this.b.k0().b())) {
                this.b.k0().a((java.util.List) null);
            } else {
                this.b.k0().a(listU);
            }
            com.applovin.impl.vn.this.c.notifyDataSetChanged();
        }
    }

    class c extends com.applovin.impl.bg {
        final /* synthetic */ com.applovin.impl.je p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.applovin.impl.je jeVar, android.content.Context context, com.applovin.impl.je jeVar2) {
            super(jeVar, context);
            this.p = jeVar2;
        }

        @Override // com.applovin.impl.cc
        public android.text.SpannedString k() {
            return com.applovin.impl.sdk.utils.StringUtils.createSpannedString(this.p.g(), o() ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public int d() {
            if (this.p.u().equals(com.applovin.impl.vn.this.f1433a.k0().b())) {
                return com.applovin.sdk.R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public int e() {
            if (this.p.u().equals(com.applovin.impl.vn.this.f1433a.k0().b())) {
                return -16776961;
            }
            return super.e();
        }
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.je jeVar = (com.applovin.impl.je) it.next();
            arrayList.add(new com.applovin.impl.vn.c(jeVar, this, jeVar));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f = listView;
        listView.setAdapter((android.widget.ListAdapter) this.c);
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1433a;
    }

    @Override // com.applovin.impl.re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.notifyDataSetChanged();
    }
}
