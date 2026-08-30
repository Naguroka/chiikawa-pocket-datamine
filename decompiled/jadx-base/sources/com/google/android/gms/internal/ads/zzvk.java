package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzvk implements com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzacq, com.google.android.gms.internal.ads.zzyq, com.google.android.gms.internal.ads.zzyu, com.google.android.gms.internal.ads.zzvv {
    private static final java.util.Map zzb;
    private static final com.google.android.gms.internal.ads.zzab zzc;
    private com.google.android.gms.internal.ads.zzadm zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final com.google.android.gms.internal.ads.zzyk zzP;
    private final android.net.Uri zzd;
    private final com.google.android.gms.internal.ads.zzfy zze;
    private final com.google.android.gms.internal.ads.zzrf zzf;
    private final com.google.android.gms.internal.ads.zzuq zzg;
    private final com.google.android.gms.internal.ads.zzra zzh;
    private final com.google.android.gms.internal.ads.zzvg zzi;
    private final long zzj;
    private final long zzk;
    private final com.google.android.gms.internal.ads.zzuz zzm;
    private com.google.android.gms.internal.ads.zzud zzr;
    private com.google.android.gms.internal.ads.zzafr zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private com.google.android.gms.internal.ads.zzvj zzz;
    private final com.google.android.gms.internal.ads.zzyy zzl = new com.google.android.gms.internal.ads.zzyy("ProgressiveMediaPeriod");
    private final com.google.android.gms.internal.ads.zzda zzn = new com.google.android.gms.internal.ads.zzda(com.google.android.gms.internal.ads.zzcx.zza);
    private final java.lang.Runnable zzo = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzU();
        }
    };
    private final java.lang.Runnable zzp = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzvc
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzE();
        }
    };
    private final android.os.Handler zzq = com.google.android.gms.internal.ads.zzei.zzy(null);
    private com.google.android.gms.internal.ads.zzvi[] zzu = new com.google.android.gms.internal.ads.zzvi[0];
    private com.google.android.gms.internal.ads.zzvx[] zzt = new com.google.android.gms.internal.ads.zzvx[0];
    private long zzK = androidx.media3.common.C.TIME_UNSET;
    private int zzD = 1;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = java.util.Collections.unmodifiableMap(map);
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzM("icy");
        zzzVar.zzaa(androidx.media3.common.MimeTypes.APPLICATION_ICY);
        zzc = zzzVar.zzag();
    }

    public zzvk(android.net.Uri uri, com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzuz zzuzVar, com.google.android.gms.internal.ads.zzrf zzrfVar, com.google.android.gms.internal.ads.zzra zzraVar, com.google.android.gms.internal.ads.zzyo zzyoVar, com.google.android.gms.internal.ads.zzuq zzuqVar, com.google.android.gms.internal.ads.zzvg zzvgVar, com.google.android.gms.internal.ads.zzyk zzykVar, java.lang.String str, int i, boolean z, long j, com.google.android.gms.internal.ads.zzzg zzzgVar) {
        this.zzd = uri;
        this.zze = zzfyVar;
        this.zzf = zzrfVar;
        this.zzh = zzraVar;
        this.zzg = zzuqVar;
        this.zzi = zzvgVar;
        this.zzP = zzykVar;
        this.zzj = i;
        this.zzm = zzuzVar;
        this.zzk = j;
    }

    static /* bridge */ /* synthetic */ void zzC(final com.google.android.gms.internal.ads.zzvk zzvkVar) {
        zzvkVar.zzq.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzva
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    private final int zzQ() {
        int iZzd = 0;
        for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
            iZzd += zzvxVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    private final long zzR(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            com.google.android.gms.internal.ads.zzvx[] zzvxVarArr = this.zzt;
            if (i >= zzvxVarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = java.lang.Math.max(jMax, zzvxVarArr[i].zzh());
            } else {
                com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzz;
                zzvjVar.getClass();
                if (zzvjVar.zzc[i]) {
                    jMax = java.lang.Math.max(jMax, zzvxVarArr[i].zzh());
                }
            }
            i++;
        }
    }

    private final com.google.android.gms.internal.ads.zzadt zzS(com.google.android.gms.internal.ads.zzvi zzviVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzviVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            com.google.android.gms.internal.ads.zzdo.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzviVar.zza + ") after finishing tracks.");
            return new com.google.android.gms.internal.ads.zzaci();
        }
        com.google.android.gms.internal.ads.zzvx zzvxVar = new com.google.android.gms.internal.ads.zzvx(this.zzP, this.zzf, this.zzh);
        zzvxVar.zzv(this);
        int i2 = length + 1;
        com.google.android.gms.internal.ads.zzvi[] zzviVarArr = (com.google.android.gms.internal.ads.zzvi[]) java.util.Arrays.copyOf(this.zzu, i2);
        zzviVarArr[length] = zzviVar;
        int i3 = com.google.android.gms.internal.ads.zzei.zza;
        this.zzu = zzviVarArr;
        com.google.android.gms.internal.ads.zzvx[] zzvxVarArr = (com.google.android.gms.internal.ads.zzvx[]) java.util.Arrays.copyOf(this.zzt, i2);
        zzvxVarArr[length] = zzvxVar;
        this.zzt = zzvxVarArr;
        return zzvxVar;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
            if (zzvxVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzc();
        int length = this.zzt.length;
        com.google.android.gms.internal.ads.zzbr[] zzbrVarArr = new com.google.android.gms.internal.ads.zzbr[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            com.google.android.gms.internal.ads.zzab zzabVarZzi = this.zzt[i2].zzi();
            zzabVarZzi.getClass();
            java.lang.String str = zzabVarZzi.zzo;
            boolean zZzg = com.google.android.gms.internal.ads.zzbb.zzg(str);
            boolean z = zZzg || com.google.android.gms.internal.ads.zzbb.zzi(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            this.zzy = this.zzk != androidx.media3.common.C.TIME_UNSET && length == 1 && com.google.android.gms.internal.ads.zzbb.zzh(str);
            com.google.android.gms.internal.ads.zzafr zzafrVar = this.zzs;
            if (zzafrVar != null) {
                if (zZzg || this.zzu[i2].zzb) {
                    com.google.android.gms.internal.ads.zzay zzayVar = zzabVarZzi.zzl;
                    com.google.android.gms.internal.ads.zzay zzayVar2 = zzayVar == null ? new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, zzafrVar) : zzayVar.zzc(zzafrVar);
                    com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVarZzi.zzb();
                    zzzVarZzb.zzT(zzayVar2);
                    zzabVarZzi = zzzVarZzb.zzag();
                }
                if (zZzg && zzabVarZzi.zzh == -1 && zzabVarZzi.zzi == -1 && (i = zzafrVar.zza) != -1) {
                    com.google.android.gms.internal.ads.zzz zzzVarZzb2 = zzabVarZzi.zzb();
                    zzzVarZzb2.zzy(i);
                    zzabVarZzi = zzzVarZzb2.zzag();
                }
            }
            com.google.android.gms.internal.ads.zzab zzabVarZzc = zzabVarZzi.zzc(this.zzf.zza(zzabVarZzi));
            zzbrVarArr[i2] = new com.google.android.gms.internal.ads.zzbr(java.lang.Integer.toString(i2), zzabVarZzc);
            this.zzG = zzabVarZzc.zzu | this.zzG;
        }
        this.zzz = new com.google.android.gms.internal.ads.zzvj(new com.google.android.gms.internal.ads.zzwj(zzbrVarArr), zArr);
        if (this.zzy && this.zzB == androidx.media3.common.C.TIME_UNSET) {
            this.zzB = this.zzk;
            this.zzA = new com.google.android.gms.internal.ads.zzve(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
        this.zzw = true;
        com.google.android.gms.internal.ads.zzud zzudVar = this.zzr;
        zzudVar.getClass();
        zzudVar.zzi(this);
    }

    private final void zzV(int i) {
        zzT();
        com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzz;
        boolean[] zArr = zzvjVar.zzd;
        if (zArr[i]) {
            return;
        }
        com.google.android.gms.internal.ads.zzab zzabVarZzb = zzvjVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(new com.google.android.gms.internal.ads.zzuc(1, com.google.android.gms.internal.ads.zzbb.zzb(zzabVarZzb.zzo), zzabVarZzb, 0, null, com.google.android.gms.internal.ads.zzei.zzv(this.zzJ), androidx.media3.common.C.TIME_UNSET));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzL && zArr[i] && !this.zzt[i].zzy(false)) {
            this.zzK = 0L;
            this.zzL = false;
            this.zzF = true;
            this.zzJ = 0L;
            this.zzM = 0;
            for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
                zzvxVar.zzq(false);
            }
            com.google.android.gms.internal.ads.zzud zzudVar = this.zzr;
            zzudVar.getClass();
            zzudVar.zzg(this);
        }
    }

    private final void zzX() {
        com.google.android.gms.internal.ads.zzvf zzvfVar = new com.google.android.gms.internal.ads.zzvf(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            com.google.android.gms.internal.ads.zzcw.zzf(zzY());
            long j = this.zzB;
            if (j != androidx.media3.common.C.TIME_UNSET && this.zzK > j) {
                this.zzN = true;
                this.zzK = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            com.google.android.gms.internal.ads.zzadm zzadmVar = this.zzA;
            zzadmVar.getClass();
            com.google.android.gms.internal.ads.zzvf.zzf(zzvfVar, zzadmVar.zzg(this.zzK).zza.zzc, this.zzK);
            for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
                zzvxVar.zzu(this.zzK);
            }
            this.zzK = androidx.media3.common.C.TIME_UNSET;
        }
        this.zzM = zzQ();
        long jZza = this.zzl.zza(zzvfVar, this, com.google.android.gms.internal.ads.zzyo.zza(this.zzD));
        this.zzg.zzh(new com.google.android.gms.internal.ads.zztx(zzvfVar.zzb, zzvfVar.zzl, jZza), new com.google.android.gms.internal.ads.zzuc(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzei.zzv(zzvfVar.zzk), com.google.android.gms.internal.ads.zzei.zzv(this.zzB)));
    }

    private final boolean zzY() {
        return this.zzK != androidx.media3.common.C.TIME_UNSET;
    }

    private final boolean zzZ() {
        return this.zzF || zzY();
    }

    static /* bridge */ /* synthetic */ long zzr(com.google.android.gms.internal.ads.zzvk zzvkVar, boolean z) {
        return zzvkVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    final /* synthetic */ void zzF() {
        this.zzI = true;
    }

    final void zzH() throws java.io.IOException {
        this.zzl.zzi(com.google.android.gms.internal.ads.zzyo.zza(this.zzD));
    }

    final void zzI(int i) throws java.io.IOException {
        this.zzt[i].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final /* bridge */ /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzyt zzytVar, long j, long j2, boolean z) {
        com.google.android.gms.internal.ads.zzvf zzvfVar = (com.google.android.gms.internal.ads.zzvf) zzytVar;
        com.google.android.gms.internal.ads.zzgx zzgxVar = zzvfVar.zzd;
        com.google.android.gms.internal.ads.zztx zztxVar = new com.google.android.gms.internal.ads.zztx(zzvfVar.zzb, zzvfVar.zzl, zzgxVar.zzh(), zzgxVar.zzi(), j, j2, zzgxVar.zzg());
        long unused = zzvfVar.zzb;
        this.zzg.zze(zztxVar, new com.google.android.gms.internal.ads.zzuc(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzei.zzv(zzvfVar.zzk), com.google.android.gms.internal.ads.zzei.zzv(this.zzB)));
        if (z) {
            return;
        }
        for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
            zzvxVar.zzq(false);
        }
        if (this.zzH > 0) {
            com.google.android.gms.internal.ads.zzud zzudVar = this.zzr;
            zzudVar.getClass();
            zzudVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final /* bridge */ /* synthetic */ void zzK(com.google.android.gms.internal.ads.zzyt zzytVar, long j, long j2) {
        com.google.android.gms.internal.ads.zzadm zzadmVar;
        com.google.android.gms.internal.ads.zzvf zzvfVar = (com.google.android.gms.internal.ads.zzvf) zzytVar;
        if (this.zzB == androidx.media3.common.C.TIME_UNSET && (zzadmVar = this.zzA) != null) {
            boolean zZzh = zzadmVar.zzh();
            long jZzR = zzR(true);
            long j3 = jZzR == Long.MIN_VALUE ? 0L : jZzR + 10000;
            this.zzB = j3;
            this.zzi.zza(j3, zZzh, this.zzC);
        }
        com.google.android.gms.internal.ads.zzgx zzgxVar = zzvfVar.zzd;
        com.google.android.gms.internal.ads.zztx zztxVar = new com.google.android.gms.internal.ads.zztx(zzvfVar.zzb, zzvfVar.zzl, zzgxVar.zzh(), zzgxVar.zzi(), j, j2, zzgxVar.zzg());
        long unused = zzvfVar.zzb;
        this.zzg.zzf(zztxVar, new com.google.android.gms.internal.ads.zzuc(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzei.zzv(zzvfVar.zzk), com.google.android.gms.internal.ads.zzei.zzv(this.zzB)));
        this.zzN = true;
        com.google.android.gms.internal.ads.zzud zzudVar = this.zzr;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL() {
        for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
            zzvxVar.zzp();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zzM(com.google.android.gms.internal.ads.zzab zzabVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
                zzvxVar.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzO(final com.google.android.gms.internal.ads.zzadm zzadmVar) {
        this.zzq.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(zzadmVar);
            }
        });
    }

    final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzy(this.zzN);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, com.google.android.gms.internal.ads.zzlp zzlpVar) {
        zzT();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        com.google.android.gms.internal.ads.zzadk zzadkVarZzg = this.zzA.zzg(j);
        com.google.android.gms.internal.ads.zzadn zzadnVar = zzadkVarZzg.zza;
        com.google.android.gms.internal.ads.zzadn zzadnVar2 = zzadkVarZzg.zzb;
        long j2 = zzlpVar.zzc;
        if (j2 == 0) {
            if (zzlpVar.zzd == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzadnVar.zzb;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        long j4 = j - j2;
        long j5 = zzlpVar.zzd;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = zzadnVar2.zzb;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (java.lang.Math.abs(j3 - j) > java.lang.Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            return z2 ? j9 : j4;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jZzR;
        zzT();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzz;
                if (zzvjVar.zzb[i] && zzvjVar.zzc[i] && !this.zzt[i].zzx()) {
                    jZzR = java.lang.Math.min(jZzR, this.zzt[i].zzh());
                }
            }
        } else {
            jZzR = Long.MAX_VALUE;
        }
        if (jZzR == Long.MAX_VALUE) {
            jZzR = zzR(false);
        }
        return jZzR == Long.MIN_VALUE ? this.zzJ : jZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            if (!this.zzN && zzQ() <= this.zzM) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[LOOP:1: B:36:0x007a->B:37:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[LOOP:2: B:40:0x0091->B:41:0x0093, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0077, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x008a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        com.google.android.gms.internal.ads.zzyy zzyyVar;
        int i;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j = 0;
        }
        this.zzF = false;
        long j2 = this.zzJ;
        this.zzJ = j;
        if (zzY()) {
            this.zzK = j;
            return j;
        }
        if (this.zzD == 7 || !(this.zzN || this.zzl.zzl())) {
            this.zzL = false;
            this.zzK = j;
            this.zzN = false;
            this.zzG = false;
            zzyyVar = this.zzl;
            if (zzyyVar.zzl()) {
                zzyyVar.zzh();
                for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
                    zzvxVar.zzq(false);
                }
                break;
            }
            for (com.google.android.gms.internal.ads.zzvx zzvxVar2 : this.zzt) {
                zzvxVar2.zzk();
            }
            this.zzl.zzg();
            break;
        }
        int length = this.zzt.length;
        for (int i2 = 0; i2 < length; i2++) {
            com.google.android.gms.internal.ads.zzvx zzvxVar3 = this.zzt[i2];
            if (zzvxVar3.zzb() != 0 || j2 != j) {
                if (!(this.zzy ? zzvxVar3.zzz(zzvxVar3.zza()) : zzvxVar3.zzA(j, false)) && (zArr[i2] || !this.zzx)) {
                    this.zzL = false;
                    this.zzK = j;
                    this.zzN = false;
                    this.zzG = false;
                    zzyyVar = this.zzl;
                    if (zzyyVar.zzl()) {
                        zzyyVar.zzh();
                        while (i < r2) {
                            zzvxVar.zzq(false);
                        }
                        break;
                        break;
                    }
                    while (i < r2) {
                        zzvxVar2.zzk();
                    }
                    this.zzl.zzg();
                    break;
                }
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(com.google.android.gms.internal.ads.zzxv[] zzxvVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        com.google.android.gms.internal.ads.zzxv zzxvVar;
        zzT();
        com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzz;
        com.google.android.gms.internal.ads.zzwj zzwjVar = zzvjVar.zza;
        boolean[] zArr3 = zzvjVar.zzc;
        int i = this.zzH;
        int i2 = 0;
        for (int i3 = 0; i3 < zzxvVarArr.length; i3++) {
            com.google.android.gms.internal.ads.zzvy zzvyVar = zzvyVarArr[i3];
            if (zzvyVar != null && (zzxvVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((com.google.android.gms.internal.ads.zzvh) zzvyVar).zzb;
                com.google.android.gms.internal.ads.zzcw.zzf(zArr3[i4]);
                this.zzH--;
                zArr3[i4] = false;
                zzvyVarArr[i3] = null;
            }
        }
        boolean z = !this.zzE ? j == 0 || this.zzy : i != 0;
        for (int i5 = 0; i5 < zzxvVarArr.length; i5++) {
            if (zzvyVarArr[i5] == null && (zzxvVar = zzxvVarArr[i5]) != null) {
                com.google.android.gms.internal.ads.zzcw.zzf(zzxvVar.zzd() == 1);
                com.google.android.gms.internal.ads.zzcw.zzf(zzxvVar.zza(0) == 0);
                int iZza = zzwjVar.zza(zzxvVar.zzg());
                com.google.android.gms.internal.ads.zzcw.zzf(!zArr3[iZza]);
                this.zzH++;
                zArr3[iZza] = true;
                this.zzG = zzxvVar.zzf().zzu | this.zzG;
                zzvyVarArr[i5] = new com.google.android.gms.internal.ads.zzvh(this, iZza);
                zArr2[i5] = true;
                if (!z) {
                    com.google.android.gms.internal.ads.zzvx zzvxVar = this.zzt[iZza];
                    z = (zzvxVar.zzb() == 0 || zzvxVar.zzA(j, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            if (this.zzl.zzl()) {
                com.google.android.gms.internal.ads.zzvx[] zzvxVarArr = this.zzt;
                int length = zzvxVarArr.length;
                while (i2 < length) {
                    zzvxVarArr[i2].zzk();
                    i2++;
                }
                this.zzl.zzg();
            } else {
                this.zzN = false;
                for (com.google.android.gms.internal.ads.zzvx zzvxVar2 : this.zzt) {
                    zzvxVar2.zzq(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzvyVarArr.length) {
                if (zzvyVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzE = true;
        return j;
    }

    final int zzg(int i, com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int iZze = this.zzt[i].zze(zzkeVar, zzhhVar, i2, this.zzN);
        if (iZze == -3) {
            zzW(i);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final com.google.android.gms.internal.ads.zzwj zzh() {
        zzT();
        return this.zzz.zza;
    }

    final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        com.google.android.gms.internal.ads.zzvx zzvxVar = this.zzt[i];
        int iZzc = zzvxVar.zzc(j, this.zzN);
        zzvxVar.zzw(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        if (this.zzy) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws java.io.IOException {
        try {
            zzH();
            if (this.zzN && !this.zzw) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Loading finished before preparation is complete.", null);
            }
        } catch (java.io.IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(com.google.android.gms.internal.ads.zzud zzudVar, long j) {
        this.zzr = zzudVar;
        this.zzn.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        if (this.zzN) {
            return false;
        }
        com.google.android.gms.internal.ads.zzyy zzyyVar = this.zzl;
        if (zzyyVar.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zZze = this.zzn.zze();
        if (zzyyVar.zzl()) {
            return zZze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyr zzu(com.google.android.gms.internal.ads.zzyt zzytVar, long j, long j2, java.io.IOException iOException, int i) {
        long jMin;
        com.google.android.gms.internal.ads.zzyr zzyrVarZzb;
        com.google.android.gms.internal.ads.zzadm zzadmVar;
        com.google.android.gms.internal.ads.zzvf zzvfVar = (com.google.android.gms.internal.ads.zzvf) zzytVar;
        com.google.android.gms.internal.ads.zzgx zzgxVar = zzvfVar.zzd;
        com.google.android.gms.internal.ads.zztx zztxVar = new com.google.android.gms.internal.ads.zztx(zzvfVar.zzb, zzvfVar.zzl, zzgxVar.zzh(), zzgxVar.zzi(), j, j2, zzgxVar.zzg());
        long unused = zzvfVar.zzk;
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        if ((iOException instanceof com.google.android.gms.internal.ads.zzbc) || (iOException instanceof java.io.FileNotFoundException) || (iOException instanceof com.google.android.gms.internal.ads.zzgo) || (iOException instanceof com.google.android.gms.internal.ads.zzyw)) {
            jMin = -9223372036854775807L;
            break;
        }
        java.lang.Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = java.lang.Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof com.google.android.gms.internal.ads.zzfz) && ((com.google.android.gms.internal.ads.zzfz) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == androidx.media3.common.C.TIME_UNSET) {
            zzyrVarZzb = com.google.android.gms.internal.ads.zzyy.zzb;
        } else {
            int iZzQ = zzQ();
            boolean z = iZzQ > this.zzM;
            if (this.zzI || !((zzadmVar = this.zzA) == null || zzadmVar.zza() == androidx.media3.common.C.TIME_UNSET)) {
                this.zzM = iZzQ;
            } else {
                boolean z2 = this.zzw;
                if (!z2 || zzZ()) {
                    this.zzF = z2;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    for (com.google.android.gms.internal.ads.zzvx zzvxVar : this.zzt) {
                        zzvxVar.zzq(false);
                    }
                    com.google.android.gms.internal.ads.zzvf.zzf(zzvfVar, 0L, 0L);
                } else {
                    this.zzL = true;
                    zzyrVarZzb = com.google.android.gms.internal.ads.zzyy.zza;
                }
            }
            zzyrVarZzb = com.google.android.gms.internal.ads.zzyy.zzb(z, jMin);
        }
        boolean z3 = !zzyrVarZzb.zzc();
        this.zzg.zzg(zztxVar, new com.google.android.gms.internal.ads.zzuc(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzei.zzv(zzvfVar.zzk), com.google.android.gms.internal.ads.zzei.zzv(this.zzB)), iOException, z3);
        if (z3) {
            long unused2 = zzvfVar.zzb;
        }
        return zzyrVarZzb;
    }

    final com.google.android.gms.internal.ads.zzadt zzv() {
        return zzS(new com.google.android.gms.internal.ads.zzvi(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final com.google.android.gms.internal.ads.zzadt zzw(int i, int i2) {
        return zzS(new com.google.android.gms.internal.ads.zzvi(i, false));
    }

    final /* synthetic */ void zzE() {
        if (this.zzO) {
            return;
        }
        com.google.android.gms.internal.ads.zzud zzudVar = this.zzr;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    final /* synthetic */ void zzG(com.google.android.gms.internal.ads.zzadm zzadmVar) {
        this.zzA = this.zzs == null ? zzadmVar : new com.google.android.gms.internal.ads.zzadl(androidx.media3.common.C.TIME_UNSET, 0L);
        this.zzB = zzadmVar.zza();
        boolean z = false;
        if (!this.zzI && zzadmVar.zza() == androidx.media3.common.C.TIME_UNSET) {
            z = true;
        }
        this.zzC = z;
        this.zzD = true == z ? 7 : 1;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadmVar.zzh(), this.zzC);
        } else {
            zzU();
        }
    }
}
