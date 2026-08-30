package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HX {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"AHIWOTBqLsFh8yVD4eT", "RfXzku3q5WmG2dwMr9aGv1PO2Tu643QP", "gYjXpcqZdKU867vKm780EzJOh9fh4VMi", "b7mehy0psXOTQB1qmbSMVFvExNtg3f5i", "lZucwVR1KNE0YgyHfCu", "0xZP4ePzZZOv82loBTQ9GtJoppQQAkyQ", "cNsoVrvmf9xfmYCq", "sOhhdyOKaHYqXI9"};
    public com.facebook.ads.redexgen.core.IB A00;
    public boolean A01;
    public final android.util.SparseArray<java.lang.String> A02;
    public final com.facebook.ads.redexgen.core.C0732Hh A03;
    public final java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.HW> A04;
    public final javax.crypto.Cipher A05;
    public final javax.crypto.spec.SecretKeySpec A06;
    public final boolean A07;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-64, -60, -46, -19, -15, -1, -37, -17, -18, -17, -37, -4, -9, -17, -1, -31, -4, -19, -16, -16, -11, -6, -13, -69, -68, -50, -52, -50, -45, -48, -49, -54, -50, -38, -39, -33, -48, -39, -33, -54, -44, -39, -49, -48, -29, -103, -48, -29, -44};
        if (A09[7].length() == 9) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A09;
        strArr[3] = "Z5XQoI7gQuOqaokLvwGa1tSSGUTJY2q1";
        strArr[5] = "gxgDzLehiYOoOLS33ZU8tF3tX3vsG1ch";
        A08 = bArr;
    }

    static {
        A05();
    }

    public HX(java.io.File file, byte[] bArr, boolean z) {
        this.A07 = z;
        if (bArr != null) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new javax.crypto.spec.SecretKeySpec(bArr, A02(0, 3, 55));
            } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } else {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!z);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new java.util.HashMap<>();
        this.A02 = new android.util.SparseArray<>();
        this.A03 = new com.facebook.ads.redexgen.core.C0732Hh(new java.io.File(file, A02(25, 24, 35)));
    }

    public static int A00(android.util.SparseArray<java.lang.String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private com.facebook.ads.redexgen.core.HW A01(java.lang.String str) {
        int id = A00(this.A02);
        com.facebook.ads.redexgen.core.HW cachedContent = new com.facebook.ads.redexgen.core.HW(id, str);
        A06(cachedContent);
        this.A01 = true;
        return cachedContent;
    }

    public static javax.crypto.Cipher A03() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        int i = com.facebook.ads.redexgen.core.IK.A02;
        java.lang.String strA02 = A02(3, 20, 100);
        if (i == 18) {
            try {
                return javax.crypto.Cipher.getInstance(strA02, A02(23, 2, 49));
            } catch (java.lang.Throwable unused) {
            }
        }
        return javax.crypto.Cipher.getInstance(strA02);
    }

    private void A04() throws com.facebook.ads.redexgen.core.HN {
        try {
            try {
                java.io.OutputStream outputStream = this.A03.A03();
                if (this.A00 == null) {
                    this.A00 = new com.facebook.ads.redexgen.core.IB(outputStream);
                } else {
                    this.A00.A00(outputStream);
                }
                java.io.DataOutputStream output = new java.io.DataOutputStream(this.A00);
                java.io.DataOutputStream dataOutputStream = output;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new java.util.Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new javax.crypto.spec.IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        java.io.DataOutputStream output2 = new java.io.DataOutputStream(new javax.crypto.CipherOutputStream(this.A00, this.A05));
                        dataOutputStream = output2;
                    } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e) {
                        throw new java.lang.IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int iA03 = 0;
                for (com.facebook.ads.redexgen.core.HW hw : this.A04.values()) {
                    hw.A0A(dataOutputStream);
                    iA03 += hw.A03(2);
                }
                dataOutputStream.writeInt(iA03);
                this.A03.A06(dataOutputStream);
                com.facebook.ads.redexgen.core.IK.A0X(null);
            } catch (java.io.IOException e2) {
                throw new com.facebook.ads.redexgen.core.HN(e2);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.IK.A0X(null);
            throw th;
        }
    }

    private void A06(com.facebook.ads.redexgen.core.HW hw) {
        this.A04.put(hw.A03, hw);
        this.A02.put(hw.A02, hw.A03);
    }

    private boolean A07() {
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(this.A03.A04());
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(bufferedInputStream);
            int hashCode = dataInputStream.readInt();
            if (hashCode < 0 || hashCode > 2) {
                com.facebook.ads.redexgen.core.IK.A0X(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A05 == null) {
                    com.facebook.ads.redexgen.core.IK.A0X(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A05.init(2, this.A06, new javax.crypto.spec.IvParameterSpec(bArr));
                    java.io.DataInputStream input = new java.io.DataInputStream(new javax.crypto.CipherInputStream(bufferedInputStream, this.A05));
                    dataInputStream = input;
                } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } else if (this.A07) {
                this.A01 = true;
            }
            int i = dataInputStream.readInt();
            int flags = 0;
            for (int i2 = 0; i2 < i; i2++) {
                com.facebook.ads.redexgen.core.HW hwA00 = com.facebook.ads.redexgen.core.HW.A00(hashCode, dataInputStream);
                A06(hwA00);
                flags += hwA00.A03(hashCode);
                java.lang.String[] strArr = A09;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new java.lang.RuntimeException();
                }
                A09[7] = "0O666kd2GaR80yql0z2RR";
            }
            int i3 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (i3 != flags || !z) {
                com.facebook.ads.redexgen.core.IK.A0X(dataInputStream);
                return false;
            }
            com.facebook.ads.redexgen.core.IK.A0X(dataInputStream);
            return true;
        } catch (java.io.IOException unused) {
            if (0 != 0) {
                com.facebook.ads.redexgen.core.IK.A0X(null);
            }
            return false;
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                com.facebook.ads.redexgen.core.IK.A0X(null);
            }
            throw th;
        }
    }

    public final int A08(java.lang.String str) {
        return A0A(str).A02;
    }

    public final com.facebook.ads.redexgen.core.HW A09(java.lang.String str) {
        return this.A04.get(str);
    }

    public final com.facebook.ads.redexgen.core.HW A0A(java.lang.String str) {
        com.facebook.ads.redexgen.core.HW cachedContent = this.A04.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final com.facebook.ads.redexgen.core.HZ A0B(java.lang.String str) {
        com.facebook.ads.redexgen.core.HW cachedContent = A09(str);
        return cachedContent != null ? cachedContent.A05() : com.facebook.ads.redexgen.core.C1118Wm.A04;
    }

    public final java.lang.String A0C(int i) {
        return this.A02.get(i);
    }

    public final java.util.Collection<com.facebook.ads.redexgen.core.HW> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        java.lang.String[] strArr = new java.lang.String[this.A04.size()];
        this.A04.keySet().toArray(strArr);
        for (java.lang.String str : strArr) {
            A0H(str);
        }
    }

    public final void A0G() throws com.facebook.ads.redexgen.core.HN {
        if (!this.A01) {
            return;
        }
        A04();
        java.lang.String[] strArr = A09;
        if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[3] = "OJwnUNlvbPORry11yuYiVhFxi1f6FTd3";
        strArr2[5] = "di8S5pvaeiOMrEAjbzdNHFtXF5Gpf0YH";
        this.A01 = false;
    }

    public final void A0H(java.lang.String str) {
        com.facebook.ads.redexgen.core.HW hw = this.A04.get(str);
        if (hw != null && hw.A0C() && !hw.A0D()) {
            this.A04.remove(str);
            this.A02.remove(hw.A02);
            this.A01 = true;
        }
    }

    public final void A0I(java.lang.String str, com.facebook.ads.redexgen.core.C0726Hb c0726Hb) {
        com.facebook.ads.redexgen.core.HW cachedContent = A0A(str);
        if (cachedContent.A0F(c0726Hb)) {
            this.A01 = true;
        }
    }
}
