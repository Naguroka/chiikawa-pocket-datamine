package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class i implements com.iab.omid.library.applovin.internal.d.a, com.iab.omid.library.applovin.devicevolume.c {
    private static com.iab.omid.library.applovin.internal.i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2362a = 0.0f;
    private final com.iab.omid.library.applovin.devicevolume.e b;
    private final com.iab.omid.library.applovin.devicevolume.b c;
    private com.iab.omid.library.applovin.devicevolume.d d;
    private com.iab.omid.library.applovin.internal.c e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private com.iab.omid.library.applovin.internal.c a() {
        if (this.e == null) {
            this.e = com.iab.omid.library.applovin.internal.c.c();
        }
        return this.e;
    }

    public static com.iab.omid.library.applovin.internal.i c() {
        if (f == null) {
            f = new com.iab.omid.library.applovin.internal.i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f2362a;
    }

    public void d() {
        com.iab.omid.library.applovin.internal.b.g().a(this);
        com.iab.omid.library.applovin.internal.b.g().e();
        com.iab.omid.library.applovin.walking.TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        com.iab.omid.library.applovin.walking.TreeWalker.getInstance().j();
        com.iab.omid.library.applovin.internal.b.g().f();
        this.d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f2) {
        this.f2362a = f2;
        java.util.Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(android.content.Context context) {
        this.d = this.b.a(new android.os.Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z) {
        if (z) {
            com.iab.omid.library.applovin.walking.TreeWalker.getInstance().h();
        } else {
            com.iab.omid.library.applovin.walking.TreeWalker.getInstance().g();
        }
    }
}
