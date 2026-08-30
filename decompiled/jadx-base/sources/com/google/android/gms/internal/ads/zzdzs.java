package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdzs implements com.google.android.gms.internal.ads.zzffr {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzfgw zzc;
    private final com.google.android.gms.internal.ads.zzfhh zzd;

    public zzdzs(java.lang.String str, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        this.zzb = str;
        this.zzd = zzfhhVar;
        this.zzc = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffr
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzdvy zzdvyVar;
        org.json.JSONObject jSONObject;
        java.lang.String strConcat;
        com.google.android.gms.internal.ads.zzdzr zzdzrVar = (com.google.android.gms.internal.ads.zzdzr) obj;
        int iOptInt = zzdzrVar.zza.optInt("http_timeout_millis", 60000);
        com.google.android.gms.internal.ads.zzbvm zzbvmVar = zzdzrVar.zzb;
        java.lang.String strJoin = "";
        if (zzbvmVar.zza() != -2) {
            if (zzbvmVar.zza() == 1) {
                if (zzbvmVar.zzh() != null) {
                    strJoin = android.text.TextUtils.join(", ", zzbvmVar.zzh());
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(strJoin);
                }
                zzdvyVar = new com.google.android.gms.internal.ads.zzdvy(2, "Error building request URL: ".concat(java.lang.String.valueOf(strJoin)));
            } else {
                zzdvyVar = new com.google.android.gms.internal.ads.zzdvy(1);
            }
            com.google.android.gms.internal.ads.zzfhh zzfhhVar = this.zzd;
            com.google.android.gms.internal.ads.zzfgw zzfgwVar = this.zzc;
            zzfgwVar.zzh(zzdvyVar);
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
            throw zzdvyVar;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (zzdzrVar.zzb.zzj() && !android.text.TextUtils.isEmpty(this.zzb)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaZ)).booleanValue()) {
                java.lang.String str = this.zzb;
                if (android.text.TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    java.util.regex.Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        java.lang.String strGroup = matcher.group(1);
                        if (strGroup != null && (strGroup.toLowerCase(java.util.Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(java.util.Locale.ROOT).startsWith("ide="))) {
                            if (!android.text.TextUtils.isEmpty(strConcat)) {
                                strConcat = strConcat.concat("; ");
                            }
                            strConcat = strConcat.concat(strGroup);
                        }
                    }
                }
                if (!android.text.TextUtils.isEmpty(strConcat)) {
                    map.put(com.google.common.net.HttpHeaders.COOKIE, strConcat);
                }
            } else {
                map.put(com.google.common.net.HttpHeaders.COOKIE, this.zzb);
            }
        }
        if (zzdzrVar.zzb.zzk() && (jSONObject = zzdzrVar.zza) != null) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!android.text.TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!android.text.TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        if (zzdzrVar.zzb != null && !android.text.TextUtils.isEmpty(zzdzrVar.zzb.zzf())) {
            strJoin = zzdzrVar.zzb.zzf();
        }
        com.google.android.gms.internal.ads.zzfhh zzfhhVar2 = this.zzd;
        com.google.android.gms.internal.ads.zzfgw zzfgwVar2 = this.zzc;
        zzfgwVar2.zzg(true);
        zzfhhVar2.zza(zzfgwVar2);
        return new com.google.android.gms.internal.ads.zzdzn(zzdzrVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(java.nio.charset.StandardCharsets.UTF_8), "", zzdzrVar.zzb.zzk());
    }
}
