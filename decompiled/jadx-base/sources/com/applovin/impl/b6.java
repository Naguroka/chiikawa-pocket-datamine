package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements com.applovin.impl.n8 {
    private static final int[] n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final java.lang.reflect.Constructor o;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int l;
    private int k = 1;
    private int m = androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    static {
        java.lang.reflect.Constructor constructor = null;
        try {
            if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]))) {
                constructor = java.lang.Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(com.applovin.impl.j8.class).getConstructor(java.lang.Integer.TYPE);
            }
        } catch (java.lang.ClassNotFoundException unused) {
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Error instantiating FLAC extension", e);
        }
        o = constructor;
    }

    private void a(int i, java.util.List list) {
        switch (i) {
            case 0:
                list.add(new com.applovin.impl.i());
                return;
            case 1:
                list.add(new com.applovin.impl.l());
                return;
            case 2:
                list.add(new com.applovin.impl.j0((this.c ? 2 : 0) | ((this.d | (this.b ? 1 : 0)) == true ? 1 : 0)));
                return;
            case 3:
                list.add(new com.applovin.impl.q0((this.c ? 2 : 0) | this.e | (this.b ? 1 : 0)));
                return;
            case 4:
                java.lang.reflect.Constructor constructor = o;
                if (constructor != null) {
                    try {
                        list.add((com.applovin.impl.j8) constructor.newInstance(java.lang.Integer.valueOf(this.f)));
                        return;
                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new com.applovin.impl.u8(this.f));
                return;
            case 5:
                list.add(new com.applovin.impl.d9());
                return;
            case 6:
                list.add(new com.applovin.impl.xc(this.g));
                return;
            case 7:
                list.add(new com.applovin.impl.nf((this.c ? 2 : 0) | this.j | (this.b ? 1 : 0)));
                return;
            case 8:
                list.add(new com.applovin.impl.i9(this.i));
                list.add(new com.applovin.impl.of(this.h));
                return;
            case 9:
                list.add(new com.applovin.impl.gg());
                return;
            case 10:
                list.add(new com.applovin.impl.ii());
                return;
            case 11:
                list.add(new com.applovin.impl.cp(this.k, this.l, this.m));
                return;
            case 12:
                list.add(new com.applovin.impl.lr());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new com.applovin.impl.xb());
                return;
        }
    }

    @Override // com.applovin.impl.n8
    public synchronized com.applovin.impl.j8[] a() {
        return a(android.net.Uri.EMPTY, new java.util.HashMap());
    }

    @Override // com.applovin.impl.n8
    public synchronized com.applovin.impl.j8[] a(android.net.Uri uri, java.util.Map map) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList(14);
        int iA = com.applovin.impl.p8.a(map);
        if (iA != -1) {
            a(iA, arrayList);
        }
        int iA2 = com.applovin.impl.p8.a(uri);
        if (iA2 != -1 && iA2 != iA) {
            a(iA2, arrayList);
        }
        for (int i : n) {
            if (i != iA && i != iA2) {
                a(i, arrayList);
            }
        }
        return (com.applovin.impl.j8[]) arrayList.toArray(new com.applovin.impl.j8[arrayList.size()]);
    }
}
