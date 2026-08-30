package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.context.m f1784a;
    public final /* synthetic */ com.five_corp.ad.internal.ad_check.b b;
    public final /* synthetic */ com.five_corp.ad.internal.ad_check.c c;
    public final /* synthetic */ com.five_corp.ad.internal.G d;

    public F(com.five_corp.ad.internal.G g, com.five_corp.ad.internal.context.m mVar, com.five_corp.ad.internal.ad_check.b bVar, com.five_corp.ad.internal.ad_check.c cVar) {
        this.d = g;
        this.f1784a = mVar;
        this.b = bVar;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = com.five_corp.ad.internal.G.g;
            com.five_corp.ad.internal.context.m mVar = this.f1784a;
            mVar.c.f1896a.f1887a = true;
            com.five_corp.ad.internal.util.f fVarA = this.d.c.a(this.d.f1785a.b(mVar), "POST", this.d.f1785a.a(this.f1784a).toString(), "application/json;charset=utf-8");
            if (!fVarA.f2085a) {
                this.b.a(fVarA.b);
                return;
            }
            com.five_corp.ad.internal.http.c cVar = (com.five_corp.ad.internal.http.c) fVarA.c;
            int i2 = cVar.f1919a;
            if (i2 == 403) {
                this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.W, null, null, null));
                return;
            }
            if (i2 / 100 == 5) {
                this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.X, null, null, null));
                return;
            }
            if (i2 / 100 == 4) {
                this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Y, null, null, null));
                return;
            }
            java.lang.String strA = cVar.a();
            if (strA == null) {
                this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Z, null, null, null));
                return;
            }
            if (strA.isEmpty()) {
                this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.a0, null, null, null));
                return;
            }
            try {
                this.d.b.getClass();
                com.five_corp.ad.internal.ad_check.a aVarA = com.five_corp.ad.internal.l.a(strA);
                int iA = com.five_corp.ad.e.a(aVarA.f1837a);
                if (iA == 0) {
                    this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.T, null, null, null));
                } else if (iA == 1) {
                    this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.e0, null, null, null));
                } else {
                    if (iA != 2) {
                        return;
                    }
                    this.c.a((java.util.List) java.util.Objects.requireNonNull(aVarA.b));
                }
            } catch (com.five_corp.ad.internal.exception.b e) {
                int i3 = com.five_corp.ad.internal.G.g;
                e.toString();
                this.b.a(new com.five_corp.ad.internal.s(e.f1899a, null, e, null));
            } catch (org.json.JSONException e2) {
                int i4 = com.five_corp.ad.internal.G.g;
                e2.toString();
                this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.b0, null, e2, null));
            }
        } catch (java.lang.Exception e3) {
            int i5 = com.five_corp.ad.internal.G.g;
            e3.toString();
            android.util.Log.getStackTraceString(e3);
            this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.c0, null, e3, null));
        }
    }
}
