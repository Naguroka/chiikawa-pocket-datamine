package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcl {
    public static com.google.android.gms.internal.consent_sdk.zzcj zza(android.content.Context context, java.lang.String str) {
        java.lang.String strConcat;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (android.text.TextUtils.isEmpty(strConcat) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        return new com.google.android.gms.internal.consent_sdk.zzcj(strConcat, str2);
    }

    public static void zzb(android.content.Context context, java.util.Set set) {
        com.google.android.gms.internal.consent_sdk.zzck zzckVar = new com.google.android.gms.internal.consent_sdk.zzck(context);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.google.android.gms.internal.consent_sdk.zzcj zzcjVarZza = zza(context, str);
            if (zzcjVarZza == null) {
                android.util.Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(java.lang.String.valueOf(str)));
            } else {
                zzckVar.zzd(zzcjVarZza.zza).remove(zzcjVarZza.zzb);
            }
        }
        zzckVar.zzb();
    }
}
