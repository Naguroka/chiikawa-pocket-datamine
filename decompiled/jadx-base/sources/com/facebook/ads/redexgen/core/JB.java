package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JB implements com.facebook.ads.redexgen.core.InterfaceC1422dj {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0766Is A00;

    public JB(com.facebook.ads.redexgen.core.C0766Is c0766Is) {
        this.A00 = c0766Is;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1422dj
    public final void ADV() {
        java.util.ArrayList arrayList;
        synchronized (this.A00.A06) {
            arrayList = new java.util.ArrayList(this.A00.A06.size());
            for (java.lang.Runnable runnable : this.A00.A06.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A06.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        if (this.A00.A00 != null) {
            this.A00.A00.ADV();
        }
    }
}
