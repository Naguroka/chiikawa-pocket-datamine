package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class bm extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ com.google.android.play.core.integrity.bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(java.lang.Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.af)) {
            super.a(exc);
        } else if (com.google.android.play.core.integrity.bn.k(this.f)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, exc));
        } else {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-9, exc));
        }
    }
}
