package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 implements com.applovin.impl.b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1530a = new java.lang.Object();
    private com.applovin.impl.sd.e b;
    private com.applovin.impl.a7 c;
    private com.applovin.impl.pa.b d;
    private java.lang.String e;

    private com.applovin.impl.a7 a(com.applovin.impl.sd.e eVar) {
        com.applovin.impl.pa.b bVarA = this.d;
        if (bVarA == null) {
            bVarA = new com.applovin.impl.c6.b().a(this.e);
        }
        android.net.Uri uri = eVar.b;
        com.applovin.impl.qa qaVar = new com.applovin.impl.qa(uri == null ? null : uri.toString(), eVar.f, bVarA);
        com.applovin.impl.pp it = eVar.c.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            qaVar.a((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.applovin.impl.x5 x5VarA = new com.applovin.impl.x5.b().a(eVar.f1252a, com.applovin.impl.l9.d).a(eVar.d).b(eVar.e).a(com.applovin.impl.tb.a(eVar.g)).a(qaVar);
        x5VarA.a(0, eVar.b());
        return x5VarA;
    }

    @Override // com.applovin.impl.b7
    public com.applovin.impl.a7 a(com.applovin.impl.sd sdVar) {
        com.applovin.impl.a7 a7Var;
        com.applovin.impl.b1.a(sdVar.b);
        com.applovin.impl.sd.e eVar = sdVar.b.c;
        if (eVar != null && com.applovin.impl.xp.f1515a >= 18) {
            synchronized (this.f1530a) {
                if (!com.applovin.impl.xp.a(eVar, this.b)) {
                    this.b = eVar;
                    this.c = a(eVar);
                }
                a7Var = (com.applovin.impl.a7) com.applovin.impl.b1.a(this.c);
            }
            return a7Var;
        }
        return com.applovin.impl.a7.f583a;
    }
}
