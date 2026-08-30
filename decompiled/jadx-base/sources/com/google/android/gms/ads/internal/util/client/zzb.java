package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    public static final java.util.concurrent.ThreadPoolExecutor zza = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.ads.internal.util.client.zza("ClientDefault"));
    public static final java.util.concurrent.ExecutorService zzb = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.ads.internal.util.client.zza("ClientSingle"));
}
