package com.iab.omid.library.ironsrc.internal;

/* JADX INFO: loaded from: classes5.dex */
public class h implements com.iab.omid.library.ironsrc.internal.d.a, com.iab.omid.library.ironsrc.devicevolume.c {
    private static com.iab.omid.library.ironsrc.internal.h f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2431a = 0.0f;
    private final com.iab.omid.library.ironsrc.devicevolume.e b;
    private final com.iab.omid.library.ironsrc.devicevolume.b c;
    private com.iab.omid.library.ironsrc.devicevolume.d d;
    private com.iab.omid.library.ironsrc.internal.c e;

    public h(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private com.iab.omid.library.ironsrc.internal.c a() {
        if (this.e == null) {
            this.e = com.iab.omid.library.ironsrc.internal.c.c();
        }
        return this.e;
    }

    public static com.iab.omid.library.ironsrc.internal.h c() {
        if (f == null) {
            f = new com.iab.omid.library.ironsrc.internal.h(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f2) {
        this.f2431a = f2;
        java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(android.content.Context context) {
        this.d = this.b.a(new android.os.Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z) {
        if (z) {
            com.iab.omid.library.ironsrc.walking.TreeWalker.getInstance().h();
        } else {
            com.iab.omid.library.ironsrc.walking.TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f2431a;
    }

    public void d() {
        com.iab.omid.library.ironsrc.internal.b.g().a(this);
        com.iab.omid.library.ironsrc.internal.b.g().e();
        com.iab.omid.library.ironsrc.walking.TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        com.iab.omid.library.ironsrc.walking.TreeWalker.getInstance().j();
        com.iab.omid.library.ironsrc.internal.b.g().f();
        this.d.d();
    }
}
