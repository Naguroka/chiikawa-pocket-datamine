package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzard extends com.google.android.gms.internal.ads.zzhdy {
    public zzard(java.lang.String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
