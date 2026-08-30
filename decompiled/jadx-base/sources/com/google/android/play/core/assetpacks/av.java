package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class av extends com.google.android.play.core.assetpacks.al {
    private final com.google.android.play.core.assetpacks.co c;
    private final com.google.android.play.core.assetpacks.eb d;

    av(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar) {
        super(awVar, taskCompletionSource);
        this.c = coVar;
        this.d = ebVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void n(int i, android.os.Bundle bundle) {
        super.n(i, bundle);
        this.f2141a.trySetResult(com.google.android.play.core.assetpacks.AssetPackStates.a(bundle, this.c, this.d, com.google.android.play.core.assetpacks.bf.f2150a));
    }
}
