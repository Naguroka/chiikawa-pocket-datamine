package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
class LZ {
    private final java.util.Set<java.lang.String> IL;
    private final com.bytedance.sdk.component.bg.rri bX = com.bytedance.sdk.component.bg.VzQ.bg;
    private final java.util.Set<java.lang.String> bg;
    private final com.bytedance.sdk.component.bg.tC eqN;
    private com.bytedance.sdk.component.bg.VB.bg zx;

    LZ(com.bytedance.sdk.component.bg.tC tCVar, java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) {
        this.eqN = tCVar;
        if (set == null || set.isEmpty()) {
            this.bg = new java.util.LinkedHashSet();
        } else {
            this.bg = new java.util.LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.IL = new java.util.LinkedHashSet();
        } else {
            this.IL = new java.util.LinkedHashSet(set2);
        }
    }

    final synchronized com.bytedance.sdk.component.bg.kMt bg(boolean z, java.lang.String str, com.bytedance.sdk.component.bg.IL il) throws com.bytedance.sdk.component.bg.tC.bg {
        com.bytedance.sdk.component.bg.kMt kmtIL;
        com.bytedance.sdk.component.bg.VB.bg bgVar;
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.String host = uri.getHost();
        if (host == null) {
            return null;
        }
        com.bytedance.sdk.component.bg.kMt kmt = this.IL.contains(il.bg()) ? com.bytedance.sdk.component.bg.kMt.PUBLIC : null;
        for (java.lang.String str2 : this.bg) {
            if (uri.getHost().equals(str2) || host.endsWith(".".concat(java.lang.String.valueOf(str2)))) {
                kmt = com.bytedance.sdk.component.bg.kMt.PRIVATE;
                break;
            }
        }
        if (kmt == null && (bgVar = this.zx) != null && bgVar.bg(str)) {
            if (this.zx.bg(str, il.bg())) {
                return null;
            }
            kmt = com.bytedance.sdk.component.bg.kMt.PRIVATE;
        }
        if (z) {
            kmtIL = bg(str, il);
        } else {
            kmtIL = IL(str, il);
        }
        return kmtIL != null ? kmtIL : kmt;
    }

    final synchronized com.bytedance.sdk.component.bg.kMt bg(java.lang.String str, com.bytedance.sdk.component.bg.IL il) throws com.bytedance.sdk.component.bg.tC.bg {
        return bg(str, il, true);
    }

    final synchronized com.bytedance.sdk.component.bg.kMt IL(java.lang.String str, com.bytedance.sdk.component.bg.IL il) {
        return bg(str, il, false);
    }

    void bg(com.bytedance.sdk.component.bg.VB.bg bgVar) {
        this.zx = bgVar;
    }

    void bg(com.bytedance.sdk.component.bg.rri.bg bgVar) {
        if (this.bX != null) {
            throw null;
        }
    }

    void IL(com.bytedance.sdk.component.bg.rri.bg bgVar) {
        if (this.bX != null) {
            throw null;
        }
    }

    private com.bytedance.sdk.component.bg.kMt bg(java.lang.String str, com.bytedance.sdk.component.bg.IL il, boolean z) {
        if (!z || this.eqN == null) {
            return null;
        }
        throw null;
    }
}
