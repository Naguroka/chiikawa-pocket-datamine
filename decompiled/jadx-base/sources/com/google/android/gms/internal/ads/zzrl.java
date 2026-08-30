package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzrl implements com.google.android.gms.internal.ads.zzsb {
    private final com.google.android.gms.internal.ads.zzfvf zza;
    private final com.google.android.gms.internal.ads.zzfvf zzb;
    private boolean zzc;

    public zzrl(int i) {
        com.google.android.gms.internal.ads.zzrj zzrjVar = new com.google.android.gms.internal.ads.zzrj(i);
        com.google.android.gms.internal.ads.zzrk zzrkVar = new com.google.android.gms.internal.ads.zzrk(i);
        this.zza = zzrjVar;
        this.zzb = zzrkVar;
        this.zzc = true;
    }

    static /* synthetic */ android.os.HandlerThread zza(int i) {
        return new android.os.HandlerThread(com.google.android.gms.internal.ads.zzrn.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ android.os.HandlerThread zzb(int i) {
        return new android.os.HandlerThread(com.google.android.gms.internal.ads.zzrn.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0086, TryCatch #1 {Exception -> 0x0086, blocks: (B:4:0x001a, B:6:0x0020, B:9:0x0029, B:11:0x002d, B:13:0x0035, B:15:0x004f, B:14:0x003c), top: B:38:0x001a }] */
    public final com.google.android.gms.internal.ads.zzrn zzc(com.google.android.gms.internal.ads.zzsa zzsaVar) throws java.lang.Exception {
        android.media.MediaCodec mediaCodecCreateByCodecName;
        com.google.android.gms.internal.ads.zzse zzrrVar;
        int i;
        java.lang.String str = zzsaVar.zza.zza;
        com.google.android.gms.internal.ads.zzrn zzrnVar = null;
        try {
            android.os.Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            try {
                if (this.zzc) {
                    com.google.android.gms.internal.ads.zzab zzabVar = zzsaVar.zzc;
                    if (com.google.android.gms.internal.ads.zzei.zza >= 34 && (com.google.android.gms.internal.ads.zzei.zza >= 35 || com.google.android.gms.internal.ads.zzbb.zzi(zzabVar.zzo))) {
                        zzrrVar = new com.google.android.gms.internal.ads.zztd(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        android.os.HandlerThread handlerThreadZzb = zzb(((com.google.android.gms.internal.ads.zzrk) this.zzb).zza);
                        android.os.HandlerThread handlerThread = handlerThreadZzb;
                        zzrrVar = new com.google.android.gms.internal.ads.zzrr(mediaCodecCreateByCodecName, handlerThreadZzb);
                        i = 0;
                    }
                } else {
                    android.os.HandlerThread handlerThreadZzb2 = zzb(((com.google.android.gms.internal.ads.zzrk) this.zzb).zza);
                    android.os.HandlerThread handlerThread2 = handlerThreadZzb2;
                    zzrrVar = new com.google.android.gms.internal.ads.zzrr(mediaCodecCreateByCodecName, handlerThreadZzb2);
                    i = 0;
                }
                com.google.android.gms.internal.ads.zzse zzseVar = zzrrVar;
                int i2 = i;
                android.os.HandlerThread handlerThreadZza = zza(((com.google.android.gms.internal.ads.zzrj) this.zza).zza);
                android.os.HandlerThread handlerThread3 = handlerThreadZza;
                com.google.android.gms.internal.ads.zzrn zzrnVar2 = new com.google.android.gms.internal.ads.zzrn(mediaCodecCreateByCodecName, handlerThreadZza, zzseVar, zzsaVar.zzf, null);
                try {
                    android.os.Trace.endSection();
                    if (zzsaVar.zzd == null && zzsaVar.zza.zzh && com.google.android.gms.internal.ads.zzei.zza >= 35) {
                        i2 |= 8;
                    }
                    com.google.android.gms.internal.ads.zzrn.zzh(zzrnVar2, zzsaVar.zzb, zzsaVar.zzd, null, i2);
                    return zzrnVar2;
                } catch (java.lang.Exception e) {
                    e = e;
                    zzrnVar = zzrnVar2;
                    if (zzrnVar != null) {
                        zzrnVar.zzm();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzsd zzd(com.google.android.gms.internal.ads.zzsa zzsaVar) throws java.io.IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzc = true;
    }
}
