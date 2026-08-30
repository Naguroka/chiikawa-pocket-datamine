package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractCompositeHashFunction extends com.google.common.hash.AbstractHashFunction {
    private static final long serialVersionUID = 0;
    final com.google.common.hash.HashFunction[] functions;

    abstract com.google.common.hash.HashCode makeHash(com.google.common.hash.Hasher[] hashers);

    AbstractCompositeHashFunction(com.google.common.hash.HashFunction... functions) {
        for (com.google.common.hash.HashFunction hashFunction : functions) {
            com.google.common.base.Preconditions.checkNotNull(hashFunction);
        }
        this.functions = functions;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        int length = this.functions.length;
        com.google.common.hash.Hasher[] hasherArr = new com.google.common.hash.Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.functions[i].newHasher();
        }
        return fromHashers(hasherArr);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int expectedInputSize) {
        com.google.common.base.Preconditions.checkArgument(expectedInputSize >= 0);
        int length = this.functions.length;
        com.google.common.hash.Hasher[] hasherArr = new com.google.common.hash.Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.functions[i].newHasher(expectedInputSize);
        }
        return fromHashers(hasherArr);
    }

    private com.google.common.hash.Hasher fromHashers(final com.google.common.hash.Hasher[] hashers) {
        return new com.google.common.hash.Hasher() { // from class: com.google.common.hash.AbstractCompositeHashFunction.1
            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putByte(byte b) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBytes(byte[] bytes) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putBytes(bytes);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putBytes(bytes, off, len);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer bytes) {
                int iPosition = bytes.position();
                for (com.google.common.hash.Hasher hasher : hashers) {
                    com.google.common.hash.Java8Compatibility.position(bytes, iPosition);
                    hasher.putBytes(bytes);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putShort(short s) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putShort(s);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putInt(int i) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putInt(i);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putLong(long l) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putLong(l);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putFloat(float f) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putFloat(f);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putDouble(double d) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putDouble(d);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putBoolean(boolean b) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putBoolean(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putChar(char c) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putChar(c);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence chars) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putUnencodedChars(chars);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public com.google.common.hash.Hasher putString(java.lang.CharSequence chars, java.nio.charset.Charset charset) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putString(chars, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public <T> com.google.common.hash.Hasher putObject(@com.google.common.hash.ParametricNullness T instance, com.google.common.hash.Funnel<? super T> funnel) {
                for (com.google.common.hash.Hasher hasher : hashers) {
                    hasher.putObject(instance, funnel);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher
            public com.google.common.hash.HashCode hash() {
                return com.google.common.hash.AbstractCompositeHashFunction.this.makeHash(hashers);
            }
        };
    }
}
