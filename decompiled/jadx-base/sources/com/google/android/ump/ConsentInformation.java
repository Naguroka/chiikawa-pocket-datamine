package com.google.android.ump;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface ConsentInformation {

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(com.google.android.ump.FormError formError);
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public enum PrivacyOptionsRequirementStatus {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    boolean canRequestAds();

    int getConsentStatus();

    com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
