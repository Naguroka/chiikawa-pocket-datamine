package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.h2> CREATOR = new com.applovin.impl.h2.a();
    public final byte[] b;

    h2(android.os.Parcel parcel) {
        super((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString()));
        this.b = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.h2.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.h2 h2Var = (com.applovin.impl.h2) obj;
        return this.f1498a.equals(h2Var.f1498a) && java.util.Arrays.equals(this.b, h2Var.b);
    }

    public int hashCode() {
        return ((this.f1498a.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f1498a);
        parcel.writeByteArray(this.b);
    }

    public h2(java.lang.String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.h2[] newArray(int i) {
            return new com.applovin.impl.h2[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.h2 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.h2(parcel);
        }
    }
}
