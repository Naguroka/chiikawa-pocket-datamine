package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaap {
    private final com.google.android.gms.internal.ads.zzzj zza = new com.google.android.gms.internal.ads.zzzj();
    private final com.google.android.gms.internal.ads.zzaan zzb;
    private final com.google.android.gms.internal.ads.zzaao zzc;
    private boolean zzd;
    private android.view.Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzaap zzaapVar, android.view.Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzaapVar.zzk = refreshRate;
            zzaapVar.zzl = (refreshRate * 80) / 100;
        } else {
            com.google.android.gms.internal.ads.zzdo.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaapVar.zzk = androidx.media3.common.C.TIME_UNSET;
            zzaapVar.zzl = androidx.media3.common.C.TIME_UNSET;
        }
    }

    private final void zzk() {
        android.view.Surface surface;
        if (com.google.android.gms.internal.ads.zzei.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        com.google.android.gms.internal.ads.zzaam.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    private final void zzm() {
        if (com.google.android.gms.internal.ads.zzei.zza < 30 || this.zze == null) {
            return;
        }
        float fZza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (fZza != f) {
            boolean z = true;
            if (fZza != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if (java.lang.Math.abs(fZza - this.zzg) < f2) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } else if (fZza == -1.0f) {
                if (this.zza.zzb() < 30) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            this.zzg = fZza;
            zzn(false);
        }
    }

    private final void zzn(boolean z) {
        android.view.Surface surface;
        if (com.google.android.gms.internal.ads.zzei.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            com.google.android.gms.internal.ads.zzaam.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long jZzc = this.zzq + ((long) ((this.zza.zzc() * (this.zzm - this.zzp)) / this.zzi));
            if (java.lang.Math.abs(j - jZzc) > 20000000) {
                zzl();
            } else {
                j = jZzc;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        com.google.android.gms.internal.ads.zzaao zzaaoVar = this.zzc;
        if (zzaaoVar != null && this.zzk != androidx.media3.common.C.TIME_UNSET) {
            long j3 = zzaaoVar.zza;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                long j4 = this.zzk;
                long j5 = j3 + (((j - j3) / j4) * j4);
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    j5 = j4 + j5;
                    j2 = j5;
                }
                long j6 = this.zzl;
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - j6;
            }
        }
        return j;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            com.google.android.gms.internal.ads.zzaao zzaaoVar = this.zzc;
            zzaaoVar.getClass();
            zzaaoVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        com.google.android.gms.internal.ads.zzaan zzaanVar = this.zzb;
        if (zzaanVar != null) {
            zzaanVar.zzb();
            com.google.android.gms.internal.ads.zzaao zzaaoVar = this.zzc;
            zzaaoVar.getClass();
            zzaaoVar.zzc();
        }
        zzk();
    }

    public final void zzi(android.view.Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }

    public zzaap(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager;
        com.google.android.gms.internal.ads.zzaan zzaanVar = (context == null || (displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display")) == null) ? null : new com.google.android.gms.internal.ads.zzaan(this, displayManager);
        this.zzb = zzaanVar;
        this.zzc = zzaanVar != null ? com.google.android.gms.internal.ads.zzaao.zza() : null;
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }
}
