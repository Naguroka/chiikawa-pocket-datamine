package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ej extends com.applovin.impl.xl {
    private long b;
    private long[] c;
    private long[] d;

    private static java.util.HashMap f(com.applovin.impl.ah ahVar) {
        java.util.HashMap map = new java.util.HashMap();
        while (true) {
            java.lang.String strH = h(ahVar);
            int i = i(ahVar);
            if (i == 9) {
                return map;
            }
            java.lang.Object objA = a(ahVar, i);
            if (objA != null) {
                map.put(strH, objA);
            }
        }
    }

    @Override // com.applovin.impl.xl
    protected boolean a(com.applovin.impl.ah ahVar) {
        return true;
    }

    public ej() {
        super(new com.applovin.impl.h7());
        this.b = androidx.media3.common.C.TIME_UNSET;
        this.c = new long[0];
        this.d = new long[0];
    }

    public long a() {
        return this.b;
    }

    public long[] c() {
        return this.c;
    }

    private static java.util.Date c(com.applovin.impl.ah ahVar) {
        java.util.Date date = new java.util.Date((long) d(ahVar).doubleValue());
        ahVar.g(2);
        return date;
    }

    public long[] b() {
        return this.d;
    }

    private static int i(com.applovin.impl.ah ahVar) {
        return ahVar.w();
    }

    @Override // com.applovin.impl.xl
    protected boolean b(com.applovin.impl.ah ahVar, long j) {
        if (i(ahVar) != 2 || !"onMetaData".equals(h(ahVar)) || i(ahVar) != 8) {
            return false;
        }
        java.util.HashMap mapE = e(ahVar);
        java.lang.Object obj = mapE.get("duration");
        if (obj instanceof java.lang.Double) {
            double dDoubleValue = ((java.lang.Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        java.lang.Object obj2 = mapE.get("keyframes");
        if (obj2 instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj2;
            java.lang.Object obj3 = map.get("filepositions");
            java.lang.Object obj4 = map.get("times");
            if ((obj3 instanceof java.util.List) && (obj4 instanceof java.util.List)) {
                java.util.List list = (java.util.List) obj3;
                java.util.List list2 = (java.util.List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj5 = list.get(i);
                    java.lang.Object obj6 = list2.get(i);
                    if ((obj6 instanceof java.lang.Double) && (obj5 instanceof java.lang.Double)) {
                        this.c[i] = (long) (((java.lang.Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((java.lang.Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static java.lang.Double d(com.applovin.impl.ah ahVar) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(ahVar.s()));
    }

    private static java.lang.String h(com.applovin.impl.ah ahVar) {
        int iC = ahVar.C();
        int iD = ahVar.d();
        ahVar.g(iC);
        return new java.lang.String(ahVar.c(), iD, iC);
    }

    private static java.util.ArrayList g(com.applovin.impl.ah ahVar) {
        int iA = ahVar.A();
        java.util.ArrayList arrayList = new java.util.ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            java.lang.Object objA = a(ahVar, i(ahVar));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static java.util.HashMap e(com.applovin.impl.ah ahVar) {
        int iA = ahVar.A();
        java.util.HashMap map = new java.util.HashMap(iA);
        for (int i = 0; i < iA; i++) {
            java.lang.String strH = h(ahVar);
            java.lang.Object objA = a(ahVar, i(ahVar));
            if (objA != null) {
                map.put(strH, objA);
            }
        }
        return map;
    }

    private static java.lang.Object a(com.applovin.impl.ah ahVar, int i) {
        if (i == 8) {
            return e(ahVar);
        }
        if (i == 10) {
            return g(ahVar);
        }
        if (i == 11) {
            return c(ahVar);
        }
        if (i == 0) {
            return d(ahVar);
        }
        if (i == 1) {
            return b(ahVar);
        }
        if (i == 2) {
            return h(ahVar);
        }
        if (i != 3) {
            return null;
        }
        return f(ahVar);
    }

    private static java.lang.Boolean b(com.applovin.impl.ah ahVar) {
        return java.lang.Boolean.valueOf(ahVar.w() == 1);
    }
}
