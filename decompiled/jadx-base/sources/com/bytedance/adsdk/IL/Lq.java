package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
abstract class Lq<K, V> {
    com.bytedance.adsdk.IL.Lq<K, V>.IL IL;

    protected abstract java.util.Map<K, V> IL();

    protected abstract void bX();

    protected abstract int bg();

    protected abstract int bg(java.lang.Object obj);

    protected abstract java.lang.Object bg(int i, int i2);

    protected abstract void bg(int i);

    Lq() {
    }

    final class bg<T> implements java.util.Iterator<T> {
        int IL;
        int bX;
        final int bg;
        boolean eqN = false;

        bg(int i) {
            this.bg = i;
            this.IL = com.bytedance.adsdk.IL.Lq.this.bg();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.bX < this.IL;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T t = (T) com.bytedance.adsdk.IL.Lq.this.bg(this.bX, this.bg);
            this.bX++;
            this.eqN = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.eqN) {
                throw new java.lang.IllegalStateException();
            }
            int i = this.bX - 1;
            this.bX = i;
            this.IL--;
            this.eqN = false;
            com.bytedance.adsdk.IL.Lq.this.bg(i);
        }
    }

    final class IL implements java.util.Set<K> {
        IL() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            com.bytedance.adsdk.IL.Lq.this.bX();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return com.bytedance.adsdk.IL.Lq.this.bg(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            return com.bytedance.adsdk.IL.Lq.bg(com.bytedance.adsdk.IL.Lq.this.IL(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return com.bytedance.adsdk.IL.Lq.this.bg() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
            return new com.bytedance.adsdk.IL.Lq.bg(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            int iBg = com.bytedance.adsdk.IL.Lq.this.bg(obj);
            if (iBg < 0) {
                return false;
            }
            com.bytedance.adsdk.IL.Lq.this.bg(iBg);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            return com.bytedance.adsdk.IL.Lq.IL(com.bytedance.adsdk.IL.Lq.this.IL(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            return com.bytedance.adsdk.IL.Lq.bX(com.bytedance.adsdk.IL.Lq.this.IL(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return com.bytedance.adsdk.IL.Lq.this.bg();
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
            return com.bytedance.adsdk.IL.Lq.this.IL(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) com.bytedance.adsdk.IL.Lq.this.bg(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object obj) {
            return com.bytedance.adsdk.IL.Lq.bg(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iBg = com.bytedance.adsdk.IL.Lq.this.bg() - 1; iBg >= 0; iBg--) {
                java.lang.Object objBg = com.bytedance.adsdk.IL.Lq.this.bg(iBg, 0);
                iHashCode += objBg == null ? 0 : objBg.hashCode();
            }
            return iHashCode;
        }
    }

    public static <K, V> boolean bg(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean IL(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean bX(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public java.lang.Object[] IL(int i) {
        int iBg = bg();
        java.lang.Object[] objArr = new java.lang.Object[iBg];
        for (int i2 = 0; i2 < iBg; i2++) {
            objArr[i2] = bg(i2, i);
        }
        return objArr;
    }

    public <T> T[] bg(T[] tArr, int i) {
        int iBg = bg();
        if (tArr.length < iBg) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), iBg));
        }
        for (int i2 = 0; i2 < iBg; i2++) {
            tArr[i2] = bg(i2, i);
        }
        if (tArr.length > iBg) {
            tArr[iBg] = null;
        }
        return tArr;
    }

    public static <T> boolean bg(java.util.Set<T> set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public java.util.Set<K> eqN() {
        if (this.IL == null) {
            this.IL = new com.bytedance.adsdk.IL.Lq.IL();
        }
        return this.IL;
    }
}
