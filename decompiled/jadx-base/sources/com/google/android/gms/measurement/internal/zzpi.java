package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpi extends com.google.android.gms.measurement.internal.zzoz {
    zzpi(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
    }

    private final java.lang.String zzf(java.lang.String str) {
        java.lang.String strZzm = this.zzg.zzr().zzm(str);
        if (android.text.TextUtils.isEmpty(strZzm)) {
            return (java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzq.zza(null);
        }
        android.net.Uri uri = android.net.Uri.parse((java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzq.zza(null));
        android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strZzm + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    private final boolean zzh(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzh zzhVarZzl;
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj = zzpvVar.zzr().zzj(str);
        if (zzgoVarZzj == null || (zzhVarZzl = zzpvVar.zzj().zzl(str)) == null) {
            return false;
        }
        if ((zzgoVarZzj.zzv() && zzgoVarZzj.zzi().zza() == 100) || this.zzu.zzw().zzak(str, zzhVarZzl.zzM())) {
            return true;
        }
        return !android.text.TextUtils.isEmpty(str2) && java.lang.Math.abs(str2.hashCode() % 100) < zzgoVarZzj.zzi().zza();
    }

    private static final boolean zzi(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzs.zza(null);
        if (android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        for (java.lang.String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
    public final com.google.android.gms.measurement.internal.zzph zza(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzph zzphVar;
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        com.google.android.gms.measurement.internal.zzam zzamVarZzf = zzioVar.zzf();
        com.google.android.gms.measurement.internal.zzgg zzggVar = com.google.android.gms.measurement.internal.zzgi.zzaP;
        com.google.android.gms.measurement.internal.zzph zzphVar2 = null;
        if (!zzamVarZzf.zzx(null, zzggVar)) {
            com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
            com.google.android.gms.measurement.internal.zzh zzhVarZzl = zzpvVar.zzj().zzl(str);
            if (zzhVarZzl == null) {
                return new com.google.android.gms.measurement.internal.zzph(zzf(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.GOOGLE_ANALYTICS, null);
            }
            if (!zzh(str, zzhVarZzl.zzD())) {
                return new com.google.android.gms.measurement.internal.zzph(zzf(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.GOOGLE_ANALYTICS, null);
            }
            if (zzhVarZzl.zzaL()) {
                zzioVar.zzaW().zzj().zza("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzgo zzgoVarZzj = zzpvVar.zzr().zzj(zzhVarZzl.zzC());
                if (zzgoVarZzj == null || !zzgoVarZzj.zzv()) {
                    zzphVar = null;
                } else {
                    java.lang.String strZzf = zzgoVarZzj.zzi().zzf();
                    if (android.text.TextUtils.isEmpty(strZzf)) {
                        zzphVar = null;
                    } else {
                        java.lang.String strZzd = zzgoVarZzj.zzi().zzd();
                        zzioVar.zzaW().zzj().zzc("sgtm configured with upload_url, server_info", strZzf, true != android.text.TextUtils.isEmpty(strZzd) ? "N" : "Y");
                        if (android.text.TextUtils.isEmpty(strZzd)) {
                            zzioVar.zzaV();
                            zzphVar = new com.google.android.gms.measurement.internal.zzph(strZzf, java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.SGTM, null);
                        } else {
                            java.util.HashMap map = new java.util.HashMap();
                            map.put("x-sgtm-server-info", strZzd);
                            if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzM())) {
                                map.put("x-gtm-server-preview", zzhVarZzl.zzM());
                            }
                            zzphVar = new com.google.android.gms.measurement.internal.zzph(strZzf, map, com.google.android.gms.measurement.internal.zzmf.SGTM, null);
                        }
                    }
                }
            } else {
                zzphVar = null;
            }
            if (zzphVar != null) {
                return zzphVar;
            }
            return new com.google.android.gms.measurement.internal.zzph(zzf(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.measurement.internal.zzpv zzpvVar2 = this.zzg;
        com.google.android.gms.measurement.internal.zzh zzhVarZzl2 = zzpvVar2.zzj().zzl(str);
        if (zzhVarZzl2 == null || !zzhVarZzl2.zzaL()) {
            return new com.google.android.gms.measurement.internal.zzph(zzf(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.zzif zzifVarZza = com.google.android.gms.internal.measurement.zzim.zza();
        zzifVarZza.zzc(2);
        zzifVarZza.zza((com.google.android.gms.internal.measurement.zzih) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.internal.measurement.zzih.zzb(zzhVarZzl2.zzb())));
        if (!zzh(str, zzhVarZzl2.zzD())) {
            zzifVarZza.zzb(3);
            return new com.google.android.gms.measurement.internal.zzph(zzf(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzim) zzifVarZza.zzba());
        }
        java.lang.String strZzC = zzhVarZzl2.zzC();
        zzifVarZza.zzc(2);
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj2 = zzpvVar2.zzr().zzj(zzhVarZzl2.zzC());
        if (zzgoVarZzj2 == null || !zzgoVarZzj2.zzv()) {
            zzioVar.zzaW().zzj().zzb("[sgtm] Missing sgtm_setting in remote config. appId", strZzC);
            zzifVarZza.zzb(4);
        } else {
            java.util.HashMap map2 = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(zzhVarZzl2.zzM())) {
                map2.put("x-gtm-server-preview", zzhVarZzl2.zzM());
            }
            java.lang.String strZze = zzgoVarZzj2.zzi().zze();
            com.google.android.gms.internal.measurement.zzih zzihVarZzb = com.google.android.gms.internal.measurement.zzih.zzb(zzhVarZzl2.zzb());
            if (zzihVarZzb != null && zzihVarZzb != com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE) {
                zzifVarZza.zza(zzihVarZzb);
            } else if (!zzioVar.zzf().zzx(null, zzggVar)) {
                zzifVarZza.zza(com.google.android.gms.internal.measurement.zzih.SERVICE_FLAG_OFF);
            } else if (zzi(zzhVarZzl2.zzC())) {
                zzifVarZza.zza(com.google.android.gms.internal.measurement.zzih.PINNED_TO_SERVICE_UPLOAD);
            } else if (android.text.TextUtils.isEmpty(strZze)) {
                zzifVarZza.zza(com.google.android.gms.internal.measurement.zzih.MISSING_SGTM_SERVER_URL);
            } else {
                zzioVar.zzaW().zzj().zzb("[sgtm] Eligible for client side upload. appId", strZzC);
                zzifVarZza.zzc(3);
                zzifVarZza.zza(com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE);
                zzphVar2 = new com.google.android.gms.measurement.internal.zzph(strZze, map2, com.google.android.gms.measurement.internal.zzmf.SGTM_CLIENT, (com.google.android.gms.internal.measurement.zzim) zzifVarZza.zzba());
            }
            zzgoVarZzj2.zzi().zzf();
            zzgoVarZzj2.zzi().zzd();
            zzioVar.zzaV();
            if (android.text.TextUtils.isEmpty(strZze)) {
                zzifVarZza.zzb(6);
                zzioVar.zzaW().zzj().zzb("[sgtm] Local service, missing sgtm_server_url", zzhVarZzl2.zzC());
            } else {
                zzioVar.zzaW().zzj().zzb("[sgtm] Eligible for local service direct upload. appId", strZzC);
                zzifVarZza.zzc(5);
                zzifVarZza.zzb(2);
                zzphVar2 = new com.google.android.gms.measurement.internal.zzph(strZze, map2, com.google.android.gms.measurement.internal.zzmf.SGTM, (com.google.android.gms.internal.measurement.zzim) zzifVarZza.zzba());
            }
        }
        return zzphVar2 != null ? zzphVar2 : new com.google.android.gms.measurement.internal.zzph(zzf(str), java.util.Collections.emptyMap(), com.google.android.gms.measurement.internal.zzmf.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzim) zzifVarZza.zzba());
    }

    final boolean zzd(java.lang.String str, com.google.android.gms.internal.measurement.zzih zzihVar) {
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj;
        zzg();
        return this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP) && zzihVar == com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE && !zzi(str) && (zzgoVarZzj = this.zzg.zzr().zzj(str)) != null && zzgoVarZzj.zzv() && !zzgoVarZzj.zzi().zze().isEmpty();
    }
}
