package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaq implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyy zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyr zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgw zzd;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzau zze;

    zzaq(com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzbyy zzbyyVar, com.google.android.gms.internal.ads.zzbyr zzbyrVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        this.zza = listenableFuture;
        this.zzb = zzbyyVar;
        this.zzc = zzbyrVar;
        this.zzd = zzfgwVar;
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        com.google.android.gms.internal.ads.zzfhh zzfhhVarZzr = com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzr(this.zza, this.zzb);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() && zzfhhVarZzr != null) {
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzh(th);
            zzfgwVar.zzg(false);
            zzfhhVarZzr.zza(zzfgwVar);
            zzfhhVarZzr.zzh();
        }
        if (this.zzc == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzbk) obj;
        com.google.android.gms.internal.ads.zzfhh zzfhhVarZzr = com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzr(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhx)).booleanValue()) {
            try {
                com.google.android.gms.internal.ads.zzbyr zzbyrVar = this.zzc;
                if (zzbyrVar != null) {
                    zzbyrVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                return;
            }
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzc("QueryInfo generation has been disabled.");
            zzfgwVar.zzg(false);
            zzfhhVarZzr.zza(zzfgwVar);
            zzfhhVarZzr.zzh();
            return;
        }
        try {
            if (zzbkVar == null) {
                com.google.android.gms.internal.ads.zzbyr zzbyrVar2 = this.zzc;
                if (zzbyrVar2 != null) {
                    zzbyrVar2.zzc(null, null, null);
                }
                this.zzd.zzg(true);
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                    return;
                }
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
                return;
            }
            try {
                if (android.text.TextUtils.isEmpty((!android.text.TextUtils.isEmpty(zzbkVar.zzc) ? new org.json.JSONObject(zzbkVar.zzc) : new org.json.JSONObject(zzbkVar.zzb)).optString("request_id", ""))) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The request ID is empty in request JSON.");
                    com.google.android.gms.internal.ads.zzbyr zzbyrVar3 = this.zzc;
                    if (zzbyrVar3 != null) {
                        zzbyrVar3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzd;
                    zzfgwVar2.zzc("Request ID empty");
                    zzfgwVar2.zzg(false);
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                        return;
                    }
                    zzfhhVarZzr.zza(this.zzd);
                    zzfhhVarZzr.zzh();
                    return;
                }
                android.os.Bundle bundle = zzbkVar.zzf;
                com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar = this.zze;
                if (zzauVar.zzu && bundle != null && bundle.getInt(zzauVar.zzw, -1) == -1) {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar2 = this.zze;
                    bundle.putInt(zzauVar2.zzw, zzauVar2.zzx.get());
                }
                com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar3 = this.zze;
                if (zzauVar3.zzt && bundle != null && android.text.TextUtils.isEmpty(bundle.getString(zzauVar3.zzv))) {
                    if (android.text.TextUtils.isEmpty(this.zze.zzz)) {
                        com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar4 = this.zze;
                        com.google.android.gms.ads.internal.util.zzs zzsVarZzq = com.google.android.gms.ads.internal.zzv.zzq();
                        com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar5 = this.zze;
                        zzauVar4.zzz = zzsVarZzq.zzc(zzauVar5.zzg, zzauVar5.zzy.afmaVersion);
                    }
                    com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar6 = this.zze;
                    bundle.putString(zzauVar6.zzv, zzauVar6.zzz);
                }
                if (this.zzc != null) {
                    if (android.text.TextUtils.isEmpty(zzbkVar.zzc)) {
                        this.zzc.zzc(zzbkVar.zza, zzbkVar.zzb, bundle);
                    } else {
                        this.zzc.zzc(zzbkVar.zza, zzbkVar.zzc, bundle);
                    }
                }
                this.zzd.zzg(true);
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                    return;
                }
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
            } catch (org.json.JSONException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create JSON object from the request string.");
                com.google.android.gms.internal.ads.zzbyr zzbyrVar4 = this.zzc;
                if (zzbyrVar4 != null) {
                    zzbyrVar4.zzb("Internal error for request JSON: " + e2.toString());
                }
                com.google.android.gms.internal.ads.zzfgw zzfgwVar3 = this.zzd;
                zzfgwVar3.zzh(e2);
                zzfgwVar3.zzg(false);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                    return;
                }
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
            }
        } catch (android.os.RemoteException e3) {
            com.google.android.gms.internal.ads.zzfgw zzfgwVar4 = this.zzd;
            zzfgwVar4.zzh(e3);
            zzfgwVar4.zzg(false);
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue() && zzfhhVarZzr != null) {
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
            }
        }
    }
}
