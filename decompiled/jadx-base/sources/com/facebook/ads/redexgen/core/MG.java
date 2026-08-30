package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MG implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ android.widget.EditText A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1084Vd A01;

    public MG(com.facebook.ads.redexgen.core.C1084Vd c1084Vd, android.widget.EditText editText) {
        this.A01 = c1084Vd;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.A01.A03.execute(new com.facebook.ads.redexgen.core.C1085Ve(this, dialogInterface));
    }
}
