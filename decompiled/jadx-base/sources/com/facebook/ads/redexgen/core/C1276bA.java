package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1276bA<K, V> extends com.facebook.ads.redexgen.core.AnonymousClass31<K, V> implements java.util.Map<K, V> {
    public com.facebook.ads.redexgen.core.AbstractC03932y<K, V> A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        A0D(super.A00 + map.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    private com.facebook.ads.redexgen.core.AbstractC03932y<K, V> A00() {
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.C1277bB(this);
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return A00().A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return A00().A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bA != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return A00().A0A();
    }
}
