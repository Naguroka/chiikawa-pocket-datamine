package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaqu extends java.lang.ThreadLocal {
    zzaqu(com.google.android.gms.internal.ads.zzaqv zzaqvVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        return java.nio.ByteBuffer.allocate(32);
    }
}
