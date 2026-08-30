package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzpq {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private com.google.android.gms.internal.ads.zzcx zzI;
    private final com.google.android.gms.internal.ads.zzpp zza;
    private final long[] zzb;
    private android.media.AudioTrack zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzpo zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private java.lang.reflect.Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpq(com.google.android.gms.internal.ads.zzpp zzppVar) {
        this.zza = zzppVar;
        try {
            this.zzm = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = com.google.android.gms.internal.ads.zzcx.zza;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    private final long zzl() {
        long jZzb = this.zzI.zzb();
        int i = 2;
        if (this.zzx != androidx.media3.common.C.TIME_UNSET) {
            android.media.AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return java.lang.Math.min(this.zzA, this.zzz + com.google.android.gms.internal.ads.zzei.zzp(com.google.android.gms.internal.ads.zzei.zzq(com.google.android.gms.internal.ads.zzei.zzs(jZzb) - this.zzx, this.zzi), this.zzf));
        }
        if (jZzb - this.zzr >= 5) {
            android.media.AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition();
                boolean z = this.zzg;
                long j = playbackHeadPosition & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
                long j2 = 0;
                if (z) {
                    if (playState != 2) {
                        i = playState;
                    } else if (j == 0) {
                        this.zzu = this.zzs;
                    }
                    j += this.zzu;
                    playState = i;
                }
                if (com.google.android.gms.internal.ads.zzei.zza > 29) {
                    if (this.zzs > j) {
                        this.zzt++;
                    }
                    this.zzs = j;
                } else {
                    if (j != 0) {
                        j2 = j;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == androidx.media3.common.C.TIME_UNSET) {
                            this.zzy = jZzb;
                        }
                    }
                    this.zzy = androidx.media3.common.C.TIME_UNSET;
                    j = j2;
                    if (this.zzs > j) {
                        this.zzt++;
                    }
                    this.zzs = j;
                }
            }
            this.zzr = jZzb;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return com.google.android.gms.internal.ads.zzei.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff A[Catch: Exception -> 0x0107, TRY_LEAVE, TryCatch #0 {Exception -> 0x0107, blocks: (B:34:0x00d8, B:36:0x00dd, B:38:0x00ff), top: B:65:0x00d8 }] */
    public final long zza(boolean z) {
        long jMax;
        com.google.android.gms.internal.ads.zzpo zzpoVar;
        long jZzb;
        long jZza;
        long jZzm;
        int i;
        java.lang.reflect.Method method;
        long jMax2;
        android.media.AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzI.zzc() / 1000;
            if (jZzc - this.zzl >= 30000) {
                long jZzm2 = zzm();
                if (jZzm2 != 0) {
                    this.zzb[this.zzv] = com.google.android.gms.internal.ads.zzei.zzr(jZzm2, this.zzi) - jZzc;
                    this.zzv = (this.zzv + 1) % 10;
                    int i2 = this.zzw;
                    if (i2 < 10) {
                        this.zzw = i2 + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzk += this.zzb[i3] / ((long) i4);
                        i3++;
                    }
                    if (!this.zzg) {
                        zzpoVar = this.zze;
                        zzpoVar.getClass();
                        if (zzpoVar.zzg(jZzc)) {
                            jZzb = zzpoVar.zzb();
                            jZza = zzpoVar.zza();
                            jZzm = zzm();
                            if (java.lang.Math.abs(jZzb - jZzc) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                i = 0;
                                this.zza.zzd(jZza, jZzb, jZzc, jZzm);
                                zzpoVar.zzd();
                            } else {
                                i = 0;
                                if (java.lang.Math.abs(com.google.android.gms.internal.ads.zzei.zzt(jZza, this.zzf) - jZzm) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                    this.zza.zzc(jZza, jZzb, jZzc, jZzm);
                                    zzpoVar.zzd();
                                } else {
                                    zzpoVar.zzc();
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (this.zzp && (method = this.zzm) != null && jZzc - this.zzq >= 500000) {
                            try {
                                android.media.AudioTrack audioTrack2 = this.zzc;
                                audioTrack2.getClass();
                                java.lang.Integer num = (java.lang.Integer) method.invoke(audioTrack2, new java.lang.Object[i]);
                                int i5 = com.google.android.gms.internal.ads.zzei.zza;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.zzh;
                                this.zzn = jIntValue;
                                jMax2 = java.lang.Math.max(jIntValue, 0L);
                                this.zzn = jMax2;
                                if (jMax2 > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                    this.zza.zza(jMax2);
                                    this.zzn = 0L;
                                }
                            } catch (java.lang.Exception unused) {
                                this.zzm = null;
                            }
                            this.zzq = jZzc;
                        }
                    }
                }
            } else if (!this.zzg) {
                zzpoVar = this.zze;
                zzpoVar.getClass();
                if (zzpoVar.zzg(jZzc)) {
                    i = 0;
                } else {
                    jZzb = zzpoVar.zzb();
                    jZza = zzpoVar.zza();
                    jZzm = zzm();
                    if (java.lang.Math.abs(jZzb - jZzc) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                        i = 0;
                        this.zza.zzd(jZza, jZzb, jZzc, jZzm);
                        zzpoVar.zzd();
                    } else {
                        i = 0;
                        if (java.lang.Math.abs(com.google.android.gms.internal.ads.zzei.zzt(jZza, this.zzf) - jZzm) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            this.zza.zzc(jZza, jZzb, jZzc, jZzm);
                            zzpoVar.zzd();
                        } else {
                            zzpoVar.zzc();
                        }
                    }
                }
                if (this.zzp) {
                    android.media.AudioTrack audioTrack3 = this.zzc;
                    audioTrack3.getClass();
                    java.lang.Integer num2 = (java.lang.Integer) method.invoke(audioTrack3, new java.lang.Object[i]);
                    int i6 = com.google.android.gms.internal.ads.zzei.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzh;
                    this.zzn = jIntValue2;
                    jMax2 = java.lang.Math.max(jIntValue2, 0L);
                    this.zzn = jMax2;
                    if (jMax2 > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                        this.zza.zza(jMax2);
                        this.zzn = 0L;
                    }
                    this.zzq = jZzc;
                }
            }
        }
        long jZzc2 = this.zzI.zzc() / 1000;
        com.google.android.gms.internal.ads.zzpo zzpoVar2 = this.zze;
        zzpoVar2.getClass();
        boolean zZzf = zzpoVar2.zzf();
        if (zZzf) {
            jMax = com.google.android.gms.internal.ads.zzei.zzt(zzpoVar2.zza(), this.zzf) + com.google.android.gms.internal.ads.zzei.zzq(jZzc2 - zzpoVar2.zzb(), this.zzi);
        } else {
            long jZzm3 = this.zzw == 0 ? zzm() : com.google.android.gms.internal.ads.zzei.zzq(this.zzk + jZzc2, this.zzi);
            jMax = !z ? java.lang.Math.max(0L, jZzm3 - this.zzn) : jZzm3;
        }
        if (this.zzD != zZzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j = jZzc2 - this.zzF;
        if (j < 1000000) {
            long jZzq = this.zzE + com.google.android.gms.internal.ads.zzei.zzq(j, this.zzi);
            long j2 = (j * 1000) / 1000000;
            jMax = ((jMax * j2) + ((1000 - j2) * jZzq)) / 1000;
        }
        if (!this.zzj) {
            long j3 = this.zzB;
            if (jMax > j3) {
                this.zzj = true;
                int i7 = com.google.android.gms.internal.ads.zzei.zza;
                this.zza.zzb(this.zzI.zza() - com.google.android.gms.internal.ads.zzei.zzv(com.google.android.gms.internal.ads.zzei.zzr(com.google.android.gms.internal.ads.zzei.zzv(jMax - j3), this.zzi)));
            }
        }
        this.zzC = jZzc2;
        this.zzB = jMax;
        this.zzD = zZzf;
        return jMax;
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = com.google.android.gms.internal.ads.zzei.zzs(this.zzI.zzb());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final void zzd(android.media.AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i3;
        this.zze = new com.google.android.gms.internal.ads.zzpo(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (!z || com.google.android.gms.internal.ads.zzei.zza >= 23) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                } else {
                    z2 = false;
                }
            }
        }
        this.zzg = z2;
        boolean zZzJ = com.google.android.gms.internal.ads.zzei.zzJ(i);
        this.zzp = zZzJ;
        this.zzh = zZzJ ? com.google.android.gms.internal.ads.zzei.zzt(i3 / i2, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = androidx.media3.common.C.TIME_UNSET;
        this.zzy = androidx.media3.common.C.TIME_UNSET;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze(com.google.android.gms.internal.ads.zzcx zzcxVar) {
        this.zzI = zzcxVar;
    }

    public final void zzf() {
        if (this.zzx != androidx.media3.common.C.TIME_UNSET) {
            this.zzx = com.google.android.gms.internal.ads.zzei.zzs(this.zzI.zzb());
        }
        com.google.android.gms.internal.ads.zzpo zzpoVar = this.zze;
        zzpoVar.getClass();
        zzpoVar.zze();
    }

    public final boolean zzg(long j) {
        if (j > com.google.android.gms.internal.ads.zzei.zzp(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            android.media.AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        android.media.AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != androidx.media3.common.C.TIME_UNSET && j > 0 && this.zzI.zzb() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        android.media.AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zZzg = zzg(j);
        this.zzo = zZzg;
        if (z && !zZzg && playState != 1) {
            this.zza.zze(this.zzd, com.google.android.gms.internal.ads.zzei.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != androidx.media3.common.C.TIME_UNSET) {
            this.zzz = zzl();
            return false;
        }
        com.google.android.gms.internal.ads.zzpo zzpoVar = this.zze;
        zzpoVar.getClass();
        zzpoVar.zze();
        return true;
    }
}
