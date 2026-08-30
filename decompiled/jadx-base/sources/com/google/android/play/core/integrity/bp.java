package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class bp implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f2309a;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;

    public bp(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f2309a = anVar;
        this.b = anVar2;
        this.c = anVar3;
        this.d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return new com.google.android.play.core.integrity.bn((android.content.Context) this.f2309a.a(), (com.google.android.play.integrity.internal.s) this.b.a(), ((com.google.android.play.core.integrity.au) this.c).a(), new com.google.android.play.core.integrity.j());
    }
}
