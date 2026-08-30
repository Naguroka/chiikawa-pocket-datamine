package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class af implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.applovin.impl.af> CREATOR = new com.applovin.impl.af.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.af.b[] f616a;

    public interface b extends android.os.Parcelable {
        default void a(com.applovin.impl.ud.b bVar) {
        }

        default byte[] a() {
            return null;
        }

        default com.applovin.impl.e9 b() {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "entries=" + java.util.Arrays.toString(this.f616a);
    }

    af(android.os.Parcel parcel) {
        this.f616a = new com.applovin.impl.af.b[parcel.readInt()];
        int i = 0;
        while (true) {
            com.applovin.impl.af.b[] bVarArr = this.f616a;
            if (i >= bVarArr.length) {
                return;
            }
            bVarArr[i] = (com.applovin.impl.af.b) parcel.readParcelable(com.applovin.impl.af.b.class.getClassLoader());
            i++;
        }
    }

    public int c() {
        return this.f616a.length;
    }

    public com.applovin.impl.af a(com.applovin.impl.af.b... bVarArr) {
        return bVarArr.length == 0 ? this : new com.applovin.impl.af((com.applovin.impl.af.b[]) com.applovin.impl.xp.a((java.lang.Object[]) this.f616a, (java.lang.Object[]) bVarArr));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.af.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f616a, ((com.applovin.impl.af) obj).f616a);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f616a);
    }

    public af(java.util.List list) {
        this.f616a = (com.applovin.impl.af.b[]) list.toArray(new com.applovin.impl.af.b[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.f616a.length);
        for (com.applovin.impl.af.b bVar : this.f616a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.af[] newArray(int i) {
            return new com.applovin.impl.af[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.af createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.af(parcel);
        }
    }

    public af(com.applovin.impl.af.b... bVarArr) {
        this.f616a = bVarArr;
    }

    public com.applovin.impl.af a(com.applovin.impl.af afVar) {
        return afVar == null ? this : a(afVar.f616a);
    }

    public com.applovin.impl.af.b a(int i) {
        return this.f616a[i];
    }
}
