package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ax<E> extends java.util.AbstractQueue<E> implements java.io.Serializable, java.util.concurrent.BlockingQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object[] f261a;
    int b;
    int c;
    int d;
    final java.util.concurrent.locks.ReentrantLock e;
    transient com.amoad.ax<E>.b f;
    private final java.util.concurrent.locks.Condition g;
    private final java.util.concurrent.locks.Condition h;

    class a implements java.util.Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f262a;
        int b;
        int c = -1;
        int d;
        int e;
        private E g;
        private E h;

        a() {
            java.util.concurrent.locks.ReentrantLock reentrantLock = com.amoad.ax.this.e;
            reentrantLock.lock();
            try {
                if (com.amoad.ax.this.d == 0) {
                    this.f262a = -1;
                    this.b = -1;
                    this.d = -3;
                } else {
                    int i = com.amoad.ax.this.b;
                    this.d = i;
                    this.b = i;
                    this.g = (E) com.amoad.ax.this.f261a[i];
                    this.f262a = a(i);
                    if (com.amoad.ax.this.f == null) {
                        com.amoad.ax.this.f = new com.amoad.ax.b(this);
                    } else {
                        com.amoad.ax.this.f.a(this);
                        com.amoad.ax.this.f.a(false);
                    }
                    this.e = com.amoad.ax.this.f.f263a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        private int a(int i) {
            int iA = com.amoad.ax.this.a(i);
            if (iA == com.amoad.ax.this.c) {
                return -1;
            }
            return iA;
        }

        static int a(int i, int i2, int i3) {
            int i4 = i - i2;
            return i4 < 0 ? i4 + i3 : i4;
        }

        private static boolean a(int i, int i2, long j, int i3) {
            if (i < 0) {
                return false;
            }
            int i4 = i - i2;
            if (i4 < 0) {
                i4 += i3;
            }
            return j > ((long) i4);
        }

        private void c() {
            int i = com.amoad.ax.this.f.f263a;
            int i2 = com.amoad.ax.this.b;
            int i3 = this.e;
            int i4 = this.d;
            if (i == i3 && i2 == i4) {
                return;
            }
            int length = com.amoad.ax.this.f261a.length;
            long j = ((i - i3) * length) + (i2 - i4);
            if (a(this.c, i4, j, length)) {
                this.c = -2;
            }
            if (a(this.b, i4, j, length)) {
                this.b = -2;
            }
            if (a(this.f262a, i4, j, length)) {
                this.f262a = i2;
            }
            if (this.f262a < 0 && this.b < 0 && this.c < 0) {
                d();
            } else {
                this.e = i;
                this.d = i2;
            }
        }

        private void d() {
            if (this.d >= 0) {
                this.d = -3;
                com.amoad.ax.this.f.a(true);
            }
        }

        final boolean a() {
            return this.d < 0;
        }

        final void b() {
            this.f262a = -1;
            if (this.b >= 0) {
                this.b = -2;
            }
            if (this.c >= 0) {
                this.c = -2;
                this.h = null;
            }
            this.d = -3;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.g != null) {
                return true;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock = com.amoad.ax.this.e;
            reentrantLock.lock();
            try {
                if (!a()) {
                    c();
                    int i = this.c;
                    if (i >= 0) {
                        this.h = (E) com.amoad.ax.this.f261a[i];
                        d();
                    }
                }
                return false;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.Iterator
        public final E next() {
            E e = this.g;
            if (e == null) {
                throw new java.util.NoSuchElementException();
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock = com.amoad.ax.this.e;
            reentrantLock.lock();
            try {
                if (!a()) {
                    c();
                }
                this.c = this.b;
                int i = this.f262a;
                if (i >= 0) {
                    com.amoad.ax axVar = com.amoad.ax.this;
                    this.b = i;
                    this.g = (E) axVar.f261a[i];
                    this.f262a = a(i);
                } else {
                    this.b = -1;
                    this.g = null;
                }
                return e;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.amoad.ax axVar;
            java.util.concurrent.locks.ReentrantLock reentrantLock = com.amoad.ax.this.e;
            reentrantLock.lock();
            try {
                if (!a()) {
                    c();
                }
                int i = this.c;
                this.c = -1;
                if (i >= 0) {
                    if (a()) {
                        E e = this.h;
                        this.h = null;
                        if (com.amoad.ax.this.f261a[i] == e) {
                            axVar = com.amoad.ax.this;
                        }
                    } else {
                        axVar = com.amoad.ax.this;
                    }
                    axVar.b(i);
                } else if (i == -1) {
                    throw new java.lang.IllegalStateException();
                }
                if (this.f262a < 0 && this.b < 0) {
                    d();
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    class b {
        com.amoad.ax<E>.b.a b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f263a = 0;
        private com.amoad.ax<E>.b.a d = null;

        class a extends java.lang.ref.WeakReference<com.amoad.ax<E>.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            com.amoad.ax<E>.b.a f264a;

            a(com.amoad.ax<E>.a aVar, com.amoad.ax<E>.b.a aVar2) {
                super(aVar);
                this.f264a = aVar2;
            }
        }

        b(com.amoad.ax<E>.a aVar) {
            a(aVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x003a  */
        /* JADX WARN: Code duplicated, block: B:19:0x003d  */
        final void a() {
            boolean z;
            this.f263a++;
            com.amoad.ax<E>.b.a aVar = this.b;
            com.amoad.ax<E>.b.a aVar2 = null;
            while (aVar != null) {
                com.amoad.ax.a aVar3 = (com.amoad.ax.a) aVar.get();
                com.amoad.ax<E>.b.a aVar4 = aVar.f264a;
                if (aVar3 == null) {
                    aVar.clear();
                    aVar.f264a = null;
                    if (aVar2 == null) {
                        this.b = aVar4;
                    } else {
                        aVar2.f264a = aVar4;
                    }
                } else {
                    if (aVar3.a()) {
                        z = true;
                    } else if (com.amoad.ax.this.f.f263a - aVar3.e > 1) {
                        aVar3.b();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        aVar.clear();
                        aVar.f264a = null;
                        if (aVar2 == null) {
                            this.b = aVar4;
                        } else {
                            aVar2.f264a = aVar4;
                        }
                    } else {
                        aVar2 = aVar;
                    }
                }
                aVar = aVar4;
            }
            if (this.b == null) {
                com.amoad.ax.this.f = null;
            }
        }

        final void a(com.amoad.ax<E>.a aVar) {
            this.b = new com.amoad.ax.b.a(aVar, this.b);
        }

        final void a(boolean z) {
            boolean z2;
            com.amoad.ax<E>.b.a aVar;
            com.amoad.ax<E>.b.a aVar2;
            int i = z ? 16 : 4;
            com.amoad.ax<E>.b.a aVar3 = this.d;
            if (aVar3 == null) {
                aVar2 = this.b;
                z2 = true;
                aVar = null;
            } else {
                z2 = false;
                aVar = aVar3;
                aVar2 = aVar3.f264a;
            }
            while (i > 0) {
                if (aVar2 == null) {
                    if (z2) {
                        break;
                    }
                    aVar2 = this.b;
                    z2 = true;
                    aVar = null;
                }
                com.amoad.ax.a aVar4 = (com.amoad.ax.a) aVar2.get();
                com.amoad.ax<E>.b.a aVar5 = aVar2.f264a;
                if (aVar4 == null || aVar4.a()) {
                    aVar2.clear();
                    aVar2.f264a = null;
                    if (aVar == null) {
                        this.b = aVar5;
                        if (aVar5 == null) {
                            com.amoad.ax.this.f = null;
                            return;
                        }
                    } else {
                        aVar.f264a = aVar5;
                    }
                    i = 16;
                } else {
                    aVar = aVar2;
                }
                i--;
                aVar2 = aVar5;
            }
            this.d = aVar2 != null ? aVar : null;
        }

        final void b() {
            for (com.amoad.ax<E>.b.a aVar = this.b; aVar != null; aVar = aVar.f264a) {
                com.amoad.ax.a aVar2 = (com.amoad.ax.a) aVar.get();
                if (aVar2 != null) {
                    aVar.clear();
                    aVar2.b();
                }
            }
            this.b = null;
            com.amoad.ax.this.f = null;
        }

        final void c() {
            if (com.amoad.ax.this.d == 0) {
                b();
            } else if (com.amoad.ax.this.b == 0) {
                a();
            }
        }
    }

    public ax() {
        this((byte) 0);
    }

    private ax(byte b2) {
        this.f = null;
        this.f261a = new java.lang.Object[256];
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock(false);
        this.e = reentrantLock;
        this.g = reentrantLock.newCondition();
        this.h = reentrantLock.newCondition();
    }

    private E a() {
        int iA;
        this.b = 0;
        java.lang.Object[] objArr = this.f261a;
        int length = objArr.length;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            java.lang.Object obj = objArr[i2];
            if ((obj instanceof com.amoad.t.b) && i < (iA = ((com.amoad.t.b) obj).f346a.a())) {
                this.b = i2;
                i = iA;
            }
        }
        java.lang.Object[] objArr2 = this.f261a;
        int i3 = this.b;
        E e = (E) objArr2[i3];
        objArr2[i3] = null;
        this.b = a(i3);
        this.d--;
        com.amoad.ax<E>.b bVar = this.f;
        if (bVar != null) {
            bVar.c();
        }
        this.h.signal();
        return e;
    }

    private static void a(java.lang.Object obj) {
        obj.getClass();
    }

    private void b(E e) {
        java.lang.Object[] objArr = this.f261a;
        int i = this.c;
        objArr[i] = e;
        this.c = a(i);
        this.d++;
        this.g.signal();
    }

    private int c(int i) {
        if (i == 0) {
            i = this.f261a.length;
        }
        return i - 1;
    }

    final int a(int i) {
        int i2 = i + 1;
        if (i2 == this.f261a.length) {
            return 0;
        }
        return i2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean add(E e) {
        return super.add(e);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    final void b(int i) {
        boolean z;
        java.lang.Object[] objArr = this.f261a;
        int i2 = this.b;
        if (i == i2) {
            objArr[i2] = null;
            this.b = a(i2);
            this.d--;
            com.amoad.ax<E>.b bVar = this.f;
            if (bVar != null) {
                bVar.c();
            }
        } else {
            int i3 = this.c;
            int i4 = i;
            while (true) {
                int iA = a(i4);
                if (iA == i3) {
                    break;
                }
                objArr[i4] = objArr[iA];
                i4 = iA;
            }
            objArr[i4] = null;
            this.c = i4;
            this.d--;
            com.amoad.ax<E>.b bVar2 = this.f;
            if (bVar2 != null) {
                com.amoad.ax<E>.b.a aVar = bVar2.b;
                com.amoad.ax<E>.b.a aVar2 = null;
                while (aVar != null) {
                    com.amoad.ax.a aVar3 = (com.amoad.ax.a) aVar.get();
                    com.amoad.ax<E>.b.a aVar4 = aVar.f264a;
                    if (aVar3 == null) {
                        aVar.clear();
                        aVar.f264a = null;
                        if (aVar2 == null) {
                            bVar2.b = aVar4;
                        } else {
                            aVar2.f264a = aVar4;
                        }
                    } else {
                        if (aVar3.a()) {
                            z = true;
                        } else {
                            int i5 = com.amoad.ax.this.f.f263a;
                            int i6 = com.amoad.ax.this.b;
                            int i7 = aVar3.e;
                            int i8 = aVar3.d;
                            int length = com.amoad.ax.this.f261a.length;
                            int i9 = i5 - i7;
                            if (i < i6) {
                                i9++;
                            }
                            int i10 = (i9 * length) + (i - i8);
                            int iC = aVar3.f262a;
                            if (iC >= 0) {
                                int iA2 = com.amoad.ax.a.a(iC, i8, length);
                                if (iA2 == i10) {
                                    if (iC == com.amoad.ax.this.c) {
                                        iC = -1;
                                        aVar3.f262a = iC;
                                    }
                                } else if (iA2 > i10) {
                                    iC = com.amoad.ax.this.c(iC);
                                    aVar3.f262a = iC;
                                }
                            }
                            int iC2 = aVar3.c;
                            if (iC2 >= 0) {
                                int iA3 = com.amoad.ax.a.a(iC2, i8, length);
                                if (iA3 == i10) {
                                    aVar3.c = -2;
                                    iC2 = -2;
                                } else if (iA3 > i10) {
                                    iC2 = com.amoad.ax.this.c(iC2);
                                    aVar3.c = iC2;
                                }
                            }
                            int i11 = aVar3.b;
                            if (i11 >= 0) {
                                int iA4 = com.amoad.ax.a.a(i11, i8, length);
                                if (iA4 == i10) {
                                    aVar3.b = -2;
                                } else if (iA4 > i10) {
                                    aVar3.b = com.amoad.ax.this.c(i11);
                                }
                            } else if (iC < 0 && i11 < 0 && iC2 < 0) {
                                aVar3.d = -3;
                                z = true;
                            }
                            z = false;
                        }
                        if (z) {
                            aVar.clear();
                            aVar.f264a = null;
                            if (aVar2 == null) {
                                bVar2.b = aVar4;
                            } else {
                                aVar2.f264a = aVar4;
                            }
                        } else {
                            aVar2 = aVar;
                        }
                    }
                    aVar = aVar4;
                }
                if (bVar2.b == null) {
                    com.amoad.ax.this.f = null;
                }
            }
        }
        this.h.signal();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        java.lang.Object[] objArr = this.f261a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int i = this.d;
            if (i > 0) {
                int i2 = this.c;
                int iA = this.b;
                do {
                    objArr[iA] = null;
                    iA = a(iA);
                } while (iA != i2);
                this.b = i2;
                this.d = 0;
                com.amoad.ax<E>.b bVar = this.f;
                if (bVar != null) {
                    bVar.b();
                }
                while (i > 0 && reentrantLock.hasWaiters(this.h)) {
                    this.h.signal();
                    i--;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        java.lang.Object[] objArr = this.f261a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.d > 0) {
                int i = this.c;
                int iA = this.b;
                while (!obj.equals(objArr[iA])) {
                    iA = a(iA);
                    if (iA == i) {
                    }
                }
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(java.util.Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(java.util.Collection<? super E> collection, int i) {
        a(collection);
        if (collection == this) {
            throw new java.lang.IllegalArgumentException();
        }
        int i2 = 0;
        if (i <= 0) {
            return 0;
        }
        java.lang.Object[] objArr = this.f261a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int iMin = java.lang.Math.min(i, this.d);
            int iA = this.b;
            while (i2 < iMin) {
                try {
                    collection.add(objArr[iA]);
                    objArr[iA] = null;
                    iA = a(iA);
                    i2++;
                } catch (java.lang.Throwable th) {
                    if (i2 > 0) {
                        int i3 = this.d - i2;
                        this.d = i3;
                        this.b = iA;
                        com.amoad.ax<E>.b bVar = this.f;
                        if (bVar != null) {
                            if (i3 == 0) {
                                bVar.b();
                            } else if (i2 > iA) {
                                bVar.a();
                            }
                        }
                        while (i2 > 0 && reentrantLock.hasWaiters(this.h)) {
                            this.h.signal();
                            i2--;
                        }
                    }
                    throw th;
                }
            }
            if (i2 > 0) {
                int i4 = this.d - i2;
                this.d = i4;
                this.b = iA;
                com.amoad.ax<E>.b bVar2 = this.f;
                if (bVar2 != null) {
                    if (i4 == 0) {
                        bVar2.b();
                    } else if (i2 > iA) {
                        bVar2.a();
                    }
                }
                while (i2 > 0 && reentrantLock.hasWaiters(this.h)) {
                    this.h.signal();
                    i2--;
                }
            }
            reentrantLock.unlock();
            return iMin;
        } catch (java.lang.Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new com.amoad.ax.a();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(E e) {
        a(e);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.d == this.f261a.length) {
                return false;
            }
            b(e);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(E e, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        a(e);
        long nanos = timeUnit.toNanos(j);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lockInterruptibly();
        while (this.d == this.f261a.length) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.h.awaitNanos(nanos);
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        b(e);
        reentrantLock.unlock();
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return (E) this.f261a[this.b];
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue
    public final E poll() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return this.d == 0 ? null : a();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E poll(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        long nanos = timeUnit.toNanos(j);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lockInterruptibly();
        while (this.d == 0) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                nanos = this.g.awaitNanos(nanos);
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        E eA = a();
        reentrantLock.unlock();
        return eA;
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(E e) throws java.lang.InterruptedException {
        a(e);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lockInterruptibly();
        while (this.d == this.f261a.length) {
            try {
                this.h.await();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        b(e);
        reentrantLock.unlock();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return this.f261a.length - this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final boolean remove(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        java.lang.Object[] objArr = this.f261a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.d > 0) {
                int i = this.c;
                int iA = this.b;
                while (!obj.equals(objArr[iA])) {
                    iA = a(iA);
                    if (iA == i) {
                    }
                }
                b(iA);
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E take() throws java.lang.InterruptedException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lockInterruptibly();
        while (this.d == 0) {
            try {
                this.g.await();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        E eA = a();
        reentrantLock.unlock();
        return eA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f261a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int i = this.d;
            java.lang.Object[] objArr2 = new java.lang.Object[i];
            int length = objArr.length;
            int i2 = this.b;
            int i3 = length - i2;
            if (i <= i3) {
                java.lang.System.arraycopy(objArr, i2, objArr2, 0, i);
            } else {
                java.lang.System.arraycopy(objArr, i2, objArr2, 0, i3);
                java.lang.System.arraycopy(objArr, 0, objArr2, i3, i - i3);
            }
            return objArr2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        java.lang.Object[] objArr = this.f261a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int i = this.d;
            int length = tArr.length;
            if (length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            int length2 = objArr.length;
            int i2 = this.b;
            int i3 = length2 - i2;
            if (i <= i3) {
                java.lang.System.arraycopy(objArr, i2, tArr, 0, i);
            } else {
                java.lang.System.arraycopy(objArr, i2, tArr, 0, i3);
                java.lang.System.arraycopy(objArr, 0, tArr, i3, i - i3);
            }
            if (length > i) {
                tArr[i] = null;
            }
            return tArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int i = this.d;
            if (i == 0) {
                return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            int iA = this.b;
            while (true) {
                java.lang.Object obj = this.f261a[iA];
                if (obj == this) {
                    obj = "(this Collection)";
                }
                sb.append(obj);
                i--;
                if (i == 0) {
                    return sb.append(']').toString();
                }
                sb.append(',').append(' ');
                iA = a(iA);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
