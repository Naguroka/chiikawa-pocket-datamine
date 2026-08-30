package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class rg extends com.applovin.impl.lg {
    static final /* synthetic */ boolean p = true;
    private final com.applovin.impl.aq h;
    private final java.util.concurrent.atomic.AtomicBoolean i;
    private com.iab.omid.library.applovin.adsession.media.MediaEvents j;
    private final com.iab.omid.library.applovin.adsession.media.VastProperties k;
    private final java.util.concurrent.atomic.AtomicBoolean l;
    private final java.util.concurrent.atomic.AtomicBoolean m;
    private final java.util.concurrent.atomic.AtomicBoolean n;
    private final java.util.concurrent.atomic.AtomicBoolean o;

    public rg(com.applovin.impl.aq aqVar) {
        super(aqVar);
        this.i = new java.util.concurrent.atomic.AtomicBoolean();
        this.l = new java.util.concurrent.atomic.AtomicBoolean();
        this.m = new java.util.concurrent.atomic.AtomicBoolean();
        this.n = new java.util.concurrent.atomic.AtomicBoolean();
        this.o = new java.util.concurrent.atomic.AtomicBoolean();
        this.h = aqVar;
        float fS1 = aqVar.s1();
        if (aqVar.s1() == -1) {
            this.k = com.iab.omid.library.applovin.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(true, com.iab.omid.library.applovin.adsession.media.Position.STANDALONE);
        } else {
            this.k = com.iab.omid.library.applovin.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(fS1, true, com.iab.omid.library.applovin.adsession.media.Position.STANDALONE);
        }
    }

    @Override // com.applovin.impl.lg
    protected com.iab.omid.library.applovin.adsession.AdSessionConfiguration a() {
        try {
            com.iab.omid.library.applovin.adsession.CreativeType creativeType = com.iab.omid.library.applovin.adsession.CreativeType.VIDEO;
            com.iab.omid.library.applovin.adsession.ImpressionType impressionType = com.iab.omid.library.applovin.adsession.ImpressionType.BEGIN_TO_RENDER;
            com.iab.omid.library.applovin.adsession.Owner owner = com.iab.omid.library.applovin.adsession.Owner.NATIVE;
            return com.iab.omid.library.applovin.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.g.loaded(this.k);
    }

    @Override // com.applovin.impl.lg
    public void h() {
        b("track loaded", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.p();
            }
        });
    }

    public void b(final float f, final boolean z) {
        if (this.l.compareAndSet(false, true)) {
            b("track started", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(f, z);
                }
            });
        }
    }

    public void x() {
        if (this.m.compareAndSet(false, true)) {
            b("track first quartile", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.o();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.j.firstQuartile();
    }

    public void y() {
        if (this.n.compareAndSet(false, true)) {
            b("track midpoint", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.q();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.j.midpoint();
    }

    public void C() {
        if (this.o.compareAndSet(false, true)) {
            b("track third quartile", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.u();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.j.thirdQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.j.complete();
    }

    public void w() {
        b("track completed", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.j.pause();
    }

    public void z() {
        b("track paused", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.j.resume();
    }

    public void A() {
        b("track resumed", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.s();
            }
        });
    }

    public void j() {
        if (this.i.compareAndSet(false, true)) {
            b("buffer started", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.l();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.j.bufferStart();
    }

    public void i() {
        if (this.i.compareAndSet(true, false)) {
            b("buffer finished", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.j.skipped();
    }

    public void B() {
        b("track skipped", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.j.adUserInteraction(com.iab.omid.library.applovin.adsession.media.InteractionType.CLICK);
    }

    public void v() {
        b("track clicked", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f, boolean z) {
        this.j.start(f, z ? 0.0f : 1.0f);
    }

    public void b(final boolean z) {
        b("track volume changed", new java.lang.Runnable() { // from class: com.applovin.impl.rg$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        this.j.volumeChange(z ? 0.0f : 1.0f);
    }

    @Override // com.applovin.impl.lg
    protected void a(com.iab.omid.library.applovin.adsession.AdSession adSession) {
        try {
            this.j = com.iab.omid.library.applovin.adsession.media.MediaEvents.createMediaEvents(adSession);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Failed to create media events", th);
            }
        }
    }

    @Override // com.applovin.impl.lg
    protected com.iab.omid.library.applovin.adsession.AdSessionContext a(android.webkit.WebView webView) {
        com.iab.omid.library.applovin.adsession.VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        if (!p && this.h.k1() == null) {
            throw new java.lang.AssertionError();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.applovin.impl.bq bqVar : this.h.k1().b()) {
            java.util.List<com.applovin.impl.hq> listC = bqVar.c();
            if (listC.isEmpty()) {
                com.applovin.impl.mq.a(bqVar.b(), com.applovin.impl.fq.FAILED_TO_LOAD_RESOURCE, this.b);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.applovin.impl.hq hqVar : listC) {
                    if ("omid".equalsIgnoreCase(hqVar.b())) {
                        arrayList2.add(hqVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    com.applovin.impl.mq.a(bqVar.b(), com.applovin.impl.fq.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.b);
                } else {
                    java.util.ArrayList<java.net.URL> arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new java.net.URL(((com.applovin.impl.hq) it.next()).c()));
                        } catch (java.lang.Throwable th) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a(this.d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        com.applovin.impl.mq.a(bqVar.b(), com.applovin.impl.fq.FAILED_TO_LOAD_RESOURCE, this.b);
                    } else {
                        java.lang.String strE = bqVar.e();
                        java.lang.String strD = bqVar.d();
                        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strE) && !com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                            com.applovin.impl.mq.a(bqVar.b(), com.applovin.impl.fq.FAILED_TO_LOAD_RESOURCE, this.b);
                        } else {
                            for (java.net.URL url : arrayList3) {
                                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strE)) {
                                    verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE);
                                } else {
                                    verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                }
                                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
                            }
                        }
                    }
                }
            }
        }
        java.lang.String strA = this.b.V().a();
        if (android.text.TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return com.iab.omid.library.applovin.adsession.AdSessionContext.createNativeAdSessionContext(this.b.V().b(), strA, arrayList, this.h.getOpenMeasurementContentUrl(), this.h.getOpenMeasurementCustomReferenceData());
        } catch (java.lang.Throwable th2) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.c.a(this.d, "Failed to create ad session context", th2);
            return null;
        }
    }
}
