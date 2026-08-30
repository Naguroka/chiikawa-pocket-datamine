package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SA extends android.os.AsyncTask<java.lang.String, java.lang.Void, com.facebook.ads.redexgen.core.SB> {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final java.lang.String A07;
    public static final java.util.Set<java.lang.String> A08;
    public com.facebook.ads.redexgen.core.C7j A00;
    public com.facebook.ads.redexgen.core.InterfaceC0992Rp A01;
    public com.facebook.ads.redexgen.core.S9 A02;
    public java.util.Map<java.lang.String, java.lang.String> A03;
    public java.util.Map<java.lang.String, java.lang.String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final com.facebook.ads.redexgen.core.SB A00(java.lang.String... strArr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        java.lang.String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            java.lang.String str = strArr[0];
            if (!android.text.TextUtils.isEmpty(str) && !A08.contains(str)) {
                java.lang.String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new com.facebook.ads.redexgen.core.SB(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = com.facebook.ads.redexgen.core.SA.class.getSimpleName();
        A08 = new java.util.HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public SA(com.facebook.ads.redexgen.core.C7j c7j) {
        this(c7j, null, null);
    }

    public SA(com.facebook.ads.redexgen.core.C7j c7j, java.util.Map<java.lang.String, java.lang.String> extraData) {
        this(c7j, extraData, null);
    }

    public SA(com.facebook.ads.redexgen.core.C7j c7j, java.util.Map<java.lang.String, java.lang.String> extraData, java.util.Map<java.lang.String, java.lang.String> postData) {
        this.A00 = c7j;
        this.A03 = extraData != null ? new java.util.HashMap(extraData) : null;
        this.A04 = postData != null ? new java.util.HashMap(postData) : null;
    }

    private java.lang.String A02(java.lang.String str) {
        try {
            return A03(str, A01(23, 6, 9), com.facebook.ads.redexgen.core.LV.A01(this.A00.A03().A6P()));
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    private java.lang.String A03(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            return str;
        }
        java.lang.String strA01 = A01(3, 1, 49);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 127);
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(str).append(strA01).append(str2);
        java.lang.String prepend = A01(2, 1, 113);
        java.lang.StringBuilder sbAppend2 = sbAppend.append(prepend);
        java.lang.String prepend2 = java.net.URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    private final void A05(com.facebook.ads.redexgen.core.SB response) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AEf(response);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    private boolean A06(java.lang.String str) {
        com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpAER;
        com.facebook.ads.redexgen.core.InterfaceC0993Rq interfaceC0993RqA00 = com.facebook.ads.redexgen.core.S8.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                interfaceC0992RpAER = interfaceC0993RqA00.AER(str, new com.facebook.ads.redexgen.core.S4());
            } else {
                com.facebook.ads.redexgen.core.S4 params = new com.facebook.ads.redexgen.core.S4();
                params.A05(this.A04);
                interfaceC0992RpAER = interfaceC0993RqA00.AES(str, params.A08());
            }
            this.A01 = interfaceC0992RpAER;
        } catch (java.lang.Exception e) {
            android.util.Log.e(A07, A01(4, 19, 26) + str, e);
        }
        return this.A01 != null && this.A01.A8R() == 200;
    }

    public final void A07(com.facebook.ads.redexgen.core.S9 s9) {
        this.A02 = s9;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ com.facebook.ads.redexgen.core.SB doInBackground(java.lang.String[] strArr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AEd();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(com.facebook.ads.redexgen.core.SB sb) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            A05(sb);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
