package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgi {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static java.lang.String zza(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && zzfboVar.zzT && zzfboVar.zzV.zzb() && zzfboVar.zzb != 4) {
            com.google.android.gms.internal.ads.zzecn zzecnVar = zzfboVar.zzV.zzc() == 1 ? com.google.android.gms.internal.ads.zzecn.VIDEO : com.google.android.gms.internal.ads.zzecn.HTML_DISPLAY;
            java.lang.String str = zzfboVar.zzal;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("creativeType", zzecnVar.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to build OMID ENV JSON", e);
            }
        }
        return null;
    }

    public static java.lang.String zzb(java.lang.String str, java.lang.String... strArr) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.regex.Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            java.lang.String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
