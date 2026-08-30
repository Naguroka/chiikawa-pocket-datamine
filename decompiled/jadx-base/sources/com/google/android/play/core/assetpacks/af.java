package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class af extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.List f2135a;
    final /* synthetic */ java.util.Map b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ com.google.android.play.core.assetpacks.be d;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.util.List list, java.util.Map map, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.core.assetpacks.be beVar) {
        super(taskCompletionSource);
        this.e = awVar;
        this.f2135a = list;
        this.b = map;
        this.c = taskCompletionSource2;
        this.d = beVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        java.util.ArrayList arrayListV = com.google.android.play.core.assetpacks.aw.v(this.f2135a);
        try {
            ?? E = this.e.f.e();
            java.lang.String str = this.e.c;
            android.os.Bundle bundleN = com.google.android.play.core.assetpacks.aw.n(this.b);
            com.google.android.play.core.assetpacks.aw awVar = this.e;
            E.k(str, arrayListV, bundleN, new com.google.android.play.core.assetpacks.au(awVar, this.c, awVar.d, awVar.e, this.d));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.assetpacks.aw.f2142a.c(e, "getPackStates(%s)", this.f2135a);
            this.c.trySetException(new java.lang.RuntimeException(e));
        }
    }
}
