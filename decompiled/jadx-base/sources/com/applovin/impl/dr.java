package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class dr implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.dr> CREATOR = new com.applovin.impl.dr.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f740a;
    public final java.lang.String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "VC: " + this.f740a + com.ironsource.y8.i.b + this.b;
    }

    dr(android.os.Parcel parcel) {
        this.f740a = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
    }

    @Override // com.applovin.impl.af.b
    public void a(com.applovin.impl.ud.b bVar) {
        java.lang.String str = this.f740a;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.b(this.b);
                break;
            case "TITLE":
                bVar.k(this.b);
                break;
            case "DESCRIPTION":
                bVar.g(this.b);
                break;
            case "ALBUMARTIST":
                bVar.a(this.b);
                break;
            case "ARTIST":
                bVar.c(this.b);
                break;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.dr.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.dr drVar = (com.applovin.impl.dr) obj;
        return this.f740a.equals(drVar.f740a) && this.b.equals(drVar.b);
    }

    public dr(java.lang.String str, java.lang.String str2) {
        this.f740a = str;
        this.b = str2;
    }

    public int hashCode() {
        return ((this.f740a.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f740a);
        parcel.writeString(this.b);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.dr[] newArray(int i) {
            return new com.applovin.impl.dr[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.dr createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.dr(parcel);
        }
    }
}
