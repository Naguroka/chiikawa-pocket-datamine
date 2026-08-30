package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.pgl.ssdk.z0<com.pgl.ssdk.x0> f3815a;
    private com.pgl.ssdk.a1 b;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final com.pgl.ssdk.w0 f3816a = new com.pgl.ssdk.w0();
    }

    public static com.pgl.ssdk.w0 a() {
        return com.pgl.ssdk.w0.b.f3816a;
    }

    public com.pgl.ssdk.a1 b() {
        if (this.b == null) {
            synchronized (com.pgl.ssdk.w0.class) {
                if (this.b == null) {
                    this.b = a("ssdk_net_handler");
                }
            }
        }
        return this.b;
    }

    public com.pgl.ssdk.a1 c() {
        if (this.b == null) {
            synchronized (com.pgl.ssdk.w0.class) {
                if (this.b == null) {
                    this.b = a("ssdk_handler");
                }
            }
        }
        return this.b;
    }

    private w0() {
        this.f3815a = com.pgl.ssdk.z0.a(2);
    }

    public com.pgl.ssdk.a1 a(java.lang.String str) {
        return b(null, str);
    }

    private com.pgl.ssdk.x0 a(com.pgl.ssdk.a1.a aVar, java.lang.String str) {
        if (com.pgl.ssdk.n0.b().a()) {
            return null;
        }
        try {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(str);
            handlerThread.start();
            return new com.pgl.ssdk.x0(handlerThread, aVar);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public com.pgl.ssdk.a1 b(com.pgl.ssdk.a1.a aVar, java.lang.String str) {
        com.pgl.ssdk.x0 x0Var = (com.pgl.ssdk.x0) this.f3815a.a();
        if (x0Var != null) {
            x0Var.a(aVar);
            x0Var.a(str);
            return x0Var;
        }
        return a(aVar, str);
    }
}
