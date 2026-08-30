package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class BillingFlowParams {
    private boolean zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzbt zze;
    private java.util.ArrayList zzf;
    private boolean zzg;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;
        private java.util.List zzc;
        private java.util.ArrayList zzd;
        private boolean zze;
        private com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.zzf = builderNewBuilder;
        }

        public com.android.billingclient.api.BillingFlowParams build() {
            java.util.ArrayList arrayList = this.zzd;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            java.util.List list = this.zzc;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new java.lang.IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new java.lang.IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            com.android.billingclient.api.zzcf zzcfVar = null;
            if (!z2) {
                java.util.List list2 = this.zzc;
                if (list2 != null) {
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) it.next()) == null) {
                            throw new java.lang.IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.zzd.contains(null)) {
                    throw new java.lang.IllegalArgumentException("SKU cannot be null.");
                }
                if (this.zzd.size() > 1) {
                    com.android.billingclient.api.SkuDetails skuDetails = (com.android.billingclient.api.SkuDetails) this.zzd.get(0);
                    java.lang.String type = skuDetails.getType();
                    java.util.ArrayList arrayList2 = this.zzd;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        com.android.billingclient.api.SkuDetails skuDetails2 = (com.android.billingclient.api.SkuDetails) arrayList2.get(i);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new java.lang.IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    java.lang.String strZzd = skuDetails.zzd();
                    java.util.ArrayList arrayList3 = this.zzd;
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        com.android.billingclient.api.SkuDetails skuDetails3 = (com.android.billingclient.api.SkuDetails) arrayList3.get(i2);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new java.lang.IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            com.android.billingclient.api.BillingFlowParams billingFlowParams = new com.android.billingclient.api.BillingFlowParams(zzcfVar);
            if ((!z2 || ((com.android.billingclient.api.SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z3 || ((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                z = false;
            }
            billingFlowParams.zza = z;
            billingFlowParams.zzb = this.zza;
            billingFlowParams.zzc = this.zzb;
            billingFlowParams.zzd = this.zzf.build();
            java.util.ArrayList arrayList4 = this.zzd;
            billingFlowParams.zzf = arrayList4 != null ? new java.util.ArrayList(arrayList4) : new java.util.ArrayList();
            billingFlowParams.zzg = this.zze;
            java.util.List list3 = this.zzc;
            billingFlowParams.zze = list3 != null ? com.google.android.gms.internal.play_billing.zzbt.zzj(list3) : com.google.android.gms.internal.play_billing.zzbt.zzk();
            return billingFlowParams;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setIsOfferPersonalized(boolean z) {
            this.zze = z;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setObfuscatedAccountId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setObfuscatedProfileId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setProductDetailsParamsList(java.util.List<com.android.billingclient.api.BillingFlowParams.ProductDetailsParams> list) {
            this.zzc = new java.util.ArrayList(list);
            return this;
        }

        @java.lang.Deprecated
        public com.android.billingclient.api.BillingFlowParams.Builder setSkuDetails(com.android.billingclient.api.SkuDetails skuDetails) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        public com.android.billingclient.api.BillingFlowParams.Builder setSubscriptionUpdateParams(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.zzb(subscriptionUpdateParams);
            return this;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzcf zzcfVar) {
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder = com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.zzf = builderNewBuilder;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class ProductDetailsParams {
        private final com.android.billingclient.api.ProductDetails zza;
        private final java.lang.String zzb;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static class Builder {
            private com.android.billingclient.api.ProductDetails zza;
            private java.lang.String zzb;

            private Builder() {
                throw null;
            }

            /* synthetic */ Builder(com.android.billingclient.api.zzcf zzcfVar) {
            }

            public com.android.billingclient.api.BillingFlowParams.ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzbg.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                return new com.android.billingclient.api.BillingFlowParams.ProductDetailsParams(this, null);
            }

            public com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder setOfferToken(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("offerToken can not be empty");
                }
                this.zzb = str;
                return this;
            }

            public com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder setProductDetails(com.android.billingclient.api.ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.zzb = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }
        }

        /* synthetic */ ProductDetailsParams(com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder builder, com.android.billingclient.api.zzcf zzcfVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder newBuilder() {
            return new com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder(null);
        }

        public final com.android.billingclient.api.ProductDetails zza() {
            return this.zza;
        }

        public final java.lang.String zzb() {
            return this.zzb;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class SubscriptionUpdateParams {
        private java.lang.String zza;
        private java.lang.String zzb;
        private int zzc = 0;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static class Builder {
            private java.lang.String zza;
            private java.lang.String zzb;
            private boolean zzc;
            private int zzd = 0;

            private Builder() {
            }

            /* synthetic */ Builder(com.android.billingclient.api.zzcf zzcfVar) {
            }

            static /* synthetic */ com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zza(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder builder) {
                builder.zzc = true;
                return builder;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams build() {
                com.android.billingclient.api.zzcf zzcfVar = null;
                boolean z = (android.text.TextUtils.isEmpty(this.zza) && android.text.TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ android.text.TextUtils.isEmpty(this.zzb);
                if (z && zIsEmpty) {
                    throw new java.lang.IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.zzc && !z && !zIsEmpty) {
                    throw new java.lang.IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams = new com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams(zzcfVar);
                subscriptionUpdateParams.zza = this.zza;
                subscriptionUpdateParams.zzc = this.zzd;
                subscriptionUpdateParams.zzb = this.zzb;
                return subscriptionUpdateParams;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder setOldPurchaseToken(java.lang.String str) {
                this.zza = str;
                return this;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder setOriginalExternalTransactionId(java.lang.String str) {
                this.zzb = str;
                return this;
            }

            public com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder setSubscriptionReplacementMode(int i) {
                this.zzd = i;
                return this;
            }

            @java.lang.Deprecated
            public final com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zzb(java.lang.String str) {
                this.zza = str;
                return this;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        /* synthetic */ SubscriptionUpdateParams(com.android.billingclient.api.zzcf zzcfVar) {
        }

        public static com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder() {
            return new com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder(null);
        }

        static /* bridge */ /* synthetic */ com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder zzb(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams) {
            com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder = newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.zza);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzc);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return builderNewBuilder;
        }

        final int zza() {
            return this.zzc;
        }

        final java.lang.String zzc() {
            return this.zza;
        }

        final java.lang.String zzd() {
            return this.zzb;
        }
    }

    private BillingFlowParams() {
        throw null;
    }

    /* synthetic */ BillingFlowParams(com.android.billingclient.api.zzcf zzcfVar) {
    }

    public static com.android.billingclient.api.BillingFlowParams.Builder newBuilder() {
        return new com.android.billingclient.api.BillingFlowParams.Builder(null);
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.zzd.zza();
    }

    public long zzc() {
        return 0L;
    }

    final com.android.billingclient.api.BillingResult zzd() {
        com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails next;
        if (this.zze.isEmpty()) {
            return com.android.billingclient.api.zzcj.zzi;
        }
        com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) this.zze.get(0);
        for (int i = 1; i < this.zze.size(); i++) {
            com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams2 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) this.zze.get(i);
            if (!productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                return com.android.billingclient.api.zzcj.zza(5, "All products should have same ProductType.");
            }
        }
        java.lang.String strZza = productDetailsParams.zza().zza();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
        com.google.android.gms.internal.play_billing.zzbt zzbtVar = this.zze;
        int size = zzbtVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams3 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) zzbtVar.get(i2);
            if (productDetailsParams3.zza().getSubscriptionOfferDetails() != null && productDetailsParams3.zzb() == null) {
                return com.android.billingclient.api.zzcj.zza(5, java.lang.String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", productDetailsParams3.zza().getProductId()));
            }
            if (map.containsKey(productDetailsParams3.zza().getProductId())) {
                return com.android.billingclient.api.zzcj.zza(5, java.lang.String.format("ProductId can not be duplicated. Invalid product id: %s.", productDetailsParams3.zza().getProductId()));
            }
            map.put(productDetailsParams3.zza().getProductId(), productDetailsParams3);
            if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams3.zza().zza())) {
                return com.android.billingclient.api.zzcj.zza(5, "All products must have the same package name.");
            }
        }
        for (java.lang.String str : hashSet) {
            if (map.containsKey(str)) {
                return com.android.billingclient.api.zzcj.zza(5, java.lang.String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        java.util.List<com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
        java.lang.String strZzb = productDetailsParams.zzb();
        if (strZzb != null && oneTimePurchaseOfferDetailsList != null) {
            java.util.Iterator<com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails> it = oneTimePurchaseOfferDetailsList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!strZzb.equals(next.getOfferToken()));
            if (next != null && next.zza() != null) {
                return com.android.billingclient.api.zzcj.zza(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return com.android.billingclient.api.zzcj.zzi;
    }

    public final java.lang.String zze() {
        return this.zzb;
    }

    public final java.lang.String zzf() {
        return this.zzc;
    }

    public java.lang.String zzg() {
        return null;
    }

    public final java.lang.String zzh() {
        return this.zzd.zzc();
    }

    public final java.lang.String zzi() {
        return this.zzd.zzd();
    }

    public final java.util.ArrayList zzj() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final java.util.List zzk() {
        return this.zze;
    }

    public final boolean zzs() {
        return this.zzg;
    }

    final boolean zzt() {
        if (this.zzb != null || this.zzc != null || this.zzd.zzd() != null || this.zzd.zza() != 0 || this.zza || this.zzg) {
            return true;
        }
        com.google.android.gms.internal.play_billing.zzbt zzbtVar = this.zze;
        if (zzbtVar != null) {
            int size = zzbtVar.size();
            for (int i = 0; i < size; i++) {
            }
        }
        return false;
    }
}
