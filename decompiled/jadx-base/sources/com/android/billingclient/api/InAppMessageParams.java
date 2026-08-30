package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class InAppMessageParams {
    private final java.util.ArrayList zza;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class Builder {
        private final java.util.Set zza = new java.util.HashSet();

        public com.android.billingclient.api.InAppMessageParams.Builder addAllInAppMessageCategoriesToShow() {
            this.zza.add(2);
            return this;
        }

        public com.android.billingclient.api.InAppMessageParams.Builder addInAppMessageCategoryToShow(int i) {
            this.zza.add(java.lang.Integer.valueOf(i));
            return this;
        }

        public com.android.billingclient.api.InAppMessageParams build() {
            return new com.android.billingclient.api.InAppMessageParams(this.zza, null);
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    /* synthetic */ InAppMessageParams(java.util.Set set, com.android.billingclient.api.zzcq zzcqVar) {
        this.zza = new java.util.ArrayList(java.util.Collections.unmodifiableList(new java.util.ArrayList(set)));
    }

    public static com.android.billingclient.api.InAppMessageParams.Builder newBuilder() {
        return new com.android.billingclient.api.InAppMessageParams.Builder();
    }

    final java.util.ArrayList zza() {
        return this.zza;
    }
}
