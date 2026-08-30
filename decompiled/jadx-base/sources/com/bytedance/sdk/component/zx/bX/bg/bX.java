package com.bytedance.sdk.component.zx.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX<K, V> {
    private int IL;
    private int Kg;
    private int bX;
    private final java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> bg;
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

    public bX(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.bX = i;
        this.bg = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    public final V bg(K k) {
        V v;
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            java.lang.ref.SoftReference<V> softReference = this.bg.get(k);
            if (softReference != null) {
                v = softReference.get();
                if (v != null) {
                    this.iR++;
                    return v;
                }
                this.bg.remove(k);
            } else {
                v = null;
            }
            this.Kg++;
            V vIL = IL(k);
            if (vIL == null) {
                return null;
            }
            synchronized (this) {
                this.zx++;
                java.lang.ref.SoftReference<V> softReferencePut = this.bg.put(k, new java.lang.ref.SoftReference<>(vIL));
                if (softReferencePut != null) {
                    v = softReferencePut.get();
                }
                if (v != null) {
                    this.bg.put(k, softReferencePut);
                } else {
                    this.IL += bX(k, vIL);
                }
            }
            if (v != null) {
                return v;
            }
            bg(this.bX);
            return vIL;
        }
    }

    public final V bg(K k, V v) {
        V v2;
        if (k == null || v == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.eqN++;
            this.IL += bX(k, v);
            java.lang.ref.SoftReference<V> softReferencePut = this.bg.put(k, new java.lang.ref.SoftReference<>(v));
            if (softReferencePut != null) {
                v2 = softReferencePut.get();
                if (v2 != null) {
                    this.IL -= bX(k, v2);
                }
            } else {
                v2 = null;
            }
        }
        bg(this.bX);
        return v2;
    }

    public void bg(int i) {
        while (true) {
            synchronized (this) {
                if (this.IL < 0 || (this.bg.isEmpty() && this.IL != 0)) {
                    break;
                    break;
                }
                if (this.IL <= i) {
                    return;
                }
                java.util.Map.Entry<K, java.lang.ref.SoftReference<V>> next = this.bg.entrySet().iterator().next();
                if (next == null) {
                    return;
                }
                K key = next.getKey();
                java.lang.ref.SoftReference<V> value = next.getValue();
                this.bg.remove(key);
                if (value != null) {
                    this.IL -= bX(key, value.get());
                }
                this.ldr++;
            }
        }
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.IL + ", maxSize: " + i);
        this.IL = 0;
        this.bg.clear();
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
        return java.lang.String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.bX), java.lang.Integer.valueOf(this.iR), java.lang.Integer.valueOf(this.Kg), java.lang.Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
