package com.iab.omid.library.ironsrc.adsession;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.iab.omid.library.ironsrc.adsession.AdSession {
    private static final java.util.regex.Pattern l = java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.adsession.AdSessionContext f2419a;
    private final com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration b;
    private com.iab.omid.library.ironsrc.weakreference.a d;
    private com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher e;
    private boolean i;
    private boolean j;
    private com.iab.omid.library.ironsrc.adsession.PossibleObstructionListener k;
    private final java.util.List<com.iab.omid.library.ironsrc.internal.e> c = new java.util.ArrayList();
    private boolean f = false;
    private boolean g = false;
    private final java.lang.String h = java.util.UUID.randomUUID().toString();

    a(com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.ironsrc.adsession.AdSessionContext adSessionContext) {
        this.b = adSessionConfiguration;
        this.f2419a = adSessionContext;
        d(null);
        this.e = (adSessionContext.getAdSessionContextType() == com.iab.omid.library.ironsrc.adsession.AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == com.iab.omid.library.ironsrc.adsession.AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(adSessionContext.getWebView()) : new com.iab.omid.library.ironsrc.publisher.b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.e.i();
        com.iab.omid.library.ironsrc.internal.c.c().a(this);
        this.e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.i) {
            throw new java.lang.IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(java.lang.String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!l.matcher(str).matches()) {
                throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private com.iab.omid.library.ironsrc.internal.e b(android.view.View view) {
        for (com.iab.omid.library.ironsrc.internal.e eVar : this.c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void b() {
        if (this.j) {
            throw new java.lang.IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(android.view.View view) {
        java.util.Collection<com.iab.omid.library.ironsrc.adsession.a> collectionB = com.iab.omid.library.ironsrc.internal.c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (com.iab.omid.library.ironsrc.adsession.a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.d.clear();
            }
        }
    }

    private void d(android.view.View view) {
        this.d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(java.util.List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
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

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(android.view.View view, com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        if (this.g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.c.add(new com.iab.omid.library.ironsrc.internal.e(view, friendlyObstructionPurpose, str));
        }
    }

    public android.view.View c() {
        return this.d.get();
    }

    public java.util.List<com.iab.omid.library.ironsrc.internal.e> d() {
        return this.c;
    }

    public boolean e() {
        return this.k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(com.iab.omid.library.ironsrc.adsession.ErrorType errorType, java.lang.String str) {
        if (this.g) {
            throw new java.lang.IllegalStateException("AdSession is finished");
        }
        com.iab.omid.library.ironsrc.utils.g.a(errorType, "Error type is null");
        com.iab.omid.library.ironsrc.utils.g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f && !this.g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.ironsrc.internal.c.c().b(this);
        getAdSessionStatePublisher().b();
        this.e = null;
        this.k = null;
    }

    public boolean g() {
        return this.g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public java.lang.String getAdSessionId() {
        return this.h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher getAdSessionStatePublisher() {
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

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(android.view.View view) {
        if (this.g) {
            return;
        }
        com.iab.omid.library.ironsrc.utils.g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.c.clear();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(android.view.View view) {
        if (this.g) {
            return;
        }
        a(view);
        com.iab.omid.library.ironsrc.internal.e eVarB = b(view);
        if (eVarB != null) {
            this.c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(com.iab.omid.library.ironsrc.adsession.PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f) {
            return;
        }
        this.f = true;
        com.iab.omid.library.ironsrc.internal.c.c().c(this);
        this.e.a(com.iab.omid.library.ironsrc.internal.h.c().b());
        this.e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.e.a(this, this.f2419a);
    }
}
