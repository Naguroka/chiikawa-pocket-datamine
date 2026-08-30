package org.checkerframework.checker.formatter.qual;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 org.checkerframework.checker.formatter.qual.ConversionCategory, still in use, count: 1, list:
  (r0v0 org.checkerframework.checker.formatter.qual.ConversionCategory) from 0x00c9: FILLED_NEW_ARRAY 
  (r0v0 org.checkerframework.checker.formatter.qual.ConversionCategory)
  (r2v3 org.checkerframework.checker.formatter.qual.ConversionCategory)
  (r5v1 org.checkerframework.checker.formatter.qual.ConversionCategory)
  (r10v2 org.checkerframework.checker.formatter.qual.ConversionCategory)
  (r11v7 org.checkerframework.checker.formatter.qual.ConversionCategory)
 A[WRAPPED] elemType: org.checkerframework.checker.formatter.qual.ConversionCategory
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class ConversionCategory {
    GENERAL("bBhHsS", null),
    CHAR("cC", java.lang.Character.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class),
    INT("doxX", java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.math.BigInteger.class),
    FLOAT("eEfgGaA", java.lang.Float.class, java.lang.Double.class, java.math.BigDecimal.class),
    TIME("tT", java.lang.Long.class, java.util.Calendar.class, java.util.Date.class),
    CHAR_AND_INT(null, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class),
    INT_AND_TIME(null, java.lang.Long.class),
    NULL(null, new java.lang.Class[0]),
    UNUSED(null, null);

    private static final org.checkerframework.checker.formatter.qual.ConversionCategory[] conversionCategoriesForIntersect;
    private static final org.checkerframework.checker.formatter.qual.ConversionCategory[] conversionCategoriesForUnion;
    private static final org.checkerframework.checker.formatter.qual.ConversionCategory[] conversionCategoriesWithChar;
    public final java.lang.String chars;
    public final java.lang.Class<?>[] types;

    public static org.checkerframework.checker.formatter.qual.ConversionCategory valueOf(java.lang.String str) {
        return (org.checkerframework.checker.formatter.qual.ConversionCategory) java.lang.Enum.valueOf(org.checkerframework.checker.formatter.qual.ConversionCategory.class, str);
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory[] values() {
        return (org.checkerframework.checker.formatter.qual.ConversionCategory[]) $VALUES.clone();
    }

    static {
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory = CHAR;
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory2 = INT;
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory3 = FLOAT;
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory4 = TIME;
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory5 = CHAR_AND_INT;
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory6 = INT_AND_TIME;
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory7 = NULL;
        conversionCategoriesWithChar = new org.checkerframework.checker.formatter.qual.ConversionCategory[]{conversionCategory, conversionCategory, conversionCategory2, conversionCategory3, conversionCategory4};
        conversionCategoriesForIntersect = new org.checkerframework.checker.formatter.qual.ConversionCategory[]{conversionCategory, conversionCategory2, conversionCategory3, conversionCategory4, conversionCategory5, conversionCategory6, conversionCategory7};
        conversionCategoriesForUnion = new org.checkerframework.checker.formatter.qual.ConversionCategory[]{conversionCategory7, conversionCategory5, conversionCategory6, conversionCategory, conversionCategory2, conversionCategory3, conversionCategory4};
    }

    private ConversionCategory(java.lang.String str, java.lang.Class... clsArr) {
        super(str, i);
        this.chars = str;
        if (clsArr == null) {
            this.types = clsArr;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(clsArr.length);
        for (java.lang.Class cls : clsArr) {
            arrayList.add(cls);
            java.lang.Class<? extends java.lang.Object> clsUnwrapPrimitive = unwrapPrimitive(cls);
            if (clsUnwrapPrimitive != null) {
                arrayList.add(clsUnwrapPrimitive);
            }
        }
        this.types = (java.lang.Class[]) arrayList.toArray(new java.lang.Class[arrayList.size()]);
    }

    private static java.lang.Class<? extends java.lang.Object> unwrapPrimitive(java.lang.Class<?> cls) {
        if (cls == java.lang.Byte.class) {
            return java.lang.Byte.TYPE;
        }
        if (cls == java.lang.Character.class) {
            return java.lang.Character.TYPE;
        }
        if (cls == java.lang.Short.class) {
            return java.lang.Short.TYPE;
        }
        if (cls == java.lang.Integer.class) {
            return java.lang.Integer.TYPE;
        }
        if (cls == java.lang.Long.class) {
            return java.lang.Long.TYPE;
        }
        if (cls == java.lang.Float.class) {
            return java.lang.Float.TYPE;
        }
        if (cls == java.lang.Double.class) {
            return java.lang.Double.TYPE;
        }
        if (cls == java.lang.Boolean.class) {
            return java.lang.Boolean.TYPE;
        }
        return null;
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory fromConversionChar(char c) {
        for (org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory : conversionCategoriesWithChar) {
            if (conversionCategory.chars.contains(java.lang.String.valueOf(c))) {
                return conversionCategory;
            }
        }
        throw new java.lang.IllegalArgumentException("Bad conversion character " + c);
    }

    private static <E> java.util.Set<E> arrayToSet(E[] eArr) {
        return new java.util.HashSet(java.util.Arrays.asList(eArr));
    }

    public static boolean isSubsetOf(org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory, org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory2) {
        return intersect(conversionCategory, conversionCategory2) == conversionCategory;
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory intersect(org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory, org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory2) {
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory3 = UNUSED;
        if (conversionCategory == conversionCategory3) {
            return conversionCategory2;
        }
        if (conversionCategory2 == conversionCategory3) {
            return conversionCategory;
        }
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory4 = GENERAL;
        if (conversionCategory == conversionCategory4) {
            return conversionCategory2;
        }
        if (conversionCategory2 == conversionCategory4) {
            return conversionCategory;
        }
        java.util.Set setArrayToSet = arrayToSet(conversionCategory.types);
        setArrayToSet.retainAll(arrayToSet(conversionCategory2.types));
        for (org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory5 : conversionCategoriesForIntersect) {
            if (arrayToSet(conversionCategory5.types).equals(setArrayToSet)) {
                return conversionCategory5;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static org.checkerframework.checker.formatter.qual.ConversionCategory union(org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory, org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory2) {
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory3 = UNUSED;
        if (conversionCategory == conversionCategory3 || conversionCategory2 == conversionCategory3 || conversionCategory == (conversionCategory3 = GENERAL) || conversionCategory2 == conversionCategory3) {
            return conversionCategory3;
        }
        org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory4 = CHAR_AND_INT;
        if ((conversionCategory == conversionCategory4 && conversionCategory2 == INT_AND_TIME) || (conversionCategory == INT_AND_TIME && conversionCategory2 == conversionCategory4)) {
            return INT;
        }
        java.util.Set setArrayToSet = arrayToSet(conversionCategory.types);
        setArrayToSet.addAll(arrayToSet(conversionCategory2.types));
        for (org.checkerframework.checker.formatter.qual.ConversionCategory conversionCategory5 : conversionCategoriesForUnion) {
            if (arrayToSet(conversionCategory5.types).equals(setArrayToSet)) {
                return conversionCategory5;
            }
        }
        return GENERAL;
    }

    public boolean isAssignableFrom(java.lang.Class<?> cls) {
        if (this.types == null || cls == java.lang.Void.TYPE) {
            return true;
        }
        for (java.lang.Class<?> cls2 : this.types) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @org.checkerframework.dataflow.qual.Pure
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        java.lang.Class<?>[] clsArr = this.types;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        java.util.StringJoiner stringJoiner = new java.util.StringJoiner(", ", "(one of: ", ")");
        for (java.lang.Class<?> cls : this.types) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb.append(" ");
        sb.append(stringJoiner);
        return sb.toString();
    }
}
