package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class Purchase {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final org.json.JSONObject zzc;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class PendingPurchaseUpdate {
        private final org.json.JSONObject mParsedJson;

        private PendingPurchaseUpdate(org.json.JSONObject jSONObject) {
            this.mParsedJson = jSONObject;
        }

        public java.util.List<java.lang.String> getProducts() {
            org.json.JSONArray jSONArrayOptJSONArray;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.mParsedJson.has("productIds") && (jSONArrayOptJSONArray = this.mParsedJson.optJSONArray("productIds")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
            return arrayList;
        }

        public java.lang.String getPurchaseToken() {
            return this.mParsedJson.optString("purchaseToken");
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        this.zza = str;
        this.zzb = str2;
        this.zzc = new org.json.JSONObject(str);
    }

    private final java.util.ArrayList zza() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObject = this.zzc;
        if (jSONObject.has("productIds")) {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.android.billingclient.api.Purchase)) {
            return false;
        }
        com.android.billingclient.api.Purchase purchase = (com.android.billingclient.api.Purchase) obj;
        return android.text.TextUtils.equals(this.zza, purchase.getOriginalJson()) && android.text.TextUtils.equals(this.zzb, purchase.getSignature());
    }

    public com.android.billingclient.api.AccountIdentifiers getAccountIdentifiers() {
        org.json.JSONObject jSONObject = this.zzc;
        java.lang.String strOptString = jSONObject.optString("obfuscatedAccountId");
        java.lang.String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new com.android.billingclient.api.AccountIdentifiers(strOptString, strOptString2);
    }

    public java.lang.String getDeveloperPayload() {
        return this.zzc.optString("developerPayload");
    }

    public java.lang.String getOrderId() {
        java.lang.String strOptString = this.zzc.optString("orderId");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public java.lang.String getOriginalJson() {
        return this.zza;
    }

    public java.lang.String getPackageName() {
        return this.zzc.optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public com.android.billingclient.api.Purchase.PendingPurchaseUpdate getPendingPurchaseUpdate() {
        org.json.JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new com.android.billingclient.api.Purchase.PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    public java.util.List<java.lang.String> getProducts() {
        return zza();
    }

    public int getPurchaseState() {
        return this.zzc.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.zzc.optLong("purchaseTime");
    }

    public java.lang.String getPurchaseToken() {
        org.json.JSONObject jSONObject = this.zzc;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.zzc.optInt(com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY, 1);
    }

    public java.lang.String getSignature() {
        return this.zzb;
    }

    @java.lang.Deprecated
    public java.util.ArrayList<java.lang.String> getSkus() {
        return zza();
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public boolean isAcknowledged() {
        return this.zzc.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.zzc.optBoolean("autoRenewing");
    }

    public java.lang.String toString() {
        return "Purchase. Json: ".concat(java.lang.String.valueOf(this.zza));
    }
}
