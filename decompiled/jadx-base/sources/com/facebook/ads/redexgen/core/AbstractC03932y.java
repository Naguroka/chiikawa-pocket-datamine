package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03932y<K, V> {
    public static java.lang.String[] A03 = {"1zdW1KODsFltmNuWmrotTBJZ", "RgZO4eFyMPRXq", "TNHX835HuEpqCwzJlYfwEUi8GaEU5NHd", "eVTb3p4k2JpJ0D4m3J9D4ZVPKPKe0wis", "2WztFDsRGhQaALYpxh067UM8", "jcxZvazs935Xr", "SKBAj5hBfWgpr40k574HTlm5xQmSLGYw", "jjH4wggc1wpWWLxRj5DmyzPuqk4QCdce"};

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2y<TK;TV;>.EntrySet; */
    public com.facebook.ads.redexgen.core.C03892u A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2y<TK;TV;>.KeySet; */
    public com.facebook.ads.redexgen.core.C03902v A01;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2y<TK;TV;>.ValuesCollection; */
    public com.facebook.ads.redexgen.core.C03922x A02;

    public abstract int A04();

    public abstract int A05(java.lang.Object obj);

    public abstract int A06(java.lang.Object obj);

    public abstract java.util.Map<K, V> A07();

    public abstract java.lang.Object A0B(int i, int i2);

    public abstract V A0C(int i, V v);

    public abstract void A0D();

    public abstract void A0E(int i);

    public abstract void A0F(K k, V v);

    public static <K, V> boolean A00(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            boolean zContainsKey = map.containsKey(it.next());
            java.lang.String[] strArr = A03;
            if (strArr[6].charAt(29) == strArr[2].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[6] = "cUAXgIbWxWmXM8IdimkoIKbOqppmM6Vz";
            strArr2[2] = "Ax9eiVneWoZpIcbsPIrW3KpgweGiIvpy";
            if (!zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean A01(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        for (java.lang.Object obj : collection) {
            if (A03[7].charAt(9) != 'w') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[6] = "E45UHwgrMTIMwaLYI7blxmvG7mW9Qs1w";
            strArr[2] = "z9os9R0vn0p5TampC1nMxoZk5TfunpzS";
            map.remove(obj);
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <K, V> boolean A02(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            boolean zContains = collection.contains(it.next());
            java.lang.String[] strArr = A03;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[0];
            int length = str.length();
            int oldSize = str2.length();
            if (length != oldSize) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[6] = "5v4gpohEe9mjCzRiIQv41Zeqn5qom46c";
            strArr2[2] = "O6DgVsMjSRRAXWI9cjkKRDle2DCyXpBO";
            if (!zContains) {
                it.remove();
            }
        }
        int oldSize2 = map.size();
        return size != oldSize2;
    }

    public static <T> boolean A03(java.util.Set<T> set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        boolean z = obj instanceof java.util.Set;
        java.lang.String[] strArr = A03;
        if (strArr[5].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[4] = "EyqH2KYHB8yq5zU8TINZ2CMR";
        strArr2[0] = "l4DYdurHJXrazQVJZIOfW52E";
        if (!z) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (java.lang.ClassCastException unused) {
            return false;
        } catch (java.lang.NullPointerException unused2) {
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.util.Set<java.util.Map.Entry<K, V>> A08() {
        if (this.A00 == null) {
            this.A00 = new java.util.Set<java.util.Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2u
                public static java.lang.String[] A01 = {"YtNF8b8ioPsgGgaDUde7WsjUMR00Jzoy", "ONmCOidcB6U5WZLM0OONVLfChSccD2jC", "SJu8u5Zh6YlgArwXrUirNpL4997vCJ", "nE4owr1wlu2VobktzduoSxTpcn75jZ1P", "qSRAP7Al4GPL3nfNBbzCOWjKh9ZAaoHj", "", "XO0jmWeq4", "JpA0oM1ow"};

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                 */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> collection) {
                    int iA04 = this.A00.A04();
                    for (java.util.Map.Entry<K, V> entry : collection) {
                        this.A00.A0F(entry.getKey(), entry.getValue());
                    }
                    return iA04 != this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                private final boolean A00(java.util.Map.Entry<K, V> object) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
                    A00((java.util.Map.Entry) obj);
                    throw null;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    this.A00.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(java.lang.Object obj) {
                    if (!(obj instanceof java.util.Map.Entry)) {
                        return false;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    int index = this.A00.A05(entry.getKey());
                    if (index < 0) {
                        return false;
                    }
                    java.lang.Object foundVal = this.A00.A0B(index, 1);
                    return com.facebook.ads.redexgen.core.AbstractC03862r.A04(foundVal, entry.getValue());
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(java.util.Collection<?> collection) {
                    java.util.Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(java.lang.Object obj) {
                    return com.facebook.ads.redexgen.core.AbstractC03932y.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i = 0;
                    for (int iA04 = this.A00.A04() - 1; iA04 >= 0; iA04--) {
                        com.facebook.ads.redexgen.core.AbstractC03932y abstractC03932y = this.A00;
                        java.lang.String[] strArr = A01;
                        java.lang.String str = strArr[6];
                        java.lang.String str2 = strArr[7];
                        int i2 = str.length();
                        int result = str2.length();
                        if (i2 != result) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A01;
                        strArr2[6] = "tAEwYau76";
                        strArr2[7] = "8QLk4N8pE";
                        int iHashCode = 0;
                        java.lang.Object objA0B = abstractC03932y.A0B(iA04, 0);
                        java.lang.Object objA0B2 = this.A00.A0B(iA04, 1);
                        int i3 = objA0B == null ? 0 : objA0B.hashCode();
                        if (objA0B2 != null) {
                            iHashCode = objA0B2.hashCode();
                        }
                        i += iHashCode ^ i3;
                    }
                    return i;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return this.A00.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return new com.facebook.ads.redexgen.core.C03912w(this.A00);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(java.lang.Object obj) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(java.util.Collection<?> collection) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(java.util.Collection<?> collection) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final java.lang.Object[] toArray() {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    throw new java.lang.UnsupportedOperationException();
                }
            };
        }
        com.facebook.ads.redexgen.core.C03892u c03892u = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[6].charAt(29) == strArr[2].charAt(29)) {
            throw new java.lang.RuntimeException();
        }
        A03[3] = "P6bvb6eoffQLg6Q5qx1NG9tFVzgAZtCe";
        return c03892u;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.util.Set<K> A09() {
        if (this.A01 == null) {
            this.A01 = new java.util.Set<K>() { // from class: com.facebook.ads.redexgen.X.2v
                public static java.lang.String[] A01 = {"edFq1RSzVbogperxRnGO2mwS9T0C3jXY", "CE90aEI9KYNoN0DMFbwcn9PMt89CsnEy", "tPPb", "CijerYzHuYsgCporrbQrcy6DwpkaY1hX", "Nwp2N8bBhYR0nMsdl7Yct", "Yte1vUSgji4S3VNobeKxGdrgBkFaACT", "hyxYDNsU9Fu2EdzaavUXH", "kSbZdYOgqhrWj8RnTgPZsuZs4QqXHZoL"};

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean add(K object) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(java.util.Collection<? extends K> collection) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    this.A00.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(java.lang.Object obj) {
                    return this.A00.A05(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(java.util.Collection<?> collection) {
                    return com.facebook.ads.redexgen.core.AbstractC03932y.A00(this.A00.A07(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(java.lang.Object obj) {
                    return com.facebook.ads.redexgen.core.AbstractC03932y.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i = 0;
                    int result = this.A00.A04();
                    for (int i2 = result - 1; i2 >= 0; i2--) {
                        int i3 = 0;
                        java.lang.Object objA0B = this.A00.A0B(i2, 0);
                        if (objA0B != null) {
                            i3 = objA0B.hashCode();
                        }
                        i += i3;
                    }
                    return i;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return this.A00.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final java.util.Iterator<K> iterator() {
                    return new com.facebook.ads.redexgen.core.C03882t(this.A00, 0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(java.lang.Object obj) {
                    int iA05 = this.A00.A05(obj);
                    if (iA05 >= 0) {
                        this.A00.A0E(iA05);
                        java.lang.String[] strArr = A01;
                        java.lang.String str = strArr[1];
                        java.lang.String str2 = strArr[2];
                        int length = str.length();
                        int index = str2.length();
                        if (length == index) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A01;
                        strArr2[4] = "xtpBes5HGReh40nAQqVKY";
                        strArr2[6] = "hpfnMqiRo4gFf5SPN0UOy";
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(java.util.Collection<?> collection) {
                    return com.facebook.ads.redexgen.core.AbstractC03932y.A01(this.A00.A07(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(java.util.Collection<?> collection) {
                    return com.facebook.ads.redexgen.core.AbstractC03932y.A02(this.A00.A07(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final java.lang.Object[] toArray() {
                    return this.A00.A0G(0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) this.A00.A0H(tArr, 0);
                }
            };
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.util.Collection<V> A0A() {
        if (this.A02 == null) {
            this.A02 = new java.util.Collection<V>() { // from class: com.facebook.ads.redexgen.X.2x
                public static java.lang.String[] A01 = {"B65p9FaUvzrFNvwuG6LjFu3dW8", "xEYdbkQkXJmqNi6lUscBQUgiZa7D0Dxz", "kpPcM5P9PMrcR9maJ", "lIn8lLeU70LUHRqRy8hC6rghr0456Bk3", "xAyovFCLcJcKz6S3I", "BHkXiShRs9wapcYGvvb8XQo", "e883n5N2Jnnmw9lqw", "xzZfUck7bISpz3H6ivOii"};

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean add(V object) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean addAll(java.util.Collection<? extends V> collection) {
                    throw new java.lang.UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final void clear() {
                    this.A00.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean contains(java.lang.Object obj) {
                    return this.A00.A06(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean containsAll(java.util.Collection<?> collection) {
                    java.util.Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return this.A00.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection, java.lang.Iterable
                public final java.util.Iterator<V> iterator() {
                    return new com.facebook.ads.redexgen.core.C03882t(this.A00, 1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean remove(java.lang.Object obj) {
                    int iA06 = this.A00.A06(obj);
                    if (iA06 >= 0) {
                        this.A00.A0E(iA06);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean removeAll(java.util.Collection<?> collection) {
                    int iA04 = this.A00.A04();
                    boolean z = false;
                    int i = 0;
                    while (i < iA04) {
                        com.facebook.ads.redexgen.core.AbstractC03932y abstractC03932y = this.A00;
                        java.lang.String[] strArr = A01;
                        java.lang.String str = strArr[4];
                        java.lang.String str2 = strArr[6];
                        int length = str.length();
                        int N = str2.length();
                        if (length != N) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A01;
                        strArr2[7] = "8TyfarL1WEatJJNOns6yk";
                        strArr2[2] = "ZFPu54ieTgZ9QJdC5";
                        if (collection.contains(abstractC03932y.A0B(i, 1))) {
                            this.A00.A0E(i);
                            i--;
                            iA04--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean retainAll(java.util.Collection<?> collection) {
                    int iA04 = this.A00.A04();
                    boolean changed = false;
                    int i = 0;
                    while (i < iA04) {
                        if (!collection.contains(this.A00.A0B(i, 1))) {
                            this.A00.A0E(i);
                            i--;
                            iA04--;
                            java.lang.String[] strArr = A01;
                            java.lang.String str = strArr[4];
                            java.lang.String str2 = strArr[6];
                            int length = str.length();
                            int N = str2.length();
                            if (length != N) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr2 = A01;
                            strArr2[7] = "W6fJV23d83VeGu0xKkUvg";
                            strArr2[2] = "sGDul30tjAcSIzuwi";
                            changed = true;
                        }
                        i++;
                    }
                    return changed;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final int size() {
                    return this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final java.lang.Object[] toArray() {
                    return this.A00.A0G(1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) this.A00.A0H(tArr, 1);
                }
            };
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final java.lang.Object[] A0G(int i) {
        int iA04 = A04();
        java.lang.Object[] objArr = new java.lang.Object[iA04];
        for (int i2 = 0; i2 < iA04; i2++) {
            objArr[i2] = A0B(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final <T> T[] A0H(T[] tArr, int i) {
        int iA04 = A04();
        if (tArr.length < iA04) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), iA04));
        }
        for (int i2 = 0; i2 < iA04; i2++) {
            tArr[i2] = A0B(i2, i);
        }
        if (tArr.length > iA04) {
            tArr[iA04] = null;
        }
        return tArr;
    }
}
