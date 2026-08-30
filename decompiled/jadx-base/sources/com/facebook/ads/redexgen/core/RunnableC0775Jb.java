package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0775Jb implements java.lang.Runnable {
    public static byte[] A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7j A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0778Je A01;
    public final /* synthetic */ java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC0775Jb(com.facebook.ads.redexgen.core.C0778Je c0778Je, java.lang.String str, com.facebook.ads.redexgen.core.C7j c7j) {
        this.A01 = c0778Je;
        this.A02 = str;
        this.A00 = c7j;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.util.ArrayList<com.facebook.ads.redexgen.core.C0777Jd> arrayList;
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.C8F nvl = new com.facebook.ads.redexgen.core.C8F(A00(0, 3, 84));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new java.util.ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (com.facebook.ads.redexgen.core.C0777Jd c0777Jd : arrayList) {
                jSONArray.put(A00(0, 0, 23) + c0777Jd.A00 + ';' + c0777Jd.A02 + ';' + c0777Jd.A01);
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().AA1(A00(10, 9, 117), com.facebook.ads.redexgen.core.C8E.A2R, nvl);
        } catch (org.json.JSONException unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
