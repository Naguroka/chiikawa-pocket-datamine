package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class le extends com.applovin.impl.dc {
    private final com.applovin.impl.je f;
    private java.util.List g;
    private final java.util.List h;
    private final java.util.List i;
    private final java.util.List j;
    private final java.util.List k;
    private android.text.SpannedString l;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    private java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        com.applovin.impl.sdk.utils.CollectionUtils.addObjectIfExists(i(), arrayList);
        com.applovin.impl.sdk.utils.CollectionUtils.addObjectIfExists(d(), arrayList);
        com.applovin.impl.sdk.utils.CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    public java.lang.String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    le(com.applovin.impl.je jeVar, android.content.Context context) {
        super(context);
        this.f = jeVar;
        if (jeVar.q() == com.applovin.impl.je.a.INVALID_INTEGRATION) {
            android.text.SpannableString spannableString = new android.text.SpannableString("Tap for more information");
            spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.l = new android.text.SpannedString(spannableString);
        } else {
            this.l = new android.text.SpannedString("");
        }
        this.g = g();
        this.h = b(jeVar.n());
        this.i = e();
        this.j = a(jeVar.f());
        this.k = j();
        notifyDataSetChanged();
    }

    public com.applovin.impl.je h() {
        return this.f;
    }

    public void k() {
        this.g = g();
    }

    private com.applovin.impl.cc i() {
        com.applovin.impl.cc.b bVarC = com.applovin.impl.cc.a().d("SDK").c(this.f.p());
        if (android.text.TextUtils.isEmpty(this.f.p())) {
            bVarC.a(a(this.f.E())).b(b(this.f.E()));
        }
        return bVarC.a();
    }

    private com.applovin.impl.cc d() {
        com.applovin.impl.cc.b bVarC = com.applovin.impl.cc.a().d("Adapter").c(this.f.c());
        if (android.text.TextUtils.isEmpty(this.f.c())) {
            bVarC.a(a(this.f.A())).b(b(this.f.A()));
        }
        return bVarC.a();
    }

    private com.applovin.impl.cc f() {
        if (this.f.G()) {
            return null;
        }
        return com.applovin.impl.cc.a().d("Initialization Status").c(f(this.f.i())).a(false).a();
    }

    private java.lang.String f(int i) {
        if (com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) {
            return "Initialized";
        }
        if (com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i) {
            return "Failure";
        }
        return com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    private java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        if (this.f.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.j.w0(), true));
        }
        return arrayList;
    }

    private java.util.List j() {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f.v())) {
            arrayList.add(com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).d(this.f.v()).a());
        }
        if (this.f.y() == com.applovin.impl.je.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f.s() != null) {
            arrayList.add(c(this.f.s()));
        }
        arrayList.add(a(this.f.y()));
        return arrayList;
    }

    private com.applovin.impl.cc a(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        return com.applovin.impl.cc.a(z ? com.applovin.impl.cc.c.RIGHT_DETAIL : com.applovin.impl.cc.c.DETAIL).d(str).a(z ? null : this.l).b("Instructions").a(str2).a(z ? com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered : c(z2)).b(z ? com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_checkmarkColor, this.f719a) : d(z2)).a(!z).a();
    }

    private int c(boolean z) {
        return z ? com.applovin.sdk.R.drawable.applovin_ic_x_mark : com.applovin.sdk.R.drawable.applovin_ic_warning;
    }

    private int b(boolean z) {
        return com.applovin.impl.t3.a(z ? com.applovin.sdk.R.color.applovin_sdk_checkmarkColor : com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this.f719a);
    }

    @Override // com.applovin.impl.dc
    protected com.applovin.impl.cc e(int i) {
        if (i == com.applovin.impl.le.a.INTEGRATIONS.ordinal()) {
            return new com.applovin.impl.fj("INTEGRATIONS");
        }
        if (i == com.applovin.impl.le.a.PERMISSIONS.ordinal()) {
            return new com.applovin.impl.fj("PERMISSIONS");
        }
        if (i == com.applovin.impl.le.a.CONFIGURATION.ordinal()) {
            return new com.applovin.impl.fj("CONFIGURATION");
        }
        if (i == com.applovin.impl.le.a.DEPENDENCIES.ordinal()) {
            return new com.applovin.impl.fj("DEPENDENCIES");
        }
        return new com.applovin.impl.fj("TEST ADS");
    }

    @Override // com.applovin.impl.dc
    protected java.util.List c(int i) {
        if (i == com.applovin.impl.le.a.INTEGRATIONS.ordinal()) {
            return this.g;
        }
        if (i == com.applovin.impl.le.a.PERMISSIONS.ordinal()) {
            return this.h;
        }
        if (i == com.applovin.impl.le.a.CONFIGURATION.ordinal()) {
            return this.i;
        }
        if (i == com.applovin.impl.le.a.DEPENDENCIES.ordinal()) {
            return this.j;
        }
        return this.k;
    }

    private com.applovin.impl.cc c(java.util.List list) {
        return com.applovin.impl.cc.a().d("Region/VPN Required").c(com.applovin.impl.sdk.utils.CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private int d(boolean z) {
        return com.applovin.impl.t3.a(z ? com.applovin.sdk.R.color.applovin_sdk_xmarkColor : com.applovin.sdk.R.color.applovin_sdk_warningColor, this.f719a);
    }

    private java.util.List b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        if (list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.applovin.impl.gh ghVar = (com.applovin.impl.gh) it.next();
                arrayList.add(a(ghVar.b(), ghVar.a(), ghVar.c(), true));
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.dc
    protected int b() {
        return com.applovin.impl.le.a.COUNT.ordinal();
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        if (list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.applovin.impl.o6 o6Var = (com.applovin.impl.o6) it.next();
                arrayList.add(a(o6Var.b(), o6Var.a(), o6Var.c(), true));
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.dc
    protected int d(int i) {
        if (i == com.applovin.impl.le.a.INTEGRATIONS.ordinal()) {
            return this.g.size();
        }
        if (i == com.applovin.impl.le.a.PERMISSIONS.ordinal()) {
            return this.h.size();
        }
        if (i == com.applovin.impl.le.a.CONFIGURATION.ordinal()) {
            return this.i.size();
        }
        if (i == com.applovin.impl.le.a.DEPENDENCIES.ordinal()) {
            return this.j.size();
        }
        return this.k.size();
    }

    private int a(boolean z) {
        return z ? com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered : com.applovin.sdk.R.drawable.applovin_ic_x_mark;
    }

    private com.applovin.impl.cc a(com.applovin.impl.je.b bVar) {
        com.applovin.impl.cc.b bVarA = com.applovin.impl.cc.a();
        if (bVar == com.applovin.impl.je.b.READY) {
            bVarA.a(this.f719a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    public boolean a(com.applovin.impl.kb kbVar) {
        return kbVar.b() == com.applovin.impl.le.a.TEST_ADS.ordinal() && kbVar.a() == this.k.size() - 1;
    }
}
