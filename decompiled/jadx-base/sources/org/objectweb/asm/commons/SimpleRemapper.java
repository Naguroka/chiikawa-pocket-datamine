package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleRemapper extends org.objectweb.asm.commons.Remapper {
    private final java.util.Map<java.lang.String, java.lang.String> mapping;

    public SimpleRemapper(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mapping = map;
    }

    public SimpleRemapper(java.lang.String str, java.lang.String str2) {
        this.mapping = java.util.Collections.singletonMap(str, str2);
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapMethodName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String map = map(str + '.' + str2 + str3);
        return map == null ? str2 : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapInvokeDynamicMethodName(java.lang.String str, java.lang.String str2) {
        java.lang.String map = map("." + str + str2);
        return map == null ? str : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapAnnotationAttributeName(java.lang.String str, java.lang.String str2) {
        java.lang.String map = map(str + '.' + str2);
        return map == null ? str2 : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapFieldName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String map = map(str + '.' + str2);
        return map == null ? str2 : map;
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String map(java.lang.String str) {
        return this.mapping.get(str);
    }
}
