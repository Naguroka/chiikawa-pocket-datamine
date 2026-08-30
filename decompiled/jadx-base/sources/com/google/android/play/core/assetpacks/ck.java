package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ck extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2176a;

    ck(java.lang.String str) {
        super(str);
        this.f2176a = -1;
    }

    ck(java.lang.String str, int i) {
        super(str);
        this.f2176a = i;
    }

    ck(java.lang.String str, java.lang.Exception exc) {
        super(str, exc);
        this.f2176a = -1;
    }

    ck(java.lang.String str, java.lang.Exception exc, int i) {
        super(str, exc);
        this.f2176a = i;
    }
}
