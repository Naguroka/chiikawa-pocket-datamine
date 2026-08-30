package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeas implements com.google.android.gms.internal.ads.zzfgo {
    private final com.google.android.gms.internal.ads.zzeag zza;
    private final com.google.android.gms.internal.ads.zzeak zzb;

    zzeas(com.google.android.gms.internal.ads.zzeag zzeagVar, com.google.android.gms.internal.ads.zzeak zzeakVar) {
        this.zza = zzeagVar;
        this.zzb = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue() && com.google.android.gms.internal.ads.zzfgh.RENDERER == zzfghVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str, java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue() && com.google.android.gms.internal.ads.zzfgh.RENDERER == zzfghVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(com.google.android.gms.internal.ads.zzfgh zzfghVar, java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue()) {
            if (com.google.android.gms.internal.ads.zzfgh.RENDERER == zzfghVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
                return;
            }
            if (com.google.android.gms.internal.ads.zzfgh.PRELOADED_LOADER == zzfghVar || com.google.android.gms.internal.ads.zzfgh.SERVER_TRANSACTION == zzfghVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
                final com.google.android.gms.internal.ads.zzeak zzeakVar = this.zzb;
                final long jZzd = this.zza.zzd();
                zzeakVar.zza.zza(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzeaj
                    @Override // com.google.android.gms.internal.ads.zzffr
                    public final java.lang.Object zza(java.lang.Object obj) {
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj;
                        if (zzeakVar.zzf()) {
                            return null;
                        }
                        long j = jZzd;
                        com.google.android.gms.internal.ads.zzbbq.zzaf.zza.C0179zza c0179zzaZzn = com.google.android.gms.internal.ads.zzbbq.zzaf.zza.zzn();
                        c0179zzaZzn.zzP(j);
                        byte[] bArrZzaV = c0179zzaZzn.zzbr().zzaV();
                        com.google.android.gms.internal.ads.zzear.zzf(sQLiteDatabase, false, false);
                        com.google.android.gms.internal.ads.zzear.zzc(sQLiteDatabase, j, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }
}
