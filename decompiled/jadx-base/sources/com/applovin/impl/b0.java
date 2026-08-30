package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.z f633a;
    private com.applovin.impl.sdk.j b;
    private com.applovin.impl.dc c;

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.cc c(java.lang.String str) {
        return com.applovin.impl.cc.a(com.applovin.impl.cc.c.RIGHT_DETAIL).b(com.applovin.impl.sdk.utils.StringUtils.createSpannedString(str, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(this).a(true).a();
    }

    public void initialize(final com.applovin.impl.z zVar, final com.applovin.impl.sdk.j jVar) {
        this.f633a = zVar;
        this.b = jVar;
        com.applovin.impl.b0.a aVar = new com.applovin.impl.b0.a(this, zVar);
        this.c = aVar;
        aVar.a(new com.applovin.impl.dc.a() { // from class: com.applovin.impl.b0$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.dc.a
            public final void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
                this.f$0.a(jVar, zVar, kbVar, ccVar);
            }
        });
        this.c.notifyDataSetChanged();
    }

    class a extends com.applovin.impl.dc {
        final /* synthetic */ com.applovin.impl.z f;

        @Override // com.applovin.impl.dc
        protected java.util.List c(int i) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.applovin.impl.a0 a0Var = (com.applovin.impl.a0) this.f.g().get(i);
            arrayList.add(com.applovin.impl.b0.this.c(a0Var.c()));
            if (a0Var.b() != null) {
                arrayList.add(com.applovin.impl.b0.this.a("AB Test Experiment Name", a0Var.b()));
            }
            com.applovin.impl.kr krVarD = a0Var.d();
            com.applovin.impl.b0 b0Var = com.applovin.impl.b0.this;
            arrayList.add(b0Var.a("Device ID Targeting", b0Var.a(krVarD.a())));
            com.applovin.impl.b0 b0Var2 = com.applovin.impl.b0.this;
            arrayList.add(b0Var2.a("Device Type Targeting", b0Var2.b(krVarD.b())));
            if (krVarD.c() != null) {
                arrayList.add(com.applovin.impl.b0.this.a(krVarD.c()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.content.Context context, com.applovin.impl.z zVar) {
            super(context);
            this.f = zVar;
        }

        @Override // com.applovin.impl.dc
        protected int b() {
            return this.f.g().size();
        }

        @Override // com.applovin.impl.dc
        protected int d(int i) {
            com.applovin.impl.a0 a0Var = (com.applovin.impl.a0) this.f.g().get(i);
            return (a0Var.b() != null ? 1 : 0) + 3 + (a0Var.d().c() == null ? 0 : 1);
        }

        @Override // com.applovin.impl.dc
        protected com.applovin.impl.cc e(int i) {
            if (i == com.applovin.impl.b0.b.TARGETED_WATERFALL.ordinal()) {
                return new com.applovin.impl.fj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i == com.applovin.impl.b0.b.OTHER_WATERFALLS.ordinal()) {
                return new com.applovin.impl.fj("OTHER WATERFALLS");
            }
            return new com.applovin.impl.fj("");
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
        setTitle(this.f633a.d());
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        listView.setAdapter((android.widget.ListAdapter) this.c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.applovin.impl.dc dcVar = this.c;
        if (dcVar != null) {
            dcVar.a((com.applovin.impl.dc.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String b(java.lang.String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        return str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        return str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.z zVar, com.applovin.impl.kb kbVar, com.applovin.impl.sdk.j jVar, com.applovin.mediation.MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, (com.applovin.impl.a0) zVar.g().get(kbVar.b()), null, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.z zVar, com.applovin.impl.kb kbVar, com.applovin.impl.sdk.j jVar, com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        com.applovin.impl.a0 a0Var = (com.applovin.impl.a0) zVar.g().get(kbVar.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(a0Var.c(), a0Var.d().c(), jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, final com.applovin.impl.z zVar, final com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
        if (kbVar.a() == 0) {
            com.applovin.impl.r.a(this, com.applovin.mediation.MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new com.applovin.impl.r.b() { // from class: com.applovin.impl.b0$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.r.b
                public final void a(android.app.Activity activity) {
                    com.applovin.impl.b0.a(zVar, kbVar, jVar, (com.applovin.mediation.MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            com.applovin.impl.r.a(this, com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity.class, jVar.e(), new com.applovin.impl.r.b() { // from class: com.applovin.impl.b0$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.r.b
                public final void a(android.app.Activity activity) {
                    com.applovin.impl.b0.a(zVar, kbVar, jVar, (com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.cc a(java.lang.String str, java.lang.String str2) {
        return com.applovin.impl.cc.a(com.applovin.impl.cc.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.cc a(java.util.List list) {
        return com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).d("Segment Targeting").a(com.applovin.impl.sdk.utils.StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }
}
