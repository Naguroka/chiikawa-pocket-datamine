package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ak extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource f2140a;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.b = awVar;
        this.f2140a = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            this.b.g.e().f(this.b.c, com.google.android.play.core.assetpacks.aw.A(), new com.google.android.play.core.assetpacks.ap(this.b, this.f2140a));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.assetpacks.aw.f2142a.c(e, "keepAlive", new java.lang.Object[0]);
        }
    }
}
