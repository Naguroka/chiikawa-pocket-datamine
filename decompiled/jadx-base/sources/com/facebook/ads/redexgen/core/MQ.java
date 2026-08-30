package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MQ extends android.widget.LinearLayout {
    public static int A00 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 56.0f);

    public abstract void A05();

    public abstract void A06();

    public abstract void A07();

    public abstract void A08(float f, int i);

    public abstract void A09(com.facebook.ads.redexgen.core.C1O c1o, boolean z);

    public abstract boolean A0A();

    public abstract android.view.View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract com.facebook.ads.redexgen.core.MP getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(android.view.View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(com.facebook.ads.redexgen.core.C1Z c1z, java.lang.String str, int i, com.facebook.ads.redexgen.core.C03481f c03481f);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(android.view.View.OnClickListener onClickListener);

    public abstract void setProgressImage(com.facebook.ads.redexgen.core.MB mb);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(java.lang.String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(com.facebook.ads.redexgen.core.MP mp);

    public MQ(android.content.Context context) {
        super(context);
    }
}
