package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zabi implements java.util.concurrent.Executor {
    public final /* synthetic */ android.os.Handler zaa;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zaa.post(runnable);
    }
}
