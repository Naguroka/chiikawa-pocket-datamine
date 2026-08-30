package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class e1 extends com.pgl.ssdk.m0 {
    private android.content.Context p;

    public e1(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.p = context;
        this.c = com.pgl.ssdk.l0.b() + b();
    }

    @Override // com.pgl.ssdk.m0
    public boolean a(int i, byte[] bArr) {
        try {
            java.lang.Object objA = com.pgl.ssdk.b1.a(bArr);
            if ((objA instanceof java.lang.Integer) && ((java.lang.Integer) objA).intValue() == 0) {
                com.pgl.ssdk.b1.f3779a = 200;
                return true;
            }
            if (objA instanceof java.lang.String) {
                com.pgl.ssdk.b1.d = (java.lang.String) objA;
                com.pgl.ssdk.b1.f3779a = 200;
                return true;
            }
            return false;
        } catch (java.lang.Throwable unused) {
        }
    }

    public java.lang.String b() {
        return "?os=android&app_id=" + com.pgl.ssdk.b1.c + "&did=" + com.pgl.ssdk.ces.b.e() + "&app_ver=" + com.pgl.ssdk.z.g(this.p) + "&platform=android&ver=6.4.0.0.overseas-rc.5&mode=1";
    }
}
