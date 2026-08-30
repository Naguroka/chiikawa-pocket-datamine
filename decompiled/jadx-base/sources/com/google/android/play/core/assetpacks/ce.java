package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ce extends com.google.android.play.core.assetpacks.dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2170a;
    final long b;
    final java.lang.String c;
    final java.lang.String d;
    final int e;
    final int f;
    final int g;
    final long h;
    final int i;
    final java.io.InputStream j;

    ce(int i, java.lang.String str, int i2, long j, java.lang.String str2, java.lang.String str3, int i3, int i4, int i5, long j2, int i6, java.io.InputStream inputStream) {
        super(i, str);
        this.f2170a = i2;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = j2;
        this.i = i6;
        this.j = inputStream;
    }

    final boolean a() {
        return this.f + 1 == this.g;
    }
}
