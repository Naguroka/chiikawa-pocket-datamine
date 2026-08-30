package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class s extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource f2252a;
    final /* synthetic */ com.google.android.play.core.assetpacks.internal.p b;
    final /* synthetic */ com.google.android.play.core.assetpacks.internal.z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(com.google.android.play.core.assetpacks.internal.z zVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.core.assetpacks.internal.p pVar) {
        super(taskCompletionSource);
        this.c = zVar;
        this.f2252a = taskCompletionSource2;
        this.b = pVar;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        synchronized (this.c.g) {
            com.google.android.play.core.assetpacks.internal.z.n(this.c, this.f2252a);
            if (this.c.l.getAndIncrement() > 0) {
                this.c.c.d("Already connected to the service.", new java.lang.Object[0]);
            }
            com.google.android.play.core.assetpacks.internal.z.p(this.c, this.b);
        }
    }
}
