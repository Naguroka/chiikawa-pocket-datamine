package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1112Wg implements com.facebook.ads.redexgen.core.SH {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1198Zr A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.SF A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new java.lang.RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C1112Wg(com.facebook.ads.redexgen.core.SF sf, com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A01 = sf;
        this.A00 = c1198Zr;
    }

    @Override // com.facebook.ads.redexgen.core.SH
    public final void A4R() {
        try {
            com.facebook.ads.redexgen.core.C0762Im.A0T(this.A00).A2u(this.A01.A75().optJSONObject(A00(0, 14, 83)));
        } catch (org.json.JSONException e) {
            this.A00.A07().A3y(e);
        }
    }
}
