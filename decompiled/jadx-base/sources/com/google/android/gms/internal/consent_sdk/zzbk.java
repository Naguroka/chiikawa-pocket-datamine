package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbk {
    private final com.google.android.gms.internal.consent_sdk.zzdp zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();

    zzbk(com.google.android.gms.internal.consent_sdk.zzdp zzdpVar, java.util.concurrent.Executor executor) {
        this.zza = zzdpVar;
        this.zzb = executor;
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.consent_sdk.zzay zzayVar) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        java.util.Objects.requireNonNull(atomicReference);
        zzayVar.zzf(new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbb
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm) {
                atomicReference.set(consentForm);
            }
        }, new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbc
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(com.google.android.ump.FormError formError) {
                android.util.Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(java.lang.String.valueOf(formError.getMessage())));
            }
        });
    }

    public final void zzb(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zzco.zza();
        com.google.android.gms.internal.consent_sdk.zzbm zzbmVar = (com.google.android.gms.internal.consent_sdk.zzbm) this.zzc.get();
        if (zzbmVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new com.google.android.gms.internal.consent_sdk.zzg(3, "No available form can be built.").zza());
        } else {
            ((com.google.android.gms.internal.consent_sdk.zzas) this.zza.zza()).zza(zzbmVar).zzb().zza().zzf(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
        }
    }

    public final void zzc() {
        com.google.android.gms.internal.consent_sdk.zzbm zzbmVar = (com.google.android.gms.internal.consent_sdk.zzbm) this.zzc.get();
        if (zzbmVar == null) {
            android.util.Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final com.google.android.gms.internal.consent_sdk.zzay zzayVarZza = ((com.google.android.gms.internal.consent_sdk.zzas) this.zza.zza()).zza(zzbmVar).zzb().zza();
        zzayVarZza.zza = true;
        com.google.android.gms.internal.consent_sdk.zzco.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(zzayVarZza);
            }
        });
    }

    public final void zzd(com.google.android.gms.internal.consent_sdk.zzbm zzbmVar) {
        this.zzc.set(zzbmVar);
    }

    public final void zze(android.app.Activity activity, final com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zzco.zza();
        com.google.android.gms.internal.consent_sdk.zzj zzjVarZzb = com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            com.google.android.gms.internal.consent_sdk.zzco.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzjVarZzb.isConsentFormAvailable() && zzjVarZzb.getPrivacyOptionsRequirementStatus() != com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            com.google.android.gms.internal.consent_sdk.zzco.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "No valid response received yet.").zza());
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                com.google.android.gms.internal.consent_sdk.zzco.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConsentFormDismissedListener.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            com.google.android.ump.ConsentForm consentForm = (com.google.android.ump.ConsentForm) this.zzd.get();
            if (consentForm == null) {
                com.google.android.gms.internal.consent_sdk.zzco.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConsentFormDismissedListener.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
