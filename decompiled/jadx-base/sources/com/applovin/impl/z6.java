package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface z6 {
    void a(int i, com.applovin.impl.ae.a aVar);

    void a(int i, com.applovin.impl.ae.a aVar, int i2);

    void a(int i, com.applovin.impl.ae.a aVar, java.lang.Exception exc);

    void b(int i, com.applovin.impl.ae.a aVar);

    void c(int i, com.applovin.impl.ae.a aVar);

    void d(int i, com.applovin.impl.ae.a aVar);

    default void e(int i, com.applovin.impl.ae.a aVar) {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1563a;
        public final com.applovin.impl.ae.a b;
        private final java.util.concurrent.CopyOnWriteArrayList c;

        public a() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
        }

        public void a(android.os.Handler handler, com.applovin.impl.z6 z6Var) {
            com.applovin.impl.b1.a(handler);
            com.applovin.impl.b1.a(z6Var);
            this.c.add(new com.applovin.impl.z6.a.C0062a(handler, z6Var));
        }

        public void e(com.applovin.impl.z6 z6Var) {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                if (c0062a.b == z6Var) {
                    this.c.remove(c0062a);
                }
            }
        }

        public void c() {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                final com.applovin.impl.z6 z6Var = c0062a.b;
                com.applovin.impl.xp.a(c0062a.f1564a, new java.lang.Runnable() { // from class: com.applovin.impl.z6$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(z6Var);
                    }
                });
            }
        }

        public void b() {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                final com.applovin.impl.z6 z6Var = c0062a.b;
                com.applovin.impl.xp.a(c0062a.f1564a, new java.lang.Runnable() { // from class: com.applovin.impl.z6$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(z6Var);
                    }
                });
            }
        }

        public void d() {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                final com.applovin.impl.z6 z6Var = c0062a.b;
                com.applovin.impl.xp.a(c0062a.f1564a, new java.lang.Runnable() { // from class: com.applovin.impl.z6$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(z6Var);
                    }
                });
            }
        }

        private a(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i, com.applovin.impl.ae.a aVar) {
            this.c = copyOnWriteArrayList;
            this.f1563a = i;
            this.b = aVar;
        }

        /* JADX INFO: renamed from: com.applovin.impl.z6$a$a, reason: collision with other inner class name */
        private static final class C0062a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public android.os.Handler f1564a;
            public com.applovin.impl.z6 b;

            public C0062a(android.os.Handler handler, com.applovin.impl.z6 z6Var) {
                this.f1564a = handler;
                this.b = z6Var;
            }
        }

        public void a() {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                final com.applovin.impl.z6 z6Var = c0062a.b;
                com.applovin.impl.xp.a(c0062a.f1564a, new java.lang.Runnable() { // from class: com.applovin.impl.z6$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(z6Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(com.applovin.impl.z6 z6Var) {
            z6Var.c(this.f1563a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.impl.z6 z6Var) {
            z6Var.a(this.f1563a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.impl.z6 z6Var) {
            z6Var.b(this.f1563a, this.b);
        }

        public void a(final int i) {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                final com.applovin.impl.z6 z6Var = c0062a.b;
                com.applovin.impl.xp.a(c0062a.f1564a, new java.lang.Runnable() { // from class: com.applovin.impl.z6$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(z6Var, i);
                    }
                });
            }
        }

        public void a(final java.lang.Exception exc) {
            for (com.applovin.impl.z6.a.C0062a c0062a : this.c) {
                final com.applovin.impl.z6 z6Var = c0062a.b;
                com.applovin.impl.xp.a(c0062a.f1564a, new java.lang.Runnable() { // from class: com.applovin.impl.z6$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(z6Var, exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.z6 z6Var) {
            z6Var.d(this.f1563a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.z6 z6Var, int i) {
            z6Var.e(this.f1563a, this.b);
            z6Var.a(this.f1563a, this.b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.z6 z6Var, java.lang.Exception exc) {
            z6Var.a(this.f1563a, this.b, exc);
        }

        public com.applovin.impl.z6.a a(int i, com.applovin.impl.ae.a aVar) {
            return new com.applovin.impl.z6.a(this.c, i, aVar);
        }
    }
}
