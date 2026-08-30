package com.google.thirdparty.publicsuffix;

/* JADX INFO: loaded from: classes5.dex */
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char innerNodeCode, char leafNodeCode) {
        this.innerNodeCode = innerNodeCode;
        this.leafNodeCode = leafNodeCode;
    }

    char getLeafNodeCode() {
        return this.leafNodeCode;
    }

    char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    static com.google.thirdparty.publicsuffix.PublicSuffixType fromCode(char code) {
        for (com.google.thirdparty.publicsuffix.PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == code || publicSuffixType.getLeafNodeCode() == code) {
                return publicSuffixType;
            }
        }
        throw new java.lang.IllegalArgumentException("No enum corresponding to given code: " + code);
    }
}
