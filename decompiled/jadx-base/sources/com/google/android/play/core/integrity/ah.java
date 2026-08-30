package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ah extends com.google.android.play.core.integrity.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.ai f2282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(com.google.android.play.core.integrity.ai aiVar, java.lang.String str, long j) {
        super(str, j);
        this.f2282a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle) {
        return this.f2282a.f2283a.b(activity, bundle);
    }
}
