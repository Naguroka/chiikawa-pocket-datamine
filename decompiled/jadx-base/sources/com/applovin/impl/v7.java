package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class v7 implements com.applovin.impl.af.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1422a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final byte[] f;
    private int g;
    private static final com.applovin.impl.e9 h = new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.APPLICATION_ID3).a();
    private static final com.applovin.impl.e9 i = new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.APPLICATION_SCTE35).a();
    public static final android.os.Parcelable.Creator<com.applovin.impl.v7> CREATOR = new com.applovin.impl.v7.a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "EMSG: scheme=" + this.f1422a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    v7(android.os.Parcel parcel) {
        this.f1422a = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.af.b
    public com.applovin.impl.e9 b() {
        java.lang.String str = this.f1422a;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    @Override // com.applovin.impl.af.b
    public byte[] a() {
        if (b() != null) {
            return this.f;
        }
        return null;
    }

    public int hashCode() {
        if (this.g == 0) {
            java.lang.String str = this.f1422a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            java.lang.String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.g = ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.f);
        }
        return this.g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.v7.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.v7 v7Var = (com.applovin.impl.v7) obj;
        return this.c == v7Var.c && this.d == v7Var.d && com.applovin.impl.xp.a((java.lang.Object) this.f1422a, (java.lang.Object) v7Var.f1422a) && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) v7Var.b) && java.util.Arrays.equals(this.f, v7Var.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeString(this.f1422a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f);
    }

    public v7(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        this.f1422a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.f = bArr;
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.v7[] newArray(int i) {
            return new com.applovin.impl.v7[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.v7 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.v7(parcel);
        }
    }
}
