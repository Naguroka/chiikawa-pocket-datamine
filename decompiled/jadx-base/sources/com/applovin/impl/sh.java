package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class sh extends com.applovin.impl.b {
    private final int g;
    private final int h;
    private final int[] i;
    private final int[] j;
    private final com.applovin.impl.fo[] k;
    private final java.lang.Object[] l;
    private final java.util.HashMap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(java.util.Collection collection, com.applovin.impl.wj wjVar) {
        super(false, wjVar);
        int iB = 0;
        int size = collection.size();
        this.i = new int[size];
        this.j = new int[size];
        this.k = new com.applovin.impl.fo[size];
        this.l = new java.lang.Object[size];
        this.m = new java.util.HashMap();
        java.util.Iterator it = collection.iterator();
        int iA = 0;
        int i = 0;
        while (it.hasNext()) {
            com.applovin.impl.de deVar = (com.applovin.impl.de) it.next();
            this.k[i] = deVar.b();
            this.j[i] = iB;
            this.i[i] = iA;
            iB += this.k[i].b();
            iA += this.k[i].a();
            this.l[i] = deVar.a();
            this.m.put(this.l[i], java.lang.Integer.valueOf(i));
            i++;
        }
        this.g = iB;
        this.h = iA;
    }

    @Override // com.applovin.impl.b
    protected int d(int i) {
        return com.applovin.impl.xp.a(this.i, i + 1, false, false);
    }

    @Override // com.applovin.impl.b
    protected int e(int i) {
        return com.applovin.impl.xp.a(this.j, i + 1, false, false);
    }

    @Override // com.applovin.impl.b
    protected int b(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.impl.b
    protected com.applovin.impl.fo i(int i) {
        return this.k[i];
    }

    @Override // com.applovin.impl.b
    protected int g(int i) {
        return this.i[i];
    }

    @Override // com.applovin.impl.b
    protected int h(int i) {
        return this.j[i];
    }

    @Override // com.applovin.impl.b
    protected java.lang.Object f(int i) {
        return this.l[i];
    }

    @Override // com.applovin.impl.fo
    public int a() {
        return this.h;
    }

    java.util.List d() {
        return java.util.Arrays.asList(this.k);
    }

    @Override // com.applovin.impl.fo
    public int b() {
        return this.g;
    }
}
