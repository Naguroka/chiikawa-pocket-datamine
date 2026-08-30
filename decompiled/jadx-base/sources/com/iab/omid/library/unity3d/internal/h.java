package com.iab.omid.library.unity3d.internal;

/* JADX INFO: loaded from: classes5.dex */
public class h implements com.iab.omid.library.unity3d.internal.d.a, com.iab.omid.library.unity3d.devicevolume.c {
    private static com.iab.omid.library.unity3d.internal.h f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2464a = 0.0f;
    private final com.iab.omid.library.unity3d.devicevolume.e b;
    private final com.iab.omid.library.unity3d.devicevolume.b c;
    private com.iab.omid.library.unity3d.devicevolume.d d;
    private com.iab.omid.library.unity3d.internal.c e;

    public h(com.iab.omid.library.unity3d.devicevolume.e eVar, com.iab.omid.library.unity3d.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private com.iab.omid.library.unity3d.internal.c a() {
        if (this.e == null) {
            this.e = com.iab.omid.library.unity3d.internal.c.c();
        }
        return this.e;
    }

    public static com.iab.omid.library.unity3d.internal.h c() {
        if (f == null) {
            f = new com.iab.omid.library.unity3d.internal.h(new com.iab.omid.library.unity3d.devicevolume.e(), new com.iab.omid.library.unity3d.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.c
    public void a(float f2) {
        this.f2464a = f2;
        java.util.Iterator<com.iab.omid.library.unity3d.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(android.content.Context context) {
        this.d = this.b.a(new android.os.Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z) {
        if (z) {
            com.iab.omid.library.unity3d.walking.TreeWalker.getInstance().h();
        } else {
            com.iab.omid.library.unity3d.walking.TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f2464a;
    }

    public void d() {
        com.iab.omid.library.unity3d.internal.b.g().a(this);
        com.iab.omid.library.unity3d.internal.b.g().e();
        com.iab.omid.library.unity3d.walking.TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        com.iab.omid.library.unity3d.walking.TreeWalker.getInstance().j();
        com.iab.omid.library.unity3d.internal.b.g().f();
        this.d.d();
    }
}
