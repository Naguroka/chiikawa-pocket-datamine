package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.iab.omid.library.applovin.internal.d.a {
    private static com.iab.omid.library.applovin.internal.a f = new com.iab.omid.library.applovin.internal.a(new com.iab.omid.library.applovin.internal.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f2354a = new com.iab.omid.library.applovin.utils.f();
    private java.util.Date b;
    private boolean c;
    private com.iab.omid.library.applovin.internal.d d;
    private boolean e;

    private a(com.iab.omid.library.applovin.internal.d dVar) {
        this.d = dVar;
    }

    public static com.iab.omid.library.applovin.internal.a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public java.util.Date b() {
        java.util.Date date = this.b;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public void d() {
        java.util.Date dateA = this.f2354a.a();
        java.util.Date date = this.b;
        if (date == null || dateA.after(date)) {
            this.b = dateA;
            c();
        }
    }

    public void a(android.content.Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }
}
