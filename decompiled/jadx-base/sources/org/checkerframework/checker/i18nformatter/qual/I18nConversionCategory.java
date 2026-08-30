package org.checkerframework.checker.i18nformatter.qual;

/* JADX INFO: loaded from: classes6.dex */
public enum I18nConversionCategory {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new java.lang.Class[]{java.util.Date.class, java.lang.Number.class}, new java.lang.String[]{"date", "time"}),
    NUMBER(new java.lang.Class[]{java.lang.Number.class}, new java.lang.String[]{"number", "choice"});

    private static final org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] conversionCategoriesForIntersect;
    private static final org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[] namedCategories;
    public final java.lang.String[] strings;
    public final java.lang.Class<?>[] types;

    static {
        org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory = DATE;
        org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory2 = NUMBER;
        namedCategories = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[]{i18nConversionCategory, i18nConversionCategory2};
        conversionCategoriesForIntersect = new org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory[]{i18nConversionCategory, i18nConversionCategory2};
    }

    I18nConversionCategory(java.lang.Class[] clsArr, java.lang.String[] strArr) {
        this.types = clsArr;
        this.strings = strArr;
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory stringToI18nConversionCategory(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        for (org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory : namedCategories) {
            for (java.lang.String str2 : i18nConversionCategory.strings) {
                if (str2.equals(lowerCase)) {
                    return i18nConversionCategory;
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid format type " + lowerCase);
    }

    private static <E> java.util.Set<E> arrayToSet(E[] eArr) {
        return new java.util.HashSet(java.util.Arrays.asList(eArr));
    }

    public static boolean isSubsetOf(org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory, org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory2) {
        return intersect(i18nConversionCategory, i18nConversionCategory2) == i18nConversionCategory;
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory intersect(org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory, org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory2) {
        org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory3 = UNUSED;
        if (i18nConversionCategory == i18nConversionCategory3) {
            return i18nConversionCategory2;
        }
        if (i18nConversionCategory2 == i18nConversionCategory3) {
            return i18nConversionCategory;
        }
        org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory4 = GENERAL;
        if (i18nConversionCategory == i18nConversionCategory4) {
            return i18nConversionCategory2;
        }
        if (i18nConversionCategory2 == i18nConversionCategory4) {
            return i18nConversionCategory;
        }
        java.util.Set setArrayToSet = arrayToSet(i18nConversionCategory.types);
        setArrayToSet.retainAll(arrayToSet(i18nConversionCategory2.types));
        for (org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory5 : conversionCategoriesForIntersect) {
            if (arrayToSet(i18nConversionCategory5.types).equals(setArrayToSet)) {
                return i18nConversionCategory5;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory union(org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory, org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory2) {
        org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory i18nConversionCategory3 = UNUSED;
        return (i18nConversionCategory == i18nConversionCategory3 || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = GENERAL) || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = DATE) || i18nConversionCategory2 == i18nConversionCategory3) ? i18nConversionCategory3 : NUMBER;
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
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(name());
        if (this.types == null) {
            sb.append(" conversion category (all types)");
        } else {
            java.util.StringJoiner stringJoiner = new java.util.StringJoiner(", ", " conversion category (one of: ", ")");
            for (java.lang.Class<?> cls : this.types) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
