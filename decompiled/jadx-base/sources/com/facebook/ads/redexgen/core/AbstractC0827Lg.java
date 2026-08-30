package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0827Lg {
    public static java.lang.String[] A00 = {"tfO9EFprOidg15dbWOFNM3pJ9DH12nbd", "iQi3WSSmt7paFVU78YsoSc5vRnrGV8FY", "eVwJkLn66NX0DyzCMNkg9H8sjiBrfui3", "LdqoMHLm0q63TozEkFqOQv3OaH4JH8Wu", "cJBmiPiaGEEsJOt", "9KYT0ysg0qk30iHsbz0zWhVwZhq8iyG9", "m7p", "Jc"};

    public static java.io.Serializable A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        java.lang.String[] strArr = A00;
        if (strArr[5].charAt(1) == strArr[2].charAt(1)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A00;
        strArr2[0] = "ayJKSMoIzNcUU8Q19fzYI1UxLR6MMgkq";
        strArr2[3] = "KX8CQKcPRjr3ALAXmnNmxPsf5ZezVoBn";
        parcelObtain.setDataPosition(0);
        java.io.Serializable serializable = parcelObtain.readSerializable();
        parcelObtain.recycle();
        return serializable;
    }

    public static byte[] A01(java.io.Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeSerializable(serializable);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
