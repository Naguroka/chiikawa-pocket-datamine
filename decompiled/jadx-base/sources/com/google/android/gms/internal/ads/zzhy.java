package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhy implements com.google.android.gms.internal.ads.zzkg {
    private final com.google.android.gms.internal.ads.zzyk zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final java.util.HashMap zzg;
    private long zzh;

    public zzhy() {
        com.google.android.gms.internal.ads.zzyk zzykVar = new com.google.android.gms.internal.ads.zzyk(true, 65536);
        zzl(2500, 0, "bufferForPlaybackMs", "0");
        zzl(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzl(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzl(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(50000, 50000, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzykVar;
        this.zzb = com.google.android.gms.internal.ads.zzei.zzs(50000L);
        this.zzc = com.google.android.gms.internal.ads.zzei.zzs(50000L);
        this.zzd = com.google.android.gms.internal.ads.zzei.zzs(2500L);
        this.zze = com.google.android.gms.internal.ads.zzei.zzs(5000L);
        this.zzf = com.google.android.gms.internal.ads.zzei.zzs(0L);
        this.zzg = new java.util.HashMap();
        this.zzh = -1L;
    }

    private static void zzl(int i, int i2, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzcw.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzm(com.google.android.gms.internal.ads.zzog zzogVar) {
        if (this.zzg.remove(zzogVar) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    final int zza() {
        java.util.Iterator it = this.zzg.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((com.google.android.gms.internal.ads.zzhw) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zzb(com.google.android.gms.internal.ads.zzog zzogVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc(com.google.android.gms.internal.ads.zzog zzogVar) {
        long id = java.lang.Thread.currentThread().getId();
        long j = this.zzh;
        boolean z = true;
        if (j != -1 && j != id) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzg(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        if (!this.zzg.containsKey(zzogVar)) {
            this.zzg.put(zzogVar, new com.google.android.gms.internal.ads.zzhw(null));
        }
        com.google.android.gms.internal.ads.zzhw zzhwVar = (com.google.android.gms.internal.ads.zzhw) this.zzg.get(zzogVar);
        zzhwVar.getClass();
        zzhwVar.zzb = 13107200;
        zzhwVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd(com.google.android.gms.internal.ads.zzog zzogVar) {
        zzm(zzogVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(com.google.android.gms.internal.ads.zzog zzogVar) {
        zzm(zzogVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzf(com.google.android.gms.internal.ads.zzkf zzkfVar, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzxv[] zzxvVarArr) {
        com.google.android.gms.internal.ads.zzhw zzhwVar = (com.google.android.gms.internal.ads.zzhw) this.zzg.get(zzkfVar.zza);
        zzhwVar.getClass();
        int length = zzxvVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                zzhwVar.zzb = java.lang.Math.max(13107200, i2);
                zzn();
                return;
            }
            com.google.android.gms.internal.ads.zzxv zzxvVar = zzxvVarArr[i];
            if (zzxvVar != null) {
                switch (zzxvVar.zzg().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i3 = androidx.media3.exoplayer.DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                        break;
                    case 2:
                        i3 = androidx.media3.exoplayer.DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i3 = 131072;
                        break;
                }
                i2 += i3;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(com.google.android.gms.internal.ads.zzog zzogVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(com.google.android.gms.internal.ads.zzkf zzkfVar) {
        com.google.android.gms.internal.ads.zzhw zzhwVar = (com.google.android.gms.internal.ads.zzhw) this.zzg.get(zzkfVar.zza);
        zzhwVar.getClass();
        int iZza = this.zza.zza();
        int iZza2 = zza();
        long jMin = this.zzb;
        float f = zzkfVar.zzc;
        if (f > 1.0f) {
            jMin = java.lang.Math.min(com.google.android.gms.internal.ads.zzei.zzq(jMin, f), this.zzc);
        }
        long j = zzkfVar.zzb;
        if (j < java.lang.Math.max(jMin, 500000L)) {
            boolean z = iZza < iZza2;
            zzhwVar.zza = z;
            if (!z && j < 500000) {
                com.google.android.gms.internal.ads.zzdo.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.zzc || iZza >= iZza2) {
            zzhwVar.zza = false;
        }
        return zzhwVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzi(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, long j) {
        java.util.Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.internal.ads.zzhw) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(com.google.android.gms.internal.ads.zzkf zzkfVar) {
        boolean z = zzkfVar.zzd;
        long jZzr = com.google.android.gms.internal.ads.zzei.zzr(zzkfVar.zzb, zzkfVar.zzc);
        long jMin = z ? this.zze : this.zzd;
        long j = zzkfVar.zze;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            jMin = java.lang.Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jZzr >= jMin || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final com.google.android.gms.internal.ads.zzyk zzk() {
        return this.zza;
    }
}
