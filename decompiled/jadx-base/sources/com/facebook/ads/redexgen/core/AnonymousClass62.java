package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass62 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public com.facebook.ads.redexgen.core.O6 A00;
    public final com.facebook.ads.AudienceNetworkActivity A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, -128, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, -31, -42, -40, -38, -30, -38, -29, -23, -66, -39, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public AnonymousClass62(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c1199Zs;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i, int i2) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i, i2);
        }
    }

    public final com.facebook.ads.redexgen.core.QS A03(android.content.Intent intent, android.widget.RelativeLayout relativeLayout) {
        java.lang.String stringExtra = intent.getStringExtra(A00(5, 13, 116));
        if (stringExtra != null) {
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02;
            java.lang.String[] strArr = A04;
            if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
            com.facebook.ads.redexgen.core.QS qsA01 = com.facebook.ads.redexgen.core.QR.A01(c1199Zs, stringExtra);
            if (qsA01 != null) {
                relativeLayout.addView(qsA01, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            }
            return qsA01;
        }
        return null;
    }

    public final void A04() {
        if (com.facebook.ads.redexgen.core.C0762Im.A28(this.A01)) {
            A02(16777216, 16777216);
        }
    }

    public final void A05() {
        if (this.A00 != null && com.facebook.ads.redexgen.core.C0762Im.A16(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (com.facebook.ads.redexgen.core.C0762Im.A2G(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(android.content.Intent intent, com.facebook.ads.redexgen.core.KG kg, final android.widget.RelativeLayout relativeLayout) {
        if (com.facebook.ads.redexgen.core.C0762Im.A16(this.A01)) {
            com.facebook.ads.redexgen.core.KG kg2 = com.facebook.ads.redexgen.core.KG.A03;
            if (A04[1].length() == 14) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (kg != kg2 && android.os.Build.VERSION.SDK_INT >= 18) {
                this.A00 = new com.facebook.ads.redexgen.core.O6();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                com.facebook.ads.redexgen.core.O6 o6 = this.A00;
                java.lang.String placementId = this.A01.getPackageName();
                o6.A0B(placementId);
                java.lang.String placementId2 = A00(29, 11, 45);
                long longExtra = intent.getLongExtra(placementId2, 0L);
                if (longExtra != 0) {
                    this.A00.A09(longExtra);
                }
                android.widget.TextView textView = new android.widget.TextView(this.A01);
                java.lang.String placementId3 = A00(0, 5, 6);
                textView.setText(placementId3);
                textView.setTextColor(-1);
                com.facebook.ads.redexgen.core.M3.A0M(textView, android.graphics.Color.argb(org.objectweb.asm.Opcodes.IF_ICMPNE, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                final com.facebook.ads.redexgen.core.O6 o7 = this.A00;
                android.view.View.OnLongClickListener onLongClickListener = new android.view.View.OnLongClickListener(o7, relativeLayout) { // from class: com.facebook.ads.redexgen.X.5c
                    public static java.lang.String[] A02 = {"kWMETALBgXQPxa1caUNWOxECFuDqqQMg", "ZdkMlJfyQLC9xkOOBWIiDwjfHp6c9jbv", "0ZcfP2jVUcrv9OHIQZTLnU8", "f1ui83cs7IfjD0PNLw4msBb2GPSJERBF", "Csxj5aYvqiT2vPBDwP7", "SUYUZZDjraqMGfRe", "xuktTTnzvvF5Ho58lD7oBLq", ""};
                    public final android.widget.RelativeLayout A00;
                    public final com.facebook.ads.redexgen.core.O6 A01;

                    {
                        this.A01 = o7;
                        this.A00 = relativeLayout;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        if (this.A01 != null && this.A00 != null) {
                            com.facebook.ads.redexgen.core.O6 o8 = this.A01;
                            int width = this.A00.getWidth();
                            android.widget.RelativeLayout relativeLayout2 = this.A00;
                            java.lang.String[] strArr = A02;
                            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                                throw new java.lang.RuntimeException();
                            }
                            A02[7] = "";
                            o8.setBounds(0, 0, width, relativeLayout2.getHeight());
                            this.A01.A0D(!this.A01.A0E());
                        }
                        return true;
                    }
                };
                textView.setOnLongClickListener(onLongClickListener);
                relativeLayout.setOnLongClickListener(onLongClickListener);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.KG kg, boolean z) {
        if (com.facebook.ads.redexgen.core.C0762Im.A2j(this.A02)) {
            com.facebook.ads.redexgen.core.KG kg2 = com.facebook.ads.redexgen.core.KG.A03;
            if (A04[6].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (kg == kg2 && z) {
                java.lang.String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                } else {
                    A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                    A02(512, 512);
                    return;
                }
            }
        }
        this.A01.requestWindowFeature(1);
        A02(1024, 1024);
    }
}
