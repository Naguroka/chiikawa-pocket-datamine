package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        androidx.constraintlayout.core.motion.CustomAttribute[] values = new androidx.constraintlayout.core.motion.CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void clear() {
            java.util.Arrays.fill(this.keys, 999);
            java.util.Arrays.fill(this.values, (java.lang.Object) null);
            this.count = 0;
        }

        public void dump() {
            java.lang.System.out.println("V: " + java.util.Arrays.toString(java.util.Arrays.copyOf(this.keys, this.count)));
            java.lang.System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                java.lang.System.out.print((i == 0 ? "" : ", ") + valueAt(i));
                i++;
            }
            java.lang.System.out.println(com.ironsource.y8.i.e);
        }

        public int size() {
            return this.count;
        }

        public androidx.constraintlayout.core.motion.CustomAttribute valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void append(int i, androidx.constraintlayout.core.motion.CustomAttribute customAttribute) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = customAttribute;
            int[] iArr = this.keys;
            int i2 = this.count;
            this.count = i2 + 1;
            iArr[i2] = i;
            java.util.Arrays.sort(iArr);
        }

        public void remove(int i) {
            this.values[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.count;
                if (i2 < i4) {
                    int[] iArr = this.keys;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.count = i4 - 1;
                    return;
                }
            }
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        androidx.constraintlayout.core.motion.CustomVariable[] values = new androidx.constraintlayout.core.motion.CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void clear() {
            java.util.Arrays.fill(this.keys, 999);
            java.util.Arrays.fill(this.values, (java.lang.Object) null);
            this.count = 0;
        }

        public void dump() {
            java.lang.System.out.println("V: " + java.util.Arrays.toString(java.util.Arrays.copyOf(this.keys, this.count)));
            java.lang.System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                java.lang.System.out.print((i == 0 ? "" : ", ") + valueAt(i));
                i++;
            }
            java.lang.System.out.println(com.ironsource.y8.i.e);
        }

        public int size() {
            return this.count;
        }

        public androidx.constraintlayout.core.motion.CustomVariable valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void append(int i, androidx.constraintlayout.core.motion.CustomVariable customVariable) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = customVariable;
            int[] iArr = this.keys;
            int i2 = this.count;
            this.count = i2 + 1;
            iArr[i2] = i;
            java.util.Arrays.sort(iArr);
        }

        public void remove(int i) {
            this.values[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.count;
                if (i2 < i4) {
                    int[] iArr = this.keys;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.count = i4 - 1;
                    return;
                }
            }
        }
    }

    static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        float[][] values = new float[101][];

        public FloatArray() {
            clear();
        }

        public void clear() {
            java.util.Arrays.fill(this.keys, 999);
            java.util.Arrays.fill(this.values, (java.lang.Object) null);
            this.count = 0;
        }

        public void dump() {
            java.lang.System.out.println("V: " + java.util.Arrays.toString(java.util.Arrays.copyOf(this.keys, this.count)));
            java.lang.System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                java.lang.System.out.print((i == 0 ? "" : ", ") + java.util.Arrays.toString(valueAt(i)));
                i++;
            }
            java.lang.System.out.println(com.ironsource.y8.i.e);
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void append(int i, float[] fArr) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = fArr;
            int[] iArr = this.keys;
            int i2 = this.count;
            this.count = i2 + 1;
            iArr[i2] = i;
            java.util.Arrays.sort(iArr);
        }

        public void remove(int i) {
            this.values[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.count;
                if (i2 < i4) {
                    int[] iArr = this.keys;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.count = i4 - 1;
                    return;
                }
            }
        }
    }
}
