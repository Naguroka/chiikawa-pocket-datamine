package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class up extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.up> CREATOR = new com.applovin.impl.up.a();
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // com.applovin.impl.xa
    public java.lang.String toString() {
        return this.f1498a + ": url=" + this.c;
    }

    up(android.os.Parcel parcel) {
        super((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString()));
        this.b = parcel.readString();
        this.c = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.up.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.up upVar = (com.applovin.impl.up) obj;
        return this.f1498a.equals(upVar.f1498a) && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) upVar.b) && com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) upVar.c);
    }

    public int hashCode() {
        int iHashCode = (this.f1498a.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public up(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f1498a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.up[] newArray(int i) {
            return new com.applovin.impl.up[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.up createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.up(parcel);
        }
    }
}
