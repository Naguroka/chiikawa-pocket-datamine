package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class InternetDomainName {
    private static final com.google.common.base.CharMatcher DASH_MATCHER;
    private static final com.google.common.base.CharMatcher DIGIT_MATCHER;
    private static final com.google.common.base.CharMatcher LETTER_MATCHER;
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_SUFFIX_FOUND = -1;
    private static final com.google.common.base.CharMatcher PART_CHAR_MATCHER;
    private static final int SUFFIX_NOT_INITIALIZED = -2;
    private final java.lang.String name;
    private final com.google.common.collect.ImmutableList<java.lang.String> parts;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private int publicSuffixIndexCache = -2;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private int registrySuffixIndexCache = -2;
    private static final com.google.common.base.CharMatcher DOTS_MATCHER = com.google.common.base.CharMatcher.anyOf(".。．｡");
    private static final com.google.common.base.Splitter DOT_SPLITTER = com.google.common.base.Splitter.on('.');
    private static final com.google.common.base.Joiner DOT_JOINER = com.google.common.base.Joiner.on('.');

    static {
        com.google.common.base.CharMatcher charMatcherAnyOf = com.google.common.base.CharMatcher.anyOf("-_");
        DASH_MATCHER = charMatcherAnyOf;
        com.google.common.base.CharMatcher charMatcherInRange = com.google.common.base.CharMatcher.inRange('0', '9');
        DIGIT_MATCHER = charMatcherInRange;
        com.google.common.base.CharMatcher charMatcherOr = com.google.common.base.CharMatcher.inRange('a', 'z').or(com.google.common.base.CharMatcher.inRange('A', 'Z'));
        LETTER_MATCHER = charMatcherOr;
        PART_CHAR_MATCHER = charMatcherInRange.or(charMatcherOr).or(charMatcherAnyOf);
    }

    InternetDomainName(java.lang.String name) {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(DOTS_MATCHER.replaceFrom((java.lang.CharSequence) name, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        com.google.common.base.Preconditions.checkArgument(lowerCase.length() <= MAX_LENGTH, "Domain name too long: '%s':", lowerCase);
        this.name = lowerCase;
        com.google.common.collect.ImmutableList<java.lang.String> immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf(DOT_SPLITTER.split(lowerCase));
        this.parts = immutableListCopyOf;
        com.google.common.base.Preconditions.checkArgument(immutableListCopyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        com.google.common.base.Preconditions.checkArgument(validateSyntax(immutableListCopyOf), "Not a valid domain name: '%s'", lowerCase);
    }

    private int publicSuffixIndex() {
        int i = this.publicSuffixIndexCache;
        if (i != -2) {
            return i;
        }
        int iFindSuffixOfType = findSuffixOfType(com.google.common.base.Optional.absent());
        this.publicSuffixIndexCache = iFindSuffixOfType;
        return iFindSuffixOfType;
    }

    private int registrySuffixIndex() {
        int i = this.registrySuffixIndexCache;
        if (i != -2) {
            return i;
        }
        int iFindSuffixOfType = findSuffixOfType(com.google.common.base.Optional.of(com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY));
        this.registrySuffixIndexCache = iFindSuffixOfType;
        return iFindSuffixOfType;
    }

    private int findSuffixOfType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> desiredType) {
        int size = this.parts.size();
        for (int i = 0; i < size; i++) {
            java.lang.String strJoin = DOT_JOINER.join(this.parts.subList(i, size));
            if (i > 0 && matchesType(desiredType, com.google.common.base.Optional.fromNullable(com.google.thirdparty.publicsuffix.PublicSuffixPatterns.UNDER.get(strJoin)))) {
                return i - 1;
            }
            if (matchesType(desiredType, com.google.common.base.Optional.fromNullable(com.google.thirdparty.publicsuffix.PublicSuffixPatterns.EXACT.get(strJoin)))) {
                return i;
            }
            if (com.google.thirdparty.publicsuffix.PublicSuffixPatterns.EXCLUDED.containsKey(strJoin)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static com.google.common.net.InternetDomainName from(java.lang.String domain) {
        return new com.google.common.net.InternetDomainName((java.lang.String) com.google.common.base.Preconditions.checkNotNull(domain));
    }

    private static boolean validateSyntax(java.util.List<java.lang.String> parts) {
        int size = parts.size() - 1;
        if (!validatePart(parts.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!validatePart(parts.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validatePart(java.lang.String part, boolean isFinalPart) {
        if (part.length() >= 1 && part.length() <= 63) {
            if (!PART_CHAR_MATCHER.matchesAllOf(com.google.common.base.CharMatcher.ascii().retainFrom(part))) {
                return false;
            }
            com.google.common.base.CharMatcher charMatcher = DASH_MATCHER;
            if (!charMatcher.matches(part.charAt(0)) && !charMatcher.matches(part.charAt(part.length() - 1))) {
                return (isFinalPart && DIGIT_MATCHER.matches(part.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    public com.google.common.collect.ImmutableList<java.lang.String> parts() {
        return this.parts;
    }

    public boolean isPublicSuffix() {
        return publicSuffixIndex() == 0;
    }

    public boolean hasPublicSuffix() {
        return publicSuffixIndex() != -1;
    }

    @javax.annotation.CheckForNull
    public com.google.common.net.InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return ancestor(publicSuffixIndex());
        }
        return null;
    }

    public boolean isUnderPublicSuffix() {
        return publicSuffixIndex() > 0;
    }

    public boolean isTopPrivateDomain() {
        return publicSuffixIndex() == 1;
    }

    public com.google.common.net.InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        com.google.common.base.Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.name);
        return ancestor(publicSuffixIndex() - 1);
    }

    public boolean isRegistrySuffix() {
        return registrySuffixIndex() == 0;
    }

    public boolean hasRegistrySuffix() {
        return registrySuffixIndex() != -1;
    }

    @javax.annotation.CheckForNull
    public com.google.common.net.InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return ancestor(registrySuffixIndex());
        }
        return null;
    }

    public boolean isUnderRegistrySuffix() {
        return registrySuffixIndex() > 0;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        return registrySuffixIndex() == 1;
    }

    public com.google.common.net.InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        com.google.common.base.Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.name);
        return ancestor(registrySuffixIndex() - 1);
    }

    public boolean hasParent() {
        return this.parts.size() > 1;
    }

    public com.google.common.net.InternetDomainName parent() {
        com.google.common.base.Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.name);
        return ancestor(1);
    }

    private com.google.common.net.InternetDomainName ancestor(int levels) {
        com.google.common.base.Joiner joiner = DOT_JOINER;
        com.google.common.collect.ImmutableList<java.lang.String> immutableList = this.parts;
        return from(joiner.join(immutableList.subList(levels, immutableList.size())));
    }

    public com.google.common.net.InternetDomainName child(java.lang.String leftParts) {
        return from(((java.lang.String) com.google.common.base.Preconditions.checkNotNull(leftParts)) + "." + this.name);
    }

    public static boolean isValid(java.lang.String name) {
        try {
            from(name);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean matchesType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> desiredType, com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> actualType) {
        return desiredType.isPresent() ? desiredType.equals(actualType) : actualType.isPresent();
    }

    public java.lang.String toString() {
        return this.name;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.net.InternetDomainName) {
            return this.name.equals(((com.google.common.net.InternetDomainName) object).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }
}
