package com.iab.omid.library.ironsrc.internal;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.iab.omid.library.ironsrc.internal.d.a {
    private static com.iab.omid.library.ironsrc.internal.a f = new com.iab.omid.library.ironsrc.internal.a(new com.iab.omid.library.ironsrc.internal.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f2424a = new com.iab.omid.library.ironsrc.utils.f();
    private java.util.Date b;
    private boolean c;
    private com.iab.omid.library.ironsrc.internal.d d;
    private boolean e;

    private a(com.iab.omid.library.ironsrc.internal.d dVar) {
        this.d = dVar;
    }

    public static com.iab.omid.library.ironsrc.internal.a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
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

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }

    public java.util.Date b() {
        java.util.Date date = this.b;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public void d() {
        java.util.Date dateA = this.f2424a.a();
        java.util.Date date = this.b;
        if (date == null || dateA.after(date)) {
            this.b = dateA;
            c();
        }
    }
}
