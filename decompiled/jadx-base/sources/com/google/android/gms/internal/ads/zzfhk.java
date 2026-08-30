package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfhk implements java.lang.Runnable {
    public static java.lang.Boolean zzb;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private int zzi;
    private final com.google.android.gms.internal.ads.zzdpj zzj;
    private final java.util.List zzk;
    private final com.google.android.gms.internal.ads.zzbvs zzm;
    public static final java.lang.Object zza = new java.lang.Object();
    private static final java.lang.Object zzc = new java.lang.Object();
    private static final java.lang.Object zzd = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzfhp zzg = com.google.android.gms.internal.ads.zzfht.zzb();
    private java.lang.String zzh = "";
    private boolean zzl = false;

    public zzfhk(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdpj zzdpjVar, com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzbvs zzbvsVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpjVar;
        this.zzm = zzbvsVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziJ)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = com.google.android.gms.internal.ads.zzfxn.zzn();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzb.zze()).booleanValue()) {
                    zzb = java.lang.Boolean.valueOf(java.lang.Math.random() < ((java.lang.Double) com.google.android.gms.internal.ads.zzbee.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            java.lang.Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        bArrZzaV = ((com.google.android.gms.internal.ads.zzfht) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    com.google.android.gms.internal.ads.zzdzn zzdznVar = new com.google.android.gms.internal.ads.zzdzn((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziD), 60000, new java.util.HashMap(), bArrZzaV, com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF, false);
                    new com.google.android.gms.internal.ads.zzdzp(this.zze, this.zzf.afmaVersion, this.zzm, android.os.Binder.getCallingUid()).zza(zzdznVar);
                } catch (java.lang.Exception e) {
                    if ((e instanceof com.google.android.gms.internal.ads.zzdvy) && ((com.google.android.gms.internal.ads.zzdvy) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final com.google.android.gms.internal.ads.zzfha zzfhaVar) {
        com.google.android.gms.internal.ads.zzbzw.zza.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfhj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzfhaVar);
            }
        });
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfha zzfhaVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzv.zzq();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzq(this.zze);
                    } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziE)).intValue();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlK)).booleanValue()) {
                        long j = iIntValue;
                        com.google.android.gms.internal.ads.zzbzw.zzd.scheduleWithFixedDelay(this, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = iIntValue;
                        com.google.android.gms.internal.ads.zzbzw.zzd.scheduleAtFixedRate(this, j2, j2, java.util.concurrent.TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfhaVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziF)).intValue()) {
                    return;
                }
                com.google.android.gms.internal.ads.zzfhl zzfhlVarZza = com.google.android.gms.internal.ads.zzfho.zza();
                zzfhlVarZza.zzu(zzfhaVar.zzm());
                zzfhlVarZza.zzq(zzfhaVar.zzl());
                zzfhlVarZza.zzg(zzfhaVar.zzb());
                zzfhlVarZza.zzw(3);
                zzfhlVarZza.zzn(this.zzf.afmaVersion);
                zzfhlVarZza.zzb(this.zzh);
                zzfhlVarZza.zzk(android.os.Build.VERSION.RELEASE);
                zzfhlVarZza.zzr(android.os.Build.VERSION.SDK_INT);
                zzfhlVarZza.zzv(zzfhaVar.zzo());
                zzfhlVarZza.zzj(zzfhaVar.zza());
                zzfhlVarZza.zze(this.zzi);
                zzfhlVarZza.zzt(zzfhaVar.zzn());
                zzfhlVarZza.zzc(zzfhaVar.zze());
                zzfhlVarZza.zzf(zzfhaVar.zzg());
                zzfhlVarZza.zzh(zzfhaVar.zzh());
                zzfhlVarZza.zzi(this.zzj.zzb(zzfhaVar.zzh()));
                zzfhlVarZza.zzl(zzfhaVar.zzi());
                zzfhlVarZza.zzm(zzfhaVar.zzd());
                zzfhlVarZza.zzd(zzfhaVar.zzf());
                zzfhlVarZza.zzs(zzfhaVar.zzk());
                zzfhlVarZza.zzo(zzfhaVar.zzj());
                zzfhlVarZza.zzp(zzfhaVar.zzc());
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziJ)).booleanValue()) {
                    zzfhlVarZza.zza(this.zzk);
                }
                com.google.android.gms.internal.ads.zzfhp zzfhpVar = this.zzg;
                com.google.android.gms.internal.ads.zzfhq zzfhqVarZza = com.google.android.gms.internal.ads.zzfhr.zza();
                zzfhqVarZza.zza(zzfhlVarZza);
                zzfhpVar.zzb(zzfhqVarZza);
            }
        }
    }
}
