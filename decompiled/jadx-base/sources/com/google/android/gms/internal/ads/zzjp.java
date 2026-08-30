package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzjp extends com.google.android.gms.internal.ads.zzg implements com.google.android.gms.internal.ads.zzim {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private com.google.android.gms.internal.ads.zzlp zzB;
    private com.google.android.gms.internal.ads.zzil zzC;
    private com.google.android.gms.internal.ads.zzbg zzD;
    private com.google.android.gms.internal.ads.zzav zzE;
    private java.lang.Object zzF;
    private android.view.Surface zzG;
    private int zzH;
    private com.google.android.gms.internal.ads.zzdz zzI;
    private int zzJ;
    private com.google.android.gms.internal.ads.zze zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private com.google.android.gms.internal.ads.zzav zzQ;
    private com.google.android.gms.internal.ads.zzlb zzR;
    private int zzS;
    private long zzT;
    private final com.google.android.gms.internal.ads.zzix zzU;
    private com.google.android.gms.internal.ads.zzwb zzV;
    final com.google.android.gms.internal.ads.zzyc zzb;
    final com.google.android.gms.internal.ads.zzbg zzc;
    private final com.google.android.gms.internal.ads.zzda zze;
    private final android.content.Context zzf;
    private final com.google.android.gms.internal.ads.zzbk zzg;
    private final com.google.android.gms.internal.ads.zzlj[] zzh;
    private final com.google.android.gms.internal.ads.zzyb zzi;
    private final com.google.android.gms.internal.ads.zzdh zzj;
    private final com.google.android.gms.internal.ads.zzkc zzk;
    private final com.google.android.gms.internal.ads.zzdn zzl;
    private final java.util.concurrent.CopyOnWriteArraySet zzm;
    private final com.google.android.gms.internal.ads.zzbo zzn;
    private final java.util.List zzo;
    private final boolean zzp;
    private final com.google.android.gms.internal.ads.zzlt zzq;
    private final android.os.Looper zzr;
    private final com.google.android.gms.internal.ads.zzyj zzs;
    private final com.google.android.gms.internal.ads.zzcx zzt;
    private final com.google.android.gms.internal.ads.zzjl zzu;
    private final com.google.android.gms.internal.ads.zzjm zzv;
    private final com.google.android.gms.internal.ads.zzhq zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        com.google.android.gms.internal.ads.zzas.zzb("media3.exoplayer");
    }

    public zzjp(com.google.android.gms.internal.ads.zzik zzikVar, com.google.android.gms.internal.ads.zzbk zzbkVar) {
        com.google.android.gms.internal.ads.zzog zzogVar;
        com.google.android.gms.internal.ads.zzda zzdaVar = new com.google.android.gms.internal.ads.zzda(com.google.android.gms.internal.ads.zzcx.zza);
        this.zze = zzdaVar;
        try {
            com.google.android.gms.internal.ads.zzdo.zze("ExoPlayerImpl", "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + com.google.android.gms.internal.ads.zzei.zze + com.ironsource.y8.i.e);
            android.content.Context applicationContext = zzikVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            com.google.android.gms.internal.ads.zzlt zzltVar = (com.google.android.gms.internal.ads.zzlt) zzikVar.zzh.apply(zzikVar.zzb);
            this.zzq = zzltVar;
            this.zzP = zzikVar.zzj;
            this.zzK = zzikVar.zzk;
            this.zzH = zzikVar.zzl;
            this.zzM = false;
            this.zzx = zzikVar.zzp;
            com.google.android.gms.internal.ads.zzjo zzjoVar = null;
            com.google.android.gms.internal.ads.zzjl zzjlVar = new com.google.android.gms.internal.ads.zzjl(this, zzjoVar);
            this.zzu = zzjlVar;
            com.google.android.gms.internal.ads.zzjm zzjmVar = new com.google.android.gms.internal.ads.zzjm(zzjoVar);
            this.zzv = zzjmVar;
            android.os.Handler handler = new android.os.Handler(zzikVar.zzi);
            com.google.android.gms.internal.ads.zzced zzcedVar = ((com.google.android.gms.internal.ads.zzid) zzikVar.zzc).zza;
            com.google.android.gms.internal.ads.zzlj[] zzljVarArrZza = zzcedVar.zza(handler, zzjlVar, zzjlVar, zzjlVar, zzjlVar);
            this.zzh = zzljVarArrZza;
            int length = zzljVarArrZza.length;
            com.google.android.gms.internal.ads.zzyb zzybVar = (com.google.android.gms.internal.ads.zzyb) zzikVar.zze.zza();
            this.zzi = zzybVar;
            com.google.android.gms.internal.ads.zzik.zza(((com.google.android.gms.internal.ads.zzie) zzikVar.zzd).zza);
            com.google.android.gms.internal.ads.zzyn zzynVarZzh = com.google.android.gms.internal.ads.zzyn.zzh(((com.google.android.gms.internal.ads.zzih) zzikVar.zzg).zza);
            this.zzs = zzynVarZzh;
            this.zzp = zzikVar.zzm;
            this.zzB = zzikVar.zzn;
            android.os.Looper looper = zzikVar.zzi;
            this.zzr = looper;
            com.google.android.gms.internal.ads.zzcx zzcxVar = zzikVar.zzb;
            this.zzt = zzcxVar;
            this.zzg = zzbkVar;
            com.google.android.gms.internal.ads.zzdn zzdnVar = new com.google.android.gms.internal.ads.zzdn(looper, zzcxVar, new com.google.android.gms.internal.ads.zzdl(this) { // from class: com.google.android.gms.internal.ads.zziw
                @Override // com.google.android.gms.internal.ads.zzdl
                public final void zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzx zzxVar) {
                }
            });
            this.zzl = zzdnVar;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new java.util.ArrayList();
            this.zzV = new com.google.android.gms.internal.ads.zzwb(0);
            this.zzC = com.google.android.gms.internal.ads.zzil.zza;
            int length2 = zzljVarArrZza.length;
            com.google.android.gms.internal.ads.zzyc zzycVar = new com.google.android.gms.internal.ads.zzyc(new com.google.android.gms.internal.ads.zzln[2], new com.google.android.gms.internal.ads.zzxv[2], com.google.android.gms.internal.ads.zzby.zza, null);
            this.zzb = zzycVar;
            this.zzn = new com.google.android.gms.internal.ads.zzbo();
            com.google.android.gms.internal.ads.zzbf zzbfVar = new com.google.android.gms.internal.ads.zzbf();
            zzbfVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzybVar.zzn();
            zzbfVar.zzd(29, true);
            zzbfVar.zzd(23, false);
            zzbfVar.zzd(25, false);
            zzbfVar.zzd(33, false);
            zzbfVar.zzd(26, false);
            zzbfVar.zzd(34, false);
            com.google.android.gms.internal.ads.zzbg zzbgVarZze = zzbfVar.zze();
            this.zzc = zzbgVarZze;
            com.google.android.gms.internal.ads.zzbf zzbfVar2 = new com.google.android.gms.internal.ads.zzbf();
            zzbfVar2.zzb(zzbgVarZze);
            zzbfVar2.zza(4);
            zzbfVar2.zza(10);
            this.zzD = zzbfVar2.zze();
            this.zzj = zzcxVar.zzd(looper, null);
            com.google.android.gms.internal.ads.zzix zzixVar = new com.google.android.gms.internal.ads.zzix(this);
            this.zzU = zzixVar;
            this.zzR = com.google.android.gms.internal.ads.zzlb.zzg(zzycVar);
            zzltVar.zzS(zzbkVar, looper);
            if (com.google.android.gms.internal.ads.zzei.zza < 31) {
                zzogVar = new com.google.android.gms.internal.ads.zzog(zzikVar.zzs);
            } else {
                boolean z = zzikVar.zzq;
                java.lang.String str = zzikVar.zzs;
                com.google.android.gms.internal.ads.zzoc zzocVarZzb = com.google.android.gms.internal.ads.zzoc.zzb(applicationContext);
                if (zzocVarZzb == null) {
                    com.google.android.gms.internal.ads.zzdo.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    zzogVar = new com.google.android.gms.internal.ads.zzog(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z) {
                        zzy(zzocVarZzb);
                    }
                    zzogVar = new com.google.android.gms.internal.ads.zzog(zzocVarZzb.zza(), str);
                }
            }
            this.zzk = new com.google.android.gms.internal.ads.zzkc(zzljVarArrZza, zzybVar, zzycVar, (com.google.android.gms.internal.ads.zzkg) zzikVar.zzf.zza(), zzynVarZzh, 0, false, zzltVar, this.zzB, zzikVar.zzt, zzikVar.zzo, false, false, looper, zzcxVar, zzixVar, zzogVar, null, this.zzC);
            this.zzL = 1.0f;
            this.zzE = com.google.android.gms.internal.ads.zzav.zza;
            this.zzQ = com.google.android.gms.internal.ads.zzav.zza;
            this.zzS = -1;
            android.media.AudioManager audioManager = (android.media.AudioManager) applicationContext.getSystemService("audio");
            this.zzJ = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i = com.google.android.gms.internal.ads.zzcp.zza;
            this.zzN = true;
            zzltVar.getClass();
            zzdnVar.zzb(zzltVar);
            zzynVarZzh.zzf(new android.os.Handler(looper), zzltVar);
            copyOnWriteArraySet.add(zzjlVar);
            new com.google.android.gms.internal.ads.zzhl(zzikVar.zza, handler, zzjlVar);
            this.zzw = new com.google.android.gms.internal.ads.zzhq(zzikVar.zza, handler, zzjlVar);
            java.util.Objects.equals(null, null);
            zzikVar.zza.getApplicationContext();
            zzikVar.zza.getApplicationContext();
            new com.google.android.gms.internal.ads.zzo(0).zza();
            com.google.android.gms.internal.ads.zzcd zzcdVar = com.google.android.gms.internal.ads.zzcd.zza;
            this.zzI = com.google.android.gms.internal.ads.zzdz.zza;
            zzybVar.zzk(this.zzK);
            zzaa(1, 10, java.lang.Integer.valueOf(this.zzJ));
            zzaa(2, 10, java.lang.Integer.valueOf(this.zzJ));
            zzaa(1, 3, this.zzK);
            zzaa(2, 4, java.lang.Integer.valueOf(this.zzH));
            zzaa(2, 5, 0);
            zzaa(1, 9, java.lang.Boolean.valueOf(this.zzM));
            zzaa(2, 7, zzjmVar);
            zzaa(6, 8, zzjmVar);
            zzaa(-1, 16, java.lang.Integer.valueOf(this.zzP));
            zzdaVar.zze();
        } catch (java.lang.Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzK(com.google.android.gms.internal.ads.zzjp zzjpVar, android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        zzjpVar.zzac(surface);
        zzjpVar.zzG = surface;
    }

    private final int zzR(com.google.android.gms.internal.ads.zzlb zzlbVar) {
        return zzlbVar.zza.zzo() ? this.zzS : zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn).zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzS(int i) {
        return i == -1 ? 2 : 1;
    }

    private final long zzT(com.google.android.gms.internal.ads.zzlb zzlbVar) {
        if (!zzlbVar.zzb.zzb()) {
            return com.google.android.gms.internal.ads.zzei.zzv(zzU(zzlbVar));
        }
        zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn);
        if (zzlbVar.zzc == androidx.media3.common.C.TIME_UNSET) {
            long j = zzlbVar.zza.zze(zzR(zzlbVar), this.zza, 0L).zzl;
            return com.google.android.gms.internal.ads.zzei.zzv(0L);
        }
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return com.google.android.gms.internal.ads.zzei.zzv(0L) + com.google.android.gms.internal.ads.zzei.zzv(zzlbVar.zzc);
    }

    private final long zzU(com.google.android.gms.internal.ads.zzlb zzlbVar) {
        if (zzlbVar.zza.zzo()) {
            return com.google.android.gms.internal.ads.zzei.zzs(this.zzT);
        }
        boolean z = zzlbVar.zzp;
        long j = zzlbVar.zzs;
        if (zzlbVar.zzb.zzb()) {
            return j;
        }
        zzW(zzlbVar.zza, zzlbVar.zzb, j);
        return j;
    }

    private static long zzV(com.google.android.gms.internal.ads.zzlb zzlbVar) {
        com.google.android.gms.internal.ads.zzbp zzbpVar = new com.google.android.gms.internal.ads.zzbp();
        com.google.android.gms.internal.ads.zzbo zzboVar = new com.google.android.gms.internal.ads.zzbo();
        zzlbVar.zza.zzn(zzlbVar.zzb.zza, zzboVar);
        long j = zzlbVar.zzc;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        long j2 = zzlbVar.zza.zze(zzboVar.zzc, zzbpVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, long j) {
        zzbqVar.zzn(zzugVar.zza, this.zzn);
        return j;
    }

    private final android.util.Pair zzX(com.google.android.gms.internal.ads.zzbq zzbqVar, int i, long j) {
        if (zzbqVar.zzo()) {
            this.zzS = i;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = 0;
            }
            this.zzT = j;
            return null;
        }
        if (i == -1 || i >= zzbqVar.zzc()) {
            i = zzbqVar.zzg(false);
            long j2 = zzbqVar.zze(i, this.zza, 0L).zzl;
            j = com.google.android.gms.internal.ads.zzei.zzv(0L);
        }
        return zzbqVar.zzl(this.zza, this.zzn, i, com.google.android.gms.internal.ads.zzei.zzs(j));
    }

    private final com.google.android.gms.internal.ads.zzlb zzY(com.google.android.gms.internal.ads.zzlb zzlbVar, com.google.android.gms.internal.ads.zzbq zzbqVar, android.util.Pair pair) {
        com.google.android.gms.internal.ads.zzcw.zzd(zzbqVar.zzo() || pair != null);
        com.google.android.gms.internal.ads.zzbq zzbqVar2 = zzlbVar.zza;
        long jZzT = zzT(zzlbVar);
        com.google.android.gms.internal.ads.zzlb zzlbVarZzf = zzlbVar.zzf(zzbqVar);
        if (zzbqVar.zzo()) {
            com.google.android.gms.internal.ads.zzug zzugVarZzh = com.google.android.gms.internal.ads.zzlb.zzh();
            long jZzs = com.google.android.gms.internal.ads.zzei.zzs(this.zzT);
            com.google.android.gms.internal.ads.zzlb zzlbVarZza = zzlbVarZzf.zzb(zzugVarZzh, jZzs, jZzs, jZzs, 0L, com.google.android.gms.internal.ads.zzwj.zza, this.zzb, com.google.android.gms.internal.ads.zzfxn.zzn()).zza(zzugVarZzh);
            zzlbVarZza.zzq = zzlbVarZza.zzs;
            return zzlbVarZza;
        }
        java.lang.Object obj = zzlbVarZzf.zzb.zza;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        boolean z = !obj.equals(pair.first);
        com.google.android.gms.internal.ads.zzug zzugVar = z ? new com.google.android.gms.internal.ads.zzug(pair.first, -1L) : zzlbVarZzf.zzb;
        long jLongValue = ((java.lang.Long) pair.second).longValue();
        long jZzs2 = com.google.android.gms.internal.ads.zzei.zzs(jZzT);
        if (!zzbqVar2.zzo()) {
            zzbqVar2.zzn(obj, this.zzn);
        }
        if (z || jLongValue < jZzs2) {
            com.google.android.gms.internal.ads.zzcw.zzf(!zzugVar.zzb());
            com.google.android.gms.internal.ads.zzlb zzlbVarZza2 = zzlbVarZzf.zzb(zzugVar, jLongValue, jLongValue, jLongValue, 0L, z ? com.google.android.gms.internal.ads.zzwj.zza : zzlbVarZzf.zzh, z ? this.zzb : zzlbVarZzf.zzi, z ? com.google.android.gms.internal.ads.zzfxn.zzn() : zzlbVarZzf.zzj).zza(zzugVar);
            zzlbVarZza2.zzq = jLongValue;
            return zzlbVarZza2;
        }
        if (jLongValue != jZzs2) {
            com.google.android.gms.internal.ads.zzcw.zzf(!zzugVar.zzb());
            long jMax = java.lang.Math.max(0L, zzlbVarZzf.zzr - (jLongValue - jZzs2));
            long j = zzlbVarZzf.zzq;
            if (zzlbVarZzf.zzk.equals(zzlbVarZzf.zzb)) {
                j = jLongValue + jMax;
            }
            com.google.android.gms.internal.ads.zzlb zzlbVarZzb = zzlbVarZzf.zzb(zzugVar, jLongValue, jLongValue, jLongValue, jMax, zzlbVarZzf.zzh, zzlbVarZzf.zzi, zzlbVarZzf.zzj);
            zzlbVarZzb.zzq = j;
            return zzlbVarZzb;
        }
        int iZza = zzbqVar.zza(zzlbVarZzf.zzk.zza);
        if (iZza != -1 && zzbqVar.zzd(iZza, this.zzn, false).zzc == zzbqVar.zzn(zzugVar.zza, this.zzn).zzc) {
            return zzlbVarZzf;
        }
        zzbqVar.zzn(zzugVar.zza, this.zzn);
        long jZzf = zzugVar.zzb() ? this.zzn.zzf(zzugVar.zzb, zzugVar.zzc) : this.zzn.zzd;
        com.google.android.gms.internal.ads.zzlb zzlbVarZza3 = zzlbVarZzf.zzb(zzugVar, zzlbVarZzf.zzs, zzlbVarZzf.zzs, zzlbVarZzf.zzd, jZzf - zzlbVarZzf.zzs, zzlbVarZzf.zzh, zzlbVarZzf.zzi, zzlbVarZzf.zzj).zza(zzugVar);
        zzlbVarZza3.zzq = jZzf;
        return zzlbVarZza3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzZ(final int i, final int i2) {
        if (i == this.zzI.zzb() && i2 == this.zzI.zza()) {
            return;
        }
        this.zzI = new com.google.android.gms.internal.ads.zzdz(i, i2);
        com.google.android.gms.internal.ads.zzdn zzdnVar = this.zzl;
        zzdnVar.zzd(24, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzit
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                int i3 = com.google.android.gms.internal.ads.zzjp.zzd;
                ((com.google.android.gms.internal.ads.zzbh) obj).zzo(i, i2);
            }
        });
        zzdnVar.zzc();
        zzaa(2, 14, new com.google.android.gms.internal.ads.zzdz(i, i2));
    }

    private final void zzaa(int i, int i2, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzlj[] zzljVarArr = this.zzh;
        int length = zzljVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            com.google.android.gms.internal.ads.zzlj zzljVar = zzljVarArr[i3];
            if (i == -1 || zzljVar.zzb() == i) {
                int iZzR = zzR(this.zzR);
                com.google.android.gms.internal.ads.zzkc zzkcVar = this.zzk;
                com.google.android.gms.internal.ads.zzlf zzlfVar = new com.google.android.gms.internal.ads.zzlf(zzkcVar, zzljVar, this.zzR.zza, iZzR == -1 ? 0 : iZzR, this.zzt, zzkcVar.zzc());
                zzlfVar.zzf(i2);
                zzlfVar.zze(obj);
                zzlfVar.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzaa(1, 2, java.lang.Float.valueOf(this.zzL * this.zzw.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(java.lang.Object obj) {
        java.lang.Object obj2 = this.zzF;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zZzq = this.zzk.zzq(obj, z ? this.zzx : androidx.media3.common.C.TIME_UNSET);
        if (z) {
            java.lang.Object obj3 = this.zzF;
            android.view.Surface surface = this.zzG;
            if (obj3 == surface) {
                surface.release();
                this.zzG = null;
            }
        }
        this.zzF = obj;
        if (zZzq) {
            return;
        }
        zzad(com.google.android.gms.internal.ads.zzib.zzd(new com.google.android.gms.internal.ads.zzkd(3), 1003));
    }

    private final void zzad(com.google.android.gms.internal.ads.zzib zzibVar) {
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzR;
        com.google.android.gms.internal.ads.zzlb zzlbVarZza = zzlbVar.zza(zzlbVar.zzb);
        zzlbVarZza.zzq = zzlbVarZza.zzs;
        zzlbVarZza.zzr = 0L;
        com.google.android.gms.internal.ads.zzlb zzlbVarZze = zzlbVarZza.zze(1);
        if (zzibVar != null) {
            zzlbVarZze = zzlbVarZze.zzd(zzibVar);
        }
        this.zzy++;
        this.zzk.zzo();
        zzaf(zzlbVarZze, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        int i3 = i == 0 ? 1 : 0;
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzR;
        if (zzlbVar.zzl == z2 && zzlbVar.zzn == i3 && zzlbVar.zzm == i2) {
            return;
        }
        this.zzy++;
        boolean z3 = zzlbVar.zzp;
        com.google.android.gms.internal.ads.zzlb zzlbVarZzc = zzlbVar.zzc(z2, i2, i3);
        this.zzk.zzn(z2, i2, i3);
        zzaf(zzlbVarZzc, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x030e  */
    /* JADX WARN: Code duplicated, block: B:114:0x031e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0332  */
    /* JADX WARN: Code duplicated, block: B:118:0x0342  */
    /* JADX WARN: Code duplicated, block: B:121:0x0351  */
    /* JADX WARN: Code duplicated, block: B:124:0x035f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0372  */
    /* JADX WARN: Code duplicated, block: B:132:0x0383  */
    /* JADX WARN: Code duplicated, block: B:135:0x0398  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:150:0x0405  */
    /* JADX WARN: Code duplicated, block: B:151:0x0408  */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:155:0x0416  */
    /* JADX WARN: Code duplicated, block: B:157:0x0426  */
    /* JADX WARN: Code duplicated, block: B:160:0x0431  */
    /* JADX WARN: Code duplicated, block: B:162:0x0445  */
    /* JADX WARN: Code duplicated, block: B:163:0x0447  */
    /* JADX WARN: Code duplicated, block: B:167:0x0456  */
    /* JADX WARN: Code duplicated, block: B:170:0x0466  */
    /* JADX WARN: Code duplicated, block: B:173:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0482  */
    /* JADX WARN: Code duplicated, block: B:178:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x048c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x049d  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:196:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:214:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c A[LOOP:1: B:50:0x0136->B:52:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x015c  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0208  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x021f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0226  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x0238  */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
    /* JADX WARN: Code duplicated, block: B:96:0x026b  */
    /* JADX WARN: Code duplicated, block: B:97:0x029e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r50v4 */
    /* JADX WARN: Type inference failed for: r50v5 */
    /* JADX WARN: Type inference failed for: r50v6 */
    /* JADX WARN: Type inference failed for: r50v7 */
    /* JADX WARN: Type inference failed for: r8v24, types: [com.google.android.gms.internal.ads.zzbq] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v30 */
    private final void zzaf(final com.google.android.gms.internal.ads.zzlb zzlbVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        boolean z3;
        boolean z4;
        android.util.Pair pair;
        boolean z5;
        int i5;
        boolean zBooleanValue;
        final int iIntValue;
        final com.google.android.gms.internal.ads.zzar zzarVar;
        com.google.android.gms.internal.ads.zzat zzatVarZza;
        java.util.List list;
        int i6;
        com.google.android.gms.internal.ads.zzay zzayVar;
        int i7;
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn;
        com.google.android.gms.internal.ads.zzav zzavVarZzu;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        com.google.android.gms.internal.ads.zzyc zzycVar;
        com.google.android.gms.internal.ads.zzyc zzycVar2;
        com.google.android.gms.internal.ads.zzbg zzbgVar;
        com.google.android.gms.internal.ads.zzg zzgVar;
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn2;
        boolean z10;
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn3;
        ?? r10;
        int iZzk;
        int i8;
        boolean z11;
        ?? Zzn;
        int iZzd;
        ?? r8;
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn4;
        ?? r50;
        long j2;
        boolean z12;
        ?? r51;
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn5;
        boolean z13;
        boolean zZzo;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i9;
        boolean z19;
        boolean z20;
        com.google.android.gms.internal.ads.zzbg zzbgVarZze;
        ?? r52;
        com.google.android.gms.internal.ads.zzbo zzboVar;
        int i10;
        java.lang.Object obj;
        com.google.android.gms.internal.ads.zzar zzarVar2;
        java.lang.Object obj2;
        int i11;
        long jZzV;
        long jZzV2;
        int iZzd2;
        java.lang.Object obj3;
        com.google.android.gms.internal.ads.zzar zzarVar3;
        java.lang.Object obj4;
        int iZza;
        long jZzv;
        long jZzv2;
        final int i12 = i2;
        com.google.android.gms.internal.ads.zzlb zzlbVar2 = this.zzR;
        this.zzR = zzlbVar;
        boolean z21 = !zzlbVar2.zza.equals(zzlbVar.zza);
        com.google.android.gms.internal.ads.zzbq zzbqVar = zzlbVar2.zza;
        com.google.android.gms.internal.ads.zzbq zzbqVar2 = zzlbVar.zza;
        if (!zzbqVar2.zzo() || !zzbqVar.zzo()) {
            if (zzbqVar2.zzo() != zzbqVar.zzo()) {
                pair = new android.util.Pair(true, 3);
            } else if (zzbqVar.zze(zzbqVar.zzn(zzlbVar2.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb.equals(zzbqVar2.zze(zzbqVar2.zzn(zzlbVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb)) {
                if (!z) {
                    i4 = i12;
                    z3 = false;
                } else if (i12 != 0) {
                    i4 = i12;
                    z3 = true;
                } else if (zzlbVar2.zzb.zzd < zzlbVar.zzb.zzd) {
                    pair = new android.util.Pair(true, 0);
                    z4 = true;
                    i12 = 0;
                } else {
                    z3 = true;
                    i4 = 0;
                }
                z4 = z3;
                i12 = i4;
                pair = new android.util.Pair(false, -1);
            } else {
                if (z) {
                    if (i12 == 0) {
                        z4 = true;
                        i5 = 1;
                        i12 = 0;
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                    pair = new android.util.Pair(true, java.lang.Integer.valueOf(i5));
                } else {
                    z4 = false;
                    z5 = false;
                }
                if (z4 && i12 == 1) {
                    z4 = z5;
                    i5 = 2;
                } else {
                    if (!z21) {
                        throw new java.lang.IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new android.util.Pair(true, java.lang.Integer.valueOf(i5));
            }
            zBooleanValue = ((java.lang.Boolean) pair.first).booleanValue();
            iIntValue = ((java.lang.Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzlbVar.zza.zzo()) {
                    zzarVar = null;
                } else {
                    zzarVar = zzlbVar.zza.zze(zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd;
                }
                this.zzQ = com.google.android.gms.internal.ads.zzav.zza;
            } else {
                zzarVar = null;
            }
            if (zBooleanValue || !zzlbVar2.zzj.equals(zzlbVar.zzj)) {
                zzatVarZza = this.zzQ.zza();
                list = zzlbVar.zzj;
                for (i6 = 0; i6 < list.size(); i6++) {
                    zzayVar = (com.google.android.gms.internal.ads.zzay) list.get(i6);
                    for (i7 = 0; i7 < zzayVar.zza(); i7++) {
                        zzayVar.zzb(i7).zza(zzatVarZza);
                    }
                }
                this.zzQ = zzatVarZza.zzu();
            }
            zzbqVarZzn = zzn();
            if (zzbqVarZzn.zzo()) {
                zzavVarZzu = this.zzQ;
            } else {
                com.google.android.gms.internal.ads.zzar zzarVar4 = zzbqVarZzn.zze(zzd(), this.zza, 0L).zzd;
                com.google.android.gms.internal.ads.zzat zzatVarZza2 = this.zzQ.zza();
                zzatVarZza2.zzb(zzarVar4.zzd);
                zzavVarZzu = zzatVarZza2.zzu();
            }
            z6 = !zzavVarZzu.equals(this.zzE);
            this.zzE = zzavVarZzu;
            if (zzlbVar2.zzl != zzlbVar.zzl) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (zzlbVar2.zze != zzlbVar.zze) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 || z7) {
                zzag();
            }
            if (zzlbVar2.zzg != zzlbVar.zzg) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z21) {
                this.zzl.zzd(0, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzin
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj5) {
                        int i13 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj5).zzp(zzlbVar.zza, i);
                    }
                });
            }
            if (z4) {
                zzboVar = new com.google.android.gms.internal.ads.zzbo();
                if (zzlbVar2.zza.zzo()) {
                    i10 = i3;
                    obj = null;
                    zzarVar2 = null;
                    obj2 = null;
                    i11 = -1;
                } else {
                    java.lang.Object obj5 = zzlbVar2.zzb.zza;
                    zzlbVar2.zza.zzn(obj5, zzboVar);
                    int i13 = zzboVar.zzc;
                    int iZza2 = zzlbVar2.zza.zza(obj5);
                    obj2 = obj5;
                    obj = zzlbVar2.zza.zze(i13, this.zza, 0L).zzb;
                    zzarVar2 = this.zza.zzd;
                    i10 = i13;
                    i11 = iZza2;
                }
                if (i12 == 0) {
                    if (zzlbVar2.zzb.zzb()) {
                        com.google.android.gms.internal.ads.zzug zzugVar = zzlbVar2.zzb;
                        jZzV = zzboVar.zzf(zzugVar.zzb, zzugVar.zzc);
                        jZzV2 = zzV(zzlbVar2);
                    } else {
                        if (zzlbVar2.zzb.zze != -1) {
                            jZzV = zzV(this.zzR);
                        } else {
                            jZzV = zzboVar.zzd;
                        }
                        jZzV2 = jZzV;
                    }
                } else if (zzlbVar2.zzb.zzb()) {
                    jZzV = zzlbVar2.zzs;
                    jZzV2 = zzV(zzlbVar2);
                } else {
                    jZzV = zzlbVar2.zzs;
                    jZzV2 = jZzV;
                }
                int i14 = com.google.android.gms.internal.ads.zzei.zza;
                com.google.android.gms.internal.ads.zzug zzugVar2 = zzlbVar2.zzb;
                final com.google.android.gms.internal.ads.zzbi zzbiVar = new com.google.android.gms.internal.ads.zzbi(obj, i10, zzarVar2, obj2, i11, com.google.android.gms.internal.ads.zzei.zzv(jZzV), com.google.android.gms.internal.ads.zzei.zzv(jZzV2), zzugVar2.zzb, zzugVar2.zzc);
                iZzd2 = zzd();
                if (this.zzR.zza.zzo()) {
                    obj3 = null;
                    zzarVar3 = null;
                    obj4 = null;
                    iZza = -1;
                } else {
                    com.google.android.gms.internal.ads.zzlb zzlbVar3 = this.zzR;
                    java.lang.Object obj6 = zzlbVar3.zzb.zza;
                    zzlbVar3.zza.zzn(obj6, this.zzn);
                    iZza = this.zzR.zza.zza(obj6);
                    obj3 = this.zzR.zza.zze(iZzd2, this.zza, 0L).zzb;
                    zzarVar3 = this.zza.zzd;
                    obj4 = obj6;
                }
                jZzv = com.google.android.gms.internal.ads.zzei.zzv(j);
                if (this.zzR.zzb.zzb()) {
                    jZzv2 = com.google.android.gms.internal.ads.zzei.zzv(zzV(this.zzR));
                } else {
                    jZzv2 = jZzv;
                }
                com.google.android.gms.internal.ads.zzug zzugVar3 = this.zzR.zzb;
                final com.google.android.gms.internal.ads.zzbi zzbiVar2 = new com.google.android.gms.internal.ads.zzbi(obj3, iZzd2, zzarVar3, obj4, iZza, jZzv, jZzv2, zzugVar3.zzb, zzugVar3.zzc);
                this.zzl.zzd(11, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjd
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzm(zzbiVar, zzbiVar2, i12);
                    }
                });
            } else {
                z8 = z8;
                z9 = z9;
            }
            if (zBooleanValue) {
                this.zzl.zzd(1, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzd(zzarVar, iIntValue);
                    }
                });
            }
            if (zzlbVar2.zzf != zzlbVar.zzf) {
                this.zzl.zzd(10, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjf
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzk(zzlbVar.zzf);
                    }
                });
                if (zzlbVar.zzf != null) {
                    this.zzl.zzd(10, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjg
                        @Override // com.google.android.gms.internal.ads.zzdk
                        public final void zza(java.lang.Object obj7) {
                            int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                            ((com.google.android.gms.internal.ads.zzbh) obj7).zzj(zzlbVar.zzf);
                        }
                    });
                }
            }
            zzycVar = zzlbVar2.zzi;
            zzycVar2 = zzlbVar.zzi;
            if (zzycVar != zzycVar2) {
                this.zzi.zzp(zzycVar2.zze);
                this.zzl.zzd(2, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjh
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzq(zzlbVar.zzi.zzd);
                    }
                });
            }
            if (z6) {
                final com.google.android.gms.internal.ads.zzav zzavVar = this.zzE;
                this.zzl.zzd(14, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzio
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zze(zzavVar);
                    }
                });
            }
            if (z9) {
                this.zzl.zzd(3, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzip
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzb(zzlbVar.zzg);
                    }
                });
            }
            if (z8 || z7) {
                this.zzl.zzd(-1, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziq
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        com.google.android.gms.internal.ads.zzlb zzlbVar4 = zzlbVar;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzl(zzlbVar4.zzl, zzlbVar4.zze);
                    }
                });
            }
            if (z8) {
                this.zzl.zzd(4, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzir
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzh(zzlbVar.zze);
                    }
                });
            }
            if (z7 || zzlbVar2.zzm != zzlbVar.zzm) {
                this.zzl.zzd(5, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziv
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        com.google.android.gms.internal.ads.zzlb zzlbVar4 = zzlbVar;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzf(zzlbVar4.zzl, zzlbVar4.zzm);
                    }
                });
            }
            if (zzlbVar2.zzn != zzlbVar.zzn) {
                this.zzl.zzd(6, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzja
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzi(zzlbVar.zzn);
                    }
                });
            }
            if (zzlbVar2.zzi() != zzlbVar.zzi()) {
                this.zzl.zzd(7, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjb
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzc(zzlbVar.zzi());
                    }
                });
            }
            if (!zzlbVar2.zzo.equals(zzlbVar.zzo)) {
                this.zzl.zzd(12, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjc
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        int i15 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj7).zzg(zzlbVar.zzo);
                    }
                });
            }
            zzbgVar = this.zzD;
            com.google.android.gms.internal.ads.zzbk zzbkVar = this.zzg;
            com.google.android.gms.internal.ads.zzbg zzbgVar2 = this.zzc;
            int i15 = com.google.android.gms.internal.ads.zzei.zza;
            boolean zZzw = zzbkVar.zzw();
            zzgVar = (com.google.android.gms.internal.ads.zzg) zzbkVar;
            zzbqVarZzn2 = zzgVar.zzn();
            if (zzbqVarZzn2.zzo() && zzbqVarZzn2.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzh) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzbqVarZzn3 = zzgVar.zzn();
            if (zzbqVarZzn3.zzo()) {
                i8 = -1;
                r10 = 0;
                z11 = false;
            } else {
                int iZzd3 = zzgVar.zzd();
                zzgVar.zzh();
                zzgVar.zzv();
                r10 = 0;
                r10 = 0;
                iZzk = zzbqVarZzn3.zzk(iZzd3, 0, false);
                i8 = -1;
                if (iZzk != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            Zzn = zzgVar.zzn();
            if (Zzn.zzo()) {
                r8 = r10;
            } else {
                iZzd = zzgVar.zzd();
                zzgVar.zzh();
                zzgVar.zzv();
                if (Zzn.zzj(iZzd, r10, r10) != i8) {
                    r8 = 1;
                } else {
                    r8 = r10;
                }
            }
            zzbqVarZzn4 = zzgVar.zzn();
            if (!zzbqVarZzn4.zzo()) {
                r52 = r8;
                j2 = 0;
                if (zzbqVarZzn4.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzb()) {
                    r50 = r52;
                    z12 = true;
                    r51 = r52;
                }
                zzbqVarZzn5 = zzgVar.zzn();
                if (zzbqVarZzn5.zzo() && zzbqVarZzn5.zze(zzgVar.zzd(), zzgVar.zza, j2).zzi) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zZzo = zzbkVar.zzn().zzo();
                com.google.android.gms.internal.ads.zzbf zzbfVar = new com.google.android.gms.internal.ads.zzbf();
                zzbfVar.zzb(zzbgVar2);
                boolean z22 = !zZzw;
                zzbfVar.zzd(4, z22);
                if (z10 || zZzw) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                zzbfVar.zzd(5, z14);
                if (z11 || zZzw) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                zzbfVar.zzd(6, z15);
                if (!zZzo || (!(z11 || !z12 || z10) || zZzw)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                zzbfVar.zzd(7, z16);
                if (r51 != 0 || zZzw) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                zzbfVar.zzd(8, z17);
                if (!zZzo || ((r51 == 0 && !(z12 && z13)) || zZzw)) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                zzbfVar.zzd(9, z18);
                zzbfVar.zzd(10, z22);
                if (z10 || zZzw) {
                    i9 = 11;
                    z19 = false;
                } else {
                    i9 = 11;
                    z19 = true;
                }
                zzbfVar.zzd(i9, z19);
                if (z10 || zZzw) {
                    z20 = false;
                } else {
                    z20 = true;
                }
                zzbfVar.zzd(12, z20);
                zzbgVarZze = zzbfVar.zze();
                this.zzD = zzbgVarZze;
                if (!zzbgVarZze.equals(zzbgVar)) {
                    this.zzl.zzd(13, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                        @Override // com.google.android.gms.internal.ads.zzdk
                        public final void zza(java.lang.Object obj7) {
                            this.zza.zzP((com.google.android.gms.internal.ads.zzbh) obj7);
                        }
                    });
                }
                this.zzl.zzc();
                boolean z23 = zzlbVar2.zzp;
                boolean z24 = zzlbVar.zzp;
            }
            r50 = r8;
            j2 = 0;
            r50 = r52;
            z12 = false;
            r51 = r50;
            zzbqVarZzn5 = zzgVar.zzn();
            if (zzbqVarZzn5.zzo()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zZzo = zzbkVar.zzn().zzo();
            com.google.android.gms.internal.ads.zzbf zzbfVar2 = new com.google.android.gms.internal.ads.zzbf();
            zzbfVar2.zzb(zzbgVar2);
            boolean z25 = !zZzw;
            zzbfVar2.zzd(4, z25);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            zzbfVar2.zzd(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            zzbfVar2.zzd(6, z15);
            if (zZzo) {
                z16 = false;
            } else {
                z16 = false;
            }
            zzbfVar2.zzd(7, z16);
            if (r51 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbfVar2.zzd(8, z17);
            if (zZzo) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzbfVar2.zzd(9, z18);
            zzbfVar2.zzd(10, z25);
            if (z10) {
                i9 = 11;
                z19 = false;
            } else {
                i9 = 11;
                z19 = false;
            }
            zzbfVar2.zzd(i9, z19);
            if (z10) {
                z20 = false;
            } else {
                z20 = false;
            }
            zzbfVar2.zzd(12, z20);
            zzbgVarZze = zzbfVar2.zze();
            this.zzD = zzbgVarZze;
            if (!zzbgVarZze.equals(zzbgVar)) {
                this.zzl.zzd(13, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj7) {
                        this.zza.zzP((com.google.android.gms.internal.ads.zzbh) obj7);
                    }
                });
            }
            this.zzl.zzc();
            boolean z26 = zzlbVar2.zzp;
            boolean z27 = zzlbVar.zzp;
        }
        pair = new android.util.Pair(false, -1);
        z4 = z;
        zBooleanValue = ((java.lang.Boolean) pair.first).booleanValue();
        iIntValue = ((java.lang.Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzlbVar.zza.zzo()) {
                zzarVar = zzlbVar.zza.zze(zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd;
            } else {
                zzarVar = null;
            }
            this.zzQ = com.google.android.gms.internal.ads.zzav.zza;
        } else {
            zzarVar = null;
        }
        if (zBooleanValue) {
            zzatVarZza = this.zzQ.zza();
            list = zzlbVar.zzj;
            while (i6 < list.size()) {
                zzayVar = (com.google.android.gms.internal.ads.zzay) list.get(i6);
                while (i7 < zzayVar.zza()) {
                    zzayVar.zzb(i7).zza(zzatVarZza);
                }
            }
            this.zzQ = zzatVarZza.zzu();
        } else {
            zzatVarZza = this.zzQ.zza();
            list = zzlbVar.zzj;
            while (i6 < list.size()) {
                zzayVar = (com.google.android.gms.internal.ads.zzay) list.get(i6);
                while (i7 < zzayVar.zza()) {
                    zzayVar.zzb(i7).zza(zzatVarZza);
                }
            }
            this.zzQ = zzatVarZza.zzu();
        }
        zzbqVarZzn = zzn();
        if (zzbqVarZzn.zzo()) {
            zzavVarZzu = this.zzQ;
        } else {
            com.google.android.gms.internal.ads.zzar zzarVar5 = zzbqVarZzn.zze(zzd(), this.zza, 0L).zzd;
            com.google.android.gms.internal.ads.zzat zzatVarZza3 = this.zzQ.zza();
            zzatVarZza3.zzb(zzarVar5.zzd);
            zzavVarZzu = zzatVarZza3.zzu();
        }
        z6 = !zzavVarZzu.equals(this.zzE);
        this.zzE = zzavVarZzu;
        if (zzlbVar2.zzl != zzlbVar.zzl) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (zzlbVar2.zze != zzlbVar.zze) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            zzag();
        } else {
            zzag();
        }
        if (zzlbVar2.zzg != zzlbVar.zzg) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z21) {
            this.zzl.zzd(0, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzin
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj7) {
                    int i16 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj7).zzp(zzlbVar.zza, i);
                }
            });
        }
        if (z4) {
            zzboVar = new com.google.android.gms.internal.ads.zzbo();
            if (zzlbVar2.zza.zzo()) {
                java.lang.Object obj7 = zzlbVar2.zzb.zza;
                zzlbVar2.zza.zzn(obj7, zzboVar);
                int i16 = zzboVar.zzc;
                int iZza3 = zzlbVar2.zza.zza(obj7);
                obj2 = obj7;
                obj = zzlbVar2.zza.zze(i16, this.zza, 0L).zzb;
                zzarVar2 = this.zza.zzd;
                i10 = i16;
                i11 = iZza3;
            } else {
                i10 = i3;
                obj = null;
                zzarVar2 = null;
                obj2 = null;
                i11 = -1;
            }
            if (i12 == 0) {
                if (zzlbVar2.zzb.zzb()) {
                    com.google.android.gms.internal.ads.zzug zzugVar4 = zzlbVar2.zzb;
                    jZzV = zzboVar.zzf(zzugVar4.zzb, zzugVar4.zzc);
                    jZzV2 = zzV(zzlbVar2);
                } else {
                    if (zzlbVar2.zzb.zze != -1) {
                        jZzV = zzV(this.zzR);
                    } else {
                        jZzV = zzboVar.zzd;
                    }
                    jZzV2 = jZzV;
                }
            } else if (zzlbVar2.zzb.zzb()) {
                jZzV = zzlbVar2.zzs;
                jZzV2 = zzV(zzlbVar2);
            } else {
                jZzV = zzlbVar2.zzs;
                jZzV2 = jZzV;
            }
            int i17 = com.google.android.gms.internal.ads.zzei.zza;
            com.google.android.gms.internal.ads.zzug zzugVar5 = zzlbVar2.zzb;
            final com.google.android.gms.internal.ads.zzbi zzbiVar3 = new com.google.android.gms.internal.ads.zzbi(obj, i10, zzarVar2, obj2, i11, com.google.android.gms.internal.ads.zzei.zzv(jZzV), com.google.android.gms.internal.ads.zzei.zzv(jZzV2), zzugVar5.zzb, zzugVar5.zzc);
            iZzd2 = zzd();
            if (this.zzR.zza.zzo()) {
                com.google.android.gms.internal.ads.zzlb zzlbVar4 = this.zzR;
                java.lang.Object obj8 = zzlbVar4.zzb.zza;
                zzlbVar4.zza.zzn(obj8, this.zzn);
                iZza = this.zzR.zza.zza(obj8);
                obj3 = this.zzR.zza.zze(iZzd2, this.zza, 0L).zzb;
                zzarVar3 = this.zza.zzd;
                obj4 = obj8;
            } else {
                obj3 = null;
                zzarVar3 = null;
                obj4 = null;
                iZza = -1;
            }
            jZzv = com.google.android.gms.internal.ads.zzei.zzv(j);
            if (this.zzR.zzb.zzb()) {
                jZzv2 = com.google.android.gms.internal.ads.zzei.zzv(zzV(this.zzR));
            } else {
                jZzv2 = jZzv;
            }
            com.google.android.gms.internal.ads.zzug zzugVar6 = this.zzR.zzb;
            final com.google.android.gms.internal.ads.zzbi zzbiVar4 = new com.google.android.gms.internal.ads.zzbi(obj3, iZzd2, zzarVar3, obj4, iZza, jZzv, jZzv2, zzugVar6.zzb, zzugVar6.zzc);
            this.zzl.zzd(11, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzm(zzbiVar3, zzbiVar4, i12);
                }
            });
        } else {
            z8 = z8;
            z9 = z9;
        }
        if (zBooleanValue) {
            this.zzl.zzd(1, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzd(zzarVar, iIntValue);
                }
            });
        }
        if (zzlbVar2.zzf != zzlbVar.zzf) {
            this.zzl.zzd(10, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzk(zzlbVar.zzf);
                }
            });
            if (zzlbVar.zzf != null) {
                this.zzl.zzd(10, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjg
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj9) {
                        int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                        ((com.google.android.gms.internal.ads.zzbh) obj9).zzj(zzlbVar.zzf);
                    }
                });
            }
        }
        zzycVar = zzlbVar2.zzi;
        zzycVar2 = zzlbVar.zzi;
        if (zzycVar != zzycVar2) {
            this.zzi.zzp(zzycVar2.zze);
            this.zzl.zzd(2, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjh
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzq(zzlbVar.zzi.zzd);
                }
            });
        }
        if (z6) {
            final com.google.android.gms.internal.ads.zzav zzavVar2 = this.zzE;
            this.zzl.zzd(14, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzio
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zze(zzavVar2);
                }
            });
        }
        if (z9) {
            this.zzl.zzd(3, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzip
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzb(zzlbVar.zzg);
                }
            });
        }
        if (z8) {
            this.zzl.zzd(-1, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziq
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    com.google.android.gms.internal.ads.zzlb zzlbVar5 = zzlbVar;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzl(zzlbVar5.zzl, zzlbVar5.zze);
                }
            });
        } else {
            this.zzl.zzd(-1, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziq
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    com.google.android.gms.internal.ads.zzlb zzlbVar5 = zzlbVar;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzl(zzlbVar5.zzl, zzlbVar5.zze);
                }
            });
        }
        if (z8) {
            this.zzl.zzd(4, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzir
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzh(zzlbVar.zze);
                }
            });
        }
        if (z7) {
            this.zzl.zzd(5, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    com.google.android.gms.internal.ads.zzlb zzlbVar5 = zzlbVar;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzf(zzlbVar5.zzl, zzlbVar5.zzm);
                }
            });
        } else {
            this.zzl.zzd(5, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    com.google.android.gms.internal.ads.zzlb zzlbVar5 = zzlbVar;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzf(zzlbVar5.zzl, zzlbVar5.zzm);
                }
            });
        }
        if (zzlbVar2.zzn != zzlbVar.zzn) {
            this.zzl.zzd(6, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzi(zzlbVar.zzn);
                }
            });
        }
        if (zzlbVar2.zzi() != zzlbVar.zzi()) {
            this.zzl.zzd(7, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzc(zzlbVar.zzi());
                }
            });
        }
        if (!zzlbVar2.zzo.equals(zzlbVar.zzo)) {
            this.zzl.zzd(12, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    int i18 = com.google.android.gms.internal.ads.zzjp.zzd;
                    ((com.google.android.gms.internal.ads.zzbh) obj9).zzg(zzlbVar.zzo);
                }
            });
        }
        zzbgVar = this.zzD;
        com.google.android.gms.internal.ads.zzbk zzbkVar2 = this.zzg;
        com.google.android.gms.internal.ads.zzbg zzbgVar3 = this.zzc;
        int i18 = com.google.android.gms.internal.ads.zzei.zza;
        boolean zZzw2 = zzbkVar2.zzw();
        zzgVar = (com.google.android.gms.internal.ads.zzg) zzbkVar2;
        zzbqVarZzn2 = zzgVar.zzn();
        if (zzbqVarZzn2.zzo()) {
            z10 = false;
        } else {
            z10 = false;
        }
        zzbqVarZzn3 = zzgVar.zzn();
        if (zzbqVarZzn3.zzo()) {
            i8 = -1;
            r10 = 0;
            z11 = false;
        } else {
            int iZzd4 = zzgVar.zzd();
            zzgVar.zzh();
            zzgVar.zzv();
            r10 = 0;
            r10 = 0;
            iZzk = zzbqVarZzn3.zzk(iZzd4, 0, false);
            i8 = -1;
            if (iZzk != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        Zzn = zzgVar.zzn();
        if (Zzn.zzo()) {
            r8 = r10;
        } else {
            iZzd = zzgVar.zzd();
            zzgVar.zzh();
            zzgVar.zzv();
            if (Zzn.zzj(iZzd, r10, r10) != i8) {
                r8 = 1;
            } else {
                r8 = r10;
            }
        }
        zzbqVarZzn4 = zzgVar.zzn();
        if (!zzbqVarZzn4.zzo()) {
            r52 = r8;
            j2 = 0;
            if (zzbqVarZzn4.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzb()) {
                r50 = r52;
                z12 = true;
                r51 = r52;
            }
            zzbqVarZzn5 = zzgVar.zzn();
            if (zzbqVarZzn5.zzo()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zZzo = zzbkVar2.zzn().zzo();
            com.google.android.gms.internal.ads.zzbf zzbfVar3 = new com.google.android.gms.internal.ads.zzbf();
            zzbfVar3.zzb(zzbgVar3);
            boolean z28 = !zZzw2;
            zzbfVar3.zzd(4, z28);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            zzbfVar3.zzd(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            zzbfVar3.zzd(6, z15);
            if (zZzo) {
                z16 = false;
            } else {
                z16 = false;
            }
            zzbfVar3.zzd(7, z16);
            if (r51 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbfVar3.zzd(8, z17);
            if (zZzo) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzbfVar3.zzd(9, z18);
            zzbfVar3.zzd(10, z28);
            if (z10) {
                i9 = 11;
                z19 = false;
            } else {
                i9 = 11;
                z19 = false;
            }
            zzbfVar3.zzd(i9, z19);
            if (z10) {
                z20 = false;
            } else {
                z20 = false;
            }
            zzbfVar3.zzd(12, z20);
            zzbgVarZze = zzbfVar3.zze();
            this.zzD = zzbgVarZze;
            if (!zzbgVarZze.equals(zzbgVar)) {
                this.zzl.zzd(13, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(java.lang.Object obj9) {
                        this.zza.zzP((com.google.android.gms.internal.ads.zzbh) obj9);
                    }
                });
            }
            this.zzl.zzc();
            boolean z29 = zzlbVar2.zzp;
            boolean z210 = zzlbVar.zzp;
        }
        r50 = r8;
        j2 = 0;
        r50 = r52;
        z12 = false;
        r51 = r50;
        zzbqVarZzn5 = zzgVar.zzn();
        if (zzbqVarZzn5.zzo()) {
            z13 = false;
        } else {
            z13 = false;
        }
        zZzo = zzbkVar2.zzn().zzo();
        com.google.android.gms.internal.ads.zzbf zzbfVar4 = new com.google.android.gms.internal.ads.zzbf();
        zzbfVar4.zzb(zzbgVar3);
        boolean z211 = !zZzw2;
        zzbfVar4.zzd(4, z211);
        if (z10) {
            z14 = false;
        } else {
            z14 = false;
        }
        zzbfVar4.zzd(5, z14);
        if (z11) {
            z15 = false;
        } else {
            z15 = false;
        }
        zzbfVar4.zzd(6, z15);
        if (zZzo) {
            z16 = false;
        } else {
            z16 = false;
        }
        zzbfVar4.zzd(7, z16);
        if (r51 != 0) {
            z17 = false;
        } else {
            z17 = false;
        }
        zzbfVar4.zzd(8, z17);
        if (zZzo) {
            z18 = false;
        } else {
            z18 = false;
        }
        zzbfVar4.zzd(9, z18);
        zzbfVar4.zzd(10, z211);
        if (z10) {
            i9 = 11;
            z19 = false;
        } else {
            i9 = 11;
            z19 = false;
        }
        zzbfVar4.zzd(i9, z19);
        if (z10) {
            z20 = false;
        } else {
            z20 = false;
        }
        zzbfVar4.zzd(12, z20);
        zzbgVarZze = zzbfVar4.zze();
        this.zzD = zzbgVarZze;
        if (!zzbgVarZze.equals(zzbgVar)) {
            this.zzl.zzd(13, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj9) {
                    this.zza.zzP((com.google.android.gms.internal.ads.zzbh) obj9);
                }
            });
        }
        this.zzl.zzc();
        boolean z212 = zzlbVar2.zzp;
        boolean z213 = zzlbVar.zzp;
    }

    private final void zzag() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzah();
            boolean z = this.zzR.zzp;
            zzu();
            zzu();
        }
    }

    private final void zzah() {
        this.zze.zzb();
        if (java.lang.Thread.currentThread() != this.zzr.getThread()) {
            java.lang.String str = java.lang.String.format(java.util.Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", java.lang.Thread.currentThread().getName(), this.zzr.getThread().getName());
            if (this.zzN) {
                throw new java.lang.IllegalStateException(str);
            }
            com.google.android.gms.internal.ads.zzdo.zzg("ExoPlayerImpl", str, this.zzO ? null : new java.lang.IllegalStateException());
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzA(com.google.android.gms.internal.ads.zzlw zzlwVar) {
        zzah();
        this.zzq.zzR(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzB(com.google.android.gms.internal.ads.zzui zzuiVar) {
        zzah();
        java.util.List listSingletonList = java.util.Collections.singletonList(zzuiVar);
        zzah();
        zzah();
        zzR(this.zzR);
        zzk();
        this.zzy++;
        boolean z = false;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzV = this.zzV.zzh(0, size);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            com.google.android.gms.internal.ads.zzky zzkyVar = new com.google.android.gms.internal.ads.zzky((com.google.android.gms.internal.ads.zzui) listSingletonList.get(i2), this.zzp);
            arrayList.add(zzkyVar);
            this.zzo.add(i2, new com.google.android.gms.internal.ads.zzjn(zzkyVar.zzb, zzkyVar.zza));
        }
        this.zzV = this.zzV.zzg(0, arrayList.size());
        com.google.android.gms.internal.ads.zzlh zzlhVar = new com.google.android.gms.internal.ads.zzlh(this.zzo, this.zzV);
        if (!zzlhVar.zzo() && zzlhVar.zzc() < 0) {
            throw new com.google.android.gms.internal.ads.zzac(zzlhVar, -1, androidx.media3.common.C.TIME_UNSET);
        }
        int iZzg = zzlhVar.zzg(false);
        com.google.android.gms.internal.ads.zzlb zzlbVarZzY = zzY(this.zzR, zzlhVar, zzX(zzlhVar, iZzg, androidx.media3.common.C.TIME_UNSET));
        int i3 = zzlbVarZzY.zze;
        if (iZzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzlhVar.zzo() && iZzg < zzlhVar.zzc()) {
                i3 = 2;
            }
        }
        com.google.android.gms.internal.ads.zzlb zzlbVarZze = zzlbVarZzY.zze(i3);
        this.zzk.zzr(arrayList, iZzg, com.google.android.gms.internal.ads.zzei.zzs(androidx.media3.common.C.TIME_UNSET), this.zzV);
        if (!this.zzR.zzb.zza.equals(zzlbVarZze.zzb.zza) && !this.zzR.zza.zzo()) {
            z = true;
        }
        zzaf(zzlbVarZze, 0, z, 4, zzU(zzlbVarZze), -1, false);
    }

    public final com.google.android.gms.internal.ads.zzib zzE() {
        zzah();
        return this.zzR.zzf;
    }

    final /* synthetic */ void zzN(final com.google.android.gms.internal.ads.zzjz zzjzVar) {
        this.zzj.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zziy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(zzjzVar);
            }
        });
    }

    final /* synthetic */ void zzO(com.google.android.gms.internal.ads.zzjz zzjzVar) {
        long j;
        int i = this.zzy - zzjzVar.zzb;
        this.zzy = i;
        boolean z = true;
        if (zzjzVar.zzc) {
            this.zzz = zzjzVar.zzd;
            this.zzA = true;
        }
        if (i == 0) {
            com.google.android.gms.internal.ads.zzbq zzbqVar = zzjzVar.zza.zza;
            if (!this.zzR.zza.zzo() && zzbqVar.zzo()) {
                this.zzS = -1;
                this.zzT = 0L;
            }
            if (!zzbqVar.zzo()) {
                java.util.List listZzw = ((com.google.android.gms.internal.ads.zzlh) zzbqVar).zzw();
                com.google.android.gms.internal.ads.zzcw.zzf(listZzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < listZzw.size(); i2++) {
                    ((com.google.android.gms.internal.ads.zzjn) this.zzo.get(i2)).zzc((com.google.android.gms.internal.ads.zzbq) listZzw.get(i2));
                }
            }
            boolean z2 = this.zzA;
            long j2 = androidx.media3.common.C.TIME_UNSET;
            if (z2) {
                if (zzjzVar.zza.zzb.equals(this.zzR.zzb) && zzjzVar.zza.zzd == this.zzR.zzs) {
                    z = false;
                }
                if (z) {
                    if (zzbqVar.zzo() || zzjzVar.zza.zzb.zzb()) {
                        j = zzjzVar.zza.zzd;
                    } else {
                        com.google.android.gms.internal.ads.zzlb zzlbVar = zzjzVar.zza;
                        com.google.android.gms.internal.ads.zzug zzugVar = zzlbVar.zzb;
                        j = zzlbVar.zzd;
                        zzW(zzbqVar, zzugVar, j);
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            this.zzA = false;
            zzaf(zzjzVar.zza, 1, z, this.zzz, j2, -1, false);
        }
    }

    final /* synthetic */ void zzP(com.google.android.gms.internal.ads.zzbh zzbhVar) {
        zzbhVar.zza(this.zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zza(int i, long j, int i2, boolean z) {
        zzah();
        if (i == -1) {
            return;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(i >= 0);
        com.google.android.gms.internal.ads.zzbq zzbqVar = this.zzR.zza;
        if (zzbqVar.zzo() || i < zzbqVar.zzc()) {
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                com.google.android.gms.internal.ads.zzdo.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                com.google.android.gms.internal.ads.zzjz zzjzVar = new com.google.android.gms.internal.ads.zzjz(this.zzR);
                zzjzVar.zza(1);
                this.zzU.zza.zzN(zzjzVar);
                return;
            }
            com.google.android.gms.internal.ads.zzlb zzlbVarZze = this.zzR;
            int i3 = zzlbVarZze.zze;
            if (i3 == 3 || (i3 == 4 && !zzbqVar.zzo())) {
                zzlbVarZze = this.zzR.zze(2);
            }
            int iZzd = zzd();
            com.google.android.gms.internal.ads.zzlb zzlbVarZzY = zzY(zzlbVarZze, zzbqVar, zzX(zzbqVar, i, j));
            this.zzk.zzl(zzbqVar, i, com.google.android.gms.internal.ads.zzei.zzs(j));
            zzaf(zzlbVarZzY, 0, true, 1, zzU(zzlbVarZzY), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzb() {
        zzah();
        if (zzw()) {
            return this.zzR.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzc() {
        zzah();
        if (zzw()) {
            return this.zzR.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzd() {
        zzah();
        int iZzR = zzR(this.zzR);
        if (iZzR == -1) {
            return 0;
        }
        return iZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zze() {
        zzah();
        if (this.zzR.zza.zzo()) {
            return 0;
        }
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzR;
        return zzlbVar.zza.zza(zzlbVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzf() {
        zzah();
        return this.zzR.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzg() {
        zzah();
        return this.zzR.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzh() {
        zzah();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzi() {
        zzah();
        if (zzw()) {
            com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzR;
            return zzlbVar.zzk.equals(zzlbVar.zzb) ? com.google.android.gms.internal.ads.zzei.zzv(this.zzR.zzq) : zzl();
        }
        zzah();
        if (this.zzR.zza.zzo()) {
            return this.zzT;
        }
        com.google.android.gms.internal.ads.zzlb zzlbVar2 = this.zzR;
        long j = 0;
        if (zzlbVar2.zzk.zzd != zzlbVar2.zzb.zzd) {
            return com.google.android.gms.internal.ads.zzei.zzv(zzlbVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j2 = zzlbVar2.zzq;
        if (this.zzR.zzk.zzb()) {
            com.google.android.gms.internal.ads.zzlb zzlbVar3 = this.zzR;
            zzlbVar3.zza.zzn(zzlbVar3.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        } else {
            j = j2;
        }
        com.google.android.gms.internal.ads.zzlb zzlbVar4 = this.zzR;
        zzW(zzlbVar4.zza, zzlbVar4.zzk, j);
        return com.google.android.gms.internal.ads.zzei.zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzj() {
        zzah();
        return zzT(this.zzR);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzk() {
        zzah();
        return com.google.android.gms.internal.ads.zzei.zzv(zzU(this.zzR));
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzl() {
        zzah();
        if (!zzw()) {
            com.google.android.gms.internal.ads.zzbq zzbqVarZzn = zzn();
            return zzbqVarZzn.zzo() ? androidx.media3.common.C.TIME_UNSET : com.google.android.gms.internal.ads.zzei.zzv(zzbqVarZzn.zze(zzd(), this.zza, 0L).zzm);
        }
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzR;
        com.google.android.gms.internal.ads.zzug zzugVar = zzlbVar.zzb;
        zzlbVar.zza.zzn(zzugVar.zza, this.zzn);
        return com.google.android.gms.internal.ads.zzei.zzv(this.zzn.zzf(zzugVar.zzb, zzugVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzm() {
        zzah();
        return com.google.android.gms.internal.ads.zzei.zzv(this.zzR.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final com.google.android.gms.internal.ads.zzbq zzn() {
        zzah();
        return this.zzR.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final com.google.android.gms.internal.ads.zzby zzo() {
        zzah();
        return this.zzR.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzp() {
        zzah();
        com.google.android.gms.internal.ads.zzhq zzhqVar = this.zzw;
        boolean zZzu = zzu();
        zzhqVar.zzb(zZzu, 2);
        zzae(zZzu, 1, zzS(1));
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzR;
        if (zzlbVar.zze != 1) {
            return;
        }
        com.google.android.gms.internal.ads.zzlb zzlbVarZzd = zzlbVar.zzd(null);
        com.google.android.gms.internal.ads.zzlb zzlbVarZze = zzlbVarZzd.zze(true == zzlbVarZzd.zza.zzo() ? 4 : 2);
        this.zzy++;
        this.zzk.zzk();
        zzaf(zzlbVarZze, 1, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzq(boolean z) {
        zzah();
        this.zzw.zzb(z, zzf());
        zzae(z, 1, zzS(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzr(android.view.Surface surface) {
        zzah();
        zzac(surface);
        int i = surface == null ? 0 : -1;
        zzZ(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzs(float f) {
        zzah();
        final float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(f, 1.0f));
        if (this.zzL == fMax) {
            return;
        }
        this.zzL = fMax;
        zzab();
        com.google.android.gms.internal.ads.zzdn zzdnVar = this.zzl;
        zzdnVar.zzd(22, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzjp.zzd;
                ((com.google.android.gms.internal.ads.zzbh) obj).zzs(fMax);
            }
        });
        zzdnVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzt() {
        zzah();
        this.zzw.zzb(zzu(), 1);
        zzad(null);
        int i = com.google.android.gms.internal.ads.zzcp.zza;
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzn = com.google.android.gms.internal.ads.zzfxn.zzn();
        long j = this.zzR.zzs;
        com.google.android.gms.internal.ads.zzfxn.zzl(zzfxnVarZzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzu() {
        zzah();
        return this.zzR.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzv() {
        zzah();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzw() {
        zzah();
        return this.zzR.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final int zzx() {
        zzah();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzy(com.google.android.gms.internal.ads.zzlw zzlwVar) {
        this.zzq.zzt(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzz() {
        com.google.android.gms.internal.ads.zzdo.zze("ExoPlayerImpl", "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + com.google.android.gms.internal.ads.zzei.zze + "] [" + com.google.android.gms.internal.ads.zzas.zza() + com.ironsource.y8.i.e);
        zzah();
        this.zzw.zzd();
        if (!this.zzk.zzp()) {
            com.google.android.gms.internal.ads.zzdn zzdnVar = this.zzl;
            zzdnVar.zzd(10, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zziu
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzbh) obj).zzj(com.google.android.gms.internal.ads.zzib.zzd(new com.google.android.gms.internal.ads.zzkd(1), 1003));
                }
            });
            zzdnVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzg(this.zzq);
        boolean z = this.zzR.zzp;
        com.google.android.gms.internal.ads.zzlb zzlbVarZze = this.zzR.zze(1);
        this.zzR = zzlbVarZze;
        com.google.android.gms.internal.ads.zzlb zzlbVarZza = zzlbVarZze.zza(zzlbVarZze.zzb);
        this.zzR = zzlbVarZza;
        zzlbVarZza.zzq = zzlbVarZza.zzs;
        this.zzR.zzr = 0L;
        this.zzq.zzQ();
        this.zzi.zzj();
        android.view.Surface surface = this.zzG;
        if (surface != null) {
            surface.release();
            this.zzG = null;
        }
        int i = com.google.android.gms.internal.ads.zzcp.zza;
    }
}
