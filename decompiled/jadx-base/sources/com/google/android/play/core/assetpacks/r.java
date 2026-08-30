package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements com.google.android.play.core.assetpacks.internal.as {
    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* synthetic */ java.lang.Object a() {
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.google.android.play.core.assetpacks.n
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "AssetPackBackgroundExecutor");
            }
        });
        com.google.android.play.core.assetpacks.internal.ar.a(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }
}
