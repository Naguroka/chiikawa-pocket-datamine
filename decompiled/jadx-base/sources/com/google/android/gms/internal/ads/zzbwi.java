package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbwi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbwi> CREATOR = new com.google.android.gms.internal.ads.zzbwj();
    public final java.lang.String zza;
    public final int zzb;

    public zzbwi(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzbwi zza(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbwi(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.zzbwi)) {
            com.google.android.gms.internal.ads.zzbwi zzbwiVar = (com.google.android.gms.internal.ads.zzbwi) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzbwiVar.zza)) {
                if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzbwiVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
