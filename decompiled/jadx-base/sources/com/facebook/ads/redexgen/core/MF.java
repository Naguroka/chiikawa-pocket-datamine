package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MF implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1084Vd A00;

    public MF(com.facebook.ads.redexgen.core.C1084Vd c1084Vd) {
        this.A00 = c1084Vd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
