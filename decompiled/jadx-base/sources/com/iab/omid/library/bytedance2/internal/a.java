package com.iab.omid.library.bytedance2.internal;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.iab.omid.library.bytedance2.internal.d.a {
    private static com.iab.omid.library.bytedance2.internal.a f = new com.iab.omid.library.bytedance2.internal.a(new com.iab.omid.library.bytedance2.internal.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f2389a = new com.iab.omid.library.bytedance2.utils.f();
    private java.util.Date b;
    private boolean c;
    private com.iab.omid.library.bytedance2.internal.d d;
    private boolean e;

    private a(com.iab.omid.library.bytedance2.internal.d dVar) {
        this.d = dVar;
    }

    public static com.iab.omid.library.bytedance2.internal.a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
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

    @Override // com.iab.omid.library.bytedance2.internal.d.a
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
        java.util.Date dateA = this.f2389a.a();
        java.util.Date date = this.b;
        if (date == null || dateA.after(date)) {
            this.b = dateA;
            c();
        }
    }
}
