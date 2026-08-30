package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzang extends com.google.android.gms.internal.ads.zzaby {
    public zzang(com.google.android.gms.internal.ads.zzef zzefVar, long j, long j2) {
        super(new com.google.android.gms.internal.ads.zzabt(), new com.google.android.gms.internal.ads.zzane(zzefVar, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
