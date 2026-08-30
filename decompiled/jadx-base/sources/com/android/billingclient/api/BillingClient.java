package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BillingClient {

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @java.lang.Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class Builder {
        volatile boolean zza;
        volatile com.google.android.gms.internal.play_billing.zzbl zzb;
        private volatile java.lang.String zzc;
        private volatile com.android.billingclient.api.PendingPurchasesParams zzd;
        private final android.content.Context zze;
        private volatile com.android.billingclient.api.PurchasesUpdatedListener zzf;
        private volatile com.android.billingclient.api.zzco zzg;
        private volatile com.android.billingclient.api.zzch zzh;
        private volatile com.android.billingclient.api.zzb zzi;
        private volatile com.android.billingclient.api.UserChoiceBillingListener zzj;
        private volatile java.util.concurrent.ExecutorService zzk;
        private volatile boolean zzl;
        private volatile boolean zzm;
        private volatile boolean zzn;

        /* synthetic */ Builder(android.content.Context context, com.android.billingclient.api.zzt zztVar) {
            this.zze = context;
        }

        private final boolean zza() {
            try {
                android.content.Context context = this.zze;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        public com.android.billingclient.api.BillingClient build() {
            com.android.billingclient.api.BillingClient zzceVar;
            android.content.Context context = this.zze;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.zzf == null) {
                if (this.zzj != null) {
                    throw new java.lang.IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (this.zzl || this.zzm) {
                    return zza() ? new com.android.billingclient.api.zzce(null, context, null, null, this) : new com.android.billingclient.api.BillingClientImpl(null, context, null, null, this);
                }
                throw new java.lang.IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.zzd == null || !this.zzd.isEnabledForOneTimeProducts()) {
                throw new java.lang.IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.zzf == null) {
                com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams = this.zzd;
                return zza() ? new com.android.billingclient.api.zzce(null, pendingPurchasesParams, context, null, null, null, this) : new com.android.billingclient.api.BillingClientImpl(null, pendingPurchasesParams, context, null, null, null, this);
            }
            if (this.zzj == null) {
                com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams2 = this.zzd;
                com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener = this.zzf;
                zzceVar = zza() ? new com.android.billingclient.api.zzce((java.lang.String) null, pendingPurchasesParams2, context, purchasesUpdatedListener, (com.android.billingclient.api.zzb) null, (com.android.billingclient.api.zzch) null, (java.util.concurrent.ExecutorService) null, this) : new com.android.billingclient.api.BillingClientImpl((java.lang.String) null, pendingPurchasesParams2, context, purchasesUpdatedListener, (com.android.billingclient.api.zzb) null, (com.android.billingclient.api.zzch) null, (java.util.concurrent.ExecutorService) null, this);
            } else {
                com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams3 = this.zzd;
                com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener2 = this.zzf;
                com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener = this.zzj;
                zzceVar = zza() ? new com.android.billingclient.api.zzce((java.lang.String) null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, (com.android.billingclient.api.zzch) null, (java.util.concurrent.ExecutorService) null, this) : new com.android.billingclient.api.BillingClientImpl((java.lang.String) null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, (com.android.billingclient.api.zzch) null, (java.util.concurrent.ExecutorService) null, this);
            }
            return zzceVar;
        }

        public com.android.billingclient.api.BillingClient.Builder enableAlternativeBillingOnly() {
            this.zzl = true;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enableAutoServiceReconnection() {
            this.zza = true;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enableExternalOffer() {
            this.zzm = true;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams) {
            this.zzd = pendingPurchasesParams;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder enableUserChoiceBilling(com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener) {
            this.zzj = userChoiceBillingListener;
            return this;
        }

        public com.android.billingclient.api.BillingClient.Builder setListener(com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzf = purchasesUpdatedListener;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FeatureType {
        public static final java.lang.String ALTERNATIVE_BILLING_ONLY = "jjj";
        public static final java.lang.String BILLING_CONFIG = "ggg";
        public static final java.lang.String EXTERNAL_OFFER = "kkk";
        public static final java.lang.String IN_APP_MESSAGING = "bbb";
        public static final java.lang.String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final java.lang.String PRODUCT_DETAILS = "fff";
        public static final java.lang.String SUBSCRIPTIONS = "subscriptions";
        public static final java.lang.String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OnPurchasesUpdatedSubResponseCode {
        public static final int NO_APPLICABLE_SUB_RESPONSE_CODE = 0;
        public static final int PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS = 1;
        public static final int USER_INELIGIBLE = 2;
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final java.lang.String INAPP = "inapp";
        public static final java.lang.String SUBS = "subs";
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.Deprecated
    public @interface SkuType {
        public static final java.lang.String INAPP = "inapp";
        public static final java.lang.String SUBS = "subs";
    }

    public static com.android.billingclient.api.BillingClient.Builder newBuilder(android.content.Context context) {
        return new com.android.billingclient.api.BillingClient.Builder(context, null);
    }

    public abstract void acknowledgePurchase(com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams, com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(com.android.billingclient.api.ConsumeParams consumeParams, com.android.billingclient.api.ConsumeResponseListener consumeResponseListener);

    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    public abstract void createExternalOfferReportingDetailsAsync(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    public abstract void getBillingConfigAsync(com.android.billingclient.api.GetBillingConfigParams getBillingConfigParams, com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    public abstract void isAlternativeBillingOnlyAvailableAsync(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    public abstract void isExternalOfferAvailableAsync(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String str);

    public abstract boolean isReady();

    public abstract com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity activity, com.android.billingclient.api.BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams, com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener);

    public abstract void queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams queryPurchasesParams, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener);

    public abstract com.android.billingclient.api.BillingResult showAlternativeBillingOnlyInformationDialog(android.app.Activity activity, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    public abstract com.android.billingclient.api.BillingResult showExternalOfferInformationDialog(android.app.Activity activity, com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract com.android.billingclient.api.BillingResult showInAppMessages(android.app.Activity activity, com.android.billingclient.api.InAppMessageParams inAppMessageParams, com.android.billingclient.api.InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(com.android.billingclient.api.BillingClientStateListener billingClientStateListener);
}
