package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface q1 {
    void a(long j);

    void a(com.applovin.impl.m5 m5Var);

    void a(java.lang.Exception exc);

    void a(java.lang.String str, long j, long j2);

    void a(boolean z);

    void b(int i, long j, long j2);

    default void b(com.applovin.impl.e9 e9Var) {
    }

    void b(com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var);

    void b(java.lang.String str);

    void c(com.applovin.impl.m5 m5Var);

    void c(java.lang.Exception exc);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.os.Handler f1170a;
        private final com.applovin.impl.q1 b;

        public a(android.os.Handler handler, com.applovin.impl.q1 q1Var) {
            this.f1170a = q1Var != null ? (android.os.Handler) com.applovin.impl.b1.a(handler) : null;
            this.b = q1Var;
        }

        public void b(final java.lang.Exception exc) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(java.lang.Exception exc) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).a(exc);
        }

        public void a(final java.lang.Exception exc) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(java.lang.Exception exc) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).c(exc);
        }

        public void b(final com.applovin.impl.m5 m5Var) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(m5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.impl.m5 m5Var) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).a(m5Var);
        }

        public void a(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda0
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
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).c(m5Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(java.lang.String str, long j, long j2) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).a(str, j, j2);
        }

        public void a(final java.lang.String str) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(java.lang.String str) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).b(str);
        }

        public void a(final com.applovin.impl.m5 m5Var) {
            m5Var.a();
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(m5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.impl.e9 e9Var, com.applovin.impl.p5 p5Var) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).b(e9Var);
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).b(e9Var, p5Var);
        }

        public void a(final com.applovin.impl.e9 e9Var, final com.applovin.impl.p5 p5Var) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(e9Var, p5Var);
                    }
                });
            }
        }

        public void b(final long j) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).a(j);
        }

        public void b(final boolean z) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).a(z);
        }

        public void b(final int i, final long j, final long j2) {
            android.os.Handler handler = this.f1170a;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.q1$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(i, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, long j, long j2) {
            ((com.applovin.impl.q1) com.applovin.impl.xp.a(this.b)).b(i, j, j2);
        }
    }
}
