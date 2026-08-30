package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class dm extends com.applovin.impl.bm {
    private final com.applovin.impl.aq r;

    public dm(com.applovin.impl.aq aqVar, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aqVar, jVar, appLovinAdLoadListener);
        this.r = aqVar;
    }

    @Override // com.applovin.impl.bm, java.lang.Runnable
    public void run() {
        super.run();
        boolean zK0 = this.r.K0();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Begin caching for VAST " + (zK0 ? "streaming " : "") + "ad #" + this.h.getAdIdNumber() + "...");
        }
        if (zK0) {
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.I0)).booleanValue()) {
                if (!com.applovin.impl.z3.f()) {
                    a(e());
                }
                if (this.r.y1()) {
                    f();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.applovin.impl.d1 d1VarP = p();
                    if (d1VarP != null) {
                        arrayList.add(d1VarP);
                    }
                    com.applovin.impl.e1 e1VarQ = q();
                    if (e1VarQ != null) {
                        arrayList.add(e1VarQ);
                    }
                    com.applovin.impl.f1 f1VarR = r();
                    if (f1VarR != null) {
                        arrayList.add(f1VarR);
                    }
                    a(arrayList);
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (this.r.p1() == com.applovin.impl.aq.c.COMPANION_AD) {
                        com.applovin.impl.d1 d1VarP2 = p();
                        if (d1VarP2 != null) {
                            arrayList2.add(d1VarP2);
                        }
                        com.applovin.impl.e1 e1VarQ2 = q();
                        if (e1VarQ2 != null) {
                            arrayList2.add(e1VarQ2);
                        }
                        a(arrayList2);
                        f();
                        com.applovin.impl.f1 f1VarR2 = r();
                        if (f1VarR2 != null) {
                            arrayList3.add(f1VarR2);
                        }
                        a(arrayList3);
                    } else {
                        com.applovin.impl.f1 f1VarR3 = r();
                        if (f1VarR3 != null) {
                            arrayList2.add(f1VarR3);
                        }
                        a(arrayList2);
                        f();
                        com.applovin.impl.d1 d1VarP3 = p();
                        if (d1VarP3 != null) {
                            arrayList3.add(d1VarP3);
                        }
                        com.applovin.impl.e1 e1VarQ3 = q();
                        if (e1VarQ3 != null) {
                            arrayList3.add(e1VarQ3);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.r.y1()) {
                    f();
                }
                com.applovin.impl.aq.c cVarP1 = this.r.p1();
                com.applovin.impl.aq.c cVar = com.applovin.impl.aq.c.COMPANION_AD;
                if (cVarP1 == cVar) {
                    m();
                    n();
                    a(this.r);
                } else {
                    o();
                }
                if (!this.r.y1()) {
                    f();
                }
                if (this.r.p1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.r);
                }
            }
        } else if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.I0)).booleanValue()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            if (!com.applovin.impl.z3.f()) {
                arrayList4.addAll(e());
            }
            com.applovin.impl.d1 d1VarP4 = p();
            if (d1VarP4 != null) {
                arrayList4.add(d1VarP4);
            }
            com.applovin.impl.f1 f1VarR4 = r();
            if (f1VarR4 != null) {
                arrayList4.add(f1VarR4);
            }
            com.applovin.impl.e1 e1VarQ4 = q();
            if (e1VarQ4 != null) {
                arrayList4.add(e1VarQ4);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.r);
            f();
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Finished caching VAST ad #" + this.r.getAdIdNumber());
        }
        this.r.z1();
        k();
    }

    private void m() {
        if (l()) {
            return;
        }
        if (this.r.A1()) {
            com.applovin.impl.dq dqVarL1 = this.r.l1();
            if (dqVarL1 != null) {
                com.applovin.impl.iq iqVarE = dqVarL1.e();
                if (iqVarE != null) {
                    android.net.Uri uriC = iqVarE.c();
                    java.lang.String string = uriC != null ? uriC.toString() : "";
                    java.lang.String strB = iqVarE.b();
                    if (!android.webkit.URLUtil.isValidUrl(string) && !com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (iqVarE.d() == com.applovin.impl.iq.a.STATIC) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "Caching static companion ad at " + string + "...");
                        }
                        android.net.Uri uriA = a(string, java.util.Collections.emptyList(), false);
                        if (uriA != null) {
                            iqVarE.a(uriA);
                            this.r.b(true);
                            return;
                        } else {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.b(this.b, "Failed to cache static companion ad");
                                return;
                            }
                            return;
                        }
                    }
                    if (iqVarE.d() == com.applovin.impl.iq.a.HTML) {
                        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                            }
                            java.lang.String strD = d(string, null, false);
                            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a(this.b, "HTML fetched. Caching HTML now...");
                                }
                                iqVarE.a(a(strD, java.util.Collections.emptyList(), this.r));
                                this.r.b(true);
                                return;
                            }
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.b(this.b, "Unable to load companion ad resources from " + string);
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
                        }
                        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.W4)).booleanValue()) {
                            strB = d(strB);
                        }
                        iqVarE.a(a(strB, java.util.Collections.emptyList(), this.r));
                        this.r.b(true);
                        return;
                    }
                    if (iqVarE.d() == com.applovin.impl.iq.a.IFRAME && com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Skip caching of iFrame resource...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Companion ad caching disabled. Skipping...");
        }
    }

    private void o() {
        com.applovin.impl.oq oqVarW1;
        android.net.Uri uriE;
        if (l()) {
            return;
        }
        if (this.r.B1()) {
            if (this.r.v1() == null || (oqVarW1 = this.r.w1()) == null || (uriE = oqVarW1.e()) == null) {
                return;
            }
            android.net.Uri uriC = c(uriE.toString(), java.util.Collections.emptyList(), false);
            if (uriC != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Video file successfully cached into: " + uriC);
                }
                oqVarW1.a(uriC);
                return;
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Failed to cache video file: " + oqVarW1);
                    return;
                }
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Video caching disabled. Skipping...");
        }
    }

    private void n() {
        java.lang.String strN1;
        if (l() || !com.applovin.impl.mq.a(this.r)) {
            return;
        }
        if (this.r.o1() != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Begin caching HTML template. Fetching from " + this.r.o1() + "...");
            }
            strN1 = b(this.r.o1().toString(), this.r.Y(), true);
        } else {
            strN1 = this.r.n1();
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strN1)) {
            java.lang.String strA = a(strN1, this.r.Y(), this.h);
            if (this.r.isOpenMeasurementEnabled()) {
                strA = this.f1547a.V().a(strA);
            }
            this.r.b(strA);
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Finish caching HTML template " + this.r.n1() + " for ad #" + this.r.getAdIdNumber());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Unable to load HTML template");
        }
    }

    private java.lang.String d(java.lang.String str) {
        for (java.lang.String str2 : com.applovin.impl.sdk.utils.StringUtils.getRegexMatches(com.applovin.impl.sdk.utils.StringUtils.match(str, (java.lang.String) this.f1547a.a(com.applovin.impl.sj.Y4)), 1)) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                android.net.Uri uriA = a(str2, java.util.Collections.emptyList(), false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.h.a(uriA);
                    this.i.d();
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "Failed to cache JavaScript resource: " + str2);
                    }
                    this.i.c();
                }
            }
        }
        return str;
    }

    private com.applovin.impl.d1 p() {
        if (!this.r.A1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        com.applovin.impl.dq dqVarL1 = this.r.l1();
        if (dqVarL1 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        com.applovin.impl.iq iqVarE = dqVarL1.e();
        if (iqVarE == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        android.net.Uri uriC = iqVarE.c();
        java.lang.String string = uriC != null ? uriC.toString() : "";
        java.lang.String strB = iqVarE.b();
        if (!android.webkit.URLUtil.isValidUrl(string) && !com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
            }
        } else {
            if (iqVarE.d() == com.applovin.impl.iq.a.STATIC) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Caching static companion ad at " + string + "...");
                }
                return new com.applovin.impl.f1(string, this.r, java.util.Collections.emptyList(), false, this.i, this.f1547a, new com.applovin.impl.dm.a(iqVarE));
            }
            if (iqVarE.d() == com.applovin.impl.iq.a.HTML) {
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                    }
                    java.lang.String strD = d(string, null, false);
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "HTML fetched. Caching HTML now...");
                        }
                        return a(strD, java.util.Collections.emptyList(), new com.applovin.impl.dm.b(iqVarE));
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "Unable to load companion ad resources from " + string);
                    }
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
                    }
                    return a(strB, java.util.Collections.emptyList(), new com.applovin.impl.dm.c(iqVarE));
                }
            } else if (iqVarE.d() == com.applovin.impl.iq.a.IFRAME && com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Skip caching of iFrame resource...");
            }
        }
        return null;
    }

    class a implements com.applovin.impl.f1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.iq f729a;

        a(com.applovin.impl.iq iqVar) {
            this.f729a = iqVar;
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            if (uri != null) {
                this.f729a.a(uri);
                com.applovin.impl.dm.this.r.b(true);
                return;
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.dm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.dm dmVar = com.applovin.impl.dm.this;
                dmVar.c.b(dmVar.b, "Failed to cache static companion ad");
            }
        }
    }

    class b implements com.applovin.impl.bm.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.iq f730a;

        b(com.applovin.impl.iq iqVar) {
            this.f730a = iqVar;
        }

        @Override // com.applovin.impl.bm.e
        public void a(java.lang.String str) {
            this.f730a.a(str);
            com.applovin.impl.dm.this.r.b(true);
        }
    }

    class c implements com.applovin.impl.bm.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.iq f731a;

        c(com.applovin.impl.iq iqVar) {
            this.f731a = iqVar;
        }

        @Override // com.applovin.impl.bm.e
        public void a(java.lang.String str) {
            this.f731a.a(str);
            com.applovin.impl.dm.this.r.b(true);
        }
    }

    protected com.applovin.impl.f1 r() {
        com.applovin.impl.oq oqVarW1;
        android.net.Uri uriE;
        if (!this.r.B1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.r.v1() == null || (oqVarW1 = this.r.w1()) == null || (uriE = oqVarW1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Caching video file " + oqVarW1 + " creative...");
        }
        return a(uriE.toString(), java.util.Collections.emptyList(), false, (com.applovin.impl.f1.a) new com.applovin.impl.dm.d(oqVarW1));
    }

    class d implements com.applovin.impl.f1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.oq f732a;

        d(com.applovin.impl.oq oqVar) {
            this.f732a = oqVar;
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.dm.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.dm dmVar = com.applovin.impl.dm.this;
                    dmVar.c.a(dmVar.b, "Video file successfully cached into: " + uri);
                }
                this.f732a.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar2 = com.applovin.impl.dm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.dm dmVar2 = com.applovin.impl.dm.this;
                dmVar2.c.b(dmVar2.b, "Failed to cache video file: " + this.f732a);
            }
        }
    }

    protected com.applovin.impl.e1 q() {
        if (android.text.TextUtils.isEmpty(this.r.n1())) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.c.a(this.b, "Unable to load HTML template");
            return null;
        }
        return a(this.r.n1(), this.r.Y(), new com.applovin.impl.dm.e());
    }

    class e implements com.applovin.impl.bm.e {
        e() {
        }

        @Override // com.applovin.impl.bm.e
        public void a(java.lang.String str) {
            if (com.applovin.impl.dm.this.r.isOpenMeasurementEnabled()) {
                str = com.applovin.impl.dm.this.f1547a.V().a(str);
            }
            com.applovin.impl.dm.this.r.b(str);
            com.applovin.impl.sdk.n nVar = com.applovin.impl.dm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.dm dmVar = com.applovin.impl.dm.this;
                dmVar.c.a(dmVar.b, "Finish caching HTML template " + com.applovin.impl.dm.this.r.n1() + " for ad #" + com.applovin.impl.dm.this.r.getAdIdNumber());
            }
        }
    }

    @Override // com.applovin.impl.bm
    void f() {
        this.r.getAdEventTracker().h();
        super.f();
    }

    @Override // com.applovin.impl.bm
    void a(int i) {
        this.r.getAdEventTracker().f();
        super.a(i);
    }
}
