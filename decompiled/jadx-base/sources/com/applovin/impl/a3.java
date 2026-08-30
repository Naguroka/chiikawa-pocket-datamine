package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class a3 implements com.applovin.impl.ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayDeque f577a = new java.util.ArrayDeque();
    private final java.util.ArrayDeque b;
    private final java.util.PriorityQueue c;
    private com.applovin.impl.a3.b d;
    private long e;
    private long f;

    @Override // com.applovin.impl.l5
    public void a() {
    }

    protected abstract void a(com.applovin.impl.rl rlVar);

    protected abstract com.applovin.impl.nl e();

    protected abstract boolean j();

    public a3() {
        for (int i = 0; i < 10; i++) {
            this.f577a.add(new com.applovin.impl.a3.b());
        }
        this.b = new java.util.ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new com.applovin.impl.a3.c(new com.applovin.impl.yg.a() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.yg.a
                public final void a(com.applovin.impl.yg ygVar) {
                    this.f$0.a((com.applovin.impl.sl) ygVar);
                }
            }));
        }
        this.c = new java.util.PriorityQueue();
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.rl d() {
        com.applovin.impl.b1.b(this.d == null);
        if (this.f577a.isEmpty()) {
            return null;
        }
        com.applovin.impl.a3.b bVar = (com.applovin.impl.a3.b) this.f577a.pollFirst();
        this.d = bVar;
        return bVar;
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sl c() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((com.applovin.impl.a3.b) com.applovin.impl.xp.a((com.applovin.impl.a3.b) this.c.peek())).f <= this.e) {
            com.applovin.impl.a3.b bVar = (com.applovin.impl.a3.b) com.applovin.impl.xp.a((com.applovin.impl.a3.b) this.c.poll());
            if (bVar.e()) {
                com.applovin.impl.sl slVar = (com.applovin.impl.sl) com.applovin.impl.xp.a((com.applovin.impl.sl) this.b.pollFirst());
                slVar.b(4);
                a(bVar);
                return slVar;
            }
            a((com.applovin.impl.rl) bVar);
            if (j()) {
                com.applovin.impl.nl nlVarE = e();
                com.applovin.impl.sl slVar2 = (com.applovin.impl.sl) com.applovin.impl.xp.a((com.applovin.impl.sl) this.b.pollFirst());
                slVar2.a(bVar.f, nlVarE, Long.MAX_VALUE);
                a(bVar);
                return slVar2;
            }
            a(bVar);
        }
        return null;
    }

    @Override // com.applovin.impl.l5
    public void b() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            a((com.applovin.impl.a3.b) com.applovin.impl.xp.a((com.applovin.impl.a3.b) this.c.poll()));
        }
        com.applovin.impl.a3.b bVar = this.d;
        if (bVar != null) {
            a(bVar);
            this.d = null;
        }
    }

    private void a(com.applovin.impl.a3.b bVar) {
        bVar.b();
        this.f577a.add(bVar);
    }

    protected final com.applovin.impl.sl h() {
        return (com.applovin.impl.sl) this.b.pollFirst();
    }

    protected final long i() {
        return this.e;
    }

    private static final class b extends com.applovin.impl.rl implements java.lang.Comparable {
        private long k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.a3.b bVar) {
            if (e() != bVar.e()) {
                return e() ? 1 : -1;
            }
            long j = this.f - bVar.f;
            if (j == 0) {
                j = this.k - bVar.k;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends com.applovin.impl.sl {
        private com.applovin.impl.yg.a g;

        public c(com.applovin.impl.yg.a aVar) {
            this.g = aVar;
        }

        @Override // com.applovin.impl.yg
        public final void g() {
            this.g.a(this);
        }
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.impl.rl rlVar) {
        com.applovin.impl.b1.a(rlVar == this.d);
        com.applovin.impl.a3.b bVar = (com.applovin.impl.a3.b) rlVar;
        if (bVar.d()) {
            a(bVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            bVar.k = j;
            this.c.add(bVar);
        }
        this.d = null;
    }

    protected void a(com.applovin.impl.sl slVar) {
        slVar.b();
        this.b.add(slVar);
    }

    @Override // com.applovin.impl.ol
    public void a(long j) {
        this.e = j;
    }
}
