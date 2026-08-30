package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
abstract class at {
    final android.content.Context b;
    final java.lang.String c;
    final java.lang.String d;
    com.amoad.AMoAdNativeViewCoder e = new com.amoad.AMoAdNativeViewCoder();

    at(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    abstract void a();

    final void a(com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder) {
        if (aMoAdNativeViewCoder != null) {
            this.e = aMoAdNativeViewCoder;
        }
    }

    abstract void b();
}
