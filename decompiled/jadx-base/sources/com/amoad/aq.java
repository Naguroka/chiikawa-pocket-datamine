package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class aq {
    private static final java.lang.String h = "aq";
    final android.content.Context c;
    final java.lang.String d;
    int e;
    int f;
    boolean g;
    private boolean i;
    private boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.util.concurrent.ConcurrentLinkedQueue<com.amoad.i> f233a = new java.util.concurrent.ConcurrentLinkedQueue<>();
    final java.util.concurrent.ExecutorService b = java.util.concurrent.Executors.newSingleThreadExecutor();
    private int k = 1;
    private int l = 1;
    private int m = 0;

    aq(android.content.Context context, java.lang.String str) {
        this.d = str;
        this.c = context.getApplicationContext();
    }

    static java.util.concurrent.ConcurrentLinkedQueue<com.amoad.i> a(long j, java.util.concurrent.ConcurrentLinkedQueue<com.amoad.i> concurrentLinkedQueue) {
        java.util.concurrent.ConcurrentLinkedQueue<com.amoad.i> concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue<>();
        for (com.amoad.i iVar : concurrentLinkedQueue) {
            if (iVar.m > j) {
                concurrentLinkedQueue2.add(iVar);
            }
        }
        return concurrentLinkedQueue2;
    }

    private void a(java.util.List<com.amoad.i> list) {
        this.f233a.addAll(list);
        boolean z = this.i;
        boolean z2 = this.j;
        if (z || z2) {
            com.amoad.t tVarA = com.amoad.t.a(this.c);
            for (com.amoad.i iVar : list) {
                if (!android.text.TextUtils.isEmpty(iVar.t)) {
                    tVarA.a(new com.amoad.af(null, iVar.t, null));
                }
                if (!android.text.TextUtils.isEmpty(iVar.u)) {
                    tVarA.a(new com.amoad.af(null, iVar.u, null));
                }
                if (z) {
                    tVarA.a(new com.amoad.af(null, iVar.g, null));
                }
                if (z2) {
                    if (!android.text.TextUtils.isEmpty(iVar.h)) {
                        tVarA.a(new com.amoad.af(null, iVar.h, null));
                    }
                    if (!android.text.TextUtils.isEmpty(iVar.v)) {
                        com.amoad.bh.a(this.c).a(new com.amoad.bi(null, iVar.v, null));
                    }
                }
            }
        }
    }

    static /* synthetic */ com.amoad.AMoAdNativeListener.Result b(com.amoad.aq aqVar) {
        android.content.Context context = aqVar.c;
        com.amoad.c cVarB = com.amoad.p.b(context);
        com.amoad.ak akVar = new com.amoad.ak(context, aqVar.d, cVarB.b, cVarB.f299a, cVarB.c || com.amoad.j.a(aqVar.c).b, aqVar.l);
        java.lang.String strA = akVar.a();
        com.amoad.AMoAdLogger.getInstance().i(java.text.MessageFormat.format("request ad sending(url={0})", strA));
        com.amoad.s.c cVarA = com.amoad.s.a(akVar);
        if (!(cVarA instanceof com.amoad.al)) {
            if (cVarA instanceof com.amoad.s.a) {
                return com.amoad.AMoAdNativeListener.Result.Empty;
            }
            com.amoad.AMoAdLogger.getInstance().i(java.text.MessageFormat.format("request ad sending...failure(url={0})", strA));
            return com.amoad.AMoAdNativeListener.Result.Failure;
        }
        com.amoad.AMoAdLogger.getInstance().i(java.text.MessageFormat.format("request ad sending...success(url={0})", strA));
        com.amoad.al alVar = (com.amoad.al) cVarA;
        aqVar.k = alVar.h;
        if (aqVar.l == 1) {
            aqVar.l = alVar.i;
        }
        if (b(alVar.e) && c(alVar.d)) {
            com.amoad.k.a(aqVar.c, aqVar.d, alVar.e);
            com.amoad.k.c(aqVar.c, aqVar.d, alVar.d);
        }
        android.content.Context context2 = aqVar.c;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + (alVar.j * 1000);
        int i = alVar.g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.amoad.al.a> it = alVar.l.iterator();
        while (it.hasNext()) {
            com.amoad.b bVar = alVar.k;
            com.amoad.al alVar2 = alVar;
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new com.amoad.i(context2, it.next(), cVarB, i, jCurrentTimeMillis, bVar));
            arrayList = arrayList2;
            context2 = context2;
            alVar = alVar2;
        }
        aqVar.a(arrayList);
        return aqVar.f233a.isEmpty() ? com.amoad.AMoAdNativeListener.Result.Failure : com.amoad.AMoAdNativeListener.Result.Success;
    }

    private void b() {
        com.amoad.bc.a(this.b, new java.lang.Runnable() { // from class: com.amoad.aq.2
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.aq.b(com.amoad.aq.this);
            }
        });
    }

    private static boolean b(int i) {
        return (i >= 0 && i <= 1024) || i == -9;
    }

    private static boolean c(int i) {
        return (i >= 2 && i <= 1024) || i == 0;
    }

    static /* synthetic */ boolean c(com.amoad.aq aqVar) {
        int i = aqVar.l;
        if (i > 1) {
            return aqVar.f233a.size() < aqVar.k * (i - 1);
        }
        return false;
    }

    final synchronized int a() {
        int i;
        int i2 = this.m;
        if (i2 >= Integer.MAX_VALUE) {
            this.m = i2 % this.k;
        }
        i = this.m;
        this.m = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.amoad.i a(int i) {
        com.amoad.i iVarPoll;
        if (i % this.k != 0) {
            return this.f233a.poll();
        }
        do {
            iVarPoll = this.f233a.poll();
            if (iVarPoll == null) {
                return null;
            }
        } while (iVarPoll.q != 0);
        return iVarPoll;
    }

    final void a(int i, int i2, boolean z, boolean z2) {
        if (!b(i)) {
            throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("広告の開始位置は0~1024の値を入れてください。(beginIndex={0})", java.lang.Integer.valueOf(i)));
        }
        if (!c(i2)) {
            throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("広告の表示間隔は0または、2~1024の値を入れてください。(interval={0})", java.lang.Integer.valueOf(i2)));
        }
        this.e = com.amoad.k.b(this.c, this.d, i);
        this.f = com.amoad.k.d(this.c, this.d, i2);
        this.i = z;
        this.j = z2;
        if (this.g) {
            return;
        }
        this.g = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final com.amoad.i iVar, final com.amoad.AMoAdNativeListener.Result result, final com.amoad.av avVar) {
        if (avVar != null) {
            com.amoad.bc.a(this.c, new java.lang.Runnable() { // from class: com.amoad.aq.1
                @Override // java.lang.Runnable
                public final void run() {
                    avVar.a(com.amoad.aq.this.d, result, iVar);
                }
            });
        }
    }
}
