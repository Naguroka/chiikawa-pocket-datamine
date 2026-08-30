package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class an extends com.amoad.at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.ref.WeakReference<com.amoad.as> f227a;

    an(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context, str, str2);
    }

    @Override // com.amoad.at
    final void a() {
        com.amoad.as asVar;
        java.lang.ref.WeakReference<com.amoad.as> weakReference = this.f227a;
        if (weakReference == null || (asVar = weakReference.get()) == null) {
            return;
        }
        asVar.f242a.clear();
        com.amoad.aq aqVarA = com.amoad.j.a(asVar.c.f311a).a(asVar.b);
        int iB = com.amoad.k.b(aqVarA.c, aqVarA.d, aqVarA.e);
        com.amoad.aq aqVarA2 = com.amoad.j.a(asVar.c.f311a).a(asVar.b);
        asVar.a(iB, com.amoad.k.d(aqVarA2.c, aqVarA2.d, aqVarA2.f));
    }

    @Override // com.amoad.at
    final void b() {
    }
}
