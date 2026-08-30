package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class yDt<K, V> {
    private int IL;
    private int Kg;
    private int bX;
    private final java.util.LinkedHashMap<K, V> bg;
    private int eqN;
    private int iR;
    private int ldr;
    private int zx;

    protected int IL(K k, V v) {
        return 1;
    }

    protected V IL(K k) {
        return null;
    }

    public yDt(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.bX = i;
        this.bg = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    public final V bg(K k) {
        V vPut;
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.bg.get(k);
            if (v != null) {
                this.iR++;
                return v;
            }
            this.Kg++;
            V vIL = IL(k);
            if (vIL == null) {
                return null;
            }
            synchronized (this) {
                this.zx++;
                vPut = this.bg.put(k, vIL);
                if (vPut != null) {
                    this.bg.put(k, vPut);
                } else {
                    this.IL += bX(k, vIL);
                }
            }
            if (vPut != null) {
                return vPut;
            }
            bg(this.bX);
            return vIL;
        }
    }

    public final V bg(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.eqN++;
            this.IL += bX(k, v);
            vPut = this.bg.put(k, v);
            if (vPut != null) {
                this.IL -= bX(k, vPut);
            }
        }
        bg(this.bX);
        return vPut;
    }

    public void bg(int i) {
        while (true) {
            synchronized (this) {
                if (this.IL < 0 || (this.bg.isEmpty() && this.IL != 0)) {
                    break;
                }
                if (this.IL > i && !this.bg.isEmpty()) {
                    java.util.Map.Entry<K, V> next = this.bg.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.bg.remove(key);
                    this.IL -= bX(key, value);
                    this.ldr++;
                }
                return;
            }
        }
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    private int bX(K k, V v) {
        int iIL = IL(k, v);
        if (iIL >= 0) {
            return iIL;
        }
        throw new java.lang.IllegalStateException("Negative size: " + k + com.ironsource.y8.i.b + v);
    }

    public final synchronized java.lang.String toString() {
        int i;
        int i2;
        i = this.iR;
        i2 = this.Kg + i;
        return java.lang.String.format(java.util.Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.bX), java.lang.Integer.valueOf(this.iR), java.lang.Integer.valueOf(this.Kg), java.lang.Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
