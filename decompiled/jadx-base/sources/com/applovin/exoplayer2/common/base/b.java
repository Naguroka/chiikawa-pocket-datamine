package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
abstract class b implements java.util.Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.exoplayer2.common.base.b.EnumC0025b f552a = com.applovin.exoplayer2.common.base.b.EnumC0025b.NOT_READY;
    private java.lang.Object b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f553a;

        static {
            int[] iArr = new int[com.applovin.exoplayer2.common.base.b.EnumC0025b.values().length];
            f553a = iArr;
            try {
                iArr[com.applovin.exoplayer2.common.base.b.EnumC0025b.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f553a[com.applovin.exoplayer2.common.base.b.EnumC0025b.DONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.base.b$b, reason: collision with other inner class name */
    private enum EnumC0025b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f552a = com.applovin.exoplayer2.common.base.b.EnumC0025b.FAILED;
        this.b = a();
        if (this.f552a == com.applovin.exoplayer2.common.base.b.EnumC0025b.DONE) {
            return false;
        }
        this.f552a = com.applovin.exoplayer2.common.base.b.EnumC0025b.READY;
        return true;
    }

    protected abstract java.lang.Object a();

    protected final java.lang.Object b() {
        this.f552a = com.applovin.exoplayer2.common.base.b.EnumC0025b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.applovin.exoplayer2.common.base.Preconditions.checkState(this.f552a != com.applovin.exoplayer2.common.base.b.EnumC0025b.FAILED);
        int i = com.applovin.exoplayer2.common.base.b.a.f553a[this.f552a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f552a = com.applovin.exoplayer2.common.base.b.EnumC0025b.NOT_READY;
        java.lang.Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
