package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.l3 f817a;
    private final com.applovin.impl.ia b;
    private final com.applovin.impl.gc.b c;
    private final java.util.concurrent.CopyOnWriteArraySet d;
    private final java.util.ArrayDeque e;
    private final java.util.ArrayDeque f;
    private boolean g;

    public interface a {
        void a(java.lang.Object obj);
    }

    public interface b {
        void a(java.lang.Object obj, com.applovin.impl.a9 a9Var);
    }

    public gc(android.os.Looper looper, com.applovin.impl.l3 l3Var, com.applovin.impl.gc.b bVar) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, l3Var, bVar);
    }

    public void a(java.lang.Object obj) {
        if (this.g) {
            return;
        }
        com.applovin.impl.b1.a(obj);
        this.d.add(new com.applovin.impl.gc.c(obj));
    }

    private gc(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, com.applovin.impl.l3 l3Var, com.applovin.impl.gc.b bVar) {
        this.f817a = l3Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.e = new java.util.ArrayDeque();
        this.f = new java.util.ArrayDeque();
        this.b = l3Var.a(looper, new android.os.Handler.Callback() { // from class: com.applovin.impl.gc$$ExternalSyntheticLambda1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.a(message);
            }
        });
    }

    public void b() {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.gc.c) it.next()).b(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f818a;
        private com.applovin.impl.a9.b b = new com.applovin.impl.a9.b();
        private boolean c;
        private boolean d;

        public c(java.lang.Object obj) {
            this.f818a = obj;
        }

        public void b(com.applovin.impl.gc.b bVar) {
            this.d = true;
            if (this.c) {
                bVar.a(this.f818a, this.b.a());
            }
        }

        public void a(int i, com.applovin.impl.gc.a aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.a(this.f818a);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.gc.c.class != obj.getClass()) {
                return false;
            }
            return this.f818a.equals(((com.applovin.impl.gc.c) obj).f818a);
        }

        public int hashCode() {
            return this.f818a.hashCode();
        }

        public void a(com.applovin.impl.gc.b bVar) {
            if (this.d || !this.c) {
                return;
            }
            com.applovin.impl.a9 a9VarA = this.b.a();
            this.b = new com.applovin.impl.a9.b();
            this.c = false;
            bVar.a(this.f818a, a9VarA);
        }
    }

    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a(0)) {
            com.applovin.impl.ia iaVar = this.b;
            iaVar.a(iaVar.d(0));
        }
        boolean z = !this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (z) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((java.lang.Runnable) this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public void b(java.lang.Object obj) {
        for (com.applovin.impl.gc.c cVar : this.d) {
            if (cVar.f818a.equals(obj)) {
                cVar.b(this.c);
                this.d.remove(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(android.os.Message message) {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.gc.c) it.next()).a(this.c);
            if (this.b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public void b(int i, com.applovin.impl.gc.a aVar) {
        a(i, aVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, int i, com.applovin.impl.gc.a aVar) {
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.gc.c) it.next()).a(i, aVar);
        }
    }

    public void a(final int i, final com.applovin.impl.gc.a aVar) {
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.d);
        this.f.add(new java.lang.Runnable() { // from class: com.applovin.impl.gc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.gc.a(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public com.applovin.impl.gc a(android.os.Looper looper, com.applovin.impl.gc.b bVar) {
        return new com.applovin.impl.gc(this.d, looper, this.f817a, bVar);
    }
}
