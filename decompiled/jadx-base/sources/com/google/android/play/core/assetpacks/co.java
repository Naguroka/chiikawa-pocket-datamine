package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f2180a = new java.util.HashMap();

    co() {
    }

    final synchronized double a(java.lang.String str) {
        java.lang.Double d = (java.lang.Double) this.f2180a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    final synchronized double b(java.lang.String str, com.google.android.play.core.assetpacks.dg dgVar) {
        double d;
        d = (((double) ((com.google.android.play.core.assetpacks.ce) dgVar).f) + 1.0d) / ((double) ((com.google.android.play.core.assetpacks.ce) dgVar).g);
        this.f2180a.put(str, java.lang.Double.valueOf(d));
        return d;
    }

    final synchronized void c(java.lang.String str) {
        this.f2180a.put(str, java.lang.Double.valueOf(0.0d));
    }
}
