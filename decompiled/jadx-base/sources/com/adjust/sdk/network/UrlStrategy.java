package com.adjust.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class UrlStrategy {
    private static final java.lang.String BASE_URL_IO = "https://app.adjust.io";
    private static final java.lang.String GDPR_URL_IO = "https://gdpr.adjust.io";
    private static final java.lang.String PURCHASE_VERIFICATION_URL_IO = "https://ssrv.adjust.io";
    private static final java.lang.String SUBSCRIPTION_URL_IO = "https://subscription.adjust.io";
    private final java.lang.String baseUrlOverwrite;
    private final java.lang.String gdprUrlOverwrite;
    private final java.lang.String purchaseVerificationUrlOverwrite;
    private final java.lang.String subscriptionUrlOverwrite;
    private final java.util.List<java.lang.String> urlStrategyDomains;
    private final boolean useSubdomains;
    final java.util.List<java.lang.String> baseUrlChoicesList = baseUrlChoices();
    final java.util.List<java.lang.String> gdprUrlChoicesList = gdprUrlChoices();
    final java.util.List<java.lang.String> subscriptionUrlChoicesList = subscriptionUrlChoices();
    final java.util.List<java.lang.String> purchaseVerificationUrlChoicesList = purchaseVerificationUrlChoices();
    boolean wasLastAttemptSuccess = false;
    int choiceIndex = 0;
    int startingChoiceIndex = 0;
    boolean wasLastAttemptWithOverwrittenUrl = false;

    public UrlStrategy(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list, boolean z) {
        this.urlStrategyDomains = list;
        this.useSubdomains = z;
        this.baseUrlOverwrite = str;
        this.gdprUrlOverwrite = str2;
        this.subscriptionUrlOverwrite = str3;
        this.purchaseVerificationUrlOverwrite = str4;
    }

    private java.util.List<java.lang.String> baseUrlChoices() {
        java.util.List<java.lang.String> list = this.urlStrategyDomains;
        if (list == null || list.isEmpty()) {
            return java.util.Arrays.asList(com.adjust.sdk.Constants.BASE_URL, BASE_URL_IO);
        }
        if (this.useSubdomains) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = this.urlStrategyDomains.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.BASE_URL_FORMAT, it.next()));
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it2 = this.urlStrategyDomains.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.String.format(com.adjust.sdk.Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, it2.next()));
        }
        return arrayList2;
    }

    private java.util.List<java.lang.String> gdprUrlChoices() {
        java.util.List<java.lang.String> list = this.urlStrategyDomains;
        if (list == null || list.isEmpty()) {
            return java.util.Arrays.asList(com.adjust.sdk.Constants.GDPR_URL, GDPR_URL_IO);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.useSubdomains) {
            java.util.Iterator<java.lang.String> it = this.urlStrategyDomains.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.GDPR_URL_FORMAT, it.next()));
            }
        } else {
            java.util.Iterator<java.lang.String> it2 = this.urlStrategyDomains.iterator();
            while (it2.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, it2.next()));
            }
        }
        return arrayList;
    }

    private java.util.List<java.lang.String> purchaseVerificationUrlChoices() {
        java.util.List<java.lang.String> list = this.urlStrategyDomains;
        if (list == null || list.isEmpty()) {
            return java.util.Arrays.asList(com.adjust.sdk.Constants.PURCHASE_VERIFICATION_URL, PURCHASE_VERIFICATION_URL_IO);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.useSubdomains) {
            java.util.Iterator<java.lang.String> it = this.urlStrategyDomains.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.PURCHASE_VERIFICATION_URL_FORMAT, it.next()));
            }
        } else {
            java.util.Iterator<java.lang.String> it2 = this.urlStrategyDomains.iterator();
            while (it2.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, it2.next()));
            }
        }
        return arrayList;
    }

    private java.util.List<java.lang.String> subscriptionUrlChoices() {
        java.util.List<java.lang.String> list = this.urlStrategyDomains;
        if (list == null || list.isEmpty()) {
            return java.util.Arrays.asList(com.adjust.sdk.Constants.SUBSCRIPTION_URL, SUBSCRIPTION_URL_IO);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.useSubdomains) {
            java.util.Iterator<java.lang.String> it = this.urlStrategyDomains.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.SUBSCRIPTION_URL_FORMAT, it.next()));
            }
        } else {
            java.util.Iterator<java.lang.String> it2 = this.urlStrategyDomains.iterator();
            while (it2.hasNext()) {
                arrayList.add(java.lang.String.format(com.adjust.sdk.Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, it2.next()));
            }
        }
        return arrayList;
    }

    public void resetAfterSuccess() {
        this.startingChoiceIndex = this.choiceIndex;
        this.wasLastAttemptSuccess = true;
    }

    public boolean shouldRetryAfterFailure(com.adjust.sdk.ActivityKind activityKind) {
        java.util.List<java.lang.String> list;
        this.wasLastAttemptSuccess = false;
        if (this.wasLastAttemptWithOverwrittenUrl) {
            return false;
        }
        if (activityKind == com.adjust.sdk.ActivityKind.GDPR) {
            list = this.gdprUrlChoicesList;
        } else if (activityKind == com.adjust.sdk.ActivityKind.SUBSCRIPTION) {
            list = this.subscriptionUrlChoicesList;
        } else {
            list = activityKind == com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION ? this.purchaseVerificationUrlChoicesList : this.baseUrlChoicesList;
        }
        int size = (this.choiceIndex + 1) % list.size();
        this.choiceIndex = size;
        return size != this.startingChoiceIndex;
    }

    public java.lang.String targetUrlByActivityKind(com.adjust.sdk.ActivityKind activityKind) {
        java.util.List<java.lang.String> list;
        if (activityKind == com.adjust.sdk.ActivityKind.GDPR) {
            java.lang.String str = this.gdprUrlOverwrite;
            if (str != null) {
                this.wasLastAttemptWithOverwrittenUrl = true;
                return str;
            }
            this.wasLastAttemptWithOverwrittenUrl = false;
            list = this.gdprUrlChoicesList;
        } else if (activityKind == com.adjust.sdk.ActivityKind.SUBSCRIPTION) {
            java.lang.String str2 = this.subscriptionUrlOverwrite;
            if (str2 != null) {
                this.wasLastAttemptWithOverwrittenUrl = true;
                return str2;
            }
            this.wasLastAttemptWithOverwrittenUrl = false;
            list = this.subscriptionUrlChoicesList;
        } else if (activityKind == com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION) {
            java.lang.String str3 = this.purchaseVerificationUrlOverwrite;
            if (str3 != null) {
                this.wasLastAttemptWithOverwrittenUrl = true;
                return str3;
            }
            this.wasLastAttemptWithOverwrittenUrl = false;
            list = this.purchaseVerificationUrlChoicesList;
        } else {
            java.lang.String str4 = this.baseUrlOverwrite;
            if (str4 != null) {
                this.wasLastAttemptWithOverwrittenUrl = true;
                return str4;
            }
            this.wasLastAttemptWithOverwrittenUrl = false;
            list = this.baseUrlChoicesList;
        }
        return list.get(this.choiceIndex);
    }
}
