package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zznx implements com.google.android.gms.internal.ads.zzlt {
    private final com.google.android.gms.internal.ads.zzcx zza;
    private final com.google.android.gms.internal.ads.zzbo zzb;
    private final com.google.android.gms.internal.ads.zzbp zzc;
    private final com.google.android.gms.internal.ads.zznw zzd;
    private final android.util.SparseArray zze;
    private com.google.android.gms.internal.ads.zzdn zzf;
    private com.google.android.gms.internal.ads.zzbk zzg;
    private com.google.android.gms.internal.ads.zzdh zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(com.google.android.gms.internal.ads.zznx zznxVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zznxVar.zzU();
        zznxVar.zzZ(zzluVarZzU, 1028, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU) { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
        zznxVar.zzf.zze();
    }

    private final com.google.android.gms.internal.ads.zzlu zzab(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        com.google.android.gms.internal.ads.zzbk zzbkVar = this.zzg;
        zzbkVar.getClass();
        if (zzugVar != null) {
            return this.zzd.zza(zzugVar) != null ? zzaa(zzugVar) : zzV(com.google.android.gms.internal.ads.zzbq.zza, i, zzugVar);
        }
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn = zzbkVar.zzn();
        if (i >= zzbqVarZzn.zzc()) {
            zzbqVarZzn = com.google.android.gms.internal.ads.zzbq.zza;
        }
        return zzV(zzbqVarZzn, i, null);
    }

    private final com.google.android.gms.internal.ads.zzlu zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final com.google.android.gms.internal.ads.zzlu zzad() {
        return zzaa(this.zzd.zze());
    }

    private final com.google.android.gms.internal.ads.zzlu zzae(com.google.android.gms.internal.ads.zzbd zzbdVar) {
        com.google.android.gms.internal.ads.zzug zzugVar;
        return (!(zzbdVar instanceof com.google.android.gms.internal.ads.zzib) || (zzugVar = ((com.google.android.gms.internal.ads.zzib) zzbdVar).zzh) == null) ? zzU() : zzaa(zzugVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzA(final com.google.android.gms.internal.ads.zzab zzabVar, final com.google.android.gms.internal.ads.zzht zzhtVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1009, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zze(zzluVarZzad, zzabVar, zzhtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzB(final long j) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1010, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, j) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzC(final java.lang.Exception exc) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1014, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, exc) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzD(final com.google.android.gms.internal.ads.zzpg zzpgVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1031, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, zzpgVar) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzE(final com.google.android.gms.internal.ads.zzpg zzpgVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1032, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, zzpgVar) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzF(final int i, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1011, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzG(final int i, final long j) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzac = zzac();
        zzZ(zzluVarZzac, 1018, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzh(zzluVarZzac, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzH(final java.lang.Object obj, final long j) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 26, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj2) {
                ((com.google.android.gms.internal.ads.zzlw) obj2).zzn(zzluVarZzad, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzI(final int i, final int i2, final boolean z) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, com.json.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzJ(final java.lang.Exception exc) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1030, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, exc) { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzK(final java.lang.String str, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1016, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, str, j2, j) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzL(final java.lang.String str) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1019, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, str) { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzM(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzac = zzac();
        zzZ(zzluVarZzac, 1020, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzo(zzluVarZzac, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzN(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1015, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, zzhsVar) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzO(final long j, final int i) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzac = zzac();
        zzZ(zzluVarZzac, 1021, new com.google.android.gms.internal.ads.zzdk(zzluVarZzac, j, i) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzP(final com.google.android.gms.internal.ads.zzab zzabVar, final com.google.android.gms.internal.ads.zzht zzhtVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1017, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzp(zzluVarZzad, zzabVar, zzhtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzQ() {
        com.google.android.gms.internal.ads.zzdh zzdhVar = this.zzh;
        com.google.android.gms.internal.ads.zzcw.zzb(zzdhVar);
        zzdhVar.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzno
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zznx.zzW(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzR(com.google.android.gms.internal.ads.zzlw zzlwVar) {
        this.zzf.zzf(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzS(final com.google.android.gms.internal.ads.zzbk zzbkVar, android.os.Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzf(z);
        zzbkVar.getClass();
        this.zzg = zzbkVar;
        this.zzh = this.zza.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, new com.google.android.gms.internal.ads.zzdl() { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdl
            public final void zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzx zzxVar) {
                this.zza.zzX(zzbkVar, (com.google.android.gms.internal.ads.zzlw) obj, zzxVar);
            }
        });
    }

    protected final com.google.android.gms.internal.ads.zzlu zzU() {
        return zzaa(this.zzd.zzb());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    protected final com.google.android.gms.internal.ads.zzlu zzV(com.google.android.gms.internal.ads.zzbq zzbqVar, int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        com.google.android.gms.internal.ads.zzug zzugVar2 = true == zzbqVar.zzo() ? null : zzugVar;
        long jZzb = this.zza.zzb();
        boolean z = zzbqVar.equals(this.zzg.zzn()) && i == this.zzg.zzd();
        long jZzv = 0;
        if (zzugVar2 == null || !zzugVar2.zzb()) {
            if (z) {
                jZzv = this.zzg.zzj();
            } else if (!zzbqVar.zzo()) {
                long j = zzbqVar.zze(i, this.zzc, 0L).zzl;
                jZzv = com.google.android.gms.internal.ads.zzei.zzv(0L);
            }
        } else if (z && this.zzg.zzb() == zzugVar2.zzb && this.zzg.zzc() == zzugVar2.zzc) {
            jZzv = this.zzg.zzk();
        }
        return new com.google.android.gms.internal.ads.zzlu(jZzb, zzbqVar, i, zzugVar2, jZzv, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    final /* synthetic */ void zzX(com.google.android.gms.internal.ads.zzbk zzbkVar, com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zzx zzxVar) {
        zzlwVar.zzi(zzbkVar, new com.google.android.gms.internal.ads.zzlv(zzxVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzY(final int i, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzaa = zzaa(this.zzd.zzc());
        zzZ(zzluVarZzaa, 1006, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzf(zzluVarZzaa, i, j, j2);
            }
        });
    }

    protected final void zzZ(com.google.android.gms.internal.ads.zzlu zzluVar, int i, com.google.android.gms.internal.ads.zzdk zzdkVar) {
        this.zze.put(i, zzluVar);
        com.google.android.gms.internal.ads.zzdn zzdnVar = this.zzf;
        zzdnVar.zzd(i, zzdkVar);
        zzdnVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zza(final com.google.android.gms.internal.ads.zzbg zzbgVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 13, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, zzbgVar) { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzab = zzab(i, zzugVar);
        zzZ(zzluVarZzab, 1004, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzg(zzluVarZzab, zzucVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzag(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzab = zzab(i, zzugVar);
        zzZ(zzluVarZzab, 1002, new com.google.android.gms.internal.ads.zzdk(zzluVarZzab, zztxVar, zzucVar) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzah(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzab = zzab(i, zzugVar);
        zzZ(zzluVarZzab, 1001, new com.google.android.gms.internal.ads.zzdk(zzluVarZzab, zztxVar, zzucVar) { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzai(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar, final java.io.IOException iOException, final boolean z) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzab = zzab(i, zzugVar);
        zzZ(zzluVarZzab, 1003, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzj(zzluVarZzab, zztxVar, zzucVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzab = zzab(i, zzugVar);
        zzZ(zzluVarZzab, 1000, new com.google.android.gms.internal.ads.zzdk(zzluVarZzab, zztxVar, zzucVar) { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzb(final boolean z) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 3, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, z) { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzc(final boolean z) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 7, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, z) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzd(final com.google.android.gms.internal.ads.zzar zzarVar, final int i) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 1, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, zzarVar, i) { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zze(final com.google.android.gms.internal.ads.zzav zzavVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 14, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, zzavVar) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzf(final boolean z, final int i) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 5, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, z, i) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzg(final com.google.android.gms.internal.ads.zzbe zzbeVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 12, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, zzbeVar) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzh(final int i) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 4, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzk(zzluVarZzU, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzi(final int i) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 6, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, i) { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzj(final com.google.android.gms.internal.ads.zzbd zzbdVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzae = zzae(zzbdVar);
        zzZ(zzluVarZzae, 10, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzl(zzluVarZzae, zzbdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzk(final com.google.android.gms.internal.ads.zzbd zzbdVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzae = zzae(zzbdVar);
        zzZ(zzluVarZzae, 10, new com.google.android.gms.internal.ads.zzdk(zzluVarZzae, zzbdVar) { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzl(final boolean z, final int i) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, -1, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, z, i) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzn(final boolean z) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 23, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, z) { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzo(final int i, final int i2) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 24, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, i, i2) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzq(final com.google.android.gms.internal.ads.zzby zzbyVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 2, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, zzbyVar) { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzr(final com.google.android.gms.internal.ads.zzcd zzcdVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 25, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzlu zzluVar = zzluVarZzad;
                com.google.android.gms.internal.ads.zzcd zzcdVar2 = zzcdVar;
                ((com.google.android.gms.internal.ads.zzlw) obj).zzq(zzluVar, zzcdVar2);
                int i = zzcdVar2.zzb;
                int i2 = zzcdVar2.zzc;
                float f = zzcdVar2.zzd;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzs(final float f) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 22, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, f) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzt(com.google.android.gms.internal.ads.zzlw zzlwVar) {
        this.zzf.zzb(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzu() {
        if (this.zzi) {
            return;
        }
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        this.zzi = true;
        zzZ(zzluVarZzU, -1, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzv(final java.lang.Exception exc) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1029, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, exc) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzw(final java.lang.String str, final long j, final long j2) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1008, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzx(final java.lang.String str) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1012, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, str) { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzy(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzac = zzac();
        zzZ(zzluVarZzac, 1013, new com.google.android.gms.internal.ads.zzdk(zzluVarZzac, zzhsVar) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzz(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        final com.google.android.gms.internal.ads.zzlu zzluVarZzad = zzad();
        zzZ(zzluVarZzad, 1007, new com.google.android.gms.internal.ads.zzdk(zzluVarZzad, zzhsVar) { // from class: com.google.android.gms.internal.ads.zzlz
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    private final com.google.android.gms.internal.ads.zzlu zzaa(com.google.android.gms.internal.ads.zzug zzugVar) {
        this.zzg.getClass();
        com.google.android.gms.internal.ads.zzbq zzbqVarZza = zzugVar == null ? null : this.zzd.zza(zzugVar);
        if (zzugVar != null && zzbqVarZza != null) {
            return zzV(zzbqVarZza, zzbqVarZza.zzn(zzugVar.zza, this.zzb).zzc, zzugVar);
        }
        int iZzd = this.zzg.zzd();
        com.google.android.gms.internal.ads.zzbq zzbqVarZzn = this.zzg.zzn();
        if (iZzd >= zzbqVarZzn.zzc()) {
            zzbqVarZzn = com.google.android.gms.internal.ads.zzbq.zza;
        }
        return zzV(zzbqVarZzn, iZzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzT(java.util.List list, com.google.android.gms.internal.ads.zzug zzugVar) {
        com.google.android.gms.internal.ads.zzbk zzbkVar = this.zzg;
        zzbkVar.getClass();
        this.zzd.zzh(list, zzugVar, zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzm(final com.google.android.gms.internal.ads.zzbi zzbiVar, final com.google.android.gms.internal.ads.zzbi zzbiVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        com.google.android.gms.internal.ads.zznw zznwVar = this.zzd;
        com.google.android.gms.internal.ads.zzbk zzbkVar = this.zzg;
        zzbkVar.getClass();
        zznwVar.zzg(zzbkVar);
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 11, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzlw) obj).zzm(zzluVarZzU, zzbiVar, zzbiVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzp(com.google.android.gms.internal.ads.zzbq zzbqVar, final int i) {
        com.google.android.gms.internal.ads.zzbk zzbkVar = this.zzg;
        zzbkVar.getClass();
        this.zzd.zzi(zzbkVar);
        final com.google.android.gms.internal.ads.zzlu zzluVarZzU = zzU();
        zzZ(zzluVarZzU, 0, new com.google.android.gms.internal.ads.zzdk(zzluVarZzU, i) { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    public zznx(com.google.android.gms.internal.ads.zzcx zzcxVar) {
        zzcxVar.getClass();
        this.zza = zzcxVar;
        this.zzf = new com.google.android.gms.internal.ads.zzdn(com.google.android.gms.internal.ads.zzei.zzz(), zzcxVar, new com.google.android.gms.internal.ads.zzdl() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdl
            public final void zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzx zzxVar) {
            }
        });
        com.google.android.gms.internal.ads.zzbo zzboVar = new com.google.android.gms.internal.ads.zzbo();
        this.zzb = zzboVar;
        this.zzc = new com.google.android.gms.internal.ads.zzbp();
        this.zzd = new com.google.android.gms.internal.ads.zznw(zzboVar);
        this.zze = new android.util.SparseArray();
    }
}
