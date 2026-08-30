package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC0809Km extends android.os.AsyncTask<com.facebook.ads.redexgen.core.S2, java.lang.Void, com.facebook.ads.redexgen.core.InterfaceC0992Rp> implements com.facebook.ads.redexgen.core.InterfaceC1002Rz {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"QrFR9YxtZmjHUVEKV6oKE4DdGtsrpc8H", "TwcoDq13NGDzrd27uf1NctQWIs88CxA5", "DEQUIzHs8EHMaJWbR5cSGVZv3Gss2W35", "Ai8rFQMQjE1asV4GIWZxLQq3VKhMcnMa", "Q3dsJQvnRhhndIZBGw2JIf13CD9aK", "FSoxIZL2zci1XZCD3aOfhtBMx8TI21HW", "XwCxwzkF49MOW0uOTgxgRHHne1dL58CR", "45IZuxFnerodSJSRUIhMDhHmCeiAV"};
    public com.facebook.ads.redexgen.core.InterfaceC0994Rr A00;
    public com.facebook.ads.redexgen.core.KS A01;
    public java.lang.Exception A02;
    public java.util.concurrent.Executor A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final com.facebook.ads.redexgen.core.InterfaceC0992Rp A00(com.facebook.ads.redexgen.core.S2... s2Arr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        java.lang.String[] strArr = A05;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        A05[6] = "rZqzIjYv4aJ5FL2pEqspRVXwv6AN0NL2";
        try {
            if (s2Arr != null) {
                try {
                    if (s2Arr.length > 0) {
                        com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpA0J = this.A01.A0J(s2Arr[0]);
                        if (this.A01.A0K().A04() && interfaceC0992RpA0J != null) {
                            java.lang.String.format(java.util.Locale.US, A01(108, 21, 5), java.lang.Integer.valueOf(interfaceC0992RpA0J.A8R()), interfaceC0992RpA0J.getUrl(), interfaceC0992RpA0J.A6X());
                        }
                        if (interfaceC0992RpA0J != null) {
                            return interfaceC0992RpA0J;
                        }
                        throw new java.lang.IllegalStateException(A01(87, 21, 59));
                    }
                } catch (java.lang.Exception e) {
                    this.A02 = e;
                    if (this.A01.A0K().A04()) {
                        java.lang.String.format(java.util.Locale.US, A01(64, 23, 95), e.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new java.lang.IllegalArgumentException(A01(0, 64, 49));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            if (A05[0].charAt(24) != 'G') {
                throw new java.lang.RuntimeException();
            }
            A05[0] = "mnFvayeDWU8YlLMMxELrFm0bGTjKFJH1";
            bArrCopyOfRange[i4] = (byte) (i5 - 20);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-119, -76, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -103, -90, -72, -80, 101, -71, -90, -80, -86, -72, 101, -86, -67, -90, -88, -71, -79, -66, 101, -76, -77, -86, 101, -90, -73, -84, -70, -78, -86, -77, -71, 101, -76, -85, 101, -71, -66, -75, -86, 101, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -69, -57, -57, -61, -109, -27, -40, -28, -24, -40, -26, -25, -109, -39, -44, -36, -33, -40, -41, -83, -109, -104, -26, -105, -61, -61, -65, 111, -63, -76, -62, -65, -66, -67, -62, -76, 111, -72, -62, 111, -67, -60, -69, -69, 107, 126, -116, -119, -120, -121, -116, 126, 83, 57, 62, 125, 57, 65, 62, -116, 66, 83, 35, 62, -116};
    }

    static {
        A02();
    }

    public AsyncTaskC0809Km(com.facebook.ads.redexgen.core.KS ks, com.facebook.ads.redexgen.core.InterfaceC0994Rr interfaceC0994Rr, java.util.concurrent.Executor executor) {
        this.A01 = ks;
        this.A00 = interfaceC0994Rr;
        this.A03 = executor;
    }

    private final void A03(com.facebook.ads.redexgen.core.InterfaceC0992Rp result) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.ABa(result);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    public final void A04(com.facebook.ads.redexgen.core.S2 s2) {
        super.executeOnExecutor(this.A03, s2);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC0992Rp doInBackground(com.facebook.ads.redexgen.core.S2[] s2Arr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        try {
            return A00(s2Arr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ABt(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992Rp) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            A03(interfaceC0992Rp);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
