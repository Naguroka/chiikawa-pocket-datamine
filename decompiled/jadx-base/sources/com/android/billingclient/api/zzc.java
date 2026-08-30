package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    /* synthetic */ zzc(org.json.JSONObject jSONObject, com.android.billingclient.api.zzd zzdVar) {
        this.zza = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString(com.ironsource.y8.h.m);
        java.lang.String strOptString = jSONObject.optString("offerToken");
        this.zzc = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.android.billingclient.api.zzc)) {
            return false;
        }
        com.android.billingclient.api.zzc zzcVar = (com.android.billingclient.api.zzc) obj;
        return this.zza.equals(zzcVar.zza) && this.zzb.equals(zzcVar.zzb) && java.util.Objects.equals(this.zzc, zzcVar.zzc);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
    }
}
