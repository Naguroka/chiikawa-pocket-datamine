package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f662a;
    private com.applovin.impl.dc b;
    private java.util.List c;
    private boolean d;
    private android.widget.ListView f;

    public void initialize(final java.util.List<com.applovin.impl.z> list, boolean z, final com.applovin.impl.sdk.j jVar) {
        this.d = z;
        this.f662a = jVar;
        this.c = a(list);
        com.applovin.impl.c0.a aVar = new com.applovin.impl.c0.a(this, list);
        this.b = aVar;
        aVar.a(new com.applovin.impl.dc.a() { // from class: com.applovin.impl.c0$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.dc.a
            public final void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
                this.f$0.a(list, jVar, kbVar, ccVar);
            }
        });
        this.b.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        final /* synthetic */ java.util.List f;

        @Override // com.applovin.impl.dc
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            return new com.applovin.impl.fj("");
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
            return com.applovin.impl.c0.this.c;
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f662a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f = listView;
        listView.setAdapter((android.widget.ListAdapter) this.b);
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.z zVar = (com.applovin.impl.z) it.next();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString(zVar.c(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((java.lang.CharSequence) new android.text.SpannedString("\n"));
            spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString(zVar.b(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).b(com.applovin.impl.sdk.utils.StringUtils.createSpannedString(zVar.d(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new android.text.SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.util.List list, final com.applovin.impl.sdk.j jVar, com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
        final com.applovin.impl.z zVar = (com.applovin.impl.z) list.get(kbVar.a());
        if (zVar.g().size() == 1) {
            com.applovin.impl.r.a(this, com.applovin.mediation.MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new com.applovin.impl.r.b() { // from class: com.applovin.impl.c0$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.r.b
                public final void a(android.app.Activity activity) {
                    ((com.applovin.mediation.MaxDebuggerAdUnitDetailActivity) activity).initialize(zVar, null, null, jVar);
                }
            });
        } else {
            com.applovin.impl.r.a(this, com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity.class, jVar.e(), new com.applovin.impl.r.b() { // from class: com.applovin.impl.c0$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.r.b
                public final void a(android.app.Activity activity) {
                    ((com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(zVar, jVar);
                }
            });
        }
    }
}
