package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class WebImage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.images.WebImage> CREATOR = new com.google.android.gms.common.images.zah();
    final int zaa;
    private final android.net.Uri zab;
    private final int zac;
    private final int zad;

    WebImage(int i, android.net.Uri uri, int i2, int i3) {
        this.zaa = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof com.google.android.gms.common.images.WebImage)) {
            com.google.android.gms.common.images.WebImage webImage = (com.google.android.gms.common.images.WebImage) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    public android.net.Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zab, java.lang.Integer.valueOf(this.zac), java.lang.Integer.valueOf(this.zad));
    }

    public org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put("width", this.zac);
            jSONObject.put("height", this.zad);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Image %dx%d %s", java.lang.Integer.valueOf(this.zac), java.lang.Integer.valueOf(this.zad), this.zab.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getHeight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebImage(android.net.Uri uri) throws java.lang.IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(android.net.Uri uri, int i, int i2) throws java.lang.IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebImage(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = android.net.Uri.parse(jSONObject.getString("url"));
            } catch (org.json.JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }
}
