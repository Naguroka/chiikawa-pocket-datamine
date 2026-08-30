package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaw implements com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener {
    private final com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener zza;
    private final com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener zzb;

    /* synthetic */ zzaw(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener, com.google.android.gms.internal.consent_sdk.zzax zzaxVar) {
        this.zza = onConsentFormLoadSuccessListener;
        this.zzb = onConsentFormLoadFailureListener;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(com.google.android.ump.FormError formError) {
        this.zzb.onConsentFormLoadFailure(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm) {
        this.zza.onConsentFormLoadSuccess(consentForm);
    }
}
