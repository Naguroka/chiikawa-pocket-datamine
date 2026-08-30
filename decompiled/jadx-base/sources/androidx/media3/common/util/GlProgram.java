package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final java.util.Map<java.lang.String, androidx.media3.common.util.GlProgram.Attribute> attributeByName;
    private final androidx.media3.common.util.GlProgram.Attribute[] attributes;
    private boolean externalTexturesRequireNearestSampling;
    private final int programId;
    private final java.util.Map<java.lang.String, androidx.media3.common.util.GlProgram.Uniform> uniformByName;
    private final androidx.media3.common.util.GlProgram.Uniform[] uniforms;

    public GlProgram(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, androidx.media3.common.util.GlUtil.GlException {
        this(androidx.media3.common.util.Util.loadAsset(context, str), androidx.media3.common.util.Util.loadAsset(context, str2));
    }

    public GlProgram(java.lang.String str, java.lang.String str2) throws androidx.media3.common.util.GlUtil.GlException {
        int iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        androidx.media3.common.util.GlUtil.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        androidx.media3.common.util.GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram));
        android.opengl.GLES20.glUseProgram(iGlCreateProgram);
        this.attributeByName = new java.util.HashMap();
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.attributes = new androidx.media3.common.util.GlProgram.Attribute[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            androidx.media3.common.util.GlProgram.Attribute attributeCreate = androidx.media3.common.util.GlProgram.Attribute.create(this.programId, i);
            this.attributes[i] = attributeCreate;
            this.attributeByName.put(attributeCreate.name, attributeCreate);
        }
        this.uniformByName = new java.util.HashMap();
        int[] iArr3 = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new androidx.media3.common.util.GlProgram.Uniform[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            androidx.media3.common.util.GlProgram.Uniform uniformCreate = androidx.media3.common.util.GlProgram.Uniform.create(this.programId, i2);
            this.uniforms[i2] = uniformCreate;
            this.uniformByName.put(uniformCreate.name, uniformCreate);
        }
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    private static void addShader(int i, int i2, java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i2);
        android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
        android.opengl.GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        androidx.media3.common.util.GlUtil.checkGlException(iArr[0] == 1, android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        android.opengl.GLES20.glAttachShader(i, iGlCreateShader);
        android.opengl.GLES20.glDeleteShader(iGlCreateShader);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i, java.lang.String str) {
        return android.opengl.GLES20.glGetAttribLocation(i, str);
    }

    private int getAttributeLocation(java.lang.String str) {
        return getAttributeLocation(this.programId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, java.lang.String str) {
        return android.opengl.GLES20.glGetUniformLocation(i, str);
    }

    public int getUniformLocation(java.lang.String str) {
        return getUniformLocation(this.programId, str);
    }

    public void use() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glUseProgram(this.programId);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    public void delete() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteProgram(this.programId);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        android.opengl.GLES20.glEnableVertexAttribArray(attributeLocation);
        androidx.media3.common.util.GlUtil.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(java.lang.String str, float[] fArr, int i) {
        ((androidx.media3.common.util.GlProgram.Attribute) androidx.media3.common.util.Assertions.checkNotNull(this.attributeByName.get(str))).setBuffer(fArr, i);
    }

    public void setSamplerTexIdUniform(java.lang.String str, int i, int i2) {
        ((androidx.media3.common.util.GlProgram.Uniform) androidx.media3.common.util.Assertions.checkNotNull(this.uniformByName.get(str))).setSamplerTexId(i, i2);
    }

    public void setIntUniform(java.lang.String str, int i) {
        ((androidx.media3.common.util.GlProgram.Uniform) androidx.media3.common.util.Assertions.checkNotNull(this.uniformByName.get(str))).setInt(i);
    }

    public void setIntsUniform(java.lang.String str, int[] iArr) {
        ((androidx.media3.common.util.GlProgram.Uniform) androidx.media3.common.util.Assertions.checkNotNull(this.uniformByName.get(str))).setInts(iArr);
    }

    public void setFloatUniform(java.lang.String str, float f) {
        ((androidx.media3.common.util.GlProgram.Uniform) androidx.media3.common.util.Assertions.checkNotNull(this.uniformByName.get(str))).setFloat(f);
    }

    public void setFloatsUniform(java.lang.String str, float[] fArr) {
        ((androidx.media3.common.util.GlProgram.Uniform) androidx.media3.common.util.Assertions.checkNotNull(this.uniformByName.get(str))).setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(java.lang.String str, float[] fArr) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        if (uniform == null) {
            return;
        }
        uniform.setFloats(fArr);
    }

    public void bindAttributesAndUniforms() throws androidx.media3.common.util.GlUtil.GlException {
        for (androidx.media3.common.util.GlProgram.Attribute attribute : this.attributes) {
            attribute.bind();
        }
        for (androidx.media3.common.util.GlProgram.Uniform uniform : this.uniforms) {
            uniform.bind(this.externalTexturesRequireNearestSampling);
        }
    }

    public void setExternalTexturesRequireNearestSampling(boolean z) {
        this.externalTexturesRequireNearestSampling = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    private static final class Attribute {
        private java.nio.Buffer buffer;
        private final int location;
        public final java.lang.String name;
        private int size;

        public static androidx.media3.common.util.GlProgram.Attribute create(int i, int i2) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            android.opengl.GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, androidx.media3.common.util.GlProgram.getCStringLength(bArr));
            return new androidx.media3.common.util.GlProgram.Attribute(str, androidx.media3.common.util.GlProgram.getAttributeLocation(i, str));
        }

        private Attribute(java.lang.String str, int i) {
            this.name = str;
            this.location = i;
        }

        public void setBuffer(float[] fArr, int i) {
            this.buffer = androidx.media3.common.util.GlUtil.createBuffer(fArr);
            this.size = i;
        }

        public void bind() throws androidx.media3.common.util.GlUtil.GlException {
            java.nio.Buffer buffer = (java.nio.Buffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer, "call setBuffer before bind");
            android.opengl.GLES20.glBindBuffer(34962, 0);
            android.opengl.GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, buffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.location);
            androidx.media3.common.util.GlUtil.checkGlError();
        }
    }

    private static final class Uniform {
        private final float[] floatValue = new float[16];
        private final int[] intValue = new int[4];
        private final int location;
        public final java.lang.String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;

        public static androidx.media3.common.util.GlProgram.Uniform create(int i, int i2) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            android.opengl.GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, androidx.media3.common.util.GlProgram.getCStringLength(bArr));
            return new androidx.media3.common.util.GlProgram.Uniform(str, androidx.media3.common.util.GlProgram.getUniformLocation(i, str), iArr2[0]);
        }

        private Uniform(java.lang.String str, int i, int i2) {
            this.name = str;
            this.location = i;
            this.type = i2;
        }

        public void setSamplerTexId(int i, int i2) {
            this.texIdValue = i;
            this.texUnitIndex = i2;
        }

        public void setInt(int i) {
            this.intValue[0] = i;
        }

        public void setInts(int[] iArr) {
            java.lang.System.arraycopy(iArr, 0, this.intValue, 0, iArr.length);
        }

        public void setFloat(float f) {
            this.floatValue[0] = f;
        }

        public void setFloats(float[] fArr) {
            java.lang.System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void bind(boolean z) throws androidx.media3.common.util.GlUtil.GlException {
            int i = this.type;
            if (i == 5124) {
                android.opengl.GLES20.glUniform1iv(this.location, 1, this.intValue, 0);
                androidx.media3.common.util.GlUtil.checkGlError();
                return;
            }
            if (i == 5126) {
                android.opengl.GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                androidx.media3.common.util.GlUtil.checkGlError();
                return;
            }
            if (i != 35678 && i != androidx.media3.common.util.GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT && i != 36198) {
                switch (i) {
                    case 35664:
                        android.opengl.GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        return;
                    case 35665:
                        android.opengl.GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        return;
                    case 35666:
                        android.opengl.GLES20.glUniform4fv(this.location, 1, this.floatValue, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        return;
                    case 35667:
                        android.opengl.GLES20.glUniform2iv(this.location, 1, this.intValue, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        return;
                    case 35668:
                        android.opengl.GLES20.glUniform3iv(this.location, 1, this.intValue, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        return;
                    case 35669:
                        android.opengl.GLES20.glUniform4iv(this.location, 1, this.intValue, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        return;
                    default:
                        switch (i) {
                            case 35675:
                                android.opengl.GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                                androidx.media3.common.util.GlUtil.checkGlError();
                                return;
                            case 35676:
                                android.opengl.GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                                androidx.media3.common.util.GlUtil.checkGlError();
                                return;
                            default:
                                throw new java.lang.IllegalStateException("Unexpected uniform type: " + this.type);
                        }
                }
            }
            if (this.texIdValue == 0) {
                throw new java.lang.IllegalStateException("No call to setSamplerTexId() before bind.");
            }
            android.opengl.GLES20.glActiveTexture(this.texUnitIndex + 33984);
            androidx.media3.common.util.GlUtil.checkGlError();
            int i2 = this.type;
            androidx.media3.common.util.GlUtil.bindTexture(i2 == 35678 ? 3553 : 36197, this.texIdValue, (i2 != 35678 || z) ? 9728 : 9729);
            android.opengl.GLES20.glUniform1i(this.location, this.texUnitIndex);
            androidx.media3.common.util.GlUtil.checkGlError();
        }
    }
}
