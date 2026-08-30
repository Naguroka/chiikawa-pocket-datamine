package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04776g {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final java.lang.String A04;
    public static volatile com.facebook.ads.redexgen.core.C04776g A05;
    public final com.facebook.ads.redexgen.core.C1198Zr A00;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C04746d> A01 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private android.graphics.Bitmap A02(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C04746d c04746d, java.lang.String str) throws java.lang.Throwable {
        android.graphics.Bitmap bitmapA01;
        java.lang.String str2 = c04746d.A07;
        int i = c04746d.A03;
        int i2 = c04746d.A04;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.IOException e = null;
        java.lang.String strA08 = A08(223, 9, 68);
        boolean zStartsWith = str2.startsWith(strA08);
        java.lang.String strA09 = A08(239, 22, 119);
        if (zStartsWith || str2.startsWith(strA09)) {
            java.lang.String strSubstring = str2.startsWith(strA08) ? str2.substring(strA08.length()) : str2.substring(strA09.length());
            java.io.InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = this.A00.getAssets().open(strSubstring);
                    if (A0C(i, i2)) {
                        try {
                            bitmapA01 = com.facebook.ads.redexgen.core.AbstractC04816k.A01(inputStreamOpen, i, i2);
                        } catch (java.io.IOException e2) {
                            e = e2;
                            A0B(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (java.lang.OutOfMemoryError e3) {
                            e = e3;
                            A0B(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            throw th;
                        }
                    } else {
                        bitmapA01 = android.graphics.BitmapFactory.decodeStream(inputStreamOpen);
                    }
                    if (inputStreamOpen != null) {
                        A0A(inputStreamOpen);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException e4) {
                e = e4;
            } catch (java.lang.OutOfMemoryError e5) {
                e = e5;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } else if (A0C(i, i2)) {
            try {
                bitmapA01 = A05(str2, i, i2);
            } catch (java.io.IOException e6) {
                e = e6;
                A0B(e);
                bitmapA01 = A03(str2);
            }
        } else {
            bitmapA01 = A03(str2);
        }
        java.lang.String string = e != null ? e.toString() : null;
        if (bitmapA01 == null) {
            com.facebook.ads.redexgen.core.C04796i.A03(c7j, c04746d, str, com.facebook.ads.redexgen.core.C04796i.A03, string, null, null);
            return null;
        }
        long jA00 = A00(str2, bitmapA01);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        if (jA00 > 0) {
            com.facebook.ads.redexgen.core.C04796i.A03(c7j, c04746d, str, com.facebook.ads.redexgen.core.C04796i.A02, string, java.lang.Long.valueOf(jA00), java.lang.Long.valueOf(jCurrentTimeMillis2));
            return bitmapA01;
        }
        com.facebook.ads.redexgen.core.C04796i.A03(c7j, c04746d, str, com.facebook.ads.redexgen.core.C04796i.A01, string, null, null);
        if (com.facebook.ads.redexgen.core.C0762Im.A0x(c7j)) {
            return null;
        }
        return bitmapA01;
    }

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{3, 4, 119, 41, 55, 62, 58, 25, 28, 88, 23, 13, 12, 8, 13, 12, 88, 28, 29, 11, 12, 17, 22, 25, 12, 17, 23, 22, 88, 80, 30, 17, 20, 29, 69, 122, 81, 76, 85, 89, 72, 24, 75, 81, 66, 93, 24, 93, 64, 91, 93, 93, 92, 75, 24, 85, 89, 64, 24, 75, 81, 66, 93, 24, 94, 87, 74, 24, 75, 76, 87, 74, 89, 95, 93, 2, 24, 18, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, 127, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, okio.Utf8.REPLACEMENT_BYTE, 36, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 127, 125, 90, 82, 87, 94, 95, 27, 79, 84, 27, 88, 84, 75, 66, 27, 87, 84, 88, 90, 87, 27, 82, 86, 90, 92, 94, 27, 82, 85, 79, 84, 27, 88, 90, 88, 83, 94, 27, 19, 78, 73, 87, 6, 38, 29, 18, 17, 31, 22, 83, 7, 28, 83, 4, 1, 26, 7, 22, 83, 17, 26, 7, 30, 18, 3, 83, 7, 28, 83, 21, 26, 31, 22, 83, 91, 6, 1, 31, 78, 70, 125, 114, 113, 127, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, kotlin.io.encoding.Base64.padSymbol, 40, 40, 40, 85, 90, 95, 86, 9, 28, 28, 82, 93, 88, 81, 14, 27, 27, 27, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, 64, 27, 115, 119, 123, 125, 127, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A04 = com.facebook.ads.redexgen.core.C04776g.class.getSimpleName();
    }

    public C04776g(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = c1198Zr;
    }

    private int A00(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String strA08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        java.io.File file = new java.io.File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        java.io.ByteArrayOutputStream bOut = null;
        java.io.FileOutputStream fileOutputStream = null;
        try {
            bOut = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= com.facebook.ads.redexgen.core.C0762Im.A0G(this.A00)) {
                A0B(new java.lang.Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new java.io.FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (java.lang.OutOfMemoryError e) {
            A0B(e);
            android.util.Log.e(A04, A08(org.objectweb.asm.Opcodes.INVOKESTATIC, 39, 80), e);
            return 0;
        } catch (java.io.FileNotFoundException e2) {
            android.util.Log.e(A04, A08(6, 29, 59) + file.getPath() + strA08, e2);
            A0B(e2);
            return 0;
        } catch (java.io.IOException e3) {
            A0B(e3);
            android.util.Log.e(A04, A08(org.objectweb.asm.Opcodes.LCMP, 36, 48) + str + strA08, e3);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    private final android.graphics.Bitmap A01(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C04746d c04746d, int i, int i2, java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C04796i.A06(c7j) && A08(266, 4, 37).equals(str)) {
            this.A01.put(c04746d.A07, c04746d);
        }
        java.lang.String str2 = c04746d.A07;
        com.facebook.ads.redexgen.core.C04786h c04786h = new com.facebook.ads.redexgen.core.C04786h(c04746d.A05, c04746d.A06, A08(261, 5, 89), str, str2);
        java.io.File fileA07 = A07(this.A00);
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(str2.hashCode());
        java.lang.String url = A08(2, 4, 26);
        java.io.File file = new java.io.File(fileA07, sbAppend.append(url).toString());
        if (!file.exists()) {
            com.facebook.ads.redexgen.core.C04796i.A04(c7j, c04786h, false);
            java.lang.String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A03[4].charAt(22) == 'U') {
                    throw new java.lang.RuntimeException();
                }
                A03[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                java.lang.String url3 = A08(239, 22, 119);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i2, i);
                }
            }
            return A02(c7j, c04746d, str);
        }
        com.facebook.ads.redexgen.core.C04796i.A04(c7j, c04786h, true);
        try {
            if (A0C(i2, i)) {
                return com.facebook.ads.redexgen.core.AbstractC04816k.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            java.lang.String url4 = file.getCanonicalPath();
            return android.graphics.BitmapFactory.decodeFile(url4);
        } catch (java.io.IOException e) {
            A0B(e);
            return null;
        }
    }

    private android.graphics.Bitmap A03(java.lang.String str) {
        byte[] bArrA6W;
        com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpAER = com.facebook.ads.redexgen.core.S8.A00(this.A00).AER(str, new com.facebook.ads.redexgen.core.S4());
        if (interfaceC0992RpAER == null || (bArrA6W = interfaceC0992RpAER.A6W()) == null) {
            return null;
        }
        int length = bArrA6W.length;
        if (A03[4].charAt(22) == 'U') {
            throw new java.lang.RuntimeException();
        }
        A03[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return android.graphics.BitmapFactory.decodeByteArray(bArrA6W, 0, length);
    }

    private android.graphics.Bitmap A04(java.lang.String str, int i, int i2) {
        android.graphics.Bitmap bitmapDecodeStream;
        try {
            boolean zA0C = A0C(i, i2);
            java.lang.String strA08 = A08(232, 7, 112);
            if (zA0C) {
                bitmapDecodeStream = com.facebook.ads.redexgen.core.AbstractC04816k.A02(str.substring(strA08.length()), i, i2, this.A00);
            } else {
                bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(new java.io.FileInputStream(str.substring(strA08.length())), null, null);
            }
            int iA00 = A00(str, bitmapDecodeStream);
            if (com.facebook.ads.redexgen.core.C0762Im.A0x(this.A00) && iA00 <= 0) {
                return null;
            }
            return bitmapDecodeStream;
        } catch (java.io.IOException e) {
            android.util.Log.e(A04, A08(105, 43, 120) + str + A08(0, 2, 105), e);
        }
    }

    private android.graphics.Bitmap A05(java.lang.String str, int i, int i2) throws java.io.IOException {
        java.net.URL urlObj = new java.net.URL(str);
        java.net.HttpURLConnection connection = (java.net.HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        java.io.InputStream inputStream = connection.getInputStream();
        android.graphics.Bitmap bitmapA01 = com.facebook.ads.redexgen.core.AbstractC04816k.A01(inputStream, i, i2);
        A0A(inputStream);
        return bitmapA01;
    }

    public static com.facebook.ads.redexgen.core.C04776g A06(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A05 == null) {
            synchronized (com.facebook.ads.redexgen.core.C04776g.class) {
                if (A05 == null) {
                    A05 = new com.facebook.ads.redexgen.core.C04776g(c1198Zr);
                }
            }
        }
        return A05;
    }

    public static java.io.File A07(com.facebook.ads.redexgen.core.C7j c7j) {
        return c7j.getCacheDir();
    }

    public static void A0A(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    private void A0B(java.lang.Throwable th) {
        java.lang.String strA08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A07().AA0(strA08, com.facebook.ads.redexgen.core.C8E.A1f, new com.facebook.ads.redexgen.core.C8F(th));
        } else {
            this.A00.A07().AA0(strA08, com.facebook.ads.redexgen.core.C8E.A1f, new com.facebook.ads.redexgen.core.C8F(A08(77, 28, 18)));
        }
    }

    private boolean A0C(int i, int i2) {
        return i > 0 && i2 > 0 && com.facebook.ads.redexgen.core.C0762Im.A1Q(this.A00);
    }

    public final android.graphics.Bitmap A0D(com.facebook.ads.redexgen.core.C04746d c04746d) {
        return A01(this.A00, c04746d, c04746d.A04, c04746d.A03, c04746d.A01);
    }

    public final android.graphics.Bitmap A0E(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, int i2, java.lang.String str2) {
        com.facebook.ads.redexgen.core.C04746d c04746d = this.A01.get(str);
        return (!com.facebook.ads.redexgen.core.C04796i.A06(c7j) || c04746d == null) ? A01(c7j, new com.facebook.ads.redexgen.core.C04746d(str, i, i2, A08(270, 7, 28), A08(270, 7, 28)), i2, i, str2) : A01(c7j, c04746d, i2, i, str2);
    }

    public final java.io.File A0F(java.lang.String str) {
        java.io.File file = new java.io.File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final java.lang.String A0G(java.lang.String str) {
        java.io.File file = new java.io.File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
