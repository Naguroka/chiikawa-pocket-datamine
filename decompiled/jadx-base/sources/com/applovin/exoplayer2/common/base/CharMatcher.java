package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CharMatcher implements com.applovin.exoplayer2.common.base.Predicate<java.lang.Character> {

    private static final class a extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.CharMatcher f510a;
        final com.applovin.exoplayer2.common.base.CharMatcher b;

        a(com.applovin.exoplayer2.common.base.CharMatcher charMatcher, com.applovin.exoplayer2.common.base.CharMatcher charMatcher2) {
            this.f510a = (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
            this.b = (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f510a.matches(c) && this.b.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            java.util.BitSet bitSet2 = new java.util.BitSet();
            this.f510a.setBits(bitSet2);
            java.util.BitSet bitSet3 = new java.util.BitSet();
            this.b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.and(" + this.f510a + ", " + this.b + ")";
        }
    }

    static final class a0 extends com.applovin.exoplayer2.common.base.CharMatcher.t {
        static final int b = java.lang.Integer.numberOfLeadingZeros(31);
        static final com.applovin.exoplayer2.common.base.CharMatcher.a0 c = new com.applovin.exoplayer2.common.base.CharMatcher.a0();

        a0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c2) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> b) == c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
            }
        }
    }

    private static final class b extends com.applovin.exoplayer2.common.base.CharMatcher.t {
        static final com.applovin.exoplayer2.common.base.CharMatcher.b b = new com.applovin.exoplayer2.common.base.CharMatcher.b();

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher and(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            return (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String collapseFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : java.lang.String.valueOf(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(java.lang.CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(java.lang.CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher negate() {
            return com.applovin.exoplayer2.common.base.CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher or(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String removeFrom(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            java.util.Arrays.fill(cArr, c);
            return new java.lang.String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String trimFrom(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence charSequence, int i) {
            int length = charSequence.length();
            com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }
    }

    private static final class c extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char[] f511a;

        public c(java.lang.CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f511a = charArray;
            java.util.Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return java.util.Arrays.binarySearch(this.f511a, c) >= 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            for (char c : this.f511a) {
                bitSet.set(c);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f511a) {
                sb.append(com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class d extends com.applovin.exoplayer2.common.base.CharMatcher.t {
        static final com.applovin.exoplayer2.common.base.CharMatcher.d b = new com.applovin.exoplayer2.common.base.CharMatcher.d();

        d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 127;
        }
    }

    private static final class e extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.CharMatcher f512a = new com.applovin.exoplayer2.common.base.CharMatcher.e();

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    static abstract class g extends com.applovin.exoplayer2.common.base.CharMatcher {
        g() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher negate() {
            return new com.applovin.exoplayer2.common.base.CharMatcher.v(this);
        }
    }

    private static final class h extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.common.base.Predicate f513a;

        h(com.applovin.exoplayer2.common.base.Predicate predicate) {
            this.f513a = (com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f513a.apply(java.lang.Character.valueOf(c));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.forPredicate(" + this.f513a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Character ch) {
            return this.f513a.apply(com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(ch));
        }
    }

    private static final class i extends com.applovin.exoplayer2.common.base.CharMatcher.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f514a;
        private final char b;

        i(char c, char c2) {
            com.applovin.exoplayer2.common.base.Preconditions.checkArgument(c2 >= c);
            this.f514a = c;
            this.b = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f514a <= c && c <= this.b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            bitSet.set(this.f514a, this.b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.inRange('" + com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(this.f514a) + "', '" + com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(this.b) + "')";
        }
    }

    private static final class j extends com.applovin.exoplayer2.common.base.CharMatcher.y {
        static final com.applovin.exoplayer2.common.base.CharMatcher.j d = new com.applovin.exoplayer2.common.base.CharMatcher.j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    private static final class k extends com.applovin.exoplayer2.common.base.CharMatcher.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f515a;

        k(char c) {
            this.f515a = c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher and(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.f515a) ? this : com.applovin.exoplayer2.common.base.CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.f515a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher negate() {
            return com.applovin.exoplayer2.common.base.CharMatcher.isNot(this.f515a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher or(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.f515a) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f515a, c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            bitSet.set(this.f515a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.is('" + com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(this.f515a) + "')";
        }
    }

    private static final class l extends com.applovin.exoplayer2.common.base.CharMatcher.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f516a;
        private final char b;

        l(char c, char c2) {
            this.f516a = c;
            this.b = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.f516a || c == this.b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            bitSet.set(this.f516a);
            bitSet.set(this.b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.anyOf(\"" + com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(this.f516a) + com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(this.b) + "\")";
        }
    }

    private static final class m extends com.applovin.exoplayer2.common.base.CharMatcher.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f517a;

        m(char c) {
            this.f517a = c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher and(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.f517a) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c != this.f517a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher negate() {
            return com.applovin.exoplayer2.common.base.CharMatcher.is(this.f517a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher or(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.f517a) ? com.applovin.exoplayer2.common.base.CharMatcher.any() : this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            bitSet.set(0, this.f517a);
            bitSet.set(this.f517a + 1, 65536);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.isNot('" + com.applovin.exoplayer2.common.base.CharMatcher.showCharacter(this.f517a) + "')";
        }
    }

    private static final class n extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.CharMatcher.n f518a = new com.applovin.exoplayer2.common.base.CharMatcher.n();

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isDigit(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class o extends com.applovin.exoplayer2.common.base.CharMatcher.t {
        static final com.applovin.exoplayer2.common.base.CharMatcher.o b = new com.applovin.exoplayer2.common.base.CharMatcher.o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }
    }

    private static final class p extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.CharMatcher.p f519a = new com.applovin.exoplayer2.common.base.CharMatcher.p();

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isLetter(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class q extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.CharMatcher.q f520a = new com.applovin.exoplayer2.common.base.CharMatcher.q();

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isLetterOrDigit(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class r extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.CharMatcher.r f521a = new com.applovin.exoplayer2.common.base.CharMatcher.r();

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isLowerCase(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class s extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.CharMatcher.s f522a = new com.applovin.exoplayer2.common.base.CharMatcher.s();

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isUpperCase(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class t extends com.applovin.exoplayer2.common.base.CharMatcher.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f523a;

        t(java.lang.String str) {
            this.f523a = (java.lang.String) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final java.lang.String toString() {
            return this.f523a;
        }
    }

    private static class u extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.CharMatcher f524a;

        u(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            this.f524a = (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(java.lang.CharSequence charSequence) {
            return charSequence.length() - this.f524a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.f524a.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence charSequence) {
            return this.f524a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence charSequence) {
            return this.f524a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher negate() {
            return this.f524a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            java.util.BitSet bitSet2 = new java.util.BitSet();
            this.f524a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return this.f524a + ".negate()";
        }
    }

    static class v extends com.applovin.exoplayer2.common.base.CharMatcher.u {
        v(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    private static final class w extends com.applovin.exoplayer2.common.base.CharMatcher.t {
        static final com.applovin.exoplayer2.common.base.CharMatcher.w b = new com.applovin.exoplayer2.common.base.CharMatcher.w();

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher and(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String collapseFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence charSequence) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher negate() {
            return com.applovin.exoplayer2.common.base.CharMatcher.any();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public com.applovin.exoplayer2.common.base.CharMatcher or(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
            return (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String removeFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String trimFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String trimLeadingFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String trimTrailingFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence charSequence, int i) {
            com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    private static final class x extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.CharMatcher f525a;
        final com.applovin.exoplayer2.common.base.CharMatcher b;

        x(com.applovin.exoplayer2.common.base.CharMatcher charMatcher, com.applovin.exoplayer2.common.base.CharMatcher charMatcher2) {
            this.f525a = (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher);
            this.b = (com.applovin.exoplayer2.common.base.CharMatcher) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f525a.matches(c) || this.b.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            this.f525a.setBits(bitSet);
            this.b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.or(" + this.f525a + ", " + this.b + ")";
        }
    }

    private static class y extends com.applovin.exoplayer2.common.base.CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f526a;
        private final char[] b;
        private final char[] c;

        y(java.lang.String str, char[] cArr, char[] cArr2) {
            this.f526a = str;
            this.b = cArr;
            this.c = cArr2;
            com.applovin.exoplayer2.common.base.Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                com.applovin.exoplayer2.common.base.Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    com.applovin.exoplayer2.common.base.Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.b, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (~iBinarySearch) - 1;
            return i >= 0 && c <= this.c[i];
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public java.lang.String toString() {
            return this.f526a;
        }
    }

    private static final class z extends com.applovin.exoplayer2.common.base.CharMatcher.y {
        static final com.applovin.exoplayer2.common.base.CharMatcher.z d = new com.applovin.exoplayer2.common.base.CharMatcher.z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    protected CharMatcher() {
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher any() {
        return com.applovin.exoplayer2.common.base.CharMatcher.b.b;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher anyOf(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length != 1) {
            return length != 2 ? new com.applovin.exoplayer2.common.base.CharMatcher.c(charSequence) : isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return is(charSequence.charAt(0));
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher ascii() {
        return com.applovin.exoplayer2.common.base.CharMatcher.d.b;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher breakingWhitespace() {
        return com.applovin.exoplayer2.common.base.CharMatcher.e.f512a;
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher digit() {
        return com.applovin.exoplayer2.common.base.CharMatcher.f.d;
    }

    private java.lang.String finishCollapseFrom(java.lang.CharSequence charSequence, int i2, int i3, char c2, java.lang.StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!matches(cCharAt)) {
                sb.append(cCharAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher forPredicate(com.applovin.exoplayer2.common.base.Predicate<? super java.lang.Character> predicate) {
        return predicate instanceof com.applovin.exoplayer2.common.base.CharMatcher ? (com.applovin.exoplayer2.common.base.CharMatcher) predicate : new com.applovin.exoplayer2.common.base.CharMatcher.h(predicate);
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher inRange(char c2, char c3) {
        return new com.applovin.exoplayer2.common.base.CharMatcher.i(c2, c3);
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher invisible() {
        return com.applovin.exoplayer2.common.base.CharMatcher.j.d;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher is(char c2) {
        return new com.applovin.exoplayer2.common.base.CharMatcher.k(c2);
    }

    private static com.applovin.exoplayer2.common.base.CharMatcher.l isEither(char c2, char c3) {
        return new com.applovin.exoplayer2.common.base.CharMatcher.l(c2, c3);
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher isNot(char c2) {
        return new com.applovin.exoplayer2.common.base.CharMatcher.m(c2);
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher javaDigit() {
        return com.applovin.exoplayer2.common.base.CharMatcher.n.f518a;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher javaIsoControl() {
        return com.applovin.exoplayer2.common.base.CharMatcher.o.b;
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher javaLetter() {
        return com.applovin.exoplayer2.common.base.CharMatcher.p.f519a;
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher javaLetterOrDigit() {
        return com.applovin.exoplayer2.common.base.CharMatcher.q.f520a;
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher javaLowerCase() {
        return com.applovin.exoplayer2.common.base.CharMatcher.r.f521a;
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher javaUpperCase() {
        return com.applovin.exoplayer2.common.base.CharMatcher.s.f522a;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher none() {
        return com.applovin.exoplayer2.common.base.CharMatcher.w.b;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher noneOf(java.lang.CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @java.lang.Deprecated
    public static com.applovin.exoplayer2.common.base.CharMatcher singleWidth() {
        return com.applovin.exoplayer2.common.base.CharMatcher.z.d;
    }

    public static com.applovin.exoplayer2.common.base.CharMatcher whitespace() {
        return com.applovin.exoplayer2.common.base.CharMatcher.a0.c;
    }

    public com.applovin.exoplayer2.common.base.CharMatcher and(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
        return new com.applovin.exoplayer2.common.base.CharMatcher.a(this, charMatcher);
    }

    public java.lang.String collapseFrom(java.lang.CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (matches(cCharAt)) {
                if (cCharAt != c2 || (i2 != length - 1 && matches(charSequence.charAt(i2 + 1)))) {
                    return finishCollapseFrom(charSequence, i2 + 1, length, c2, new java.lang.StringBuilder(length).append(charSequence, 0, i2).append(c2), true);
                }
                i2++;
            }
            i2++;
        }
        return charSequence.toString();
    }

    public int countIn(java.lang.CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (matches(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public int indexIn(java.lang.CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(java.lang.CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c2);

    public boolean matchesAllOf(java.lang.CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(java.lang.CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(java.lang.CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public com.applovin.exoplayer2.common.base.CharMatcher negate() {
        return new com.applovin.exoplayer2.common.base.CharMatcher.u(this);
    }

    public com.applovin.exoplayer2.common.base.CharMatcher or(com.applovin.exoplayer2.common.base.CharMatcher charMatcher) {
        return new com.applovin.exoplayer2.common.base.CharMatcher.x(this, charMatcher);
    }

    public java.lang.String removeFrom(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i2 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i2++;
                } else {
                    charArray[iIndexIn - i2] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new java.lang.String(charArray, 0, iIndexIn - i2);
        }
    }

    public java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c2) {
        java.lang.String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c2;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new java.lang.String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c2;
            }
        }
    }

    public java.lang.String retainFrom(java.lang.CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    void setBits(java.util.BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (matches((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString();
    }

    public java.lang.String trimAndCollapseFrom(java.lang.CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && matches(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && matches(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return collapseFrom(charSequence, c2);
        }
        int i5 = i4 + 1;
        return finishCollapseFrom(charSequence, i3, i5, c2, new java.lang.StringBuilder(i5 - i3), false);
    }

    public java.lang.String trimFrom(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public java.lang.String trimLeadingFrom(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!matches(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public java.lang.String trimTrailingFrom(java.lang.CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    private static final class f extends com.applovin.exoplayer2.common.base.CharMatcher.y {
        static final com.applovin.exoplayer2.common.base.CharMatcher.f d = new com.applovin.exoplayer2.common.base.CharMatcher.f();

        private f() {
            super("CharMatcher.digit()", b(), a());
        }

        private static char[] b() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private static char[] a() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String showCharacter(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return java.lang.String.copyValueOf(cArr);
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(java.lang.Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(java.lang.CharSequence charSequence, int i2) {
        int length = charSequence.length();
        com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndex(i2, length);
        while (i2 < length) {
            if (matches(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public java.lang.String replaceFrom(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        java.lang.String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((java.lang.CharSequence) string, i2, iIndexIn);
            sb.append(charSequence2);
            i2 = iIndexIn + 1;
            iIndexIn = indexIn(string, i2);
        } while (iIndexIn != -1);
        sb.append((java.lang.CharSequence) string, i2, length2);
        return sb.toString();
    }
}
