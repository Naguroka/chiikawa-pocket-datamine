package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements com.five_corp.ad.internal.cache.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.cache.o f1869a;
    public final java.lang.String b;
    public final android.os.Handler c;
    public final java.lang.Object d = new java.lang.Object();
    public boolean e = false;
    public java.lang.ref.WeakReference f = null;
    public com.five_corp.ad.internal.util.h g = new com.five_corp.ad.internal.util.h();

    public i(com.five_corp.ad.internal.cache.o oVar, java.lang.String str, android.os.Handler handler) {
        this.f1869a = oVar;
        this.b = str;
        this.c = handler;
    }

    public final void a(com.five_corp.ad.internal.cache.e eVar) {
        synchronized (this.d) {
            if (this.e) {
                this.g.f2086a.add(new java.lang.ref.WeakReference(eVar));
                return;
            }
            java.lang.ref.WeakReference weakReference = this.f;
            android.graphics.Bitmap bitmap = weakReference != null ? (android.graphics.Bitmap) weakReference.get() : null;
            if (bitmap == null) {
                this.g.f2086a.add(new java.lang.ref.WeakReference(eVar));
                this.f = null;
                this.e = true;
            }
            if (bitmap != null) {
                this.c.post(new com.five_corp.ad.internal.cache.h(eVar, bitmap));
            } else {
                this.f1869a.a(this);
            }
        }
    }

    public final void b(com.five_corp.ad.internal.s sVar) {
        java.util.ArrayList arrayList;
        synchronized (this.d) {
            this.e = false;
            com.five_corp.ad.internal.util.h hVar = this.g;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
            this.g = new com.five_corp.ad.internal.util.h();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.post(new com.five_corp.ad.internal.cache.g((com.five_corp.ad.internal.cache.e) it.next(), sVar));
        }
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(com.five_corp.ad.internal.s sVar) {
        b(sVar);
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(java.lang.String str) {
        com.five_corp.ad.internal.util.f fVar;
        java.util.ArrayList arrayList;
        try {
            android.graphics.Bitmap bitmapDecodeFile = android.graphics.BitmapFactory.decodeFile(str);
            if (bitmapDecodeFile == null) {
                fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.L, "BitmapFactory.decodeFile return null: URL: " + this.b + ".", null, null), null);
            } else {
                fVar = new com.five_corp.ad.internal.util.f(true, null, bitmapDecodeFile);
            }
        } catch (java.lang.OutOfMemoryError e) {
            fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.M, "BitmapFactory.decodeFile raise OutOfMemoryError: URL: " + this.b + ".", e, null), null);
        }
        if (!fVar.f2085a) {
            b(fVar.b);
            return;
        }
        synchronized (this.d) {
            this.e = false;
            this.f = new java.lang.ref.WeakReference((android.graphics.Bitmap) fVar.c);
            com.five_corp.ad.internal.util.h hVar = this.g;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
            this.g = new com.five_corp.ad.internal.util.h();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.post(new com.five_corp.ad.internal.cache.h((com.five_corp.ad.internal.cache.e) it.next(), (android.graphics.Bitmap) fVar.c));
        }
    }
}
