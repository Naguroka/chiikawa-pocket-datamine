package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza {
    public static final boolean zza(android.content.Context context, android.content.Intent intent, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z, com.google.android.gms.internal.ads.zzdrw zzdrwVar, java.lang.String str) {
        if (z) {
            return zzc(context, intent.getData(), zzacVar, zzaaVar);
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmU)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzX(context, intent, zzdrwVar, str);
            } else {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzT(context, intent);
            }
            if (zzacVar != null) {
                zzacVar.zzg();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(android.content.Context context, com.google.android.gms.ads.internal.overlay.zzc zzcVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, java.lang.String str) {
        int i = 0;
        if (zzcVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("No intent data for launcher overlay.");
            return false;
        }
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        android.content.Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzacVar, zzaaVar, zzcVar.zzj, zzdrwVar, str);
        }
        android.content.Intent intent2 = new android.content.Intent();
        if (android.text.TextUtils.isEmpty(zzcVar.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (android.text.TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(android.net.Uri.parse(zzcVar.zzb));
        } else {
            java.lang.String str2 = zzcVar.zzb;
            intent2.setDataAndType(android.net.Uri.parse(str2), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!android.text.TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!android.text.TextUtils.isEmpty(zzcVar.zze)) {
            java.lang.String[] strArrSplit = zzcVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse component name from open GMSG: ".concat(java.lang.String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        java.lang.String str3 = zzcVar.zzf;
        if (!android.text.TextUtils.isEmpty(str3)) {
            try {
                i = java.lang.Integer.parseInt(str3);
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeD)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzp(context, intent2);
            }
        }
        return zza(context, intent2, zzacVar, zzaaVar, zzcVar.zzj, zzdrwVar, str);
    }

    private static final boolean zzc(android.content.Context context, android.net.Uri uri, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        int iZzn;
        try {
            iZzn = com.google.android.gms.ads.internal.zzv.zzq().zzn(context, uri);
            if (zzacVar != null) {
                zzacVar.zzg();
            }
        } catch (android.content.ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            iZzn = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.zzb(iZzn);
        }
        return iZzn == 5;
    }
}
