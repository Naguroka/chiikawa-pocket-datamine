package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class as implements com.applovin.impl.nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f632a;
    private final long[] b;
    private final long[] c;

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < this.f632a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                com.applovin.impl.wr wrVar = (com.applovin.impl.wr) this.f632a.get(i);
                com.applovin.impl.a5 a5Var = wrVar.f1479a;
                if (a5Var.f == -3.4028235E38f) {
                    arrayList2.add(wrVar);
                } else {
                    arrayList.add(a5Var);
                }
            }
        }
        java.util.Collections.sort(arrayList2, new java.util.Comparator() { // from class: com.applovin.impl.as$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.impl.as.a((com.applovin.impl.wr) obj, (com.applovin.impl.wr) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((com.applovin.impl.wr) arrayList2.get(i3)).f1479a.a().a((-1) - i3, 1).a());
        }
        return arrayList;
    }

    public as(java.util.List list) {
        this.f632a = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            com.applovin.impl.wr wrVar = (com.applovin.impl.wr) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = wrVar.b;
            jArr[i2 + 1] = wrVar.c;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        java.util.Arrays.sort(jArrCopyOf);
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        com.applovin.impl.b1.a(i >= 0);
        com.applovin.impl.b1.a(i < this.c.length);
        return this.c[i];
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.c.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int iA = com.applovin.impl.xp.a(this.c, j, false, false);
        if (iA < this.c.length) {
            return iA;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.applovin.impl.wr wrVar, com.applovin.impl.wr wrVar2) {
        return java.lang.Long.compare(wrVar.b, wrVar2.b);
    }
}
