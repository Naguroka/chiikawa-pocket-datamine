package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C1E implements java.io.Serializable {
    public static java.lang.String A0g = null;
    public static byte[] A0h = null;
    public static final long serialVersionUID = -8352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public com.facebook.ads.RewardData A06;
    public java.lang.String A07;
    public java.lang.String A08;
    public java.lang.String A09;
    public java.lang.String A0A;
    public java.lang.String A0B;
    public java.lang.String A0C;
    public java.lang.String A0D;
    public java.lang.String A0E;
    public java.lang.String A0F;
    public java.lang.String A0G;
    public java.lang.String A0H;
    public java.lang.String A0I;
    public java.lang.String A0J;
    public java.lang.String A0K;
    public java.lang.String A0L;
    public java.lang.String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final int A0f;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0h = new byte[]{88, 122, 107, okio.Utf8.REPLACEMENT_BYTE, 102, 112, 106, 109, okio.Utf8.REPLACEMENT_BYTE, 109, 122, 104, 126, 109, 123, 42, 13, 16, 23, 2, 15, 15, 67, 2, 19, 19, 67, 2, 13, 7, 67, 16, 8, 10, 19, 67, 23, 11, 6, 67, 2, 7, 77, 102, 65, 92, 91, 78, 67, 67, 15, 91, 71, 74, 15, 78, 95, 95, 12, 49, 99, 52, 34, 55, 32, 43, 99, 55, 43, 38, 99, 37, 54, 47, 47, 99, 34, 39, 31, 39, 37, 60, 108, 56, 36, 41, 108, 45, 40, 108, 46, 53, 108, 40, 35, 59, 34, 32, 35, 45, 40, 37, 34, 43, 108, 56, 36, 41, 108, 45, 60, 60, 108, 45, 34, 40, 108, 37, 34, okio.Utf8.REPLACEMENT_BYTE, 56, 45, 34, 56, 32, 53, 108, 43, 41, 56, 108, 53, 35, 57, 62, 108, 62, 41, 59, 45, 62, 40, 109, 127, 73, 83, 84, 6, 84, 67, 81, 71, 84, 66, 6, 79, 85, 6, 84, 67, 71, 66, 95, 6, 82, 73, 6, 68, 67, 6, 83, 85, 67, 66, 7, 40, 42, 40, 20, 45, 34, 39, okio.Utf8.REPLACEMENT_BYTE, 46, 57, 20, 40, 39, 34, 40, 32, 56, 20, 36, 37, 20, 40, okio.Utf8.REPLACEMENT_BYTE, 42, 20, 46, 37, 42, 41, 39, 46, 47, 96, 98, 110, 115, 98, 106, 100, 109, 106, 103, 62, 116, 102, 97, 92, 98, 118, 119, 108, 92, 113, 102, 103, 106, 113, 102, 96, 119, 35, 98, 96, 119, 106, 108, 109, 62, 98, 109, 103, 113, 108, 106, 103, 45, 106, 109, 119, 102, 109, 119, 45, 98, 96, 119, 106, 108, 109, 45, 85, 74, 70, 84, 35, 115, 98, 96, 104, 98, 100, 102, 62, 96, 108, 110, 45, 98, 109, 103, 113, 108, 106, 103, 45, 117, 102, 109, 103, 106, 109, 100, 35, 106, 109, 119, 102, 109, 119, 57, 44, 44, 115, 111, 98, 122, 45, 100, 108, 108, 100, 111, 102, 45, 96, 108, 110, 44, 112, 119, 108, 113, 102, 107, 105, 122, 103, 125, 123, 109, 100, 79, 68, 77, 69, 66, 115, 92, 77, 94, 77, 65, 95, 7, 8, 13, 7, 15, 59, 0, 1, 8, 5, 29, 59, 8, 11, 3, 3, 13, 10, 3, 59, 9, 23, 1, 14, 11, 1, 9, kotlin.io.encoding.Base64.padSymbol, 11, 3, 0, kotlin.io.encoding.Base64.padSymbol, 4, 11, 14, 22, 7, 16, 11, 12, 5, kotlin.io.encoding.Base64.padSymbol, 7, 12, 3, 0, 14, 7, 6, 42, 38, 36, 103, 47, 40, 42, 44, 43, 38, 38, 34, 103, 40, 45, 58, 103, 32, 39, kotlin.io.encoding.Base64.padSymbol, 44, 59, 58, kotlin.io.encoding.Base64.padSymbol, 32, kotlin.io.encoding.Base64.padSymbol, 32, 40, 37, 103, 42, 37, 32, 42, 34, 44, 45, 110, 127, 104, 108, 121, 100, 123, 104, 82, 108, 126, 82, 110, 121, 108, 82, 104, 99, 108, 111, 97, 104, 105, 51, 34, 53, 49, 36, 57, 38, 53, 15, 49, 35, 15, 51, 36, 49, 15, 53, 62, 49, 50, 60, 53, 52, 15, 62, 49, 36, 57, 38, 53, 15, 50, 49, 62, 62, 53, 34, 43, 60, 41, 23, 43, 36, 33, 43, 35, 23, 44, 45, 36, 41, 49, 23, 36, 39, 47, 47, 33, 38, 47, 23, 37, 59, 117, 98, 125, 78, 121, 120, 117, 116, 78, 127, 112, 103, 120, 118, 112, 101, 120, 126, 127, 78, 116, 127, 112, 115, 125, 116, 117, 18, 5, 26, 41, 30, 5, 41, 19, 24, 23, 20, 26, 19, 18, 110, 121, 102, 85, 98, 115, 104, 120, 99, 110, 85, 111, 100, 107, 104, 102, 111, 110, 95, 66, 85, 90, 86, 82, 88, 100, 72, 95, 80, 100, 87, 90, 66, 94, 73, 100, 83, 79, 86, 87, 100, 78, 73, 87, 108, 103, 106, 123, 112, 121, 125, 108, 109, 86, 106, 121, 100, 108, 100, 100, 108, 103, 110, 84, 123, 103, 106, 114, 84, 99, 100, 120, 127, 84, 120, 127, 121, 98, 101, 108, 108, 107, 118, 113, 100, 105, 105, 90, 100, 107, 97, 90, 98, 96, 113, 90, 119, 96, 114, 100, 119, 97, 90, 97, 96, 118, 102, 119, 108, 117, 113, 108, 106, 107, 10, 13, 16, 23, 2, 15, 15, 60, 2, 13, 7, 60, 4, 6, 23, 60, 17, 6, 20, 2, 17, 7, 60, 6, 13, 2, 1, 15, 6, 7, 5, 2, 24, 9, 30, 15, 9, 28, 24, 51, 27, 9, 14, 51, 5, 2, 31, 24, 13, 0, 0, 51, 14, 25, 24, 24, 3, 2, 18, 21, 15, 30, 9, 8, 15, 18, 15, 18, 26, 23, 98, 123, 87, 127, 109, 106, 87, 97, 102, 123, 124, 105, 100, 100, 87, 106, 125, 124, 124, 103, 102, 58, 53, 32, kotlin.io.encoding.Base64.padSymbol, 34, 49, 17, 13, 0, 24, 79, 6, 14, 14, 6, 13, 4, 79, 2, 14, 12, 33, 35, 52, 14, 35, 52, 38, 48, 35, 53, 14, 50, 37, 48, 14, 51, 36, 37, 37, 62, okio.Utf8.REPLACEMENT_BYTE, 14, 37, 52, 41, 37, 47, 45, 58, 0, 45, 58, 40, 62, 45, 59, 0, 59, 58, 44, 60, 45, 54, 47, 43, 54, 48, 49, 95, 93, 74, 112, 93, 74, 88, 78, 93, 75, 112, 74, 65, 78, 77, 67, 74, 75, 33, 35, 52, 14, 35, 52, 38, 48, 35, 53, 14, 37, 56, 37, kotlin.io.encoding.Base64.padSymbol, 52, 124, 126, 105, 83, 126, 105, 123, 109, 126, 104, 83, 123, 109, 120, 111, 100, 83, 109, 104, 83, 110, 121, 120, 120, 99, 98, 83, 120, 105, 116, 120, 41, 62, 43, 55, 58, 34, 4, 44, 51, 62, 53, 4, 40, 48, 50, 43, 4, 47, 50, 54, 62, 4, 62, 35, 56, 62, 62, okio.Utf8.REPLACEMENT_BYTE, 40, 4, 45, 50, okio.Utf8.REPLACEMENT_BYTE, 62, 52, 4, okio.Utf8.REPLACEMENT_BYTE, 46, 41, 58, 47, 50, 52, 53, 4, 62, 53, 58, 57, 55, 62, okio.Utf8.REPLACEMENT_BYTE, 105, 126, 106, 110, 126, 104, 111, 68, 114, 127, 68, 83, 65, 87, 68, 82, 105, 81, 68, 87, 88, 66, 83, 82, 105, 66, 83, 78, 66, 60, 43, 57, 47, 60, 42, 43, 42, 17, 56, 39, 42, 43, 33, 24, 31, 25, 2, 5, 
        12, 52, 31, 4, 52, 8, 3, 14, 8, 0, 52, 12, 4, 4, 12, 7, 14, 52, 27, 7, 10, 18, 52, 10, 30, 31, 4, 52, 25, 14, 15, 2, 25, 14, 8, 31, 101, 122, 118, 100, 114, 113, 122, 127, 122, 103, 106, 76, 112, 123, 118, 112, 120, 76, 122, 125, 122, 103, 122, 114, 127, 76, 119, 118, 127, 114, 106, 80, 79, 67, 81, 71, 68, 79, 74, 79, 82, 95, 121, 69, 78, 67, 69, 77, 121, 79, 72, 82, 67, 84, 80, 71, 74, 113, 103, 114, 101, 110, 89, 103, 104, 98, 89, 111, 104, 117, 114, 103, 106, 106, 89, 101, 114, 103, 89, 100, 115, 114, 114, 105, 104, 89, 99, 104, 103, 100, 106, 99, 98, 83, 69, 80, 71, 76, 123, 69, 74, 64, 123, 77, 74, 87, 80, 69, 72, 72, 123, 65, 74, 69, 70, 72, 65, 64, 27, 13, 24, 15, 4, 51, 13, 2, 8, 51, 5, 2, 31, 24, 13, 0, 0, 51, 10, 30, 3, 1, 51, 31, 24, 13, 30, 24, 51, 8, 9, 0, 13, 21, 118, 96, 117, 98, 105, 94, 96, 111, 101, 94, 104, 111, 114, 117, 96, 109, 109, 94, 110, 111, 94, 104, 111, 114, 117, 96, 111, 117, 94, 102, 96, 108, 100, 114, 94, 100, 111, 96, 99, 109, 100, 101};
    }

    public abstract int A0R();

    public abstract int A0S();

    public C1E() {
        java.lang.String strA01 = A01(0, 0, 51);
        this.A0E = strA01;
        this.A01 = 200;
        this.A0C = strA01;
        this.A0I = strA01;
        this.A0H = strA01;
        this.A0G = strA01;
        this.A0J = strA01;
        this.A0F = strA01;
        this.A0Z = false;
        this.A0N = false;
        this.A0D = strA01;
        this.A0B = A01(772, 15, 73);
        this.A0M = strA01;
    }

    public static com.facebook.ads.redexgen.core.C1E A00(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        boolean zHas = jSONObject.has(A01(336, 12, 4));
        boolean z = false;
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(328, 8, 32));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            z = true;
        }
        com.facebook.ads.redexgen.core.C1E c1eA02 = null;
        if (zHas) {
            try {
                c1eA02 = com.facebook.ads.redexgen.core.C1339cB.A02(jSONObject, c1199Zs);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        if (c1eA02 == null) {
            zHas = false;
            c1eA02 = com.facebook.ads.redexgen.core.C0687Fk.A02(jSONObject, c1199Zs);
        }
        c1eA02.A0x(zHas);
        c1eA02.A0L(z);
        return c1eA02;
    }

    private void A03(int i) {
        this.A02 = i;
    }

    private final void A04(long j) {
        this.A03 = j;
    }

    private final void A05(long j) {
        this.A04 = j;
    }

    private void A06(java.lang.String str) {
        this.A07 = str;
    }

    private void A07(java.lang.String str) {
        this.A08 = str;
    }

    private void A08(java.lang.String str) {
        this.A0K = str;
    }

    private final void A09(java.lang.String str) {
        this.A0C = str;
    }

    private final void A0A(java.lang.String str) {
        this.A0F = str;
    }

    private final void A0B(java.lang.String str) {
        this.A0G = str;
    }

    private final void A0C(java.lang.String str) {
        this.A0H = str;
    }

    private final void A0D(java.lang.String str) {
        this.A0I = str;
    }

    private final void A0E(java.lang.String str) {
        this.A0J = str;
    }

    private void A0F(org.json.JSONObject jSONObject) {
        this.A0E = jSONObject.toString();
    }

    private final void A0G(boolean z) {
        this.A0R = z;
    }

    private final void A0H(boolean z) {
        this.A0U = z;
    }

    private final void A0I(boolean z) {
        this.A0V = z;
    }

    private final void A0J(boolean z) {
        this.A0W = z;
    }

    private final void A0K(boolean z) {
        this.A0X = z;
    }

    private final void A0L(boolean z) {
        this.A0S = z;
    }

    private final void A0M(boolean z) {
        this.A0d = z;
    }

    private final void A0N(boolean z) {
        this.A0e = z;
    }

    public final int A0O() {
        return this.A02;
    }

    public final int A0P() {
        return this.A0f;
    }

    public final int A0Q() {
        return this.A00;
    }

    public final long A0T() {
        return this.A03;
    }

    public final long A0U() {
        return this.A04;
    }

    public final long A0V() {
        return this.A05;
    }

    public final com.facebook.ads.RewardData A0W() {
        return this.A06;
    }

    public final java.lang.String A0X() {
        return A0g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final java.lang.String A0Y() {
        byte b;
        java.lang.String str = this.A0A;
        switch (str.hashCode()) {
            case -1364000502:
                if (!str.equals(A01(981, 14, 102))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1052618729:
                if (!str.equals(A01(766, 6, 124))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 604727084:
                if (!str.equals(A01(733, 12, 83))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return A01(397, 37, 97);
            case 1:
                return com.facebook.ads.redexgen.core.EnumC0972Qv.A04.A03();
            case 2:
                return com.facebook.ads.redexgen.core.EnumC0971Qu.A03.A03();
            default:
                return A01(0, 0, 51);
        }
    }

    public final java.lang.String A0Z() {
        return this.A07;
    }

    public final java.lang.String A0a() {
        return this.A08;
    }

    public final java.lang.String A0b() {
        return this.A09;
    }

    public final java.lang.String A0c() {
        return this.A0A;
    }

    public final java.lang.String A0d() {
        return this.A0B;
    }

    public final java.lang.String A0e() {
        return this.A0C;
    }

    public final java.lang.String A0f() {
        return this.A0D;
    }

    public final java.lang.String A0g() {
        return this.A0F;
    }

    public final java.lang.String A0h() {
        return this.A0G;
    }

    public final java.lang.String A0i() {
        return this.A0H;
    }

    public final java.lang.String A0j() {
        return this.A0I;
    }

    public final java.lang.String A0k() {
        return this.A0J;
    }

    public final java.lang.String A0l() {
        return this.A0K;
    }

    public final java.lang.String A0m() {
        return this.A0L;
    }

    public final java.lang.String A0n() {
        return this.A0M;
    }

    public final org.json.JSONObject A0o() {
        try {
            return new org.json.JSONObject(this.A0E);
        } catch (org.json.JSONException unused) {
            return new org.json.JSONObject();
        }
    }

    public final void A0p(int i) {
        this.A01 = i;
    }

    public final void A0q(long j) {
        this.A05 = j;
    }

    public final void A0r(com.facebook.ads.RewardData rewardData) {
        this.A06 = rewardData;
    }

    public final void A0s(java.lang.String str) {
        A0g = str;
    }

    public final void A0t(java.lang.String str) {
        this.A09 = str;
    }

    public final void A0u(java.lang.String str) {
        this.A0A = str;
    }

    public final void A0v(java.lang.String str) {
        this.A0L = str;
    }

    public final void A0w(org.json.JSONObject jSONObject) {
        java.lang.String strA01 = A01(952, 10, 51);
        java.lang.String strA02 = A01(0, 0, 51);
        A08(jSONObject.optString(strA01, strA02));
        A07(jSONObject.optString(A01(605, 13, 33)));
        A0F(jSONObject);
        A03(jSONObject.optInt(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 31, 59), 0));
        A0p(jSONObject.optInt(A01(1067, 26, 14), 1000));
        A06(jSONObject.optString(A01(579, 26, 19), strA02));
        A0I(jSONObject.optBoolean(A01(434, 23, 37), false));
        A0J(jSONObject.optBoolean(A01(457, 37, 120), false));
        A0G(jSONObject.optBoolean(A01(org.objectweb.asm.Opcodes.DRETURN, 32, 99), false));
        A0H(jSONObject.optBoolean(A01(370, 27, 74), false));
        A0N(jSONObject.optBoolean(A01(900, 52, 115), false));
        A0K(jSONObject.optBoolean(A01(675, 30, 75), false));
        A09(jSONObject.optString(A01(641, 34, 45), A01(78, 65, 100)));
        A0M(jSONObject.optBoolean(A01(835, 18, 7), false));
        A0D(jSONObject.optString(A01(853, 16, 121), A01(0, 15, 55)));
        A0B(jSONObject.optString(A01(787, 26, 121), A01(43, 15, 7)));
        A0E(jSONObject.optString(A01(869, 31, 36), A01(58, 20, 107)));
        A0C(jSONObject.optString(A01(813, 22, 119), A01(15, 28, 75)));
        A0A(jSONObject.optString(A01(962, 19, 30), A01(org.objectweb.asm.Opcodes.D2L, 32, 14)));
        this.A0P = jSONObject.optBoolean(A01(547, 14, 94));
        this.A0Q = jSONObject.optBoolean(A01(561, 18, 34));
        this.A0O = jSONObject.optBoolean(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, 27, 57), true);
        this.A0b = jSONObject.optBoolean(A01(1129, 25, 12), false);
        this.A00 = jSONObject.optInt(A01(1154, 34, 68), -1);
        this.A0c = jSONObject.optBoolean(A01(1188, 42, 41), false);
        this.A0a = jSONObject.optBoolean(A01(1093, 36, 46), false);
        this.A0Y = jSONObject.optBoolean(A01(705, 28, 68), false);
        this.A0D = jSONObject.optString(A01(745, 21, 32), strA02);
        A05(jSONObject.optLong(A01(348, 22, 76), -1L));
        A04(jSONObject.optLong(A01(494, 26, 96), -1L));
        if (android.text.TextUtils.isEmpty(this.A0D)) {
            this.A0D = com.facebook.ads.redexgen.core.C0902Od.A00();
        }
        this.A0M = jSONObject.optString(A01(995, 41, 67), A01(207, 121, 43));
        this.A0B = jSONObject.optString(A01(618, 23, 35), A01(772, 15, 73));
    }

    public final void A0x(boolean z) {
        this.A0T = z;
    }

    public final void A0y(boolean z) {
        this.A0Z = z;
    }

    public final void A0z(boolean z) {
        this.A0N = z;
    }

    public final boolean A10() {
        return this.A0P;
    }

    public final boolean A11() {
        return this.A0Q;
    }

    public final boolean A12() {
        return this.A0O;
    }

    public final boolean A13() {
        return this.A0R;
    }

    public final boolean A14() {
        return this.A0S;
    }

    public final boolean A15() {
        return this.A0T;
    }

    public final boolean A16() {
        return this.A0U;
    }

    public final boolean A17() {
        return this.A0V;
    }

    public final boolean A18() {
        return this.A0W;
    }

    public final boolean A19() {
        return android.os.Build.VERSION.SDK_INT >= 21 && !android.text.TextUtils.isEmpty(A0Z());
    }

    public final boolean A1A() {
        return this.A0X;
    }

    public final boolean A1B() {
        return this.A0Y;
    }

    public final boolean A1C() {
        return this.A0d;
    }

    public final boolean A1D() {
        return this.A0Z;
    }

    public final boolean A1E() {
        return this.A0e;
    }

    public final boolean A1F() {
        return this.A0N;
    }

    public final boolean A1G() {
        return this.A0a;
    }

    public final boolean A1H() {
        return this.A0b;
    }

    public final boolean A1I() {
        return this.A0c;
    }
}
