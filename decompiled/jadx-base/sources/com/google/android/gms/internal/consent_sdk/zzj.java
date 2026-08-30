package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzj implements com.google.android.ump.ConsentInformation {
    private final com.google.android.gms.internal.consent_sdk.zzam zza;
    private final com.google.android.gms.internal.consent_sdk.zzu zzb;
    private final com.google.android.gms.internal.consent_sdk.zzbk zzc;
    private final java.lang.Object zzd = new java.lang.Object();
    private final java.lang.Object zze = new java.lang.Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private com.google.android.ump.ConsentRequestParameters zzh = new com.google.android.ump.ConsentRequestParameters.Builder().build();

    public zzj(com.google.android.gms.internal.consent_sdk.zzam zzamVar, com.google.android.gms.internal.consent_sdk.zzu zzuVar, com.google.android.gms.internal.consent_sdk.zzbk zzbkVar) {
        this.zza = zzamVar;
        this.zzb = zzuVar;
        this.zzc = zzbkVar;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        if (!this.zza.zzk()) {
            int iZza = !zzc() ? 0 : this.zza.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        return !zzc() ? com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN : this.zza.zzb();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = consentRequestParameters;
        this.zzb.zzc(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(android.app.Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                public final void onConsentInfoUpdateFailure(com.google.android.ump.FormError formError) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        android.util.Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z) {
        synchronized (this.zze) {
            this.zzg = z;
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzd) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzg;
        }
        return z;
    }
}
