package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.integrity.s f2323a = this;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;
    private final com.google.android.play.integrity.internal.an e;
    private final com.google.android.play.integrity.internal.an f;

    /* synthetic */ s(android.content.Context context, com.google.android.play.core.integrity.r rVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(com.google.android.play.core.integrity.ac.f2278a);
        this.c = anVarB;
        com.google.android.play.core.integrity.au auVar = new com.google.android.play.core.integrity.au(akVarB, com.google.android.play.core.integrity.l.f2318a);
        this.d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new com.google.android.play.core.integrity.al(akVarB, anVarB, auVar, com.google.android.play.core.integrity.l.f2318a));
        this.e = anVarB2;
        this.f = com.google.android.play.integrity.internal.aj.b(new com.google.android.play.core.integrity.ab(anVarB2));
    }

    public final com.google.android.play.core.integrity.IntegrityManager a() {
        return (com.google.android.play.core.integrity.IntegrityManager) this.f.a();
    }
}
