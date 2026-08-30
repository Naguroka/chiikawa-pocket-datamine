package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ao extends com.google.android.play.core.assetpacks.al {
    final /* synthetic */ com.google.android.play.core.assetpacks.aw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(awVar, taskCompletionSource);
        this.c = awVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void g(java.util.List list) {
        super.g(list);
        this.f2141a.trySetResult(com.google.android.play.core.assetpacks.aw.w(this.c, list));
    }
}
