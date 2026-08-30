package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HW {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"2revu11PJC5JJW9Wa0yU7IMUA1J5NejP", "fJ5JOQQqtdBcbj27U0gmUjzU2HCLlz0g", "ET0kkCf4ARvl2PzoyLeVITbW2fplMVfR", "GxObTRUuHNyvHf6tkdVAqKD8xwa6jlLn", "B7q0fr4uC5I7vD4MQhzL4Z47zRUcP8kJ", "568trPd6mwfCGSMgqCQm2IVOVBWhAbWi", "EbkNl16qbhIMOqvfmLsDQ8wggfaUXum1", "SV9S1jJDj189NNWmtagkrr9CNMxjn3Dk"};
    public boolean A01;
    public final int A02;
    public final java.lang.String A03;
    public com.facebook.ads.redexgen.core.C1118Wm A00 = com.facebook.ads.redexgen.core.C1118Wm.A04;
    public final java.util.TreeSet<com.facebook.ads.redexgen.core.C1116Wk> A04 = new java.util.TreeSet<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[3].charAt(30) == 'V') {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "S0u5zKZmiQfdscAZx2bCvjbBnL2oTB1W";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
            i4++;
        }
    }

    public static void A02() {
        A05 = new byte[]{120, 62, 57, 49, 52, kotlin.io.encoding.Base64.padSymbol, 60, 118, 117, 33, 58, 117, 64, 119, 124, 115, 127, 123, 124, 117, 50, 125, 116, 50};
    }

    static {
        A02();
    }

    public HW(int i, java.lang.String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static com.facebook.ads.redexgen.core.HW A00(int i, java.io.DataInputStream dataInputStream) throws java.io.IOException {
        com.facebook.ads.redexgen.core.HW hw = new com.facebook.ads.redexgen.core.HW(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long j = dataInputStream.readLong();
            com.facebook.ads.redexgen.core.C0726Hb c0726Hb = new com.facebook.ads.redexgen.core.C0726Hb();
            com.facebook.ads.redexgen.core.AbstractC0725Ha.A05(c0726Hb, j);
            hw.A0F(c0726Hb);
        } else {
            hw.A00 = com.facebook.ads.redexgen.core.C1118Wm.A00(dataInputStream);
        }
        return hw;
    }

    public final int A03(int i) {
        int result = this.A02;
        int i2 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long jA00 = com.facebook.ads.redexgen.core.AbstractC0725Ha.A00(this.A00);
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j, long j2) {
        com.facebook.ads.redexgen.core.C1116Wk c1116WkA06 = A06(j);
        if (c1116WkA06.A01()) {
            return -java.lang.Math.min(c1116WkA06.A02() ? Long.MAX_VALUE : c1116WkA06.A01, j2);
        }
        long j3 = j + j2;
        long queryEndPosition = c1116WkA06.A02 + c1116WkA06.A01;
        if (queryEndPosition < j3) {
            for (com.facebook.ads.redexgen.core.C1116Wk c1116Wk : this.A04.tailSet(c1116WkA06, false)) {
                java.lang.String[] strArr = A06;
                if (strArr[2].charAt(8) == strArr[1].charAt(8)) {
                    throw new java.lang.RuntimeException();
                }
                A06[7] = "b0ZaIIxnoqImZ25xzDHzhq2wNwo0sHmR";
                long currentEndPosition = c1116Wk.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = c1116Wk.A02;
                queryEndPosition = java.lang.Math.max(queryEndPosition, currentEndPosition2 + c1116Wk.A01);
                if (queryEndPosition >= j3) {
                    break;
                }
            }
        }
        return java.lang.Math.min(queryEndPosition - j, j2);
    }

    public final com.facebook.ads.redexgen.core.C1118Wm A05() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1116Wk A06(long j) {
        com.facebook.ads.redexgen.core.C1116Wk c1116WkA01 = com.facebook.ads.redexgen.core.C1116Wk.A01(this.A03, j);
        com.facebook.ads.redexgen.core.C1116Wk c1116WkFloor = this.A04.floor(c1116WkA01);
        if (c1116WkFloor != null && c1116WkFloor.A02 + c1116WkFloor.A01 > j) {
            return c1116WkFloor;
        }
        com.facebook.ads.redexgen.core.C1116Wk lookupSpan = this.A04.ceiling(c1116WkA01);
        if (lookupSpan == null) {
            return com.facebook.ads.redexgen.core.C1116Wk.A02(this.A03, j);
        }
        return com.facebook.ads.redexgen.core.C1116Wk.A03(this.A03, j, lookupSpan.A02 - j);
    }

    public final com.facebook.ads.redexgen.core.C1116Wk A07(com.facebook.ads.redexgen.core.C1116Wk c1116Wk) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A04.remove(c1116Wk));
        com.facebook.ads.redexgen.core.C1116Wk c1116WkA08 = c1116Wk.A08(this.A02);
        if (c1116Wk.A03.renameTo(c1116WkA08.A03)) {
            this.A04.add(c1116WkA08);
            return c1116WkA08;
        }
        throw new com.facebook.ads.redexgen.core.HN(A01(12, 12, 14) + c1116Wk.A03 + A01(8, 4, 73) + c1116WkA08.A03 + A01(0, 8, 68));
    }

    public final java.util.TreeSet<com.facebook.ads.redexgen.core.C1116Wk> A08() {
        return this.A04;
    }

    public final void A09(com.facebook.ads.redexgen.core.C1116Wk c1116Wk) {
        this.A04.add(c1116Wk);
    }

    public final void A0A(java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(com.facebook.ads.redexgen.core.HT ht) {
        if (this.A04.remove(ht)) {
            ht.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(com.facebook.ads.redexgen.core.C0726Hb c0726Hb) {
        com.facebook.ads.redexgen.core.C1118Wm c1118Wm = this.A00;
        com.facebook.ads.redexgen.core.C1118Wm oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(c0726Hb);
        com.facebook.ads.redexgen.core.C1118Wm oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c1118Wm);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.HW hw = (com.facebook.ads.redexgen.core.HW) obj;
        if (this.A02 == hw.A02 && this.A03.equals(hw.A03)) {
            java.util.TreeSet<com.facebook.ads.redexgen.core.C1116Wk> treeSet = this.A04;
            java.lang.String[] strArr = A06;
            if (strArr[5].charAt(21) != strArr[0].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            A06[4] = "6WixUlfTKGOdvAUaxQ2Z5ifCzkckXFCZ";
            if (treeSet.equals(hw.A04) && this.A00.equals(hw.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i = result * 31;
        int result2 = this.A04.hashCode();
        return i + result2;
    }
}
