package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzvx implements com.google.android.gms.internal.ads.zzadt {
    private boolean zzA;
    private com.google.android.gms.internal.ads.zzrg zzB;
    private final com.google.android.gms.internal.ads.zzvr zza;
    private final com.google.android.gms.internal.ads.zzrf zzd;
    private final com.google.android.gms.internal.ads.zzra zze;
    private com.google.android.gms.internal.ads.zzvv zzf;
    private com.google.android.gms.internal.ads.zzab zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private com.google.android.gms.internal.ads.zzab zzy;
    private final com.google.android.gms.internal.ads.zzvt zzb = new com.google.android.gms.internal.ads.zzvt();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private com.google.android.gms.internal.ads.zzads[] zzn = new com.google.android.gms.internal.ads.zzads[1000];
    private final com.google.android.gms.internal.ads.zzwe zzc = new com.google.android.gms.internal.ads.zzwe(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzvs
        @Override // com.google.android.gms.internal.ads.zzdb
        public final void zza(java.lang.Object obj) {
            com.google.android.gms.internal.ads.zzre zzreVar = ((com.google.android.gms.internal.ads.zzvu) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    protected zzvx(com.google.android.gms.internal.ads.zzyk zzykVar, com.google.android.gms.internal.ads.zzrf zzrfVar, com.google.android.gms.internal.ads.zzra zzraVar) {
        this.zzd = zzrfVar;
        this.zze = zzraVar;
        this.zza = new com.google.android.gms.internal.ads.zzvr(zzykVar);
    }

    private final int zzB(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzC(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzD(com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzvt zzvtVar) {
        zzhhVar.zzd = false;
        if (!zzL()) {
            if (!z2 && !this.zzv) {
                com.google.android.gms.internal.ads.zzab zzabVar = this.zzy;
                if (zzabVar == null || (!z && zzabVar == this.zzg)) {
                    return -3;
                }
                zzI(zzabVar, zzkeVar);
                return -5;
            }
            zzhhVar.zzc(4);
            zzhhVar.zze = Long.MIN_VALUE;
            return -4;
        }
        com.google.android.gms.internal.ads.zzab zzabVar2 = ((com.google.android.gms.internal.ads.zzvu) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzabVar2 == this.zzg) {
            int iZzC = zzC(this.zzr);
            if (!zzM(iZzC)) {
                zzhhVar.zzd = true;
                return -3;
            }
            zzhhVar.zzc(this.zzl[iZzC]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzhhVar.zza(536870912);
            }
            zzhhVar.zze = this.zzm[iZzC];
            zzvtVar.zza = this.zzk[iZzC];
            zzvtVar.zzb = this.zzj[iZzC];
            zzvtVar.zzc = this.zzn[iZzC];
            return -4;
        }
        zzI(zzabVar2, zzkeVar);
        return -5;
    }

    private final synchronized long zzE(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int iZzB = zzB(i3, i2, j, false);
                if (iZzB != -1) {
                    return zzG(iZzB);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzF() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzG(i);
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, com.google.android.gms.internal.ads.zzads zzadsVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int iZzC = zzC(i3 - 1);
            com.google.android.gms.internal.ads.zzcw.zzd(this.zzj[iZzC] + ((long) this.zzk[iZzC]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = java.lang.Math.max(this.zzu, j);
        int iZzC2 = zzC(this.zzo);
        this.zzm[iZzC2] = j;
        this.zzj[iZzC2] = j2;
        this.zzk[iZzC2] = i2;
        this.zzl[iZzC2] = i;
        this.zzn[iZzC2] = zzadsVar;
        this.zzi[iZzC2] = 0;
        if (this.zzc.zzf() || !((com.google.android.gms.internal.ads.zzvu) this.zzc.zzb()).zza.equals(this.zzy)) {
            com.google.android.gms.internal.ads.zzab zzabVar = this.zzy;
            zzabVar.getClass();
            this.zzc.zzc(this.zzp + this.zzo, new com.google.android.gms.internal.ads.zzvu(zzabVar, this.zzd.zzb(this.zze, zzabVar), null));
        }
        int i4 = this.zzo + 1;
        this.zzo = i4;
        int i5 = this.zzh;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            com.google.android.gms.internal.ads.zzads[] zzadsVarArr = new com.google.android.gms.internal.ads.zzads[i6];
            int i7 = this.zzq;
            int i8 = i5 - i7;
            java.lang.System.arraycopy(this.zzj, i7, jArr2, 0, i8);
            java.lang.System.arraycopy(this.zzm, this.zzq, jArr3, 0, i8);
            java.lang.System.arraycopy(this.zzl, this.zzq, iArr, 0, i8);
            java.lang.System.arraycopy(this.zzk, this.zzq, iArr2, 0, i8);
            java.lang.System.arraycopy(this.zzn, this.zzq, zzadsVarArr, 0, i8);
            java.lang.System.arraycopy(this.zzi, this.zzq, jArr, 0, i8);
            int i9 = this.zzq;
            java.lang.System.arraycopy(this.zzj, 0, jArr2, i8, i9);
            java.lang.System.arraycopy(this.zzm, 0, jArr3, i8, i9);
            java.lang.System.arraycopy(this.zzl, 0, iArr, i8, i9);
            java.lang.System.arraycopy(this.zzk, 0, iArr2, i8, i9);
            java.lang.System.arraycopy(this.zzn, 0, zzadsVarArr, i8, i9);
            java.lang.System.arraycopy(this.zzi, 0, jArr, i8, i9);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzadsVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i6;
        }
    }

    private final void zzI(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzke zzkeVar) {
        com.google.android.gms.internal.ads.zzab zzabVar2 = this.zzg;
        com.google.android.gms.internal.ads.zzu zzuVar = zzabVar2 == null ? null : zzabVar2.zzs;
        this.zzg = zzabVar;
        com.google.android.gms.internal.ads.zzu zzuVar2 = zzabVar.zzs;
        zzkeVar.zza = zzabVar.zzc(this.zzd.zza(zzabVar));
        zzkeVar.zzb = this.zzB;
        if (zzabVar2 == null || !java.util.Objects.equals(zzuVar, zzuVar2)) {
            com.google.android.gms.internal.ads.zzrg zzrgVarZzc = this.zzd.zzc(this.zze, zzabVar);
            this.zzB = zzrgVarZzc;
            zzkeVar.zzb = zzrgVarZzc;
        }
    }

    private final void zzJ() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i) {
        if (this.zzB != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(com.google.android.gms.internal.ads.zzab zzabVar) {
        this.zzx = false;
        if (java.util.Objects.equals(zzabVar, this.zzy)) {
            return false;
        }
        if (this.zzc.zzf() || !((com.google.android.gms.internal.ads.zzvu) this.zzc.zzb()).zza.equals(zzabVar)) {
            this.zzy = zzabVar;
        } else {
            this.zzy = ((com.google.android.gms.internal.ads.zzvu) this.zzc.zzb()).zza;
        }
        boolean z = this.zzz;
        com.google.android.gms.internal.ads.zzab zzabVar2 = this.zzy;
        this.zzz = z & com.google.android.gms.internal.ads.zzbb.zzf(zzabVar2.zzo, zzabVar2.zzk);
        this.zzA = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[EDGE_INSN: B:23:0x0044->B:26:0x0052 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[EDGE_INSN: B:24:0x0045->B:26:0x0052 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x003d A[SYNTHETIC] */
    public final synchronized boolean zzA(long j, boolean z) {
        int iZzB;
        int i;
        zzK();
        int i2 = this.zzr;
        int iZzC = zzC(i2);
        if (zzL() && j >= this.zzm[iZzC]) {
            if (j <= this.zzu) {
                if (this.zzz) {
                    iZzB = this.zzo - i2;
                    i = 0;
                    while (true) {
                        if (i < iZzB) {
                            if (z) {
                                iZzB = -1;
                                break;
                            }
                            break;
                        }
                        if (this.zzm[iZzC] < j) {
                            iZzB = i;
                            break;
                        }
                        iZzC++;
                        if (iZzC == this.zzh) {
                            iZzC = 0;
                        }
                        i++;
                    }
                } else {
                    iZzB = zzB(iZzC, this.zzo - i2, j, true);
                }
                if (iZzB == -1) {
                    this.zzs = j;
                    this.zzr += iZzB;
                    return true;
                }
            } else if (z) {
                z = true;
                if (this.zzz) {
                    iZzB = this.zzo - i2;
                    i = 0;
                    while (true) {
                        if (i < iZzB) {
                            if (z) {
                                iZzB = -1;
                                break;
                            }
                            break;
                            break;
                        }
                        if (this.zzm[iZzC] < j) {
                            iZzB = i;
                            break;
                        }
                        iZzC++;
                        if (iZzC == this.zzh) {
                            iZzC = 0;
                        }
                        i++;
                    }
                } else {
                    iZzB = zzB(iZzC, this.zzo - i2, j, true);
                }
                if (iZzB == -1) {
                    this.zzs = j;
                    this.zzr += iZzB;
                    return true;
                }
            }
        }
        return false;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z) {
        int i = this.zzr;
        int iZzC = zzC(i);
        if (zzL() && j >= this.zzm[iZzC]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int iZzB = zzB(iZzC, this.zzo - i, j, true);
            if (iZzB == -1) {
                return 0;
            }
            return iZzB;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zze(com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, int i, boolean z) {
        int iZzD = zzD(zzkeVar, zzhhVar, (i & 2) != 0, z, this.zzb);
        if (iZzD != -4) {
            return iZzD;
        }
        if (!zzhhVar.zzf()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzhhVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzhhVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ int zzf(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z) {
        return com.google.android.gms.internal.ads.zzadr.zza(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzg(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z, int i2) throws java.io.IOException {
        return this.zza.zza(zzlVar, i, z);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized com.google.android.gms.internal.ads.zzab zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j, boolean z, boolean z2) {
        this.zza.zzc(zzE(j, false, z2));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzm(com.google.android.gms.internal.ads.zzab zzabVar) {
        boolean zZzN = zzN(zzabVar);
        com.google.android.gms.internal.ads.zzvv zzvvVar = this.zzf;
        if (zzvvVar == null || !zZzN) {
            return;
        }
        zzvvVar.zzM(zzabVar);
    }

    public final void zzn() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzrg zzrgVar = this.zzB;
        if (zzrgVar != null) {
            throw zzrgVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        com.google.android.gms.internal.ads.zzadr.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzs(com.google.android.gms.internal.ads.zzdy zzdyVar, int i, int i2) {
        this.zza.zzh(zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzt(long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzads zzadsVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzz) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzA) {
                    com.google.android.gms.internal.ads.zzdo.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zzy))));
                    this.zzA = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzb() - ((long) i2)) - ((long) i3), i2, zzadsVar);
    }

    public final void zzu(long j) {
        this.zzs = j;
    }

    public final void zzv(com.google.android.gms.internal.ads.zzvv zzvvVar) {
        this.zzf = zzvvVar;
    }

    public final synchronized void zzw(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z) {
        boolean z2 = true;
        if (zzL()) {
            if (((com.google.android.gms.internal.ads.zzvu) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z && !this.zzv) {
            com.google.android.gms.internal.ads.zzab zzabVar = this.zzy;
            if (zzabVar == null) {
                z2 = false;
            } else if (zzabVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzz(int i) {
        zzK();
        int i2 = this.zzp;
        if (i >= i2 && i <= this.zzo + i2) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i2;
            return true;
        }
        return false;
    }

    private final long zzG(int i) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzC = zzC(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = java.lang.Math.max(jMax, this.zzm[iZzC]);
                if ((this.zzl[iZzC] & 1) != 0) {
                    break;
                }
                iZzC--;
                if (iZzC == -1) {
                    iZzC = this.zzh - 1;
                }
            }
        }
        this.zzt = java.lang.Math.max(j, jMax);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        int i8 = i7 - 1;
        return this.zzj[i8] + ((long) this.zzk[i8]);
    }
}
