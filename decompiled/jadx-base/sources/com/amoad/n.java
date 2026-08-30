package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class n {
    private static com.amoad.n b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Map<java.lang.String, com.amoad.m> f322a = new java.util.HashMap();

    private n() {
    }

    public static final synchronized com.amoad.n a() {
        if (b == null) {
            b = new com.amoad.n();
        }
        return b;
    }

    public final synchronized void a(android.content.Context context, java.lang.String str, com.amoad.AMoAdView aMoAdView) {
        com.amoad.m mVar = this.f322a.get(str);
        if (mVar == null) {
            mVar = new com.amoad.m(context.getApplicationContext(), str, aMoAdView.getmNetworkTimeoutMillis(), new com.amoad.m.a() { // from class: com.amoad.n.1
                @Override // com.amoad.m.a
                public final void a(java.lang.String str2) {
                    com.amoad.n.this.f322a.remove(str2);
                }
            });
            this.f322a.put(str, mVar);
            com.amoad.bc.a((java.lang.Runnable) mVar);
        }
        mVar.a(aMoAdView);
    }

    public final synchronized void a(java.lang.String str) {
        com.amoad.m mVar = this.f322a.get(str);
        if (mVar != null) {
            mVar.a();
        }
    }

    public final synchronized void a(java.lang.String str, com.amoad.AMoAdView aMoAdView) {
        com.amoad.m mVar = this.f322a.get(str);
        if (mVar != null) {
            mVar.b(aMoAdView);
        }
    }

    public final synchronized void b(java.lang.String str) {
        this.f322a.remove(str);
    }
}
