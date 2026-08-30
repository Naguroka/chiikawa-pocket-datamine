package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemn implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzdpm zzb;
    private final com.google.android.gms.internal.ads.zzdua zzc;
    private final com.google.android.gms.internal.ads.zzemp zzd;

    public zzemn(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzdpm zzdpmVar, com.google.android.gms.internal.ads.zzdua zzduaVar, com.google.android.gms.internal.ads.zzemp zzempVar) {
        this.zza = zzgcsVar;
        this.zzb = zzdpmVar;
        this.zzc = zzduaVar;
        this.zzd = zzempVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlx)).booleanValue() && this.zzd.zza() != null) {
            com.google.android.gms.internal.ads.zzemo zzemoVarZza = this.zzd.zza();
            zzemoVarZza.getClass();
            return com.google.android.gms.internal.ads.zzgch.zzh(zzemoVarZza);
        }
        if (!com.google.android.gms.internal.ads.zzfve.zzd((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbz))) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlx)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt())) {
                this.zzd.zzc(true);
                return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzemm
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.zza.zzc();
                    }
                });
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemo(new android.os.Bundle()));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzemo zzc() throws java.lang.Exception {
        java.util.List<java.lang.String> listAsList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbz)).split(";"));
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : listAsList) {
            try {
                com.google.android.gms.internal.ads.zzfdh zzfdhVarZzc = this.zzb.zzc(str, new org.json.JSONObject());
                zzfdhVarZzc.zzC();
                boolean zZzt = this.zzc.zzt();
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlx)).booleanValue() || zZzt) {
                    try {
                        com.google.android.gms.internal.ads.zzbrs zzbrsVarZzf = zzfdhVarZzc.zzf();
                        if (zzbrsVarZzf != null) {
                            bundle2.putString("sdk_version", zzbrsVarZzf.toString());
                        }
                    } catch (com.google.android.gms.internal.ads.zzfcq unused) {
                    }
                }
                try {
                    com.google.android.gms.internal.ads.zzbrs zzbrsVarZze = zzfdhVarZzc.zze();
                    if (zzbrsVarZze != null) {
                        bundle2.putString("adapter_version", zzbrsVarZze.toString());
                    }
                } catch (com.google.android.gms.internal.ads.zzfcq unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (com.google.android.gms.internal.ads.zzfcq unused3) {
            }
        }
        com.google.android.gms.internal.ads.zzemo zzemoVar = new com.google.android.gms.internal.ads.zzemo(bundle);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlx)).booleanValue()) {
            this.zzd.zzb(zzemoVar);
        }
        return zzemoVar;
    }
}
