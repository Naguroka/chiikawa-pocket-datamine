package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class PurchaseHistoryRecord {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final org.json.JSONObject zzc;

    public PurchaseHistoryRecord(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
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
        if (!(obj instanceof com.android.billingclient.api.PurchaseHistoryRecord)) {
            return false;
        }
        com.android.billingclient.api.PurchaseHistoryRecord purchaseHistoryRecord = (com.android.billingclient.api.PurchaseHistoryRecord) obj;
        return android.text.TextUtils.equals(this.zza, purchaseHistoryRecord.getOriginalJson()) && android.text.TextUtils.equals(this.zzb, purchaseHistoryRecord.getSignature());
    }

    public java.lang.String getDeveloperPayload() {
        return this.zzc.optString("developerPayload");
    }

    public java.lang.String getOriginalJson() {
        return this.zza;
    }

    public java.util.List<java.lang.String> getProducts() {
        return zza();
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

    public java.lang.String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(java.lang.String.valueOf(this.zza));
    }
}
