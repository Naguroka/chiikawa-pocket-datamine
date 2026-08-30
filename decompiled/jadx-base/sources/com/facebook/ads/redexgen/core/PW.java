package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PW extends android.webkit.WebChromeClient {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"hD342XNQVEXChvJ41FuJYkzzL30E7V8C", "VFqqxEswv4BXF4BUDT4NnG4IAUyY785", "G3ZSvK9EmqC1e5u7Ivg7hdOkIQzdfa68", "vFWJ81dDNXk", "PGv8G8TosU31EXJAVb0WhvumqcSTUHDE", "JPUBUdUfGKDjW9Qe8mrAO5frWlzvQ1oz", "qcwfoFOZSGXVTY97XWLRaEh5jd9GG5ia", "FIykCHI4yyfel4YrSgGCK0Zn6vKmeZ"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0926Pb A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{64, 69, 66, 73, 98, 89, 65, 78, 73, 94, 39, 47, 57, 57, 43, 45, 47, 118, 106, 112, 119, 102, 96, 76, 97};
    }

    static {
        A01();
    }

    public PW(com.facebook.ads.redexgen.core.C0926Pb c0926Pb) {
        this.A00 = c0926Pb;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() == android.webkit.ConsoleMessage.MessageLevel.ERROR) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(A00(10, 7, 124), consoleMessage.message());
                jSONObject.put(A00(0, 10, 26), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 51), consoleMessage.sourceId());
            } catch (org.json.JSONException unused) {
            }
            java.lang.String string = jSONObject.toString();
            this.A00.A0D.A04(com.facebook.ads.redexgen.core.JE.A0N, null);
            this.A00.A0E.A04(com.facebook.ads.redexgen.core.C8E.A14, string);
            this.A00.A0B.A0E().A5g(string);
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        if (A02[5].charAt(17) == '8') {
            throw new java.lang.RuntimeException();
        }
        A02[3] = "bhT1kVUsfNz";
        return zOnConsoleMessage;
    }
}
