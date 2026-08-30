package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ad extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.List f2133a;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource b;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.util.List list, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.c = awVar;
        this.f2133a = list;
        this.b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            this.c.f.e().c(this.c.c, com.google.android.play.core.assetpacks.aw.v(this.f2133a), com.google.android.play.core.assetpacks.aw.A(), new com.google.android.play.core.assetpacks.am(this.c, this.b));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.assetpacks.aw.f2142a.c(e, "cancelDownloads(%s)", this.f2133a);
        }
    }
}
