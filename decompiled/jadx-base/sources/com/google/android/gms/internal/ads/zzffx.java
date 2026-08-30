package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzffx {
    public static final com.google.android.gms.internal.ads.zzfgd zza(java.util.concurrent.Callable callable, java.lang.Object obj, com.google.android.gms.internal.ads.zzfgf zzfgfVar) {
        return zzb(callable, zzfgfVar.zzb, obj, zzfgfVar);
    }

    public static final com.google.android.gms.internal.ads.zzfgd zzb(java.util.concurrent.Callable callable, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzfgf zzfgfVar) {
        return new com.google.android.gms.internal.ads.zzfgd(zzfgfVar, obj, com.google.android.gms.internal.ads.zzfgf.zza, java.util.Collections.emptyList(), zzgcsVar.zzb(callable));
    }

    public static final com.google.android.gms.internal.ads.zzfgd zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj, com.google.android.gms.internal.ads.zzfgf zzfgfVar) {
        return new com.google.android.gms.internal.ads.zzfgd(zzfgfVar, obj, com.google.android.gms.internal.ads.zzfgf.zza, java.util.Collections.emptyList(), listenableFuture);
    }

    public static final com.google.android.gms.internal.ads.zzfgd zzd(final com.google.android.gms.internal.ads.zzffs zzffsVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzfgf zzfgfVar) {
        return zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzffw
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Exception {
                zzffsVar.zza();
                return null;
            }
        }, zzgcsVar, obj, zzfgfVar);
    }
}
