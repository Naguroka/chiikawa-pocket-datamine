package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0808Kl {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"vserbkQ71L70HeExkEksLvSV50Js9e5T", "kCtue8tdTX7Ntsd63evdhPLiI5GlGyVZ", "TwC9DE0UkCmO5xuA9ppRryz5QvyD", "4CWs1R6rr7PkkffzytFACCqk28rMKWqF", "DS0L0fcRoHYALrKB9SSkXSb7384LvFtu", "e8tzsRThNax4EAToJhNq21dAKBpwgTLo", "Q0BiPrkB2PSWzVDnLZTkEnIKaCsuaheD", "rbmY91JFcJMC4pCqNbunWn9nQrXHl54t"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.EnumC0807Kk A00() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> cls = java.lang.Class.forName(A03(8, 26, 109));
        java.lang.Object objInvoke = cls.getMethod(A03(66, 21, 7), new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = cls.getDeclaredField(A03(87, 11, 29));
        declaredField.setAccessible(true);
        java.util.Map map = (java.util.Map) declaredField.get(objInvoke);
        if (map == null) {
            return com.facebook.ads.redexgen.core.EnumC0807Kk.A0C;
        }
        for (java.lang.Object obj : map.values()) {
            java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField(A03(0, 8, 73));
            declaredField2.setAccessible(true);
            android.app.Activity activity = (android.app.Activity) declaredField2.get(obj);
            if (activity.isTaskRoot() && activity.getIntent().getCategories().contains(A03(34, 32, 97))) {
                return com.facebook.ads.redexgen.core.EnumC0807Kk.A07;
            }
        }
        return com.facebook.ads.redexgen.core.EnumC0807Kk.A0A;
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[6].charAt(20) == strArr[1].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "hlZJhcxljYiKc7UKHZyQNCRGeosS0rVV";
            strArr2[7] = "L6Z1FseRPLChQnX48wkOINplJZHgpjkr";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{-37, -35, -18, -29, -16, -29, -18, -13, -1, 12, 2, 16, 13, 7, 2, -52, -1, 14, 14, -52, -33, 1, 18, 7, 20, 7, 18, 23, -14, 6, 16, 3, -1, 2, -13, 0, -10, 4, 1, -5, -10, -64, -5, 0, 6, -9, 0, 6, -64, -11, -13, 6, -9, -7, 1, 4, 11, -64, -34, -45, -25, -32, -43, -38, -41, -28, -101, -83, -86, -86, -99, -90, -84, 121, -101, -84, -95, -82, -95, -84, -79, -116, -96, -86, -99, -103, -100, -69, -113, -79, -62, -73, -60, -73, -62, -73, -77, -63};
    }

    static {
        A04();
    }

    public static com.facebook.ads.redexgen.core.EnumC0807Kk A01(android.content.Context context) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                return A02(context);
            }
            return A00();
        } catch (java.lang.Exception unused) {
            return com.facebook.ads.redexgen.core.EnumC0807Kk.A05;
        }
    }

    public static com.facebook.ads.redexgen.core.EnumC0807Kk A02(android.content.Context context) {
        if (context == null) {
            return com.facebook.ads.redexgen.core.EnumC0807Kk.A0D;
        }
        android.app.ActivityManager mgr = (android.app.ActivityManager) context.getSystemService(A03(0, 8, 73));
        if (mgr == null) {
            com.facebook.ads.redexgen.core.EnumC0807Kk enumC0807Kk = com.facebook.ads.redexgen.core.EnumC0807Kk.A08;
            if (A01[0].charAt(27) == 'o') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "W800VLcbCNBOE1f9F";
            return enumC0807Kk;
        }
        java.util.List<android.app.ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return com.facebook.ads.redexgen.core.EnumC0807Kk.A0B;
        }
        java.util.Iterator<android.app.ActivityManager.AppTask> it = tasks.iterator();
        while (it.hasNext()) {
            android.app.ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getCategories() != null && taskInfo.baseIntent.getCategories().contains(A03(34, 32, 97))) {
                return com.facebook.ads.redexgen.core.EnumC0807Kk.A06;
            }
        }
        com.facebook.ads.redexgen.core.EnumC0807Kk enumC0807Kk2 = com.facebook.ads.redexgen.core.EnumC0807Kk.A09;
        java.lang.String[] strArr = A01;
        if (strArr[3].charAt(22) == strArr[5].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[4] = "GyHEsdoLJV3XEjiFxTFX6orc2Mvnrd3k";
        strArr2[7] = "nU2m6dMK7qfy4atV1JxTmvIeg7zDsgbu";
        return enumC0807Kk2;
    }
}
