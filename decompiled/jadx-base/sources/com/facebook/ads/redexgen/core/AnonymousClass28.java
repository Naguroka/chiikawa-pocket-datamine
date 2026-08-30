package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.28, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass28 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"NpBoDzCQyjOF8OFx9MsnsgXANanqzzj6", "RSaml0mwJ5MGBXbUX4Y7eJ496TcnwqpH", "O6M6", "HC1y", "xJAb", "6P21Vz3Cvscq5f42i51asuNZrA3r2siu", "D2rYJRkohSsxhH", "5Vn2BbDuwzZpkNg8pcGLkugAGTBH17kk"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{kotlin.io.encoding.Base64.padSymbol, 32, 32, 32, 48, 48, 48, 48, 48, 48, 48, 48, 48, 33, 33, 33, 33, 33, 33, 33, 33, 49, 49, 49, 44, 78, 101, 98, 104, 101, 98, 107, 44, 120, 99, 44, 127, 105, 126, 122, 101, 111, 105, 44, 127, 121, 111, 111, 105, 127, 127, 44, 49, 44, 44, 85, 66, 89, 83, 91, 82, 72, 82, 79, 67, 69, 86, 68, 72, 92, 82, 78, 73, 78, 72, 69, 73, 95, 72, 76, 83, 89, 95, 69, 95, 66, 78, 72, 91, 73, 18, 21, 19, 30, 18, 4, 19, 23, 8, 2, 4, 30, 18, 5, 10, 30, 23, 4, 19, 18, 8, 14, 15, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93, 0, 71, 64, 90, 75, 92, 64, 79, 66, 0, 71, 94, 77, 0, 111, 91, 74, 71, 75, 64, 77, 75, 96, 75, 90, 89, 65, 92, 69, 124, 75, 67, 65, 90, 75, 125, 75, 92, 88, 71, 77, 75, 31, 19, 17, 82, 26, 29, 31, 25, 30, 19, 19, 23, 82, 23, 29, 8, 29, 18, 29};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.AnonymousClass28.class.getSimpleName();
    }

    public static void A02(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, android.os.Message message) {
        android.os.Bundle bundle = message.getData().getBundle(A00(55, 17, 118));
        if (bundle != null) {
            com.facebook.ads.redexgen.core.AbstractC05168f.A05(c1198Zr, bundle.getString(A00(90, 23, 32)), bundle.getString(A00(72, 18, 123)));
        }
    }

    public static boolean A03(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager;
        if (!A00(org.objectweb.asm.Opcodes.LOOKUPSWITCH, 19, 29).equals(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            boolean validationPassed = com.facebook.ads.internal.util.common.FbValidationUtils.isFbSigningCertificateValid(com.facebook.ads.internal.util.common.FbValidationUtils.getSigningCertificate(packageManager.getPackageInfo(str, 64)));
            return validationPassed;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    public static boolean A04(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, boolean z, android.content.ServiceConnection serviceConnection) {
        boolean forceBypassValidation;
        boolean forceBypassValidation2;
        boolean z2 = false;
        if (c1198Zr.A04().A9O()) {
            if (!z) {
                boolean zA1T = com.facebook.ads.redexgen.core.C0762Im.A1T(c1198Zr);
                if (A01[1].charAt(26) == '5') {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "wVoKdL5DefY3vFtz3wgH19EGFsYG1twM";
                if (!zA1T) {
                    forceBypassValidation = false;
                }
            }
            forceBypassValidation = true;
        } else {
            forceBypassValidation = false;
        }
        if (forceBypassValidation) {
            forceBypassValidation2 = true;
        } else {
            boolean forceBypassValidation3 = A03(c1198Zr, com.facebook.ads.redexgen.core.AbstractC0764Ip.A04(z));
            if (forceBypassValidation3) {
                forceBypassValidation2 = true;
            } else {
                forceBypassValidation2 = false;
            }
        }
        if (!forceBypassValidation2) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (z) {
            z2 = true;
        } else {
            boolean forceBypassValidation4 = c1198Zr.A04().A9O();
            if (forceBypassValidation4) {
                boolean forceBypassValidation5 = com.facebook.ads.redexgen.core.C0762Im.A1T(c1198Zr);
                if (forceBypassValidation5) {
                    z2 = true;
                }
            }
        }
        boolean zBindService = c1198Zr.bindService(intent.setComponent(new android.content.ComponentName(com.facebook.ads.redexgen.core.AbstractC0764Ip.A04(z2), A00(113, 58, 79))), serviceConnection, 1);
        boolean forceBypassValidation6 = c1198Zr.A04().A9O();
        if (forceBypassValidation6) {
            java.lang.String str = A00(13, 42, 109) + zBindService + A00(0, 13, 124);
        }
        return zBindService;
    }
}
