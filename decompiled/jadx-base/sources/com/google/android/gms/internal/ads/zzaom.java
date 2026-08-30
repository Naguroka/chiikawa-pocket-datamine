package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaom implements com.google.android.gms.internal.ads.zzaol {
    private final java.nio.channels.FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaom(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        this.zza = fileChannel;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zzb(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.MappedByteBuffer map = this.zza.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, this.zzb + j, i);
        map.load();
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
