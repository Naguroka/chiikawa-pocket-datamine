package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class aq extends com.google.android.play.core.integrity.IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2289a;
    private final com.google.android.play.core.integrity.y b;

    aq(java.lang.String str, com.google.android.play.core.integrity.y yVar) {
        this.f2289a = str;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity activity, int i) {
        return this.b.a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final java.lang.String token() {
        return this.f2289a;
    }
}
