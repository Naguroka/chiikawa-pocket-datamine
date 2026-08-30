package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.bgtask.a f1857a;
    public final com.five_corp.ad.internal.time.a b;
    public final android.os.HandlerThread c;
    public final android.os.Handler d;
    public java.lang.Long e;

    public e(int i, com.five_corp.ad.internal.bgtask.a aVar, com.five_corp.ad.internal.time.a aVar2) {
        java.lang.String str = com.five_corp.ad.internal.bgtask.e.class.getName() + ":" + i;
        this.f1857a = aVar;
        this.b = aVar2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new android.os.Handler(handlerThread.getLooper());
        this.e = null;
    }

    public static void a(com.five_corp.ad.internal.bgtask.e eVar, boolean z) {
        com.five_corp.ad.internal.bgtask.h hVar;
        if (z) {
            eVar.e = null;
        }
        while (true) {
            eVar.b.getClass();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            com.five_corp.ad.internal.bgtask.a aVar = eVar.f1857a;
            synchronized (aVar.f1853a) {
                if (aVar.b.isEmpty()) {
                    hVar = null;
                } else {
                    com.five_corp.ad.internal.bgtask.g gVarA = aVar.a(jCurrentTimeMillis);
                    if (gVarA != null) {
                        hVar = new com.five_corp.ad.internal.bgtask.h(gVarA, 0L);
                    } else {
                        long jMin = ((com.five_corp.ad.internal.bgtask.g) aVar.b.get(0)).c;
                        java.util.Iterator it = aVar.b.iterator();
                        while (it.hasNext()) {
                            jMin = java.lang.Math.min(jMin, ((com.five_corp.ad.internal.bgtask.g) it.next()).c);
                        }
                        hVar = new com.five_corp.ad.internal.bgtask.h(null, jMin);
                    }
                }
            }
            if (hVar == null) {
                eVar.c.getId();
                return;
            }
            com.five_corp.ad.internal.bgtask.g gVar = hVar.f1859a;
            if (gVar == null) {
                long j = hVar.b;
                eVar.c.getId();
                java.lang.Long l = eVar.e;
                if (l != null && l.longValue() <= j) {
                    eVar.c.getId();
                    return;
                }
                eVar.c.getId();
                eVar.e = java.lang.Long.valueOf(j);
                eVar.d.postDelayed(new com.five_corp.ad.internal.bgtask.d(eVar), java.lang.Math.max(j - jCurrentTimeMillis, 0L));
                return;
            }
            eVar.c.getId();
            if (gVar.a() == 2) {
                int i = gVar.d;
                gVar.c = jCurrentTimeMillis + (60000 << i);
                gVar.d = i + 1;
                eVar.f1857a.a(gVar);
            }
        }
    }
}
