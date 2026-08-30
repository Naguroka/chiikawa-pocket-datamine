package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f2292a;
    private final com.google.android.play.integrity.internal.an b;

    at(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f2292a = anVar;
        this.b = anVar2;
    }

    final com.google.android.play.core.integrity.as a(android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        java.lang.Object objA = this.f2292a.a();
        objA.getClass();
        com.google.android.play.core.integrity.k kVar = (com.google.android.play.core.integrity.k) this.b.a();
        kVar.getClass();
        activity.getClass();
        aeVar.getClass();
        return new com.google.android.play.core.integrity.as((android.content.Context) objA, kVar, activity, taskCompletionSource, aeVar);
    }
}
