package com.google.android.gms.drive.metadata;

/* JADX INFO: loaded from: classes4.dex */
public class CustomPropertyKey extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int PRIVATE = 1;
    public static final int PUBLIC = 0;
    private final int visibility;
    private final java.lang.String zziz;
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.CustomPropertyKey> CREATOR = new com.google.android.gms.drive.metadata.zzc();
    private static final java.util.regex.Pattern zzja = java.util.regex.Pattern.compile("[\\w.!@$%^&*()/-]+");

    public CustomPropertyKey(java.lang.String str, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, com.ironsource.y8.h.W);
        com.google.android.gms.common.internal.Preconditions.checkArgument(zzja.matcher(str).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "visibility must be either PUBLIC or PRIVATE");
        this.zziz = str;
        this.visibility = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zziz, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.visibility);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public java.lang.String getKey() {
        return this.zziz;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        java.lang.String str = this.zziz;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 11).append(str).append(this.visibility).toString().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            com.google.android.gms.drive.metadata.CustomPropertyKey customPropertyKey = (com.google.android.gms.drive.metadata.CustomPropertyKey) obj;
            if (customPropertyKey.getKey().equals(this.zziz) && customPropertyKey.getVisibility() == this.visibility) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.String str = this.zziz;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 31).append("CustomPropertyKey(").append(str).append(",").append(this.visibility).append(")").toString();
    }

    public org.json.JSONObject toJson() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.y8.h.W, getKey());
        jSONObject.put("visibility", getVisibility());
        return jSONObject;
    }

    public static com.google.android.gms.drive.metadata.CustomPropertyKey fromJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return new com.google.android.gms.drive.metadata.CustomPropertyKey(jSONObject.getString(com.ironsource.y8.h.W), jSONObject.getInt("visibility"));
    }
}
