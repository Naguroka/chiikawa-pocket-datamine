package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements com.google.android.play.core.assetpacks.internal.as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.internal.as f2267a;
    private final com.google.android.play.core.assetpacks.internal.as b;

    public s(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2) {
        this.f2267a = asVar;
        this.b = asVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        java.lang.Object objA = this.f2267a.a();
        android.content.Context contextB = ((com.google.android.play.core.assetpacks.u) this.b).b();
        com.google.android.play.core.assetpacks.l lVar = (com.google.android.play.core.assetpacks.l) objA;
        com.google.android.play.core.assetpacks.internal.af.a(contextB.getPackageManager(), new android.content.ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        com.google.android.play.core.assetpacks.internal.af.a(contextB.getPackageManager(), new android.content.ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        com.google.android.play.core.assetpacks.internal.ar.a(lVar);
        return lVar;
    }
}
