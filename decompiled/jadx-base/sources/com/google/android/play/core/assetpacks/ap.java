package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ap extends com.google.android.play.core.assetpacks.al {
    final /* synthetic */ com.google.android.play.core.assetpacks.aw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(awVar, taskCompletionSource);
        this.c = awVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void d(android.os.Bundle bundle) {
        this.c.g.u(this.f2141a);
        int i = bundle.getInt("error_code");
        com.google.android.play.core.assetpacks.aw.f2142a.b("onError(%d)", java.lang.Integer.valueOf(i));
        this.f2141a.trySetException(new com.google.android.play.core.assetpacks.AssetPackException(i));
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void h(android.os.Bundle bundle, android.os.Bundle bundle2) {
        super.h(bundle, bundle2);
        if (!this.c.h.compareAndSet(true, false)) {
            com.google.android.play.core.assetpacks.aw.f2142a.e("Expected keepingAlive to be true, but was false.", new java.lang.Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.f();
        }
    }
}
