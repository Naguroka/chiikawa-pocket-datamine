package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzay implements com.google.android.ump.ConsentForm {
    private final android.app.Application zzb;
    private final com.google.android.gms.internal.consent_sdk.zzbt zzc;
    private final com.google.android.gms.internal.consent_sdk.zzam zzd;
    private final com.google.android.gms.internal.consent_sdk.zzbm zze;
    private final com.google.android.gms.internal.consent_sdk.zzdp zzf;
    private android.app.Dialog zzg;
    private com.google.android.gms.internal.consent_sdk.zzbr zzh;
    private final java.util.concurrent.atomic.AtomicBoolean zzi = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicReference zzj = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzk = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzl = new java.util.concurrent.atomic.AtomicReference();
    boolean zza = false;

    public zzay(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzab zzabVar, com.google.android.gms.internal.consent_sdk.zzbt zzbtVar, com.google.android.gms.internal.consent_sdk.zzam zzamVar, com.google.android.gms.internal.consent_sdk.zzbm zzbmVar, com.google.android.gms.internal.consent_sdk.zzdp zzdpVar) {
        this.zzb = application;
        this.zzc = zzbtVar;
        this.zzd = zzamVar;
        this.zze = zzbmVar;
        this.zzf = zzdpVar;
    }

    private final void zzk() {
        android.app.Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        com.google.android.gms.internal.consent_sdk.zzav zzavVar = (com.google.android.gms.internal.consent_sdk.zzav) this.zzl.getAndSet(null);
        if (zzavVar != null) {
            zzavVar.zzb();
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(android.app.Activity activity, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zzco.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        com.google.android.gms.internal.consent_sdk.zzav zzavVar = new com.google.android.gms.internal.consent_sdk.zzav(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzavVar);
        this.zzl.set(zzavVar);
        this.zzc.zza(activity);
        android.app.Dialog dialog = new android.app.Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        android.view.Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, false);
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    final com.google.android.gms.internal.consent_sdk.zzbr zzc() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzf(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zzbr zzbrVarZzb = ((com.google.android.gms.internal.consent_sdk.zzbs) this.zzf).zza();
        this.zzh = zzbrVarZzb;
        zzbrVarZzb.setBackgroundColor(0);
        zzbrVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbrVarZzb.setWebViewClient(new com.google.android.gms.internal.consent_sdk.zzbp(zzbrVarZzb, null));
        this.zzj.set(new com.google.android.gms.internal.consent_sdk.zzaw(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, 0 == true ? 1 : 0));
        com.google.android.gms.internal.consent_sdk.zzbr zzbrVar = this.zzh;
        com.google.android.gms.internal.consent_sdk.zzbm zzbmVar = this.zze;
        zzbrVar.loadDataWithBaseURL(zzbmVar.zza(), zzbmVar.zzb(), "text/html", com.adjust.sdk.Constants.ENCODING, null);
        com.google.android.gms.internal.consent_sdk.zzco.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzau
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new com.google.android.gms.internal.consent_sdk.zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void zzg(int i) {
        zzk();
        com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (com.google.android.ump.ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zzd.zzg(3);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    final void zzh(com.google.android.gms.internal.consent_sdk.zzg zzgVar) {
        zzk();
        com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (com.google.android.ump.ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
    }

    final void zzi() {
        com.google.android.gms.internal.consent_sdk.zzaw zzawVar = (com.google.android.gms.internal.consent_sdk.zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadSuccess(this);
    }

    final void zzj(com.google.android.gms.internal.consent_sdk.zzg zzgVar) {
        com.google.android.gms.internal.consent_sdk.zzaw zzawVar = (com.google.android.gms.internal.consent_sdk.zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
