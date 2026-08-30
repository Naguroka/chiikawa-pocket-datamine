package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class SpreadBuilder {
    private final java.util.ArrayList<java.lang.Object> list;

    public SpreadBuilder(int i) {
        this.list = new java.util.ArrayList<>(i);
    }

    public void addSpread(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length > 0) {
                java.util.ArrayList<java.lang.Object> arrayList = this.list;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                java.util.Collections.addAll(this.list, objArr);
                return;
            }
            return;
        }
        if (obj instanceof java.util.Collection) {
            this.list.addAll((java.util.Collection) obj);
            return;
        }
        if (obj instanceof java.lang.Iterable) {
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                this.list.add(it.next());
            }
            return;
        }
        if (obj instanceof java.util.Iterator) {
            java.util.Iterator it2 = (java.util.Iterator) obj;
            while (it2.hasNext()) {
                this.list.add(it2.next());
            }
            return;
        }
        throw new java.lang.UnsupportedOperationException("Don't know how to spread " + obj.getClass());
    }

    public int size() {
        return this.list.size();
    }

    public void add(java.lang.Object obj) {
        this.list.add(obj);
    }

    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.list.toArray(objArr);
    }
}
