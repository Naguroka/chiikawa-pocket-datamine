package org.objectweb.asm.signature;

/* JADX INFO: loaded from: classes6.dex */
public class SignatureReader {
    private final java.lang.String signatureValue;

    public SignatureReader(java.lang.String str) {
        this.signatureValue = str;
    }

    public void accept(org.objectweb.asm.signature.SignatureVisitor signatureVisitor) {
        char cCharAt;
        java.lang.String str = this.signatureValue;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                signatureVisitor.visitFormalTypeParameter(str.substring(i - 1, iIndexOf));
                int type = iIndexOf + 1;
                char cCharAt2 = str.charAt(type);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    type = parseType(str, type, signatureVisitor.visitClassBound());
                }
                while (true) {
                    i = type + 1;
                    cCharAt = str.charAt(type);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        type = parseType(str, i, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) == '(') {
            int type2 = i + 1;
            while (str.charAt(type2) != ')') {
                type2 = parseType(str, type2, signatureVisitor.visitParameterType());
            }
            int type3 = parseType(str, type2 + 1, signatureVisitor.visitReturnType());
            while (type3 < length) {
                type3 = parseType(str, type3 + 1, signatureVisitor.visitExceptionType());
            }
            return;
        }
        int type4 = parseType(str, i, signatureVisitor.visitSuperclass());
        while (type4 < length) {
            type4 = parseType(str, type4, signatureVisitor.visitInterface());
        }
    }

    public void acceptType(org.objectweb.asm.signature.SignatureVisitor signatureVisitor) {
        parseType(this.signatureValue, 0, signatureVisitor);
    }

    private static int parseType(java.lang.String str, int i, org.objectweb.asm.signature.SignatureVisitor signatureVisitor) {
        int i2;
        char cCharAt;
        int type = i + 1;
        char cCharAt2 = str.charAt(i);
        if (cCharAt2 != 'F') {
            if (cCharAt2 == 'L') {
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int i3 = type;
                    while (true) {
                        i2 = type + 1;
                        cCharAt = str.charAt(type);
                        if (cCharAt == '.' || cCharAt == ';') {
                            break;
                        }
                        if (cCharAt == '<') {
                            java.lang.String strSubstring = str.substring(i3, i2 - 1);
                            if (z2) {
                                signatureVisitor.visitInnerClassType(strSubstring);
                            } else {
                                signatureVisitor.visitClassType(strSubstring);
                            }
                            type = i2;
                            while (true) {
                                char cCharAt3 = str.charAt(type);
                                if (cCharAt3 == '>') {
                                    break;
                                }
                                if (cCharAt3 == '*') {
                                    type++;
                                    signatureVisitor.visitTypeArgument();
                                } else if (cCharAt3 == '+' || cCharAt3 == '-') {
                                    type = parseType(str, type + 1, signatureVisitor.visitTypeArgument(cCharAt3));
                                } else {
                                    type = parseType(str, type, signatureVisitor.visitTypeArgument('='));
                                }
                            }
                            z = true;
                        } else {
                            type = i2;
                        }
                    }
                    if (!z) {
                        java.lang.String strSubstring2 = str.substring(i3, i2 - 1);
                        if (z2) {
                            signatureVisitor.visitInnerClassType(strSubstring2);
                        } else {
                            signatureVisitor.visitClassType(strSubstring2);
                        }
                    }
                    if (cCharAt == ';') {
                        signatureVisitor.visitEnd();
                        return i2;
                    }
                    z = false;
                    z2 = true;
                    type = i2;
                }
            } else if (cCharAt2 != 'V' && cCharAt2 != 'I' && cCharAt2 != 'J' && cCharAt2 != 'S') {
                if (cCharAt2 == 'T') {
                    int iIndexOf = str.indexOf(59, type);
                    signatureVisitor.visitTypeVariable(str.substring(type, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt2 != 'Z') {
                    if (cCharAt2 == '[') {
                        return parseType(str, type, signatureVisitor.visitArrayType());
                    }
                    switch (cCharAt2) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException();
                    }
                }
            }
        }
        signatureVisitor.visitBaseType(cCharAt2);
        return type;
    }
}
