package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.f3> CREATOR = new com.applovin.impl.f3.a();
    public final java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final java.lang.String[] f;
    private final com.applovin.impl.xa[] g;

    f3(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.ChapterTocFrame.ID);
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f = (java.lang.String[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createStringArray());
        int i = parcel.readInt();
        this.g = new com.applovin.impl.xa[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2] = (com.applovin.impl.xa) parcel.readParcelable(com.applovin.impl.xa.class.getClassLoader());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.f3.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.f3 f3Var = (com.applovin.impl.f3) obj;
        return this.c == f3Var.c && this.d == f3Var.d && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) f3Var.b) && java.util.Arrays.equals(this.f, f3Var.f) && java.util.Arrays.equals(this.g, f3Var.g);
    }

    public int hashCode() {
        int i = ((((this.c ? 1 : 0) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.d ? 1 : 0)) * 31;
        java.lang.String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (com.applovin.impl.xa xaVar : this.g) {
            parcel.writeParcelable(xaVar, 0);
        }
    }

    public f3(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, com.applovin.impl.xa[] xaVarArr) {
        super(androidx.media3.extractor.metadata.id3.ChapterTocFrame.ID);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.f = strArr;
        this.g = xaVarArr;
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.f3[] newArray(int i) {
            return new com.applovin.impl.f3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.f3 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.f3(parcel);
        }
    }
}
