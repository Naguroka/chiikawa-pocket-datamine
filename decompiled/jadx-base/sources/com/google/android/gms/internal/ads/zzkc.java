package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzkc implements android.os.Handler.Callback, com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzya, com.google.android.gms.internal.ads.zzkz, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzld {
    private static final long zza = com.google.android.gms.internal.ads.zzei.zzv(10000);
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private boolean zzF;
    private boolean zzI;
    private int zzJ;
    private com.google.android.gms.internal.ads.zzka zzK;
    private long zzL;
    private long zzM;
    private int zzN;
    private boolean zzO;
    private com.google.android.gms.internal.ads.zzib zzP;
    private com.google.android.gms.internal.ads.zzil zzR;
    private final com.google.android.gms.internal.ads.zzix zzS;
    private final com.google.android.gms.internal.ads.zzhv zzT;
    private final com.google.android.gms.internal.ads.zzlo[] zzb;
    private final com.google.android.gms.internal.ads.zzlm[] zzc;
    private final boolean[] zzd;
    private final com.google.android.gms.internal.ads.zzyb zze;
    private final com.google.android.gms.internal.ads.zzyc zzf;
    private final com.google.android.gms.internal.ads.zzkg zzg;
    private final com.google.android.gms.internal.ads.zzyj zzh;
    private final com.google.android.gms.internal.ads.zzdh zzi;
    private final com.google.android.gms.internal.ads.zzlc zzj;
    private final android.os.Looper zzk;
    private final com.google.android.gms.internal.ads.zzbp zzl;
    private final com.google.android.gms.internal.ads.zzbo zzm;
    private final long zzn;
    private final com.google.android.gms.internal.ads.zzia zzo;
    private final java.util.ArrayList zzp;
    private final com.google.android.gms.internal.ads.zzcx zzq;
    private final com.google.android.gms.internal.ads.zzko zzr;
    private final com.google.android.gms.internal.ads.zzla zzs;
    private final long zzt;
    private final com.google.android.gms.internal.ads.zzog zzu;
    private final com.google.android.gms.internal.ads.zzlt zzv;
    private final com.google.android.gms.internal.ads.zzdh zzw;
    private com.google.android.gms.internal.ads.zzlp zzx;
    private com.google.android.gms.internal.ads.zzlb zzy;
    private com.google.android.gms.internal.ads.zzjz zzz;
    private int zzG = 0;
    private boolean zzH = false;
    private boolean zzB = false;
    private long zzQ = androidx.media3.common.C.TIME_UNSET;
    private long zzE = androidx.media3.common.C.TIME_UNSET;

    public zzkc(com.google.android.gms.internal.ads.zzlj[] zzljVarArr, com.google.android.gms.internal.ads.zzyb zzybVar, com.google.android.gms.internal.ads.zzyc zzycVar, com.google.android.gms.internal.ads.zzkg zzkgVar, com.google.android.gms.internal.ads.zzyj zzyjVar, int i, boolean z, com.google.android.gms.internal.ads.zzlt zzltVar, com.google.android.gms.internal.ads.zzlp zzlpVar, com.google.android.gms.internal.ads.zzhv zzhvVar, long j, boolean z2, boolean z3, android.os.Looper looper, com.google.android.gms.internal.ads.zzcx zzcxVar, com.google.android.gms.internal.ads.zzix zzixVar, com.google.android.gms.internal.ads.zzog zzogVar, com.google.android.gms.internal.ads.zzlc zzlcVar, com.google.android.gms.internal.ads.zzil zzilVar) {
        this.zzS = zzixVar;
        this.zze = zzybVar;
        this.zzf = zzycVar;
        this.zzg = zzkgVar;
        this.zzh = zzyjVar;
        int i2 = 0;
        this.zzx = zzlpVar;
        this.zzT = zzhvVar;
        this.zzt = j;
        this.zzq = zzcxVar;
        this.zzu = zzogVar;
        this.zzR = zzilVar;
        this.zzv = zzltVar;
        this.zzn = zzkgVar.zzb(zzogVar);
        zzkgVar.zzg(zzogVar);
        com.google.android.gms.internal.ads.zzbq zzbqVar = com.google.android.gms.internal.ads.zzbq.zza;
        this.zzy = com.google.android.gms.internal.ads.zzlb.zzg(zzycVar);
        this.zzz = new com.google.android.gms.internal.ads.zzjz(this.zzy);
        int length = zzljVarArr.length;
        this.zzc = new com.google.android.gms.internal.ads.zzlm[2];
        this.zzd = new boolean[2];
        com.google.android.gms.internal.ads.zzll zzllVarZze = zzybVar.zze();
        this.zzb = new com.google.android.gms.internal.ads.zzlo[2];
        while (true) {
            int length2 = zzljVarArr.length;
            if (i2 >= 2) {
                this.zzo = new com.google.android.gms.internal.ads.zzia(this, zzcxVar);
                this.zzp = new java.util.ArrayList();
                this.zzl = new com.google.android.gms.internal.ads.zzbp();
                this.zzm = new com.google.android.gms.internal.ads.zzbo();
                zzybVar.zzr(this, zzyjVar);
                this.zzO = true;
                com.google.android.gms.internal.ads.zzdh zzdhVarZzd = zzcxVar.zzd(looper, null);
                this.zzw = zzdhVarZzd;
                this.zzr = new com.google.android.gms.internal.ads.zzko(zzltVar, zzdhVarZzd, new com.google.android.gms.internal.ads.zzjs(this), zzilVar);
                this.zzs = new com.google.android.gms.internal.ads.zzla(this, zzltVar, zzdhVarZzd, zzogVar);
                com.google.android.gms.internal.ads.zzlc zzlcVar2 = new com.google.android.gms.internal.ads.zzlc(null);
                this.zzj = zzlcVar2;
                android.os.Looper looperZza = zzlcVar2.zza();
                this.zzk = looperZza;
                this.zzi = zzcxVar.zzd(looperZza, this);
                return;
            }
            zzljVarArr[i2].zzv(i2, zzogVar, zzcxVar);
            this.zzc[i2] = zzljVarArr[i2].zzm();
            this.zzc[i2].zzL(zzllVarZze);
            this.zzb[i2] = new com.google.android.gms.internal.ads.zzlo(zzljVarArr[i2], i2);
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    private final com.google.android.gms.internal.ads.zzlb zzA(com.google.android.gms.internal.ads.zzug zzugVar, long j, long j2, long j3, boolean z, int i) {
        java.util.List listZzn;
        com.google.android.gms.internal.ads.zzyc zzycVar;
        com.google.android.gms.internal.ads.zzwj zzwjVar;
        this.zzO = (!this.zzO && j == this.zzy.zzs && zzugVar.equals(this.zzy.zzb)) ? false : true;
        zzS();
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
        com.google.android.gms.internal.ads.zzwj zzwjVarZzh = zzlbVar.zzh;
        com.google.android.gms.internal.ads.zzyc zzycVarZzi = zzlbVar.zzi;
        java.util.List list = zzlbVar.zzj;
        if (!this.zzs.zzj()) {
            if (zzugVar.equals(this.zzy.zzb)) {
                listZzn = list;
            } else {
                zzycVar = this.zzf;
                zzwjVar = com.google.android.gms.internal.ads.zzwj.zza;
                listZzn = com.google.android.gms.internal.ads.zzfxn.zzn();
            }
            if (z) {
                this.zzz.zzc(i);
            }
            return this.zzy.zzb(zzugVar, j, j2, j3, zzu(), zzwjVar, zzycVar, listZzn);
        }
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        zzwjVarZzh = zzklVarZze == null ? com.google.android.gms.internal.ads.zzwj.zza : zzklVarZze.zzh();
        zzycVarZzi = zzklVarZze == null ? this.zzf : zzklVarZze.zzi();
        com.google.android.gms.internal.ads.zzxv[] zzxvVarArr = zzycVarZzi.zzc;
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        boolean z2 = false;
        for (com.google.android.gms.internal.ads.zzxv zzxvVar : zzxvVarArr) {
            if (zzxvVar != null) {
                com.google.android.gms.internal.ads.zzay zzayVar = zzxvVar.zze(0).zzl;
                if (zzayVar == null) {
                    zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, new com.google.android.gms.internal.ads.zzax[0]));
                } else {
                    zzfxkVar.zzf(zzayVar);
                    z2 = true;
                }
            }
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzi = z2 ? zzfxkVar.zzi() : com.google.android.gms.internal.ads.zzfxn.zzn();
        if (zzklVarZze != null) {
            com.google.android.gms.internal.ads.zzkm zzkmVar = zzklVarZze.zzg;
            if (zzkmVar.zzc != j2) {
                zzklVarZze.zzg = zzkmVar.zza(j2);
            }
        }
        com.google.android.gms.internal.ads.zzkl zzklVarZze2 = this.zzr.zze();
        if (zzklVarZze2 != null) {
            com.google.android.gms.internal.ads.zzyc zzycVarZzi2 = zzklVarZze2.zzi();
            for (int i2 = 0; i2 < 2; i2++) {
                if (zzycVarZzi2.zzb(i2)) {
                    if (this.zzb[i2].zzb() != 1) {
                        break;
                    }
                    int i3 = zzycVarZzi2.zzb[i2].zzb;
                }
            }
        }
        listZzn = zzfxnVarZzi;
        zzwjVar = zzwjVarZzh;
        zzycVar = zzycVarZzi;
        if (z) {
            this.zzz.zzc(i);
        }
        return this.zzy.zzb(zzugVar, j, j2, j3, zzu(), zzwjVar, zzycVar, listZzn);
    }

    private final void zzB(int i) {
        int iZza = this.zzb[i].zza();
        this.zzb[i].zzd(this.zzo);
        zzO(i, false);
        this.zzJ -= iZza;
    }

    private final void zzC() {
        for (int i = 0; i < 2; i++) {
            zzB(i);
        }
    }

    private final void zzD() throws com.google.android.gms.internal.ads.zzib {
        zzE(new boolean[2], this.zzr.zzh().zzf());
    }

    private final void zzE(boolean[] zArr, long j) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzkl zzklVarZzh = this.zzr.zzh();
        com.google.android.gms.internal.ads.zzyc zzycVarZzi = zzklVarZzh.zzi();
        for (int i = 0; i < 2; i++) {
            if (!zzycVarZzi.zzb(i)) {
                this.zzb[i].zzl();
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzycVarZzi.zzb(i2)) {
                boolean z = zArr[i2];
                com.google.android.gms.internal.ads.zzko zzkoVar = this.zzr;
                com.google.android.gms.internal.ads.zzlo[] zzloVarArr = this.zzb;
                com.google.android.gms.internal.ads.zzkl zzklVarZzh2 = zzkoVar.zzh();
                com.google.android.gms.internal.ads.zzlo zzloVar = zzloVarArr[i2];
                if (zzloVar.zza() <= 0) {
                    boolean z2 = zzklVarZzh2 == this.zzr.zze();
                    com.google.android.gms.internal.ads.zzyc zzycVarZzi2 = zzklVarZzh2.zzi();
                    com.google.android.gms.internal.ads.zzln zzlnVar = zzycVarZzi2.zzb[i2];
                    com.google.android.gms.internal.ads.zzab[] zzabVarArrZzan = zzan(zzycVarZzi2.zzc[i2]);
                    boolean z3 = zzal() && this.zzy.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzJ++;
                    zzloVar.zze(zzlnVar, zzabVarArrZzan, zzklVarZzh2.zzc[i2], this.zzL, z4, z2, j, zzklVarZzh2.zze(), zzklVarZzh2.zzg.zza, this.zzo);
                    zzloVar.zzg(11, new com.google.android.gms.internal.ads.zzjv(this));
                    if (z3 && z2) {
                        zzloVar.zzr();
                    }
                }
            }
        }
        zzklVarZzh.zzh = true;
    }

    private final void zzF(java.io.IOException iOException, int i) {
        com.google.android.gms.internal.ads.zzko zzkoVar = this.zzr;
        com.google.android.gms.internal.ads.zzib zzibVarZzc = com.google.android.gms.internal.ads.zzib.zzc(iOException, i);
        com.google.android.gms.internal.ads.zzkl zzklVarZze = zzkoVar.zze();
        if (zzklVarZze != null) {
            zzibVarZzc = zzibVarZzc.zza(zzklVarZze.zzg.zza);
        }
        com.google.android.gms.internal.ads.zzdo.zzd("ExoPlayerImplInternal", "Playback error", zzibVarZzc);
        zzab(false, false);
        this.zzy = this.zzy.zzd(zzibVarZzc);
    }

    private final void zzG(boolean z) {
        com.google.android.gms.internal.ads.zzkl zzklVarZzd = this.zzr.zzd();
        com.google.android.gms.internal.ads.zzug zzugVar = zzklVarZzd == null ? this.zzy.zzb : zzklVarZzd.zzg.zza;
        boolean z2 = !this.zzy.zzk.equals(zzugVar);
        if (z2) {
            this.zzy = this.zzy.zza(zzugVar);
        }
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
        zzlbVar.zzq = zzklVarZzd == null ? zzlbVar.zzs : zzklVarZzd.zzc();
        this.zzy.zzr = zzu();
        if ((z2 || z) && zzklVarZzd != null && zzklVarZzd.zze) {
            zzae(zzklVarZzd.zzg.zza, zzklVarZzd.zzh(), zzklVarZzd.zzi());
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private final void zzH(com.google.android.gms.internal.ads.zzbq r29, boolean r30) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zzH(com.google.android.gms.internal.ads.zzbq, boolean):void");
    }

    private final void zzI(com.google.android.gms.internal.ads.zzbe zzbeVar, boolean z) throws com.google.android.gms.internal.ads.zzib {
        zzJ(zzbeVar, zzbeVar.zzb, true, z);
    }

    private final void zzJ(com.google.android.gms.internal.ads.zzbe zzbeVar, float f, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzib {
        int i;
        com.google.android.gms.internal.ads.zzkc zzkcVar = this;
        if (z) {
            if (z2) {
                zzkcVar.zzz.zza(1);
            }
            com.google.android.gms.internal.ads.zzlb zzlbVar = zzkcVar.zzy;
            com.google.android.gms.internal.ads.zzbq zzbqVar = zzlbVar.zza;
            com.google.android.gms.internal.ads.zzug zzugVar = zzlbVar.zzb;
            long j = zzlbVar.zzc;
            long j2 = zzlbVar.zzd;
            int i2 = zzlbVar.zze;
            com.google.android.gms.internal.ads.zzib zzibVar = zzlbVar.zzf;
            boolean z3 = zzlbVar.zzg;
            com.google.android.gms.internal.ads.zzwj zzwjVar = zzlbVar.zzh;
            com.google.android.gms.internal.ads.zzyc zzycVar = zzlbVar.zzi;
            java.util.List list = zzlbVar.zzj;
            com.google.android.gms.internal.ads.zzug zzugVar2 = zzlbVar.zzk;
            boolean z4 = zzlbVar.zzl;
            int i3 = zzlbVar.zzm;
            int i4 = zzlbVar.zzn;
            long j3 = zzlbVar.zzq;
            long j4 = zzlbVar.zzr;
            long j5 = zzlbVar.zzs;
            long j6 = zzlbVar.zzt;
            boolean z5 = zzlbVar.zzp;
            zzkcVar = this;
            zzkcVar.zzy = new com.google.android.gms.internal.ads.zzlb(zzbqVar, zzugVar, j, j2, i2, zzibVar, z3, zzwjVar, zzycVar, list, zzugVar2, z4, i3, i4, zzbeVar, j3, j4, j5, j6, false);
        }
        float f2 = zzbeVar.zzb;
        com.google.android.gms.internal.ads.zzkl zzklVarZze = zzkcVar.zzr.zze();
        while (true) {
            i = 0;
            if (zzklVarZze == null) {
                break;
            }
            com.google.android.gms.internal.ads.zzxv[] zzxvVarArr = zzklVarZze.zzi().zzc;
            int length = zzxvVarArr.length;
            while (i < length) {
                com.google.android.gms.internal.ads.zzxv zzxvVar = zzxvVarArr[i];
                i++;
            }
            zzklVarZze = zzklVarZze.zzg();
        }
        com.google.android.gms.internal.ads.zzlo[] zzloVarArr = zzkcVar.zzb;
        while (i < 2) {
            zzloVarArr[i].zzo(f, zzbeVar.zzb);
            i++;
        }
    }

    private final void zzK() {
        long jZze;
        long jZze2;
        boolean zZzh;
        if (zzap(this.zzr.zzd())) {
            com.google.android.gms.internal.ads.zzkl zzklVarZzd = this.zzr.zzd();
            long jZzv = zzv(zzklVarZzd.zzd());
            if (zzklVarZzd == this.zzr.zze()) {
                jZze = this.zzL;
                jZze2 = zzklVarZzd.zze();
            } else {
                jZze = this.zzL - zzklVarZzd.zze();
                jZze2 = zzklVarZzd.zzg.zzb;
            }
            com.google.android.gms.internal.ads.zzkf zzkfVar = new com.google.android.gms.internal.ads.zzkf(this.zzu, this.zzy.zza, zzklVarZzd.zzg.zza, jZze - jZze2, jZzv, this.zzo.zzc().zzb, this.zzy.zzl, this.zzD, zzam(this.zzy.zza, zzklVarZzd.zzg.zza) ? this.zzT.zzb() : androidx.media3.common.C.TIME_UNSET);
            boolean zZzh2 = this.zzg.zzh(zzkfVar);
            com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
            if (zZzh2 || !zzklVarZze.zze || jZzv >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzklVarZze.zza.zzj(this.zzy.zzs, false);
                zZzh = this.zzg.zzh(zzkfVar);
            }
        } else {
            zZzh = false;
        }
        this.zzF = zZzh;
        if (zZzh) {
            com.google.android.gms.internal.ads.zzkl zzklVarZzd2 = this.zzr.zzd();
            zzklVarZzd2.getClass();
            com.google.android.gms.internal.ads.zzkh zzkhVar = new com.google.android.gms.internal.ads.zzkh();
            zzkhVar.zze(this.zzL - zzklVarZzd2.zze());
            zzkhVar.zzf(this.zzo.zzc().zzb);
            zzkhVar.zzd(this.zzE);
            zzklVarZzd2.zzk(new com.google.android.gms.internal.ads.zzkj(zzkhVar, null));
        }
        zzad();
    }

    private final void zzL() {
        this.zzr.zzn();
        com.google.android.gms.internal.ads.zzkl zzklVarZzg = this.zzr.zzg();
        if (zzklVarZzg != null) {
            if ((!zzklVarZzg.zzd || zzklVarZzg.zze) && !zzklVarZzg.zza.zzp()) {
                if (this.zzg.zzi(this.zzy.zza, zzklVarZzg.zzg.zza, zzklVarZzg.zze ? zzklVarZzg.zza.zzb() : 0L)) {
                    if (!zzklVarZzg.zzd) {
                        zzklVarZzg.zzm(this, zzklVarZzg.zzg.zzb);
                        return;
                    }
                    com.google.android.gms.internal.ads.zzkh zzkhVar = new com.google.android.gms.internal.ads.zzkh();
                    zzkhVar.zze(this.zzL - zzklVarZzg.zze());
                    zzkhVar.zzf(this.zzo.zzc().zzb);
                    zzkhVar.zzd(this.zzE);
                    zzklVarZzg.zzk(new com.google.android.gms.internal.ads.zzkj(zzkhVar, null));
                }
            }
        }
    }

    private final void zzM() {
        this.zzz.zzb(this.zzy);
        if (this.zzz.zze) {
            com.google.android.gms.internal.ads.zzix zzixVar = this.zzS;
            zzixVar.zza.zzN(this.zzz);
            this.zzz = new com.google.android.gms.internal.ads.zzjz(this.zzy);
        }
    }

    private final void zzN(int i) throws com.google.android.gms.internal.ads.zzib, java.io.IOException {
        com.google.android.gms.internal.ads.zzlo zzloVar = this.zzb[i];
        try {
            zzloVar.zzh();
        } catch (java.io.IOException | java.lang.RuntimeException e) {
            zzloVar.zzb();
            throw e;
        }
    }

    private final void zzO(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzw.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzjr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(i, z);
                }
            });
        }
    }

    private final void zzP() throws com.google.android.gms.internal.ads.zzib {
        int i;
        float f = this.zzo.zzc().zzb;
        com.google.android.gms.internal.ads.zzko zzkoVar = this.zzr;
        com.google.android.gms.internal.ads.zzkl zzklVarZze = zzkoVar.zze();
        com.google.android.gms.internal.ads.zzkl zzklVarZzh = zzkoVar.zzh();
        com.google.android.gms.internal.ads.zzyc zzycVar = null;
        boolean z = true;
        while (zzklVarZze != null && zzklVarZze.zze) {
            com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
            com.google.android.gms.internal.ads.zzyc zzycVarZzj = zzklVarZze.zzj(f, zzlbVar.zza, zzlbVar.zzl);
            com.google.android.gms.internal.ads.zzyc zzycVar2 = zzklVarZze == this.zzr.zze() ? zzycVarZzj : zzycVar;
            com.google.android.gms.internal.ads.zzyc zzycVarZzi = zzklVarZze.zzi();
            boolean z2 = false;
            if (zzycVarZzi != null) {
                if (zzycVarZzi.zzc.length == zzycVarZzj.zzc.length) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= zzycVarZzj.zzc.length) {
                            if (zzklVarZze != zzklVarZzh) {
                                z2 = true;
                            }
                            z &= z2;
                            zzklVarZze = zzklVarZze.zzg();
                            zzycVar = zzycVar2;
                        } else if (zzycVarZzj.zza(zzycVarZzi, i2)) {
                            i2++;
                        }
                    }
                }
            }
            if (z) {
                com.google.android.gms.internal.ads.zzko zzkoVar2 = this.zzr;
                com.google.android.gms.internal.ads.zzkl zzklVarZze2 = zzkoVar2.zze();
                boolean zZzu = zzkoVar2.zzu(zzklVarZze2);
                boolean[] zArr = new boolean[2];
                zzycVar2.getClass();
                long jZzb = zzklVarZze2.zzb(zzycVar2, this.zzy.zzs, zZzu, zArr);
                com.google.android.gms.internal.ads.zzlb zzlbVar2 = this.zzy;
                boolean z3 = (zzlbVar2.zze == 4 || jZzb == zzlbVar2.zzs) ? false : true;
                com.google.android.gms.internal.ads.zzlb zzlbVar3 = this.zzy;
                i = 2;
                this.zzy = zzA(zzlbVar3.zzb, jZzb, zzlbVar3.zzc, zzlbVar3.zzd, z3, 5);
                if (z3) {
                    zzT(jZzb);
                }
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    com.google.android.gms.internal.ads.zzlo[] zzloVarArr = this.zzb;
                    if (i3 >= 2) {
                        break;
                    }
                    int iZza = zzloVarArr[i3].zza();
                    zArr2[i3] = 1 == iZza;
                    if (iZza != 0) {
                        if (!this.zzb[i3].zzy(zzklVarZze2)) {
                            zzB(i3);
                        } else if (zArr[i3]) {
                            this.zzb[i3].zzm(this.zzL);
                        }
                    }
                    i3++;
                }
                zzE(zArr2, this.zzL);
            } else {
                i = 2;
                this.zzr.zzu(zzklVarZze);
                if (zzklVarZze.zze) {
                    zzklVarZze.zza(zzycVarZzj, java.lang.Math.max(zzklVarZze.zzg.zzb, this.zzL - zzklVarZze.zze()), false);
                }
            }
            zzG(true);
            if (this.zzy.zze != 4) {
                zzK();
                zzaf();
                this.zzi.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzQ() throws com.google.android.gms.internal.ads.zzib {
        zzP();
        zzW(true);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e A[PHI: r2 r7 r9
  0x008e: PHI (r2v2 com.google.android.gms.internal.ads.zzug) = (r2v1 com.google.android.gms.internal.ads.zzug), (r2v19 com.google.android.gms.internal.ads.zzug) binds: [B:23:0x0066, B:25:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:23:0x0066, B:25:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r9v2 long) = (r9v1 long), (r9v5 long) binds: [B:23:0x0066, B:25:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9 A[PHI: r0
  0x00d9: PHI (r0v12 com.google.android.gms.internal.ads.zzbq) = 
  (r0v11 com.google.android.gms.internal.ads.zzbq)
  (r0v11 com.google.android.gms.internal.ads.zzbq)
  (r0v17 com.google.android.gms.internal.ads.zzbq)
  (r0v17 com.google.android.gms.internal.ads.zzbq)
 binds: [B:29:0x009d, B:31:0x00a1, B:33:0x00b2, B:35:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzR(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        com.google.android.gms.internal.ads.zzbq zzbqVar;
        com.google.android.gms.internal.ads.zzug zzugVar;
        this.zzi.zzf(2);
        this.zzP = null;
        zzah(false, true);
        this.zzo.zzi();
        this.zzL = androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        try {
            zzC();
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzdo.zzd("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            com.google.android.gms.internal.ads.zzlo[] zzloVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzloVarArr[i].zzl();
                } catch (java.lang.RuntimeException e2) {
                    com.google.android.gms.internal.ads.zzdo.zzd("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzJ = 0;
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
        com.google.android.gms.internal.ads.zzug zzugVar2 = zzlbVar.zzb;
        long jLongValue = zzlbVar.zzs;
        long j = (this.zzy.zzb.zzb() || zzak(this.zzy, this.zzm)) ? this.zzy.zzc : this.zzy.zzs;
        if (z2) {
            this.zzK = null;
            android.util.Pair pairZzy = zzy(this.zzy.zza);
            zzugVar2 = (com.google.android.gms.internal.ads.zzug) pairZzy.first;
            jLongValue = ((java.lang.Long) pairZzy.second).longValue();
            boolean zEquals = zzugVar2.equals(this.zzy.zzb);
            j = androidx.media3.common.C.TIME_UNSET;
            z5 = zEquals ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.zzr.zzl();
        this.zzF = false;
        com.google.android.gms.internal.ads.zzbq zzbqVarZzx = this.zzy.zza;
        if (z3 && (zzbqVarZzx instanceof com.google.android.gms.internal.ads.zzlh)) {
            zzbqVarZzx = ((com.google.android.gms.internal.ads.zzlh) zzbqVarZzx).zzx(this.zzs.zzq());
            if (zzugVar2.zzb != -1) {
                zzbqVarZzx.zzn(zzugVar2.zza, this.zzm);
                com.google.android.gms.internal.ads.zzbo zzboVar = this.zzm;
                com.google.android.gms.internal.ads.zzbp zzbpVar = this.zzl;
                zzbqVarZzx.zze(zzboVar.zzc, zzbpVar, 0L);
                if (zzbpVar.zzb()) {
                    zzbqVar = zzbqVarZzx;
                    zzugVar = new com.google.android.gms.internal.ads.zzug(zzugVar2.zza, zzugVar2.zzd);
                } else {
                    zzbqVar = zzbqVarZzx;
                    zzugVar = zzugVar2;
                }
            } else {
                zzbqVar = zzbqVarZzx;
                zzugVar = zzugVar2;
            }
        } else {
            zzbqVar = zzbqVarZzx;
            zzugVar = zzugVar2;
        }
        com.google.android.gms.internal.ads.zzlb zzlbVar2 = this.zzy;
        int i2 = zzlbVar2.zze;
        com.google.android.gms.internal.ads.zzib zzibVar = z4 ? null : zzlbVar2.zzf;
        com.google.android.gms.internal.ads.zzwj zzwjVar = z5 ? com.google.android.gms.internal.ads.zzwj.zza : zzlbVar2.zzh;
        com.google.android.gms.internal.ads.zzyc zzycVar = z5 ? this.zzf : this.zzy.zzi;
        java.util.List listZzn = z5 ? com.google.android.gms.internal.ads.zzfxn.zzn() : this.zzy.zzj;
        com.google.android.gms.internal.ads.zzlb zzlbVar3 = this.zzy;
        this.zzy = new com.google.android.gms.internal.ads.zzlb(zzbqVar, zzugVar, j3, j2, i2, zzibVar, false, zzwjVar, zzycVar, listZzn, zzugVar, zzlbVar3.zzl, zzlbVar3.zzm, zzlbVar3.zzn, zzlbVar3.zzo, j2, 0L, j2, 0L, false);
        if (z3) {
            this.zzr.zzp();
            this.zzs.zzh();
        }
    }

    private final void zzS() {
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        boolean z = false;
        if (zzklVarZze != null && zzklVarZze.zzg.zzh && this.zzB) {
            z = true;
        }
        this.zzC = z;
    }

    private final void zzT(long j) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        long jZze = j + (zzklVarZze == null ? androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzklVarZze.zze());
        this.zzL = jZze;
        this.zzo.zzf(jZze);
        com.google.android.gms.internal.ads.zzlo[] zzloVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzloVarArr[i].zzm(this.zzL);
        }
        for (com.google.android.gms.internal.ads.zzkl zzklVarZze2 = this.zzr.zze(); zzklVarZze2 != null; zzklVarZze2 = zzklVarZze2.zzg()) {
            for (com.google.android.gms.internal.ads.zzxv zzxvVar : zzklVarZze2.zzi().zzc) {
            }
        }
    }

    private final void zzU(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzbq zzbqVar2) {
        if (zzbqVar.zzo() && zzbqVar2.zzo()) {
            return;
        }
        int size = this.zzp.size() - 1;
        if (size < 0) {
            java.util.Collections.sort(this.zzp);
            return;
        }
        com.google.android.gms.internal.ads.zzjy zzjyVar = (com.google.android.gms.internal.ads.zzjy) this.zzp.get(size);
        java.lang.Object obj = zzjyVar.zzb;
        com.google.android.gms.internal.ads.zzlf zzlfVar = zzjyVar.zza;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        com.google.android.gms.internal.ads.zzlf zzlfVar2 = zzjyVar.zza;
        throw null;
    }

    private final void zzV(long j) {
        this.zzi.zzj(2, j + ((this.zzy.zze != 3 || zzal()) ? zza : 1000L));
    }

    private final void zzW(boolean z) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzug zzugVar = this.zzr.zze().zzg.zza;
        long jZzx = zzx(zzugVar, this.zzy.zzs, true, false);
        if (jZzx != this.zzy.zzs) {
            com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
            this.zzy = zzA(zzugVar, jZzx, zzlbVar.zzc, zzlbVar.zzd, z, 5);
        }
    }

    private final void zzX(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbeVar);
    }

    private final void zzY(boolean z, int i, boolean z2, int i2) throws com.google.android.gms.internal.ads.zzib {
        this.zzz.zza(z2 ? 1 : 0);
        this.zzy = this.zzy.zzc(z, i2, i);
        zzah(false, false);
        for (com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze(); zzklVarZze != null; zzklVarZze = zzklVarZze.zzg()) {
            for (com.google.android.gms.internal.ads.zzxv zzxvVar : zzklVarZze.zzi().zzc) {
            }
        }
        if (!zzal()) {
            zzac();
            zzaf();
            return;
        }
        int i3 = this.zzy.zze;
        if (i3 == 3) {
            this.zzo.zzh();
            zzaa();
            this.zzi.zzi(2);
        } else if (i3 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzZ(int i) {
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
        if (zzlbVar.zze != i) {
            if (i != 2) {
                this.zzQ = androidx.media3.common.C.TIME_UNSET;
            }
            this.zzy = zzlbVar.zze(i);
        }
    }

    private final void zzaa() throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        if (zzklVarZze == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzyc zzycVarZzi = zzklVarZze.zzi();
        for (int i = 0; i < 2; i++) {
            if (zzycVarZzi.zzb(i)) {
                this.zzb[i].zzr();
            }
        }
    }

    private final void zzab(boolean z, boolean z2) {
        zzR(z || !this.zzI, false, true, false);
        this.zzz.zza(z2 ? 1 : 0);
        this.zzg.zze(this.zzu);
        zzZ(1);
    }

    private final void zzac() throws com.google.android.gms.internal.ads.zzib {
        this.zzo.zzi();
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzlo[] zzloVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzloVarArr[i].zzs();
            i++;
        }
    }

    private final void zzad() {
        com.google.android.gms.internal.ads.zzkl zzklVarZzd = this.zzr.zzd();
        boolean z = this.zzF || (zzklVarZzd != null && zzklVarZzd.zza.zzp());
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
        if (z != zzlbVar.zzg) {
            com.google.android.gms.internal.ads.zzbq zzbqVar = zzlbVar.zza;
            com.google.android.gms.internal.ads.zzug zzugVar = zzlbVar.zzb;
            long j = zzlbVar.zzc;
            long j2 = zzlbVar.zzd;
            int i = zzlbVar.zze;
            com.google.android.gms.internal.ads.zzib zzibVar = zzlbVar.zzf;
            com.google.android.gms.internal.ads.zzwj zzwjVar = zzlbVar.zzh;
            com.google.android.gms.internal.ads.zzyc zzycVar = zzlbVar.zzi;
            java.util.List list = zzlbVar.zzj;
            com.google.android.gms.internal.ads.zzug zzugVar2 = zzlbVar.zzk;
            boolean z2 = zzlbVar.zzl;
            int i2 = zzlbVar.zzm;
            int i3 = zzlbVar.zzn;
            com.google.android.gms.internal.ads.zzbe zzbeVar = zzlbVar.zzo;
            long j3 = zzlbVar.zzq;
            long j4 = zzlbVar.zzr;
            long j5 = zzlbVar.zzs;
            long j6 = zzlbVar.zzt;
            boolean z3 = zzlbVar.zzp;
            this.zzy = new com.google.android.gms.internal.ads.zzlb(zzbqVar, zzugVar, j, j2, i, zzibVar, z, zzwjVar, zzycVar, list, zzugVar2, z2, i2, i3, zzbeVar, j3, j4, j5, j6, false);
        }
    }

    private final void zzae(com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzyc zzycVar) {
        long jZze;
        long jZze2;
        com.google.android.gms.internal.ads.zzkl zzklVarZzd = this.zzr.zzd();
        zzklVarZzd.getClass();
        if (zzklVarZzd == this.zzr.zze()) {
            jZze = this.zzL;
            jZze2 = zzklVarZzd.zze();
        } else {
            jZze = this.zzL - zzklVarZzd.zze();
            jZze2 = zzklVarZzd.zzg.zzb;
        }
        this.zzg.zzf(new com.google.android.gms.internal.ads.zzkf(this.zzu, this.zzy.zza, zzugVar, jZze - jZze2, zzv(zzklVarZzd.zzc()), this.zzo.zzc().zzb, this.zzy.zzl, this.zzD, zzam(this.zzy.zza, zzklVarZzd.zzg.zza) ? this.zzT.zzb() : androidx.media3.common.C.TIME_UNSET), zzwjVar, zzycVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf() throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        if (zzklVarZze == null) {
            return;
        }
        long jZzd = zzklVarZze.zze ? zzklVarZze.zza.zzd() : -9223372036854775807L;
        if (jZzd != androidx.media3.common.C.TIME_UNSET) {
            if (!zzklVarZze.zzs()) {
                this.zzr.zzu(zzklVarZze);
                zzG(false);
                zzK();
            }
            zzT(jZzd);
            if (jZzd != this.zzy.zzs) {
                com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
                this.zzy = zzA(zzlbVar.zzb, jZzd, zzlbVar.zzc, jZzd, true, 5);
            }
        } else {
            long jZzb = this.zzo.zzb(zzklVarZze != this.zzr.zzh());
            this.zzL = jZzb;
            long jZze = jZzb - zzklVarZze.zze();
            long j = this.zzy.zzs;
            if (!this.zzp.isEmpty() && !this.zzy.zzb.zzb()) {
                if (this.zzO) {
                    j--;
                    this.zzO = false;
                }
                com.google.android.gms.internal.ads.zzlb zzlbVar2 = this.zzy;
                int iZza = zzlbVar2.zza.zza(zzlbVar2.zzb.zza);
                int iMin = java.lang.Math.min(this.zzN, this.zzp.size());
                if (iMin > 0) {
                    com.google.android.gms.internal.ads.zzjy zzjyVar = (com.google.android.gms.internal.ads.zzjy) this.zzp.get(iMin - 1);
                    while (zzjyVar != null && (iZza < 0 || (iZza == 0 && j < 0))) {
                        iMin--;
                        zzjyVar = iMin > 0 ? (com.google.android.gms.internal.ads.zzjy) this.zzp.get(iMin - 1) : null;
                    }
                    if (iMin < this.zzp.size()) {
                    }
                    this.zzN = iMin;
                }
            }
            if (this.zzo.zzj()) {
                boolean z = !this.zzz.zzc;
                com.google.android.gms.internal.ads.zzlb zzlbVar3 = this.zzy;
                this.zzy = zzA(zzlbVar3.zzb, jZze, zzlbVar3.zzc, jZze, z, 6);
            } else {
                com.google.android.gms.internal.ads.zzlb zzlbVar4 = this.zzy;
                zzlbVar4.zzs = jZze;
                zzlbVar4.zzt = android.os.SystemClock.elapsedRealtime();
            }
        }
        this.zzy.zzq = this.zzr.zzd().zzc();
        this.zzy.zzr = zzu();
        com.google.android.gms.internal.ads.zzlb zzlbVar5 = this.zzy;
        if (zzlbVar5.zzl && zzlbVar5.zze == 3 && zzam(zzlbVar5.zza, zzlbVar5.zzb)) {
            com.google.android.gms.internal.ads.zzlb zzlbVar6 = this.zzy;
            if (zzlbVar6.zzo.zzb == 1.0f) {
                float fZza = this.zzT.zza(zzt(zzlbVar6.zza, zzlbVar6.zzb.zza, zzlbVar6.zzs), this.zzy.zzr);
                if (this.zzo.zzc().zzb != fZza) {
                    zzX(new com.google.android.gms.internal.ads.zzbe(fZza, this.zzy.zzo.zzc));
                    zzJ(this.zzy.zzo, this.zzo.zzc().zzb, false, false);
                }
            }
        }
    }

    private final void zzag(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbq zzbqVar2, com.google.android.gms.internal.ads.zzug zzugVar2, long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        if (!zzam(zzbqVar, zzugVar)) {
            com.google.android.gms.internal.ads.zzbe zzbeVar = zzugVar.zzb() ? com.google.android.gms.internal.ads.zzbe.zza : this.zzy.zzo;
            if (this.zzo.zzc().equals(zzbeVar)) {
                return;
            }
            zzX(zzbeVar);
            zzJ(this.zzy.zzo, zzbeVar.zzb, false, false);
            return;
        }
        zzbqVar.zze(zzbqVar.zzn(zzugVar.zza, this.zzm).zzc, this.zzl, 0L);
        com.google.android.gms.internal.ads.zzhv zzhvVar = this.zzT;
        com.google.android.gms.internal.ads.zzal zzalVar = this.zzl.zzj;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzhvVar.zzd(zzalVar);
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.zzT.zze(zzt(zzbqVar, zzugVar.zza, j));
            return;
        }
        if (!java.util.Objects.equals(!zzbqVar2.zzo() ? zzbqVar2.zze(zzbqVar2.zzn(zzugVar2.zza, this.zzm).zzc, this.zzl, 0L).zzb : null, this.zzl.zzb) || z) {
            this.zzT.zze(androidx.media3.common.C.TIME_UNSET);
        }
    }

    private final void zzah(boolean z, boolean z2) {
        this.zzD = z;
        long jElapsedRealtime = androidx.media3.common.C.TIME_UNSET;
        if (z && !z2) {
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        this.zzE = jElapsedRealtime;
    }

    private final synchronized void zzai(com.google.android.gms.internal.ads.zzfvf zzfvfVar, long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((java.lang.Boolean) zzfvfVar.zza()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - android.os.SystemClock.elapsedRealtime();
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private final boolean zzaj() {
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        long j = zzklVarZze.zzg.zze;
        if (!zzklVarZze.zze) {
            return false;
        }
        if (j == androidx.media3.common.C.TIME_UNSET || this.zzy.zzs < j) {
            return true;
        }
        return !zzal();
    }

    private static boolean zzak(com.google.android.gms.internal.ads.zzlb zzlbVar, com.google.android.gms.internal.ads.zzbo zzboVar) {
        com.google.android.gms.internal.ads.zzug zzugVar = zzlbVar.zzb;
        com.google.android.gms.internal.ads.zzbq zzbqVar = zzlbVar.zza;
        return zzbqVar.zzo() || zzbqVar.zzn(zzugVar.zza, zzboVar).zzf;
    }

    private final boolean zzal() {
        com.google.android.gms.internal.ads.zzlb zzlbVar = this.zzy;
        return zzlbVar.zzl && zzlbVar.zzn == 0;
    }

    private final boolean zzam(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar) {
        if (!zzugVar.zzb() && !zzbqVar.zzo()) {
            zzbqVar.zze(zzbqVar.zzn(zzugVar.zza, this.zzm).zzc, this.zzl, 0L);
            if (this.zzl.zzb()) {
                com.google.android.gms.internal.ads.zzbp zzbpVar = this.zzl;
                if (zzbpVar.zzi && zzbpVar.zzf != androidx.media3.common.C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private static com.google.android.gms.internal.ads.zzab[] zzan(com.google.android.gms.internal.ads.zzxv zzxvVar) {
        int iZzd = zzxvVar != null ? zzxvVar.zzd() : 0;
        com.google.android.gms.internal.ads.zzab[] zzabVarArr = new com.google.android.gms.internal.ads.zzab[iZzd];
        for (int i = 0; i < iZzd; i++) {
            zzabVarArr[i] = zzxvVar.zze(i);
        }
        return zzabVarArr;
    }

    private static final void zzao(com.google.android.gms.internal.ads.zzlf zzlfVar) throws com.google.android.gms.internal.ads.zzib {
        zzlfVar.zzi();
        try {
            zzlfVar.zzc().zzu(zzlfVar.zza(), zzlfVar.zzg());
        } finally {
            zzlfVar.zzh(true);
        }
    }

    private static final boolean zzap(com.google.android.gms.internal.ads.zzkl zzklVar) {
        if (zzklVar != null) {
            try {
                if (zzklVar.zze) {
                    com.google.android.gms.internal.ads.zzvy[] zzvyVarArr = zzklVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        com.google.android.gms.internal.ads.zzvy zzvyVar = zzvyVarArr[i];
                        if (zzvyVar != null) {
                            zzvyVar.zzd();
                        }
                    }
                } else {
                    zzklVar.zza.zzk();
                }
                if (zzklVar.zzd() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return false;
    }

    static int zzb(com.google.android.gms.internal.ads.zzbp zzbpVar, com.google.android.gms.internal.ads.zzbo zzboVar, int i, boolean z, java.lang.Object obj, com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzbq zzbqVar2) {
        java.lang.Object obj2 = zzbqVar.zze(zzbqVar.zzn(obj, zzboVar).zzc, zzbpVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbqVar2.zzc(); i2++) {
            if (zzbqVar2.zze(i2, zzbpVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int iZza = zzbqVar.zza(obj);
        int iZzb = zzbqVar.zzb();
        int iZzi = iZza;
        int iZza2 = -1;
        for (int i3 = 0; i3 < iZzb && iZza2 == -1; i3++) {
            iZzi = zzbqVar.zzi(iZzi, zzboVar, zzbpVar, i, z);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzbqVar2.zza(zzbqVar.zzf(iZzi));
        }
        if (iZza2 == -1) {
            return -1;
        }
        return zzbqVar2.zzd(iZza2, zzboVar, false).zzc;
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzkl zzd(com.google.android.gms.internal.ads.zzkc zzkcVar, com.google.android.gms.internal.ads.zzkm zzkmVar, long j) {
        com.google.android.gms.internal.ads.zzyk zzykVarZzk = zzkcVar.zzg.zzk();
        long j2 = zzkcVar.zzR.zzb;
        com.google.android.gms.internal.ads.zzyc zzycVar = zzkcVar.zzf;
        com.google.android.gms.internal.ads.zzla zzlaVar = zzkcVar.zzs;
        return new com.google.android.gms.internal.ads.zzkl(zzkcVar.zzc, j, zzkcVar.zze, zzykVarZzk, zzlaVar, zzkmVar, zzycVar, androidx.media3.common.C.TIME_UNSET);
    }

    static final /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzlf zzlfVar) {
        try {
            zzao(zzlfVar);
        } catch (com.google.android.gms.internal.ads.zzib e) {
            com.google.android.gms.internal.ads.zzdo.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new java.lang.RuntimeException(e);
        }
    }

    private final long zzt(com.google.android.gms.internal.ads.zzbq zzbqVar, java.lang.Object obj, long j) {
        zzbqVar.zze(zzbqVar.zzn(obj, this.zzm).zzc, this.zzl, 0L);
        com.google.android.gms.internal.ads.zzbp zzbpVar = this.zzl;
        if (zzbpVar.zzf != androidx.media3.common.C.TIME_UNSET && zzbpVar.zzb()) {
            com.google.android.gms.internal.ads.zzbp zzbpVar2 = this.zzl;
            if (zzbpVar2.zzi) {
                long j2 = zzbpVar2.zzg;
                return com.google.android.gms.internal.ads.zzei.zzs((j2 == androidx.media3.common.C.TIME_UNSET ? java.lang.System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - this.zzl.zzf) - j;
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private final long zzu() {
        return zzv(this.zzy.zzq);
    }

    private final long zzv(long j) {
        com.google.android.gms.internal.ads.zzkl zzklVarZzd = this.zzr.zzd();
        if (zzklVarZzd == null) {
            return 0L;
        }
        return java.lang.Math.max(0L, j - (this.zzL - zzklVarZzd.zze()));
    }

    private final long zzw(com.google.android.gms.internal.ads.zzug zzugVar, long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzko zzkoVar = this.zzr;
        return zzx(zzugVar, j, zzkoVar.zze() != zzkoVar.zzh(), z);
    }

    private final long zzx(com.google.android.gms.internal.ads.zzug zzugVar, long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzib {
        zzac();
        zzah(false, true);
        if (z2 || this.zzy.zze == 3) {
            zzZ(2);
        }
        com.google.android.gms.internal.ads.zzkl zzklVarZze = this.zzr.zze();
        com.google.android.gms.internal.ads.zzkl zzklVarZzg = zzklVarZze;
        while (zzklVarZzg != null && !zzugVar.equals(zzklVarZzg.zzg.zza)) {
            zzklVarZzg = zzklVarZzg.zzg();
        }
        if (z || zzklVarZze != zzklVarZzg || (zzklVarZzg != null && zzklVarZzg.zze() + j < 0)) {
            zzC();
            if (zzklVarZzg != null) {
                while (this.zzr.zze() != zzklVarZzg) {
                    this.zzr.zza();
                }
                this.zzr.zzu(zzklVarZzg);
                zzklVarZzg.zzq(androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzD();
            }
        }
        if (zzklVarZzg != null) {
            this.zzr.zzu(zzklVarZzg);
            if (!zzklVarZzg.zze) {
                zzklVarZzg.zzg = zzklVarZzg.zzg.zzb(j);
            } else if (zzklVarZzg.zzf) {
                j = zzklVarZzg.zza.zze(j);
                zzklVarZzg.zza.zzj(j - this.zzn, false);
            }
            zzT(j);
            zzK();
        } else {
            this.zzr.zzl();
            zzT(j);
        }
        zzG(false);
        this.zzi.zzi(2);
        return j;
    }

    private final android.util.Pair zzy(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        long j = 0;
        if (zzbqVar.zzo()) {
            return android.util.Pair.create(com.google.android.gms.internal.ads.zzlb.zzh(), 0L);
        }
        android.util.Pair pairZzl = zzbqVar.zzl(this.zzl, this.zzm, zzbqVar.zzg(this.zzH), androidx.media3.common.C.TIME_UNSET);
        com.google.android.gms.internal.ads.zzug zzugVarZzk = this.zzr.zzk(zzbqVar, pairZzl.first, 0L);
        long jLongValue = ((java.lang.Long) pairZzl.second).longValue();
        if (zzugVarZzk.zzb()) {
            zzbqVar.zzn(zzugVarZzk.zza, this.zzm);
            if (zzugVarZzk.zzc == this.zzm.zze(zzugVarZzk.zzb)) {
                this.zzm.zzh();
            }
        } else {
            j = jLongValue;
        }
        return android.util.Pair.create(zzugVarZzk, java.lang.Long.valueOf(j));
    }

    private static android.util.Pair zzz(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzka zzkaVar, boolean z, int i, boolean z2, com.google.android.gms.internal.ads.zzbp zzbpVar, com.google.android.gms.internal.ads.zzbo zzboVar) {
        com.google.android.gms.internal.ads.zzbq zzbqVar2 = zzkaVar.zza;
        if (zzbqVar.zzo()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzbq zzbqVar3 = true == zzbqVar2.zzo() ? zzbqVar : zzbqVar2;
        try {
            android.util.Pair pairZzl = zzbqVar3.zzl(zzbpVar, zzboVar, zzkaVar.zzb, zzkaVar.zzc);
            if (zzbqVar.equals(zzbqVar3)) {
                return pairZzl;
            }
            if (zzbqVar.zza(pairZzl.first) != -1) {
                return (zzbqVar3.zzn(pairZzl.first, zzboVar).zzf && zzbqVar3.zze(zzboVar.zzc, zzbpVar, 0L).zzn == zzbqVar3.zza(pairZzl.first)) ? zzbqVar.zzl(zzbpVar, zzboVar, zzbqVar.zzn(pairZzl.first, zzboVar).zzc, zzkaVar.zzc) : pairZzl;
            }
            int iZzb = zzb(zzbpVar, zzboVar, i, z2, pairZzl.first, zzbqVar3, zzbqVar);
            if (iZzb != -1) {
                return zzbqVar.zzl(zzbpVar, zzboVar, iZzb, androidx.media3.common.C.TIME_UNSET);
            }
            return null;
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29601. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r39) {
        /*
            Method dump skipped, instruction units count: 2960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        this.zzi.zzc(16, zzbeVar).zza();
    }

    public final android.os.Looper zzc() {
        return this.zzk;
    }

    final /* synthetic */ java.lang.Boolean zze() {
        return java.lang.Boolean.valueOf(this.zzA);
    }

    final /* synthetic */ void zzf(int i, boolean z) {
        this.zzv.zzI(i, this.zzb[i].zzb(), z);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzwa zzwaVar) {
        this.zzi.zzc(9, (com.google.android.gms.internal.ads.zzue) zzwaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final void zzh() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(com.google.android.gms.internal.ads.zzue zzueVar) {
        this.zzi.zzc(8, zzueVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzj() {
        this.zzi.zzi(10);
    }

    public final void zzk() {
        this.zzi.zzb(29).zza();
    }

    public final void zzl(com.google.android.gms.internal.ads.zzbq zzbqVar, int i, long j) {
        this.zzi.zzc(3, new com.google.android.gms.internal.ads.zzka(zzbqVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final synchronized void zzm(com.google.android.gms.internal.ads.zzlf zzlfVar) {
        if (!this.zzA && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzlfVar).zza();
            return;
        }
        com.google.android.gms.internal.ads.zzdo.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlfVar.zzh(false);
    }

    public final void zzn(boolean z, int i, int i2) {
        this.zzi.zzd(1, z ? 1 : 0, i | (i2 << 4)).zza();
    }

    public final void zzo() {
        this.zzi.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzA && this.zzk.getThread().isAlive()) {
            this.zzi.zzi(7);
            zzai(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzjq
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final java.lang.Object zza() {
                    return this.zza.zze();
                }
            }, this.zzt);
            return this.zzA;
        }
        return true;
    }

    public final synchronized boolean zzq(java.lang.Object obj, long j) {
        if (!this.zzA && this.zzk.getThread().isAlive()) {
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
            this.zzi.zzc(30, new android.util.Pair(obj, atomicBoolean)).zza();
            if (j != androidx.media3.common.C.TIME_UNSET) {
                java.util.Objects.requireNonNull(atomicBoolean);
                zzai(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzjt
                    @Override // com.google.android.gms.internal.ads.zzfvf
                    public final java.lang.Object zza() {
                        return java.lang.Boolean.valueOf(atomicBoolean.get());
                    }
                }, j);
                return atomicBoolean.get();
            }
        }
        return true;
    }

    public final void zzr(java.util.List list, int i, long j, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        this.zzi.zzc(17, new com.google.android.gms.internal.ads.zzjw(list, zzwbVar, i, j, null)).zza();
    }
}
