package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.google.android.play.core.integrity.s f2327a;

    static synchronized com.google.android.play.core.integrity.s a(android.content.Context context) {
        if (f2327a == null) {
            com.google.android.play.core.integrity.q qVar = new com.google.android.play.core.integrity.q(null);
            qVar.a(com.google.android.play.integrity.internal.ag.a(context));
            f2327a = qVar.b();
        }
        return f2327a;
    }
}
