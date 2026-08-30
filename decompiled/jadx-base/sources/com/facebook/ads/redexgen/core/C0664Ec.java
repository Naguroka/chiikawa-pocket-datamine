package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0664Ec implements android.os.Handler.Callback, com.facebook.ads.redexgen.core.XV, com.facebook.ads.redexgen.core.InterfaceC0712Gn, com.facebook.ads.redexgen.core.Eu, com.facebook.ads.redexgen.core.InterfaceC05419e, com.facebook.ads.redexgen.core.AB {
    public static byte[] A0V;
    public static java.lang.String[] A0W = {"P6YxoLhkz5ibpkstopVZVyommDCQ", "ATQddAIWQ0owYjgYaCgc", "Qvf", "B0i3rKbSIcl8mqFdJDuay5LNvvemcw4", "y6g4Ls3CGE757uBbH2iTCdPLcyck5fnI", "NEX", "Ls5ai4PwJPSlX5bzXjpt", "Xwhc7JDkSZbpBXzUBO5xvnc0Yvh1Hw2q"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public com.facebook.ads.redexgen.core.C05539q A04;
    public com.facebook.ads.redexgen.core.A1 A05;
    public com.facebook.ads.redexgen.core.Ev A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public com.facebook.ads.redexgen.core.ZA[] A0C;
    public final long A0D;
    public final android.os.Handler A0E;
    public final android.os.HandlerThread A0F;
    public final com.facebook.ads.redexgen.core.ZD A0G;
    public final com.facebook.ads.redexgen.core.ZB A0H;
    public final com.facebook.ads.redexgen.core.InterfaceC05589w A0J;
    public final com.facebook.ads.redexgen.core.AK A0L;
    public final com.facebook.ads.redexgen.core.AL A0M;
    public final com.facebook.ads.redexgen.core.AbstractC0713Go A0N;
    public final com.facebook.ads.redexgen.core.C0714Gp A0O;
    public final com.facebook.ads.redexgen.core.InterfaceC0733Hi A0P;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hs A0Q;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> A0R;
    public final boolean A0S;
    public final com.facebook.ads.redexgen.core.ZA[] A0T;
    public final com.facebook.ads.redexgen.core.AF[] A0U;
    public final com.facebook.ads.redexgen.core.C05619z A0K = new com.facebook.ads.redexgen.core.C05619z();
    public com.facebook.ads.redexgen.core.AI A06 = com.facebook.ads.redexgen.core.AI.A04;
    public final com.facebook.ads.redexgen.core.C05529p A0I = new com.facebook.ads.redexgen.core.C05529p();

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A07() throws java.io.IOException, com.facebook.ads.redexgen.core.C05449h {
        int i;
        boolean zA0q;
        long jAHK = this.A0P.AHK();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(jAHK, 10L);
            return;
        }
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        com.facebook.ads.redexgen.core.IH.A02(A06(150, 10, 16));
        A0J();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
        c05599xA0G.A08.A5W(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean z2 = true;
        for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
            za.AFe(this.A03, jElapsedRealtime);
            boolean z3 = true;
            z = z && za.A9Q();
            boolean z4 = za.A9b() || za.A9Q() || A0s(za);
            if (!z4) {
                za.AAp();
            }
            if (!z2 || !z4) {
                z3 = false;
            }
            z2 = z3;
        }
        if (!z2) {
            A0B();
        }
        long j = c05599xA0G.A02.A01;
        if (z && (j == androidx.media3.common.C.TIME_UNSET || j <= this.A05.A0A)) {
            com.facebook.ads.redexgen.core.C05609y c05609y = c05599xA0G.A02;
            java.lang.String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A0W[0] = "Jetupjz9YDH8zyEe9OFamNP6TeLH";
            if (c05609y.A05) {
                A0N(4);
                A0H();
            } else if (this.A05.A00 == 2) {
                i = this.A05.A00;
                if (A0W[1].length() != 3) {
                    A0W[0] = "AAnoVYdXRR9Z0xg61VjEQGKk3Qvi";
                    if (i == 3) {
                        if (this.A0C.length == 0) {
                            zA0q = A0q();
                            if (A0W[1].length() != 3) {
                                A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            } else {
                                A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            }
                        } else if (!z2) {
                            this.A09 = this.A08;
                            A0N(2);
                            A0H();
                        }
                    }
                } else {
                    A0W[0] = "vWon1jvwIqd7kbhWH87t3P4BvJQh";
                    if (i == 3) {
                        if (this.A0C.length == 0) {
                            zA0q = A0q();
                            if (A0W[1].length() != 3) {
                                A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            } else {
                                A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            }
                        } else if (!z2) {
                            this.A09 = this.A08;
                            A0N(2);
                            A0H();
                        }
                    }
                }
            } else {
                i = this.A05.A00;
                if (A0W[1].length() != 3) {
                    A0W[0] = "AAnoVYdXRR9Z0xg61VjEQGKk3Qvi";
                    if (i == 3) {
                        if (this.A0C.length == 0) {
                            zA0q = A0q();
                            if (A0W[1].length() != 3) {
                                A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            } else {
                                A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            }
                        } else if (!z2) {
                            this.A09 = this.A08;
                            A0N(2);
                            A0H();
                        }
                    }
                } else {
                    A0W[0] = "vWon1jvwIqd7kbhWH87t3P4BvJQh";
                    if (i == 3) {
                        if (this.A0C.length == 0) {
                            zA0q = A0q();
                            if (A0W[1].length() != 3) {
                                A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            } else {
                                A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
                                if (!zA0q) {
                                    this.A09 = this.A08;
                                    A0N(2);
                                    A0H();
                                }
                            }
                        } else if (!z2) {
                            this.A09 = this.A08;
                            A0N(2);
                            A0H();
                        }
                    }
                }
            }
        } else if (this.A05.A00 == 2 || !A0u(z2)) {
            i = this.A05.A00;
            if (A0W[1].length() != 3) {
                A0W[0] = "AAnoVYdXRR9Z0xg61VjEQGKk3Qvi";
                if (i == 3) {
                    if (this.A0C.length == 0) {
                        zA0q = A0q();
                        if (A0W[1].length() != 3) {
                            A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
                            if (!zA0q) {
                                this.A09 = this.A08;
                                A0N(2);
                                A0H();
                            }
                        } else {
                            A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
                            if (!zA0q) {
                                this.A09 = this.A08;
                                A0N(2);
                                A0H();
                            }
                        }
                    } else if (!z2) {
                        this.A09 = this.A08;
                        A0N(2);
                        A0H();
                    }
                }
            } else {
                A0W[0] = "vWon1jvwIqd7kbhWH87t3P4BvJQh";
                if (i == 3) {
                    if (this.A0C.length == 0) {
                        zA0q = A0q();
                        if (A0W[1].length() != 3) {
                            A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
                            if (!zA0q) {
                                this.A09 = this.A08;
                                A0N(2);
                                A0H();
                            }
                        } else {
                            A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
                            if (!zA0q) {
                                this.A09 = this.A08;
                                A0N(2);
                                A0H();
                            }
                        }
                    } else if (!z2) {
                        this.A09 = this.A08;
                        A0N(2);
                        A0H();
                    }
                }
            }
        } else {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        }
        if (this.A05.A00 == 2) {
            for (com.facebook.ads.redexgen.core.ZA za2 : this.A0C) {
                za2.AAp();
            }
        }
        if ((this.A08 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(jAHK, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AFb(2);
        } else {
            A0R(jAHK, 1000L);
        }
        com.facebook.ads.redexgen.core.IH.A00();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0E() throws com.facebook.ads.redexgen.core.C05449h {
        if (this.A0K.A0P()) {
            float f = this.A0G.A85().A01;
            com.facebook.ads.redexgen.core.C05599x c05599xA0H = this.A0K.A0H();
            boolean z = true;
            for (com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G(); c05599xA0G != null && c05599xA0G.A06; c05599xA0G = c05599xA0G.A01) {
                if (c05599xA0G.A0I(f)) {
                    java.lang.String[] strArr = A0W;
                    if (strArr[5].length() != strArr[2].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A0W[6] = "6mKidZrYKow0BOAnF1OB";
                    if (z) {
                        com.facebook.ads.redexgen.core.C05599x c05599xA0G2 = this.A0K.A0G();
                        boolean zA0S = this.A0K.A0S(c05599xA0G2);
                        boolean[] zArr = new boolean[this.A0T.length];
                        long jA0B = c05599xA0G2.A0B(this.A05.A0A, zA0S, zArr);
                        A0i(c05599xA0G2.A03, c05599xA0G2.A04);
                        if (this.A05.A00 != 4 && jA0B != this.A05.A0A) {
                            this.A05 = this.A05.A04(this.A05.A04, jA0B, this.A05.A01);
                            this.A0I.A04(4);
                            A0P(jA0B);
                        }
                        int i = 0;
                        boolean[] zArr2 = new boolean[this.A0T.length];
                        for (int i2 = 0; i2 < this.A0T.length; i2++) {
                            com.facebook.ads.redexgen.core.ZA za = this.A0T[i2];
                            zArr2[i2] = za.A8P() != 0;
                            com.facebook.ads.redexgen.core.FG fg = c05599xA0G2.A0A[i2];
                            if (fg != null) {
                                i++;
                            }
                            if (zArr2[i2]) {
                                if (fg != za.A8S()) {
                                    A0b(za);
                                } else if (zArr[i2]) {
                                    za.AFr(this.A03);
                                }
                            }
                        }
                        this.A05 = this.A05.A05(c05599xA0G2.A03, c05599xA0G2.A04);
                        A0p(zArr2, i);
                    } else {
                        this.A0K.A0S(c05599xA0G);
                        if (c05599xA0G.A06) {
                            c05599xA0G.A0A(java.lang.Math.max(c05599xA0G.A02.A03, c05599xA0G.A08(this.A03)), false);
                            A0i(c05599xA0G.A03, c05599xA0G.A04);
                        }
                    }
                    if (this.A05.A00 != 4) {
                        A09();
                        A0J();
                        this.A0Q.AGD(2);
                        return;
                    }
                    return;
                }
                if (c05599xA0G == c05599xA0H) {
                    z = false;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0211  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0I() throws java.io.IOException, com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.C0664Ec c0664Ec = this;
        if (c0664Ec.A07 == null) {
            return;
        }
        int i = c0664Ec.A01;
        if (A0W[0].length() == 28) {
            A0W[6] = "8D1ARm0ZBQnnZCNoomKo";
            if (i > 0) {
                c0664Ec.A07.AAo();
                return;
            }
            A0C();
            com.facebook.ads.redexgen.core.C05599x c05599xA0F = c0664Ec.A0K.A0F();
            if (c05599xA0F == null || c05599xA0F.A0H()) {
                c0664Ec.A0k(false);
            } else if (!c0664Ec.A05.A08) {
                A09();
            }
            if (!c0664Ec.A0K.A0P()) {
                return;
            }
            com.facebook.ads.redexgen.core.C05599x c05599xA0G = c0664Ec.A0K.A0G();
            com.facebook.ads.redexgen.core.C05619z c05619z = c0664Ec.A0K;
            if (A0W[3].length() != 1) {
                A0W[1] = "ouJLsfuj4L5l2nuVgaPcx";
                com.facebook.ads.redexgen.core.C05599x c05599xA0H = c05619z.A0H();
                boolean z = false;
                while (c0664Ec.A08 && c05599xA0G != c05599xA0H && c0664Ec.A03 >= c05599xA0G.A01.A00) {
                    if (z) {
                        A0A();
                    }
                    com.facebook.ads.redexgen.core.C05609y c05609y = c05599xA0G.A02;
                    if (A0W[1].length() == 3) {
                        throw new java.lang.RuntimeException();
                    }
                    A0W[7] = "0M30bmT4hYz4ZuhjE8LXlv6wVKZ562xO";
                    int i2 = c05609y.A06 ? 0 : 3;
                    com.facebook.ads.redexgen.core.C05599x c05599x = c05599xA0G;
                    c05599xA0G = c0664Ec.A0K.A0C();
                    c0664Ec.A0V(c05599x);
                    c0664Ec.A05 = c0664Ec.A05.A04(c05599xA0G.A02.A04, c05599xA0G.A02.A03, c05599xA0G.A02.A00);
                    c0664Ec.A0I.A04(i2);
                    A0J();
                    z = true;
                }
                if (c05599xA0H.A02.A05) {
                    for (int i3 = 0; i3 < c0664Ec.A0T.length; i3++) {
                        com.facebook.ads.redexgen.core.ZA za = c0664Ec.A0T[i3];
                        com.facebook.ads.redexgen.core.FG fg = c05599xA0H.A0A[i3];
                        if (fg != null && za.A8S() == fg) {
                            boolean zA8z = za.A8z();
                            if (A0W[7].charAt(28) == 'w') {
                                throw new java.lang.RuntimeException();
                            }
                            A0W[6] = "vXr9IuCvwlwtM4B4RQ4o";
                            if (zA8z) {
                                za.AGO();
                            }
                        }
                    }
                    return;
                }
                if (c05599xA0H.A01 == null) {
                    return;
                }
                com.facebook.ads.redexgen.core.C05599x c05599x2 = c05599xA0H.A01;
                if (A0W[7].charAt(28) != 'w') {
                    A0W[3] = "jJFxzY6mdlXoyZQ0oDOcGo2";
                    if (!c05599x2.A06) {
                        return;
                    }
                } else {
                    A0W[1] = "I";
                    if (!c05599x2.A06) {
                        return;
                    }
                }
                int i4 = 0;
                while (true) {
                    int length = c0664Ec.A0T.length;
                    java.lang.String[] strArr = A0W;
                    if (strArr[5].length() != strArr[2].length()) {
                        break;
                    }
                    java.lang.String[] strArr2 = A0W;
                    strArr2[5] = "x3P";
                    strArr2[2] = "8Ip";
                    if (i4 >= length) {
                        com.facebook.ads.redexgen.core.C0714Gp c0714Gp = c05599xA0H.A04;
                        com.facebook.ads.redexgen.core.C05599x c05599xA0D = c0664Ec.A0K.A0D();
                        com.facebook.ads.redexgen.core.C0714Gp c0714Gp2 = c05599xA0D.A04;
                        boolean z2 = c05599xA0D.A08.AEo() != androidx.media3.common.C.TIME_UNSET;
                        int i5 = 0;
                        while (i5 < c0664Ec.A0T.length) {
                            com.facebook.ads.redexgen.core.ZA za2 = c0664Ec.A0T[i5];
                            if (c0714Gp.A00(i5)) {
                                if (z2) {
                                    za2.AGO();
                                } else if (za2.A9N()) {
                                    continue;
                                } else {
                                    com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710GlA00 = c0714Gp2.A01.A00(i5);
                                    boolean zA00 = c0714Gp2.A00(i5);
                                    boolean z3 = c0664Ec.A0U[i5].A8a() == 5;
                                    com.facebook.ads.redexgen.core.AG ag = c0714Gp.A03[i5];
                                    com.facebook.ads.redexgen.core.AG ag2 = c0714Gp2.A03[i5];
                                    if (zA00) {
                                        boolean zEquals = ag2.equals(ag);
                                        if (A0W[0].length() != 28) {
                                            throw new java.lang.RuntimeException();
                                        }
                                        A0W[1] = "RcCRQWS";
                                        if (!zEquals || z3) {
                                            za2.AGO();
                                        } else {
                                            za2.AFh(A0v(interfaceC0710GlA00), c05599xA0D.A0A[i5], c05599xA0D.A07());
                                        }
                                    } else {
                                        za2.AGO();
                                    }
                                }
                            }
                            i5++;
                            c0664Ec = this;
                        }
                        return;
                    }
                    com.facebook.ads.redexgen.core.ZA za3 = c0664Ec.A0T[i4];
                    com.facebook.ads.redexgen.core.FG fg2 = c05599xA0H.A0A[i4];
                    if (za3.A8S() != fg2) {
                        return;
                    }
                    if (fg2 != null && !za3.A8z()) {
                        return;
                    } else {
                        i4++;
                    }
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static void A0K() {
        A0V = new byte[]{-59, -8, -17, -48, -20, -31, -7, -27, -14, -55, -19, -16, -20, -55, -18, -12, -27, -14, -18, -31, -20, -74, -23, -32, -63, -35, -46, -22, -42, -29, -70, -34, -31, -35, -70, -33, -27, -42, -29, -33, -46, -35, -85, -71, -46, -33, -43, -35, -42, -29, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -57, -43, -43, -61, -55, -57, -43, -126, -43, -57, -48, -42, -126, -61, -56, -42, -57, -44, -126, -44, -57, -50, -57, -61, -43, -57, -112, 5, 42, 48, 33, 46, 42, 29, 40, -36, 46, 49, 42, 48, 37, 41, 33, -36, 33, 46, 46, 43, 46, -22, 23, 51, 40, 64, 41, 40, 42, 50, -25, 44, 57, 57, 54, 57, -11, -17, 11, 17, 14, -1, 1, -68, 1, 14, 14, 11, 14, -54, -61, -28, -33, -32, -112, -42, -47, -39, -36, -43, -44, -98, -50, -39, -67, -39, -41, -49, -63, -39, -36, -43};
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e3, code lost:
    
        if (r6 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e9, code lost:
    
        if (r9.A01() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        r14.A05 = r14.A05.A04(r9, A02(r9, r1), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fa, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0203, code lost:
    
        if (r6 == false) goto L77;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0S(com.facebook.ads.redexgen.core.C05509n c05509n) throws com.facebook.ads.redexgen.core.C05449h {
        if (c05509n.A01 != this.A07) {
            return;
        }
        com.facebook.ads.redexgen.core.AM am = this.A05.A03;
        com.facebook.ads.redexgen.core.AM am2 = c05509n.A00;
        java.lang.Object obj = c05509n.A02;
        this.A0K.A0N(am2);
        this.A05 = this.A05.A03(am2, obj);
        A0F();
        if (this.A01 > 0) {
            this.A0I.A03(this.A01);
            this.A01 = 0;
            if (this.A04 == null) {
                if (this.A05.A02 == androidx.media3.common.C.TIME_UNSET) {
                    if (am2.A0E()) {
                        A08();
                        return;
                    }
                    android.util.Pair<java.lang.Integer, java.lang.Long> pairA05 = A05(am2, am2.A05(this.A0B), androidx.media3.common.C.TIME_UNSET);
                    int iIntValue = ((java.lang.Integer) pairA05.first).intValue();
                    long jLongValue = ((java.lang.Long) pairA05.second).longValue();
                    com.facebook.ads.redexgen.core.Et etA0L = this.A0K.A0L(iIntValue, jLongValue);
                    this.A05 = this.A05.A04(etA0L, etA0L.A01() ? 0L : jLongValue, jLongValue);
                    return;
                }
                return;
            }
            android.util.Pair<java.lang.Integer, java.lang.Long> pairA04 = A04(this.A04, true);
            if (A0W[3].length() != 1) {
                A0W[0] = "A4WswBfUPgH0eK889Twm6xcf29tt";
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue2 = ((java.lang.Integer) pairA04.first).intValue();
                long jLongValue2 = ((java.lang.Long) pairA04.second).longValue();
                com.facebook.ads.redexgen.core.Et etA0L2 = this.A0K.A0L(iIntValue2, jLongValue2);
                this.A05 = this.A05.A04(etA0L2, etA0L2.A01() ? 0L : jLongValue2, jLongValue2);
                return;
            }
        } else {
            int i = this.A05.A04.A02;
            long j = this.A05.A01;
            if (!am.A0E()) {
                com.facebook.ads.redexgen.core.C05599x c05599xA0E = this.A0K.A0E();
                int iA04 = am2.A04(c05599xA0E == null ? am.A0A(i, this.A0L, true).A03 : c05599xA0E.A09);
                if (iA04 != -1) {
                    if (iA04 != i) {
                        this.A05 = this.A05.A01(iA04);
                    }
                    com.facebook.ads.redexgen.core.Et et = this.A05.A04;
                    if (et.A01()) {
                        com.facebook.ads.redexgen.core.Et etA0L3 = this.A0K.A0L(iA04, j);
                        boolean zEquals = etA0L3.equals(et);
                        java.lang.String[] strArr = A0W;
                        if (strArr[5].length() != strArr[2].length()) {
                            A0W[0] = "w9UaPxjzUMnbLxrOC5RyR6aSqRWK";
                        } else {
                            A0W[7] = "CrKixgnMYTd0duWjm1C02lLmQdQo8tCF";
                        }
                    }
                    if (this.A0K.A0U(et, this.A03)) {
                        return;
                    }
                    A0j(false);
                    return;
                }
                int iA01 = A01(i, am, am2);
                if (iA01 == -1) {
                    A08();
                    return;
                }
                android.util.Pair<java.lang.Integer, java.lang.Long> pairA06 = A05(am2, am2.A09(iA01, this.A0L).A00, androidx.media3.common.C.TIME_UNSET);
                int iIntValue3 = ((java.lang.Integer) pairA06.first).intValue();
                long jLongValue3 = ((java.lang.Long) pairA06.second).longValue();
                com.facebook.ads.redexgen.core.Et etA0L4 = this.A0K.A0L(iIntValue3, jLongValue3);
                am2.A0A(iIntValue3, this.A0L, true);
                if (c05599xA0E != null) {
                    java.lang.Object obj2 = this.A0L.A03;
                    c05599xA0E.A02 = c05599xA0E.A02.A00(-1);
                    while (c05599xA0E.A01 != null) {
                        c05599xA0E = c05599xA0E.A01;
                        if (c05599xA0E.A09.equals(obj2)) {
                            c05599xA0E.A02 = this.A0K.A0J(c05599xA0E.A02, iIntValue3);
                        } else {
                            c05599xA0E.A02 = c05599xA0E.A02.A00(-1);
                        }
                    }
                }
                this.A05 = this.A05.A04(etA0L4, A02(etA0L4, etA0L4.A01() ? 0L : jLongValue3), jLongValue3);
                return;
            }
            if (am2.A0E()) {
                return;
            }
            com.facebook.ads.redexgen.core.Et etA0L5 = this.A0K.A0L(i, j);
            com.facebook.ads.redexgen.core.A1 a1 = this.A05;
            if (A0W[7].charAt(28) != 'w') {
                java.lang.String[] strArr2 = A0W;
                strArr2[5] = "rHW";
                strArr2[2] = "pVj";
                this.A05 = a1.A04(etA0L5, etA0L5.A01() ? 0L : j, j);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0T(com.facebook.ads.redexgen.core.C05539q c05539q) throws java.lang.Throwable {
        long jLongValue;
        com.facebook.ads.redexgen.core.Et etA0L;
        long jLongValue2;
        boolean z;
        this.A0I.A03(1);
        android.util.Pair<java.lang.Integer, java.lang.Long> pairA04 = A04(c05539q, true);
        if (pairA04 == null) {
            etA0L = new com.facebook.ads.redexgen.core.Et(A00());
            jLongValue2 = androidx.media3.common.C.TIME_UNSET;
            jLongValue = androidx.media3.common.C.TIME_UNSET;
            z = true;
        } else {
            int iIntValue = ((java.lang.Integer) pairA04.first).intValue();
            jLongValue = ((java.lang.Long) pairA04.second).longValue();
            etA0L = this.A0K.A0L(iIntValue, jLongValue);
            if (etA0L.A01()) {
                jLongValue2 = 0;
                z = true;
            } else {
                jLongValue2 = ((java.lang.Long) pairA04.second).longValue();
                z = c05539q.A01 == androidx.media3.common.C.TIME_UNSET;
                if (A0W[0].length() != 28) {
                    throw new java.lang.RuntimeException();
                }
                A0W[1] = "UuoINsjc5lh8rbqPpYkSw8";
            }
        }
        try {
            try {
                if (this.A07 == null || this.A01 > 0) {
                    this.A04 = c05539q;
                } else {
                    try {
                        if (jLongValue2 == androidx.media3.common.C.TIME_UNSET) {
                            A0N(4);
                            A0o(false, true, false);
                        } else {
                            long jA6L = jLongValue2;
                            if (etA0L.equals(this.A05.A04)) {
                                com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
                                if (c05599xA0G != null && jA6L != 0) {
                                    jA6L = c05599xA0G.A08.A6L(jA6L, this.A06);
                                }
                                if (com.facebook.ads.redexgen.core.AbstractC05389b.A01(jA6L) == com.facebook.ads.redexgen.core.AbstractC05389b.A01(this.A05.A0A)) {
                                    this.A05 = this.A05.A04(etA0L, this.A05.A0A, jLongValue);
                                    if (z) {
                                        this.A0I.A04(2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            long jA02 = A02(etA0L, jA6L);
                            z |= jLongValue2 != jA02;
                            jLongValue2 = jA02;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        this.A05 = this.A05.A04(etA0L, jLongValue2, jLongValue);
                        if (z) {
                            this.A0I.A04(2);
                        }
                        throw th;
                    }
                }
                this.A05 = this.A05.A04(etA0L, jLongValue2, jLongValue);
                if (z) {
                    com.facebook.ads.redexgen.core.C05529p c05529p = this.A0I;
                    if (A0W[7].charAt(28) == 'w') {
                        c05529p.A04(2);
                    } else {
                        A0W[7] = "XXfS5SPGFZLKGuN4beZnLDpFPKgKSg7e";
                        c05529p.A04(2);
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    static {
        A0K();
    }

    public C0664Ec(com.facebook.ads.redexgen.core.ZA[] zaArr, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.C0714Gp c0714Gp, com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w, boolean z, int i, boolean z2, android.os.Handler handler, com.facebook.ads.redexgen.core.ZB zb, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        this.A0T = zaArr;
        this.A0N = abstractC0713Go;
        this.A0O = c0714Gp;
        this.A0J = interfaceC05589w;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = zb;
        this.A0P = interfaceC0733Hi;
        this.A0D = interfaceC05589w.A6T();
        this.A0S = interfaceC05589w.AFs();
        this.A05 = new com.facebook.ads.redexgen.core.A1(com.facebook.ads.redexgen.core.AM.A01, androidx.media3.common.C.TIME_UNSET, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.A04, c0714Gp);
        this.A0U = new com.facebook.ads.redexgen.core.AF[zaArr.length];
        for (int i2 = 0; i2 < zaArr.length; i2++) {
            zaArr[i2].AGS(i2);
            this.A0U[i2] = zaArr[i2].A6g();
        }
        this.A0G = new com.facebook.ads.redexgen.core.ZD(this, interfaceC0733Hi);
        this.A0R = new java.util.ArrayList<>();
        this.A0C = new com.facebook.ads.redexgen.core.ZA[0];
        this.A0M = new com.facebook.ads.redexgen.core.AL();
        this.A0L = new com.facebook.ads.redexgen.core.AK();
        abstractC0713Go.A00(this);
        this.A0F = new android.os.HandlerThread(A06(21, 29, 23), -16);
        this.A0F.start();
        this.A0Q = interfaceC0733Hi.A4y(this.A0F.getLooper(), this);
    }

    private int A00() {
        com.facebook.ads.redexgen.core.AM am = this.A05.A03;
        if (am.A0E()) {
            return 0;
        }
        com.facebook.ads.redexgen.core.AL alA0B = am.A0B(am.A05(this.A0B), this.A0M);
        if (A0W[3].length() == 1) {
            throw new java.lang.RuntimeException();
        }
        A0W[7] = "PHJg0XpOhfW99vW7Kex5sTOYyXlu8lIY";
        return alA0B.A00;
    }

    private int A01(int i, com.facebook.ads.redexgen.core.AM am, com.facebook.ads.redexgen.core.AM am2) {
        int iA03 = i;
        int maxIterations = -1;
        int iA00 = am.A00();
        for (int i2 = 0; i2 < iA00 && maxIterations == -1; i2++) {
            iA03 = am.A03(iA03, this.A0L, this.A0M, this.A02, this.A0B);
            if (iA03 == -1) {
                break;
            }
            maxIterations = am2.A04(am.A0A(iA03, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(com.facebook.ads.redexgen.core.Et et, long j) throws com.facebook.ads.redexgen.core.C05449h {
        return A03(et, j, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(com.facebook.ads.redexgen.core.Et et, long j, boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        A0H();
        this.A09 = false;
        A0N(2);
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        com.facebook.ads.redexgen.core.C05599x c05599xA0C = c05599xA0G;
        while (c05599xA0C != null) {
            if (A0t(et, j, c05599xA0C)) {
                this.A0K.A0S(c05599xA0C);
                break;
            }
            c05599xA0C = this.A0K.A0C();
        }
        if (c05599xA0G != c05599xA0C || z) {
            for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
                A0b(za);
            }
            this.A0C = new com.facebook.ads.redexgen.core.ZA[0];
            c05599xA0G = null;
        }
        if (c05599xA0C != null) {
            A0V(c05599xA0G);
            if (c05599xA0C.A05) {
                j = c05599xA0C.A08.AGB(j);
                c05599xA0C.A08.A5W(j - this.A0D, this.A0S);
            }
            A0P(j);
            if (A0W[3].length() == 1) {
                throw new java.lang.RuntimeException();
            }
            A0W[0] = "LTHjNlNPyjt4lBWFjaooWNRC6TUk";
            A09();
        } else {
            this.A0K.A0O(true);
            A0P(j);
        }
        this.A0Q.AGD(2);
        return j;
    }

    private android.util.Pair<java.lang.Integer, java.lang.Long> A04(com.facebook.ads.redexgen.core.C05539q c05539q, boolean z) {
        int iA01;
        com.facebook.ads.redexgen.core.AM am = this.A05.A03;
        com.facebook.ads.redexgen.core.AM am2 = c05539q.A02;
        if (am.A0E()) {
            return null;
        }
        if (am2.A0E()) {
            am2 = am;
        }
        try {
            android.util.Pair<java.lang.Integer, java.lang.Long> pairA07 = am2.A07(this.A0M, this.A0L, c05539q.A00, c05539q.A01);
            if (am == am2) {
                return pairA07;
            }
            int iA04 = am.A04(am2.A0A(((java.lang.Integer) pairA07.first).intValue(), this.A0L, true).A03);
            if (iA04 != -1) {
                return android.util.Pair.create(java.lang.Integer.valueOf(iA04), (java.lang.Long) pairA07.second);
            }
            if (!z || (iA01 = A01(((java.lang.Integer) pairA07.first).intValue(), am2, am)) == -1) {
                return null;
            }
            return A05(am, am.A09(iA01, this.A0L).A00, androidx.media3.common.C.TIME_UNSET);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.facebook.ads.redexgen.core.C05579v(am, c05539q.A00, c05539q.A01);
        }
    }

    private android.util.Pair<java.lang.Integer, java.lang.Long> A05(com.facebook.ads.redexgen.core.AM am, int i, long j) {
        return am.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        com.facebook.ads.redexgen.core.C05599x c05599xA0F = this.A0K.A0F();
        long nextLoadPositionUs = c05599xA0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean zAGi = this.A0J.AGi(nextLoadPositionUs - c05599xA0F.A08(this.A03), this.A0G.A85().A01);
        A0k(zAGi);
        if (zAGi) {
            c05599xA0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            android.os.Handler handler = this.A0E;
            int i2 = this.A0I.A01;
            if (this.A0I.A03) {
                com.facebook.ads.redexgen.core.C05529p c05529p = this.A0I;
                if (A0W[1].length() == 3) {
                    throw new java.lang.RuntimeException();
                }
                A0W[1] = "RB7sIkNoTcpey07ODT8uORIhWJm";
                i = c05529p.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws java.io.IOException {
        com.facebook.ads.redexgen.core.C05599x c05599xA0F = this.A0K.A0F();
        com.facebook.ads.redexgen.core.C05599x c05599xA0H = this.A0K.A0H();
        if (c05599xA0F != null) {
            boolean z = c05599xA0F.A06;
            if (A0W[4].charAt(4) == 'c') {
                throw new java.lang.RuntimeException();
            }
            A0W[7] = "N5Rg0nMtUPutdorU0pcWvntmMyKPkn9g";
            if (!z) {
                if (c05599xA0H != null) {
                    com.facebook.ads.redexgen.core.C05599x loadingPeriodHolder = c05599xA0H.A01;
                    if (loadingPeriodHolder != c05599xA0F) {
                        return;
                    }
                }
                for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
                    if (!za.A8z()) {
                        return;
                    }
                }
                c05599xA0F.A08.AAn();
            }
        }
    }

    private void A0C() throws java.io.IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            com.facebook.ads.redexgen.core.C05609y c05609yA0I = this.A0K.A0I(this.A03, this.A05);
            java.lang.String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A0W[3] = "fu6rtQYuGz66gCmV8yC70qEpQFTVY";
            if (c05609yA0I == null) {
                this.A07.AAo();
                return;
            }
            com.facebook.ads.redexgen.core.XU mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A6O(), this.A07, this.A05.A03.A0A(c05609yA0I.A04.A02, this.A0L, true).A03, c05609yA0I);
            mediaPeriod.AEX(this, c05609yA0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ADK();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        java.util.Collections.sort(this.A0R);
    }

    private void A0G() throws com.facebook.ads.redexgen.core.C05449h {
        this.A09 = false;
        this.A0G.A05();
        for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
            za.start();
        }
    }

    private void A0H() throws com.facebook.ads.redexgen.core.C05449h {
        this.A0G.A06();
        for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
            A0c(za);
        }
    }

    private void A0J() throws com.facebook.ads.redexgen.core.C05449h {
        long jA0C;
        if (!this.A0K.A0P()) {
            return;
        }
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        long jAEo = c05599xA0G.A08.AEo();
        if (jAEo != androidx.media3.common.C.TIME_UNSET) {
            A0P(jAEo);
            if (jAEo != this.A05.A0A) {
                this.A05 = this.A05.A04(this.A05.A04, jAEo, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long jA08 = c05599xA0G.A08(this.A03);
            A0Q(this.A05.A0A, jA08);
            this.A05.A0A = jA08;
        }
        com.facebook.ads.redexgen.core.A1 a1 = this.A05;
        if (this.A0C.length == 0) {
            jA0C = c05599xA0G.A02.A01;
        } else {
            jA0C = c05599xA0G.A0C(true);
        }
        a1.A09 = jA0C;
    }

    private void A0L(float f) {
        for (com.facebook.ads.redexgen.core.C05599x c05599xA0E = this.A0K.A0E(); c05599xA0E != null; c05599xA0E = c05599xA0E.A01) {
            com.facebook.ads.redexgen.core.C0714Gp c0714Gp = c05599xA0E.A04;
            java.lang.String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0W;
            strArr2[5] = "3Do";
            strArr2[2] = "at3";
            if (c0714Gp != null) {
                for (com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl : c05599xA0E.A04.A01.A01()) {
                    if (interfaceC0710Gl != null) {
                        interfaceC0710Gl.AD5(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws com.facebook.ads.redexgen.core.C05449h {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    private void A0O(int i, boolean z, int i2) throws com.facebook.ads.redexgen.core.C05449h {
        boolean z2;
        boolean z3;
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        com.facebook.ads.redexgen.core.ZA za = this.A0T[i];
        this.A0C[i2] = za;
        if (za.A8P() == 0) {
            com.facebook.ads.redexgen.core.AG ag = c05599xA0G.A04.A03[i];
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArrA0v = A0v(c05599xA0G.A04.A01.A00(i));
            if (this.A08) {
                int i3 = this.A05.A00;
                if (A0W[1].length() == 3) {
                    throw new java.lang.RuntimeException();
                }
                A0W[4] = "QRz84tIq3wllCeb1capmh87EbVgo0fYM";
                if (i3 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (A0W[0].length() != 28) {
                A0W[1] = "nWHC8GobiUTV1BRDhLkuPrvX5";
                if (!z) {
                    z3 = z2;
                }
                za.A5r(ag, formatArrA0v, c05599xA0G.A0A[i], this.A03, z3, c05599xA0G.A07());
                this.A0G.A09(za);
                if (z2) {
                    za.start();
                }
            }
            java.lang.String[] strArr = A0W;
            strArr[5] = "o7g";
            strArr[2] = "UGX";
            if (!z) {
                if (z2) {
                }
            }
            za.A5r(ag, formatArrA0v, c05599xA0G.A0A[i], this.A03, z3, c05599xA0G.A07());
            this.A0G.A09(za);
            if (z2) {
                za.start();
            }
            za.A5r(ag, formatArrA0v, c05599xA0G.A0A[i], this.A03, z3, c05599xA0G.A07());
            this.A0G.A09(za);
            if (z2) {
                za.start();
            }
        }
    }

    private void A0P(long j) throws com.facebook.ads.redexgen.core.C05449h {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
            za.AFr(this.A03);
            if (A0W[7].charAt(28) == 'w') {
                throw new java.lang.RuntimeException();
            }
            A0W[6] = "Dkk1xe1nETG6SQ7gXcWE";
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    private void A0Q(long j, long j2) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.C05519o c05519o;
        com.facebook.ads.redexgen.core.C05519o nextInfo;
        int currentPeriodIndex;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            if (A0W[3].length() == 1) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0W;
            strArr[5] = "UYO";
            strArr[2] = "0LN";
            j--;
        }
        int i = this.A05.A04.A02;
        int currentPeriodIndex2 = this.A00;
        if (currentPeriodIndex2 > 0) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList = this.A0R;
            int currentPeriodIndex3 = this.A00;
            c05519o = arrayList.get(currentPeriodIndex3 - 1);
        } else {
            c05519o = null;
        }
        while (c05519o != null && (c05519o.A00 > i || (c05519o.A00 == i && c05519o.A01 > j))) {
            int currentPeriodIndex4 = this.A00;
            this.A00 = currentPeriodIndex4 - 1;
            int currentPeriodIndex5 = this.A00;
            if (currentPeriodIndex5 > 0) {
                java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList2 = this.A0R;
                int currentPeriodIndex6 = this.A00;
                c05519o = arrayList2.get(currentPeriodIndex6 - 1);
            } else {
                c05519o = null;
            }
        }
        int i2 = this.A00;
        int currentPeriodIndex7 = this.A0R.size();
        if (i2 < currentPeriodIndex7) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList3 = this.A0R;
            int i3 = this.A00;
            if (A0W[3].length() != 1) {
                A0W[0] = "c0Vil5lboCNidZY6BmCz1ZEz0EcK";
                nextInfo = arrayList3.get(i3);
            } else {
                com.facebook.ads.redexgen.core.C05519o nextInfo2 = arrayList3.get(i3);
                nextInfo = nextInfo2;
            }
        } else {
            nextInfo = null;
        }
        while (nextInfo != null && nextInfo.A02 != null) {
            int i4 = nextInfo.A00;
            if (A0W[4].charAt(4) == 'c') {
                if (i4 >= i) {
                    currentPeriodIndex = nextInfo.A00;
                    if (currentPeriodIndex != i) {
                        break;
                    }
                    break;
                    break;
                }
            } else {
                A0W[0] = "lW6wsMvGZaRYePqR3daIBDekJBJt";
                if (i4 >= i) {
                    currentPeriodIndex = nextInfo.A00;
                    if (currentPeriodIndex != i || nextInfo.A01 > j) {
                        break;
                    }
                }
            }
            int currentPeriodIndex8 = this.A00;
            this.A00 = currentPeriodIndex8 + 1;
            int i5 = this.A00;
            int currentPeriodIndex9 = this.A0R.size();
            if (i5 < currentPeriodIndex9) {
                java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList4 = this.A0R;
                int currentPeriodIndex10 = this.A00;
                com.facebook.ads.redexgen.core.C05519o nextInfo3 = arrayList4.get(currentPeriodIndex10);
                nextInfo = nextInfo3;
            } else {
                nextInfo = null;
            }
        }
        while (nextInfo != null && nextInfo.A02 != null) {
            int currentPeriodIndex11 = nextInfo.A00;
            if (currentPeriodIndex11 == i && nextInfo.A01 > j && nextInfo.A01 <= j2) {
                A0Z(nextInfo.A03);
                if (nextInfo.A03.A0B() || nextInfo.A03.A0D()) {
                    java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList5 = this.A0R;
                    int currentPeriodIndex12 = this.A00;
                    arrayList5.remove(currentPeriodIndex12);
                } else {
                    int currentPeriodIndex13 = this.A00;
                    this.A00 = currentPeriodIndex13 + 1;
                }
                int i6 = this.A00;
                int currentPeriodIndex14 = this.A0R.size();
                if (i6 < currentPeriodIndex14) {
                    java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList6 = this.A0R;
                    int currentPeriodIndex15 = this.A00;
                    com.facebook.ads.redexgen.core.C05519o nextInfo4 = arrayList6.get(currentPeriodIndex15);
                    nextInfo = nextInfo4;
                } else {
                    nextInfo = null;
                }
            } else {
                return;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.AFb(2);
        this.A0Q.AGE(2, j + j2);
    }

    private void A0V(com.facebook.ads.redexgen.core.C05599x c05599x) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        if (c05599xA0G == null || c05599x == c05599xA0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        for (int i2 = 0; i2 < this.A0T.length; i2++) {
            com.facebook.ads.redexgen.core.ZA za = this.A0T[i2];
            zArr[i2] = za.A8P() != 0;
            if (c05599xA0G.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!c05599xA0G.A04.A00(i2) || (za.A9N() && za.A8S() == c05599x.A0A[i2]))) {
                A0b(za);
            }
        }
        this.A05 = this.A05.A05(c05599xA0G.A03, c05599xA0G.A04);
        A0p(zArr, i);
    }

    private void A0W(com.facebook.ads.redexgen.core.A2 a2) {
        this.A0G.AGa(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(com.facebook.ads.redexgen.core.AD ad) throws com.facebook.ads.redexgen.core.C05449h {
        if (ad.A0D()) {
            return;
        }
        try {
            ad.A04().A8t(ad.A00(), ad.A09());
        } finally {
            ad.A0A(true);
        }
    }

    private void A0Y(com.facebook.ads.redexgen.core.AD ad) throws com.facebook.ads.redexgen.core.C05449h {
        if (ad.A02() == androidx.media3.common.C.TIME_UNSET) {
            A0Z(ad);
            return;
        }
        if (this.A07 != null) {
            int i = this.A01;
            if (A0W[0].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            A0W[1] = "o1ZfKzJk47hV";
            if (i <= 0) {
                com.facebook.ads.redexgen.core.C05519o c05519o = new com.facebook.ads.redexgen.core.C05519o(ad);
                if (!A0r(c05519o)) {
                    if (A0W[7].charAt(28) != 'w') {
                        A0W[3] = "aTDMkEWwCUERProrJoKbugoPR0RLmehL";
                        ad.A0A(false);
                        return;
                    } else {
                        A0W[7] = "nEAZXjO4i2eVoKfOQOzMBl4A0pmuVndx";
                        ad.A0A(false);
                        return;
                    }
                }
                java.util.ArrayList<com.facebook.ads.redexgen.core.C05519o> arrayList = this.A0R;
                if (A0W[7].charAt(28) == 'w') {
                    A0W[7] = "fj1HQu0C9Tc3paKg3KNI1jKNCUFeknU2";
                    arrayList.add(c05519o);
                    java.util.Collections.sort(this.A0R);
                    return;
                } else {
                    A0W[6] = "0jg7HAqbvnSBdqVDarqZ";
                    arrayList.add(c05519o);
                    java.util.Collections.sort(this.A0R);
                    return;
                }
            }
        }
        this.A0R.add(new com.facebook.ads.redexgen.core.C05519o(ad));
    }

    private void A0Z(com.facebook.ads.redexgen.core.AD ad) throws com.facebook.ads.redexgen.core.C05449h {
        if (ad.A03().getLooper() == this.A0Q.A7j()) {
            A0X(ad);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AGD(2);
                return;
            }
            return;
        }
        this.A0Q.AB1(15, ad).sendToTarget();
    }

    private void A0a(final com.facebook.ads.redexgen.core.AD ad) {
        ad.A03().post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.9m
            public static byte[] A02;
            public static java.lang.String[] A03 = {"vvB9T8WK7bT4nFgbnm6TlGuNwpdmRtb5", "Hfw1oyg0BzWOVhb4zu8ELKkOELcM4f2B", "gmAcFU6mn3n0PFSsnO8fNJkU01ktZa8U", "xgpG2bMc1aVEQfTVOGXM8sfGOtJMcFPH", "2GhavpyJFuEpD", "Q3SxFnadra2JweXV0TQ7pCIkPNwW6CrH", "wegMd5NqqvgJ45W9ANASZrnEtp1A2mXR", "ALPTKzTzzHlEJ12cQtwgMkt"};

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 5;
                    java.lang.String[] strArr = A03;
                    if (strArr[3].charAt(9) != strArr[5].charAt(9)) {
                        throw new java.lang.RuntimeException();
                    }
                    A03[4] = "6EUX3tXbFxVZ50ys6tGf1eJDZb";
                    bArrCopyOfRange[i4] = (byte) i5;
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{103, 90, 77, 114, 78, 67, 91, 71, 80, 107, 79, 82, 78, 107, 76, 86, 71, 80, 76, 67, 78, 70, 125, 118, 107, 99, 118, 112, 103, 118, 119, 51, 118, 97, 97, 124, 97, 51, 119, 118, 127, 122, 101, 118, 97, 122, 125, 116, 51, 126, 118, 96, 96, 114, 116, 118, 51, 124, 125, 51, 118, 107, 103, 118, 97, 125, 114, 127, 51, 103, 123, 97, 118, 114, 119, kotlin.io.encoding.Base64.padSymbol};
            }

            static {
                A01();
            }

            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return;
                }
                try {
                    try {
                        this.A00.A0X(ad);
                    } catch (com.facebook.ads.redexgen.core.C05449h e) {
                        android.util.Log.e(A00(0, 21, 39), A00(21, 55, 22), e);
                        throw new java.lang.RuntimeException(e);
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                }
            }
        });
    }

    private void A0b(com.facebook.ads.redexgen.core.ZA za) throws com.facebook.ads.redexgen.core.C05449h {
        this.A0G.A08(za);
        A0c(za);
        za.A5U();
    }

    private void A0c(com.facebook.ads.redexgen.core.ZA za) throws com.facebook.ads.redexgen.core.C05449h {
        if (za.A8P() == 2) {
            za.stop();
        }
    }

    private void A0d(com.facebook.ads.redexgen.core.AI ai) {
        this.A06 = ai;
    }

    private void A0e(com.facebook.ads.redexgen.core.XU xu) {
        if (!this.A0K.A0T(xu)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(com.facebook.ads.redexgen.core.XU xu) throws com.facebook.ads.redexgen.core.C05449h {
        if (!this.A0K.A0T(xu)) {
            return;
        }
        com.facebook.ads.redexgen.core.C05599x c05599xA0F = this.A0K.A0F();
        c05599xA0F.A0E(this.A0G.A85().A01);
        A0i(c05599xA0F.A03, c05599xA0F.A04);
        if (!this.A0K.A0P()) {
            com.facebook.ads.redexgen.core.C05599x loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FH
    /* JADX INFO: renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void ABd(com.facebook.ads.redexgen.core.XU xu) {
        this.A0Q.AB1(10, xu).sendToTarget();
    }

    private void A0h(com.facebook.ads.redexgen.core.Ev ev, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = ev;
        A0N(2);
        ev.AEa(this.A0H, true, this);
        this.A0Q.AGD(2);
    }

    private void A0i(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        this.A0J.ADq(this.A0T, trackGroupArray, c0714Gp.A01);
    }

    private void A0j(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.Et et = this.A0K.A0G().A02.A04;
        long jA03 = A03(et, this.A05.A0A, true);
        if (jA03 != this.A05.A0A) {
            this.A05 = this.A05.A04(et, jA03, this.A05.A01);
            if (z) {
                com.facebook.ads.redexgen.core.C05529p c05529p = this.A0I;
                if (A0W[7].charAt(28) == 'w') {
                    throw new java.lang.RuntimeException();
                }
                A0W[6] = "WBZ5bLJSEJN5yb0YmqU0";
                c05529p.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AGD(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AGD(2);
        }
    }

    private void A0m(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADi();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        java.lang.Object obj;
        long j;
        com.facebook.ads.redexgen.core.C0714Gp c0714Gp;
        this.A0Q.AFb(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (com.facebook.ads.redexgen.core.ZA za : this.A0C) {
            try {
                A0b(za);
            } catch (com.facebook.ads.redexgen.core.C05449h | java.lang.RuntimeException e) {
                android.util.Log.e(A06(0, 21, 38), A06(138, 12, 22), e);
            }
        }
        this.A0C = new com.facebook.ads.redexgen.core.ZA[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(com.facebook.ads.redexgen.core.AM.A01);
            java.util.Iterator<com.facebook.ads.redexgen.core.C05519o> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        com.facebook.ads.redexgen.core.AM am = z3 ? com.facebook.ads.redexgen.core.AM.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        com.facebook.ads.redexgen.core.Et et = z2 ? new com.facebook.ads.redexgen.core.Et(A00()) : this.A05.A04;
        long j2 = androidx.media3.common.C.TIME_UNSET;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray = z3 ? com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.A04 : this.A05.A05;
        if (z3) {
            c0714Gp = this.A0O;
        } else {
            c0714Gp = this.A05.A06;
        }
        this.A05 = new com.facebook.ads.redexgen.core.A1(am, obj, et, j, j2, i, false, trackGroupArray, c0714Gp);
        if (z) {
            com.facebook.ads.redexgen.core.Ev ev = this.A07;
            if (A0W[7].charAt(28) == 'w') {
                throw new java.lang.RuntimeException();
            }
            A0W[0] = "lRj2b7Ec0CIz5iiX5eE2KmWgCFvN";
            if (ev != null) {
                this.A07.AF4(this);
                this.A07 = null;
            }
        }
    }

    private void A0p(boolean[] zArr, int i) throws com.facebook.ads.redexgen.core.C05449h {
        this.A0C = new com.facebook.ads.redexgen.core.ZA[i];
        int i2 = 0;
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        for (int i3 = 0; i3 < enabledRendererCount; i3++) {
            if (c05599xA0G.A04.A00(i3)) {
                boolean z = zArr[i3];
                int i4 = i2 + 1;
                if (A0W[4].charAt(4) == 'c') {
                    throw new java.lang.RuntimeException();
                }
                A0W[6] = "b6AxkSDoOdacq7WM3wR6";
                A0O(i3, z, i2);
                i2 = i4;
            }
        }
    }

    private boolean A0q() {
        com.facebook.ads.redexgen.core.C05599x c05599xA0G = this.A0K.A0G();
        long j = c05599xA0G.A02.A01;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                com.facebook.ads.redexgen.core.C05599x playingPeriodHolder = c05599xA0G.A01;
                if (playingPeriodHolder != null) {
                    com.facebook.ads.redexgen.core.C05599x playingPeriodHolder2 = c05599xA0G.A01;
                    if (!playingPeriodHolder2.A06) {
                        com.facebook.ads.redexgen.core.C05599x playingPeriodHolder3 = c05599xA0G.A01;
                        if (playingPeriodHolder3.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(com.facebook.ads.redexgen.core.C05519o c05519o) {
        if (c05519o.A02 == null) {
            android.util.Pair<java.lang.Integer, java.lang.Long> pairA04 = A04(new com.facebook.ads.redexgen.core.C05539q(c05519o.A03.A08(), c05519o.A03.A01(), com.facebook.ads.redexgen.core.AbstractC05389b.A00(c05519o.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            c05519o.A01(((java.lang.Integer) pairA04.first).intValue(), ((java.lang.Long) pairA04.second).longValue(), this.A05.A03.A0A(((java.lang.Integer) pairA04.first).intValue(), this.A0L, true).A03);
        } else {
            int iA04 = this.A05.A03.A04(c05519o.A02);
            if (iA04 == -1) {
                return false;
            }
            c05519o.A00 = iA04;
        }
        return true;
    }

    private boolean A0s(com.facebook.ads.redexgen.core.ZA za) {
        com.facebook.ads.redexgen.core.C05599x c05599xA0H = this.A0K.A0H();
        com.facebook.ads.redexgen.core.C05599x readingPeriodHolder = c05599xA0H.A01;
        if (readingPeriodHolder != null) {
            com.facebook.ads.redexgen.core.C05599x readingPeriodHolder2 = c05599xA0H.A01;
            if (readingPeriodHolder2.A06 && za.A8z()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(com.facebook.ads.redexgen.core.Et et, long j, com.facebook.ads.redexgen.core.C05599x c05599x) {
        if (et.equals(c05599x.A02.A04) && c05599x.A06) {
            this.A05.A03.A09(c05599x.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j);
            if (iA04 == -1 || this.A0L.A09(iA04) == c05599x.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        com.facebook.ads.redexgen.core.C05599x c05599xA0F = this.A0K.A0F();
        long jA0C = c05599xA0F.A0C(!c05599xA0F.A02.A05);
        if (jA0C != Long.MIN_VALUE) {
            com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w = this.A0J;
            long jA08 = jA0C - c05599xA0F.A08(this.A03);
            java.lang.String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A0W[6] = "2cwTC9SumZz3To3yr3ji";
            if (!interfaceC05589w.AGl(jA08, this.A0G.A85().A01, this.A09)) {
                return false;
            }
        }
        return true;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format[] A0v(com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl) {
        int length = interfaceC0710Gl != null ? interfaceC0710Gl.length() : 0;
        com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[length];
        for (int i = 0; i < length; i++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA7U = interfaceC0710Gl.A7U(i);
            if (A0W[3].length() == 1) {
                throw new java.lang.RuntimeException();
            }
            A0W[6] = "MMfeLMq0kgXNQLSglZMb";
            formatArr[i] = formatA7U;
        }
        return formatArr;
    }

    public final android.os.Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AGD(7);
        boolean z = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public final void A0y(com.facebook.ads.redexgen.core.AM am, int i, long j) {
        this.A0Q.AB1(3, new com.facebook.ads.redexgen.core.C05539q(am, i, j)).sendToTarget();
    }

    public final void A0z(com.facebook.ads.redexgen.core.Ev ev, boolean z, boolean z2) {
        this.A0Q.AB0(0, z ? 1 : 0, z2 ? 1 : 0, ev).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.AAz(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.AAz(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05419e
    public final void AD4(com.facebook.ads.redexgen.core.A2 a2) {
        this.A0E.obtainMessage(1, a2).sendToTarget();
        A0L(a2.A01);
    }

    @Override // com.facebook.ads.redexgen.core.XV
    public final void ADC(com.facebook.ads.redexgen.core.XU xu) {
        this.A0Q.AB1(9, xu).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.core.Eu
    public final void ADd(com.facebook.ads.redexgen.core.Ev ev, com.facebook.ads.redexgen.core.AM am, java.lang.Object obj) {
        this.A0Q.AB1(8, new com.facebook.ads.redexgen.core.C05509n(ev, am, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.core.AB
    public final synchronized void AGF(com.facebook.ads.redexgen.core.AD ad) {
        if (this.A0A) {
            android.util.Log.w(A06(0, 21, 38), A06(50, 37, 8));
            ad.A0A(false);
        } else {
            this.A0Q.AB1(14, ad).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) throws java.lang.Throwable {
        java.lang.String strA06 = A06(0, 21, 38);
        try {
            switch (message.what) {
                case 0:
                    A0h((com.facebook.ads.redexgen.core.Ev) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((com.facebook.ads.redexgen.core.C05539q) message.obj);
                    break;
                case 4:
                    A0W((com.facebook.ads.redexgen.core.A2) message.obj);
                    break;
                case 5:
                    A0d((com.facebook.ads.redexgen.core.AI) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((com.facebook.ads.redexgen.core.C05509n) message.obj);
                    break;
                case 9:
                    A0f((com.facebook.ads.redexgen.core.XU) message.obj);
                    break;
                case 10:
                    A0e((com.facebook.ads.redexgen.core.XU) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((com.facebook.ads.redexgen.core.AD) message.obj);
                    break;
                case 15:
                    A0a((com.facebook.ads.redexgen.core.AD) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (com.facebook.ads.redexgen.core.C05449h e) {
            android.util.Log.e(strA06, A06(110, 15, 109), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (java.io.IOException e2) {
            android.util.Log.e(strA06, A06(125, 13, 66), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, com.facebook.ads.redexgen.core.C05449h.A00(e2)).sendToTarget();
            A0A();
        } catch (java.lang.RuntimeException e3) {
            android.util.Log.e(strA06, A06(87, 23, 98), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, com.facebook.ads.redexgen.core.C05449h.A02(e3)).sendToTarget();
            java.lang.String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A0W[4] = "bcAD6CyDV16TZBS92I3KgCtMo20e3K69";
            A0A();
        }
        return true;
    }
}
