package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jr extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f933a;
    private com.applovin.impl.sdk.j b;
    private com.applovin.impl.dc c;

    public void initialize(java.lang.String str, java.util.List<java.lang.String> list, com.applovin.impl.sdk.j jVar) {
        this.f933a = str;
        this.b = jVar;
        com.applovin.impl.jr.a aVar = new com.applovin.impl.jr.a(this, a(list));
        this.c = aVar;
        aVar.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        final /* synthetic */ java.util.List f;

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc a() {
            return new com.applovin.impl.cc.b(com.applovin.impl.cc.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.dc
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            return new com.applovin.impl.fj("SEGMENT TARGETING");
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
            return this.f;
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.b;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        setTitle(this.f933a);
        ((android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView)).setAdapter((android.widget.ListAdapter) this.c);
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).d((java.lang.String) it.next()).a());
        }
        return arrayList;
    }
}
