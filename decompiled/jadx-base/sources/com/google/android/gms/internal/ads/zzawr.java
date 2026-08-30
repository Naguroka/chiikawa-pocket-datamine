package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawr extends com.google.android.gms.internal.ads.zzaxr {
    private static final com.google.android.gms.internal.ads.zzaxs zzh = new com.google.android.gms.internal.ads.zzaxs();
    private final com.google.android.gms.internal.ads.zzary zzi;
    private final android.content.Context zzj;
    private final com.google.android.gms.internal.ads.zzatv zzk;

    public zzawr(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, android.content.Context context, com.google.android.gms.internal.ads.zzarp zzarpVar, com.google.android.gms.internal.ads.zzary zzaryVar, com.google.android.gms.internal.ads.zzatv zzatvVar) {
        super(zzawdVar, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", zzascVar, i, 27);
        this.zzj = context;
        this.zzi = zzaryVar;
        this.zzk = zzatvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.internal.ads.zzats zzc() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.String str;
        int iIntValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcN)).booleanValue() ? ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcS)).intValue() : this.zzi.zza();
        com.google.android.gms.internal.ads.zzats zzatsVar = new com.google.android.gms.internal.ads.zzats((java.lang.String) this.zze.invoke(null, this.zzj, false, ""));
        com.google.android.gms.internal.ads.zzatv zzatvVar = this.zzk;
        if (zzatvVar == null || zzatvVar.zza() == null) {
            str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        } else {
            try {
                str = (java.lang.String) zzatvVar.zza().get(iIntValue, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
                str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
            }
        }
        zzatsVar.zza = str;
        return zzatsVar;
    }

    private final java.lang.String zzd() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            com.google.android.gms.internal.ads.zzasy zzasyVarZzc = this.zza.zzc();
            if (zzasyVarZzc == null || !zzasyVarZzc.zzaj()) {
                return null;
            }
            return zzasyVarZzc.zzh();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int i;
        com.google.android.gms.internal.ads.zzats zzatsVarZzc;
        com.google.android.gms.internal.ads.zzats zzatsVar;
        java.util.concurrent.atomic.AtomicReference atomicReferenceZza = zzh.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            com.google.android.gms.internal.ads.zzats zzatsVar2 = (com.google.android.gms.internal.ads.zzats) atomicReferenceZza.get();
            if (zzatsVar2 == null || com.google.android.gms.internal.ads.zzawg.zzd(zzatsVar2.zza) || zzatsVar2.zza.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST) || zzatsVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (com.google.android.gms.internal.ads.zzawg.zzd(null)) {
                    (!com.google.android.gms.internal.ads.zzawg.zzd(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzatsVarZzc = zzc();
                } else {
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(i == 3 && !this.zzi.zzd());
                    java.lang.Boolean bool = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcB);
                    java.lang.String strZzb = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcA)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzp() && com.google.android.gms.internal.ads.zzawg.zzd(strZzb)) {
                        strZzb = zzd();
                    }
                    com.google.android.gms.internal.ads.zzats zzatsVar3 = new com.google.android.gms.internal.ads.zzats((java.lang.String) this.zze.invoke(null, this.zzj, boolValueOf, strZzb));
                    if (com.google.android.gms.internal.ads.zzawg.zzd(zzatsVar3.zza) || zzatsVar3.zza.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            java.lang.String strZzd = zzd();
                            if (!com.google.android.gms.internal.ads.zzawg.zzd(strZzd)) {
                                zzatsVar3.zza = strZzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzatsVarZzc = zzatsVar3;
                }
                atomicReferenceZza.set(zzatsVarZzc);
            }
            zzatsVar = (com.google.android.gms.internal.ads.zzats) atomicReferenceZza.get();
        }
        synchronized (this.zzd) {
            if (zzatsVar != null) {
                this.zzd.zzx(zzatsVar.zza);
                this.zzd.zzX(zzatsVar.zzb);
                this.zzd.zzZ(zzatsVar.zzc);
                this.zzd.zzi(zzatsVar.zzd);
                this.zzd.zzw(zzatsVar.zze);
            }
        }
    }

    protected final java.lang.String zzb() {
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrZzf = com.google.android.gms.internal.ads.zzawg.zzf((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcC));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrZzf)));
            if (!android.os.Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(com.google.android.gms.internal.ads.zzawg.zzf((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcD)))));
            }
            android.content.Context context = this.zzj;
            java.lang.String packageName = context.getPackageName();
            this.zza.zzk();
            if (android.os.Build.VERSION.SDK_INT <= 30 && !android.os.Build.VERSION.CODENAME.equals(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH)) {
                return null;
            }
            final com.google.android.gms.internal.ads.zzgdb zzgdbVarZze = com.google.android.gms.internal.ads.zzgdb.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new android.content.pm.PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxt
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(java.util.List list) {
                    com.google.android.gms.internal.ads.zzgdb zzgdbVar = zzgdbVarZze;
                    if (list == null) {
                        zzgdbVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            android.content.pm.ApkChecksum apkChecksum = (android.content.pm.ApkChecksum) list.get(i);
                            if (apkChecksum.getType() == 8) {
                                zzgdbVar.zzc(com.google.android.gms.internal.ads.zzawg.zzb(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzgdbVar.zzc(null);
                    } catch (java.lang.Throwable unused) {
                        zzgdbVar.zzc(null);
                    }
                }
            });
            return (java.lang.String) zzgdbVarZze.get();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.InterruptedException | java.lang.NoClassDefFoundError | java.security.cert.CertificateEncodingException | java.security.cert.CertificateException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }
}
