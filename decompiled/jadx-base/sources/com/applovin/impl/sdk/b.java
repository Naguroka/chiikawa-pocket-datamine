package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1282a;
    private final java.lang.ref.WeakReference b;
    private final java.lang.ref.WeakReference c;
    private com.applovin.impl.go d;

    public static com.applovin.impl.sdk.b a(com.applovin.impl.i8 i8Var, com.applovin.impl.sdk.a.InterfaceC0051a interfaceC0051a, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.sdk.b bVar = new com.applovin.impl.sdk.b(i8Var, interfaceC0051a, jVar);
        bVar.a(i8Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f1282a.f().a(this);
    }

    public void d() {
        a();
        com.applovin.impl.i8 i8VarB = b();
        if (i8VarB == null) {
            return;
        }
        i8VarB.setExpired();
        com.applovin.impl.sdk.a.InterfaceC0051a interfaceC0051a = (com.applovin.impl.sdk.a.InterfaceC0051a) this.c.get();
        if (interfaceC0051a == null) {
            return;
        }
        interfaceC0051a.onAdExpired(i8VarB);
    }

    public void a(long j) {
        a();
        if (((java.lang.Boolean) this.f1282a.a(com.applovin.impl.sj.c1)).booleanValue() || !this.f1282a.e0().isApplicationPaused()) {
            this.d = com.applovin.impl.go.a(j, this.f1282a, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }
    }

    public void a() {
        com.applovin.impl.go goVar = this.d;
        if (goVar != null) {
            goVar.a();
            this.d = null;
        }
    }

    private b(com.applovin.impl.i8 i8Var, com.applovin.impl.sdk.a.InterfaceC0051a interfaceC0051a, com.applovin.impl.sdk.j jVar) {
        this.b = new java.lang.ref.WeakReference(i8Var);
        this.c = new java.lang.ref.WeakReference(interfaceC0051a);
        this.f1282a = jVar;
    }

    public com.applovin.impl.i8 b() {
        return (com.applovin.impl.i8) this.b.get();
    }
}
