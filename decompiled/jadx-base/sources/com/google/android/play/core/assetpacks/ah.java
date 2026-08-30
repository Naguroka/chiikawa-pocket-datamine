package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ah extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2137a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, java.lang.String str, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.e = awVar;
        this.f2137a = i;
        this.b = str;
        this.c = taskCompletionSource2;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            this.e.f.e().h(this.e.c, com.google.android.play.core.assetpacks.aw.z(this.f2137a, this.b), com.google.android.play.core.assetpacks.aw.A(), new com.google.android.play.core.assetpacks.ar(this.e, this.c, this.f2137a, this.b, this.d));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.assetpacks.aw.f2142a.c(e, "notifyModuleCompleted", new java.lang.Object[0]);
        }
    }
}
