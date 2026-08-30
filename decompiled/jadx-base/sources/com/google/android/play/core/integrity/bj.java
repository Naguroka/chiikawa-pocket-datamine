package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bj extends com.google.android.play.core.integrity.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.bk f2306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(com.google.android.play.core.integrity.bk bkVar, java.lang.String str, long j) {
        super(str, j);
        this.f2306a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle) {
        bundle.putLong("cloud.prj", this.f2306a.e);
        return this.f2306a.c.c(activity, bundle);
    }
}
