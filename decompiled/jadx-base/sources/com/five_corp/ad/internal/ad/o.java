package com.five_corp.ad.internal.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1829a;
    public final com.five_corp.ad.internal.context.h b;
    public final com.five_corp.ad.internal.ad.m c;
    public final java.lang.String d;
    public final com.five_corp.ad.internal.K e;
    public final com.five_corp.ad.internal.ad.n f;

    public o(android.content.Context context, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.ad.m mVar, java.lang.String str, com.five_corp.ad.internal.K k, com.five_corp.ad.internal.ad.n nVar) {
        this.f1829a = context;
        this.b = hVar;
        this.c = mVar;
        this.d = str;
        this.e = k;
        this.f = nVar;
    }

    public final java.lang.Runnable a(final android.app.Activity activity, final com.five_corp.ad.internal.view.L l, final com.five_corp.ad.internal.ad.k kVar, final java.lang.String str) {
        int iA = com.five_corp.ad.e.a(kVar.b);
        if (iA == 0) {
            return new java.lang.Runnable() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(l);
                }
            };
        }
        if (iA == 1) {
            return new java.lang.Runnable() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity, l, str);
                }
            };
        }
        if (iA == 2) {
            return new java.lang.Runnable() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(kVar, l);
                }
            };
        }
        throw new java.lang.RuntimeException();
    }

    public final void b(final java.lang.String str) {
        java.util.Objects.requireNonNull(this.c, "informationIconConfig cannot be null");
        final java.util.List list = this.c.f1828a.b;
        java.util.Objects.requireNonNull(list, "Parser validates, so choiceConfigList cannot be null");
        android.content.Context context = this.f1829a;
        com.five_corp.ad.internal.context.h hVar = com.five_corp.ad.internal.context.h.INTERSTITIAL;
        com.five_corp.ad.internal.context.h hVar2 = this.b;
        boolean z = hVar == hVar2 || com.five_corp.ad.internal.context.h.VIDEO_REWARD == hVar2;
        com.five_corp.ad.internal.ad_report.c cVar = new com.five_corp.ad.internal.ad_report.c() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda5
            @Override // com.five_corp.ad.internal.ad_report.c
            public final void a(com.five_corp.ad.AdReportDialogActivity adReportDialogActivity) {
                this.f$0.a(list, str, adReportDialogActivity);
            }
        };
        com.five_corp.ad.internal.ad_report.b bVar = new com.five_corp.ad.internal.ad_report.b() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda6
            @Override // com.five_corp.ad.internal.ad_report.b
            public final void a(com.five_corp.ad.internal.s sVar) {
                this.f$0.a(sVar);
            }
        };
        if (com.five_corp.ad.internal.ad_report.d.f1840a == null) {
            com.five_corp.ad.internal.ad_report.d.f1840a = new com.five_corp.ad.internal.ad_report.a();
        }
        com.five_corp.ad.internal.ad_report.d.f1840a.a(context, z, cVar, bVar);
    }

    public final void a(com.five_corp.ad.internal.view.L l) {
        a(this.d);
        l.a();
    }

    public final void a(android.app.Activity activity, com.five_corp.ad.internal.view.L l, java.lang.String str) {
        java.util.Objects.requireNonNull(this.c, "informationIconConfig cannot be null");
        if (str != null && android.util.Patterns.WEB_URL.matcher(str).matches()) {
            new androidx.browser.customtabs.CustomTabsIntent.Builder().build().launchUrl(activity, android.net.Uri.parse(str));
        }
        com.five_corp.ad.internal.view.C1512e c1512e = this.c.b.f1830a != null ? new com.five_corp.ad.internal.view.C1512e(this.f1829a, this.c.b.f1830a) : null;
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.f;
        com.five_corp.ad.internal.view.C1519l c1519l = fVar.c;
        if (c1519l != null) {
            com.five_corp.ad.internal.view.M.a(c1519l.b.f1941a);
            if (c1512e != null) {
                c1519l.addView(c1512e);
            }
        } else {
            com.five_corp.ad.internal.fullscreen.e eVar = fVar.v;
            if (eVar != null && eVar != null) {
                int currentPositionMs = fVar.h.getCurrentPositionMs();
                fVar.a(currentPositionMs);
                com.five_corp.ad.internal.fullscreen.e eVar2 = fVar.v;
                if (!eVar2.m.getAndSet(true)) {
                    eVar2.g.removeAllViews();
                    eVar2.k = null;
                    eVar2.l = null;
                    eVar2.f1903a.finish();
                }
                fVar.v = null;
                fVar.o.l(currentPositionMs, fVar.t);
            }
        }
        l.a();
    }

    public final void a(com.five_corp.ad.internal.ad.k kVar, com.five_corp.ad.internal.view.L l) {
        a(kVar.c);
        l.a();
    }

    public final /* synthetic */ void a(com.five_corp.ad.internal.s sVar) {
        a(this.d);
    }

    public final void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        ((com.five_corp.ad.f) this.f).b(str);
    }

    public final void a(android.app.Activity activity, java.util.List list, java.lang.String str) {
        final com.five_corp.ad.internal.view.L l = new com.five_corp.ad.internal.view.L(activity);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.k kVar = (com.five_corp.ad.internal.ad.k) it.next();
            arrayList.add(new android.util.Pair(kVar.f1827a, a(activity, l, kVar, str)));
        }
        final com.five_corp.ad.internal.K k = this.e;
        java.util.Objects.requireNonNull(k);
        l.a(new com.five_corp.ad.internal.view.C1510c(activity, arrayList, new com.five_corp.ad.internal.view.InterfaceC1508a() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.view.InterfaceC1508a
            public final int a(int i) {
                return k.a(i);
            }
        }, new com.five_corp.ad.internal.view.InterfaceC1509b() { // from class: com.five_corp.ad.internal.ad.o$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.view.InterfaceC1509b
            public final void a() {
                l.a();
            }
        }));
    }
}
