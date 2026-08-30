package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ac extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.List f2132a;
    final /* synthetic */ java.util.Map b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.util.List list, java.util.Map map, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.d = awVar;
        this.f2132a = list;
        this.b = map;
        this.c = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        java.util.ArrayList arrayListV = com.google.android.play.core.assetpacks.aw.v(this.f2132a);
        try {
            ?? E = this.d.f.e();
            java.lang.String str = this.d.c;
            android.os.Bundle bundleN = com.google.android.play.core.assetpacks.aw.n(this.b);
            com.google.android.play.core.assetpacks.aw awVar = this.d;
            E.l(str, arrayListV, bundleN, new com.google.android.play.core.assetpacks.av(awVar, this.c, awVar.d, awVar.e));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.assetpacks.aw.f2142a.c(e, "startDownload(%s)", this.f2132a);
            this.c.trySetException(new java.lang.RuntimeException(e));
        }
    }
}
