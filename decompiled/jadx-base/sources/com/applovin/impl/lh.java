package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lh implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.lh> CREATOR = new com.applovin.impl.lh.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f994a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public lh(int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f994a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = bArr;
    }

    @Override // com.applovin.impl.af.b
    public void a(com.applovin.impl.ud.b bVar) {
        bVar.a(this.i, this.f994a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.lh.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.lh lhVar = (com.applovin.impl.lh) obj;
        return this.f994a == lhVar.f994a && this.b.equals(lhVar.b) && this.c.equals(lhVar.c) && this.d == lhVar.d && this.f == lhVar.f && this.g == lhVar.g && this.h == lhVar.h && java.util.Arrays.equals(this.i, lhVar.i);
    }

    public int hashCode() {
        return ((((((((((((((this.f994a + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + java.util.Arrays.hashCode(this.i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.f994a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }

    lh(android.os.Parcel parcel) {
        this.f994a = parcel.readInt();
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.d = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.lh[] newArray(int i) {
            return new com.applovin.impl.lh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.lh createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.lh(parcel);
        }
    }
}
