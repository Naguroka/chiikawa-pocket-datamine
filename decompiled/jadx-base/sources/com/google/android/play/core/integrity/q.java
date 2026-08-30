package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class q implements com.google.android.play.core.integrity.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f2322a;

    private q() {
    }

    /* synthetic */ q(com.google.android.play.core.integrity.p pVar) {
    }

    public final com.google.android.play.core.integrity.q a(android.content.Context context) {
        context.getClass();
        this.f2322a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final com.google.android.play.core.integrity.s b() {
        com.google.android.play.integrity.internal.am.a(this.f2322a, android.content.Context.class);
        return new com.google.android.play.core.integrity.s(this.f2322a, null);
    }
}
