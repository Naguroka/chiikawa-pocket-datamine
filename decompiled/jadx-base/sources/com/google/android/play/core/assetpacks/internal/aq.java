package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class aq implements com.google.android.play.core.assetpacks.internal.as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f2244a = new java.lang.Object();
    private volatile com.google.android.play.core.assetpacks.internal.as b;
    private volatile java.lang.Object c = f2244a;

    private aq(com.google.android.play.core.assetpacks.internal.as asVar) {
        this.b = asVar;
    }

    public static com.google.android.play.core.assetpacks.internal.as b(com.google.android.play.core.assetpacks.internal.as asVar) {
        asVar.getClass();
        return asVar instanceof com.google.android.play.core.assetpacks.internal.aq ? asVar : new com.google.android.play.core.assetpacks.internal.aq(asVar);
    }

    public static com.google.android.play.core.assetpacks.internal.aq c(com.google.android.play.core.assetpacks.internal.as asVar) {
        return asVar instanceof com.google.android.play.core.assetpacks.internal.aq ? (com.google.android.play.core.assetpacks.internal.aq) asVar : new com.google.android.play.core.assetpacks.internal.aq(asVar);
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final java.lang.Object a() {
        java.lang.Object objA = this.c;
        java.lang.Object obj = f2244a;
        if (objA == obj) {
            synchronized (this) {
                objA = this.c;
                if (objA == obj) {
                    objA = this.b.a();
                    java.lang.Object obj2 = this.c;
                    if (obj2 != obj && obj2 != objA) {
                        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.c = objA;
                    this.b = null;
                }
            }
        }
        return objA;
    }
}
