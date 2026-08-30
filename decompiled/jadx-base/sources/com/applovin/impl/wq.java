package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface wq {
    void a(int i, long j);

    void a(long j, int i);

    default void a(com.applovin.impl.e9 e9Var) {
    }

    void a(com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var);

    void a(com.applovin.impl.xq xqVar);

    void a(java.lang.Object obj, long j);

    void a(java.lang.String str);

    void b(com.applovin.impl.m5 m5Var);

    void b(java.lang.Exception exc);

    void b(java.lang.String str, long j, long j2);

    void d(com.applovin.impl.m5 m5Var);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.os.Handler f1478a;
        private final com.applovin.impl.wq b;

        public a(android.os.Handler handler, com.applovin.impl.wq wqVar) {
            this.f1478a = wqVar != null ? (android.os.Handler) com.applovin.impl.b1.a(handler) : null;
            this.b = wqVar;
        }

        public void b(final com.applovin.impl.m5 m5Var) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(m5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.impl.m5 m5Var) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).d(m5Var);
        }

        public void a(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(com.applovin.impl.m5 m5Var) {
            m5Var.a();
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).b(m5Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(java.lang.String str, long j, long j2) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).b(str, j, j2);
        }

        public void a(final java.lang.String str) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(java.lang.String str) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(str);
        }

        public void a(final com.applovin.impl.m5 m5Var) {
            m5Var.a();
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(m5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(i, j);
        }

        public void a(final int i, final long j) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(i, j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(e9Var);
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(e9Var, p5Var);
        }

        public void a(final com.applovin.impl.e9 e9Var, final com.applovin.impl.p5 p5Var) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(e9Var, p5Var);
                    }
                });
            }
        }

        public void b(final long j, final int i) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(j, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(java.lang.Object obj, long j) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(obj, j);
        }

        public void b(final java.lang.Exception exc) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j, int i) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(j, i);
        }

        public void b(final com.applovin.impl.xq xqVar) {
            android.os.Handler handler = this.f1478a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(xqVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(java.lang.Exception exc) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.xq xqVar) {
            ((com.applovin.impl.wq) com.applovin.impl.xp.a(this.b)).a(xqVar);
        }

        public void a(final java.lang.Object obj) {
            if (this.f1478a != null) {
                final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                this.f1478a.post(new java.lang.Runnable() { // from class: com.applovin.impl.wq$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(obj, jElapsedRealtime);
                    }
                });
            }
        }
    }
}
