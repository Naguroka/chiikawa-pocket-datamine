package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class jk implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.jk> CREATOR = new com.applovin.impl.jk.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f928a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SlowMotion: segments=" + this.f928a;
    }

    public static final class b implements android.os.Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f929a;
        public final long b;
        public final int c;
        public static final java.util.Comparator d = new java.util.Comparator() { // from class: com.applovin.impl.jk$b$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.impl.jk.b.a((com.applovin.impl.jk.b) obj, (com.applovin.impl.jk.b) obj2);
            }
        };
        public static final android.os.Parcelable.Creator<com.applovin.impl.jk.b> CREATOR = new com.applovin.impl.jk.b.a();

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(com.applovin.impl.jk.b bVar, com.applovin.impl.jk.b bVar2) {
            return com.applovin.impl.y3.e().a(bVar.f929a, bVar2.f929a).a(bVar.b, bVar2.b).a(bVar.c, bVar2.c).d();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public b(long j, long j2, int i) {
            com.applovin.impl.b1.a(j < j2);
            this.f929a = j;
            this.b = j2;
            this.c = i;
        }

        public java.lang.String toString() {
            return com.applovin.impl.xp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", java.lang.Long.valueOf(this.f929a), java.lang.Long.valueOf(this.b), java.lang.Integer.valueOf(this.c));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.jk.b.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.jk.b bVar = (com.applovin.impl.jk.b) obj;
            return this.f929a == bVar.f929a && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return com.applovin.exoplayer2.common.base.Objects.hashCode(java.lang.Long.valueOf(this.f929a), java.lang.Long.valueOf(this.b), java.lang.Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.f929a);
            parcel.writeLong(this.b);
            parcel.writeInt(this.c);
        }

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.applovin.impl.jk.b createFromParcel(android.os.Parcel parcel) {
                return new com.applovin.impl.jk.b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.applovin.impl.jk.b[] newArray(int i) {
                return new com.applovin.impl.jk.b[i];
            }
        }
    }

    public jk(java.util.List list) {
        this.f928a = list;
        com.applovin.impl.b1.a(!a(list));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.jk.class != obj.getClass()) {
            return false;
        }
        return this.f928a.equals(((com.applovin.impl.jk) obj).f928a);
    }

    public int hashCode() {
        return this.f928a.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.f928a);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.jk createFromParcel(android.os.Parcel parcel) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            parcel.readList(arrayList, com.applovin.impl.jk.b.class.getClassLoader());
            return new com.applovin.impl.jk(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.jk[] newArray(int i) {
            return new com.applovin.impl.jk[i];
        }
    }

    private static boolean a(java.util.List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((com.applovin.impl.jk.b) list.get(0)).b;
        for (int i = 1; i < list.size(); i++) {
            if (((com.applovin.impl.jk.b) list.get(i)).f929a < j) {
                return true;
            }
            j = ((com.applovin.impl.jk.b) list.get(i)).b;
        }
        return false;
    }
}
