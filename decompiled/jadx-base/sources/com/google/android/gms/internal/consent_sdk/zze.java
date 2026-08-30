package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zze {
    private final java.util.concurrent.Executor zza;

    zze(java.util.concurrent.Executor executor) {
        this.zza = executor;
    }

    public final java.util.concurrent.Executor zza() {
        return this.zza;
    }

    public final void zzb(final java.lang.String str, final java.lang.String str2, final com.google.android.gms.internal.consent_sdk.zzd... zzdVarArr) {
        this.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzc
            @Override // java.lang.Runnable
            public final void run() {
                final org.json.JSONObject jSONObject;
                java.lang.String str3 = str;
                if (android.text.TextUtils.isEmpty(str3)) {
                    android.util.Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                java.lang.String str4 = str2;
                final java.lang.String lowerCase = str3.toLowerCase();
                if (android.text.TextUtils.isEmpty(str4)) {
                    jSONObject = new org.json.JSONObject();
                } else {
                    try {
                        jSONObject = new org.json.JSONObject(str4);
                    } catch (org.json.JSONException unused) {
                        android.util.Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str4);
                        return;
                    }
                }
                com.google.android.gms.internal.consent_sdk.zzd[] zzdVarArr2 = zzdVarArr;
                android.util.Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (final com.google.android.gms.internal.consent_sdk.zzd zzdVar : zzdVarArr2) {
                    java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return java.lang.Boolean.valueOf(zzdVar.zzb(lowerCase, jSONObject));
                        }
                    });
                    zzdVar.zza().execute(futureTask);
                    try {
                        if (((java.lang.Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    } catch (java.lang.InterruptedException e) {
                        android.util.Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
                    } catch (java.util.concurrent.ExecutionException e2) {
                        android.util.Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e2.getCause());
                    }
                }
            }
        });
    }
}
