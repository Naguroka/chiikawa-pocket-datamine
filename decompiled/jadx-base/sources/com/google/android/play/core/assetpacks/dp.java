package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class dp implements com.google.android.play.core.assetpacks.internal.as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.internal.as f2205a;
    private final com.google.android.play.core.assetpacks.internal.as b;
    private final com.google.android.play.core.assetpacks.internal.as c;
    private final com.google.android.play.core.assetpacks.internal.as d;
    private final com.google.android.play.core.assetpacks.internal.as e;
    private final com.google.android.play.core.assetpacks.internal.as f;
    private final com.google.android.play.core.assetpacks.internal.as g;

    public dp(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2, com.google.android.play.core.assetpacks.internal.as asVar3, com.google.android.play.core.assetpacks.internal.as asVar4, com.google.android.play.core.assetpacks.internal.as asVar5, com.google.android.play.core.assetpacks.internal.as asVar6, com.google.android.play.core.assetpacks.internal.as asVar7) {
        this.f2205a = asVar;
        this.b = asVar2;
        this.c = asVar3;
        this.d = asVar4;
        this.e = asVar5;
        this.f = asVar6;
        this.g = asVar7;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        java.lang.String str = (java.lang.String) this.f2205a.a();
        java.lang.Object objA = this.b.a();
        java.lang.Object objA2 = this.c.a();
        android.content.Context contextB = ((com.google.android.play.core.assetpacks.u) this.d).b();
        java.lang.Object objA3 = this.e.a();
        return new com.google.android.play.core.assetpacks.Cdo(str != null ? new java.io.File(contextB.getExternalFilesDir(null), str) : contextB.getExternalFilesDir(null), (com.google.android.play.core.assetpacks.bb) objA, (com.google.android.play.core.assetpacks.co) objA2, contextB, (com.google.android.play.core.assetpacks.ed) objA3, com.google.android.play.core.assetpacks.internal.aq.c(this.f), (com.google.android.play.core.assetpacks.eb) this.g.a());
    }
}
