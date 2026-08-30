package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzccm implements com.google.android.gms.internal.ads.zzfy {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfy zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final boolean zze;
    private java.io.InputStream zzf;
    private boolean zzg;
    private android.net.Uri zzh;
    private volatile com.google.android.gms.internal.ads.zzbav zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private com.google.android.gms.internal.ads.zzgd zzl;

    public zzccm(android.content.Context context, com.google.android.gms.internal.ads.zzfy zzfyVar, java.lang.String str, int i, com.google.android.gms.internal.ads.zzgy zzgyVar, com.google.android.gms.internal.ads.zzccl zzcclVar) {
        this.zza = context;
        this.zzb = zzfyVar;
        this.zzc = str;
        this.zzd = i;
        new java.util.concurrent.atomic.AtomicLong(-1L);
        this.zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzet)).booleanValue() || this.zzj) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeu)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.zzg) {
            throw new java.io.IOException("Attempt to read closed CacheDataSource.");
        }
        java.io.InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws java.io.IOException {
        java.lang.Long l;
        if (this.zzg) {
            throw new java.io.IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzgdVar.zza;
        this.zzl = zzgdVar;
        this.zzi = com.google.android.gms.internal.ads.zzbav.zza(zzgdVar.zza);
        com.google.android.gms.internal.ads.zzbas zzbasVarZzb = null;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeq)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgdVar.zze;
                this.zzi.zzi = com.google.android.gms.internal.ads.zzfve.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbasVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
            }
            if (zzbasVarZzb != null && zzbasVarZzb.zze()) {
                this.zzj = zzbasVarZzb.zzg();
                this.zzk = zzbasVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzbasVarZzb.zzc();
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
            com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            com.google.android.gms.ads.internal.zzv.zzd();
            java.util.concurrent.Future futureZza = com.google.android.gms.internal.ads.zzbbg.zza(this.zza, this.zzi);
            try {
                try {
                    com.google.android.gms.internal.ads.zzbbh zzbbhVar = (com.google.android.gms.internal.ads.zzbbh) futureZza.get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                    zzbbhVar.zzd();
                    this.zzj = zzbbhVar.zzf();
                    this.zzk = zzbbhVar.zze();
                    zzbbhVar.zza();
                    if (!zzg()) {
                        this.zzf = zzbbhVar.zzc();
                    }
                } catch (java.lang.InterruptedException unused) {
                    futureZza.cancel(false);
                    java.lang.Thread.currentThread().interrupt();
                } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (java.lang.Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            com.google.android.gms.internal.ads.zzgb zzgbVarZza = zzgdVar.zza();
            zzgbVarZza.zzd(android.net.Uri.parse(this.zzi.zza));
            this.zzl = zzgbVarZza.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws java.io.IOException {
        if (!this.zzg) {
            throw new java.io.IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        java.io.InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            com.google.android.gms.common.util.IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final /* synthetic */ java.util.Map zze() {
        return java.util.Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(com.google.android.gms.internal.ads.zzgy zzgyVar) {
    }
}
