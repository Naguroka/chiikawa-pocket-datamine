package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface y1 {
    com.applovin.impl.xo a();

    void a(android.os.Handler handler, com.applovin.impl.y1.a aVar);

    void a(com.applovin.impl.y1.a aVar);

    public interface a {
        void a(int i, long j, long j2);

        /* JADX INFO: renamed from: com.applovin.impl.y1$a$a, reason: collision with other inner class name */
        public static final class C0058a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.util.concurrent.CopyOnWriteArrayList f1525a = new java.util.concurrent.CopyOnWriteArrayList();

            public void a(android.os.Handler handler, com.applovin.impl.y1.a aVar) {
                com.applovin.impl.b1.a(handler);
                com.applovin.impl.b1.a(aVar);
                a(aVar);
                this.f1525a.add(new com.applovin.impl.y1.a.C0058a.C0059a(handler, aVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: com.applovin.impl.y1$a$a$a, reason: collision with other inner class name */
            static final class C0059a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final android.os.Handler f1526a;
                private final com.applovin.impl.y1.a b;
                private boolean c;

                public C0059a(android.os.Handler handler, com.applovin.impl.y1.a aVar) {
                    this.f1526a = handler;
                    this.b = aVar;
                }

                public void a() {
                    this.c = true;
                }
            }

            public void a(final int i, final long j, final long j2) {
                for (final com.applovin.impl.y1.a.C0058a.C0059a c0059a : this.f1525a) {
                    if (!c0059a.c) {
                        c0059a.f1526a.post(new java.lang.Runnable() { // from class: com.applovin.impl.y1$a$a$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.applovin.impl.y1.a.C0058a.a(c0059a, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(com.applovin.impl.y1.a.C0058a.C0059a c0059a, int i, long j, long j2) {
                c0059a.b.a(i, j, j2);
            }

            public void a(com.applovin.impl.y1.a aVar) {
                for (com.applovin.impl.y1.a.C0058a.C0059a c0059a : this.f1525a) {
                    if (c0059a.b == aVar) {
                        c0059a.a();
                        this.f1525a.remove(c0059a);
                    }
                }
            }
        }
    }
}
