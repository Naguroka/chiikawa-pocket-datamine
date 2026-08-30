package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class BundleCoverageImpl extends org.jacoco.core.analysis.CoverageNodeImpl implements org.jacoco.core.analysis.IBundleCoverage {
    private final java.util.Collection<org.jacoco.core.analysis.IPackageCoverage> packages;

    public BundleCoverageImpl(java.lang.String str, java.util.Collection<org.jacoco.core.analysis.IPackageCoverage> collection) {
        super(org.jacoco.core.analysis.ICoverageNode.ElementType.BUNDLE, str);
        this.packages = collection;
        increment(collection);
    }

    public BundleCoverageImpl(java.lang.String str, java.util.Collection<org.jacoco.core.analysis.IClassCoverage> collection, java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> collection2) {
        this(str, groupByPackage(collection, collection2));
    }

    private static java.util.Collection<org.jacoco.core.analysis.IPackageCoverage> groupByPackage(java.util.Collection<org.jacoco.core.analysis.IClassCoverage> collection, java.util.Collection<org.jacoco.core.analysis.ISourceFileCoverage> collection2) {
        java.util.HashMap map = new java.util.HashMap();
        for (org.jacoco.core.analysis.IClassCoverage iClassCoverage : collection) {
            addByName(map, iClassCoverage.getPackageName(), iClassCoverage);
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (org.jacoco.core.analysis.ISourceFileCoverage iSourceFileCoverage : collection2) {
            addByName(map2, iSourceFileCoverage.getPackageName(), iSourceFileCoverage);
        }
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : hashSet) {
            java.util.Collection collectionEmptyList = (java.util.Collection) map.get(str);
            if (collectionEmptyList == null) {
                collectionEmptyList = java.util.Collections.emptyList();
            }
            java.util.Collection collectionEmptyList2 = (java.util.Collection) map2.get(str);
            if (collectionEmptyList2 == null) {
                collectionEmptyList2 = java.util.Collections.emptyList();
            }
            arrayList.add(new org.jacoco.core.internal.analysis.PackageCoverageImpl(str, collectionEmptyList, collectionEmptyList2));
        }
        return arrayList;
    }

    private static <T> void addByName(java.util.Map<java.lang.String, java.util.Collection<T>> map, java.lang.String str, T t) {
        java.util.Collection<T> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(t);
    }

    @Override // org.jacoco.core.analysis.IBundleCoverage
    public java.util.Collection<org.jacoco.core.analysis.IPackageCoverage> getPackages() {
        return this.packages;
    }
}
