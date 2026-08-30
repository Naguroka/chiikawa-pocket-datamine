package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C6O {
    public static java.lang.String[] A00 = {"5dJOCi5t", "ElxVODxrKGpjZndubW1J77FnKIhSKHYN", "soy1HjiCChRoNLbRiMG0ONMXcD", "Jty4styG", "qizyqn1jZat7HSG1Q7H23Ody908", "FRg8IeQHaCBN0Pxo0", "h8pKjD8zMvQPgPuOzhwvVUtEvF", "a7oVZcxMQNrl1fZi2h6OeAZDf6QHjYYV"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.lang.reflect.Method A01(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.String[] strArr = A00;
            if (strArr[6].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[7] = "Wp91UfiY68my4gPNmlIjqqdWX7WJ726D";
            strArr2[1] = "UI7dA5vfWz5Ps8yQ7SrAKT8QjM9H5yDE";
            return null;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.lang.reflect.Method A02(java.lang.String str, java.lang.String str2, java.lang.Class<?>... clsArr) {
        try {
            return A01(java.lang.Class.forName(str), str2, clsArr);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static java.lang.Object A00(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
