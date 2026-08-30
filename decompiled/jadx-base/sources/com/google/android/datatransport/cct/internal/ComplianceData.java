package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ComplianceData {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.ComplianceData build();

        public abstract com.google.android.datatransport.cct.internal.ComplianceData.Builder setPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext);

        public abstract com.google.android.datatransport.cct.internal.ComplianceData.Builder setProductIdOrigin(com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin);
    }

    public abstract com.google.android.datatransport.cct.internal.ExternalPrivacyContext getPrivacyContext();

    public abstract com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin getProductIdOrigin();

    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin> valueMap;
        private final int value;

        static {
            com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin = NOT_SET;
            com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin2 = EVENT_OVERRIDE;
            android.util.SparseArray<com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin> sparseArray = new android.util.SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        ProductIdOrigin(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin forNumber(int i) {
            return valueMap.get(i);
        }
    }

    public static com.google.android.datatransport.cct.internal.ComplianceData.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_ComplianceData.Builder();
    }
}
