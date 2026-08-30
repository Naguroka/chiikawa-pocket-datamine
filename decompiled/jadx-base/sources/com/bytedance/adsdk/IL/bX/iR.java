package com.bytedance.adsdk.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public class iR<T> {
    T IL;
    T bg;

    public void bg(T t, T t2) {
        this.bg = t;
        this.IL = t2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof android.util.Pair)) {
            return false;
        }
        android.util.Pair pair = (android.util.Pair) obj;
        return IL(pair.first, this.bg) && IL(pair.second, this.IL);
    }

    private static boolean IL(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.bg;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.IL;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Pair{" + this.bg + " " + this.IL + "}";
    }
}
