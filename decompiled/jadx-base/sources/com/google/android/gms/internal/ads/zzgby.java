package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzgby extends com.google.android.gms.internal.ads.zzgci {
    zzgby() {
    }

    public static com.google.android.gms.internal.ads.zzgby zzu(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        return listenableFuture instanceof com.google.android.gms.internal.ads.zzgby ? (com.google.android.gms.internal.ads.zzgby) listenableFuture : new com.google.android.gms.internal.ads.zzgbz(listenableFuture);
    }
}
