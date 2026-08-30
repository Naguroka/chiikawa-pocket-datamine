package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzavd {
    private final com.google.common.util.concurrent.ListenableFuture zza;

    public zzavd(final android.content.Context context, java.util.concurrent.Executor executor) {
        this.zza = com.google.android.gms.internal.ads.zzgch.zzj(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.zzavc
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.content.Context context2 = context;
                try {
                    return com.google.android.gms.internal.ads.zzfnq.zza(context2, context2.getPackageName(), java.lang.Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza;
    }
}
