package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rb extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.rb> CREATOR = new com.applovin.impl.rb.a();
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    @Override // com.applovin.impl.xa
    public java.lang.String toString() {
        return this.f1498a + ": domain=" + this.b + ", description=" + this.c;
    }

    rb(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.InternalFrame.ID);
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.d = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.rb.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.rb rbVar = (com.applovin.impl.rb) obj;
        return com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) rbVar.c) && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) rbVar.b) && com.applovin.impl.xp.a((java.lang.Object) this.d, (java.lang.Object) rbVar.d);
    }

    public int hashCode() {
        java.lang.String str = this.b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public rb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(androidx.media3.extractor.metadata.id3.InternalFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f1498a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.rb[] newArray(int i) {
            return new com.applovin.impl.rb[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.rb createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.rb(parcel);
        }
    }
}
