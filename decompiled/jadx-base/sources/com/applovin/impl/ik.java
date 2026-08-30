package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ik {
    private static final java.util.Comparator h = new java.util.Comparator() { // from class: com.applovin.impl.ik$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.applovin.impl.ik.a((com.applovin.impl.ik.b) obj, (com.applovin.impl.ik.b) obj2);
        }
    };
    private static final java.util.Comparator i = new java.util.Comparator() { // from class: com.applovin.impl.ik$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.applovin.impl.ik.b((com.applovin.impl.ik.b) obj, (com.applovin.impl.ik.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f892a;
    private int e;
    private int f;
    private int g;
    private final com.applovin.impl.ik.b[] c = new com.applovin.impl.ik.b[5];
    private final java.util.ArrayList b = new java.util.ArrayList();
    private int d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f893a;
        public int b;
        public float c;

        private b() {
        }
    }

    public ik(int i2) {
        this.f892a = i2;
    }

    public void c() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    public void a(int i2, float f) {
        com.applovin.impl.ik.b bVar;
        a();
        int i3 = this.g;
        if (i3 > 0) {
            com.applovin.impl.ik.b[] bVarArr = this.c;
            int i4 = i3 - 1;
            this.g = i4;
            bVar = bVarArr[i4];
        } else {
            bVar = new com.applovin.impl.ik.b();
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bVar.f893a = i5;
        bVar.b = i2;
        bVar.c = f;
        this.b.add(bVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.f892a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            com.applovin.impl.ik.b bVar2 = (com.applovin.impl.ik.b) this.b.get(0);
            int i9 = bVar2.b;
            if (i9 <= i8) {
                this.f -= i9;
                this.b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    com.applovin.impl.ik.b[] bVarArr2 = this.c;
                    this.g = i10 + 1;
                    bVarArr2[i10] = bVar2;
                }
            } else {
                bVar2.b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    private void b() {
        if (this.d != 0) {
            java.util.Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(com.applovin.impl.ik.b bVar, com.applovin.impl.ik.b bVar2) {
        return java.lang.Float.compare(bVar.c, bVar2.c);
    }

    private void a() {
        if (this.d != 1) {
            java.util.Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    public float a(float f) {
        b();
        float f2 = f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            com.applovin.impl.ik.b bVar = (com.applovin.impl.ik.b) this.b.get(i3);
            i2 += bVar.b;
            if (i2 >= f2) {
                return bVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        java.util.ArrayList arrayList = this.b;
        return ((com.applovin.impl.ik.b) arrayList.get(arrayList.size() - 1)).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.applovin.impl.ik.b bVar, com.applovin.impl.ik.b bVar2) {
        return bVar.f893a - bVar2.f893a;
    }
}
