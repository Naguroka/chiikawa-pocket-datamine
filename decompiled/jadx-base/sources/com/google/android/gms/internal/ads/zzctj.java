package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzctj implements com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzdee {
    private com.google.android.gms.internal.ads.zzbve zza;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfhk zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final java.util.concurrent.Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean();

    zzctj(android.content.Context context, com.google.android.gms.internal.ads.zzfhk zzfhkVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.util.concurrent.Executor executor) {
        this.zzc = context;
        this.zzd = zzfhkVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    final /* synthetic */ void zzc() {
        com.google.android.gms.internal.ads.zzbbv.zze(this.zzc);
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzd() {
        com.google.android.gms.internal.ads.zzbve zzbveVar;
        int i;
        com.google.android.gms.internal.ads.zzbog zzbogVarZza;
        if (!this.zzb.getAndSet(true)) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzj.zze()).booleanValue()) {
                i = 2;
            } else {
                i = 3;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzk.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzi.zze()).booleanValue()) {
                        try {
                            java.lang.String strOptString = new org.json.JSONObject(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc()).optString("local_flag_write");
                            if (android.text.TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!android.text.TextUtils.equals(strOptString, androidx.core.app.NotificationCompat.CATEGORY_SERVICE)) {
                                i = 1;
                            }
                        } catch (org.json.JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = i - 1;
            if (i2 == 1) {
                zzbogVarZza = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzc, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzd);
            } else if (i2 == 2) {
                zzbogVarZza = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zzc, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzd);
            }
            this.zza = new com.google.android.gms.internal.ads.zzbvg(this.zzc, zzbogVarZza.zza("google.afma.sdkConstants.getSdkConstants", com.google.android.gms.internal.ads.zzbod.zza, com.google.android.gms.internal.ads.zzbod.zza), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbveVar = this.zza) != null) {
            com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzbveVar.zza();
            if (!this.zzh && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzi.zze()).booleanValue()) {
                listenableFutureZza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcti
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, this.zzf);
            }
            com.google.android.gms.internal.ads.zzbzz.zza(listenableFutureZza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(java.lang.String str) {
        zzd();
    }
}
