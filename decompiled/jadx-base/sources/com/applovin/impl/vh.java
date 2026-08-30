package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vh extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.vh> CREATOR = new com.applovin.impl.vh.a();
    public final java.lang.String b;
    public final byte[] c;

    @Override // com.applovin.impl.xa
    public java.lang.String toString() {
        return this.f1498a + ": owner=" + this.b;
    }

    vh(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.PrivFrame.ID);
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.vh.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.vh vhVar = (com.applovin.impl.vh) obj;
        return com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) vhVar.b) && java.util.Arrays.equals(this.c, vhVar.c);
    }

    public int hashCode() {
        java.lang.String str = this.b;
        return (((str != null ? str.hashCode() : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public vh(java.lang.String str, byte[] bArr) {
        super(androidx.media3.extractor.metadata.id3.PrivFrame.ID);
        this.b = str;
        this.c = bArr;
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.vh[] newArray(int i) {
            return new com.applovin.impl.vh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.vh createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.vh(parcel);
        }
    }
}
