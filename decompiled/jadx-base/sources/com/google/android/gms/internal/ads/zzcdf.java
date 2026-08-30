package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcdf implements com.google.android.gms.internal.ads.zzbjp {
    private static final java.lang.Integer zzb(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get(str)));
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache invalid numeric parameter '" + str + "': " + ((java.lang.String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcde zzcdhVar;
        com.google.android.gms.internal.ads.zzccw zzccwVarZza;
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        com.google.android.gms.internal.ads.zzccx zzccxVarZzz = com.google.android.gms.ads.internal.zzv.zzz();
        if (map.containsKey("abort")) {
            if (zzccxVarZzz.zzd(zzcbsVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache abort but no precache task running.");
            return;
        }
        java.lang.String str = (java.lang.String) map.get("src");
        java.lang.Integer numZzb = zzb(map, "periodicReportIntervalMs");
        java.lang.Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        java.lang.Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        com.google.android.gms.internal.ads.zzcbr zzcbrVar = new com.google.android.gms.internal.ads.zzcbr((java.lang.String) map.get("flags"));
        boolean z = zzcbrVar.zzk;
        if (str != null) {
            java.lang.String[] strArr = {str};
            java.lang.String str2 = (java.lang.String) map.get("demuxed");
            if (str2 != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                    java.lang.String[] strArr2 = new java.lang.String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (org.json.JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new java.lang.String[]{str};
            }
            if (z) {
                java.util.Iterator it = zzccxVarZzz.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzccwVarZza = null;
                        break;
                    }
                    com.google.android.gms.internal.ads.zzccw zzccwVar = (com.google.android.gms.internal.ads.zzccw) it.next();
                    if (zzccwVar.zza == zzcbsVar && str.equals(zzccwVar.zze())) {
                        zzccwVarZza = zzccwVar;
                        break;
                    }
                }
            } else {
                zzccwVarZza = zzccxVarZzz.zza(zzcbsVar);
            }
            if (zzccwVarZza != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache task is already running.");
                return;
            }
            if (zzcbsVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache requires a dependency provider.");
                return;
            }
            java.lang.Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzcbsVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcbsVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcbsVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            com.google.android.gms.internal.ads.zzccp zzccpVar = zzcbsVar.zzj().zzb;
            if (iIntValue > 0) {
                int i2 = zzcbrVar.zzg;
                int iZzu = com.google.android.gms.internal.ads.zzcbj.zzu();
                if (iZzu < i2) {
                    zzcdhVar = new com.google.android.gms.internal.ads.zzcdn(zzcbsVar, zzcbrVar);
                } else {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzn)).booleanValue()) {
                        iZzu = com.google.android.gms.internal.ads.zzcdk.zzi();
                    }
                    zzcdhVar = iZzu < zzcbrVar.zzb ? new com.google.android.gms.internal.ads.zzcdk(zzcbsVar, zzcbrVar) : new com.google.android.gms.internal.ads.zzcdi(zzcbsVar);
                }
            } else {
                zzcdhVar = new com.google.android.gms.internal.ads.zzcdh(zzcbsVar);
            }
            new com.google.android.gms.internal.ads.zzccw(zzcbsVar, zzcdhVar, str, strArr).zzb();
        } else {
            com.google.android.gms.internal.ads.zzccw zzccwVarZza2 = zzccxVarZzz.zza(zzcbsVar);
            if (zzccwVarZza2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache must specify a source.");
                return;
            }
            zzcdhVar = zzccwVarZza2.zzb;
        }
        java.lang.Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcdhVar.zzs(numZzb5.intValue());
        }
        java.lang.Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcdhVar.zzr(numZzb6.intValue());
        }
        java.lang.Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcdhVar.zzp(numZzb7.intValue());
        }
        java.lang.Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcdhVar.zzq(numZzb8.intValue());
        }
    }
}
