package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class SkuDetails {
    private final java.lang.String zza;
    private final org.json.JSONObject zzb;

    public SkuDetails(java.lang.String str) throws org.json.JSONException {
        this.zza = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.zzb = jSONObject;
        if (android.text.TextUtils.isEmpty(jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new java.lang.IllegalArgumentException("SKU cannot be empty.");
        }
        if (android.text.TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new java.lang.IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.billingclient.api.SkuDetails) {
            return android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.SkuDetails) obj).zza);
        }
        return false;
    }

    public java.lang.String getDescription() {
        return this.zzb.optString("description");
    }

    public java.lang.String getFreeTrialPeriod() {
        return this.zzb.optString("freeTrialPeriod");
    }

    public java.lang.String getIconUrl() {
        return this.zzb.optString("iconUrl");
    }

    public java.lang.String getIntroductoryPrice() {
        return this.zzb.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.zzb.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.zzb.optInt("introductoryPriceCycles");
    }

    public java.lang.String getIntroductoryPricePeriod() {
        return this.zzb.optString("introductoryPricePeriod");
    }

    public java.lang.String getOriginalJson() {
        return this.zza;
    }

    public java.lang.String getOriginalPrice() {
        org.json.JSONObject jSONObject = this.zzb;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        org.json.JSONObject jSONObject = this.zzb;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    public java.lang.String getPrice() {
        return this.zzb.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.zzb.optLong("price_amount_micros");
    }

    public java.lang.String getPriceCurrencyCode() {
        return this.zzb.optString("price_currency_code");
    }

    public java.lang.String getSku() {
        return this.zzb.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    public java.lang.String getSubscriptionPeriod() {
        return this.zzb.optString("subscriptionPeriod");
    }

    public java.lang.String getTitle() {
        return this.zzb.optString(com.ironsource.y8.h.D0);
    }

    public java.lang.String getType() {
        return this.zzb.optString("type");
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public java.lang.String toString() {
        return "SkuDetails: ".concat(java.lang.String.valueOf(this.zza));
    }

    public int zza() {
        return this.zzb.optInt("offer_type");
    }

    public java.lang.String zzb() {
        return this.zzb.optString("offer_id");
    }

    public java.lang.String zzc() {
        org.json.JSONObject jSONObject = this.zzb;
        java.lang.String strOptString = jSONObject.optString("offerIdToken");
        return strOptString.isEmpty() ? jSONObject.optString("offer_id_token") : strOptString;
    }

    public final java.lang.String zzd() {
        return this.zzb.optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public java.lang.String zze() {
        return this.zzb.optString("serializedDocid");
    }

    final java.lang.String zzf() {
        return this.zzb.optString("skuDetailsToken");
    }
}
