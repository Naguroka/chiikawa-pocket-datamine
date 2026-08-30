package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ed implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.ed> CREATOR = new com.applovin.impl.ed.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f753a;
    public final byte[] b;
    public final int c;
    public final int d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "mdta: key=" + this.f753a;
    }

    private ed(android.os.Parcel parcel) {
        this.f753a = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.b = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.ed.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.ed edVar = (com.applovin.impl.ed) obj;
        return this.f753a.equals(edVar.f753a) && java.util.Arrays.equals(this.b, edVar.b) && this.c == edVar.c && this.d == edVar.d;
    }

    public int hashCode() {
        return ((((((this.f753a.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* synthetic */ ed(android.os.Parcel parcel, com.applovin.impl.ed.a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f753a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.ed[] newArray(int i) {
            return new com.applovin.impl.ed[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.ed createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.ed(parcel, null);
        }
    }

    public ed(java.lang.String str, byte[] bArr, int i, int i2) {
        this.f753a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }
}
