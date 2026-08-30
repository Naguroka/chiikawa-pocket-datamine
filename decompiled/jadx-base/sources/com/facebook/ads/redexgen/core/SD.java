package com.facebook.ads.redexgen.core;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SD {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"tECI8EX1cuXhUwYvYft6TDcXrBYDxzmb", "U9lWMC", "VeFVBuimOKBZ6IhnkHNGVdQ2rus8nhqD", "5Ss9iINs1N203h8UwVdzTm0B7XXAo0aC", "SEbmC0K2IQ7flaHMYhUIDNtJoPD", "aE6Std6il1HEkTA4be5XQZw6wdO2x4l2", "Oc9eC60MpRTSk1JwhF2h3JFaDWGSLdec", "vmvIsg"};
    public static final /* synthetic */ com.facebook.ads.redexgen.core.SD[] A02;
    public static final com.facebook.ads.redexgen.core.SD A03;
    public static final com.facebook.ads.redexgen.core.SD A04;
    public static final com.facebook.ads.redexgen.core.SD A05;
    public static final com.facebook.ads.redexgen.core.SD A06;
    public static final com.facebook.ads.redexgen.core.SD A07;
    public static final com.facebook.ads.redexgen.core.SD A08;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{20, 39, 39, 52, 44, 71, 106, 106, 105, 96, 100, 107, 102, 77, 87, 64, 78, 71, 105, 78, 84, 95, 114, 122, 117, 115, 100, 46, 9, 15, 20, 19, 26, 94, 101, 96, 101, 100, 124, 101, 43, 127, 114, 123, 110, 43, 100, 109, 43, 97, 120, 100, 101, 43, 100, 105, 97, 110, 104, 127, 43, 96, 110, 114};
    }

    public abstract boolean A05(org.json.JSONArray jSONArray, int i);

    public abstract boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i);

    public abstract boolean A07(org.json.JSONObject jSONObject, java.lang.String str);

    public abstract boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str);

    static {
        A03();
        final java.lang.String strA02 = A02(0, 5, 26);
        final int i = 0;
        A03 = new com.facebook.ads.redexgen.core.SD(strA02, i) { // from class: com.facebook.ads.redexgen.X.KK
            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A05(org.json.JSONArray jSONArray, int i2) {
                return jSONArray.optJSONArray(i2) != null;
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i2) {
                return com.facebook.ads.redexgen.core.SE.A00(jSONArray.optJSONArray(i2), jSONArray2.optJSONArray(i2));
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A07(org.json.JSONObject jSONObject, java.lang.String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
                return com.facebook.ads.redexgen.core.SE.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final java.lang.String strA03 = A02(5, 7, 74);
        final int i2 = 1;
        A04 = new com.facebook.ads.redexgen.core.SD(strA03, i2) { // from class: com.facebook.ads.redexgen.X.KF
            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A05(org.json.JSONArray jSONArray, int i3) {
                return jSONArray.optBoolean(i3, true) == jSONArray.optBoolean(i3, false);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i3) {
                return jSONArray.optBoolean(i3) == jSONArray2.optBoolean(i3);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A07(org.json.JSONObject jSONObject, java.lang.String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final java.lang.String strA04 = A02(12, 6, 109);
        final int i3 = 2;
        A05 = new com.facebook.ads.redexgen.core.SD(strA04, i3) { // from class: com.facebook.ads.redexgen.X.K3
            public static java.lang.String[] A00 = {"1ZkmGDQLr4HHzESqnZwtiaJskrCoCdgr", "ZuXKvCVbKiCO09p9pYqDyLAizJSm2C6Q", "nueEAEfgKP3aoalcvcV3IYW8uca", "ZSO21PM30lkMK5VtmFwCGRnC4HfRl6Ua", "ewMxBq6LlUCdKuikxzCZkjc2M9R", "JDKZd", "VKrSZQCGjlRNXLKdswkZgNPUMacPzyqz", "RC4irD47U"};

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A05(org.json.JSONArray jSONArray, int i4) {
                return jSONArray.optInt(i4, 0) == jSONArray.optInt(i4, 1) && jSONArray.optDouble(i4, 0.0d) == jSONArray.optDouble(i4, 1.0d) && ((double) jSONArray.optInt(i4, 0)) != jSONArray.optDouble(i4, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i4) {
                return jSONArray.optDouble(i4) == jSONArray2.optDouble(i4);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A07(org.json.JSONObject jSONObject, java.lang.String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1)) {
                    return false;
                }
                double dOptDouble = jSONObject.optDouble(str, 0.0d);
                if (A00[0].charAt(28) != 'C') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A00;
                strArr[2] = "ccqqHA83ZTWiIg3HPQbc0aiXb2J";
                strArr[4] = "9RASlEbgrOZWYduHYKXmEPevqLf";
                return dOptDouble == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final java.lang.String strA05 = A02(18, 3, 111);
        final int i4 = 3;
        A06 = new com.facebook.ads.redexgen.core.SD(strA05, i4) { // from class: com.facebook.ads.redexgen.X.K2
            public static java.lang.String[] A00 = {"n7SKlqK", "ov2fNltgQ2EAr85rcAXjQlotsfjsnjuH", "ovWB89LlYvQ4xO5HZfV2GFW4RL9XN4h2", "w8d2diIE5BdvGUn1gxyTHp0hEgENQTV7", "yQnpH44oXSx8ccz3NjdKCULhtA2Hxjvh", "86uwoduXnLYKbsdqFVwkHHSOZ5iH2tHE", "J0bksEA3Nc1mI6xnOvQtusRgBbL88ZUJ", "XzqVLub6oNjkAstpNhW0t4rN94XX0A8D"};

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A05(org.json.JSONArray jSONArray, int i5) {
                if (jSONArray.optInt(i5, 0) != jSONArray.optInt(i5, 1) || jSONArray.optDouble(i5, 0.0d) != jSONArray.optDouble(i5, 1.0d)) {
                    return false;
                }
                int iOptInt = jSONArray.optInt(i5, 0);
                if (A00[4].charAt(31) != 'h') {
                    throw new java.lang.RuntimeException();
                }
                A00[4] = "ESUjQDK13szqjYK8RJAQddjghxYzdQOh";
                return ((double) iOptInt) == jSONArray.optDouble(i5, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i5) {
                return jSONArray.optInt(i5) == jSONArray2.optInt(i5);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A07(org.json.JSONObject jSONObject, java.lang.String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1) || jSONObject.optDouble(str, 0.0d) != jSONObject.optDouble(str, 1.0d)) {
                    return false;
                }
                int iOptInt = jSONObject.optInt(str, 0);
                java.lang.String[] strArr = A00;
                if (strArr[1].charAt(1) != strArr[2].charAt(1)) {
                    throw new java.lang.RuntimeException();
                }
                A00[0] = "ksANhPg";
                return ((double) iOptInt) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final java.lang.String strA06 = A02(21, 6, 95);
        final int i5 = 4;
        A07 = new com.facebook.ads.redexgen.core.SD(strA06, i5) { // from class: com.facebook.ads.redexgen.X.K1
            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A05(org.json.JSONArray jSONArray, int i6) {
                return jSONArray.optJSONObject(i6) != null;
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i6) {
                return com.facebook.ads.redexgen.core.SE.A02(jSONArray.optJSONObject(i6), jSONArray2.optJSONObject(i6));
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A07(org.json.JSONObject jSONObject, java.lang.String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
                return com.facebook.ads.redexgen.core.SE.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final java.lang.String strA07 = A02(27, 6, 50);
        final int i6 = 5;
        A08 = new com.facebook.ads.redexgen.core.SD(strA07, i6) { // from class: com.facebook.ads.redexgen.X.K0
            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A05(org.json.JSONArray jSONArray, int i7) {
                return jSONArray.optString(i7) != null;
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A06(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i7) {
                return jSONArray.optString(i7).equals(jSONArray2.optString(i7));
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A07(org.json.JSONObject jSONObject, java.lang.String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.core.SD
            public final boolean A08(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = A04();
    }

    public SD(java.lang.String str, int i) {
        super(str, i);
    }

    public static com.facebook.ads.redexgen.core.SD A00(org.json.JSONArray jSONArray, int i) {
        for (com.facebook.ads.redexgen.core.SD type : values()) {
            if (A01[0].charAt(25) != 'B') {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "tSTzibjLEZmnKLeJSBWWFmo8ABKhWaoK";
            if (type.A05(jSONArray, i)) {
                return type;
            }
        }
        throw new java.lang.AssertionError(A02(33, 31, 68));
    }

    public static com.facebook.ads.redexgen.core.SD A01(org.json.JSONObject jSONObject, java.lang.String str) {
        for (com.facebook.ads.redexgen.core.SD type : values()) {
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(28) == strArr[6].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "zRruk8gFetbjQnDa2F20MljfYBQnm1P6";
            if (type.A07(jSONObject, str)) {
                return type;
            }
        }
        throw new java.lang.AssertionError(A02(33, 31, 68));
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.SD[] A04() {
        return new com.facebook.ads.redexgen.core.SD[]{A03, A04, A05, A06, A07, A08};
    }

    public static com.facebook.ads.redexgen.core.SD valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.SD) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.SD.class, str);
    }

    public static com.facebook.ads.redexgen.core.SD[] values() {
        return (com.facebook.ads.redexgen.core.SD[]) A02.clone();
    }
}
