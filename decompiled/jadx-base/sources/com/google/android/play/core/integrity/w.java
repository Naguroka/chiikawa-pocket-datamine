package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class w implements com.google.android.play.core.integrity.aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.integrity.w f2325a = this;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;
    private final com.google.android.play.integrity.internal.an e;
    private final com.google.android.play.integrity.internal.an f;
    private final com.google.android.play.integrity.internal.an g;

    /* synthetic */ w(android.content.Context context, com.google.android.play.core.integrity.v vVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(com.google.android.play.core.integrity.bb.f2299a);
        this.c = anVarB;
        com.google.android.play.core.integrity.au auVar = new com.google.android.play.core.integrity.au(akVarB, com.google.android.play.core.integrity.n.f2321a);
        this.d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new com.google.android.play.core.integrity.bp(akVarB, anVarB, auVar, com.google.android.play.core.integrity.n.f2321a));
        this.e = anVarB2;
        com.google.android.play.integrity.internal.an anVarB3 = com.google.android.play.integrity.internal.aj.b(new com.google.android.play.core.integrity.bu(anVarB2));
        this.f = anVarB3;
        this.g = com.google.android.play.integrity.internal.aj.b(new com.google.android.play.core.integrity.ba(anVarB2, anVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final com.google.android.play.core.integrity.StandardIntegrityManager a() {
        return (com.google.android.play.core.integrity.StandardIntegrityManager) this.g.a();
    }
}
