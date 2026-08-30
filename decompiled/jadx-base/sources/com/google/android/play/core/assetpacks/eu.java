package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class eu {
    eu() {
    }

    abstract int a();

    abstract long b();

    abstract java.lang.String c();

    abstract boolean d();

    abstract boolean e();

    abstract byte[] f();

    final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith("/");
    }

    final boolean h() {
        return a() == 0;
    }
}
