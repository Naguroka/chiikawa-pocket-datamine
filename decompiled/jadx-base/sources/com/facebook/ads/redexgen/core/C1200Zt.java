package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1200Zt implements com.facebook.ads.redexgen.core.InterfaceC04806j {
    public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> A00 = new java.util.HashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC04806j
    public final synchronized boolean A9M(java.lang.String str, java.lang.String str2) {
        java.util.Set<java.lang.String> set;
        set = this.A00.get(str2);
        return set != null && set.contains(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04806j
    public final synchronized void A4d(java.lang.String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04806j
    public final synchronized void AGG(java.lang.String str, java.lang.String str2) {
        java.util.Set<java.lang.String> hashSet = this.A00.get(str2);
        if (hashSet == null) {
            hashSet = new java.util.HashSet<>();
            this.A00.put(str2, hashSet);
        }
        hashSet.add(str);
    }
}
