package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements androidx.lifecycle.DefaultLifecycleObserver {
    public boolean b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.util.h f2066a = new com.five_corp.ad.internal.util.h();

    public final void a(com.five_corp.ad.internal.o oVar) {
        this.f2066a.f2086a.add(new java.lang.ref.WeakReference(oVar));
        if (this.b) {
            if (oVar.c) {
                return;
            }
            oVar.c = true;
            if (oVar.b) {
                ((com.five_corp.ad.f) oVar.f2042a).m();
                return;
            }
            return;
        }
        boolean z = oVar.b && oVar.c;
        if (oVar.c) {
            oVar.c = false;
            if (z) {
                ((com.five_corp.ad.f) oVar.f2042a).n();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        this.b = false;
        com.five_corp.ad.internal.util.h hVar = this.f2066a;
        hVar.getClass();
        java.util.ArrayList<com.five_corp.ad.internal.o> arrayList = new java.util.ArrayList();
        hVar.a((java.util.AbstractCollection) arrayList);
        for (com.five_corp.ad.internal.o oVar : arrayList) {
            boolean z = oVar.b && oVar.c;
            if (oVar.c) {
                oVar.c = false;
                if (z) {
                    ((com.five_corp.ad.f) oVar.f2042a).n();
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        this.b = true;
        com.five_corp.ad.internal.util.h hVar = this.f2066a;
        hVar.getClass();
        java.util.ArrayList<com.five_corp.ad.internal.o> arrayList = new java.util.ArrayList();
        hVar.a((java.util.AbstractCollection) arrayList);
        for (com.five_corp.ad.internal.o oVar : arrayList) {
            if (!oVar.c) {
                oVar.c = true;
                if (oVar.b) {
                    ((com.five_corp.ad.f) oVar.f2042a).m();
                }
            }
        }
    }

    public static com.five_corp.ad.internal.system.b a() {
        com.five_corp.ad.internal.system.b bVar = new com.five_corp.ad.internal.system.b();
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.five_corp.ad.internal.system.a(bVar));
        return bVar;
    }
}
