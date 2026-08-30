package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.content.Context f2301a;
    final /* synthetic */ com.google.android.play.core.integrity.bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.content.Context context) {
        super(taskCompletionSource);
        this.b = bnVar;
        this.f2301a = context;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        this.b.d.trySetResult(java.lang.Integer.valueOf(com.google.android.play.integrity.internal.ai.a(this.f2301a)));
    }
}
