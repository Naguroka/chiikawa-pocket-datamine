package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzexu extends com.google.android.gms.ads.internal.client.zzbx implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzazx {
    protected com.google.android.gms.internal.ads.zzcog zza;
    private final com.google.android.gms.internal.ads.zzcgx zzb;
    private final android.content.Context zzc;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzexo zzf;
    private final com.google.android.gms.internal.ads.zzexm zzg;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
    private final com.google.android.gms.internal.ads.zzdrw zzi;
    private com.google.android.gms.internal.ads.zzcnt zzk;
    private java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean();
    private long zzj = -1;

    public zzexu(com.google.android.gms.internal.ads.zzcgx zzcgxVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzexo zzexoVar, com.google.android.gms.internal.ads.zzexm zzexmVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zzb = zzcgxVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzexoVar;
        this.zzg = zzexmVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdrwVar;
        zzexmVar.zzm(this);
    }

    private final synchronized void zzq(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            com.google.android.gms.internal.ads.zzcnt zzcntVar = this.zzk;
            if (zzcntVar != null) {
                com.google.android.gms.ads.internal.zzv.zzb().zze(zzcntVar);
            }
            if (this.zza != null) {
                long jElapsedRealtime = -1;
                if (this.zzj != -1) {
                    jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(jElapsedRealtime, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbag zzbagVar) {
        this.zzg.zzo(zzbagVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzf.zzl(zzyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(com.google.android.gms.internal.ads.zzbdg zzbdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbtq zzbtqVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbwc zzbwcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        boolean z;
        if (!zzmVar.zzb()) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzd.zze()).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.zzh.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlb)).intValue() || !z) {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzg.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(4, null, null));
            return false;
        }
        if (zzZ()) {
            return false;
        }
        this.zzd = new java.util.concurrent.atomic.AtomicBoolean();
        return this.zzf.zzb(zzmVar, this.zze, new com.google.android.gms.internal.ads.zzexs(this), new com.google.android.gms.internal.ads.zzext(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            int iZza = this.zza.zza();
            if (iZza > 0) {
                com.google.android.gms.internal.ads.zzcnt zzcntVar = new com.google.android.gms.internal.ads.zzcnt(this.zzb.zzD(), com.google.android.gms.ads.internal.zzv.zzC());
                this.zzk = zzcntVar;
                zzcntVar.zzd(iZza, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzexr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzp();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        com.google.android.gms.internal.ads.zzcog zzcogVar = this.zza;
        if (zzcogVar != null) {
            zzcogVar.zze(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
        return null;
    }

    final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzexq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized java.lang.String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcog zzcogVar = this.zza;
        if (zzcogVar != null) {
            zzcogVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            zzq(2);
            return;
        }
        if (i2 == 1) {
            zzq(4);
        } else if (i2 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }
}
