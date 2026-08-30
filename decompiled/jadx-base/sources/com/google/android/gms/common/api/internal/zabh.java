package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zabh {
    private static final java.util.concurrent.ExecutorService zaa = com.google.android.gms.internal.base.zap.zaa().zac(2, new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Executor"), 2);

    public static java.util.concurrent.ExecutorService zaa() {
        return zaa;
    }
}
