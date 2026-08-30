package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class am extends com.amoad.at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.view.View> f213a;
    private com.amoad.AMoAdNativeFailureListener f;
    private com.amoad.ao g;
    private com.amoad.Analytics h;

    am(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context, str, str2);
    }

    @Override // com.amoad.at
    final void a() {
        if (this.f213a != null) {
            com.amoad.au.a(this.b, this.c, this.d, this.f213a, this.f, this.g, this.e, this.h);
        }
    }

    final void a(android.view.View view, com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener, com.amoad.ao aoVar, com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder, com.amoad.Analytics analytics) {
        this.f = aMoAdNativeFailureListener;
        this.g = aoVar;
        this.h = analytics;
        this.f213a = new java.lang.ref.WeakReference<>(view);
        a(aMoAdNativeViewCoder);
        com.amoad.au.a(this.b, this.c, this.d, this.f213a, aMoAdNativeFailureListener, this.g, this.e, analytics);
    }

    @Override // com.amoad.at
    final void b() {
        android.view.View view;
        java.lang.ref.WeakReference<android.view.View> weakReference = this.f213a;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        com.amoad.au.a(view);
    }
}
