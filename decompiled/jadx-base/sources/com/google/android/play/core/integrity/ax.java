package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.google.android.play.core.integrity.aw f2294a;

    static synchronized com.google.android.play.core.integrity.aw a(android.content.Context context) {
        if (f2294a == null) {
            com.google.android.play.core.integrity.u uVar = new com.google.android.play.core.integrity.u(null);
            uVar.a(com.google.android.play.integrity.internal.ag.a(context));
            f2294a = uVar.b();
        }
        return f2294a;
    }
}
