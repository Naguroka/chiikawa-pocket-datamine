package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhr implements com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm {
    private final int zzb;
    private com.google.android.gms.internal.ads.zzln zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzog zzf;
    private com.google.android.gms.internal.ads.zzcx zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.zzvy zzi;
    private com.google.android.gms.internal.ads.zzab[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private com.google.android.gms.internal.ads.zzll zzq;
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzke zzc = new com.google.android.gms.internal.ads.zzke();
    private long zzm = Long.MIN_VALUE;
    private com.google.android.gms.internal.ads.zzbq zzp = com.google.android.gms.internal.ads.zzbq.zza;

    public zzhr(int i) {
        this.zzb = i;
    }

    private final void zzZ(long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z);
    }

    protected void zzA() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB() {
        com.google.android.gms.internal.ads.zzll zzllVar;
        synchronized (this.zza) {
            zzllVar = this.zzq;
        }
        if (zzllVar != null) {
            zzllVar.zza(this);
        }
    }

    protected void zzC() {
    }

    protected void zzD() throws com.google.android.gms.internal.ads.zzib {
    }

    protected void zzE() {
    }

    protected void zzF(com.google.android.gms.internal.ads.zzab[] zzabVarArr, long j, long j2, com.google.android.gms.internal.ads.zzug zzugVar) throws com.google.android.gms.internal.ads.zzib {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzG() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzH(com.google.android.gms.internal.ads.zzab[] zzabVarArr, com.google.android.gms.internal.ads.zzvy zzvyVar, long j, long j2, com.google.android.gms.internal.ads.zzug zzugVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzn);
        this.zzi = zzvyVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzabVarArr;
        this.zzk = j2;
        zzF(zzabVarArr, j, j2, zzugVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzI() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh == 0);
        com.google.android.gms.internal.ads.zzke zzkeVar = this.zzc;
        zzkeVar.zzb = null;
        zzkeVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzJ(long j) throws com.google.android.gms.internal.ads.zzib {
        zzZ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzL(com.google.android.gms.internal.ads.zzll zzllVar) {
        synchronized (this.zza) {
            this.zzq = zzllVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public /* synthetic */ void zzM(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzN(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        if (java.util.Objects.equals(this.zzp, zzbqVar)) {
            return;
        }
        this.zzp = zzbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzO() throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzP() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzR() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final int zzcT() {
        return this.zzh;
    }

    protected final int zzcU(com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, int i) {
        com.google.android.gms.internal.ads.zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        int iZza = zzvyVar.zza(zzkeVar, zzhhVar, i);
        if (iZza == -4) {
            if (zzhhVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhhVar.zze + this.zzk;
            zzhhVar.zze = j;
            this.zzm = java.lang.Math.max(this.zzm, j);
        } else if (iZza == -5) {
            com.google.android.gms.internal.ads.zzab zzabVar = zzkeVar.zza;
            zzabVar.getClass();
            long j2 = zzabVar.zzt;
            if (j2 != Long.MAX_VALUE) {
                com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
                zzzVarZzb.zzae(j2 + this.zzk);
                zzkeVar.zza = zzzVarZzb.zzag();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzcV() {
        return this.zzm;
    }

    protected final com.google.android.gms.internal.ads.zzib zzcW(java.lang.Throwable th, com.google.android.gms.internal.ads.zzab zzabVar, boolean z, int i) {
        int iZzY = 4;
        if (zzabVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzY = zzY(zzabVar) & 7;
            } catch (com.google.android.gms.internal.ads.zzib unused) {
            } finally {
                this.zzo = false;
            }
        }
        return com.google.android.gms.internal.ads.zzib.zzb(th, zzU(), this.zze, zzabVar, iZzY, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public int zze() throws com.google.android.gms.internal.ads.zzib {
        return 0;
    }

    protected final long zzf() {
        return this.zzl;
    }

    protected final com.google.android.gms.internal.ads.zzbq zzh() {
        return this.zzp;
    }

    protected final com.google.android.gms.internal.ads.zzke zzk() {
        com.google.android.gms.internal.ads.zzke zzkeVar = this.zzc;
        zzkeVar.zzb = null;
        zzkeVar.zza = null;
        return zzkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public com.google.android.gms.internal.ads.zzkk zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final com.google.android.gms.internal.ads.zzlm zzm() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final com.google.android.gms.internal.ads.zzvy zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzr() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh == 1);
        com.google.android.gms.internal.ads.zzke zzkeVar = this.zzc;
        zzkeVar.zzb = null;
        zzkeVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzs(com.google.android.gms.internal.ads.zzln zzlnVar, com.google.android.gms.internal.ads.zzab[] zzabVarArr, com.google.android.gms.internal.ads.zzvy zzvyVar, long j, boolean z, boolean z2, long j2, long j3, com.google.android.gms.internal.ads.zzug zzugVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh == 0);
        this.zzd = zzlnVar;
        this.zzh = 1;
        zzy(z, z2);
        zzH(zzabVarArr, zzvyVar, j2, j3, zzugVar);
        zzZ(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public void zzu(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzib {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzv(int i, com.google.android.gms.internal.ads.zzog zzogVar, com.google.android.gms.internal.ads.zzcx zzcxVar) {
        this.zze = i;
        this.zzf = zzogVar;
        this.zzg = zzcxVar;
    }

    protected void zzx() {
        throw null;
    }

    protected void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzib {
    }

    protected void zzz(long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        throw null;
    }

    protected final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        com.google.android.gms.internal.ads.zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        return zzvyVar.zze();
    }

    protected final com.google.android.gms.internal.ads.zzab[] zzT() {
        com.google.android.gms.internal.ads.zzab[] zzabVarArr = this.zzj;
        zzabVarArr.getClass();
        return zzabVarArr;
    }

    protected final int zzd(long j) {
        com.google.android.gms.internal.ads.zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        return zzvyVar.zzb(j - this.zzk);
    }

    protected final com.google.android.gms.internal.ads.zzcx zzi() {
        com.google.android.gms.internal.ads.zzcx zzcxVar = this.zzg;
        zzcxVar.getClass();
        return zzcxVar;
    }

    protected final com.google.android.gms.internal.ads.zzln zzn() {
        com.google.android.gms.internal.ads.zzln zzlnVar = this.zzd;
        zzlnVar.getClass();
        return zzlnVar;
    }

    protected final com.google.android.gms.internal.ads.zzog zzo() {
        com.google.android.gms.internal.ads.zzog zzogVar = this.zzf;
        zzogVar.getClass();
        return zzogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzw() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        zzvyVar.zzd();
    }
}
