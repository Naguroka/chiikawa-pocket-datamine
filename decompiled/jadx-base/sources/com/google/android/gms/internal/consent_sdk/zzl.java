package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzl {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzam zzb;

    zzl(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzam zzamVar) {
        this.zza = application;
        this.zzb = zzamVar;
    }

    final com.google.android.gms.internal.consent_sdk.zzcf zzc(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters) throws com.google.android.gms.internal.consent_sdk.zzg {
        com.google.android.ump.ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new com.google.android.ump.ConsentDebugSettings.Builder(this.zza).build();
        }
        return com.google.android.gms.internal.consent_sdk.zzn.zza(new com.google.android.gms.internal.consent_sdk.zzn(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
