package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class mj {
    private static final com.applovin.exoplayer2.common.base.Splitter d = com.applovin.exoplayer2.common.base.Splitter.on(':');
    private static final com.applovin.exoplayer2.common.base.Splitter e = com.applovin.exoplayer2.common.base.Splitter.on('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1070a = new java.util.ArrayList();
    private int b = 0;
    private int c;

    private void a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(8);
        k8Var.d(ahVar.c(), 0, 8);
        this.c = ahVar.m() + 8;
        if (ahVar.j() != 1397048916) {
            thVar.f1364a = 0L;
        } else {
            thVar.f1364a = k8Var.f() - ((long) (this.c - 12));
            this.b = 2;
        }
    }

    private void b(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        long jA = k8Var.a();
        int i = this.c - 20;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(i);
        k8Var.d(ahVar.c(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            ahVar.g(2);
            short sO = ahVar.o();
            if (sO != 2192 && sO != 2816 && sO != 2817 && sO != 2819 && sO != 2820) {
                ahVar.g(8);
            } else {
                this.f1070a.add(new com.applovin.impl.mj.a(sO, (jA - ((long) this.c)) - ((long) ahVar.m()), ahVar.m()));
            }
        }
        if (this.f1070a.isEmpty()) {
            thVar.f1364a = 0L;
        } else {
            this.b = 3;
            thVar.f1364a = ((com.applovin.impl.mj.a) this.f1070a.get(0)).b;
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1071a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.f1071a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static int a(java.lang.String str) throws com.applovin.impl.ch {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes.BLUETOOTH_OFF;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw com.applovin.impl.ch.a("Invalid SEF name", null);
        }
    }

    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar, java.util.List list) throws com.applovin.impl.ch {
        int i = this.b;
        long j = 0;
        if (i == 0) {
            long jA = k8Var.a();
            if (jA != -1 && jA >= 8) {
                j = jA - 8;
            }
            thVar.f1364a = j;
            this.b = 1;
        } else if (i == 1) {
            a(k8Var, thVar);
        } else if (i == 2) {
            b(k8Var, thVar);
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException();
            }
            a(k8Var, list);
            thVar.f1364a = 0L;
        }
        return 1;
    }

    private void a(com.applovin.impl.k8 k8Var, java.util.List list) throws com.applovin.impl.ch {
        long jF = k8Var.f();
        int iA = (int) ((k8Var.a() - k8Var.f()) - ((long) this.c));
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(iA);
        k8Var.d(ahVar.c(), 0, iA);
        for (int i = 0; i < this.f1070a.size(); i++) {
            com.applovin.impl.mj.a aVar = (com.applovin.impl.mj.a) this.f1070a.get(i);
            ahVar.f((int) (aVar.b - jF));
            ahVar.g(4);
            int iM = ahVar.m();
            int iA2 = a(ahVar.c(iM));
            int i2 = aVar.c - (iM + 8);
            if (iA2 == 2192) {
                list.add(a(ahVar, i2));
            } else if (iA2 != 2816 && iA2 != 2817 && iA2 != 2819 && iA2 != 2820) {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.applovin.impl.jk a(com.applovin.impl.ah ahVar, int i) throws com.applovin.impl.ch {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<java.lang.String> listSplitToList = e.splitToList(ahVar.c(i));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            java.util.List<java.lang.String> listSplitToList2 = d.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() == 3) {
                try {
                    arrayList.add(new com.applovin.impl.jk.b(java.lang.Long.parseLong(listSplitToList2.get(0)), java.lang.Long.parseLong(listSplitToList2.get(1)), 1 << (java.lang.Integer.parseInt(listSplitToList2.get(2)) - 1)));
                } catch (java.lang.NumberFormatException e2) {
                    throw com.applovin.impl.ch.a(null, e2);
                }
            } else {
                throw com.applovin.impl.ch.a(null, null);
            }
        }
        return new com.applovin.impl.jk(arrayList);
    }

    public void a() {
        this.f1070a.clear();
        this.b = 0;
    }
}
