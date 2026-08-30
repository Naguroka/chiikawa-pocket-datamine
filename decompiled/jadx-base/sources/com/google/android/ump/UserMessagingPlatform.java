package com.google.android.ump;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class UserMessagingPlatform {

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(com.google.android.ump.FormError formError);
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    public static com.google.android.ump.ConsentInformation getConsentInformation(android.content.Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(final android.app.Activity activity, final com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzbk zzbkVarZzc = com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc();
        com.google.android.gms.internal.consent_sdk.zzco.zza();
        com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm) {
                consentForm.show(activity, onConsentFormDismissedListener);
            }
        };
        java.util.Objects.requireNonNull(onConsentFormDismissedListener);
        zzbkVarZzc.zzb(onConsentFormLoadSuccessListener, new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(com.google.android.ump.FormError formError) {
                onConsentFormDismissedListener.onConsentFormDismissed(formError);
            }
        });
    }

    public static void loadConsentForm(android.content.Context context, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(context).zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(android.app.Activity activity, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
