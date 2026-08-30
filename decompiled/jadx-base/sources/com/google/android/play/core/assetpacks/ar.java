package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ar extends com.google.android.play.core.assetpacks.al {
    final int c;
    final java.lang.String d;
    final int e;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, java.lang.String str, int i2) {
        super(awVar, taskCompletionSource);
        this.f = awVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void d(android.os.Bundle bundle) {
        this.f.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.b("onError(%d), retrying notifyModuleCompleted...", java.lang.Integer.valueOf(bundle.getInt("error_code")));
        int i = this.e;
        if (i > 0) {
            this.f.D(this.c, this.d, i - 1);
        }
    }
}
