package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0924Oz implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"Ag1edxGPmMygd2ZYlIUVji8noIaHMiLQ", "WBm6rd5teeEdNPvhq6Xy4yUZakZyqmkG", "ECfpblw4grbEX8THFPRM2kFRttXYDoHg", "puAZOL7My1RDIFuoQdQlIGU8uD74vctF", "rOVXccWrouvhHaM6oOMABT92DHzQ0mnK", "DC0vFQcYgsBFza3ppzX1spbq624HEpuf", "poJar2xzbFJI41pUq505BIfUZ51x22BX", "IrxdQF8UtoekkpFzNw9qcg8fTKi13Wor"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;

    public ViewOnTouchListenerC0924Oz(com.facebook.ads.redexgen.core.UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                if (this.A00.A00 >= browserFinalY) {
                    return true;
                }
                com.facebook.ads.redexgen.core.UQ uq = this.A00;
                java.lang.String[] strArr = A01;
                java.lang.String str = strArr[6];
                java.lang.String str2 = strArr[2];
                int iCharAt = str.charAt(3);
                int action2 = str2.charAt(3);
                if (iCharAt == action2) {
                    throw new java.lang.RuntimeException();
                }
                A01[3] = "IGAgl0ADkCINtDuAhI065JcG0AD0YiJn";
                uq.A0g(false);
                return true;
            default:
                return true;
        }
    }
}
