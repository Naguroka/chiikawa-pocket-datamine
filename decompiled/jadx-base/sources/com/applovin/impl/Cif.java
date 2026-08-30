package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.if, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cif extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.Cif> CREATOR = new com.applovin.impl.Cif.a();
    public final int b;
    public final int c;
    public final int d;
    public final int[] f;
    public final int[] g;

    @Override // com.applovin.impl.xa, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Cif(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(androidx.media3.extractor.metadata.id3.MlltFrame.ID);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = iArr;
        this.g = iArr2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.Cif.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.Cif cif = (com.applovin.impl.Cif) obj;
        return this.b == cif.b && this.c == cif.c && this.d == cif.d && java.util.Arrays.equals(this.f, cif.f) && java.util.Arrays.equals(this.g, cif.g);
    }

    public int hashCode() {
        return ((((((((this.b + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31) + java.util.Arrays.hashCode(this.f)) * 31) + java.util.Arrays.hashCode(this.g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    Cif(android.os.Parcel parcel) {
        super(androidx.media3.extractor.metadata.id3.MlltFrame.ID);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = (int[]) com.applovin.impl.xp.a(parcel.createIntArray());
        this.g = (int[]) com.applovin.impl.xp.a(parcel.createIntArray());
    }

    /* JADX INFO: renamed from: com.applovin.impl.if$a */
    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.Cif[] newArray(int i) {
            return new com.applovin.impl.Cif[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.Cif createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.Cif(parcel);
        }
    }
}
