package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzblm implements com.google.android.gms.internal.ads.zzapf {
    private volatile com.google.android.gms.internal.ads.zzbkz zza;
    private final android.content.Context zzb;

    public zzblm(android.content.Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzblm zzblmVar) {
        if (zzblmVar.zza == null) {
            return;
        }
        zzblmVar.zza.disconnect();
        android.os.Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzapf
    public final com.google.android.gms.internal.ads.zzapi zza(com.google.android.gms.internal.ads.zzapm zzapmVar) throws com.google.android.gms.internal.ads.zzapv {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbla> creator = com.google.android.gms.internal.ads.zzbla.CREATOR;
        java.util.Map mapZzl = zzapmVar.zzl();
        int size = mapZzl.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        int i = 0;
        int i2 = 0;
        for (java.util.Map.Entry entry : mapZzl.entrySet()) {
            strArr[i2] = (java.lang.String) entry.getKey();
            strArr2[i2] = (java.lang.String) entry.getValue();
            i2++;
        }
        com.google.android.gms.internal.ads.zzbla zzblaVar = new com.google.android.gms.internal.ads.zzbla(zzapmVar.zzk(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        try {
            com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
            this.zza = new com.google.android.gms.internal.ads.zzbkz(this.zzb, com.google.android.gms.ads.internal.zzv.zzu().zzb(), new com.google.android.gms.internal.ads.zzblk(this, zzcabVar), new com.google.android.gms.internal.ads.zzbll(this, zzcabVar));
            this.zza.checkAvailabilityAndConnect();
            com.google.common.util.concurrent.ListenableFuture listenableFutureZzo = com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgch.zzn(zzcabVar, new com.google.android.gms.internal.ads.zzbli(this, zzblaVar), com.google.android.gms.internal.ads.zzbzw.zza), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzey)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, com.google.android.gms.internal.ads.zzbzw.zzd);
            listenableFutureZzo.addListener(new com.google.android.gms.internal.ads.zzblj(this), com.google.android.gms.internal.ads.zzbzw.zza);
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) listenableFutureZzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime) + "ms");
            com.google.android.gms.internal.ads.zzblc zzblcVar = (com.google.android.gms.internal.ads.zzblc) new com.google.android.gms.internal.ads.zzbvi(parcelFileDescriptor).zza(com.google.android.gms.internal.ads.zzblc.CREATOR);
            if (zzblcVar == null) {
                return null;
            }
            if (zzblcVar.zza) {
                throw new com.google.android.gms.internal.ads.zzapv(zzblcVar.zzb);
            }
            if (zzblcVar.zze.length != zzblcVar.zzf.length) {
                return null;
            }
            java.util.HashMap map = new java.util.HashMap();
            while (true) {
                java.lang.String[] strArr3 = zzblcVar.zze;
                if (i >= strArr3.length) {
                    return new com.google.android.gms.internal.ads.zzapi(zzblcVar.zzc, zzblcVar.zzd, map, zzblcVar.zzg, zzblcVar.zzh);
                }
                map.put(strArr3[i], zzblcVar.zzf[i]);
                i++;
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
