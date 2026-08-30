package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzrv implements com.google.android.gms.internal.ads.zzsb {
    private final android.content.Context zza;

    @java.lang.Deprecated
    public zzrv() {
        this.zza = null;
    }

    public zzrv(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final com.google.android.gms.internal.ads.zzsd zzd(com.google.android.gms.internal.ads.zzsa zzsaVar) throws java.lang.Throwable {
        android.content.Context context;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        if (i >= 23 && (i >= 31 || ((context = this.zza) != null && com.google.android.gms.internal.ads.zzei.zza >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iZzb = com.google.android.gms.internal.ads.zzbb.zzb(zzsaVar.zzc.zzo);
            com.google.android.gms.internal.ads.zzdo.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(com.google.android.gms.internal.ads.zzei.zzD(iZzb)));
            com.google.android.gms.internal.ads.zzrl zzrlVar = new com.google.android.gms.internal.ads.zzrl(iZzb);
            zzrlVar.zze(true);
            return zzrlVar.zzc(zzsaVar);
        }
        android.media.MediaCodec mediaCodec = null;
        try {
            java.lang.String str = zzsaVar.zza.zza;
            android.os.Trace.beginSection("createCodec:".concat(str));
            android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            android.os.Trace.endSection();
            try {
                android.os.Trace.beginSection("configureCodec");
                android.view.Surface surface = zzsaVar.zzd;
                int i2 = 0;
                if (surface == null && zzsaVar.zza.zzh && com.google.android.gms.internal.ads.zzei.zza >= 35) {
                    i2 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzsaVar.zzb, surface, (android.media.MediaCrypto) null, i2);
                android.os.Trace.endSection();
                android.os.Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                android.os.Trace.endSection();
                return new com.google.android.gms.internal.ads.zztc(mediaCodecCreateByCodecName, zzsaVar.zzf, null);
            } catch (java.io.IOException | java.lang.RuntimeException e) {
                e = e;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (java.io.IOException e2) {
            e = e2;
        } catch (java.lang.RuntimeException e3) {
            e = e3;
        }
    }
}
