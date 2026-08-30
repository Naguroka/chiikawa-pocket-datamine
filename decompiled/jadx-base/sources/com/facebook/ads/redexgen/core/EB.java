package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EB implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.EC A00;
    public final /* synthetic */ com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] A01;

    public EB(com.facebook.ads.redexgen.core.EC ec, com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] downloadActionArr) {
        this.A00 = ec;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00.A03) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.A00.A00.A0C);
            this.A00.A00.A0C.clear();
            for (com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction : this.A01) {
                this.A00.A00.A02(downloadAction);
            }
            this.A00.A00.A02 = true;
            java.util.Iterator it = this.A00.A00.A0D.iterator();
            while (it.hasNext()) {
                ((com.facebook.ads.redexgen.core.EE) it.next()).ACB(this.A00.A00);
            }
            if (!arrayList.isEmpty()) {
                this.A00.A00.A0C.addAll(arrayList);
                this.A00.A00.A0B();
            }
            this.A00.A00.A0A();
            for (int i = 0; i < this.A00.A00.A0C.size(); i++) {
                com.facebook.ads.redexgen.core.EI ei = (com.facebook.ads.redexgen.core.EI) this.A00.A00.A0C.get(i);
                if (ei.A06 == 0) {
                    this.A00.A00.A0E(ei);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
