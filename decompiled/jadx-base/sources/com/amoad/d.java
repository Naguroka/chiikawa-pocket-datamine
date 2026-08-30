package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.graphics.Bitmap f300a;
    com.amoad.ac b;

    d(android.graphics.Bitmap bitmap, com.amoad.ac acVar) {
        this.f300a = bitmap;
        this.b = acVar;
    }

    d(byte[] bArr) {
        if (com.amoad.ac.a(new java.io.ByteArrayInputStream(bArr))) {
            this.b = new com.amoad.ac(bArr);
        } else {
            this.f300a = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
    }

    final boolean a() {
        return (this.f300a == null && this.b == null) ? false : true;
    }
}
