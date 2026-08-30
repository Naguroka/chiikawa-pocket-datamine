package com.google.common.math;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
public final class Quantiles {
    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double lower, double upper, double remainder, double scale) {
        if (lower == Double.NEGATIVE_INFINITY) {
            return upper == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (upper == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return lower + (((upper - lower) * remainder) / scale);
    }

    public static com.google.common.math.Quantiles.ScaleAndIndex median() {
        return scale(2).index(1);
    }

    public static com.google.common.math.Quantiles.Scale quartiles() {
        return scale(4);
    }

    public static com.google.common.math.Quantiles.Scale percentiles() {
        return scale(100);
    }

    public static com.google.common.math.Quantiles.Scale scale(int scale) {
        return new com.google.common.math.Quantiles.Scale(scale);
    }

    public static final class Scale {
        private final int scale;

        private Scale(int scale) {
            com.google.common.base.Preconditions.checkArgument(scale > 0, "Quantile scale must be positive");
            this.scale = scale;
        }

        public com.google.common.math.Quantiles.ScaleAndIndex index(int index) {
            return new com.google.common.math.Quantiles.ScaleAndIndex(this.scale, index);
        }

        public com.google.common.math.Quantiles.ScaleAndIndexes indexes(int... indexes) {
            return new com.google.common.math.Quantiles.ScaleAndIndexes(this.scale, (int[]) indexes.clone());
        }

        public com.google.common.math.Quantiles.ScaleAndIndexes indexes(java.util.Collection<java.lang.Integer> indexes) {
            return new com.google.common.math.Quantiles.ScaleAndIndexes(this.scale, com.google.common.primitives.Ints.toArray(indexes));
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        private ScaleAndIndex(int scale, int index) {
            com.google.common.math.Quantiles.checkIndex(index, scale);
            this.scale = scale;
            this.index = index;
        }

        public double compute(java.util.Collection<? extends java.lang.Number> dataset) {
            return computeInPlace(com.google.common.primitives.Doubles.toArray(dataset));
        }

        public double compute(double... dataset) {
            return computeInPlace((double[]) dataset.clone());
        }

        public double compute(long... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.longsToDoubles(dataset));
        }

        public double compute(int... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.intsToDoubles(dataset));
        }

        public double computeInPlace(double... dataset) {
            com.google.common.base.Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (com.google.common.math.Quantiles.containsNaN(dataset)) {
                return Double.NaN;
            }
            long length = ((long) this.index) * ((long) (dataset.length - 1));
            int iDivide = (int) com.google.common.math.LongMath.divide(length, this.scale, java.math.RoundingMode.DOWN);
            int i = (int) (length - (((long) iDivide) * ((long) this.scale)));
            com.google.common.math.Quantiles.selectInPlace(iDivide, dataset, 0, dataset.length - 1);
            if (i != 0) {
                int i2 = iDivide + 1;
                com.google.common.math.Quantiles.selectInPlace(i2, dataset, i2, dataset.length - 1);
                return com.google.common.math.Quantiles.interpolate(dataset[iDivide], dataset[i2], i, this.scale);
            }
            return dataset[iDivide];
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        private ScaleAndIndexes(int scale, int[] indexes) {
            for (int i : indexes) {
                com.google.common.math.Quantiles.checkIndex(i, scale);
            }
            com.google.common.base.Preconditions.checkArgument(indexes.length > 0, "Indexes must be a non empty array");
            this.scale = scale;
            this.indexes = indexes;
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(java.util.Collection<? extends java.lang.Number> dataset) {
            return computeInPlace(com.google.common.primitives.Doubles.toArray(dataset));
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(double... dataset) {
            return computeInPlace((double[]) dataset.clone());
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(long... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.longsToDoubles(dataset));
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(int... dataset) {
            return computeInPlace(com.google.common.math.Quantiles.intsToDoubles(dataset));
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> computeInPlace(double... dataset) {
            int i = 0;
            com.google.common.base.Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (com.google.common.math.Quantiles.containsNaN(dataset)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                int[] iArr = this.indexes;
                int length = iArr.length;
                while (i < length) {
                    linkedHashMap.put(java.lang.Integer.valueOf(iArr[i]), java.lang.Double.valueOf(Double.NaN));
                    i++;
                }
                return java.util.Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.indexes;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr6 = this.indexes;
                if (i2 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i2]) * ((long) (dataset.length - 1));
                int iDivide = (int) com.google.common.math.LongMath.divide(length2, this.scale, java.math.RoundingMode.DOWN);
                int i4 = (int) (length2 - (((long) iDivide) * ((long) this.scale)));
                iArr3[i2] = iDivide;
                iArr4[i2] = i4;
                iArr5[i3] = iDivide;
                i3++;
                if (i4 != 0) {
                    iArr5[i3] = iDivide + 1;
                    i3++;
                }
                i2++;
            }
            java.util.Arrays.sort(iArr5, 0, i3);
            com.google.common.math.Quantiles.selectAllInPlace(iArr5, 0, i3 - 1, dataset, 0, dataset.length - 1);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            while (true) {
                int[] iArr7 = this.indexes;
                if (i < iArr7.length) {
                    int i5 = iArr3[i];
                    int i6 = iArr4[i];
                    if (i6 == 0) {
                        linkedHashMap2.put(java.lang.Integer.valueOf(iArr7[i]), java.lang.Double.valueOf(dataset[i5]));
                    } else {
                        linkedHashMap2.put(java.lang.Integer.valueOf(iArr7[i]), java.lang.Double.valueOf(com.google.common.math.Quantiles.interpolate(dataset[i5], dataset[i5 + 1], i6, this.scale)));
                    }
                    i++;
                } else {
                    return java.util.Collections.unmodifiableMap(linkedHashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dataset) {
        for (double d : dataset) {
            if (java.lang.Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int index, int scale) {
        if (index < 0 || index > scale) {
            throw new java.lang.IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + scale);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] longs) {
        int length = longs.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = longs[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] ints) {
        int length = ints.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ints[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int required, double[] array, int from, int to) {
        if (required != from) {
            while (to > from) {
                int iPartition = partition(array, from, to);
                if (iPartition >= required) {
                    to = iPartition - 1;
                }
                if (iPartition <= required) {
                    from = iPartition + 1;
                }
            }
            return;
        }
        int i = from;
        for (int i2 = from + 1; i2 <= to; i2++) {
            if (array[i] > array[i2]) {
                i = i2;
            }
        }
        if (i != from) {
            swap(array, i, from);
        }
    }

    private static int partition(double[] array, int from, int to) {
        movePivotToStartOfSlice(array, from, to);
        double d = array[from];
        int i = to;
        while (to > from) {
            if (array[to] > d) {
                swap(array, i, to);
                i--;
            }
            to--;
        }
        swap(array, from, i);
        return i;
    }

    private static void movePivotToStartOfSlice(double[] array, int from, int to) {
        int i = (from + to) >>> 1;
        double d = array[to];
        double d2 = array[i];
        boolean z = d < d2;
        double d3 = array[from];
        boolean z2 = d2 < d3;
        boolean z3 = d < d3;
        if (z == z2) {
            swap(array, i, from);
        } else if (z != z3) {
            swap(array, from, to);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] allRequired, int requiredFrom, int requiredTo, double[] array, int from, int to) {
        int iChooseNextSelection = chooseNextSelection(allRequired, requiredFrom, requiredTo, from, to);
        int i = allRequired[iChooseNextSelection];
        selectInPlace(i, array, from, to);
        int i2 = iChooseNextSelection - 1;
        while (i2 >= requiredFrom && allRequired[i2] == i) {
            i2--;
        }
        if (i2 >= requiredFrom) {
            selectAllInPlace(allRequired, requiredFrom, i2, array, from, i - 1);
        }
        int i3 = iChooseNextSelection + 1;
        while (i3 <= requiredTo && allRequired[i3] == i) {
            i3++;
        }
        if (i3 <= requiredTo) {
            selectAllInPlace(allRequired, i3, requiredTo, array, i + 1, to);
        }
    }

    private static int chooseNextSelection(int[] allRequired, int requiredFrom, int requiredTo, int from, int to) {
        if (requiredFrom == requiredTo) {
            return requiredFrom;
        }
        int i = from + to;
        int i2 = i >>> 1;
        while (requiredTo > requiredFrom + 1) {
            int i3 = (requiredFrom + requiredTo) >>> 1;
            int i4 = allRequired[i3];
            if (i4 > i2) {
                requiredTo = i3;
            } else {
                if (i4 >= i2) {
                    return i3;
                }
                requiredFrom = i3;
            }
        }
        return (i - allRequired[requiredFrom]) - allRequired[requiredTo] > 0 ? requiredTo : requiredFrom;
    }

    private static void swap(double[] array, int i, int j) {
        double d = array[i];
        array[i] = array[j];
        array[j] = d;
    }
}
