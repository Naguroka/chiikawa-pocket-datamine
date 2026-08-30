package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class uk extends com.applovin.impl.sk {
    public static final android.os.Parcelable.Creator<com.applovin.impl.uk> CREATOR = new com.applovin.impl.uk.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1406a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean f;
    public final long g;
    public final long h;
    public final java.util.List i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    private uk(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, java.util.List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f1406a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = java.util.Collections.unmodifiableList(list);
        this.j = z5;
        this.k = j4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    static com.applovin.impl.uk a(com.applovin.impl.ah ahVar, long j, com.applovin.impl.ho hoVar) {
        java.util.List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iC;
        int iW;
        int iW2;
        boolean z4;
        boolean z5;
        long jY;
        long jY2 = ahVar.y();
        boolean z6 = (ahVar.w() & 128) != 0;
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = androidx.media3.common.C.TIME_UNSET;
            z3 = false;
            j3 = androidx.media3.common.C.TIME_UNSET;
            iC = 0;
            iW = 0;
            iW2 = 0;
            z4 = false;
        } else {
            int iW3 = ahVar.w();
            boolean z7 = (iW3 & 128) != 0;
            boolean z8 = (iW3 & 64) != 0;
            boolean z9 = (iW3 & 32) != 0;
            boolean z10 = (iW3 & 16) != 0;
            long jA = (!z8 || z10) ? androidx.media3.common.C.TIME_UNSET : com.applovin.impl.Cdo.a(ahVar, j);
            if (!z8) {
                int iW4 = ahVar.w();
                java.util.ArrayList arrayList = new java.util.ArrayList(iW4);
                for (int i = 0; i < iW4; i++) {
                    int iW5 = ahVar.w();
                    long jA2 = !z10 ? com.applovin.impl.Cdo.a(ahVar, j) : androidx.media3.common.C.TIME_UNSET;
                    arrayList.add(new com.applovin.impl.uk.b(iW5, jA2, hoVar.b(jA2), null));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jW = ahVar.w();
                boolean z11 = (128 & jW) != 0;
                jY = ((((jW & 1) << 32) | ahVar.y()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jY = androidx.media3.common.C.TIME_UNSET;
            }
            iC = ahVar.C();
            z4 = z8;
            iW = ahVar.w();
            iW2 = ahVar.w();
            list = listEmptyList;
            long j4 = jA;
            z3 = z5;
            j3 = jY;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new com.applovin.impl.uk(jY2, z6, z, z4, z2, j2, hoVar.b(j2), list, z3, j3, iC, iW, iW2);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1407a;
        public final long b;
        public final long c;

        public static com.applovin.impl.uk.b a(android.os.Parcel parcel) {
            return new com.applovin.impl.uk.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private b(int i, long j, long j2) {
            this.f1407a = i;
            this.b = j;
            this.c = j2;
        }

        public void b(android.os.Parcel parcel) {
            parcel.writeInt(this.f1407a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        /* synthetic */ b(int i, long j, long j2, com.applovin.impl.uk.a aVar) {
            this(i, j, j2);
        }
    }

    private uk(android.os.Parcel parcel) {
        this.f1406a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f = parcel.readByte() == 1;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(com.applovin.impl.uk.b.a(parcel));
        }
        this.i = java.util.Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.f1406a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((com.applovin.impl.uk.b) this.i.get(i2)).b(parcel);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.uk[] newArray(int i) {
            return new com.applovin.impl.uk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.uk createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.uk(parcel, null);
        }
    }

    /* synthetic */ uk(android.os.Parcel parcel, com.applovin.impl.uk.a aVar) {
        this(parcel);
    }
}
