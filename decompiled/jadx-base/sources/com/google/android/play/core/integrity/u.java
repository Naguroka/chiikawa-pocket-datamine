package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class u implements com.google.android.play.core.integrity.av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f2324a;

    private u() {
    }

    /* synthetic */ u(com.google.android.play.core.integrity.t tVar) {
    }

    public final com.google.android.play.core.integrity.u a(android.content.Context context) {
        context.getClass();
        this.f2324a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final com.google.android.play.core.integrity.aw b() {
        com.google.android.play.integrity.internal.am.a(this.f2324a, android.content.Context.class);
        return new com.google.android.play.core.integrity.w(this.f2324a, null);
    }
}
