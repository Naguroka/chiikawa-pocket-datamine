package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wk extends com.applovin.impl.sk {
    public static final android.os.Parcelable.Creator<com.applovin.impl.wk> CREATOR = new com.applovin.impl.wk.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f1469a;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1471a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final java.util.List f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long j, boolean z, boolean z2, boolean z3, java.util.List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f1471a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = java.util.Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.wk.c b(com.applovin.impl.ah ahVar) {
            java.util.ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int iW;
            boolean z3;
            boolean z4;
            long jY;
            long jY2 = ahVar.y();
            boolean z5 = (ahVar.w() & 128) != 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = androidx.media3.common.C.TIME_UNSET;
                z2 = false;
                j2 = androidx.media3.common.C.TIME_UNSET;
                i = 0;
                i2 = 0;
                iW = 0;
                z3 = false;
            } else {
                int iW2 = ahVar.w();
                boolean z6 = (iW2 & 128) != 0;
                boolean z7 = (iW2 & 64) != 0;
                boolean z8 = (iW2 & 32) != 0;
                long jY3 = z7 ? ahVar.y() : androidx.media3.common.C.TIME_UNSET;
                if (!z7) {
                    int iW3 = ahVar.w();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(iW3);
                    for (int i3 = 0; i3 < iW3; i3++) {
                        arrayList3.add(new com.applovin.impl.wk.b(ahVar.w(), ahVar.y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jW = ahVar.w();
                    boolean z9 = (128 & jW) != 0;
                    jY = ((((jW & 1) << 32) | ahVar.y()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jY = androidx.media3.common.C.TIME_UNSET;
                }
                int iC = ahVar.C();
                int iW4 = ahVar.w();
                z3 = z7;
                iW = ahVar.w();
                j2 = jY;
                arrayList = arrayList2;
                long j3 = jY3;
                i = iC;
                i2 = iW4;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new com.applovin.impl.wk.c(jY2, z5, z, z3, arrayList, j, z2, j2, i, i2, iW);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.wk.c b(android.os.Parcel parcel) {
            return new com.applovin.impl.wk.c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(android.os.Parcel parcel) {
            parcel.writeLong(this.f1471a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((com.applovin.impl.wk.b) this.f.get(i)).c(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        private c(android.os.Parcel parcel) {
            this.f1471a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(com.applovin.impl.wk.b.b(parcel));
            }
            this.f = java.util.Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1470a;
        public final long b;

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.wk.b b(android.os.Parcel parcel) {
            return new com.applovin.impl.wk.b(parcel.readInt(), parcel.readLong());
        }

        private b(int i, long j) {
            this.f1470a = i;
            this.b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(android.os.Parcel parcel) {
            parcel.writeInt(this.f1470a);
            parcel.writeLong(this.b);
        }

        /* synthetic */ b(int i, long j, com.applovin.impl.wk.a aVar) {
            this(i, j);
        }
    }

    private wk(android.os.Parcel parcel) {
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(com.applovin.impl.wk.c.b(parcel));
        }
        this.f1469a = java.util.Collections.unmodifiableList(arrayList);
    }

    static com.applovin.impl.wk a(com.applovin.impl.ah ahVar) {
        int iW = ahVar.w();
        java.util.ArrayList arrayList = new java.util.ArrayList(iW);
        for (int i = 0; i < iW; i++) {
            arrayList.add(com.applovin.impl.wk.c.b(ahVar));
        }
        return new com.applovin.impl.wk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int size = this.f1469a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((com.applovin.impl.wk.c) this.f1469a.get(i2)).c(parcel);
        }
    }

    /* synthetic */ wk(android.os.Parcel parcel, com.applovin.impl.wk.a aVar) {
        this(parcel);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.wk[] newArray(int i) {
            return new com.applovin.impl.wk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.wk createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.wk(parcel, null);
        }
    }

    private wk(java.util.List list) {
        this.f1469a = java.util.Collections.unmodifiableList(list);
    }
}
