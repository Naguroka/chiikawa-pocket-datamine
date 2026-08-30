package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class k0 extends com.pgl.ssdk.m0 {
    private android.content.Context p;

    public k0(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.p = context;
        this.c = com.pgl.ssdk.l0.a() + b();
    }

    @Override // com.pgl.ssdk.m0
    public boolean a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    if (((java.lang.Integer) com.pgl.ssdk.ces.a.meta(223, null, bArr)).intValue() == 0) {
                        com.pgl.ssdk.ces.b.c = true;
                    } else {
                        com.pgl.ssdk.ces.b.c = false;
                    }
                }
            } catch (java.lang.Throwable unused) {
                com.pgl.ssdk.ces.b.c = false;
            }
        }
        return true;
    }

    public java.lang.String b() {
        return ((("?os=0&ver=6.4.0.0.overseas-rc.5&mode=1&app_ver=" + java.lang.String.valueOf(com.pgl.ssdk.z.g(this.p))) + "&region=" + com.pgl.ssdk.b0.a()) + "&did=" + com.pgl.ssdk.ces.b.e()) + "&aid=" + com.pgl.ssdk.ces.b.d();
    }
}
