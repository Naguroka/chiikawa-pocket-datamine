package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcds extends com.google.android.gms.internal.ads.zzfr {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfy zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final boolean zze;
    private java.io.InputStream zzf;
    private boolean zzg;
    private android.net.Uri zzh;
    private volatile com.google.android.gms.internal.ads.zzbav zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private com.google.common.util.concurrent.ListenableFuture zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private final com.google.android.gms.internal.ads.zzcec zzq;

    public zzcds(android.content.Context context, com.google.android.gms.internal.ads.zzfy zzfyVar, java.lang.String str, int i, com.google.android.gms.internal.ads.zzgy zzgyVar, com.google.android.gms.internal.ads.zzcec zzcecVar) {
        super(false);
        this.zza = context;
        this.zzb = zzfyVar;
        this.zzq = zzcecVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue();
        zzf(zzgyVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzet)).booleanValue() || this.zzl) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeu)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.zzg) {
            throw new java.io.IOException("Attempt to read closed GcacheDataSource.");
        }
        java.io.InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zze || this.zzf != null) {
            zzg(iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcef] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws java.lang.Throwable {
        com.google.android.gms.internal.ads.zzbas zzbasVarZzb;
        java.lang.Long l;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        java.lang.String string = "ms";
        if (this.zzg) {
            throw new java.io.IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r2 = 1;
        this.zzg = true;
        this.zzh = zzgdVar.zza;
        if (!this.zze) {
            zzj(zzgdVar);
        }
        this.zzi = com.google.android.gms.internal.ads.zzbav.zza(zzgdVar.zza);
        ?? sb = -1;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeq)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgdVar.zze;
                this.zzi.zzi = com.google.android.gms.internal.ads.zzfve.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbasVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
            } else {
                zzbasVarZzb = null;
            }
            if (zzbasVarZzb != null && zzbasVarZzb.zze()) {
                this.zzj = zzbasVarZzb.zzd();
                this.zzl = zzbasVarZzb.zzg();
                this.zzm = zzbasVarZzb.zzf();
                this.zzn = zzbasVarZzb.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbasVarZzb.zzc();
                    if (this.zze) {
                        zzj(zzgdVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgdVar.zze;
            this.zzi.zzi = com.google.android.gms.internal.ads.zzfve.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzes);
            } else {
                l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzer);
            }
            long jLongValue = l.longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            com.google.android.gms.ads.internal.zzv.zzd();
            java.util.concurrent.Future futureZza = com.google.android.gms.internal.ads.zzbbg.zza(this.zza, this.zzi);
            try {
                try {
                    com.google.android.gms.internal.ads.zzbbh zzbbhVar = (com.google.android.gms.internal.ads.zzbbh) futureZza.get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                    try {
                        this.zzj = zzbbhVar.zzd();
                        this.zzl = zzbbhVar.zzf();
                        this.zzm = zzbbhVar.zze();
                        this.zzn = zzbbhVar.zza();
                        if (!zzr()) {
                            this.zzf = zzbbhVar.zzc();
                            if (this.zze) {
                                zzj(zzgdVar);
                            }
                            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                            this.zzq.zza.zzab(true, jElapsedRealtime3);
                            this.zzk = true;
                            com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(true, jElapsedRealtime4);
                        this.zzk = true;
                        string = "Cache connection took " + jElapsedRealtime4 + "ms";
                    } catch (java.lang.InterruptedException unused) {
                        z2 = true;
                        futureZza.cancel(true);
                        java.lang.Thread.currentThread().interrupt();
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z2, jElapsedRealtime);
                        this.zzk = z2;
                        sb = new java.lang.StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                        z = true;
                        futureZza.cancel(true);
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z, jElapsedRealtime);
                        this.zzk = z;
                        sb = new java.lang.StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(r2, jElapsedRealtime5);
                        this.zzk = r2;
                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime5 + string);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r2 = sb;
                }
            } catch (java.lang.InterruptedException unused3) {
                z2 = false;
            } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused4) {
                z = false;
            } catch (java.lang.Throwable th3) {
                th = th3;
                r2 = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza(string);
        }
        this.zzk = false;
        if (this.zzi != null) {
            com.google.android.gms.internal.ads.zzgb zzgbVarZza = zzgdVar.zza();
            zzgbVarZza.zzd(android.net.Uri.parse(this.zzi.zza));
            zzgdVar = zzgbVarZza.zze();
        }
        return this.zzb.zzb(zzgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws java.io.IOException {
        if (!this.zzg) {
            throw new java.io.IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z = (this.zze && this.zzf == null) ? false : true;
        java.io.InputStream inputStream = this.zzf;
        if (inputStream != null) {
            com.google.android.gms.common.util.IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzcdr
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return this.zza.zzm();
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((java.lang.Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ java.lang.Long zzm() throws java.lang.Exception {
        return java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
