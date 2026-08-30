package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1093Vm implements com.facebook.ads.redexgen.core.InterfaceC0830Lj {
    public final java.util.Collection<java.lang.String> A00;

    public C1093Vm() {
        this.A00 = new java.util.ArrayList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void AEb(java.lang.String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void flush() {
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
