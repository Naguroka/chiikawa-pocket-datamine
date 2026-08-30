package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0726Hb {
    public static java.lang.String[] A02 = {"1WEATj5Rf8rtbWj2W4p2vpgEaxw2T8HN", "L5R1qCGEqkvVCxYfd", "YDYe9TKl8VD8", "ZFB5zzOBm8TOZxYydKqVDTn4NLBknbux", "rIMvDsWvqMRKWOiP3U7cHeY33TCAV", "UVRJks5dFFSODcDGI66jdmIAqds", "cMa11vJk6adNmjyXCEaOSOhGfY6WoPiz", "C"};
    public final java.util.Map<java.lang.String, java.lang.Object> A01 = new java.util.HashMap();
    public final java.util.List<java.lang.String> A00 = new java.util.ArrayList();

    private com.facebook.ads.redexgen.core.C0726Hb A00(java.lang.String str, java.lang.Object obj) {
        this.A01.put((java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(str), com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(obj));
        this.A00.remove(str);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0726Hb A01(java.lang.String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0726Hb A02(java.lang.String str, long j) {
        return A00(str, java.lang.Long.valueOf(j));
    }

    public final com.facebook.ads.redexgen.core.C0726Hb A03(java.lang.String str, java.lang.String str2) {
        return A00(str, str2);
    }

    public final java.util.List<java.lang.String> A04() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.A00));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> A05() {
        java.util.HashMap map = new java.util.HashMap(this.A01);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(java.util.Arrays.copyOf(bArr, bArr.length));
            }
        }
        java.util.Map<java.lang.String, java.lang.Object> mapUnmodifiableMap = java.util.Collections.unmodifiableMap(map);
        if (A02[0].length() == 9) {
            throw new java.lang.RuntimeException();
        }
        A02[4] = "4TZ1TBs4qvjuT7BcoF6HSVZlpVsWz";
        return mapUnmodifiableMap;
    }
}
