package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.e3> CREATOR = new com.applovin.impl.e3.a();
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final long f;
    public final long g;
    private final com.applovin.impl.xa[] h;

    @Override // com.applovin.impl.xa, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    e3(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.ChapterFrame.ID);
        this.b = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int i = parcel.readInt();
        this.h = new com.applovin.impl.xa[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.h[i2] = (com.applovin.impl.xa) parcel.readParcelable(com.applovin.impl.xa.class.getClassLoader());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.e3.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.e3 e3Var = (com.applovin.impl.e3) obj;
        return this.c == e3Var.c && this.d == e3Var.d && this.f == e3Var.f && this.g == e3Var.g && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) e3Var.b) && java.util.Arrays.equals(this.h, e3Var.h);
    }

    public int hashCode() {
        int i = (((((((this.c + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        java.lang.String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (com.applovin.impl.xa xaVar : this.h) {
            parcel.writeParcelable(xaVar, 0);
        }
    }

    public e3(java.lang.String str, int i, int i2, long j, long j2, com.applovin.impl.xa[] xaVarArr) {
        super(androidx.media3.extractor.metadata.id3.ChapterFrame.ID);
        this.b = str;
        this.c = i;
        this.d = i2;
        this.f = j;
        this.g = j2;
        this.h = xaVarArr;
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.e3[] newArray(int i) {
            return new com.applovin.impl.e3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.e3 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.e3(parcel);
        }
    }
}
