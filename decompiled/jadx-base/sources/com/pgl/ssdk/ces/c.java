package com.pgl.ssdk.ces;

/* JADX INFO: loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3785a;
    private java.lang.String b;
    private java.util.Map<java.lang.String, java.lang.Object> c;

    public c(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f3785a = context;
        this.b = str;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(222, this.f3785a, new java.lang.Object[]{this.b, this.c});
            if (bArr == null || bArr.length <= 0 || android.text.TextUtils.isEmpty(com.pgl.ssdk.l0.a())) {
                return;
            }
            new com.pgl.ssdk.k0(this.f3785a, null).a(1, 2, bArr);
        } catch (java.lang.Throwable unused) {
        }
    }
}
