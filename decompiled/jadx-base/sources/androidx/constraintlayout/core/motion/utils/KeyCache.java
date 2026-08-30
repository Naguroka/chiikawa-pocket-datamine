package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class KeyCache {
    java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> map = new java.util.HashMap<>();

    public void setFloatValue(java.lang.Object obj, java.lang.String str, int i, float f) {
        if (!this.map.containsKey(obj)) {
            java.util.HashMap<java.lang.String, float[]> map = new java.util.HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            map.put(str, fArr);
            this.map.put(obj, map);
            return;
        }
        java.util.HashMap<java.lang.String, float[]> map2 = this.map.get(obj);
        if (map2 == null) {
            map2 = new java.util.HashMap<>();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            map2.put(str, fArr2);
            this.map.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i) {
            fArrCopyOf = java.util.Arrays.copyOf(fArrCopyOf, i + 1);
        }
        fArrCopyOf[i] = f;
        map2.put(str, fArrCopyOf);
    }

    public float getFloatValue(java.lang.Object obj, java.lang.String str, int i) {
        java.util.HashMap<java.lang.String, float[]> map;
        float[] fArr;
        if (this.map.containsKey(obj) && (map = this.map.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }
}
