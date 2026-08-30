package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbyk {
    static android.net.Uri zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return android.net.Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return android.net.Uri.parse(str.substring(0, i) + str2 + com.ironsource.y8.i.b + str3 + com.ironsource.y8.i.c + str.substring(i));
    }

    public static java.lang.String zzb(android.net.Uri uri, android.content.Context context, java.util.Map map) {
        if (!com.google.android.gms.ads.internal.zzv.zzo().zzp(context)) {
            return uri.toString();
        }
        java.lang.String strZza = com.google.android.gms.ads.internal.zzv.zzo().zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzas);
        java.lang.String string = uri.toString();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzar)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (java.util.Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZza);
        }
        if (!android.text.TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaq)).booleanValue()) {
            return string;
        }
        java.lang.String string2 = zza(zzd(string, context), "fbs_aeid", strZza).toString();
        com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (java.util.Map) map.get("_ac"));
        return string2;
    }

    public static java.lang.String zzc(java.lang.String str, android.content.Context context, boolean z, java.util.Map map) {
        java.lang.String strZza;
        if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaz)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzv.zzo().zzp(context) || android.text.TextUtils.isEmpty(str) || (strZza = com.google.android.gms.ads.internal.zzv.zzo().zza(context)) == null) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzas);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzar)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzv.zzq().zzj(str)) {
                com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (java.util.Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZza);
            }
            if (!com.google.android.gms.ads.internal.zzv.zzq().zzk(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzv.zzo().zzk(context, strZza, (java.util.Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaq)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzv.zzq().zzj(str)) {
            com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (java.util.Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", strZza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzv.zzq().zzk(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzv.zzo().zzk(context, strZza, (java.util.Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", strZza).toString();
    }

    private static java.lang.String zzd(java.lang.String str, android.content.Context context) {
        java.lang.String strZzd = com.google.android.gms.ads.internal.zzv.zzo().zzd(context);
        java.lang.String strZzb = com.google.android.gms.ads.internal.zzv.zzo().zzb(context);
        if (!str.contains("gmp_app_id") && !android.text.TextUtils.isEmpty(strZzd)) {
            str = zza(str, "gmp_app_id", strZzd).toString();
        }
        return (str.contains("fbs_aiid") || android.text.TextUtils.isEmpty(strZzb)) ? str : zza(str, "fbs_aiid", strZzb).toString();
    }
}
