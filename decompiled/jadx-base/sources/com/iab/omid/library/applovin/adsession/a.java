package com.iab.omid.library.applovin.adsession;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.iab.omid.library.applovin.adsession.AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.adsession.AdSessionContext f2349a;
    private final com.iab.omid.library.applovin.adsession.AdSessionConfiguration b;
    private final com.iab.omid.library.applovin.internal.f c;
    private com.iab.omid.library.applovin.weakreference.a d;
    private com.iab.omid.library.applovin.publisher.AdSessionStatePublisher e;
    private boolean f;
    private boolean g;
    private final java.lang.String h;
    private boolean i;
    private boolean j;
    private com.iab.omid.library.applovin.adsession.PossibleObstructionListener k;

    a(com.iab.omid.library.applovin.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.applovin.adsession.AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, java.util.UUID.randomUUID().toString());
    }

    private void a() {
        if (this.i) {
            throw new java.lang.IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.j) {
            throw new java.lang.IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(android.view.View view, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        if (this.g) {
            return;
        }
        this.c.a(view, friendlyObstructionPurpose, str);
    }

    public android.view.View c() {
        return this.d.get();
    }

    public java.util.List<com.iab.omid.library.applovin.internal.e> d() {
        return this.c.a();
    }

    public boolean e() {
        return this.k != null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(com.iab.omid.library.applovin.adsession.ErrorType errorType, java.lang.String str) {
        if (this.g) {
            throw new java.lang.IllegalStateException("AdSession is finished");
        }
        com.iab.omid.library.applovin.utils.g.a(errorType, "Error type is null");
        com.iab.omid.library.applovin.utils.g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f && !this.g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.applovin.internal.c.c().b(this);
        getAdSessionStatePublisher().b();
        this.e = null;
        this.k = null;
    }

    public boolean g() {
        return this.g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public java.lang.String getAdSessionId() {
        return this.h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public com.iab.omid.library.applovin.publisher.AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.e;
    }

    public boolean h() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(android.view.View view) {
        if (this.g) {
            return;
        }
        com.iab.omid.library.applovin.utils.g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(android.view.View view) {
        if (this.g) {
            return;
        }
        this.c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(com.iab.omid.library.applovin.adsession.PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f) {
            return;
        }
        this.f = true;
        com.iab.omid.library.applovin.internal.c.c().c(this);
        this.e.a(com.iab.omid.library.applovin.internal.i.c().b());
        this.e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.e.a(this, this.f2349a);
    }

    a(com.iab.omid.library.applovin.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.applovin.adsession.AdSessionContext adSessionContext, java.lang.String str) {
        this.c = new com.iab.omid.library.applovin.internal.f();
        this.f = false;
        this.g = false;
        this.b = adSessionConfiguration;
        this.f2349a = adSessionContext;
        this.h = str;
        b(null);
        this.e = (adSessionContext.getAdSessionContextType() == com.iab.omid.library.applovin.adsession.AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == com.iab.omid.library.applovin.adsession.AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new com.iab.omid.library.applovin.publisher.b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.e.i();
        com.iab.omid.library.applovin.internal.c.c().a(this);
        this.e.a(adSessionConfiguration);
    }

    private void a(android.view.View view) {
        java.util.Collection<com.iab.omid.library.applovin.adsession.a> collectionB = com.iab.omid.library.applovin.internal.c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (com.iab.omid.library.applovin.adsession.a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.d.clear();
            }
        }
    }

    private void b(android.view.View view) {
        this.d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(java.util.List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                android.view.View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.h, arrayList);
        }
    }

    void a(org.json.JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.j = true;
    }
}
