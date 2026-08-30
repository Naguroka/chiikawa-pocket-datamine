package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0812Kp {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"sZHdN6DnxhyjInuuwKT0RhtuIDa6RijQ", "8cuc4SRnt52u8A", "2WFcqn3uWqeuESEsgYZMEltW", "X9bY0baThRQoxJWrF88Q", "LV97W74qtL9kCw5aLEufLebev1Dp02F", "HRzTSkX2nkKPhEUot3qqZNsXHT", "Bu0g", "NlYn9LsIhiHyd3xbWzs6ij1u9O30FtmN"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static android.app.Activity A01() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> cls = java.lang.Class.forName(A02(8, 26, 55));
        java.lang.Object objInvoke = cls.getMethod(A02(34, 21, 49), new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = cls.getDeclaredField(A02(55, 11, 91));
        declaredField.setAccessible(true);
        java.util.Map map = (java.util.Map) declaredField.get(objInvoke);
        if (map == null) {
            return null;
        }
        for (java.lang.Object obj : map.values()) {
            java.lang.Class<?> cls2 = obj.getClass();
            java.lang.reflect.Field declaredField2 = cls2.getDeclaredField(A02(66, 6, 4));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(A02(0, 8, 61));
                declaredField3.setAccessible(true);
                return (android.app.Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[6].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[5] = "tITZfrjeKeNOj3ZL7JO2M2Srx7";
            strArr[2] = "270Z6IsJIOKvltqMP1US5A2c";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
            i4++;
        }
    }

    public static void A03() {
        A00 = new byte[]{101, 103, 112, 109, 114, 109, 112, 125, 111, 96, 106, 124, 97, 103, 106, 32, 111, 126, 126, 32, 79, 109, 122, 103, 120, 103, 122, 119, 90, 102, 124, 107, 111, 106, 107, 125, 122, 122, 109, 102, 124, 73, 107, 124, 97, 126, 97, 124, 113, 92, 96, 122, 109, 105, 108, 15, 35, 1, 22, 11, 20, 11, 22, 11, 7, 17, 77, 92, 72, 78, 88, 89};
    }

    static {
        A03();
    }

    public static android.app.Activity A00() {
        try {
            return A01();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
