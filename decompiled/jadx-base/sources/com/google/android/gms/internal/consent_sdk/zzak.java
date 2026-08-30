package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzak implements com.google.android.gms.internal.consent_sdk.zzd {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzam zzb;
    private final java.util.concurrent.Executor zzc;

    public zzak(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzam zzamVar, java.util.concurrent.Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final java.util.concurrent.Executor zza() {
        return this.zzc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("clear")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            com.google.android.gms.internal.consent_sdk.zzck zzckVar = new com.google.android.gms.internal.consent_sdk.zzck(this.zza);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object objOpt = jSONObject.opt(next);
                android.util.Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + java.lang.String.valueOf(objOpt));
                if (zzckVar.zzc(next, objOpt)) {
                    this.zzb.zzd().add(next);
                } else {
                    android.util.Log.d("UserMessagingPlatform", "Failed writing key: ".concat(java.lang.String.valueOf(next)));
                }
            }
            this.zzb.zzf();
            zzckVar.zzb();
            return true;
        }
        if (b != 1) {
            return false;
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            android.util.Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(java.lang.String.valueOf(jSONObject.toString())));
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                java.lang.String strOptString = jSONArrayOptJSONArray.optString(i);
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    android.util.Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                } else {
                    hashSet.add(strOptString);
                }
            }
            com.google.android.gms.internal.consent_sdk.zzcl.zzb(this.zza, hashSet);
        }
        return true;
    }
}
