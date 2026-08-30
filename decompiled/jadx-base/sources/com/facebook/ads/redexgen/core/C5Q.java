package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5Q implements com.facebook.ads.internal.api.AudienceNetworkActivityApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"4LY4lS0Dtnhb2OiQyA5efrKIFR", "dGupKpVCMt4qg9mKwPVhImHWchSaWcIC", "ZyPDBV2Dgn506ClNEjHAvEDIkGgGqxcu", "6d7pmCocDfQ9ggh3dWvmWW2CO", "v0AhzTtfFBaqfNNgAD9Hm9U40nGOHxVb", "UIU6rcdX7ZqD4Xq5NwRFZisMuquIGFkO", "tB8Uz7UMZA3JApFIn70Qu6pSbr2GCqXd", "GRU7Zt0cjyIBsRz9MT2AF"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public android.content.Intent A05;
    public android.widget.RelativeLayout A06;
    public com.facebook.ads.redexgen.core.KG A07;
    public com.facebook.ads.redexgen.core.MS A08;
    public com.facebook.ads.redexgen.core.NE A09;
    public com.facebook.ads.redexgen.core.QS A0A;
    public java.lang.String A0B;
    public java.lang.String A0C;
    public boolean A0D;
    public final com.facebook.ads.AudienceNetworkActivity A0E;
    public final com.facebook.ads.internal.api.AudienceNetworkActivityApi A0F;
    public final com.facebook.ads.redexgen.core.C04455a A0G;
    public final com.facebook.ads.redexgen.core.C04545j A0H;
    public final com.facebook.ads.redexgen.core.AnonymousClass62 A0I;
    public final com.facebook.ads.redexgen.core.C1199Zs A0J;
    public final java.util.List<com.facebook.ads.redexgen.core.C5W> A0K = new java.util.ArrayList();
    public int A01 = -1;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0L = new byte[]{3, 56, 55, 52, 58, 51, 118, 34, 57, 118, okio.Utf8.REPLACEMENT_BYTE, 56, 48, 51, 36, 118, 32, okio.Utf8.REPLACEMENT_BYTE, 51, 33, 2, 47, 38, 51, 118, 48, 36, 57, 59, 118, okio.Utf8.REPLACEMENT_BYTE, 56, 34, 51, 56, 34, 118, 57, 36, 118, 37, 55, 32, 51, 50, 31, 56, 37, 34, 55, 56, 53, 51, 5, 34, 55, 34, 51, 42, 37, 20, 42, 40, okio.Utf8.REPLACEMENT_BYTE, 34, kotlin.io.encoding.Base64.padSymbol, 34, okio.Utf8.REPLACEMENT_BYTE, 50, 122, 120, 117, 117, 124, 107, 77, 96, 105, 124, 121, 118, 115, 127, 116, 110, 78, 117, 113, 127, 116, 116, 120, 122, 57, 113, 118, 116, 114, 117, 120, 120, 124, 57, 118, 115, 100, 57, 126, 121, 99, 114, 101, 100, 99, 126, 99, 126, 118, 123, 57, 115, 126, 100, 103, 123, 118, 110, 114, 115, 110, 99, 108, 102, 113, 97, 99, 114, 103, 62, 37, 60, 60, 49, 40, 59, 44, 44, 55, 58, 59, 26, 43, 51, 46, 45, 39, 45, 46, 49, 44, 42, 44, okio.Utf8.REPLACEMENT_BYTE, 55, 42, 7, 5, 18, 19, 18, 17, 30, 25, 18, 19, 56, 5, 30, 18, 25, 3, 22, 3, 30, 24, 25, 60, 18, 14, 79, 87, 85, 76, 125, 90, 72, 89, 78, 111, 89, 95, 83, 82, 88, 79, 122, 97, 81, 97, 124, 103, 107, 96, 122, 111, 122, 103, 97, 96, 112, 107, 108, 116, 112, 96, 76, 97, 14, 17, 29, 15, 44, 1, 8, 29};
    }

    static {
        A02();
    }

    public C5Q(com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.api.AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0E = audienceNetworkActivity;
        this.A0F = audienceNetworkActivityApi;
        this.A0J = com.facebook.ads.redexgen.core.C04465b.A02(audienceNetworkActivity);
        this.A0J.A0N(this);
        this.A0H = new com.facebook.ads.redexgen.core.C04545j(this.A0J, this.A0E);
        this.A0I = new com.facebook.ads.redexgen.core.AnonymousClass62(this.A0J, this.A0E);
        this.A0G = new com.facebook.ads.redexgen.core.C04455a(this, this.A0J, this.A0E);
    }

    private java.lang.String A00() {
        if (this.A07 == null || this.A07.A03() == null) {
            return A01(138, 4, 114);
        }
        return this.A07.A03();
    }

    private void A03(android.content.Intent intent, android.os.Bundle bundle) {
        java.lang.String strA01 = A01(227, 8, 90);
        java.lang.String strA02 = A01(219, 8, 39);
        java.lang.String strA03 = A01(org.objectweb.asm.Opcodes.IF_ACMPEQ, 24, 85);
        if (bundle != null) {
            android.os.Bundle bundleA02 = com.facebook.ads.redexgen.core.C0813Kq.A02(bundle, com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl.class.getClassLoader());
            this.A01 = bundleA02.getInt(strA03, -1);
            this.A0B = bundleA02.getString(strA02);
            this.A07 = (com.facebook.ads.redexgen.core.KG) bundleA02.getSerializable(strA01);
            return;
        }
        this.A01 = intent.getIntExtra(strA03, -1);
        this.A0B = intent.getStringExtra(strA02);
        this.A07 = (com.facebook.ads.redexgen.core.KG) intent.getSerializableExtra(strA01);
        this.A02 = intent.getIntExtra(A01(189, 16, 30), 0) * 1000;
    }

    public final android.widget.RelativeLayout A04() {
        return this.A06;
    }

    public final com.facebook.ads.AudienceNetworkActivity A05() {
        return this.A0E;
    }

    public final com.facebook.ads.redexgen.core.C1199Zs A06() {
        return this.A0J;
    }

    public final com.facebook.ads.redexgen.core.QS A07() {
        return this.A0A;
    }

    public final java.lang.String A08() {
        return this.A0B;
    }

    public final void A09() {
        this.A0G.A05(this.A07, this.A0B);
    }

    public final void A0A(com.facebook.ads.redexgen.core.C5W c5w) {
        this.A0K.add(c5w);
    }

    public final void A0B(com.facebook.ads.redexgen.core.C5W c5w) {
        this.A0K.remove(c5w);
    }

    public final void A0C(java.lang.String str) {
        this.A0G.A09(str, this.A0B);
    }

    public final void A0D(java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z) {
        if (this.A08 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.NE ne = this.A09;
        if (A0M[6].charAt(30) != 'X') {
            throw new java.lang.RuntimeException();
        }
        A0M[0] = "nOOhjPgmgj4ymGbfbhDfGuv2YA";
        if (ne == null) {
            this.A09 = com.facebook.ads.redexgen.core.NF.A02(this.A0J, this.A0J.A09(), str, c1z, this.A08, new com.facebook.ads.redexgen.core.C1244ab(this));
            this.A09.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        com.facebook.ads.redexgen.core.M3.A0J(this.A09);
        com.facebook.ads.redexgen.core.M3.A0T(this.A06);
        this.A06.addView(this.A09);
        this.A09.A0K();
    }

    public final void A0E(java.lang.String str, com.facebook.ads.redexgen.core.C05328v c05328v) {
        this.A0G.A08(str, c05328v, this.A0B);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        com.facebook.ads.redexgen.core.AbstractC0819Ky.A00();
        if (0 != 0) {
            throw new java.lang.NullPointerException(A01(org.objectweb.asm.Opcodes.D2I, 15, 124));
        }
        this.A0F.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0J.A0E().A2y(java.lang.String.valueOf(A05().hashCode()), i, A00());
        if (this.A0E.isFinishing()) {
            return;
        }
        this.A0G.A07(this.A07, this.A0B);
        this.A0G.A06(this.A07, this.A0B);
        this.A0F.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.A08 != null && this.A08.onActivityResult(i, i2, intent)) {
            return;
        }
        com.facebook.ads.redexgen.core.C1079Uy.A09(i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.A03;
        long currentTime = jCurrentTimeMillis - this.A04;
        this.A03 = j + currentTime;
        this.A04 = jCurrentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            java.util.Iterator<com.facebook.ads.redexgen.core.C5W> it = this.A0K.iterator();
            while (it.hasNext()) {
                if (it.next().A9J()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0F.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            java.util.HashMap map = new java.util.HashMap();
            int i = configuration.orientation;
            java.lang.String strA01 = A01(com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS, 14, 44);
            if (i == 1) {
                map.put(strA01, A01(157, 8, 124));
            } else {
                map.put(strA01, A01(129, 9, 32));
            }
            com.facebook.ads.redexgen.core.JF.A02(com.facebook.ads.redexgen.core.JE.A0K, map, this.A08 == null ? A01(0, 0, 15) : this.A08.getCurrentClientToken(), this.A0J.A09());
            this.A00 = configuration.orientation;
            this.A0H.A01();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.M5.A02();
        this.A0I.A04();
        this.A05 = com.facebook.ads.redexgen.core.C0813Kq.A01(this.A0E.getIntent(), com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl.class.getClassLoader());
        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA03 = com.facebook.ads.redexgen.core.C0813Kq.A03(this.A05);
        if (c1199ZsA03 != null) {
            com.facebook.ads.redexgen.core.C1199Zs startAdContext = this.A0J;
            startAdContext.A0L(c1199ZsA03);
        }
        A03(this.A05, bundle);
        com.facebook.ads.redexgen.core.C1199Zs startAdContext2 = this.A0J;
        startAdContext2.A0E().A2z(java.lang.String.valueOf(A05().hashCode()), A00());
        java.lang.String callerType = this.A05.getStringExtra(A01(69, 10, 59));
        this.A0I.A08(this.A07, callerType == null || !(callerType.equals(com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name()) || callerType.equals(com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name())));
        this.A06 = new android.widget.RelativeLayout(this.A0E);
        com.facebook.ads.redexgen.core.M3.A0M(this.A06, 0);
        this.A0E.setContentView(this.A06, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.content.Intent intent = this.A05;
        com.facebook.ads.redexgen.core.C1199Zs startAdContext3 = this.A0J;
        com.facebook.ads.redexgen.core.J7 j7A09 = startAdContext3.A09();
        com.facebook.ads.redexgen.core.C1199Zs startAdContext4 = this.A0J;
        this.A08 = new com.facebook.ads.redexgen.core.C5V(this, intent, j7A09, startAdContext4).A0M(this.A07, this.A06);
        if (this.A08 == null) {
            com.facebook.ads.redexgen.core.C1199Zs startAdContext5 = this.A0J;
            startAdContext5.A07().AA0(A01(58, 11, 105), com.facebook.ads.redexgen.core.C8E.A0A, new com.facebook.ads.redexgen.core.C8F(A01(0, 58, 116)));
            A09();
            finish(7);
            return;
        }
        this.A08.A9q(this.A05, bundle, this);
        this.A0G.A09(A01(90, 39, 53), this.A0B);
        this.A04 = java.lang.System.currentTimeMillis();
        this.A0A = this.A0I.A03(this.A05, this.A06);
        this.A0I.A07(this.A05, this.A07, this.A06);
        this.A00 = this.A0E.getResources().getConfiguration().orientation;
        java.lang.String callerType2 = A01(79, 11, 56);
        if (bundle != null) {
            this.A0C = bundle.getString(callerType2);
        } else {
            java.lang.String stringExtra = this.A05.getStringExtra(callerType2);
            if (A0M[7].length() != 21) {
                A0M[5] = "dMohbzPZPFL3lBhphwrH1b8arfl2r2Ch";
                this.A0C = stringExtra;
            } else {
                A0M[0] = "3wH6tZS0sHFmmn7H8QunQNd9ha";
                this.A0C = stringExtra;
            }
        }
        this.A0I.A06();
        if (A0M[7].length() != 21) {
            throw new java.lang.RuntimeException();
        }
        A0M[1] = "aldkJ30NOVt6q0NKQGcnTd28ZfXNLwwL";
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        this.A0J.A0E().A30(java.lang.String.valueOf(A05().hashCode()), A00());
        this.A0G.A04(this.A07, this.A0B);
        if (this.A06 != null) {
            this.A06.removeAllViews();
        }
        if (this.A08 != null) {
            this.A08.onDestroy();
            this.A08 = null;
        }
        this.A0I.A05();
        com.facebook.ads.redexgen.core.NE ne = this.A09;
        if (A0M[7].length() != 21) {
            throw new java.lang.RuntimeException();
        }
        A0M[6] = "yBcEH8sYDqTUUkxjXqOG2DCn3q2DEyX3";
        if (ne != null) {
            this.A09.A0J();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0J.A0E().A31(java.lang.String.valueOf(A05().hashCode()), A00());
        this.A03 += java.lang.System.currentTimeMillis() - this.A04;
        if (this.A08 != null) {
            this.A08.ACz(false);
            if (!this.A0E.isFinishing()) {
                com.facebook.ads.redexgen.core.JF.A02(com.facebook.ads.redexgen.core.JE.A0E, null, this.A08.getCurrentClientToken(), this.A0J.A09());
                this.A0D = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0J.A0E().A32(java.lang.String.valueOf(A05().hashCode()), A00());
        this.A04 = java.lang.System.currentTimeMillis();
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.MS ms = this.A08;
            if (A0M[5].charAt(17) != 'w') {
                throw new java.lang.RuntimeException();
            }
            A0M[6] = "WHwDulcP2dZca7YA0PmotSPySBaz7ZXD";
            ms.ADN(false);
            if (this.A0D) {
                com.facebook.ads.redexgen.core.JF.A02(com.facebook.ads.redexgen.core.JE.A0F, null, this.A08.getCurrentClientToken(), this.A0J.A09());
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (this.A08 != null) {
            this.A08.AFx(bundle2);
        }
        bundle2.putInt(A01(org.objectweb.asm.Opcodes.IF_ACMPEQ, 24, 85), this.A01);
        bundle2.putString(A01(219, 8, 39), this.A0B);
        bundle2.putString(A01(79, 11, 56), this.A0C);
        bundle2.putSerializable(A01(227, 8, 90), this.A07);
        com.facebook.ads.redexgen.core.C0813Kq.A09(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0J.A0E().A33(java.lang.String.valueOf(A05().hashCode()), A00());
        if (this.A01 != -1) {
            com.facebook.ads.redexgen.core.MM.A02(this.A0E, this.A01, this.A0J);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0J.A0E().A34(java.lang.String.valueOf(A05().hashCode()), A00());
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.A0F.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        A09();
        finish(5);
    }
}
