package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class c1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.pgl.ssdk.d1 f3781a;
    private final android.content.Context b;

    public c1(android.content.Context context, com.pgl.ssdk.d1 d1Var) {
        this.f3781a = d1Var;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String strB = com.pgl.ssdk.l0.b();
        try {
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.b, null);
            if (bArr == null || bArr.length <= 0) {
                com.pgl.ssdk.b1.f3779a = 501;
                return;
            }
            if (android.text.TextUtils.isEmpty(strB)) {
                return;
            }
            new com.pgl.ssdk.e1(this.b, null).a(1, 2, bArr);
            com.pgl.ssdk.d1 d1Var = this.f3781a;
            if (d1Var != null) {
                d1Var.a(com.pgl.ssdk.b1.a());
            }
        } catch (java.lang.Throwable unused) {
            com.pgl.ssdk.b1.f3779a = 501;
        }
    }
}
