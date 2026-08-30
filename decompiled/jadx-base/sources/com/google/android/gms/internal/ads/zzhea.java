package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhea extends com.google.android.gms.internal.ads.zzhdy implements com.google.android.gms.internal.ads.zzaqz {
    private int zzg;

    protected zzhea(java.lang.String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(java.nio.ByteBuffer byteBuffer) {
        this.zzg = com.google.android.gms.internal.ads.zzaqy.zzc(byteBuffer.get());
        com.google.android.gms.internal.ads.zzaqy.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
