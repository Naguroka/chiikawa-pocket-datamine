package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class aj implements com.google.android.play.integrity.internal.an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f2334a = new java.lang.Object();
    private volatile com.google.android.play.integrity.internal.an b;
    private volatile java.lang.Object c = f2334a;

    private aj(com.google.android.play.integrity.internal.an anVar) {
        this.b = anVar;
    }

    public static com.google.android.play.integrity.internal.an b(com.google.android.play.integrity.internal.an anVar) {
        return anVar instanceof com.google.android.play.integrity.internal.aj ? anVar : new com.google.android.play.integrity.internal.aj(anVar);
    }

    @Override // com.google.android.play.integrity.internal.an
    public final java.lang.Object a() {
        java.lang.Object objA = this.c;
        java.lang.Object obj = f2334a;
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
