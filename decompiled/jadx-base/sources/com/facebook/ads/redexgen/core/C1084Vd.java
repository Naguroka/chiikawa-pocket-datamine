package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1084Vd implements com.facebook.ads.redexgen.core.MI {
    public static byte[] A04;
    public com.facebook.ads.redexgen.core.C1198Zr A00;
    public com.facebook.ads.redexgen.core.C8W A01;
    public com.facebook.ads.redexgen.core.InterfaceC0993Rq A02;
    public final java.util.concurrent.Executor A03;

    static {
        A06();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{98, 103, 103, 97, 100, 105, 97, 99, 102, 98, 99, 96, 103, 97, 98, 92, 87, 89, 94, 93, 91, 90, 92, 94, 86, 86, 91, 90, 93, 90, 95, 80, 90, 80, 92, 90, 80, 93, 89, 80, 80, 94, 80, 89, 88, 21, 80, 11, 15, 91, 80, 8, 88, 15, 91, 94, 93, 92, 94, 93, 95, 8, 95, 10, 95, 89, 13, 94, 89, 94, 15, 92, 11, 10, 91, 90, 10, 91, 94, 124, 115, 126, 120, 113, 109, 65, 89, 0, 79, 84, 72, 69, 82, 83, 0, 76, 79, 71, 73, 78, 0, 65, 83, 0, 89, 79, 85, 0, 84, 79, 0, 68, 69, 66, 85, 71, 31, 0, 104, 79, 87, 0, 68, 79, 0, 89, 79, 85, 0, 82, 69, 80, 82, 79, 68, 85, 67, 69, 0, 84, 72, 69, 0, 73, 83, 83, 85, 69, 31, 53, 3, 8, 2, 70, 52, 3, 22, 9, 20, 18, 62, 1, 8, 29, 73, 33, 8, 25, 25, 12, 7, 12, 13, 86, 27, 25, 25, 31, 9, 9, 37, 14, 21, 17, 31, 20, 25, 27, 14, 31, 29, 21, 8, 3, 37, 19, 30, 47, 32, 37, 41, 34, 56, 19, 56, 37, 33, 41, 99, 108, 105, 101, 110, 116, 95, 116, 111, 107, 101, 110, 89, 85, 84, 92, 83, 93, 101, 83, 94, 1, 0, 22, 6, 23, 12, 21, 17, 12, 10, 11, 47, 39, 54, 35, 38, 35, 54, 35, 57, kotlin.io.encoding.Base64.padSymbol, 39, 55, 11, kotlin.io.encoding.Base64.padSymbol, 58, 50, 59, 116, 114, 100, 115, 94, 104, 101, 100, 111, 117, 104, 103, 104, 100, 115};
    }

    public C1084Vd(java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A00 = c1199Zs.A01();
        this.A02 = com.facebook.ads.redexgen.core.S8.A01(this.A00);
        this.A03 = executor;
        this.A01 = c8w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> A02(java.lang.String str) {
        com.facebook.ads.redexgen.core.S4 s4 = new com.facebook.ads.redexgen.core.S4();
        com.facebook.ads.redexgen.core.S4 s5 = new com.facebook.ads.redexgen.core.S4();
        com.facebook.ads.redexgen.core.S4 s6 = new com.facebook.ads.redexgen.core.S4();
        s4.put(A03(257, 15, 52), com.facebook.ads.redexgen.core.C6H.A00().A03());
        s4.put(A03(220, 9, 15), A03(15, 15, 91));
        s4.put(A03(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 11, 79), A03(0, 15, 101));
        s4.put(A03(org.objectweb.asm.Opcodes.FRETURN, 12, 79), A03(30, 48, 92));
        s4.put(A03(org.objectweb.asm.Opcodes.MULTIANEWARRAY, 11, 121), (java.lang.System.currentTimeMillis() / 1000) + A03(0, 0, 108));
        java.lang.String strA09 = this.A01.A09();
        if (strA09 != null) {
            s6.put(A03(208, 12, 53), strA09);
        }
        s5.put(A03(229, 11, 80), str);
        s5.put(A03(248, 9, 97), com.facebook.ads.redexgen.core.LV.A01(s6));
        s4.A04(A03(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 8, 119), com.facebook.ads.redexgen.core.LV.A01(s5));
        return s4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(com.facebook.ads.redexgen.core.C8W c8w) {
        this.A01 = c8w;
    }

    @Override // com.facebook.ads.redexgen.core.MI
    public final void ADZ() {
        android.app.Activity activityA00 = com.facebook.ads.internal.util.activity.ActivityUtils.A00();
        if (activityA00 == null) {
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityA00);
        builder.setTitle(A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 14, 92));
        android.widget.EditText editText = new android.widget.EditText(activityA00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 21));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 40), new com.facebook.ads.redexgen.core.MF(this));
        builder.setPositiveButton(A03(org.objectweb.asm.Opcodes.FCMPL, 11, 83), new com.facebook.ads.redexgen.core.MG(this, editText));
        builder.create().show();
    }
}
