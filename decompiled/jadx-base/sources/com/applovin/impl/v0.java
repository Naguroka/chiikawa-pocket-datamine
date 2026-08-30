package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.v0> CREATOR = new com.applovin.impl.v0.a();
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final byte[] f;

    @Override // com.applovin.impl.xa
    public java.lang.String toString() {
        return this.f1498a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    v0(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.ApicFrame.ID);
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.f = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.af.b
    public void a(com.applovin.impl.ud.b bVar) {
        bVar.a(this.f, this.d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.v0.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.v0 v0Var = (com.applovin.impl.v0) obj;
        return this.d == v0Var.d && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) v0Var.b) && com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) v0Var.c) && java.util.Arrays.equals(this.f, v0Var.f);
    }

    public int hashCode() {
        int i = (this.d + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f);
    }

    public v0(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super(androidx.media3.extractor.metadata.id3.ApicFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.v0[] newArray(int i) {
            return new com.applovin.impl.v0[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.v0 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.v0(parcel);
        }
    }
}
