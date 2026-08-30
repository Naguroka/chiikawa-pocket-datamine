package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z9 extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.z9> CREATOR = new com.applovin.impl.z9.a();
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final byte[] f;

    @Override // com.applovin.impl.xa
    public java.lang.String toString() {
        return this.f1498a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }

    z9(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.GeobFrame.ID);
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.d = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.f = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.z9.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.z9 z9Var = (com.applovin.impl.z9) obj;
        return com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) z9Var.b) && com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) z9Var.c) && com.applovin.impl.xp.a((java.lang.Object) this.d, (java.lang.Object) z9Var.d) && java.util.Arrays.equals(this.f, z9Var.f);
    }

    public int hashCode() {
        java.lang.String str = this.b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f);
    }

    public z9(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super(androidx.media3.extractor.metadata.id3.GeobFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.z9[] newArray(int i) {
            return new com.applovin.impl.z9[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.z9 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.z9(parcel);
        }
    }
}
