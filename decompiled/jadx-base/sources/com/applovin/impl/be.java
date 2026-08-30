package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface be {
    void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar);

    void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar, java.io.IOException iOException, boolean z);

    void a(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.td tdVar);

    void b(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar);

    void c(int i, com.applovin.impl.ae.a aVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f644a;
        public final com.applovin.impl.ae.a b;
        private final java.util.concurrent.CopyOnWriteArrayList c;
        private final long d;

        public a() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void a(android.os.Handler handler, com.applovin.impl.be beVar) {
            com.applovin.impl.b1.a(handler);
            com.applovin.impl.b1.a(beVar);
            this.c.add(new com.applovin.impl.be.a.C0032a(handler, beVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(com.applovin.impl.be beVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            beVar.b(this.f644a, this.b, mcVar, tdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.impl.be beVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            beVar.c(this.f644a, this.b, mcVar, tdVar);
        }

        private a(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i, com.applovin.impl.ae.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.f644a = i;
            this.b = aVar;
            this.d = j;
        }

        /* JADX INFO: renamed from: com.applovin.impl.be$a$a, reason: collision with other inner class name */
        private static final class C0032a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public android.os.Handler f645a;
            public com.applovin.impl.be b;

            public C0032a(android.os.Handler handler, com.applovin.impl.be beVar) {
                this.f645a = handler;
                this.b = beVar;
            }
        }

        public void c(com.applovin.impl.mc mcVar, int i, int i2, com.applovin.impl.e9 e9Var, int i3, java.lang.Object obj, long j, long j2) {
            c(mcVar, new com.applovin.impl.td(i, i2, e9Var, i3, obj, a(j), a(j2)));
        }

        public void b(com.applovin.impl.mc mcVar, int i, int i2, com.applovin.impl.e9 e9Var, int i3, java.lang.Object obj, long j, long j2) {
            b(mcVar, new com.applovin.impl.td(i, i2, e9Var, i3, obj, a(j), a(j2)));
        }

        private long a(long j) {
            long jB = com.applovin.impl.t2.b(j);
            return jB == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : this.d + jB;
        }

        public void c(final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar) {
            for (com.applovin.impl.be.a.C0032a c0032a : this.c) {
                final com.applovin.impl.be beVar = c0032a.b;
                com.applovin.impl.xp.a(c0032a.f645a, new java.lang.Runnable() { // from class: com.applovin.impl.be$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(beVar, mcVar, tdVar);
                    }
                });
            }
        }

        public void b(final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar) {
            for (com.applovin.impl.be.a.C0032a c0032a : this.c) {
                final com.applovin.impl.be beVar = c0032a.b;
                com.applovin.impl.xp.a(c0032a.f645a, new java.lang.Runnable() { // from class: com.applovin.impl.be$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(beVar, mcVar, tdVar);
                    }
                });
            }
        }

        public void a(int i, com.applovin.impl.e9 e9Var, int i2, java.lang.Object obj, long j) {
            a(new com.applovin.impl.td(1, i, e9Var, i2, obj, a(j), androidx.media3.common.C.TIME_UNSET));
        }

        public void a(final com.applovin.impl.td tdVar) {
            for (com.applovin.impl.be.a.C0032a c0032a : this.c) {
                final com.applovin.impl.be beVar = c0032a.b;
                com.applovin.impl.xp.a(c0032a.f645a, new java.lang.Runnable() { // from class: com.applovin.impl.be$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(beVar, tdVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.be beVar, com.applovin.impl.td tdVar) {
            beVar.a(this.f644a, this.b, tdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.be beVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar) {
            beVar.a(this.f644a, this.b, mcVar, tdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.be beVar, com.applovin.impl.mc mcVar, com.applovin.impl.td tdVar, java.io.IOException iOException, boolean z) {
            beVar.a(this.f644a, this.b, mcVar, tdVar, iOException, z);
        }

        public void a(com.applovin.impl.mc mcVar, int i, int i2, com.applovin.impl.e9 e9Var, int i3, java.lang.Object obj, long j, long j2) {
            a(mcVar, new com.applovin.impl.td(i, i2, e9Var, i3, obj, a(j), a(j2)));
        }

        public void a(final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar) {
            for (com.applovin.impl.be.a.C0032a c0032a : this.c) {
                final com.applovin.impl.be beVar = c0032a.b;
                com.applovin.impl.xp.a(c0032a.f645a, new java.lang.Runnable() { // from class: com.applovin.impl.be$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(beVar, mcVar, tdVar);
                    }
                });
            }
        }

        public void a(com.applovin.impl.mc mcVar, int i, int i2, com.applovin.impl.e9 e9Var, int i3, java.lang.Object obj, long j, long j2, java.io.IOException iOException, boolean z) {
            a(mcVar, new com.applovin.impl.td(i, i2, e9Var, i3, obj, a(j), a(j2)), iOException, z);
        }

        public void a(final com.applovin.impl.mc mcVar, final com.applovin.impl.td tdVar, final java.io.IOException iOException, final boolean z) {
            for (com.applovin.impl.be.a.C0032a c0032a : this.c) {
                final com.applovin.impl.be beVar = c0032a.b;
                com.applovin.impl.xp.a(c0032a.f645a, new java.lang.Runnable() { // from class: com.applovin.impl.be$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(beVar, mcVar, tdVar, iOException, z);
                    }
                });
            }
        }

        public void a(com.applovin.impl.be beVar) {
            for (com.applovin.impl.be.a.C0032a c0032a : this.c) {
                if (c0032a.b == beVar) {
                    this.c.remove(c0032a);
                }
            }
        }

        public com.applovin.impl.be.a a(int i, com.applovin.impl.ae.a aVar, long j) {
            return new com.applovin.impl.be.a(this.c, i, aVar, j);
        }
    }
}
