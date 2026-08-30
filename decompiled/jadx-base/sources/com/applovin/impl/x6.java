package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class x6 implements java.util.Comparator, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.applovin.impl.x6> CREATOR = new com.applovin.impl.x6.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.x6.b[] f1494a;
    private int b;
    public final java.lang.String c;
    public final int d;

    public static final class b implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.applovin.impl.x6.b> CREATOR = new com.applovin.impl.x6.b.a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1495a;
        public final java.util.UUID b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final byte[] f;

        public boolean a(java.util.UUID uuid) {
            return com.applovin.impl.t2.f1347a.equals(this.b) || uuid.equals(this.b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public com.applovin.impl.x6.b a(byte[] bArr) {
            return new com.applovin.impl.x6.b(this.b, this.c, this.d, bArr);
        }

        b(android.os.Parcel parcel) {
            this.b = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
            this.f = parcel.createByteArray();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.applovin.impl.x6.b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            com.applovin.impl.x6.b bVar = (com.applovin.impl.x6.b) obj;
            return com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) bVar.c) && com.applovin.impl.xp.a((java.lang.Object) this.d, (java.lang.Object) bVar.d) && com.applovin.impl.xp.a(this.b, bVar.b) && java.util.Arrays.equals(this.f, bVar.f);
        }

        public int hashCode() {
            if (this.f1495a == 0) {
                int iHashCode = this.b.hashCode() * 31;
                java.lang.String str = this.c;
                this.f1495a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + java.util.Arrays.hashCode(this.f);
            }
            return this.f1495a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.f);
        }

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.applovin.impl.x6.b[] newArray(int i) {
                return new com.applovin.impl.x6.b[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.applovin.impl.x6.b createFromParcel(android.os.Parcel parcel) {
                return new com.applovin.impl.x6.b(parcel);
            }
        }

        public b(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            this.b = (java.util.UUID) com.applovin.impl.b1.a(uuid);
            this.c = str;
            this.d = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) str2);
            this.f = bArr;
        }

        public b(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    x6(android.os.Parcel parcel) {
        this.c = parcel.readString();
        com.applovin.impl.x6.b[] bVarArr = (com.applovin.impl.x6.b[]) com.applovin.impl.xp.a(parcel.createTypedArray(com.applovin.impl.x6.b.CREATOR));
        this.f1494a = bVarArr;
        this.d = bVarArr.length;
    }

    public com.applovin.impl.x6 a(java.lang.String str) {
        return com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) str) ? this : new com.applovin.impl.x6(str, false, this.f1494a);
    }

    public int hashCode() {
        if (this.b == 0) {
            java.lang.String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.f1494a);
        }
        return this.b;
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.x6.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.x6 x6Var = (com.applovin.impl.x6) obj;
        return com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) x6Var.c) && java.util.Arrays.equals(this.f1494a, x6Var.f1494a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.f1494a, 0);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.x6[] newArray(int i) {
            return new com.applovin.impl.x6[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.x6 createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.x6(parcel);
        }
    }

    private x6(java.lang.String str, boolean z, com.applovin.impl.x6.b... bVarArr) {
        this.c = str;
        bVarArr = z ? (com.applovin.impl.x6.b[]) bVarArr.clone() : bVarArr;
        this.f1494a = bVarArr;
        this.d = bVarArr.length;
        java.util.Arrays.sort(bVarArr, this);
    }

    public com.applovin.impl.x6.b a(int i) {
        return this.f1494a[i];
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.applovin.impl.x6.b bVar, com.applovin.impl.x6.b bVar2) {
        java.util.UUID uuid = com.applovin.impl.t2.f1347a;
        if (uuid.equals(bVar.b)) {
            return uuid.equals(bVar2.b) ? 0 : 1;
        }
        return bVar.b.compareTo(bVar2.b);
    }

    public x6(java.lang.String str, com.applovin.impl.x6.b... bVarArr) {
        this(str, true, bVarArr);
    }

    public x6(java.util.List list) {
        this(null, false, (com.applovin.impl.x6.b[]) list.toArray(new com.applovin.impl.x6.b[0]));
    }

    public x6(com.applovin.impl.x6.b... bVarArr) {
        this(null, bVarArr);
    }
}
