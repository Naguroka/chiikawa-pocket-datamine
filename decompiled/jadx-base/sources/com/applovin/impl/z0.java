package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.z0> CREATOR = new com.applovin.impl.z0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1552a;
    public final java.lang.String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "Ait(controlCode=" + this.f1552a + ",url=" + this.b + ")";
    }

    public z0(int i, java.lang.String str) {
        this.f1552a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f1552a);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.z0 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.z0(parcel.readInt(), (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.z0[] newArray(int i) {
            return new com.applovin.impl.z0[i];
        }
    }
}
