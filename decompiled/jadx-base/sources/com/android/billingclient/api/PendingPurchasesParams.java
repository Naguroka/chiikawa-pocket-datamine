package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class PendingPurchasesParams {
    private final boolean enableOneTimeProducts;
    private final boolean enablePrepaidPlans;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class Builder {
        private boolean enableOneTimeProducts;
        private boolean enablePrepaidPlans;

        private Builder() {
        }

        public com.android.billingclient.api.PendingPurchasesParams build() {
            if (!this.enableOneTimeProducts) {
                throw new java.lang.IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new com.android.billingclient.api.PendingPurchasesParams(true, this.enablePrepaidPlans);
        }

        public com.android.billingclient.api.PendingPurchasesParams.Builder enableOneTimeProducts() {
            this.enableOneTimeProducts = true;
            return this;
        }

        public com.android.billingclient.api.PendingPurchasesParams.Builder enablePrepaidPlans() {
            this.enablePrepaidPlans = true;
            return this;
        }
    }

    private PendingPurchasesParams(boolean z, boolean z2) {
        this.enableOneTimeProducts = z;
        this.enablePrepaidPlans = z2;
    }

    public static com.android.billingclient.api.PendingPurchasesParams.Builder newBuilder() {
        return new com.android.billingclient.api.PendingPurchasesParams.Builder();
    }

    boolean isEnabledForOneTimeProducts() {
        return this.enableOneTimeProducts;
    }

    boolean isEnabledForPrepaidPlans() {
        return this.enablePrepaidPlans;
    }
}
