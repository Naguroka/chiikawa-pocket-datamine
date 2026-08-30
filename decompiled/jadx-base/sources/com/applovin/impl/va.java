package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class va implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.va> CREATOR = new com.applovin.impl.va.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1424a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    va(android.os.Parcel parcel) {
        this.f1424a = (byte[]) com.applovin.impl.b1.a(parcel.createByteArray());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // com.applovin.impl.af.b
    public void a(com.applovin.impl.ud.b bVar) {
        java.lang.String str = this.b;
        if (str != null) {
            bVar.k(str);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.va.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f1424a, ((com.applovin.impl.va) obj).f1424a);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f1424a);
    }

    public java.lang.String toString() {
        return java.lang.String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, java.lang.Integer.valueOf(this.f1424a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByteArray(this.f1424a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public va(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this.f1424a = bArr;
        this.b = str;
        this.c = str2;
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.va[] newArray(int i) {
            return new com.applovin.impl.va[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.va createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.va(parcel);
        }
    }
}
