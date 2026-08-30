package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WY implements com.facebook.ads.redexgen.core.J6 {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"KlcQ4aPMCjTEuj6tlqvSPg02tmhmGUou", "NbdeitWOc1zrv1JDjauqKHmjPPhSGwGe", "R4vSD9xrU3uFkHfeeGcLq0xvgbIcHayT", "rvVAUvGslDbkwSzXQ4gHiQTP5zrG", "ljLEgEfbMYnmdR7mWy3vUvMk8HSCwfcz", "YjYM3cC5SO9DuryblpH9N9a8sNamrwLD", "dglxEHbBnsXp5lOZvNi9PFSn5QE5iyod", "nrMzKM4Ejqm74mRasA"};
    public static final java.lang.String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final android.net.ConnectivityManager A04;
    public final com.facebook.ads.redexgen.core.C1198Zr A06;
    public final com.facebook.ads.redexgen.core.J5 A07;
    public final com.facebook.ads.redexgen.core.InterfaceC0993Rq A08;
    public volatile boolean A0C;
    public final java.lang.Runnable A0A = new com.facebook.ads.redexgen.core.C1106Wa(this);
    public final java.lang.Runnable A09 = new com.facebook.ads.redexgen.core.WZ(this);
    public final java.util.concurrent.ThreadPoolExecutor A0B = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue());
    public final android.os.Handler A05 = new android.os.Handler(android.os.Looper.getMainLooper());

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0E[2].charAt(25) == '3') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[3] = "STFGVVXWKW9SjLATYObI8PiLTu9r";
            strArr[7] = "1bj9PcPMGQWJpkILDx";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
            i4++;
        }
    }

    public static void A07() {
        A0D = new byte[]{106, 121, 99, 84, 88, 117, 111, 108, 125, 104, 127, 116, 117, 114, 123, 60, 121, 106, 121, 114, 104, 60, 52, 64, 125, 102, 96, 117, 113, 108, 106, 107, 37, 114, 109, 108, 105, 96, 37, 97, 108, 118, 117, 100, 113, 102, 109, 108, 107, 98, 37, 96, 115, 96, 107, 113, 118, 43, 73, 127, 104, 108, 127, 104, 58, 106, 104, 117, 121, 127, 105, 105, 127, 126, 58, 106, 123, 104, 110, 115, 123, 118, 58, 120, 123, 110, 121, 114, 54, 58, 121, 117, 116, 110, 115, 116, 111, 115, 116, 125, 58, 110, 117, 58, 116, 127, 98, 110, 58, 117, 116, 127, 52, 89, 111, 120, 124, 111, 120, 42, 120, 111, 121, 122, 101, 100, 121, 111, 42, 99, 121, 42, 111, 103, 122, 126, 115, 36, 0, 54, 33, 37, 54, 33, 115, 33, 54, 39, 38, 33, kotlin.io.encoding.Base64.padSymbol, 54, 55, 115, 50, 115, kotlin.io.encoding.Base64.padSymbol, 60, kotlin.io.encoding.Base64.padSymbol, 126, 32, 38, 48, 48, 54, 32, 32, 53, 38, okio.Utf8.REPLACEMENT_BYTE, 115, 32, 39, 50, 39, 38, 32, 115, 48, 60, 55, 54, 115, 60, 53, 115, 70, 112, 103, 99, 112, 103, 53, 98, 116, 102, 53, 96, 123, 116, 119, 121, 112, 53, 97, 122, 53, 101, 103, 122, 118, 112, 102, 102, 53, 116, 121, 121, 53, 112, 99, 112, 123, 97, 102, 57, 53, 97, 103, 108, 124, 123, 114, 53, 116, 114, 116, 124, 123, 59, 57, 1, 3, 26, 26, 3, 4, 13, 74, 14, 3, 25, 26, 11, 30, 9, 2, 74, 14, 31, 15, 74, 30, 5, 74, 6, 11, 9, 1, 74, 5, 12, 74, 9, 5, 4, 4, 15, 9, 30, 3, 28, 3, 30, 19, 68, 74, 95, 95, 78, 70, 91, 95, 93, 81, 80, 80, 91, 93, 74, 87, 72, 87, 74, 71, 32, 37, 48, 37, 3, 16, 3, 8, 18, 21, 59, 42, 50, 39, 36, 42, 47};
    }

    static {
        A07();
        A0F = com.facebook.ads.redexgen.core.J6.class.getSimpleName();
    }

    public WY(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.J5 j5) {
        this.A07 = j5;
        this.A06 = c1198Zr;
        this.A04 = (android.net.ConnectivityManager) c1198Zr.getSystemService(A03(293, 12, 115));
        this.A08 = com.facebook.ads.redexgen.core.S8.A01(c1198Zr);
        this.A03 = com.facebook.ads.redexgen.core.Io.A0K(c1198Zr);
        this.A02 = com.facebook.ads.redexgen.core.Io.A0J(c1198Zr);
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.WY wy) {
        int i = wy.A00 + 1;
        wy.A00 = i;
        return i;
    }

    private void A05() {
        this.A06.A04().A9O();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.AB8();
        }
    }

    private void A06() {
        if (this.A00 >= com.facebook.ads.redexgen.core.Io.A09(this.A06)) {
            A05();
            A5X();
            return;
        }
        int i = this.A00;
        if (A0E[4].charAt(15) == 'm') {
            java.lang.String[] strArr = A0E;
            strArr[0] = "48XWu56AgSaDG2v80CTGd4cBK4h9Z0cs";
            strArr[1] = "AYX5vj0PphgSAPbgEesjNh2Dg1h2Tuc1";
            if (i == 1) {
                this.A01 = com.facebook.ads.redexgen.core.Io.A0I(this.A06);
            } else {
                long j = this.A01 * 2;
                java.lang.String[] strArr2 = A0E;
                if (strArr2[5].charAt(19) == strArr2[6].charAt(19)) {
                    java.lang.String[] strArr3 = A0E;
                    strArr3[0] = "1ToF3hMm2VA6KDOeCYlfpYX9EZhWZaCs";
                    strArr3[1] = "Z30ky6DQTC9ucfzgiQKOMI68k5hVrHHu";
                    this.A01 = j;
                }
            }
            A5Y();
            return;
        }
        throw new java.lang.RuntimeException();
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.Map<java.lang.String, java.lang.String> shortEvnData = this.A06.A03().A59();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() throws java.lang.Exception {
        try {
            android.net.NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A04().A9O()) {
                    android.util.Log.e(A0F, A03(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 46, 39));
                }
                A08(this.A02);
                return;
            }
            this.A06.A04().A9O();
            org.json.JSONObject jSONObjectA4w = this.A07.A4w();
            if (jSONObjectA4w == null) {
                this.A06.A04().A9O();
                A05();
                return;
            }
            boolean zA9O = this.A06.A04().A9O();
            java.lang.String strA03 = A03(309, 6, 43);
            if (zA9O && jSONObjectA4w.has(strA03)) {
                org.json.JSONArray jSONArray = jSONObjectA4w.getJSONArray(strA03);
                for (int i = 0; i < jSONArray.length(); i++) {
                    java.lang.String str = A03(4, 19, 81) + i + A03(0, 3, 14) + jSONArray.get(i);
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A03(286, 7, 102), java.lang.String.valueOf(this.A00));
            A09(jSONObject);
            jSONObjectA4w.put(A03(305, 4, 9), jSONObject);
            com.facebook.ads.redexgen.core.S4 s4 = new com.facebook.ads.redexgen.core.S4();
            s4.put(A03(315, 7, 6), jSONObjectA4w.toString());
            com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpAES = this.A08.AES(this.A06.A04().A7R(), s4.A08());
            java.lang.String strA6X = interfaceC0992RpAES != null ? interfaceC0992RpAES.A6X() : null;
            if (!android.text.TextUtils.isEmpty(strA6X) && interfaceC0992RpAES != null) {
                if (interfaceC0992RpAES.A8R() != 200) {
                    if (this.A06.A04().A9O()) {
                        java.lang.String responseBody = A0F;
                        android.util.Log.e(responseBody, A03(138, 48, 30) + interfaceC0992RpAES.A8R() + A03(3, 1, 55));
                    }
                    if (interfaceC0992RpAES.A8R() == 413 && com.facebook.ads.redexgen.core.C0762Im.A2M(this.A06)) {
                        this.A07.ADH();
                        A05();
                        return;
                    } else {
                        if (jSONObjectA4w.has(strA03)) {
                            this.A07.ABj(jSONObjectA4w.getJSONArray(strA03));
                        }
                        A06();
                        return;
                    }
                }
                if (!this.A07.ABk(new org.json.JSONArray(strA6X))) {
                    if (this.A06.A04().A9O()) {
                        android.util.Log.w(A0F, A03(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 54, 88));
                    }
                    A06();
                    return;
                } else {
                    if (this.A07.A9Z()) {
                        if (this.A06.A04().A9O()) {
                            android.util.Log.i(A0F, A03(58, 55, 87));
                        }
                        A06();
                        return;
                    }
                    A05();
                    return;
                }
            }
            if (this.A06.A04().A9O()) {
                android.util.Log.e(A0F, A03(113, 25, 71));
            }
            if (com.facebook.ads.redexgen.core.C0762Im.A2C(this.A06) && jSONObjectA4w.has(strA03)) {
                this.A07.ABj(jSONObjectA4w.getJSONArray(strA03));
            }
            A06();
        } catch (java.lang.Exception e) {
            com.facebook.ads.redexgen.core.C1198Zr c1198Zr = this.A06;
            java.lang.String[] strArr = A0E;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                java.lang.Exception e2 = new java.lang.RuntimeException();
                throw e2;
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[5] = "juVm3rSGrTKw83uGBob9EWWg86xlgGIp";
            strArr2[6] = "uyuZsDIDSXItwx867Sl9CxjwWd0LLO11";
            if (c1198Zr.A04().A9O()) {
                android.util.Log.e(A0F, A03(23, 35, 72), e);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.J6
    public final void A5X() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.J6
    public final void A5Y() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
