package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public abstract class BaseEncoding {
    private static final com.google.common.io.BaseEncoding BASE64 = new com.google.common.io.BaseEncoding.Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final com.google.common.io.BaseEncoding BASE64_URL = new com.google.common.io.BaseEncoding.Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final com.google.common.io.BaseEncoding BASE32 = new com.google.common.io.BaseEncoding.StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final com.google.common.io.BaseEncoding BASE32_HEX = new com.google.common.io.BaseEncoding.StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final com.google.common.io.BaseEncoding BASE16 = new com.google.common.io.BaseEncoding.Base16Encoding("base16()", "0123456789ABCDEF");

    public abstract boolean canDecode(java.lang.CharSequence chars);

    abstract int decodeTo(byte[] target, java.lang.CharSequence chars) throws com.google.common.io.BaseEncoding.DecodingException;

    public abstract java.io.InputStream decodingStream(java.io.Reader reader);

    abstract void encodeTo(java.lang.Appendable target, byte[] bytes, int off, int len) throws java.io.IOException;

    public abstract java.io.OutputStream encodingStream(java.io.Writer writer);

    public abstract com.google.common.io.BaseEncoding ignoreCase();

    public abstract com.google.common.io.BaseEncoding lowerCase();

    abstract int maxDecodedSize(int chars);

    abstract int maxEncodedSize(int bytes);

    public abstract com.google.common.io.BaseEncoding omitPadding();

    public abstract com.google.common.io.BaseEncoding upperCase();

    public abstract com.google.common.io.BaseEncoding withPadChar(char padChar);

    public abstract com.google.common.io.BaseEncoding withSeparator(java.lang.String separator, int n);

    BaseEncoding() {
    }

    public static final class DecodingException extends java.io.IOException {
        DecodingException(java.lang.String message) {
            super(message);
        }

        DecodingException(java.lang.Throwable cause) {
            super(cause);
        }
    }

    public java.lang.String encode(byte[] bytes) {
        return encode(bytes, 0, bytes.length);
    }

    public final java.lang.String encode(byte[] bytes, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(maxEncodedSize(len));
        try {
            encodeTo(sb, bytes, off, len);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final com.google.common.io.ByteSink encodingSink(final com.google.common.io.CharSink encodedSink) {
        com.google.common.base.Preconditions.checkNotNull(encodedSink);
        return new com.google.common.io.ByteSink() { // from class: com.google.common.io.BaseEncoding.1
            @Override // com.google.common.io.ByteSink
            public java.io.OutputStream openStream() throws java.io.IOException {
                return com.google.common.io.BaseEncoding.this.encodingStream(encodedSink.openStream());
            }
        };
    }

    private static byte[] extract(byte[] result, int length) {
        if (length == result.length) {
            return result;
        }
        byte[] bArr = new byte[length];
        java.lang.System.arraycopy(result, 0, bArr, 0, length);
        return bArr;
    }

    public final byte[] decode(java.lang.CharSequence chars) {
        try {
            return decodeChecked(chars);
        } catch (com.google.common.io.BaseEncoding.DecodingException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    final byte[] decodeChecked(java.lang.CharSequence chars) throws com.google.common.io.BaseEncoding.DecodingException {
        java.lang.CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
        byte[] bArr = new byte[maxDecodedSize(charSequenceTrimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, charSequenceTrimTrailingPadding));
    }

    public final com.google.common.io.ByteSource decodingSource(final com.google.common.io.CharSource encodedSource) {
        com.google.common.base.Preconditions.checkNotNull(encodedSource);
        return new com.google.common.io.ByteSource() { // from class: com.google.common.io.BaseEncoding.2
            @Override // com.google.common.io.ByteSource
            public java.io.InputStream openStream() throws java.io.IOException {
                return com.google.common.io.BaseEncoding.this.decodingStream(encodedSource.openStream());
            }
        };
    }

    java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence chars) {
        return (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(chars);
    }

    public static com.google.common.io.BaseEncoding base64() {
        return BASE64;
    }

    public static com.google.common.io.BaseEncoding base64Url() {
        return BASE64_URL;
    }

    public static com.google.common.io.BaseEncoding base32() {
        return BASE32;
    }

    public static com.google.common.io.BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static com.google.common.io.BaseEncoding base16() {
        return BASE16;
    }

    static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        private final boolean ignoreCase;
        final int mask;
        private final java.lang.String name;
        private final boolean[] validPadding;

        Alphabet(java.lang.String name, char[] chars) {
            this(name, chars, decodabetFor(chars), false);
        }

        private Alphabet(java.lang.String name, char[] chars, byte[] decodabet, boolean ignoreCase) {
            this.name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(name);
            this.chars = (char[]) com.google.common.base.Preconditions.checkNotNull(chars);
            try {
                int iLog2 = com.google.common.math.IntMath.log2(chars.length, java.math.RoundingMode.UNNECESSARY);
                this.bitsPerChar = iLog2;
                int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(iLog2);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.charsPerChunk = i;
                this.bytesPerChunk = iLog2 >> iNumberOfTrailingZeros;
                this.mask = chars.length - 1;
                this.decodabet = decodabet;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.bytesPerChunk; i2++) {
                    zArr[com.google.common.math.IntMath.divide(i2 * 8, this.bitsPerChar, java.math.RoundingMode.CEILING)] = true;
                }
                this.validPadding = zArr;
                this.ignoreCase = ignoreCase;
            } catch (java.lang.ArithmeticException e) {
                throw new java.lang.IllegalArgumentException("Illegal alphabet length " + chars.length, e);
            }
        }

        private static byte[] decodabetFor(char[] chars) {
            byte[] bArr = new byte[128];
            java.util.Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                boolean z = true;
                com.google.common.base.Preconditions.checkArgument(c < 128, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z = false;
                }
                com.google.common.base.Preconditions.checkArgument(z, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        com.google.common.io.BaseEncoding.Alphabet ignoreCase() {
            if (this.ignoreCase) {
                return this;
            }
            byte[] bArr = this.decodabet;
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            int i = 65;
            while (true) {
                if (i <= 90) {
                    int i2 = i | 32;
                    byte[] bArr2 = this.decodabet;
                    byte b = bArr2[i];
                    byte b2 = bArr2[i2];
                    if (b == -1) {
                        bArrCopyOf[i] = b2;
                    } else {
                        com.google.common.base.Preconditions.checkState(b2 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i, (char) i2);
                        bArrCopyOf[i2] = b;
                    }
                    i++;
                } else {
                    return new com.google.common.io.BaseEncoding.Alphabet(this.name + ".ignoreCase()", this.chars, bArrCopyOf, true);
                }
            }
        }

        char encode(int bits) {
            return this.chars[bits];
        }

        boolean isValidPaddingStartPosition(int index) {
            return this.validPadding[index % this.charsPerChunk];
        }

        boolean canDecode(char ch) {
            return ch <= 127 && this.decodabet[ch] != -1;
        }

        int decode(char ch) throws com.google.common.io.BaseEncoding.DecodingException {
            if (ch > 127) {
                throw new com.google.common.io.BaseEncoding.DecodingException("Unrecognized character: 0x" + java.lang.Integer.toHexString(ch));
            }
            byte b = this.decodabet[ch];
            if (b != -1) {
                return b;
            }
            if (ch <= ' ' || ch == 127) {
                throw new com.google.common.io.BaseEncoding.DecodingException("Unrecognized character: 0x" + java.lang.Integer.toHexString(ch));
            }
            throw new com.google.common.io.BaseEncoding.DecodingException("Unrecognized character: " + ch);
        }

        private boolean hasLowerCase() {
            for (char c : this.chars) {
                if (com.google.common.base.Ascii.isLowerCase(c)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c : this.chars) {
                if (com.google.common.base.Ascii.isUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }

        com.google.common.io.BaseEncoding.Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            com.google.common.base.Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = com.google.common.base.Ascii.toUpperCase(cArr2[i]);
                i++;
            }
            com.google.common.io.BaseEncoding.Alphabet alphabet = new com.google.common.io.BaseEncoding.Alphabet(this.name + ".upperCase()", cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        com.google.common.io.BaseEncoding.Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            com.google.common.base.Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = com.google.common.base.Ascii.toLowerCase(cArr2[i]);
                i++;
            }
            com.google.common.io.BaseEncoding.Alphabet alphabet = new com.google.common.io.BaseEncoding.Alphabet(this.name + ".lowerCase()", cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        public boolean matches(char c) {
            byte[] bArr = this.decodabet;
            return c < bArr.length && bArr[c] != -1;
        }

        public java.lang.String toString() {
            return this.name;
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
            if (!(other instanceof com.google.common.io.BaseEncoding.Alphabet)) {
                return false;
            }
            com.google.common.io.BaseEncoding.Alphabet alphabet = (com.google.common.io.BaseEncoding.Alphabet) other;
            return this.ignoreCase == alphabet.ignoreCase && java.util.Arrays.equals(this.chars, alphabet.chars);
        }

        public int hashCode() {
            return java.util.Arrays.hashCode(this.chars) + (this.ignoreCase ? 1231 : 1237);
        }
    }

    static class StandardBaseEncoding extends com.google.common.io.BaseEncoding {
        final com.google.common.io.BaseEncoding.Alphabet alphabet;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private volatile com.google.common.io.BaseEncoding ignoreCase;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private volatile com.google.common.io.BaseEncoding lowerCase;

        @javax.annotation.CheckForNull
        final java.lang.Character paddingChar;

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        private volatile com.google.common.io.BaseEncoding upperCase;

        StandardBaseEncoding(java.lang.String name, java.lang.String alphabetChars, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            this(new com.google.common.io.BaseEncoding.Alphabet(name, alphabetChars.toCharArray()), paddingChar);
        }

        StandardBaseEncoding(com.google.common.io.BaseEncoding.Alphabet alphabet, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            this.alphabet = (com.google.common.io.BaseEncoding.Alphabet) com.google.common.base.Preconditions.checkNotNull(alphabet);
            com.google.common.base.Preconditions.checkArgument(paddingChar == null || !alphabet.matches(paddingChar.charValue()), "Padding character %s was already in alphabet", paddingChar);
            this.paddingChar = paddingChar;
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int bytes) {
            return this.alphabet.charsPerChunk * com.google.common.math.IntMath.divide(bytes, this.alphabet.bytesPerChunk, java.math.RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public java.io.OutputStream encodingStream(final java.io.Writer out) {
            com.google.common.base.Preconditions.checkNotNull(out);
            return new java.io.OutputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                @Override // java.io.OutputStream
                public void write(int b) throws java.io.IOException {
                    this.bitBuffer = (b & 255) | (this.bitBuffer << 8);
                    this.bitBufferLength += 8;
                    while (this.bitBufferLength >= com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.bitsPerChar) {
                        out.write(com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.encode((this.bitBuffer >> (this.bitBufferLength - com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.bitsPerChar)) & com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.bitsPerChar;
                    }
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws java.io.IOException {
                    out.flush();
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    if (this.bitBufferLength > 0) {
                        out.write(com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.encode((this.bitBuffer << (com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.bitsPerChar - this.bitBufferLength)) & com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.mask));
                        this.writtenChars++;
                        if (com.google.common.io.BaseEncoding.StandardBaseEncoding.this.paddingChar != null) {
                            while (this.writtenChars % com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.charsPerChunk != 0) {
                                out.write(com.google.common.io.BaseEncoding.StandardBaseEncoding.this.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    out.close();
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable target, byte[] bytes, int off, int len) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(target);
            com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            while (i < len) {
                encodeChunkTo(target, bytes, off + i, java.lang.Math.min(this.alphabet.bytesPerChunk, len - i));
                i += this.alphabet.bytesPerChunk;
            }
        }

        void encodeChunkTo(java.lang.Appendable target, byte[] bytes, int off, int len) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(target);
            com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            com.google.common.base.Preconditions.checkArgument(len <= this.alphabet.bytesPerChunk);
            long j = 0;
            for (int i2 = 0; i2 < len; i2++) {
                j = (j | ((long) (bytes[off + i2] & 255))) << 8;
            }
            int i3 = ((len + 1) * 8) - this.alphabet.bitsPerChar;
            while (i < len * 8) {
                target.append(this.alphabet.encode(((int) (j >>> (i3 - i))) & this.alphabet.mask));
                i += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i < this.alphabet.bytesPerChunk * 8) {
                    target.append(this.paddingChar.charValue());
                    i += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int chars) {
            return (int) (((((long) this.alphabet.bitsPerChar) * ((long) chars)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence chars) {
            com.google.common.base.Preconditions.checkNotNull(chars);
            java.lang.Character ch = this.paddingChar;
            if (ch == null) {
                return chars;
            }
            char cCharValue = ch.charValue();
            int length = chars.length() - 1;
            while (length >= 0 && chars.charAt(length) == cCharValue) {
                length--;
            }
            return chars.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence chars) {
            com.google.common.base.Preconditions.checkNotNull(chars);
            java.lang.CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                return false;
            }
            for (int i = 0; i < charSequenceTrimTrailingPadding.length(); i++) {
                if (!this.alphabet.canDecode(charSequenceTrimTrailingPadding.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, java.lang.CharSequence chars) throws com.google.common.io.BaseEncoding.DecodingException {
            com.google.common.base.Preconditions.checkNotNull(target);
            java.lang.CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                throw new com.google.common.io.BaseEncoding.DecodingException("Invalid input length " + charSequenceTrimTrailingPadding.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceTrimTrailingPadding.length()) {
                long jDecode = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.alphabet.charsPerChunk; i4++) {
                    jDecode <<= this.alphabet.bitsPerChar;
                    if (i + i4 < charSequenceTrimTrailingPadding.length()) {
                        jDecode |= (long) this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i3 + i));
                        i3++;
                    }
                }
                int i5 = (this.alphabet.bytesPerChunk * 8) - (i3 * this.alphabet.bitsPerChar);
                int i6 = (this.alphabet.bytesPerChunk - 1) * 8;
                while (i6 >= i5) {
                    target[i2] = (byte) ((jDecode >>> i6) & 255);
                    i6 -= 8;
                    i2++;
                }
                i += this.alphabet.charsPerChunk;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding
        public java.io.InputStream decodingStream(final java.io.Reader reader) {
            com.google.common.base.Preconditions.checkNotNull(reader);
            return new java.io.InputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                @Override // java.io.InputStream
                public int read() throws java.io.IOException {
                    while (true) {
                        int i = reader.read();
                        if (i == -1) {
                            if (this.hitPadding || com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            throw new com.google.common.io.BaseEncoding.DecodingException("Invalid input length " + this.readChars);
                        }
                        this.readChars++;
                        char c = (char) i;
                        if (com.google.common.io.BaseEncoding.StandardBaseEncoding.this.paddingChar != null && com.google.common.io.BaseEncoding.StandardBaseEncoding.this.paddingChar.charValue() == c) {
                            if (!this.hitPadding && (this.readChars == 1 || !com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars - 1))) {
                                throw new com.google.common.io.BaseEncoding.DecodingException("Padding cannot start at index " + this.readChars);
                            }
                            this.hitPadding = true;
                        } else {
                            if (this.hitPadding) {
                                throw new com.google.common.io.BaseEncoding.DecodingException("Expected padding character but found '" + c + "' at index " + this.readChars);
                            }
                            int i2 = this.bitBuffer << com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBuffer = i2;
                            this.bitBuffer = com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.decode(c) | i2;
                            int i3 = this.bitBufferLength + com.google.common.io.BaseEncoding.StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBufferLength = i3;
                            if (i3 >= 8) {
                                int i4 = i3 - 8;
                                this.bitBufferLength = i4;
                                return (this.bitBuffer >> i4) & 255;
                            }
                        }
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] buf, int off, int len) throws java.io.IOException {
                    int i = len + off;
                    com.google.common.base.Preconditions.checkPositionIndexes(off, i, buf.length);
                    int i2 = off;
                    while (i2 < i) {
                        int i3 = read();
                        if (i3 == -1) {
                            int i4 = i2 - off;
                            if (i4 == 0) {
                                return -1;
                            }
                            return i4;
                        }
                        buf[i2] = (byte) i3;
                        i2++;
                    }
                    return i2 - off;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    reader.close();
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char padChar) {
            java.lang.Character ch;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch = this.paddingChar) != null && ch.charValue() == padChar)) ? this : newInstance(this.alphabet, java.lang.Character.valueOf(padChar));
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String separator, int afterEveryChars) {
            for (int i = 0; i < separator.length(); i++) {
                com.google.common.base.Preconditions.checkArgument(!this.alphabet.matches(separator.charAt(i)), "Separator (%s) cannot contain alphabet characters", separator);
            }
            java.lang.Character ch = this.paddingChar;
            if (ch != null) {
                com.google.common.base.Preconditions.checkArgument(separator.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", separator);
            }
            return new com.google.common.io.BaseEncoding.SeparatedBaseEncoding(this, separator, afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
            com.google.common.io.BaseEncoding baseEncodingNewInstance = this.upperCase;
            if (baseEncodingNewInstance == null) {
                com.google.common.io.BaseEncoding.Alphabet alphabetUpperCase = this.alphabet.upperCase();
                baseEncodingNewInstance = alphabetUpperCase == this.alphabet ? this : newInstance(alphabetUpperCase, this.paddingChar);
                this.upperCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
            com.google.common.io.BaseEncoding baseEncodingNewInstance = this.lowerCase;
            if (baseEncodingNewInstance == null) {
                com.google.common.io.BaseEncoding.Alphabet alphabetLowerCase = this.alphabet.lowerCase();
                baseEncodingNewInstance = alphabetLowerCase == this.alphabet ? this : newInstance(alphabetLowerCase, this.paddingChar);
                this.lowerCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding ignoreCase() {
            com.google.common.io.BaseEncoding baseEncodingNewInstance = this.ignoreCase;
            if (baseEncodingNewInstance == null) {
                com.google.common.io.BaseEncoding.Alphabet alphabetIgnoreCase = this.alphabet.ignoreCase();
                baseEncodingNewInstance = alphabetIgnoreCase == this.alphabet ? this : newInstance(alphabetIgnoreCase, this.paddingChar);
                this.ignoreCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet alphabet, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            return new com.google.common.io.BaseEncoding.StandardBaseEncoding(alphabet, paddingChar);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
            sb.append(this.alphabet);
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('").append(this.paddingChar).append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
            if (!(other instanceof com.google.common.io.BaseEncoding.StandardBaseEncoding)) {
                return false;
            }
            com.google.common.io.BaseEncoding.StandardBaseEncoding standardBaseEncoding = (com.google.common.io.BaseEncoding.StandardBaseEncoding) other;
            return this.alphabet.equals(standardBaseEncoding.alphabet) && java.util.Objects.equals(this.paddingChar, standardBaseEncoding.paddingChar);
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ java.util.Objects.hashCode(this.paddingChar);
        }
    }

    static final class Base16Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        final char[] encoding;

        Base16Encoding(java.lang.String name, java.lang.String alphabetChars) {
            this(new com.google.common.io.BaseEncoding.Alphabet(name, alphabetChars.toCharArray()));
        }

        private Base16Encoding(com.google.common.io.BaseEncoding.Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            com.google.common.base.Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i = 0; i < 256; i++) {
                this.encoding[i] = alphabet.encode(i >>> 4);
                this.encoding[i | 256] = alphabet.encode(i & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable target, byte[] bytes, int off, int len) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(target);
            com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            for (int i = 0; i < len; i++) {
                int i2 = bytes[off + i] & 255;
                target.append(this.encoding[i2]);
                target.append(this.encoding[i2 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, java.lang.CharSequence chars) throws com.google.common.io.BaseEncoding.DecodingException {
            com.google.common.base.Preconditions.checkNotNull(target);
            if (chars.length() % 2 == 1) {
                throw new com.google.common.io.BaseEncoding.DecodingException("Invalid input length " + chars.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < chars.length()) {
                target[i2] = (byte) ((this.alphabet.decode(chars.charAt(i)) << 4) | this.alphabet.decode(chars.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet alphabet, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            return new com.google.common.io.BaseEncoding.Base16Encoding(alphabet);
        }
    }

    static final class Base64Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        Base64Encoding(java.lang.String name, java.lang.String alphabetChars, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            this(new com.google.common.io.BaseEncoding.Alphabet(name, alphabetChars.toCharArray()), paddingChar);
        }

        private Base64Encoding(com.google.common.io.BaseEncoding.Alphabet alphabet, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            super(alphabet, paddingChar);
            com.google.common.base.Preconditions.checkArgument(alphabet.chars.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable target, byte[] bytes, int off, int len) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(target);
            int i = off + len;
            com.google.common.base.Preconditions.checkPositionIndexes(off, i, bytes.length);
            while (len >= 3) {
                int i2 = off + 1;
                int i3 = i2 + 1;
                int i4 = ((bytes[off] & 255) << 16) | ((bytes[i2] & 255) << 8) | (bytes[i3] & 255);
                target.append(this.alphabet.encode(i4 >>> 18));
                target.append(this.alphabet.encode((i4 >>> 12) & 63));
                target.append(this.alphabet.encode((i4 >>> 6) & 63));
                target.append(this.alphabet.encode(i4 & 63));
                len -= 3;
                off = i3 + 1;
            }
            if (off < i) {
                encodeChunkTo(target, bytes, off, i - off);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, java.lang.CharSequence chars) throws com.google.common.io.BaseEncoding.DecodingException {
            com.google.common.base.Preconditions.checkNotNull(target);
            java.lang.CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                throw new com.google.common.io.BaseEncoding.DecodingException("Invalid input length " + charSequenceTrimTrailingPadding.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceTrimTrailingPadding.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int iDecode = (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i)) << 18) | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i3)) << 12);
                int i5 = i2 + 1;
                target[i2] = (byte) (iDecode >>> 16);
                if (i4 < charSequenceTrimTrailingPadding.length()) {
                    int i6 = i4 + 1;
                    int iDecode2 = iDecode | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i4)) << 6);
                    i2 = i5 + 1;
                    target[i5] = (byte) ((iDecode2 >>> 8) & 255);
                    if (i6 < charSequenceTrimTrailingPadding.length()) {
                        i4 = i6 + 1;
                        i5 = i2 + 1;
                        target[i2] = (byte) ((iDecode2 | this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i6))) & 255);
                    } else {
                        i = i6;
                    }
                }
                i2 = i5;
                i = i4;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet alphabet, @javax.annotation.CheckForNull java.lang.Character paddingChar) {
            return new com.google.common.io.BaseEncoding.Base64Encoding(alphabet, paddingChar);
        }
    }

    static java.io.Reader ignoringReader(final java.io.Reader delegate, final java.lang.String toIgnore) {
        com.google.common.base.Preconditions.checkNotNull(delegate);
        com.google.common.base.Preconditions.checkNotNull(toIgnore);
        return new java.io.Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader
            public int read() throws java.io.IOException {
                int i;
                do {
                    i = delegate.read();
                    if (i == -1) {
                        break;
                    }
                } while (toIgnore.indexOf((char) i) >= 0);
                return i;
            }

            @Override // java.io.Reader
            public int read(char[] cbuf, int off, int len) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                delegate.close();
            }
        };
    }

    static java.lang.Appendable separatingAppendable(java.lang.Appendable delegate, java.lang.String separator, int afterEveryChars) {
        com.google.common.base.Preconditions.checkNotNull(delegate);
        com.google.common.base.Preconditions.checkNotNull(separator);
        com.google.common.base.Preconditions.checkArgument(afterEveryChars > 0);
        return new java.lang.Appendable(afterEveryChars, delegate, separator) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ java.lang.Appendable val$delegate;
            final /* synthetic */ java.lang.String val$separator;

            {
                this.val$afterEveryChars = afterEveryChars;
                this.val$delegate = delegate;
                this.val$separator = separator;
                this.charsUntilSeparator = afterEveryChars;
            }

            @Override // java.lang.Appendable
            public java.lang.Appendable append(char c) throws java.io.IOException {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c);
                this.charsUntilSeparator--;
                return this;
            }

            @Override // java.lang.Appendable
            public java.lang.Appendable append(@javax.annotation.CheckForNull java.lang.CharSequence chars, int off, int len) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public java.lang.Appendable append(@javax.annotation.CheckForNull java.lang.CharSequence chars) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    static java.io.Writer separatingWriter(final java.io.Writer delegate, java.lang.String separator, int afterEveryChars) {
        final java.lang.Appendable appendableSeparatingAppendable = separatingAppendable(delegate, separator, afterEveryChars);
        return new java.io.Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer
            public void write(int c) throws java.io.IOException {
                appendableSeparatingAppendable.append((char) c);
            }

            @Override // java.io.Writer
            public void write(char[] chars, int off, int len) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws java.io.IOException {
                delegate.flush();
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                delegate.close();
            }
        };
    }

    static final class SeparatedBaseEncoding extends com.google.common.io.BaseEncoding {
        private final int afterEveryChars;
        private final com.google.common.io.BaseEncoding delegate;
        private final java.lang.String separator;

        SeparatedBaseEncoding(com.google.common.io.BaseEncoding delegate, java.lang.String separator, int afterEveryChars) {
            this.delegate = (com.google.common.io.BaseEncoding) com.google.common.base.Preconditions.checkNotNull(delegate);
            this.separator = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(separator);
            this.afterEveryChars = afterEveryChars;
            com.google.common.base.Preconditions.checkArgument(afterEveryChars > 0, "Cannot add a separator after every %s chars", afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence chars) {
            return this.delegate.trimTrailingPadding(chars);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int bytes) {
            int iMaxEncodedSize = this.delegate.maxEncodedSize(bytes);
            return iMaxEncodedSize + (this.separator.length() * com.google.common.math.IntMath.divide(java.lang.Math.max(0, iMaxEncodedSize - 1), this.afterEveryChars, java.math.RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public java.io.OutputStream encodingStream(java.io.Writer output) {
            return this.delegate.encodingStream(separatingWriter(output, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable target, byte[] bytes, int off, int len) throws java.io.IOException {
            this.delegate.encodeTo(separatingAppendable(target, this.separator, this.afterEveryChars), bytes, off, len);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int chars) {
            return this.delegate.maxDecodedSize(chars);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence chars) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < chars.length(); i++) {
                char cCharAt = chars.charAt(i);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.delegate.canDecode(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, java.lang.CharSequence chars) throws com.google.common.io.BaseEncoding.DecodingException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(chars.length());
            for (int i = 0; i < chars.length(); i++) {
                char cCharAt = chars.charAt(i);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.delegate.decodeTo(target, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        public java.io.InputStream decodingStream(java.io.Reader reader) {
            return this.delegate.decodingStream(ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char padChar) {
            return this.delegate.withPadChar(padChar).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String separator, int afterEveryChars) {
            throw new java.lang.UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding ignoreCase() {
            return this.delegate.ignoreCase().withSeparator(this.separator, this.afterEveryChars);
        }

        public java.lang.String toString() {
            return this.delegate + ".withSeparator(\"" + this.separator + "\", " + this.afterEveryChars + ")";
        }
    }
}
