package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcef extends com.google.android.gms.internal.ads.zzcbj implements com.google.android.gms.internal.ads.zzgy, com.google.android.gms.internal.ads.zzlw {
    public static final /* synthetic */ int zza = 0;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcdq zzc;
    private final com.google.android.gms.internal.ads.zzxt zzd;
    private final com.google.android.gms.internal.ads.zzcbr zze;
    private final java.lang.ref.WeakReference zzf;
    private final com.google.android.gms.internal.ads.zzvn zzg;
    private com.google.android.gms.internal.ads.zzim zzh;
    private java.nio.ByteBuffer zzi;
    private boolean zzj;
    private com.google.android.gms.internal.ads.zzcbi zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final java.lang.String zzo;
    private final int zzp;
    private java.lang.Integer zzr;
    private final java.util.ArrayList zzs;
    private volatile com.google.android.gms.internal.ads.zzcds zzt;
    private final java.lang.Object zzq = new java.lang.Object();
    private final java.util.Set zzu = new java.util.HashSet();

    /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    public zzcef(android.content.Context context, com.google.android.gms.internal.ads.zzcbr zzcbrVar, com.google.android.gms.internal.ads.zzcbs zzcbsVar, java.lang.Integer num) {
        final boolean z;
        final com.google.android.gms.internal.ads.zzfx zzfxVar;
        this.zzb = context;
        this.zze = zzcbrVar;
        this.zzr = num;
        this.zzf = new java.lang.ref.WeakReference(zzcbsVar);
        com.google.android.gms.internal.ads.zzcdq zzcdqVar = new com.google.android.gms.internal.ads.zzcdq();
        this.zzc = zzcdqVar;
        com.google.android.gms.internal.ads.zzxt zzxtVar = new com.google.android.gms.internal.ads.zzxt(context);
        this.zzd = zzxtVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzD().incrementAndGet();
        com.google.android.gms.internal.ads.zzlq zzlqVar = new com.google.android.gms.internal.ads.zzlq(context, new com.google.android.gms.internal.ads.zzced(this));
        zzlqVar.zzb(zzxtVar);
        zzlqVar.zza(zzcdqVar);
        com.google.android.gms.internal.ads.zzlr zzlrVarZzc = zzlqVar.zzc();
        this.zzh = zzlrVarZzc;
        zzlrVarZzc.zzy(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new java.util.ArrayList();
        this.zzt = null;
        this.zzo = (java.lang.String) com.google.android.gms.internal.ads.zzful.zzd(zzcbsVar != null ? zzcbsVar.zzr() : null).zzb("");
        this.zzp = zzcbsVar != null ? zzcbsVar.zzf() : 0;
        final java.lang.String strZzc = com.google.android.gms.ads.internal.zzv.zzq().zzc(context, zzcbsVar.zzn().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcg)).booleanValue()) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue()) {
                    z = zzcbrVar.zzi ? false : true;
                }
            } else if (zzcbrVar.zzi) {
            }
            final com.google.android.gms.internal.ads.zzfx zzfxVar2 = zzcbrVar.zzl ? new com.google.android.gms.internal.ads.zzfx() { // from class: com.google.android.gms.internal.ads.zzcdw
                @Override // com.google.android.gms.internal.ads.zzfx
                public final com.google.android.gms.internal.ads.zzfy zza() {
                    return this.zza.zzW(strZzc, z);
                }
            } : zzcbrVar.zzh > 0 ? new com.google.android.gms.internal.ads.zzfx() { // from class: com.google.android.gms.internal.ads.zzcdx
                @Override // com.google.android.gms.internal.ads.zzfx
                public final com.google.android.gms.internal.ads.zzfy zza() {
                    return this.zza.zzX(strZzc, z);
                }
            } : new com.google.android.gms.internal.ads.zzfx() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // com.google.android.gms.internal.ads.zzfx
                public final com.google.android.gms.internal.ads.zzfy zza() {
                    return this.zza.zzY(strZzc, z);
                }
            };
            zzfxVar = zzcbrVar.zzi ? new com.google.android.gms.internal.ads.zzfx() { // from class: com.google.android.gms.internal.ads.zzcdz
                @Override // com.google.android.gms.internal.ads.zzfx
                public final com.google.android.gms.internal.ads.zzfy zza() {
                    return this.zza.zzZ(zzfxVar2);
                }
            } : zzfxVar2;
            java.nio.ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzfxVar = new com.google.android.gms.internal.ads.zzfx() { // from class: com.google.android.gms.internal.ads.zzcea
                    @Override // com.google.android.gms.internal.ads.zzfx
                    public final com.google.android.gms.internal.ads.zzfy zza() {
                        int i = com.google.android.gms.internal.ads.zzcef.zza;
                        com.google.android.gms.internal.ads.zzfy zzfyVarZza = zzfxVar.zza();
                        byte[] bArr2 = bArr;
                        return new com.google.android.gms.internal.ads.zzcdt(new com.google.android.gms.internal.ads.zzft(bArr2), bArr2.length, zzfyVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzfxVar = new com.google.android.gms.internal.ads.zzfx() { // from class: com.google.android.gms.internal.ads.zzcdu
                @Override // com.google.android.gms.internal.ads.zzfx
                public final com.google.android.gms.internal.ads.zzfy zza() {
                    return new com.google.android.gms.internal.ads.zzft(bArr2);
                }
            };
        }
        this.zzg = new com.google.android.gms.internal.ads.zzvn(zzfxVar, new com.google.android.gms.internal.ads.zzvm(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzl)).booleanValue() ? new com.google.android.gms.internal.ads.zzacs() { // from class: com.google.android.gms.internal.ads.zzcee
            @Override // com.google.android.gms.internal.ads.zzacs
            public final /* synthetic */ com.google.android.gms.internal.ads.zzacn[] zza(android.net.Uri uri, java.util.Map map) {
                int i = com.google.android.gms.internal.ads.zzcef.zza;
                return new com.google.android.gms.internal.ads.zzacn[]{new com.google.android.gms.internal.ads.zzaiv(), new com.google.android.gms.internal.ads.zzahm(), new com.google.android.gms.internal.ads.zzaiq(com.google.android.gms.internal.ads.zzakd.zza, 32, null, null, com.google.android.gms.internal.ads.zzfxn.zzn(), null)};
            }
        } : new com.google.android.gms.internal.ads.zzacs() { // from class: com.google.android.gms.internal.ads.zzcdv
            @Override // com.google.android.gms.internal.ads.zzacs
            public final /* synthetic */ com.google.android.gms.internal.ads.zzacn[] zza(android.net.Uri uri, java.util.Map map) {
                int i = com.google.android.gms.internal.ads.zzcef.zza;
                return new com.google.android.gms.internal.ads.zzacn[]{new com.google.android.gms.internal.ads.zzaiv(), new com.google.android.gms.internal.ads.zzahm()};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                java.util.Map mapZze = ((com.google.android.gms.internal.ads.zzgt) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    for (java.util.Map.Entry entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && com.google.android.gms.internal.ads.zzftt.zzc("content-length", (java.lang.CharSequence) entry.getKey()) && entry.getValue() != null && ((java.util.List) entry.getValue()).get(0) != null) {
                                    j2 = java.lang.Long.parseLong((java.lang.String) ((java.util.List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (java.lang.NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final java.lang.Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzF(android.net.Uri[] uriArr, java.lang.String str) {
        zzG(uriArr, str, java.nio.ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzH() {
        com.google.android.gms.internal.ads.zzim zzimVar = this.zzh;
        if (zzimVar != null) {
            zzimVar.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzI(long j) {
        com.google.android.gms.internal.ads.zzg zzgVar = (com.google.android.gms.internal.ads.zzg) this.zzh;
        zzgVar.zza(zzgVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzJ(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzK(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzL(com.google.android.gms.internal.ads.zzcbi zzcbiVar) {
        this.zzk = zzcbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzM(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzN(int i) {
        this.zzc.zzo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzO(boolean z) {
        this.zzh.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzP(java.lang.Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzx();
            if (i >= 2) {
                return;
            }
            com.google.android.gms.internal.ads.zzxt zzxtVar = this.zzd;
            com.google.android.gms.internal.ads.zzxg zzxgVarZzc = zzxtVar.zzf().zzc();
            zzxgVarZzc.zzq(i, !z);
            zzxtVar.zzl(zzxgVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzR(int i) {
        java.util.Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzcdp zzcdpVar = (com.google.android.gms.internal.ads.zzcdp) ((java.lang.ref.WeakReference) it.next()).get();
            if (zzcdpVar != null) {
                zzcdpVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzS(android.view.Surface surface, boolean z) {
        com.google.android.gms.internal.ads.zzim zzimVar = this.zzh;
        if (zzimVar != null) {
            zzimVar.zzr(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzT(float f, boolean z) {
        com.google.android.gms.internal.ads.zzim zzimVar = this.zzh;
        if (zzimVar != null) {
            zzimVar.zzs(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final boolean zzV() {
        return this.zzh != null;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfy zzW(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzcef zzcefVar = true != z ? null : this;
        com.google.android.gms.internal.ads.zzcbr zzcbrVar = this.zze;
        return new com.google.android.gms.internal.ads.zzcei(str, zzcefVar, zzcbrVar.zzd, zzcbrVar.zze, zzcbrVar.zzm, zzcbrVar.zzn);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfy zzX(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzcef zzcefVar = true != z ? null : this;
        com.google.android.gms.internal.ads.zzcbr zzcbrVar = this.zze;
        com.google.android.gms.internal.ads.zzcdp zzcdpVar = new com.google.android.gms.internal.ads.zzcdp(str, zzcefVar, zzcbrVar.zzd, zzcbrVar.zze, zzcbrVar.zzh);
        this.zzu.add(new java.lang.ref.WeakReference(zzcdpVar));
        return zzcdpVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfy zzY(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzgg zzggVar = new com.google.android.gms.internal.ads.zzgg();
        zzggVar.zzf(str);
        zzggVar.zze(true != z ? null : this);
        zzggVar.zzc(this.zze.zzd);
        zzggVar.zzd(this.zze.zze);
        zzggVar.zzb(true);
        return zzggVar.zza();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfy zzZ(com.google.android.gms.internal.ads.zzfx zzfxVar) {
        com.google.android.gms.internal.ads.zzfy zzfyVarZza = zzfxVar.zza();
        com.google.android.gms.internal.ads.zzcec zzcecVar = new com.google.android.gms.internal.ads.zzcec(this);
        return new com.google.android.gms.internal.ads.zzcds(this.zzb, zzfyVarZza, this.zzo, this.zzp, this, zzcecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z, int i) {
        this.zzl += i;
    }

    final com.google.android.gms.internal.ads.zzui zzaa(android.net.Uri uri) {
        com.google.android.gms.internal.ads.zzaf zzafVar = new com.google.android.gms.internal.ads.zzaf();
        zzafVar.zzb(uri);
        com.google.android.gms.internal.ads.zzar zzarVarZzc = zzafVar.zzc();
        com.google.android.gms.internal.ads.zzvn zzvnVar = this.zzg;
        zzvnVar.zza(this.zze.zzf);
        return zzvnVar.zzb(zzarVarZzc);
    }

    final /* synthetic */ void zzab(boolean z, long j) {
        com.google.android.gms.internal.ads.zzcbi zzcbiVar = this.zzk;
        if (zzcbiVar != null) {
            zzcbiVar.zzi(z, j);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzlj[] zzac(android.os.Handler handler, com.google.android.gms.internal.ads.zzabc zzabcVar, com.google.android.gms.internal.ads.zzpf zzpfVar, com.google.android.gms.internal.ads.zzwm zzwmVar, com.google.android.gms.internal.ads.zzte zzteVar) {
        com.google.android.gms.internal.ads.zzsp zzspVar = com.google.android.gms.internal.ads.zzsp.zza;
        android.content.Context context = this.zzb;
        com.google.android.gms.internal.ads.zzqs zzqsVar = new com.google.android.gms.internal.ads.zzqs(context, new com.google.android.gms.internal.ads.zzrv(context), zzspVar, false, handler, zzpfVar, new com.google.android.gms.internal.ads.zzqa(context).zzd());
        com.google.android.gms.internal.ads.zzsp zzspVar2 = com.google.android.gms.internal.ads.zzsp.zza;
        android.content.Context context2 = this.zzb;
        return new com.google.android.gms.internal.ads.zzlj[]{zzqsVar, new com.google.android.gms.internal.ads.zzzp(context2, new com.google.android.gms.internal.ads.zzrv(context2), zzspVar2, 0L, false, handler, zzabcVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z) {
        if (zzfyVar instanceof com.google.android.gms.internal.ads.zzgt) {
            synchronized (this.zzq) {
                this.zzs.add((com.google.android.gms.internal.ads.zzgt) zzfyVar);
            }
        } else if (zzfyVar instanceof com.google.android.gms.internal.ads.zzcds) {
            this.zzt = (com.google.android.gms.internal.ads.zzcds) zzfyVar;
            final com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzf.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() && zzcbsVar != null && this.zzt.zzn()) {
                final java.util.HashMap map = new java.util.HashMap();
                map.put("gcacheHit", java.lang.String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", java.lang.String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzceb
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = com.google.android.gms.internal.ads.zzcef.zza;
                        zzcbsVar.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zze(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzf.get();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() || zzcbsVar == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String str = zzabVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        java.lang.String str2 = zzabVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        java.lang.String str3 = zzabVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcbsVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzlu zzluVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzuc zzucVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzh(com.google.android.gms.internal.ads.zzlu zzluVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbk zzbkVar, com.google.android.gms.internal.ads.zzlv zzlvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzj(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zztx zztxVar, com.google.android.gms.internal.ads.zzuc zzucVar, java.io.IOException iOException, boolean z) {
        com.google.android.gms.internal.ads.zzcbi zzcbiVar = this.zzk;
        if (zzcbiVar != null) {
            if (this.zze.zzj) {
                zzcbiVar.zzl("onLoadException", iOException);
            } else {
                zzcbiVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzk(com.google.android.gms.internal.ads.zzlu zzluVar, int i) {
        com.google.android.gms.internal.ads.zzcbi zzcbiVar = this.zzk;
        if (zzcbiVar != null) {
            zzcbiVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzl(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        com.google.android.gms.internal.ads.zzcbi zzcbiVar = this.zzk;
        if (zzcbiVar != null) {
            zzcbiVar.zzk("onPlayerError", zzbdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzbi zzbiVar, com.google.android.gms.internal.ads.zzbi zzbiVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzn(com.google.android.gms.internal.ads.zzlu zzluVar, java.lang.Object obj, long j) {
        com.google.android.gms.internal.ads.zzcbi zzcbiVar = this.zzk;
        if (zzcbiVar != null) {
            zzcbiVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzhs zzhsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzp(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzf.get();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() || zzcbsVar == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("frameRate", java.lang.String.valueOf(zzabVar.zzx));
        map.put("bitRate", java.lang.String.valueOf(zzabVar.zzj));
        map.put("resolution", zzabVar.zzv + "x" + zzabVar.zzw);
        java.lang.String str = zzabVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        java.lang.String str2 = zzabVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        java.lang.String str3 = zzabVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcbsVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzq(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzcd zzcdVar) {
        com.google.android.gms.internal.ads.zzcbi zzcbiVar = this.zzk;
        if (zzcbiVar != null) {
            zzcbiVar.zzD(zzcdVar.zzb, zzcdVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return java.lang.Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzG(android.net.Uri[] uriArr, java.lang.String str, java.nio.ByteBuffer byteBuffer, boolean z) {
        com.google.android.gms.internal.ads.zzui zzuyVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzuyVar = zzaa(uriArr[0]);
            } else {
                com.google.android.gms.internal.ads.zzui[] zzuiVarArr = new com.google.android.gms.internal.ads.zzui[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzuiVarArr[i] = zzaa(uriArr[i]);
                }
                zzuyVar = new com.google.android.gms.internal.ads.zzuy(false, false, new com.google.android.gms.internal.ads.zztr(), zzuiVarArr);
            }
            this.zzh.zzB(zzuyVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
