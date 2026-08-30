package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JI {
    public static byte[] A00;
    public static final java.lang.String A01;
    public static final java.util.Map<java.lang.String, java.lang.Integer> A02;
    public static final java.util.concurrent.atomic.AtomicInteger A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, -50, -27, -9, -96, -10, -31, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, 33, 22, 37, 24, 32, 24, 33, 39, 28, 33, 26, -45, 22, 34, 40, 33, 39, 24, 37, -19, -45, -7, 28, 16, 14, 25, -16, 28, 34, 27, 33, 18, 31, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, -31, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, -31, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, 24, 27, 15, 13, 24, 11, 15, 27, 33, 26, 32, 17, 30, 31, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.InterfaceC0993Rq interfaceC0993Rq, java.util.Map<java.lang.String, ?> map) throws org.json.JSONException {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(A01(93, 7, 67), A01(13, 1, 40));
        A09(c7j, map2);
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put(A01(188, 7, 36), A01(157, 14, 115));
        map3.put(A01(org.objectweb.asm.Opcodes.MONITOREXIT, 12, 37), java.lang.String.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_FAILED));
        map3.put(A01(100, 16, 16), A01(14, 1, 62));
        map3.put(A01(org.objectweb.asm.Opcodes.GETSTATIC, 10, 74), A01(65, 13, 116));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), java.lang.String.valueOf(entry.getValue()));
        }
        if (c7j.A04().A9O()) {
            java.lang.String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        map3.put(A01(78, 15, 3), jSONObject.toString());
        A09(c7j, map3);
        com.facebook.ads.redexgen.core.C05188h c05188hA08 = c7j.A08();
        org.json.JSONObject jSONObjectA05 = com.facebook.ads.redexgen.core.C8G.A05(new com.facebook.ads.redexgen.core.C8I(c05188hA08.A01(), c05188hA08.A02(), map3));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(jSONObjectA05);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(A01(org.objectweb.asm.Opcodes.I2S, 4, 12), new org.json.JSONObject(map2));
        jSONObject2.put(A01(org.objectweb.asm.Opcodes.DCMPL, 6, 3), jSONArray);
        com.facebook.ads.redexgen.core.S4 s4 = new com.facebook.ads.redexgen.core.S4();
        s4.put(A01(org.objectweb.asm.Opcodes.LOOKUPSWITCH, 7, 40), jSONObject2.toString());
        interfaceC0993Rq.AET(c7j.A04().A7R(), s4.A08(), new com.facebook.ads.redexgen.core.WS(c7j));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A09(com.facebook.ads.redexgen.core.C7j c7j, java.util.Map<java.lang.String, java.lang.String> map) {
        map.putAll(c7j.A03().A59());
    }

    static {
        A04();
        A01 = com.facebook.ads.redexgen.core.JI.class.getSimpleName();
        A03 = new java.util.concurrent.atomic.AtomicInteger(0);
        A02 = new java.util.HashMap();
    }

    public static void A05(com.facebook.ads.redexgen.core.C7j c7j) {
        if (A0B(c7j)) {
            return;
        }
        synchronized (com.facebook.ads.redexgen.core.JI.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            com.facebook.ads.redexgen.core.M8.A06.execute(new com.facebook.ads.redexgen.core.WT(c7j));
        }
    }

    public static void A08(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        int value;
        int iIntValue;
        if (A0B(c7j)) {
            return;
        }
        synchronized (com.facebook.ads.redexgen.core.JI.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    iIntValue = A02.get(str).intValue();
                } else {
                    iIntValue = 0;
                }
                value = iIntValue + 1;
                A02.put(str, java.lang.Integer.valueOf(value));
            } else {
                android.content.SharedPreferences sharedPreferences = c7j.getApplicationContext().getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(116, 31, 83), c7j), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (c7j.A04().A9O()) {
                java.lang.String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static boolean A0A(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A0B(com.facebook.ads.redexgen.core.C7j c7j) {
        if (c7j.A04().A9O()) {
            return false;
        }
        if (!com.facebook.ads.redexgen.core.Io.A0U(c7j)) {
            return true;
        }
        return A0A(c7j.A08().A00(), com.facebook.ads.redexgen.core.Io.A0C(c7j));
    }
}
