package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ag extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2136a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource e;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, java.lang.String str, java.lang.String str2, int i2, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f = awVar;
        this.f2136a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            this.f.f.e().g(this.f.c, com.google.android.play.core.assetpacks.aw.k(this.f2136a, this.b, this.c, this.d), com.google.android.play.core.assetpacks.aw.A(), new com.google.android.play.core.assetpacks.aq(this.f, this.e));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.assetpacks.aw.f2142a.c(e, "notifyChunkTransferred", new java.lang.Object[0]);
        }
    }
}
