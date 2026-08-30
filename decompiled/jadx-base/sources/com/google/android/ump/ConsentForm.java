package com.google.android.ump;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface ConsentForm {

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(com.google.android.ump.FormError formError);
    }

    void show(android.app.Activity activity, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener);
}
