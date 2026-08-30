package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends com.applovin.impl.pp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.d.b f696a = com.applovin.impl.d.b.NOT_READY;
    private java.lang.Object b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f697a;

        static {
            int[] iArr = new int[com.applovin.impl.d.b.values().length];
            f697a = iArr;
            try {
                iArr[com.applovin.impl.d.b.DONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f697a[com.applovin.impl.d.b.READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract java.lang.Object a();

    protected d() {
    }

    protected final java.lang.Object b() {
        this.f696a = com.applovin.impl.d.b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.applovin.exoplayer2.common.base.Preconditions.checkState(this.f696a != com.applovin.impl.d.b.FAILED);
        int i = com.applovin.impl.d.a.f697a[this.f696a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    private boolean c() {
        this.f696a = com.applovin.impl.d.b.FAILED;
        this.b = a();
        if (this.f696a == com.applovin.impl.d.b.DONE) {
            return false;
        }
        this.f696a = com.applovin.impl.d.b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (hasNext()) {
            this.f696a = com.applovin.impl.d.b.NOT_READY;
            java.lang.Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new java.util.NoSuchElementException();
    }
}
