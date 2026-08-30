package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements com.five_corp.ad.internal.cache.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.time.a f1895a;
    public final com.five_corp.ad.internal.tracking_data.b b;
    public final long c;
    public final android.os.Handler d;
    public java.util.ArrayList e;
    public com.five_corp.ad.internal.media_config.a f;

    public s(com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.tracking_data.b bVar) {
        this(aVar, bVar, 0);
    }

    public final void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.context.p pVar : this.e) {
            long j = pVar.b;
            this.f1895a.getClass();
            if (j < java.lang.System.currentTimeMillis()) {
                pVar.d.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.J5, null, null, null));
            } else {
                arrayList.add(pVar);
            }
        }
        this.e = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.postDelayed(new com.five_corp.ad.internal.context.s$$ExternalSyntheticLambda1(this), this.c);
    }

    public final void b(com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.context.q qVar, long j, com.five_corp.ad.internal.context.r rVar) {
        com.five_corp.ad.internal.context.t tVar;
        com.five_corp.ad.internal.tracking_data.a aVarA = this.b.a();
        com.five_corp.ad.internal.media_config.a aVar = this.f;
        if (aVar == null) {
            tVar = null;
            break;
        }
        java.util.Iterator it = aVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                tVar = null;
                break;
            }
            com.five_corp.ad.internal.media_config.c cVar = (com.five_corp.ad.internal.media_config.c) it.next();
            if (cVar.f1951a.equals(iVar.c)) {
                tVar = new com.five_corp.ad.internal.context.t(iVar, this.f, cVar, aVarA);
                break;
            }
        }
        if (tVar != null) {
            qVar.a(tVar);
            return;
        }
        if (this.e.isEmpty()) {
            this.d.postDelayed(new com.five_corp.ad.internal.context.s$$ExternalSyntheticLambda1(this), this.c);
        }
        java.util.ArrayList arrayList = this.e;
        this.f1895a.getClass();
        arrayList.add(new com.five_corp.ad.internal.context.p(iVar, qVar, java.lang.System.currentTimeMillis() + j, rVar));
    }

    public s(com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.tracking_data.b bVar, int i) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("signal collector worker thread");
        handlerThread.start();
        this.f1895a = aVar;
        this.b = bVar;
        this.c = 1000L;
        this.d = new android.os.Handler(handlerThread.getLooper());
        this.e = new java.util.ArrayList();
        this.f = null;
    }

    public final void b(com.five_corp.ad.internal.cache.x xVar) {
        com.five_corp.ad.internal.context.t tVar;
        this.f = xVar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.context.p pVar : this.e) {
            com.five_corp.ad.internal.context.i iVar = pVar.f1894a;
            com.five_corp.ad.internal.tracking_data.a aVarA = this.b.a();
            com.five_corp.ad.internal.media_config.a aVar = this.f;
            if (aVar == null) {
                tVar = null;
                break;
            }
            java.util.Iterator it = aVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    tVar = null;
                    break;
                }
                com.five_corp.ad.internal.media_config.c cVar = (com.five_corp.ad.internal.media_config.c) it.next();
                if (cVar.f1951a.equals(iVar.c)) {
                    tVar = new com.five_corp.ad.internal.context.t(iVar, this.f, cVar, aVarA);
                    break;
                }
            }
            if (tVar != null) {
                pVar.c.a(tVar);
            } else {
                arrayList.add(pVar);
            }
        }
        this.e = arrayList;
    }

    public final void a(final com.five_corp.ad.internal.context.i iVar, final com.five_corp.ad.internal.context.q qVar, final long j, final com.five_corp.ad.internal.context.r rVar) {
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.context.s$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(iVar, qVar, j, rVar);
            }
        });
    }

    @Override // com.five_corp.ad.internal.cache.y
    public final void a(final com.five_corp.ad.internal.cache.x xVar) {
        this.d.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.context.s$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(xVar);
            }
        });
    }
}
