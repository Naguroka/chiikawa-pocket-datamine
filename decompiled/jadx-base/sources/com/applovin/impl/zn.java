package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class zn extends com.applovin.impl.xa {
    public static final android.os.Parcelable.Creator<com.applovin.impl.zn> CREATOR = new com.applovin.impl.zn.a();
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // com.applovin.impl.xa
    public java.lang.String toString() {
        return this.f1498a + ": description=" + this.b + ": value=" + this.c;
    }

    zn(android.os.Parcel parcel) {
        super((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString()));
        this.b = parcel.readString();
        this.c = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) parcel.readString());
    }

    public zn(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.zn.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.zn znVar = (com.applovin.impl.zn) obj;
        return com.applovin.impl.xp.a((java.lang.Object) this.f1498a, (java.lang.Object) znVar.f1498a) && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) znVar.b) && com.applovin.impl.xp.a((java.lang.Object) this.c, (java.lang.Object) znVar.c);
    }

    public int hashCode() {
        int iHashCode = (this.f1498a.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f1498a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.zn[] newArray(int i) {
            return new com.applovin.impl.zn[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.zn createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.zn(parcel);
        }
    }

    private static java.util.List a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.applovin.impl.af.b
    public void a(com.applovin.impl.ud.b bVar) {
        java.lang.String str = this.f1498a;
        str.hashCode();
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 21;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    bVar.b(this.c);
                    break;
                case 1:
                case 11:
                    bVar.e(this.c);
                    break;
                case 2:
                case 12:
                    bVar.d(java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.c.substring(2, 4)))).c(java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.c.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.c(this.c);
                    break;
                case 4:
                case 18:
                    bVar.a(this.c);
                    break;
                case 5:
                case 19:
                    bVar.f(this.c);
                    break;
                case 6:
                case 20:
                    java.lang.String[] strArrA = com.applovin.impl.xp.a(this.c, "/");
                    bVar.k(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrA[0]))).j(strArrA.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrA[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.k(this.c);
                    break;
                case 8:
                case 15:
                    bVar.l(this.c);
                    break;
                case 9:
                case 21:
                    bVar.e(java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.c)));
                    break;
                case 13:
                    java.util.List listA = a(this.c);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.c((java.lang.Integer) listA.get(2));
                            }
                        }
                        bVar.d((java.lang.Integer) listA.get(1));
                    }
                    bVar.e((java.lang.Integer) listA.get(0));
                    break;
                case 14:
                    java.util.List listA2 = a(this.c);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.f((java.lang.Integer) listA2.get(2));
                            }
                        }
                        bVar.g((java.lang.Integer) listA2.get(1));
                    }
                    bVar.h((java.lang.Integer) listA2.get(0));
                    break;
            }
        } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused) {
        }
    }
}
