package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class s5 implements com.applovin.impl.y1, com.applovin.impl.xo {
    public static final com.applovin.impl.eb p = b();
    public static final com.applovin.impl.db q = com.applovin.impl.db.a(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
    public static final com.applovin.impl.db r = com.applovin.impl.db.a(248000L, 160000L, 142000L, 127000L, 113000L);
    public static final com.applovin.impl.db s = com.applovin.impl.db.a(2200000L, 1300000L, 950000L, 760000L, 520000L);
    public static final com.applovin.impl.db t = com.applovin.impl.db.a(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
    public static final com.applovin.impl.db u = com.applovin.impl.db.a(10000000L, 7200000L, java.lang.Long.valueOf(androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US), 2700000L, 1600000L);
    public static final com.applovin.impl.db v = com.applovin.impl.db.a(2600000L, 2200000L, java.lang.Long.valueOf(androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US), 1500000L, 470000L);
    private static com.applovin.impl.s5 w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.fb f1241a;
    private final com.applovin.impl.y1.a.C0058a b;
    private final com.applovin.impl.ik c;
    private final com.applovin.impl.l3 d;
    private final boolean e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private int o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f1242a;
        private java.util.Map b;
        private int c;
        private com.applovin.impl.l3 d;
        private boolean e;

        public com.applovin.impl.s5 a() {
            return new com.applovin.impl.s5(this.f1242a, this.b, this.c, this.d, this.e);
        }

        private static com.applovin.impl.db a(java.lang.String str) {
            com.applovin.impl.db dbVarB = com.applovin.impl.s5.p.b(str);
            return dbVarB.isEmpty() ? com.applovin.impl.db.a(2, 2, 2, 2, 2, 2) : dbVarB;
        }

        public b(android.content.Context context) {
            this.f1242a = context == null ? null : context.getApplicationContext();
            this.b = b(com.applovin.impl.xp.b(context));
            this.c = 2000;
            this.d = com.applovin.impl.l3.f976a;
            this.e = true;
        }

        private static java.util.Map b(java.lang.String str) {
            com.applovin.impl.db dbVarA = a(str);
            java.util.HashMap map = new java.util.HashMap(8);
            map.put(0, 1000000L);
            com.applovin.impl.db dbVar = com.applovin.impl.s5.q;
            map.put(2, (java.lang.Long) dbVar.get(((java.lang.Integer) dbVarA.get(0)).intValue()));
            map.put(3, (java.lang.Long) com.applovin.impl.s5.r.get(((java.lang.Integer) dbVarA.get(1)).intValue()));
            map.put(4, (java.lang.Long) com.applovin.impl.s5.s.get(((java.lang.Integer) dbVarA.get(2)).intValue()));
            map.put(5, (java.lang.Long) com.applovin.impl.s5.t.get(((java.lang.Integer) dbVarA.get(3)).intValue()));
            map.put(10, (java.lang.Long) com.applovin.impl.s5.u.get(((java.lang.Integer) dbVarA.get(4)).intValue()));
            map.put(9, (java.lang.Long) com.applovin.impl.s5.v.get(((java.lang.Integer) dbVarA.get(5)).intValue()));
            map.put(7, (java.lang.Long) dbVar.get(((java.lang.Integer) dbVarA.get(0)).intValue()));
            return map;
        }
    }

    @Override // com.applovin.impl.y1
    public com.applovin.impl.xo a() {
        return this;
    }

    @Override // com.applovin.impl.xo
    public void b(com.applovin.impl.h5 h5Var, com.applovin.impl.k5 k5Var, boolean z) {
    }

    private s5(android.content.Context context, java.util.Map map, int i, com.applovin.impl.l3 l3Var, boolean z) {
        this.f1241a = com.applovin.impl.fb.a(map);
        this.b = new com.applovin.impl.y1.a.C0058a();
        this.c = new com.applovin.impl.ik(i);
        this.d = l3Var;
        this.e = z;
        if (context != null) {
            com.applovin.impl.eg egVarB = com.applovin.impl.eg.b(context);
            int iA = egVarB.a();
            this.i = iA;
            this.l = a(iA);
            egVarB.b(new com.applovin.impl.eg.c() { // from class: com.applovin.impl.s5$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.eg.c
                public final void a(int i2) {
                    this.f$0.b(i2);
                }
            });
            return;
        }
        this.i = 0;
        this.l = a(0);
    }

    @Override // com.applovin.impl.y1
    public void a(android.os.Handler handler, com.applovin.impl.y1.a aVar) {
        com.applovin.impl.b1.a(handler);
        com.applovin.impl.b1.a(aVar);
        this.b.a(handler, aVar);
    }

    @Override // com.applovin.impl.xo
    public synchronized void c(com.applovin.impl.h5 h5Var, com.applovin.impl.k5 k5Var, boolean z) {
        if (a(k5Var, z)) {
            com.applovin.impl.b1.b(this.f > 0);
            long jC = this.d.c();
            int i = (int) (jC - this.g);
            this.j += (long) i;
            long j = this.k;
            long j2 = this.h;
            this.k = j + j2;
            if (i > 0) {
                this.c.a((int) java.lang.Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.j >= 2000 || this.k >= 524288) {
                    this.l = (long) this.c.a(0.5f);
                }
                a(i, this.h, this.l);
                this.g = jC;
                this.h = 0L;
            }
            this.f--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i) {
        int i2 = this.i;
        if (i2 == 0 || this.e) {
            if (this.n) {
                i = this.o;
            }
            if (i2 == i) {
                return;
            }
            this.i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.l = a(i);
                long jC = this.d.c();
                a(this.f > 0 ? (int) (jC - this.g) : 0, this.h, this.l);
                this.g = jC;
                this.h = 0L;
                this.k = 0L;
                this.j = 0L;
                this.c.c();
            }
        }
    }

    private static com.applovin.impl.eb b() {
        return com.applovin.impl.eb.k().b("AD", 1, 2, 0, 0, 2, 2).b("AE", 1, 4, 4, 4, 2, 2).b("AF", 4, 4, 3, 4, 2, 2).b("AG", 4, 2, 1, 4, 2, 2).b("AI", 1, 2, 2, 2, 2, 2).b("AL", 1, 1, 1, 1, 2, 2).b("AM", 2, 2, 1, 3, 2, 2).b("AO", 3, 4, 3, 1, 2, 2).b("AR", 2, 4, 2, 1, 2, 2).b("AS", 2, 2, 3, 3, 2, 2).b("AT", 0, 1, 0, 0, 0, 2).b("AU", 0, 2, 0, 1, 1, 2).b("AW", 1, 2, 0, 4, 2, 2).b("AX", 0, 2, 2, 2, 2, 2).b("AZ", 3, 3, 3, 4, 4, 2).b("BA", 1, 1, 0, 1, 2, 2).b("BB", 0, 2, 0, 0, 2, 2).b("BD", 2, 0, 3, 3, 2, 2).b("BE", 0, 0, 2, 3, 2, 2).b("BF", 4, 4, 4, 2, 2, 2).b("BG", 0, 1, 0, 0, 2, 2).b("BH", 1, 0, 2, 4, 2, 2).b("BI", 4, 4, 4, 4, 2, 2).b("BJ", 4, 4, 4, 4, 2, 2).b("BL", 1, 2, 2, 2, 2, 2).b("BM", 0, 2, 0, 0, 2, 2).b("BN", 3, 2, 1, 0, 2, 2).b("BO", 1, 2, 4, 2, 2, 2).b("BQ", 1, 2, 1, 2, 2, 2).b("BR", 2, 4, 3, 2, 2, 2).b("BS", 2, 2, 1, 3, 2, 2).b("BT", 3, 0, 3, 2, 2, 2).b("BW", 3, 4, 1, 1, 2, 2).b("BY", 1, 1, 1, 2, 2, 2).b("BZ", 2, 2, 2, 2, 2, 2).b("CA", 0, 3, 1, 2, 4, 2).b("CD", 4, 2, 2, 1, 2, 2).b("CF", 4, 2, 3, 2, 2, 2).b("CG", 3, 4, 2, 2, 2, 2).b("CH", 0, 0, 0, 0, 1, 2).b("CI", 3, 3, 3, 3, 2, 2).b("CK", 2, 2, 3, 0, 2, 2).b("CL", 1, 1, 2, 2, 2, 2).b("CM", 3, 4, 3, 2, 2, 2).b("CN", 2, 2, 2, 1, 3, 2).b("CO", 2, 3, 4, 2, 2, 2).b("CR", 2, 3, 4, 4, 2, 2).b("CU", 4, 4, 2, 2, 2, 2).b("CV", 2, 3, 1, 0, 2, 2).b("CW", 1, 2, 0, 0, 2, 2).b("CY", 1, 1, 0, 0, 2, 2).b("CZ", 0, 1, 0, 0, 1, 2).b("DE", 0, 0, 1, 1, 0, 2).b("DJ", 4, 0, 4, 4, 2, 2).b("DK", 0, 0, 1, 0, 0, 2).b("DM", 1, 2, 2, 2, 2, 2).b("DO", 3, 4, 4, 4, 2, 2).b("DZ", 3, 3, 4, 4, 2, 4).b("EC", 2, 4, 3, 1, 2, 2).b("EE", 0, 1, 0, 0, 2, 2).b("EG", 3, 4, 3, 3, 2, 2).b("EH", 2, 2, 2, 2, 2, 2).b("ER", 4, 2, 2, 2, 2, 2).b("ES", 0, 1, 1, 1, 2, 2).b("ET", 4, 4, 4, 1, 2, 2).b("FI", 0, 0, 0, 0, 0, 2).b("FJ", 3, 0, 2, 3, 2, 2).b("FK", 4, 2, 2, 2, 2, 2).b("FM", 3, 2, 4, 4, 2, 2).b("FO", 1, 2, 0, 1, 2, 2).b("FR", 1, 1, 2, 0, 1, 2).b("GA", 3, 4, 1, 1, 2, 2).b("GB", 0, 0, 1, 1, 1, 2).b("GD", 1, 2, 2, 2, 2, 2).b("GE", 1, 1, 1, 2, 2, 2).b("GF", 2, 2, 2, 3, 2, 2).b("GG", 1, 2, 0, 0, 2, 2).b("GH", 3, 1, 3, 2, 2, 2).b("GI", 0, 2, 0, 0, 2, 2).b("GL", 1, 2, 0, 0, 2, 2).b("GM", 4, 3, 2, 4, 2, 2).b("GN", 4, 3, 4, 2, 2, 2).b("GP", 2, 1, 2, 3, 2, 2).b("GQ", 4, 2, 2, 4, 2, 2).b("GR", 1, 2, 0, 0, 2, 2).b("GT", 3, 2, 3, 1, 2, 2).b("GU", 1, 2, 3, 4, 2, 2).b("GW", 4, 4, 4, 4, 2, 2).b("GY", 3, 3, 3, 4, 2, 2).b("HK", 0, 1, 2, 3, 2, 0).b("HN", 3, 1, 3, 3, 2, 2).b("HR", 1, 1, 0, 0, 3, 2).b("HT", 4, 4, 4, 4, 2, 2).b("HU", 0, 0, 0, 0, 0, 2).b("ID", 3, 2, 3, 3, 2, 2).b("IE", 0, 0, 1, 1, 3, 2).b("IL", 1, 0, 2, 3, 4, 2).b("IM", 0, 2, 0, 1, 2, 2).b("IN", 2, 1, 3, 3, 2, 2).b("IO", 4, 2, 2, 4, 2, 2).b("IQ", 3, 3, 4, 4, 2, 2).b("IR", 3, 2, 3, 2, 2, 2).b(com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE, 0, 2, 0, 0, 2, 2).b("IT", 0, 4, 0, 1, 2, 2).b("JE", 2, 2, 1, 2, 2, 2).b("JM", 3, 3, 4, 4, 2, 2).b("JO", 2, 2, 1, 1, 2, 2).b("JP", 0, 0, 0, 0, 2, 1).b("KE", 3, 4, 2, 2, 2, 2).b("KG", 2, 0, 1, 1, 2, 2).b("KH", 1, 0, 4, 3, 2, 2).b("KI", 4, 2, 4, 3, 2, 2).b("KM", 4, 3, 2, 3, 2, 2).b("KN", 1, 2, 2, 2, 2, 2).b("KP", 4, 2, 2, 2, 2, 2).b("KR", 0, 0, 1, 3, 1, 2).b("KW", 1, 3, 1, 1, 1, 2).b("KY", 1, 2, 0, 2, 2, 2).b("KZ", 2, 2, 2, 3, 2, 2).b("LA", 1, 2, 1, 1, 2, 2).b("LB", 3, 2, 0, 0, 2, 2).b("LC", 1, 2, 0, 0, 2, 2).b("LI", 0, 2, 2, 2, 2, 2).b("LK", 2, 0, 2, 3, 2, 2).b("LR", 3, 4, 4, 3, 2, 2).b("LS", 3, 3, 2, 3, 2, 2).b("LT", 0, 0, 0, 0, 2, 2).b("LU", 1, 0, 1, 1, 2, 2).b("LV", 0, 0, 0, 0, 2, 2).b("LY", 4, 2, 4, 3, 2, 2).b(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 3, 2, 2, 1, 2, 2).b("MC", 0, 2, 0, 0, 2, 2).b("MD", 1, 2, 0, 0, 2, 2).b("ME", 1, 2, 0, 1, 2, 2).b("MF", 2, 2, 1, 1, 2, 2).b("MG", 3, 4, 2, 2, 2, 2).b("MH", 4, 2, 2, 4, 2, 2).b("MK", 1, 1, 0, 0, 2, 2).b("ML", 4, 4, 2, 2, 2, 2).b("MM", 2, 3, 3, 3, 2, 2).b("MN", 2, 4, 2, 2, 2, 2).b("MO", 0, 2, 4, 4, 2, 2).b("MP", 0, 2, 2, 2, 2, 2).b("MQ", 2, 2, 2, 3, 2, 2).b("MR", 3, 0, 4, 3, 2, 2).b("MS", 1, 2, 2, 2, 2, 2).b("MT", 0, 2, 0, 0, 2, 2).b("MU", 2, 1, 1, 2, 2, 2).b("MV", 4, 3, 2, 4, 2, 2).b("MW", 4, 2, 1, 0, 2, 2).b("MX", 2, 4, 4, 4, 4, 2).b("MY", 1, 0, 3, 2, 2, 2).b("MZ", 3, 3, 2, 1, 2, 2).b("NA", 4, 3, 3, 2, 2, 2).b("NC", 3, 0, 4, 4, 2, 2).b("NE", 4, 4, 4, 4, 2, 2).b("NF", 2, 2, 2, 2, 2, 2).b("NG", 3, 3, 2, 3, 2, 2).b("NI", 2, 1, 4, 4, 2, 2).b("NL", 0, 2, 3, 2, 0, 2).b("NO", 0, 1, 2, 0, 0, 2).b("NP", 2, 0, 4, 2, 2, 2).b("NR", 3, 2, 3, 1, 2, 2).b("NU", 4, 2, 2, 2, 2, 2).b("NZ", 0, 2, 1, 2, 4, 2).b("OM", 2, 2, 1, 3, 3, 2).b("PA", 1, 3, 3, 3, 2, 2).b("PE", 2, 3, 4, 4, 2, 2).b("PF", 2, 2, 2, 1, 2, 2).b(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 4, 3, 2, 2, 2).b("PH", 2, 1, 3, 3, 3, 2).b("PK", 3, 2, 3, 3, 2, 2).b("PL", 1, 0, 1, 2, 3, 2).b("PM", 0, 2, 2, 2, 2, 2).b("PR", 2, 1, 2, 2, 4, 3).b("PS", 3, 3, 2, 2, 2, 2).b("PT", 0, 1, 1, 0, 2, 2).b("PW", 1, 2, 4, 1, 2, 2).b("PY", 2, 0, 3, 2, 2, 2).b("QA", 2, 3, 1, 2, 3, 2).b("RE", 1, 0, 2, 2, 2, 2).b("RO", 0, 1, 0, 1, 0, 2).b("RS", 1, 2, 0, 0, 2, 2).b("RU", 0, 1, 0, 1, 4, 2).b("RW", 3, 3, 3, 1, 2, 2).b("SA", 2, 2, 2, 1, 1, 2).b("SB", 4, 2, 3, 2, 2, 2).b("SC", 4, 2, 1, 3, 2, 2).b("SD", 4, 4, 4, 4, 2, 2).b("SE", 0, 0, 0, 0, 0, 2).b("SG", 1, 0, 1, 2, 3, 2).b("SH", 4, 2, 2, 2, 2, 2).b("SI", 0, 0, 0, 0, 2, 2).b("SJ", 2, 2, 2, 2, 2, 2).b("SK", 0, 1, 0, 0, 2, 2).b("SL", 4, 3, 4, 0, 2, 2).b("SM", 0, 2, 2, 2, 2, 2).b("SN", 4, 4, 4, 4, 2, 2).b("SO", 3, 3, 3, 4, 2, 2).b("SR", 3, 2, 2, 2, 2, 2).b("SS", 4, 4, 3, 3, 2, 2).b("ST", 2, 2, 1, 2, 2, 2).b("SV", 2, 1, 4, 3, 2, 2).b("SX", 2, 2, 1, 0, 2, 2).b("SY", 4, 3, 3, 2, 2, 2).b("SZ", 3, 3, 2, 4, 2, 2).b("TC", 2, 2, 2, 0, 2, 2).b("TD", 4, 3, 4, 4, 2, 2).b("TG", 3, 2, 2, 4, 2, 2).b("TH", 0, 3, 2, 3, 2, 2).b("TJ", 4, 4, 4, 4, 2, 2).b("TL", 4, 0, 4, 4, 2, 2).b("TM", 4, 2, 4, 3, 2, 2).b("TN", 2, 1, 1, 2, 2, 2).b("TO", 3, 3, 4, 3, 2, 2).b("TR", 1, 2, 1, 1, 2, 2).b("TT", 1, 4, 0, 1, 2, 2).b("TV", 3, 2, 2, 4, 2, 2).b("TW", 0, 0, 0, 0, 1, 0).b("TZ", 3, 3, 3, 2, 2, 2).b("UA", 0, 3, 1, 1, 2, 2).b("UG", 3, 2, 3, 3, 2, 2).b("US", 1, 1, 2, 2, 4, 2).b("UY", 2, 2, 1, 1, 2, 2).b("UZ", 2, 1, 3, 4, 2, 2).b("VC", 1, 2, 2, 2, 2, 2).b("VE", 4, 4, 4, 4, 2, 2).b("VG", 2, 2, 1, 1, 2, 2).b("VI", 1, 2, 1, 2, 2, 2).b("VN", 0, 1, 3, 4, 2, 2).b("VU", 4, 0, 3, 1, 2, 2).b("WF", 4, 2, 2, 4, 2, 2).b("WS", 3, 1, 3, 1, 2, 2).b("XK", 0, 1, 1, 0, 2, 2).b("YE", 4, 4, 4, 3, 2, 2).b("YT", 4, 2, 2, 3, 2, 2).b("ZA", 3, 3, 2, 1, 2, 2).b("ZM", 3, 2, 3, 3, 2, 2).b("ZW", 3, 2, 4, 3, 2, 2).c();
    }

    private long a(int i) {
        java.lang.Long l = (java.lang.Long) this.f1241a.get(java.lang.Integer.valueOf(i));
        if (l == null) {
            l = (java.lang.Long) this.f1241a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean a(com.applovin.impl.k5 k5Var, boolean z) {
        return z && !k5Var.b(8);
    }

    private void a(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        this.b.a(i, j, j2);
    }

    @Override // com.applovin.impl.xo
    public synchronized void a(com.applovin.impl.h5 h5Var, com.applovin.impl.k5 k5Var, boolean z, int i) {
        if (a(k5Var, z)) {
            this.h += (long) i;
        }
    }

    @Override // com.applovin.impl.xo
    public synchronized void a(com.applovin.impl.h5 h5Var, com.applovin.impl.k5 k5Var, boolean z) {
        if (a(k5Var, z)) {
            if (this.f == 0) {
                this.g = this.d.c();
            }
            this.f++;
        }
    }

    @Override // com.applovin.impl.y1
    public void a(com.applovin.impl.y1.a aVar) {
        this.b.a(aVar);
    }

    public static synchronized com.applovin.impl.s5 a(android.content.Context context) {
        if (w == null) {
            w = new com.applovin.impl.s5.b(context).a();
        }
        return w;
    }
}
