package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ua implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.ua> CREATOR = new com.applovin.impl.ua.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1395a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean f;
    public final int g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.f1395a + ", metadataInterval=" + this.g;
    }

    public static com.applovin.impl.ua a(java.util.Map map) {
        boolean z;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean zEquals;
        int i2;
        int i3;
        java.util.List list = (java.util.List) map.get("icy-br");
        boolean z2 = true;
        int i4 = -1;
        if (list != null) {
            java.lang.String str4 = (java.lang.String) list.get(0);
            try {
                i3 = java.lang.Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z = true;
                    i = i3;
                } else {
                    try {
                        com.applovin.impl.oc.d("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i = -1;
                    } catch (java.lang.NumberFormatException unused) {
                        com.applovin.impl.oc.d("IcyHeaders", "Invalid bitrate header: " + str4);
                        z = false;
                        i = i3;
                    }
                }
            } catch (java.lang.NumberFormatException unused2) {
                i3 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        java.util.List list2 = (java.util.List) map.get("icy-genre");
        if (list2 != null) {
            str = (java.lang.String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        java.util.List list3 = (java.util.List) map.get("icy-name");
        if (list3 != null) {
            str2 = (java.lang.String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        java.util.List list4 = (java.util.List) map.get("icy-url");
        if (list4 != null) {
            str3 = (java.lang.String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        java.util.List list5 = (java.util.List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((java.lang.String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        java.util.List list6 = (java.util.List) map.get("icy-metaint");
        if (list6 != null) {
            java.lang.String str5 = (java.lang.String) list6.get(0);
            try {
                int i5 = java.lang.Integer.parseInt(str5);
                if (i5 > 0) {
                    i2 = i5;
                } else {
                    try {
                        com.applovin.impl.oc.d("IcyHeaders", "Invalid metadata interval: " + str5);
                    } catch (java.lang.NumberFormatException unused3) {
                        i4 = i5;
                        com.applovin.impl.oc.d("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                    z2 = z;
                    i2 = i4;
                }
            } catch (java.lang.NumberFormatException unused4) {
            }
        } else {
            z2 = z;
            i2 = i4;
        }
        if (z2) {
            return new com.applovin.impl.ua(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    public ua(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2) {
        com.applovin.impl.b1.a(i2 == -1 || i2 > 0);
        this.f1395a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = z;
        this.g = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.ua.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.ua uaVar = (com.applovin.impl.ua) obj;
        return this.f1395a == uaVar.f1395a && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) uaVar.b) && com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) uaVar.c) && com.applovin.impl.xp.a((java.lang.Object) this.d, (java.lang.Object) uaVar.d) && this.f == uaVar.f && this.g == uaVar.g;
    }

    public int hashCode() {
        int i = (this.f1395a + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.f1395a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        com.applovin.impl.xp.a(parcel, this.f);
        parcel.writeInt(this.g);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.ua[] newArray(int i) {
            return new com.applovin.impl.ua[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.ua createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.ua(parcel);
        }
    }

    ua(android.os.Parcel parcel) {
        this.f1395a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = com.applovin.impl.xp.a(parcel);
        this.g = parcel.readInt();
    }
}
