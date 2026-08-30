package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', kotlin.text.Typography.quote};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', kotlin.text.Typography.quote};
    private static final char[] zaf = {'\n'};
    private static final com.google.android.gms.common.server.response.zai zag = new com.google.android.gms.common.server.response.zaa();
    private static final com.google.android.gms.common.server.response.zai zah = new com.google.android.gms.common.server.response.zab();
    private static final com.google.android.gms.common.server.response.zai zai = new com.google.android.gms.common.server.response.zac();
    private static final com.google.android.gms.common.server.response.zai zaj = new com.google.android.gms.common.server.response.zad();
    private static final com.google.android.gms.common.server.response.zai zak = new com.google.android.gms.common.server.response.zae();
    private static final com.google.android.gms.common.server.response.zai zal = new com.google.android.gms.common.server.response.zaf();
    private static final com.google.android.gms.common.server.response.zai zam = new com.google.android.gms.common.server.response.zag();
    private static final com.google.android.gms.common.server.response.zai zan = new com.google.android.gms.common.server.response.zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final java.lang.StringBuilder zar = new java.lang.StringBuilder(32);
    private final java.lang.StringBuilder zas = new java.lang.StringBuilder(1024);
    private final java.util.Stack zat = new java.util.Stack();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String str) {
            super(str);
        }

        public ParseException(java.lang.String str, java.lang.Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(java.lang.Throwable th) {
            super(th);
        }
    }

    private static final java.lang.String zaA(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
            int i2 = 0;
            while (i2 < i) {
                char c = cArr[i2];
                if (java.lang.Character.isISOControl(c) && (cArr2 == null || cArr2[0] != c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
                int i3 = i2 + 1;
                if (c != '\"') {
                    if (c == '\\') {
                        z = !z;
                        z2 = true;
                    }
                    i2 = i3;
                } else if (!z) {
                    sb.append(cArr, 0, i2);
                    bufferedReader.reset();
                    bufferedReader.skip(i3);
                    return z2 ? com.google.android.gms.common.util.JsonUtils.unescapeString(sb.toString()) : sb.toString();
                }
                z = false;
                i2 = i3;
            }
            sb.append(cArr, 0, i);
            bufferedReader.mark(cArr.length);
        }
    }

    private final char zai(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (java.lang.Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return java.lang.Double.parseDouble(new java.lang.String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(new java.lang.String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        int i2;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
        }
        char c = cArr[0];
        int i3 = c == '-' ? Integer.MIN_VALUE : androidx.media3.common.C.RATE_UNSET_INT;
        int i4 = c == '-' ? 1 : 0;
        if (i4 < iZam) {
            i2 = i4 + 1;
            int iDigit = java.lang.Character.digit(cArr[i4], 10);
            if (iDigit < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            i = -iDigit;
        } else {
            i = 0;
            i2 = i4;
        }
        while (i2 < iZam) {
            int i5 = i2 + 1;
            int iDigit2 = java.lang.Character.digit(cArr[i2], 10);
            if (iDigit2 < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            if (i < -214748364) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            int i6 = i * 10;
            if (i6 < i3 + iDigit2) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            i = i6 - iDigit2;
            i2 = i5;
        }
        if (i4 == 0) {
            return -i;
        }
        if (i2 > 1) {
            return i;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
    }

    private final int zam(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i = 0;
            boolean z = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (java.lang.Character.isISOControl(c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
                int i2 = i + 1;
                if (c != '\"') {
                    if (c == '\\') {
                        z = !z;
                    }
                    i = i2;
                } else if (!z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i2);
                    return i;
                }
                z = false;
                i = i2;
            }
        } else {
            cArr[0] = cZai;
            i = 1;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c2 = cArr[i];
                if (c2 == '}' || c2 == ',' || java.lang.Character.isWhitespace(c2) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == 1024) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Absurdly long value");
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        long j;
        int i;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
        }
        char c = cArr[0];
        long j2 = c == '-' ? Long.MIN_VALUE : androidx.media3.common.C.TIME_UNSET;
        int i2 = c == '-' ? 1 : 0;
        if (i2 < iZam) {
            i = i2 + 1;
            int iDigit = java.lang.Character.digit(cArr[i2], 10);
            if (iDigit < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            j = -iDigit;
        } else {
            j = 0;
            i = i2;
        }
        while (i < iZam) {
            int i3 = i + 1;
            int iDigit2 = java.lang.Character.digit(cArr[i], 10);
            if (iDigit2 < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            if (j < okio.internal.Buffer.OVERFLOW_ZONE) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            long j3 = j * 10;
            int i4 = iZam;
            long j4 = iDigit2;
            if (j3 < j2 + j4) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            j = j3 - j4;
            iZam = i4;
            i = i3;
        }
        if (i2 == 0) {
            return -j;
        }
        if (i > 1) {
            return j;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zao(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final java.lang.String zap(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (cZai != 'n') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    private final java.lang.String zaq(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            java.lang.String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token: " + cZai);
    }

    private final java.lang.String zar(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i = 1;
        if (cZai != '\"') {
            if (cZai == ',') {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
            }
            if (cZai == '[') {
                this.zat.push(5);
                bufferedReader.mark(32);
                if (zai(bufferedReader) == ']') {
                    zaw(5);
                } else {
                    bufferedReader.reset();
                    boolean z = false;
                    boolean z2 = false;
                    while (i > 0) {
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 0) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing array");
                        }
                        if (java.lang.Character.isISOControl(cZai2)) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading array");
                        }
                        if (cZai2 == '\"') {
                            if (!z2) {
                                z = !z;
                            }
                            cZai2 = '\"';
                        }
                        if (cZai2 == '[') {
                            if (!z) {
                                i++;
                            }
                            cZai2 = '[';
                        }
                        if (cZai2 == ']' && !z) {
                            i--;
                        }
                        z2 = (cZai2 == '\\' && z) ? !z2 : false;
                    }
                    zaw(5);
                }
            } else if (cZai != '{') {
                bufferedReader.reset();
                zam(bufferedReader, this.zaq);
            } else {
                this.zat.push(1);
                bufferedReader.mark(32);
                char cZai3 = zai(bufferedReader);
                if (cZai3 == '}') {
                    zaw(1);
                } else {
                    if (cZai3 != '\"') {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token " + cZai3);
                    }
                    bufferedReader.reset();
                    zaq(bufferedReader);
                    while (zar(bufferedReader) != null) {
                    }
                    zaw(1);
                }
            }
        } else {
            if (bufferedReader.read(this.zao) == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
            char c = this.zao[0];
            boolean z3 = false;
            while (true) {
                if (c == '\"') {
                    if (!z3) {
                        break;
                    }
                    c = '\"';
                    z3 = true;
                }
                z3 = c == '\\' ? !z3 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
                }
                c = this.zao[0];
                if (java.lang.Character.isISOControl(c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token " + cZai4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigDecimal zas(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new java.math.BigDecimal(new java.lang.String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigInteger zat(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new java.math.BigInteger(new java.lang.String(this.zaq, 0, iZam));
    }

    private final java.util.ArrayList zau(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.zai zaiVar) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of array");
        }
        this.zat.push(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final java.util.ArrayList zav(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse.Field field) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token: " + cZai);
        }
        this.zat.push(1);
        while (true) {
            try {
                com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token: " + cZai2);
                }
                if (zai(bufferedReader) != '{') {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (java.lang.IllegalAccessException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
            } catch (java.lang.InstantiationException e2) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
            }
        }
    }

    private final void zaw(int i) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        if (this.zat.isEmpty()) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected state " + i + " but had empty stack");
        }
        int iIntValue = ((java.lang.Integer) this.zat.pop()).intValue();
        if (iIntValue == i) {
            return;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected state " + i + " but had " + iIntValue);
    }

    private final void zax(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            int i2 = bufferedReader.read(this.zap, 0, length - i);
            if (i2 == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                if (cArr[i3 + i] != this.zap[i3]) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected character");
                }
            }
            i += i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(java.io.BufferedReader bufferedReader, boolean z) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z ? zac : zab);
            return true;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token: " + cZai);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x024f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x024d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zaz(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        java.util.HashMap map;
        char cZai;
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        java.lang.String strZaq = zaq(bufferedReader);
        if (strZaq == null) {
            zaw(1);
            return false;
        }
        while (strZaq != null) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaq);
            if (field == null) {
                strZaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i2 = field.zaa;
                switch (i2) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        } else {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        } else {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        } else {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        } else {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        } else {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        } else {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 6:
                        if (field.zab) {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        } else {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        } else {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, com.google.android.gms.common.util.Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 9:
                        fastJsonResponse.zal(field, com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 10:
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 'n') {
                            zax(bufferedReader, zaa);
                            map = null;
                        } else {
                            if (cZai2 != '{') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            map = new java.util.HashMap();
                            while (true) {
                                char cZai3 = zai(bufferedReader);
                                if (cZai3 == 0) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
                                }
                                if (cZai3 == '\"') {
                                    java.lang.String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No map value found for key ".concat(java.lang.String.valueOf(strZaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected String value for key ".concat(java.lang.String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char cZai4 = zai(bufferedReader);
                                    if (cZai4 != ',') {
                                        if (cZai4 != '}') {
                                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected character while parsing string map: " + cZai4);
                                        }
                                        zaw(1);
                                    }
                                } else if (cZai3 == '}') {
                                    zaw(1);
                                }
                                i = 4;
                                zaw(i);
                                zaw(2);
                                cZai = zai(bufferedReader);
                                if (cZai == ',') {
                                    strZaq = zaq(bufferedReader);
                                } else {
                                    if (cZai != '}') {
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                                    }
                                    strZaq = null;
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 11:
                        if (!field.zab) {
                            char cZai5 = zai(bufferedReader);
                            if (cZai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.zat.push(1);
                                if (cZai5 != '{') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of object");
                                }
                                try {
                                    com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponseZad = field.zad();
                                    zaz(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZad);
                                } catch (java.lang.IllegalAccessException e) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
                                } catch (java.lang.InstantiationException e2) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
                                }
                            }
                            break;
                        } else {
                            char cZai6 = zai(bufferedReader);
                            if (cZai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.zat.push(5);
                                if (cZai6 != '[') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    default:
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Invalid field type " + i2);
                }
            }
        }
        zaw(1);
        return true;
    }

    public void parse(java.io.InputStream inputStream, T t) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Object array response class must have a single Field");
                    }
                    com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused) {
                    android.util.Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException(e);
            }
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused2) {
                android.util.Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
