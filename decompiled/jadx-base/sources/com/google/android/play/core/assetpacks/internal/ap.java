package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ap implements com.google.android.play.core.assetpacks.internal.as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.play.core.assetpacks.internal.as f2243a;

    public static void b(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2) {
        com.google.android.play.core.assetpacks.internal.ap apVar = (com.google.android.play.core.assetpacks.internal.ap) asVar;
        if (apVar.f2243a != null) {
            throw new java.lang.IllegalStateException();
        }
        apVar.f2243a = asVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final java.lang.Object a() {
        com.google.android.play.core.assetpacks.internal.as asVar = this.f2243a;
        if (asVar != null) {
            return asVar.a();
        }
        throw new java.lang.IllegalStateException();
    }
}
