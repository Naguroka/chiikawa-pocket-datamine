package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8N {
    public static android.hardware.Sensor A00;
    public static android.hardware.Sensor A01;
    public static android.hardware.SensorEventListener A02;
    public static android.hardware.SensorEventListener A03;
    public static android.hardware.SensorManager A04;
    public static java.util.Map<java.lang.String, java.lang.String> A05;
    public static byte[] A06;
    public static java.lang.String[] A07 = {"7eGKOt4ISMEYschr9wlyEIztBsl8", "TTJ0SjXobBHAmUaW1tlxfrBvYn82JEz6", "3LUB7Df5Ggct5yxRqYufGNynk2TYWoUK", "1I8xJgaOb9tMETkvkBJNz6jksqJjIngl", "TAh41slKxPoXkVm5KB1gRA20jOShRxma", "aZE0D3Nzia7NPpwyI7jJpGAo9RmAmb1V", "Csh6RZP7AyktK0BvOeX4eGA8IGxaL7YA", "zoHdPltVC2GSlvLv7GuoG1E6B1q8QeZx"};
    public static java.lang.String[] A08;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A09;
    public static volatile float[] A0A;
    public static volatile float[] A0B;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 3);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-123, 121, -128, -126, -126, -124, -117, -124, -111, -114, -116, -124, -109, -124, -111, 126, -48, -46, -29, -40, -27, -40, -29, -24, -91, -78, -88, -74, -77, -83, -88, 114, -83, -78, -72, -87, -78, -72, 114, -91, -89, -72, -83, -77, -78, 114, -122, -123, -104, -104, -119, -106, -99, -93, -121, -116, -123, -110, -117, -119, -120, -41, -20, -41, -33, -30, -41, -40, -30, -37, -43, -29, -37, -29, -27, -24, -17, -55, -56, -37, -37, -52, -39, -32, -107, -102, -109, -92, -103, -101, -96, -103, -100, -88, -101, -101, -107, -87, -90, -105, -103, -101, -54, -56, -47, -56, -43, -52, -58, -23, -30, -13, -30, -23, -120, -123, -118, 119, -118, 127, -123, -124, 117, -60, -76, -78, -67, -74, -37, -51, -42, -37, -41, -38, -29, -28, -47, -28, -27, -29, -79, -84, -79, -98, -87, -100, -86, -94, -86, -84, -81, -74, 125, -25, -11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A08(android.content.Context context) {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        java.lang.String strValueOf = java.lang.String.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        A09.set(strValueOf);
        A05.put(A01(92, 10, 51), strValueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new java.util.concurrent.ConcurrentHashMap();
        A08 = new java.lang.String[]{A01(org.objectweb.asm.Opcodes.DCMPG, 1, 2), A01(153, 1, 107), A01(154, 1, 120)};
        A09 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static java.lang.String A00() {
        return A09.get();
    }

    public static java.util.Map<java.lang.String, java.lang.String> A02() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> currentAnalogInfo = A05;
        map.putAll(currentAnalogInfo);
        A0C(map);
        return map;
    }

    public static /* synthetic */ void A05() {
        A07();
        if (A07[1].charAt(14) == 'b') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A07;
        strArr[7] = "1AcqPsu2XoXoOErwkGIQ3CIXDthbnRh4";
        strArr[3] = "oXx7ElW6b7VqM4292MU9YfwWEJ2ivE26";
    }

    public static synchronized void A06() {
        if (A04 != null) {
            A04.unregisterListener(A02);
        }
        A02 = null;
    }

    public static synchronized void A07() {
        if (A04 != null) {
            A04.unregisterListener(A03);
        }
        A03 = null;
    }

    public static void A09(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService(A01(16, 8, 108))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 115), java.lang.String.valueOf(memoryInfo.availMem));
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(140, 12, 58), java.lang.String.valueOf(memoryInfo.totalMem));
        }
    }

    public static void A0A(com.facebook.ads.redexgen.core.C7j c7j) {
        try {
            android.content.Intent intentA00 = com.facebook.ads.redexgen.core.L4.A00(c7j, null, new android.content.IntentFilter(A01(24, 37, 65)));
            if (intentA00 == null) {
                return;
            }
            int intExtra = intentA00.getIntExtra(A01(109, 5, 122), -1);
            int scale = intentA00.getIntExtra(A01(123, 5, 78), -1);
            int level = intentA00.getIntExtra(A01(134, 6, 109), -1);
            boolean z = level == 2 || level == 5;
            float f = 0.0f;
            if (scale > 0) {
                f = (intExtra / scale) * 100.0f;
            }
            A05.put(A01(77, 7, 100), java.lang.String.valueOf(f));
            java.util.Map<java.lang.String, java.lang.String> map = A05;
            java.lang.String strA01 = z ? A01(1, 1, 69) : A01(0, 1, 82);
            if (A07[2].charAt(27) != 89) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[6] = "2rh2rYsUsFIhg9PWxqd5qIMJGCLFZ7lY";
            strArr[4] = "Gwhc7bfiWFC7B4lewlWqcogh0J7RP8uO";
            map.put(A01(84, 8, 47), strA01);
        } catch (java.lang.IllegalArgumentException e) {
            c7j.A07().AA0(A01(102, 7, 96), com.facebook.ads.redexgen.core.C8E.A1T, new com.facebook.ads.redexgen.core.C8F(e));
        }
    }

    public static synchronized void A0B(com.facebook.ads.redexgen.core.C7j c7j) {
        A09(c7j);
        A0A(c7j);
        if (A04 == null) {
            A04 = (android.hardware.SensorManager) c7j.getSystemService(A01(128, 6, 101));
            if (A04 == null) {
                return;
            }
        }
        if (A00 == null) {
            A00 = A04.getDefaultSensor(1);
        }
        if (A01 == null) {
            A01 = A04.getDefaultSensor(4);
        }
        com.facebook.ads.redexgen.core.C8K c8k = null;
        if (A02 == null) {
            A02 = new com.facebook.ads.redexgen.core.C8L();
            if (A00 != null) {
                A04.registerListener(A02, A00, 3);
            }
        }
        if (A03 == null) {
            A03 = new com.facebook.ads.redexgen.core.C8M();
            if (A01 != null) {
                A04.registerListener(A03, A01, 3);
            }
        }
    }

    public static void A0C(java.util.Map<java.lang.String, java.lang.String> map) {
        float[] fArr = A0A;
        float[] fArr2 = A0B;
        if (fArr != null) {
            int iMin = java.lang.Math.min(A08.length, fArr.length);
            for (int i = 0; i < iMin; i++) {
                map.put(A01(2, 14, 28) + A08[i], java.lang.String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int iMin2 = java.lang.Math.min(A08.length, fArr2.length);
            for (int i2 = 0; i2 < iMin2; i2++) {
                map.put(A01(114, 9, 19) + A08[i2], java.lang.String.valueOf(fArr2[i2]));
            }
        }
    }
}
