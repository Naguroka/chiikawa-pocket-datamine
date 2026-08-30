package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.19, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass19 extends android.content.BroadcastReceiver {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"Zajbq5JOCnWrQ3Qr", "TCN1z34NH4GHaAlQvwLAm", "H6zcI", "fG9vyRzubE117ecaxLAWdwziYhb1qpFD", "HGvL5kVmbL0dgsivMgEslo9gYSg3Drcz", "onuj3", "bRQo93cAMXtZyJucWKt", "haBpxRpvqIWUs6HGbuX"};
    public android.content.Context A00;
    public com.facebook.ads.redexgen.core.C0606Bu A01;
    public boolean A02 = false;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{53, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 21, 15, 30, 9, 8, 15, 18, 15, 18, 26, 23, 85, 31, 18, 8, 11, 23, 26, 2, 30, 31, 55, 59, 57, 122, 50, 53, 55, 49, 54, 59, 59, okio.Utf8.REPLACEMENT_BYTE, 122, 53, 48, 39, 122, kotlin.io.encoding.Base64.padSymbol, 58, 32, 49, 38, 39, 32, kotlin.io.encoding.Base64.padSymbol, 32, kotlin.io.encoding.Base64.padSymbol, 53, 56, 122, 48, kotlin.io.encoding.Base64.padSymbol, 39, 36, 56, 53, 45, 49, 48, 110, 81, 66, 81, 90, 64, 73, 92, 75, 95, 86, 75, 84, 122, 77, 88, 122, 85, 80, 90, 82, 71, 82, 69, 81, 88, 69, 90, 116, 67, 86, 116, 91, 94, 84, 92, 13, 90, 69, 72, 73, 67, 101, 66, 88, 73, 94, 95, 88, 69, 88, 77, 64, 105, 90, 73, 66, 88, 105, 118, 123, 122, 112, 86, 113, 107, 122, 109, 108, 107, 118, 107, 126, 115, 90, 105, 122, 113, 107, 37};
    }

    static {
        A01();
    }

    public AnonymousClass19(com.facebook.ads.redexgen.core.C0606Bu c0606Bu, android.content.Context context) {
        this.A01 = c0606Bu;
        this.A00 = context;
    }

    public final void A02() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(A00(40, 40, 103) + this.A01.getUniqueId());
        intentFilter.addAction(A00(org.objectweb.asm.Opcodes.L2F, 22, 44) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 4) + this.A01.getUniqueId());
        com.facebook.ads.redexgen.core.C03832o.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            com.facebook.ads.redexgen.core.C03832o.A00(this.A00).A05(this);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        java.lang.String action2 = A00(0, 1, 60);
        java.lang.String[] strArrSplit = action.split(action2);
        if (strArrSplit.length != 2) {
            return;
        }
        java.lang.String str = strArrSplit[1];
        java.lang.String action3 = this.A01.getUniqueId();
        if (!str.equals(action3)) {
            return;
        }
        java.lang.String str2 = strArrSplit[0];
        java.lang.String[] strArr = A04;
        java.lang.String str3 = strArr[6];
        java.lang.String action4 = strArr[7];
        if (str3.length() == action4.length()) {
            java.lang.String[] strArr2 = A04;
            strArr2[1] = "cVmv3UmH0jQ76579UnKAx";
            strArr2[0] = "Daa9OCgAFjmRw5DI";
            java.lang.String action5 = A00(1, 39, 72);
            if (str2.equals(action5)) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().ABq();
                    this.A01.getListener().AEB();
                    return;
                }
                return;
            }
            java.lang.String str4 = strArrSplit[0];
            java.lang.String action6 = A00(116, 21, 31);
            if (str4.equals(action6)) {
                java.lang.String action7 = A00(80, 5, 7);
                java.io.Serializable serializableExtra = intent.getSerializableExtra(action7);
                if (serializableExtra instanceof com.facebook.ads.redexgen.core.R6) {
                    if (this.A01.getListener() != null) {
                        this.A01.getListener().ABw();
                        this.A01.getListener().AEB();
                    }
                    if (this.A02) {
                        this.A01.A0Y(1);
                    } else {
                        this.A01.A0Y(((com.facebook.ads.redexgen.core.R6) serializableExtra).A01());
                    }
                    this.A01.setVisibility(0);
                    this.A01.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 1);
                    return;
                }
                if (serializableExtra instanceof com.facebook.ads.redexgen.core.C1008Sf) {
                    if (this.A01.getListener() == null) {
                        return;
                    }
                    com.facebook.ads.redexgen.core.C0606Bu c0606Bu = this.A01;
                    java.lang.String[] strArr3 = A04;
                    java.lang.String str5 = strArr3[6];
                    java.lang.String action8 = strArr3[7];
                    if (str5.length() == action8.length()) {
                        java.lang.String[] strArr4 = A04;
                        strArr4[3] = "8JMcdO2ddwvsOz1l0eACjHxgYswUY7yr";
                        strArr4[4] = "ZybcsncwY6JEIQQDyQcFnHvjYhNwtivs";
                        c0606Bu.getListener().AC3();
                        return;
                    }
                } else {
                    if (serializableExtra instanceof com.facebook.ads.redexgen.core.C1007Se) {
                        if (this.A01.getListener() == null) {
                            return;
                        }
                        this.A01.getListener().AC5();
                        return;
                    }
                    if (serializableExtra instanceof com.facebook.ads.redexgen.core.C9R) {
                        if (this.A01.getListener() != null) {
                            this.A01.getListener().ABZ();
                        }
                        this.A02 = true;
                        return;
                    }
                    if (serializableExtra instanceof com.facebook.ads.redexgen.core.SZ) {
                        if (this.A01.getListener() != null) {
                            this.A01.getListener().AD1();
                        }
                        this.A02 = false;
                        return;
                    }
                    boolean z = serializableExtra instanceof com.facebook.ads.redexgen.core.C9P;
                    java.lang.String[] strArr5 = A04;
                    java.lang.String str6 = strArr5[5];
                    java.lang.String action9 = strArr5[2];
                    if (str6.length() == action9.length()) {
                        java.lang.String[] strArr6 = A04;
                        strArr6[5] = "0aNC0";
                        strArr6[2] = "prrJE";
                        if (!z || this.A01.getListener() == null) {
                            return;
                        }
                        this.A01.getListener().onPause();
                        return;
                    }
                }
            } else {
                java.lang.String str7 = strArrSplit[0];
                java.lang.String[] strArr7 = A04;
                java.lang.String str8 = strArr7[1];
                java.lang.String action10 = strArr7[0];
                if (str8.length() != action10.length()) {
                    java.lang.String[] strArr8 = A04;
                    strArr8[6] = "hQHl7K2LkQxZ3MVJZ2W";
                    strArr8[7] = "MyC8C5hgly0WituHMEy";
                    java.lang.String action11 = A00(85, 15, 10);
                    if (!str7.equals(action11)) {
                        return;
                    }
                } else {
                    java.lang.String[] strArr9 = A04;
                    strArr9[3] = "OiP3hK9qgel9CjGx7GeTViZjY0DdeBQ1";
                    strArr9[4] = "Kg9TdH9JmWDwVESkwLvI07zIYN1y95Tk";
                    java.lang.String action12 = A00(70, 4, 4);
                    if (!str7.equals(action12)) {
                        return;
                    }
                }
                this.A01.A0n();
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
