package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f1383a;
    private final android.os.Handler b;
    private final java.util.Set c = new java.util.HashSet();
    private final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f1383a.a("CountdownManager", "Stopping countdowns...");
        }
        this.d.incrementAndGet();
        this.b.removeCallbacksAndMessages(null);
    }

    public u4(android.os.Handler handler, com.applovin.impl.sdk.j jVar) {
        if (handler == null) {
            throw new java.lang.IllegalArgumentException("No handler specified.");
        }
        if (jVar != null) {
            this.b = handler;
            this.f1383a = jVar.I();
            return;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public void a(java.lang.String str, long j, com.applovin.impl.u4.b bVar) {
        if (j > 0) {
            if (this.b != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1383a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.c.add(new com.applovin.impl.u4.c(str, j, bVar));
                return;
            }
            throw new java.lang.IllegalArgumentException("No handler specified.");
        }
        throw new java.lang.IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.u4.c cVar, int i) {
        com.applovin.impl.u4.b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.d.get() == i) {
                try {
                    bVarA.a();
                    a(cVar, i);
                    return;
                } catch (java.lang.Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f1383a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f1383a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f1383a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1384a;
        private final com.applovin.impl.u4.b b;
        private final long c;

        public java.lang.String toString() {
            return "CountdownProxy{identifier='" + this.f1384a + "', countdownStepMillis=" + this.c + '}';
        }

        private c(java.lang.String str, long j, com.applovin.impl.u4.b bVar) {
            this.f1384a = str;
            this.c = j;
            this.b = bVar;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.u4.c)) {
                return false;
            }
            java.lang.String str = this.f1384a;
            java.lang.String str2 = ((com.applovin.impl.u4.c) obj).f1384a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            return str2 == null;
        }

        public int hashCode() {
            java.lang.String str = this.f1384a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String c() {
            return this.f1384a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.applovin.impl.u4.b a() {
            return this.b;
        }
    }

    public void b() {
        java.util.HashSet<com.applovin.impl.u4.c> hashSet = new java.util.HashSet(this.c);
        if (com.applovin.impl.sdk.n.a()) {
            this.f1383a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.d.incrementAndGet();
        for (com.applovin.impl.u4.c cVar : hashSet) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f1383a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    private void a(final com.applovin.impl.u4.c cVar, final int i) {
        this.b.postDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.u4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(cVar, i);
            }
        }, cVar.b());
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f1383a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.c.clear();
    }
}
