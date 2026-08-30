package com.google.thirdparty.publicsuffix;

/* JADX INFO: loaded from: classes5.dex */
final class TrieParser {
    private static final com.google.common.base.Joiner DIRECT_JOINER = com.google.common.base.Joiner.on("");

    TrieParser() {
    }

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseTrie(java.lang.CharSequence... encodedChunks) {
        return parseFullString(DIRECT_JOINER.join(encodedChunks));
    }

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseFullString(java.lang.String encoded) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int length = encoded.length();
        int iDoParseTrieToBuilder = 0;
        while (iDoParseTrieToBuilder < length) {
            iDoParseTrieToBuilder += doParseTrieToBuilder(com.google.common.collect.Queues.newArrayDeque(), encoded, iDoParseTrieToBuilder, builder);
        }
        return builder.buildOrThrow();
    }

    private static int doParseTrieToBuilder(java.util.Deque<java.lang.CharSequence> stack, java.lang.CharSequence encoded, int start, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> builder) {
        int length = encoded.length();
        char cCharAt = 0;
        int i = start;
        while (i < length && (cCharAt = encoded.charAt(i)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i++;
        }
        stack.push(reverse(encoded.subSequence(start, i)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            java.lang.String strJoin = DIRECT_JOINER.join(stack);
            if (strJoin.length() > 0) {
                builder.put(strJoin, com.google.thirdparty.publicsuffix.PublicSuffixType.fromCode(cCharAt));
            }
        }
        int iDoParseTrieToBuilder = i + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iDoParseTrieToBuilder < length) {
                iDoParseTrieToBuilder += doParseTrieToBuilder(stack, encoded, iDoParseTrieToBuilder, builder);
                if (encoded.charAt(iDoParseTrieToBuilder) == '?' || encoded.charAt(iDoParseTrieToBuilder) == ',') {
                    iDoParseTrieToBuilder++;
                    break;
                }
            }
        }
        stack.pop();
        return iDoParseTrieToBuilder - start;
    }

    private static java.lang.CharSequence reverse(java.lang.CharSequence s) {
        return new java.lang.StringBuilder(s).reverse();
    }
}
