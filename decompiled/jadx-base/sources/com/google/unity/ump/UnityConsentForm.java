package com.google.unity.ump;

/* JADX INFO: loaded from: classes5.dex */
public class UnityConsentForm {
    private final android.app.Activity activity;
    private final com.google.unity.ump.UnityConsentFormCallback callback;
    private final com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = new com.google.unity.ump.UnityConsentForm.AnonymousClass1();

    /* JADX INFO: renamed from: com.google.unity.ump.UnityConsentForm$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.android.ump.ConsentForm.OnConsentFormDismissedListener {
        AnonymousClass1() {
        }

        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
        public void onConsentFormDismissed(final com.google.android.ump.FormError error) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ump.UnityConsentForm$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1023x3b14d05a(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onConsentFormDismissed$0$com-google-unity-ump-UnityConsentForm$1, reason: not valid java name */
        /* synthetic */ void m1023x3b14d05a(com.google.android.ump.FormError formError) {
            if (com.google.unity.ump.UnityConsentForm.this.callback != null) {
                com.google.unity.ump.UnityConsentForm.this.callback.onConsentFormDismissed(formError);
            }
        }
    }

    public UnityConsentForm(android.app.Activity activity, com.google.unity.ump.UnityConsentFormCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAndShowConsentFormIfRequired() {
        com.google.android.ump.UserMessagingPlatform.loadAndShowConsentFormIfRequired(this.activity, this.onConsentFormDismissedListener);
    }

    public void show(com.google.android.ump.ConsentForm consentForm) {
        consentForm.show(this.activity, this.onConsentFormDismissedListener);
    }

    public void showPrivacyOptionsForm() {
        com.google.android.ump.UserMessagingPlatform.showPrivacyOptionsForm(this.activity, this.onConsentFormDismissedListener);
    }
}
