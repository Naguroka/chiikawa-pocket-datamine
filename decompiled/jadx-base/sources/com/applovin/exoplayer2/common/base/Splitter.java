package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final com.applovin.exoplayer2.common.base.Splitter.e strategy;
    private final com.applovin.exoplayer2.common.base.CharMatcher trimmer;

    class a implements com.applovin.exoplayer2.common.base.Splitter.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.exoplayer2.common.base.CharMatcher f547a;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a, reason: collision with other inner class name */
        class C0024a extends com.applovin.exoplayer2.common.base.Splitter.d {
            C0024a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            int a(int i) {
                return i + 1;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            int b(int i) {
                return com.applovin.exoplayer2.common.base.Splitter.a.this.f547a.indexIn(this.c, i);
            }
        }

        a(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            this.f547a = charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.exoplayer2.common.base.Splitter.d a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
            return new com.applovin.exoplayer2.common.base.Splitter.a.C0024a(splitter, charSequence);
        }
    }

    class b implements com.applovin.exoplayer2.common.base.Splitter.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f548a;

        class a extends com.applovin.exoplayer2.common.base.Splitter.d {
            a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i) {
                return i + com.applovin.exoplayer2.common.base.Splitter.b.this.f548a.length();
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i) {
                int length = com.applovin.exoplayer2.common.base.Splitter.b.this.f548a.length();
                int length2 = this.c.length() - length;
                while (i <= length2) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.c.charAt(i2 + i) != com.applovin.exoplayer2.common.base.Splitter.b.this.f548a.charAt(i2)) {
                            i++;
                        }
                    }
                    return i;
                }
                return -1;
            }
        }

        b(java.lang.String str) {
            this.f548a = str;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.exoplayer2.common.base.Splitter.d a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
            return new com.applovin.exoplayer2.common.base.Splitter.b.a(splitter, charSequence);
        }
    }

    class c implements com.applovin.exoplayer2.common.base.Splitter.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f549a;

        class a extends com.applovin.exoplayer2.common.base.Splitter.d {
            a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i) {
                return i;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i) {
                int i2 = i + com.applovin.exoplayer2.common.base.Splitter.c.this.f549a;
                if (i2 < this.c.length()) {
                    return i2;
                }
                return -1;
            }
        }

        c(int i) {
            this.f549a = i;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.exoplayer2.common.base.Splitter.d a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
            return new com.applovin.exoplayer2.common.base.Splitter.c.a(splitter, charSequence);
        }
    }

    private static abstract class d extends com.applovin.exoplayer2.common.base.b {
        final java.lang.CharSequence c;
        final com.applovin.exoplayer2.common.base.CharMatcher d;
        final boolean f;
        int g = 0;
        int h;

        protected d(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
            this.d = splitter.trimmer;
            this.f = splitter.omitEmptyStrings;
            this.h = splitter.limit;
            this.c = charSequence;
        }

        abstract int a(int i);

        abstract int b(int i);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.applovin.exoplayer2.common.base.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.String a() {
            int i = this.g;
            while (true) {
                int i2 = this.g;
                if (i2 == -1) {
                    return (java.lang.String) b();
                }
                int iB = b(i2);
                if (iB == -1) {
                    iB = this.c.length();
                    this.g = -1;
                } else {
                    this.g = a(iB);
                }
                int i3 = this.g;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.g = i4;
                    if (i4 > this.c.length()) {
                        this.g = -1;
                    }
                } else {
                    while (i < iB && this.d.matches(this.c.charAt(i))) {
                        i++;
                    }
                    while (iB > i && this.d.matches(this.c.charAt(iB - 1))) {
                        iB--;
                    }
                    if (!this.f || i != iB) {
                        int i5 = this.h;
                        if (i5 == 1) {
                            iB = this.c.length();
                            this.g = -1;
                            while (iB > i && this.d.matches(this.c.charAt(iB - 1))) {
                                iB--;
                            }
                        } else {
                            this.h = i5 - 1;
                        }
                        return this.c.subSequence(i, iB).toString();
                    }
                    i = this.g;
                }
            }
        }
    }

    private interface e {
        java.util.Iterator a(com.applovin.exoplayer2.common.base.Splitter splitter, java.lang.CharSequence charSequence);
    }

    private Splitter(com.applovin.exoplayer2.common.base.Splitter.e eVar) {
        this(eVar, false, com.applovin.exoplayer2.common.base.CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static com.applovin.exoplayer2.common.base.Splitter fixedLength(int i) {
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new com.applovin.exoplayer2.common.base.Splitter(new com.applovin.exoplayer2.common.base.Splitter.c(i));
    }

    public static com.applovin.exoplayer2.common.base.Splitter on(char c2) {
        return on(com.applovin.exoplayer2.common.base.CharMatcher.is(c2));
    }

    private java.util.Iterator<java.lang.String> splittingIterator(java.lang.CharSequence charSequence) {
        return this.strategy.a(this, charSequence);
    }

    public com.applovin.exoplayer2.common.base.Splitter limit(int i) {
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new com.applovin.exoplayer2.common.base.Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public com.applovin.exoplayer2.common.base.Splitter omitEmptyStrings() {
        return new com.applovin.exoplayer2.common.base.Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public java.util.List<java.lang.String> splitToList(java.lang.CharSequence charSequence) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
        java.util.Iterator<java.lang.String> itSplittingIterator = splittingIterator(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public com.applovin.exoplayer2.common.base.Splitter trimResults() {
        return trimResults(com.applovin.exoplayer2.common.base.CharMatcher.whitespace());
    }

    private Splitter(com.applovin.exoplayer2.common.base.Splitter.e eVar, boolean z, com.applovin.exoplayer2.common.base.CharMatcher charMatcher, int i) {
        this.strategy = eVar;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static com.applovin.exoplayer2.common.base.Splitter on(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
        return new com.applovin.exoplayer2.common.base.Splitter(new com.applovin.exoplayer2.common.base.Splitter.a(charMatcher));
    }

    public com.applovin.exoplayer2.common.base.Splitter trimResults(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
        return new com.applovin.exoplayer2.common.base.Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public static com.applovin.exoplayer2.common.base.Splitter on(java.lang.String str) {
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new com.applovin.exoplayer2.common.base.Splitter(new com.applovin.exoplayer2.common.base.Splitter.b(str));
    }
}
