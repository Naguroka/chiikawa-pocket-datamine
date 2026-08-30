package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0686Fj extends com.facebook.ads.redexgen.core.AbstractC1322bu {
    public static byte[] A03;
    public long A00;
    public android.view.View A01;
    public com.facebook.ads.redexgen.core.C0669Ei A02;

    static {
        A05();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C0686Fj(com.facebook.ads.redexgen.core.C0669Ei c0669Ei, com.facebook.ads.redexgen.core.C03621t c03621t) {
        super(c0669Ei, c03621t);
        this.A00 = 10000L;
        this.A02 = c0669Ei;
    }

    private com.facebook.ads.redexgen.core.C1325bx A01(java.lang.Runnable runnable) {
        return new com.facebook.ads.redexgen.core.C1325bx(this, runnable);
    }

    private java.util.List<org.json.JSONObject> A04(com.facebook.ads.redexgen.core.C03631u c03631u) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObjectA03 = c03631u.A03();
        java.lang.String strA03 = A03(22, 12, 71);
        if (jSONObjectA03.has(strA03)) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(strA03).optInt(A03(3, 19, 62), 10000);
                org.json.JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((org.json.JSONObject) adsArray.get(i));
                    }
                }
            } catch (org.json.JSONException unused) {
                java.lang.String strA04 = A03(36, 38, 101);
                this.A02.A0E().A5F(com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR, strA04).A03().getErrorCode(), strA04);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C8X c8x) {
        this.A0C = false;
        com.facebook.ads.redexgen.core.C1324bw c1324bw = new com.facebook.ads.redexgen.core.C1324bw(this, interfaceC1369cf, com.facebook.ads.redexgen.core.LV.A02(jSONObject, A03(34, 2, 114)));
        A0G().postDelayed(c1324bw, c8x.A05());
        interfaceC1369cf.A9p(this.A02, this.A09, this.A08.A08, A01(c1324bw), jSONObject, c8x);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0O() {
        if (this.A01 != null) {
            this.A02.A0E().A4K();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0E().A4L();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0Q(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p, com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C8U c8u, final com.facebook.ads.redexgen.core.C03631u c03631u) {
        this.A02.A0E().A4E();
        final com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf = (com.facebook.ads.redexgen.core.InterfaceC1369cf) interfaceC03320p;
        if (interfaceC1369cf.AH5()) {
            final java.util.List<org.json.JSONObject> listA04 = A04(c03631u);
            A06(interfaceC1369cf, listA04.get(0), c03631u.A01());
            if (listA04.size() > 1) {
                A0G().postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.1v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0Z(interfaceC1369cf, listA04, c03631u);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC1369cf, c03631u.A03(), c03631u.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0T(java.lang.String str) {
        this.A02.A0E().A4J(str != null);
        super.A0T(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0X(boolean z) {
        super.A0X(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0Z(com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf, java.util.List list, com.facebook.ads.redexgen.core.C03631u c03631u) {
        A06(interfaceC1369cf, (org.json.JSONObject) list.get(1), c03631u.A01());
    }
}
