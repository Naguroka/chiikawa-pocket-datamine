package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 implements com.applovin.impl.ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.b5 f845a = new com.applovin.impl.b5();
    private final com.applovin.impl.rl b = new com.applovin.impl.rl();
    private final java.util.Deque c = new java.util.ArrayDeque();
    private int d;
    private boolean e;

    @Override // com.applovin.impl.ol
    public void a(long j) {
    }

    public h8() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new com.applovin.impl.fk(new com.applovin.impl.yg.a() { // from class: com.applovin.impl.h8$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.yg.a
                public final void a(com.applovin.impl.yg ygVar) {
                    this.f$0.a((com.applovin.impl.sl) ygVar);
                }
            }));
        }
        this.d = 0;
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.rl d() {
        com.applovin.impl.b1.b(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // com.applovin.impl.l5
    public void a(com.applovin.impl.rl rlVar) {
        com.applovin.impl.b1.b(!this.e);
        com.applovin.impl.b1.b(this.d == 1);
        com.applovin.impl.b1.a(this.b == rlVar);
        this.d = 2;
    }

    @Override // com.applovin.impl.l5
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sl c() {
        com.applovin.impl.b1.b(!this.e);
        if (this.d != 2 || this.c.isEmpty()) {
            return null;
        }
        com.applovin.impl.sl slVar = (com.applovin.impl.sl) this.c.removeFirst();
        if (this.b.e()) {
            slVar.b(4);
        } else {
            com.applovin.impl.rl rlVar = this.b;
            slVar.a(this.b.f, new com.applovin.impl.h8.a(rlVar.f, this.f845a.a(((java.nio.ByteBuffer) com.applovin.impl.b1.a(rlVar.c)).array())), 0L);
        }
        this.b.b();
        this.d = 0;
        return slVar;
    }

    @Override // com.applovin.impl.l5
    public void b() {
        com.applovin.impl.b1.b(!this.e);
        this.b.b();
        this.d = 0;
    }

    private static final class a implements com.applovin.impl.nl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f846a;
        private final com.applovin.impl.db b;

        @Override // com.applovin.impl.nl
        public int a() {
            return 1;
        }

        public a(long j, com.applovin.impl.db dbVar) {
            this.f846a = j;
            this.b = dbVar;
        }

        @Override // com.applovin.impl.nl
        public long a(int i) {
            com.applovin.impl.b1.a(i == 0);
            return this.f846a;
        }

        @Override // com.applovin.impl.nl
        public java.util.List b(long j) {
            return j >= this.f846a ? this.b : com.applovin.impl.db.h();
        }

        @Override // com.applovin.impl.nl
        public int a(long j) {
            return this.f846a > j ? 0 : -1;
        }
    }

    @Override // com.applovin.impl.l5
    public void a() {
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sl slVar) {
        com.applovin.impl.b1.b(this.c.size() < 2);
        com.applovin.impl.b1.a(!this.c.contains(slVar));
        slVar.b();
        this.c.addFirst(slVar);
    }
}
