package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzru extends com.google.android.gms.internal.ads.zzhh {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzru() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzhb
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(int i) {
        this.zzi = i;
    }

    public final boolean zzp(com.google.android.gms.internal.ads.zzhh zzhhVar) {
        java.nio.ByteBuffer byteBuffer;
        com.google.android.gms.internal.ads.zzcw.zzd(!zzhhVar.zzd(1073741824));
        com.google.android.gms.internal.ads.zzcw.zzd(!zzhhVar.zzd(268435456));
        com.google.android.gms.internal.ads.zzcw.zzd(!zzhhVar.zzd(4));
        if (zzq()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            java.nio.ByteBuffer byteBuffer2 = zzhhVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzhhVar.zze;
            if (zzhhVar.zzd(1)) {
                zzc(1);
            }
        }
        java.nio.ByteBuffer byteBuffer3 = zzhhVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhhVar.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
