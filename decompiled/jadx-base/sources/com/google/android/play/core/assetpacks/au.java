package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class au extends com.google.android.play.core.assetpacks.al {
    private final com.google.android.play.core.assetpacks.co c;
    private final com.google.android.play.core.assetpacks.eb d;
    private final com.google.android.play.core.assetpacks.be e;

    au(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar, com.google.android.play.core.assetpacks.be beVar) {
        super(awVar, taskCompletionSource);
        this.c = coVar;
        this.d = ebVar;
        this.e = beVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void m(android.os.Bundle bundle, android.os.Bundle bundle2) {
        super.m(bundle, bundle2);
        this.f2141a.trySetResult(com.google.android.play.core.assetpacks.AssetPackStates.a(bundle, this.c, this.d, this.e));
    }
}
