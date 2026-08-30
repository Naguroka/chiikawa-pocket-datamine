package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C6N {
    public static java.lang.String A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"jP5DLqFPT2uLfDhjwGtyJ", "b2Kf1V0V33xxSFNxYAUwKzTnuvA5CTmH", "utws2CXgYjyIi4p9N5JN7AtJgUuBwVKL", "iHkd", "J1QCfiNfulUMnwHMV72QByuh5OrpyBC4", "Ilbx2HAT56j3G7gTz5Evg9nZeC6mk12l", "SrkakodA8D", "LiqB"};
    public static final java.lang.String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C6F A02(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.Object objA00;
        java.lang.reflect.Method methodA02;
        java.lang.Object objA01;
        java.lang.reflect.Method methodA03 = com.facebook.ads.redexgen.core.C6O.A02(A00, A04(257, 29, 2), android.content.Context.class);
        if (methodA03 == null || (objA00 = com.facebook.ads.redexgen.core.C6O.A00(null, methodA03, c7j)) == null || ((java.lang.Integer) objA00).intValue() != 0 || (methodA02 = com.facebook.ads.redexgen.core.C6O.A02(A04(65, 57, 83), A04(232, 20, 98), android.content.Context.class)) == null || (objA01 = com.facebook.ads.redexgen.core.C6O.A00(null, methodA02, c7j)) == null) {
            return null;
        }
        java.lang.reflect.Method methodA01 = com.facebook.ads.redexgen.core.C6O.A01(objA01.getClass(), A04(252, 5, 124), new java.lang.Class[0]);
        java.lang.reflect.Method methodA04 = com.facebook.ads.redexgen.core.C6O.A01(objA01.getClass(), A04(286, 24, 126), new java.lang.Class[0]);
        if (methodA01 == null || methodA04 == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.C6O.A00(objA01, methodA01, new java.lang.Object[0]);
        java.lang.Boolean bool = (java.lang.Boolean) com.facebook.ads.redexgen.core.C6O.A00(objA01, methodA04, new java.lang.Object[0]);
        if (str != null) {
            return new com.facebook.ads.redexgen.core.C6F(str, bool != null && bool.booleanValue(), com.facebook.ads.redexgen.core.C6E.A06);
        }
        return null;
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 90);
            if (A02[7].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "KHgMerLXVce8bYpnKoYEO";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{102, 68, 75, 75, 74, 81, 5, 66, 64, 81, 5, 68, 65, 83, 64, 87, 81, 76, 86, 76, 75, 66, 5, 76, 75, 67, 74, 5, 74, 75, 5, 72, 68, 76, 75, 5, 81, 77, 87, 64, 68, 65, 11, 88, 84, 86, 21, 92, 84, 84, 92, 87, 94, 21, 90, 85, 95, 73, 84, 82, 95, 21, 92, 86, 72, 106, 102, 100, 39, 110, 102, 102, 110, 101, 108, 39, 104, 103, 109, 123, 102, 96, 109, 39, 110, 100, 122, 39, 104, 109, 122, 39, 96, 109, 108, 103, 125, 96, 111, 96, 108, 123, 39, 72, 109, 127, 108, 123, 125, 96, 122, 96, 103, 110, 64, 109, 74, 101, 96, 108, 103, 125, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, 55, 42, 44, 33, 107, 34, 40, 54, 107, 36, 33, 54, 107, 44, 33, 32, 43, 49, 44, 35, 44, 32, 55, 107, 54, 32, 55, 51, 44, 38, 32, 107, 22, 17, 4, 23, 17, 53, 57, 59, 120, 49, 57, 57, 49, 58, 51, 120, 55, 56, 50, 36, 57, okio.Utf8.REPLACEMENT_BYTE, 50, 120, 49, 59, 37, 120, 53, 57, 59, 59, 57, 56, 120, 17, 57, 57, 49, 58, 51, 6, 58, 55, 47, 5, 51, 36, 32, okio.Utf8.REPLACEMENT_BYTE, 53, 51, 37, 3, 34, okio.Utf8.REPLACEMENT_BYTE, 58, 116, 118, 125, 118, 97, 122, 112, 95, 93, 76, 121, 92, 78, 93, 74, 76, 81, 75, 81, 86, 95, 113, 92, 113, 86, 94, 87, 65, 67, 82, 111, 66, 49, 43, 31, 55, 55, okio.Utf8.REPLACEMENT_BYTE, 52, kotlin.io.encoding.Base64.padSymbol, 8, 52, 57, 33, 11, kotlin.io.encoding.Base64.padSymbol, 42, 46, 49, 59, kotlin.io.encoding.Base64.padSymbol, 43, 25, 46, 57, 49, 52, 57, 58, 52, kotlin.io.encoding.Base64.padSymbol, 77, 87, 104, 77, 73, 77, 80, 101, 64, 112, 86, 69, 71, 79, 77, 74, 67, 97, 74, 69, 70, 72, 65, 64};
    }

    static {
        A05();
        A03 = com.facebook.ads.redexgen.core.C6F.class.getSimpleName();
        A00 = A04(org.objectweb.asm.Opcodes.LRETURN, 52, 12);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public static com.facebook.ads.redexgen.core.C6F A00(com.facebook.ads.redexgen.core.C7j c7j) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.facebook.ads.redexgen.core.C6F c6fA01 = A01(c7j);
            if (c6fA01 != null) {
                boolean zIsEmpty = android.text.TextUtils.isEmpty(c6fA01.A03());
                if (A02[5].charAt(3) != 'x') {
                    throw new java.lang.RuntimeException();
                }
                A02[0] = "hh0RZKDdPPlAkARzc3g59";
                if (zIsEmpty) {
                    c6fA01 = A02(c7j);
                }
            } else {
                c6fA01 = A02(c7j);
            }
            if (c6fA01 == null || android.text.TextUtils.isEmpty(c6fA01.A03())) {
                return A03(c7j);
            }
            return c6fA01;
        }
        throw new java.lang.IllegalStateException(A04(0, 43, 127));
    }

    public static com.facebook.ads.redexgen.core.C6F A01(com.facebook.ads.redexgen.core.C7j c7j) {
        com.facebook.ads.redexgen.core.C7n adId = c7j.A04().A8D();
        if (adId != null) {
            return new com.facebook.ads.redexgen.core.C6F(adId.getId(), adId.A9W(), com.facebook.ads.redexgen.core.C6E.A02);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static com.facebook.ads.redexgen.core.C6F A03(com.facebook.ads.redexgen.core.C7j c7j) {
        com.facebook.ads.redexgen.core.C6M c6m = new com.facebook.ads.redexgen.core.C6M();
        android.content.Intent intent = new android.content.Intent(A04(122, 51, 31));
        intent.setPackage(A04(43, 22, 97));
        if (c7j.bindService(intent, c6m, 1)) {
            try {
                final android.os.IBinder iBinderA02 = c6m.A02();
                ?? r0 = new android.os.IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static java.lang.String[] A02 = {"CGAQp5QWLLSg2Up0KS3Xu0sm6KBD8ljy", "Yp64XCOUL3mdw2EQzsnOwJCP4iXogchF", "0bXbaFV76JbdIHYzvJ", "7kYBXtp0pJ6J2QiQOtBXkhx4Mjb4MhNb", "Pqj6DcWbIXVdg5nys55lljt7m2mFJmbz", "gqs8Z9zjV1B", "yb2LGnYLr1jAVzG6", "kQWFHy19WQfgSFrPEiRm4PYEBX"};
                    public android.os.IBinder A00;

                    public static java.lang.String A00(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{100, 104, 106, 41, 96, 104, 104, 96, 107, 98, 41, 102, 105, 99, 117, 104, 110, 99, 41, 96, 106, 116, 41, 102, 99, 116, 41, 110, 99, 98, 105, 115, 110, 97, 110, 98, 117, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 78, 70, 99, 113, 98, 117, 115, 110, 116, 110, 105, 96, 78, 99, 84, 98, 117, 113, 110, 100, 98};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final java.lang.String A02() throws android.os.RemoteException {
                        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            java.lang.String string = parcelObtain2.readString();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            if (string != null) {
                                return string;
                            }
                            if (A02[2].length() == 16) {
                                throw new java.lang.RuntimeException();
                            }
                            A02[3] = "0APG8T86KeB7s6esCzOnlOcV6mb8f0OX";
                            return A00(0, 0, 82);
                        } catch (java.lang.Throwable th) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    public final boolean A03() throws android.os.RemoteException {
                        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                            boolean z = true;
                            parcelObtain.writeInt(1);
                            this.A00.transact(2, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final android.os.IBinder asBinder() {
                        return this.A00;
                    }
                };
                com.facebook.ads.redexgen.core.C6F c6f = new com.facebook.ads.redexgen.core.C6F(r0.A02(), r0.A03(), com.facebook.ads.redexgen.core.C6E.A07);
                c7j.unbindService(c6m);
                return c6f;
            } catch (java.lang.Throwable th) {
                try {
                    c7j.A07().AA0(A04(225, 7, 73), com.facebook.ads.redexgen.core.C8E.A1Q, new com.facebook.ads.redexgen.core.C8F(th));
                } finally {
                    c7j.unbindService(c6m);
                }
            }
        }
        return null;
    }
}
